package com.drmilk.nbawrapper.domain;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.drmilk.nbawrapper.config.AppConfig;
import com.drmilk.nbawrapper.domain.utils.team.Game;
import com.drmilk.nbawrapper.domain.utils.team.PlayerOverview;
import com.drmilk.nbawrapper.domain.utils.team.TeamLeaders;
import com.drmilk.nbawrapper.domain.utils.team.TeamLeadersResponse;
import com.drmilk.nbawrapper.domain.utils.team.TeamRosterResponse;
import com.drmilk.nbawrapper.domain.utils.team.TeamScheduleResponse;
import com.drmilk.nbawrapper.domain.utils.team.TeamSummary;
import com.drmilk.nbawrapper.domain.utils.team.TeamSummaryResponse;
import com.drmilk.nbawrapper.exception.TeamNotFoundException;
import com.drmilk.nbawrapper.utils.QueryManager;
import com.fasterxml.jackson.databind.ObjectMapper;

import info.debatty.java.stringsimilarity.Cosine;

/**
 * Object representation of a NBA team.
 * 
 * @author Antoine Guay
 */
public class Team {
	
	private static AbstractApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
	
	private static ObjectMapper objectMapper = (ObjectMapper) context.getBean("objectMapper");
	
	private static String currentSeason = (String) context.getBean("currentSeason");

	private static String sourceBaseUrl = (String) context.getBean("sourceBaseUrl");
	
	public final static String LOGO_BASE_URL = "http://i.cdn.turner.com/nba/nba/assets/logos/teams/secondary/web/";
	
	public final static String LOGO_END_URL = ".svg";

	private TeamSummary teamSummary;
	private List<String> roster;
	private TeamLeaders teamLeaders;
	private List<Game> games;
	private String logoUrl;
	
	/**
	 * Constructor
	 * 
	 * @param teamId
	 * @throws TeamNotFoundException
	 */
	private Team(String teamId) throws TeamNotFoundException {
		try {
			HttpResponse teamSummaryResponse = QueryManager.getHttpResponse(sourceBaseUrl + "/" + currentSeason + "/teams.json");
			TeamSummaryResponse teamSummaries = objectMapper.readValue(teamSummaryResponse.getEntity().getContent(), TeamSummaryResponse.class);
			for (TeamSummary teamSummary: teamSummaries.getLeague().getStandard()) {
				if (teamSummary.getTeamId().equals(teamId)) {
					this.teamSummary = teamSummary;
					break;
				}
			}
			
			HttpResponse teamScheduleResponse = QueryManager.getHttpResponse(sourceBaseUrl + "/" + currentSeason + "/teams/" + teamId + "/schedule.json");
			TeamScheduleResponse teamSchedules = objectMapper.readValue(teamScheduleResponse.getEntity().getContent(), TeamScheduleResponse.class);
			this.games = teamSchedules.getLeague().getGames();
			
			HttpResponse teamRosterResponse = QueryManager.getHttpResponse(sourceBaseUrl + "/" + currentSeason + "/teams/" + teamId + "/roster.json");
			TeamRosterResponse teamRoster = objectMapper.readValue(teamRosterResponse.getEntity().getContent(), TeamRosterResponse.class);
			this.roster = new ArrayList<>();
			for (PlayerOverview playerOverview : teamRoster.getLeague().getStandard().getPlayers()) {
				this.roster.add(playerOverview.getPersonId());
			}
			
			HttpResponse teamLeadersResponse = QueryManager.getHttpResponse(sourceBaseUrl + "/" + currentSeason + "/teams/" + teamId + "/leaders.json");
			this.teamLeaders = objectMapper.readValue(teamLeadersResponse.getEntity().getContent(), TeamLeadersResponse.class).getLeague().getStandard();
			
			this.logoUrl = LOGO_BASE_URL + this.teamSummary.getTricode() + LOGO_END_URL;
		} catch (Exception e) {
			throw new TeamNotFoundException("Could not find a team with teamId " + "'" + teamId + "'");
		}
		
	}
	
	/**
	 * Returns the short profile of a team from its teamId
	 * 
	 * @param teamId
	 * @return A TeamMin containing logoUrl, fullName and triCode.
	 * @throws TeamNotFoundException
	 */
	public static TeamMin getShortProfileByTeamId(String teamId) throws TeamNotFoundException {
		try {
			TeamMin result = new TeamMin();
			HttpResponse teamSummaryResponse = QueryManager.getHttpResponse(sourceBaseUrl + "/" + currentSeason + "/teams.json");
			TeamSummaryResponse teamSummaries = objectMapper.readValue(teamSummaryResponse.getEntity().getContent(), TeamSummaryResponse.class);
			for (TeamSummary teamSummary: teamSummaries.getLeague().getStandard()) {
				if (teamSummary.getTeamId().equals(teamId)) {
					result.setLogoUrl(LOGO_BASE_URL + teamSummary.getTricode() + LOGO_END_URL);
					result.setFullName(teamSummary.getFullName());
					result.setTriCode(teamSummary.getTricode());
					break;
				}
			}
			return result;
		} catch (Exception e) {
			throw new TeamNotFoundException("Could not find a team with teamId " + "'" + teamId + "'");
		}
	}
	
