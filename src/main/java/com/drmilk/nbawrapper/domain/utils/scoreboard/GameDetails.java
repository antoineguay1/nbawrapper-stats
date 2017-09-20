
package com.drmilk.nbawrapper.domain.utils.scoreboard;

import java.util.HashMap;
import java.util.Map;

import com.drmilk.nbawrapper.domain.utils.team.Nugget;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "seasonStageId",
    "seasonYear",
    "gameId",
    "isGameActivated",
    "statusNum",
    "extendedStatusNum",
    "startTimeUTC",
    "startDateEastern",
    "clock",
    "isBuzzerBeater",
    "isPreviewArticleAvail",
    "isRecapArticleAvail",
    "tickets",
    "hasGameBookPdf",
    "isStartTimeTBD",
    "nugget",
    "attendance",
    "gameDuration",
    "period",
    "vTeam",
    "hTeam"
})
public class GameDetails {

    @JsonProperty("seasonStageId")
    private Integer seasonStageId;
    @JsonProperty("gameId")
    private String gameId;
    @JsonProperty("isGameActivated")
    private Boolean isGameActivated;
    @JsonProperty("startTimeUTC")
    private String startTimeUTC;
    @JsonProperty("startDateEastern")
    private String startDateEastern;
    @JsonProperty("clock")
    private String clock;
    @JsonProperty("isBuzzerBeater")
    private Boolean isBuzzerBeater;
    @JsonProperty("tickets")
    private Tickets tickets;
    @JsonProperty("isStartTimeTBD")
    private Boolean isStartTimeTBD;
    @JsonProperty("nugget")
    private Nugget nugget;
    @JsonProperty("attendance")
    private String attendance;
    @JsonProperty("gameDuration")
    private GameDuration gameDuration;
    @JsonProperty("period")
    private Period period;
    @JsonProperty("vTeam")
    private TeamScoreDetails visitingTeamScore;
    @JsonProperty("hTeam")
    private TeamScoreDetails homeTeamScore;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("seasonStageId")
    public Integer getSeasonStageId() {
        return seasonStageId;
    }

    @JsonProperty("seasonStageId")
    public void setSeasonStageId(Integer seasonStageId) {
        this.seasonStageId = seasonStageId;
    }

    @JsonProperty("gameId")
    public String getGameId() {
        return gameId;
    }

    @JsonProperty("gameId")
    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    @JsonProperty("isGameActivated")
    public Boolean getIsGameActivated() {
        return isGameActivated;
    }

    @JsonProperty("isGameActivated")
    public void setIsGameActivated(Boolean isGameActivated) {
        this.isGameActivated = isGameActivated;
    }

    @JsonProperty("startTimeUTC")
    public String getStartTimeUTC() {
        return startTimeUTC;
    }

    @JsonProperty("startTimeUTC")
    public void setStartTimeUTC(String startTimeUTC) {
        this.startTimeUTC = startTimeUTC;
    }

    @JsonProperty("startDateEastern")
    public String getStartDateEastern() {
        return startDateEastern;
    }

    @JsonProperty("startDateEastern")
    public void setStartDateEastern(String startDateEastern) {
        this.startDateEastern = startDateEastern;
    }

    @JsonProperty("clock")
    public String getClock() {
        return clock;
    }

    @JsonProperty("clock")
    public void setClock(String clock) {
        this.clock = clock;
    }

    @JsonProperty("isBuzzerBeater")
    public Boolean getIsBuzzerBeater() {
        return isBuzzerBeater;
    }

    @JsonProperty("isBuzzerBeater")
    public void setIsBuzzerBeater(Boolean isBuzzerBeater) {
        this.isBuzzerBeater = isBuzzerBeater;
    }

    @JsonProperty("tickets")
    public Tickets getTickets() {
        return tickets;
    }

    @JsonProperty("tickets")
    public void setTickets(Tickets tickets) {
        this.tickets = tickets;
    }

    @JsonProperty("isStartTimeTBD")
    public Boolean getIsStartTimeTBD() {
        return isStartTimeTBD;
    }

    @JsonProperty("isStartTimeTBD")
    public void setIsStartTimeTBD(Boolean isStartTimeTBD) {
        this.isStartTimeTBD = isStartTimeTBD;
    }

    @JsonProperty("nugget")
    public Nugget getNugget() {
        return nugget;
    }

    @JsonProperty("nugget")
    public void setNugget(Nugget nugget) {
        this.nugget = nugget;
    }

    @JsonProperty("attendance")
    public String getAttendance() {
        return attendance;
    }

    @JsonProperty("attendance")
    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    @JsonProperty("gameDuration")
    public GameDuration getGameDuration() {
        return gameDuration;
    }

    @JsonProperty("gameDuration")
    public void setGameDuration(GameDuration gameDuration) {
        this.gameDuration = gameDuration;
    }

    @JsonProperty("period")
    public Period getPeriod() {
        return period;
    }

    @JsonProperty("period")
    public void setPeriod(Period period) {
        this.period = period;
    }

    @JsonProperty("vTeam")
    public TeamScoreDetails getVisitingTeamScore() {
        return visitingTeamScore;
    }

    @JsonProperty("vTeam")
    public void setVisitingTeamScore(TeamScoreDetails vTeam) {
        this.visitingTeamScore = vTeam;
    }

    @JsonProperty("hTeam")
    public TeamScoreDetails getHomeTeamScore() {
        return homeTeamScore;
    }

    @JsonProperty("hTeam")
    public void setHomeTeamScore(TeamScoreDetails hTeam) {
        this.homeTeamScore = hTeam;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
