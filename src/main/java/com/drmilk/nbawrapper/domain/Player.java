package com.drmilk.nbawrapper.domain;

import java.awt.Image;
import java.net.URL;

import javax.imageio.ImageIO;

import org.apache.http.HttpResponse;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.drmilk.nbawrapper.config.AppConfig;
import com.drmilk.nbawrapper.domain.utils.player.Draft;
import com.drmilk.nbawrapper.domain.utils.player.LeaguePlayer;
import com.drmilk.nbawrapper.domain.utils.player.LeaguePlayersResponse;
import com.drmilk.nbawrapper.domain.utils.player.PlayerStatsResponse;
import com.drmilk.nbawrapper.domain.utils.player.PlayersStats;
import com.drmilk.nbawrapper.domain.utils.player.Stats;
import com.drmilk.nbawrapper.exception.PlayerNotFoundException;
import com.drmilk.nbawrapper.utils.QueryManager;
import com.fasterxml.jackson.databind.ObjectMapper;

import info.debatty.java.stringsimilarity.Cosine;

/**
 * Object representation of a NBA player.
 * 
 * @author Antoine Guay
 */
public class Player {
	
	private static AbstractApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
	
	private static String currentSeason = (String) context.getBean("currentSeason");

	private static String sourceBaseUrl = (String) context.getBean("sourceBaseUrl");
	
	private static ObjectMapper objectMapper = (ObjectMapper) context.getBean("objectMapper");
	
	public final static String HEADSHOT_BASE_URL = "https://ak-static.cms.nba.com/wp-content/uploads/headshots/nba/latest/260x190/";
	
	public final static String HEADSHOT_END_URL = ".png";

	private String firstName;
	private String lastName;
	private String personId;
	private String teamId;
	private String jersey;
	private Boolean isActive;
	private String position;
	private String heightFeet;
	private String heightMeters;
	private String weightPounds;
	private String weightKilograms;
	private String dateOfBirthUTC;
	private Draft draft;
	private String nbaDebutYear;
	private String yearsPro;
	private String collegeName;
	private String lastAffiliation;
	private String country;
	private Stats stats;
	private String headshotUrl;
	private Image headshotImage;
	
	/**
	 * Constructor
	 * 
	 * @param personId
	 * @throws PlayerNotFoundException 
	 */
	private Player(String personId) throws PlayerNotFoundException {
		try {
			HttpResponse leaguePlayersResponse = QueryManager.getHttpResponse(sourceBaseUrl + "/" + currentSeason + "/players.json");
			LeaguePlayersResponse leaguePlayers = objectMapper.readValue(leaguePlayersResponse.getEntity().getContent(), LeaguePlayersResponse.class);
			for (LeaguePlayer standard : leaguePlayers.getLeague().getStandard()) {
				if (standard.getPersonId().equals(personId)) {
					this.retreiveFromStandardLeagueLeaders(standard);
					break;
				}
			}
			HttpResponse playerStatsResponse = QueryManager.getHttpResponse(sourceBaseUrl + "/" + currentSeason + "/players/" + personId + "_profile.json");
			PlayerStatsResponse playerStats = objectMapper.readValue(playerStatsResponse.getEntity().getContent(), PlayerStatsResponse.class);
			this.retreiveFromStandardPlayerStats(playerStats.getLeague().getStandard());
			
			this.headshotUrl = HEADSHOT_BASE_URL + personId + HEADSHOT_END_URL;
			URL url = new URL(this.headshotUrl);
			this.headshotImage = ImageIO.read(url); 
			
		} catch (Exception e) {
			throw new PlayerNotFoundException("Could not find a player with personId " + "'" + personId + "'");
		}
	}
	
	/**
	 * Constructor
	 * 
	 * @param personId
	 * @param standard
	 * @throws PlayerNotFoundException
	 */
	private Player(String personId, LeaguePlayer standard) throws PlayerNotFoundException {
		try {
			this.retreiveFromStandardLeagueLeaders(standard);
			
			HttpResponse playerStatsResponse = QueryManager.getHttpResponse(sourceBaseUrl + "/" + currentSeason + "/players/" + personId + "_profile.json");
			PlayerStatsResponse playerStats = objectMapper.readValue(playerStatsResponse.getEntity().getContent(), PlayerStatsResponse.class);
			this.retreiveFromStandardPlayerStats(playerStats.getLeague().getStandard());
			
			this.headshotUrl = HEADSHOT_BASE_URL + personId + HEADSHOT_END_URL;
			URL url = new URL(this.headshotUrl);
			this.headshotImage = ImageIO.read(url); 
			
		} catch (Exception e) {
			throw new PlayerNotFoundException("Could not find a player with personId " + "'" + personId + "'");
		}
	}
	
	/**
	 * Returns the short profile of a player from his personId
	 * 
	 * @param personId
	 * @return A PlayerMin object containing firstName, lastName, headshotUrl and jersey of a player.
	 * @throws PlayerNotFoundException
	 */
	public static PlayerMin getPlayerMinById(String personId) throws PlayerNotFoundException {
		PlayerMin result = new PlayerMin();
		try {
			result.setHeadshotUrl(HEADSHOT_BASE_URL + personId + HEADSHOT_END_URL);
			HttpResponse leaguePlayersResponse = QueryManager.getHttpResponse(sourceBaseUrl + "/" + currentSeason + "/players.json");
			LeaguePlayersResponse leaguePlayers = objectMapper.readValue(leaguePlayersResponse.getEntity().getContent(), LeaguePlayersResponse.class);
			for (LeaguePlayer standard : leaguePlayers.getLeague().getStandard()) {
				if (standard.getPersonId().equals(personId)) {
					result.setFirstName(standard.getFirstName());
					result.setLastName(standard.getLastName());
					result.setJersey(standard.getJersey());
					return result;
				}
			}
		} catch (Exception e) {
			throw new PlayerNotFoundException("Could not find a player with personId " + "'" + personId + "'");
		}
		throw new PlayerNotFoundException("Could not find a player with personId " + "'" + personId + "'");
	}
	