	/**
	 * @param teamId
	 * @return A team found using its teamId
	 * @throws TeamNotFoundException
	 */
	public static Team getTeamById(String teamId) throws TeamNotFoundException {
		return new Team(teamId);
	}
	
	/**
	 * @param teamNameKeywords
	 * @return A team found using keywords of its name
	 * @throws TeamNotFoundException
	 */
	public static Team getTeamByNameKeywords(String teamNameKeywords) throws TeamNotFoundException {
		try {
			String teamId = null;
			Double bestSimilarity = 1.0; // better if closer to 0
			Cosine  algorithm = new Cosine();
			HttpResponse leagueTeamsResponse = QueryManager.getHttpResponse(sourceBaseUrl + "/" + currentSeason + "/teams.json");
			TeamSummaryResponse teamSummaries = objectMapper.readValue(leagueTeamsResponse.getEntity().getContent(), TeamSummaryResponse.class);
			
			for (TeamSummary teamSummary : teamSummaries.getLeague().getStandard()) {
				String fullName = teamSummary.getFullName();
				Double currentSimilarity = algorithm.distance(fullName.toLowerCase(), teamNameKeywords.toLowerCase());
				if (currentSimilarity < bestSimilarity) {
					bestSimilarity = currentSimilarity;
					teamId = teamSummary.getTeamId();
				}
			}
			
			if (teamId == null) {
				throw new TeamNotFoundException("Could not find a team using keywords " + "'" + teamNameKeywords + "'");
			}
			return new Team(teamId);
		} catch (Exception e) {
			throw new TeamNotFoundException("Could not find a team using keywords " + "'" + teamNameKeywords + "'");
		}
	}
	
    public Boolean getIsNBAFranchise() {
        return teamSummary.getIsNBAFranchise();
    }

    public void setIsNBAFranchise(Boolean isNBAFranchise) {
    	this.teamSummary.setIsNBAFranchise(isNBAFranchise);
    }

    public Boolean getIsAllStar() {
        return teamSummary.getIsAllStar();
    }

    public void setIsAllStar(Boolean isAllStar) {
    	this.teamSummary.setIsAllStar(isAllStar);
    }

    public String getCity() {
        return teamSummary.getCity();
    }

    public void setCity(String city) {
    	this.teamSummary.setCity(city);
    }

    public String getAltcityName() {
        return teamSummary.getAltcityName();
    }

    public void setAltcityName(String altcityName) {
        this.teamSummary.setAltcityName(altcityName);
    }

    public String getFullName() {
        return teamSummary.getFullName();
    }

    public void setFullName(String fullName) {
    	this.teamSummary.setFullName(fullName);
    }

    public String getTricode() {
        return teamSummary.getTricode();
    }

    public void setTricode(String tricode) {
    	this.teamSummary.setTricode(tricode);
    }

    public String getTeamId() {
        return teamSummary.getTeamId();
    }

    public void setTeamId(String teamId) {
    	this.teamSummary.setTeamId(teamId);
    }

    public String getNickname() {
        return teamSummary.getNickname();
    }

    public void setNickname(String nickname) {
    	this.teamSummary.setNickname(nickname);
    }

    public String getUrlName() {
        return teamSummary.getUrlName();
    }

    public void setUrlName(String urlName) {
    	this.teamSummary.setUrlName(urlName);
    }

    public String getConfName() {
        return teamSummary.getConfName();
    }

    public void setConfName(String confName) {
    	this.teamSummary.setConfName(confName);
    }

    public String getDivName() {
        return teamSummary.getDivName();
    }

    public void setDivName(String divName) {
    	this.teamSummary.setDivName(divName);
    }

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public List<Game> getGames() {
		return games;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}

	/**
	 * @return A list of the personIds of the players in the roster
	 */
	public List<String> getRoster() {
		return roster;
	}

	public void setRoster(List<String> roster) {
		this.roster = roster;
	}

	public TeamLeaders getTeamLeaders() {
		return teamLeaders;
	}

	public void setTeamLeaders(TeamLeaders teamLeaders) {
		this.teamLeaders = teamLeaders;
	}
	
}
