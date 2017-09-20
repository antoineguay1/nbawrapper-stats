
package com.drmilk.nbawrapper.domain.utils.boxscore;

import java.util.HashMap;
import java.util.Map;

import com.drmilk.nbawrapper.domain.utils.scoreboard.Tickets;
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
    "hTeam",
    "officials"
})
public class BasicGameData {

    @JsonProperty("seasonStageId")
    private Integer seasonStageId;
    @JsonProperty("seasonYear")
    private String seasonYear;
    @JsonProperty("gameId")
    private String gameId;
    @JsonProperty("isGameActivated")
    private Boolean isGameActivated;
    @JsonProperty("statusNum")
    private Integer statusNum;
    @JsonProperty("extendedStatusNum")
    private Integer extendedStatusNum;
    @JsonProperty("startTimeUTC")
    private String startTimeUTC;
    @JsonProperty("startDateEastern")
    private String startDateEastern;
    @JsonProperty("clock")
    private String clock;
    @JsonProperty("isBuzzerBeater")
    private Boolean isBuzzerBeater;
    @JsonProperty("isPreviewArticleAvail")
    private Boolean isPreviewArticleAvail;
    @JsonProperty("isRecapArticleAvail")
    private Boolean isRecapArticleAvail;
    @JsonProperty("tickets")
    private Tickets tickets;
    @JsonProperty("hasGameBookPdf")
    private Boolean hasGameBookPdf;
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
    private TeamInfo visitingTeam;
    @JsonProperty("hTeam")
    private TeamInfo homeTeam;
    @JsonProperty("officials")
    private Officials officials;
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

    @JsonProperty("seasonYear")
    public String getSeasonYear() {
        return seasonYear;
    }

    @JsonProperty("seasonYear")
    public void setSeasonYear(String seasonYear) {
        this.seasonYear = seasonYear;
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

    @JsonProperty("statusNum")
    public Integer getStatusNum() {
        return statusNum;
    }

    @JsonProperty("statusNum")
    public void setStatusNum(Integer statusNum) {
        this.statusNum = statusNum;
    }

    @JsonProperty("extendedStatusNum")
    public Integer getExtendedStatusNum() {
        return extendedStatusNum;
    }

    @JsonProperty("extendedStatusNum")
    public void setExtendedStatusNum(Integer extendedStatusNum) {
        this.extendedStatusNum = extendedStatusNum;
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

    @JsonProperty("isPreviewArticleAvail")
    public Boolean getIsPreviewArticleAvail() {
        return isPreviewArticleAvail;
    }

    @JsonProperty("isPreviewArticleAvail")
    public void setIsPreviewArticleAvail(Boolean isPreviewArticleAvail) {
        this.isPreviewArticleAvail = isPreviewArticleAvail;
    }

    @JsonProperty("isRecapArticleAvail")
    public Boolean getIsRecapArticleAvail() {
        return isRecapArticleAvail;
    }

    @JsonProperty("isRecapArticleAvail")
    public void setIsRecapArticleAvail(Boolean isRecapArticleAvail) {
        this.isRecapArticleAvail = isRecapArticleAvail;
    }

    @JsonProperty("tickets")
    public Tickets getTickets() {
        return tickets;
    }

    @JsonProperty("tickets")
    public void setTickets(Tickets tickets) {
        this.tickets = tickets;
    }

    @JsonProperty("hasGameBookPdf")
    public Boolean getHasGameBookPdf() {
        return hasGameBookPdf;
    }

    @JsonProperty("hasGameBookPdf")
    public void setHasGameBookPdf(Boolean hasGameBookPdf) {
        this.hasGameBookPdf = hasGameBookPdf;
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
    public TeamInfo getVisitingTeam() {
        return visitingTeam;
    }

    @JsonProperty("vTeam")
    public void setVisitingTeam(TeamInfo vTeam) {
        this.visitingTeam = vTeam;
    }

    @JsonProperty("hTeam")
    public TeamInfo getHomeTeam() {
        return homeTeam;
    }

    @JsonProperty("hTeam")
    public void setHomeTeam(TeamInfo hTeam) {
        this.homeTeam = hTeam;
    }

    @JsonProperty("officials")
    public Officials getOfficials() {
        return officials;
    }

    @JsonProperty("officials")
    public void setOfficials(Officials officials) {
        this.officials = officials;
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