	/**
	 * @param personId
	 * @return A player found using his personId
	 * @throws PlayerNotFoundException
	 */
	public static Player getPlayerById(String personId) throws PlayerNotFoundException {
		return new Player(personId);
	}
	
	/**
	 * @param playerNameKeywords
	 * @return A player found using keywords about his name
	 * @throws PlayerNotFoundException
	 */
	public static Player getPlayerByNameKeywords(String playerNameKeywords) throws PlayerNotFoundException {
		try {
			String personId = null;
			LeaguePlayer leaguePlayer = null;
			Double bestSimilarity = 1.0; // better if closer to 0
			Cosine  algorithm = new Cosine();
			HttpResponse leaguePlayersResponse = QueryManager.getHttpResponse(sourceBaseUrl + "/" + currentSeason + "/players.json");
			LeaguePlayersResponse leaguePlayers = objectMapper.readValue(leaguePlayersResponse.getEntity().getContent(), LeaguePlayersResponse.class);
			
			for (LeaguePlayer standard : leaguePlayers.getLeague().getStandard()) {
				String fullName = standard.getFirstName() + " " + standard.getLastName();
				Double currentSimilarity = algorithm.distance(fullName.toLowerCase(), playerNameKeywords.toLowerCase());
				if (currentSimilarity < bestSimilarity) {
					bestSimilarity = currentSimilarity;
					personId = standard.getPersonId();
					leaguePlayer = standard;
				}
			}
			
			if (personId == null) {
				throw new PlayerNotFoundException("Could not find a player using keywords " + "'" + playerNameKeywords + "'");
			}
			return new Player(personId, leaguePlayer);
		} catch (Exception e) {
			throw new PlayerNotFoundException("Could not find a player using keywords " + "'" + playerNameKeywords + "'");
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getJersey() {
		return jersey;
	}

	public void setJersey(String jersey) {
		this.jersey = jersey;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getHeightFeet() {
		return heightFeet;
	}

	public void setHeightFeet(String heightFeet) {
		this.heightFeet = heightFeet;
	}

	public String getHeightMeters() {
		return heightMeters;
	}

	public void setHeightMeters(String heightMeters) {
		this.heightMeters = heightMeters;
	}

	public String getWeightPounds() {
		return weightPounds;
	}

	public void setWeightPounds(String weightPounds) {
		this.weightPounds = weightPounds;
	}

	public String getWeightKilograms() {
		return weightKilograms;
	}

	public void setWeightKilograms(String weightKilograms) {
		this.weightKilograms = weightKilograms;
	}

	public String getDateOfBirthUTC() {
		return dateOfBirthUTC;
	}

	public void setDateOfBirthUTC(String dateOfBirthUTC) {
		this.dateOfBirthUTC = dateOfBirthUTC;
	}

	public String getNbaDebutYear() {
		return nbaDebutYear;
	}

	public void setNbaDebutYear(String nbaDebutYear) {
		this.nbaDebutYear = nbaDebutYear;
	}

	public String getYearsPro() {
		return yearsPro;
	}

	public void setYearsPro(String yearsPro) {
		this.yearsPro = yearsPro;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getLastAffiliation() {
		return lastAffiliation;
	}

	public void setLastAffiliation(String lastAffiliation) {
		this.lastAffiliation = lastAffiliation;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Stats getStats() {
		return stats;
	}

	public void setStats(Stats stats) {
		this.stats = stats;
	}
	
	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	
	public Draft getDraft() {
		return draft;
	}

	public void setDraft(Draft draft) {
		this.draft = draft;
	}
	
	public String getHeadshotUrl() {
		return headshotUrl;
	}

	public void setHeadshotUrl(String headshotUrl) {
		this.headshotUrl = headshotUrl;
	}

	public Image getHeadshotImage() {
		return headshotImage;
	}

	public void setHeadshotImage(Image headshotImage) {
		this.headshotImage = headshotImage;
	}

	private void retreiveFromStandardLeagueLeaders(LeaguePlayer standardLeagueLeaders) {
		this.firstName = standardLeagueLeaders.getFirstName();
		this.lastName = standardLeagueLeaders.getLastName();
		this.personId = standardLeagueLeaders.getPersonId();
		this.teamId = standardLeagueLeaders.getTeamId();
		this.jersey = standardLeagueLeaders.getJersey();
		this.isActive = standardLeagueLeaders.getIsActive();
		this.position = standardLeagueLeaders.getPos();
		this.heightFeet = standardLeagueLeaders.getHeightFeet() + "." + standardLeagueLeaders.getHeightInches();
		this.heightMeters = standardLeagueLeaders.getHeightMeters();
		this.weightPounds = standardLeagueLeaders.getWeightPounds();
		this.weightKilograms = standardLeagueLeaders.getWeightKilograms();
		this.dateOfBirthUTC = standardLeagueLeaders.getDateOfBirthUTC();
		this.draft = standardLeagueLeaders.getDraft();
		this.nbaDebutYear = standardLeagueLeaders.getNbaDebutYear();
		this.yearsPro = standardLeagueLeaders.getYearsPro();
		this.collegeName = standardLeagueLeaders.getCollegeName();
		this.lastAffiliation = standardLeagueLeaders.getLastAffiliation();
		this.country = standardLeagueLeaders.getCountry();
	}

	private void retreiveFromStandardPlayerStats(PlayersStats standardPlayersStats) {
		this.stats = standardPlayersStats.getStats();
	}

}
