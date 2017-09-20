
package com.drmilk.nbawrapper.domain.utils.team;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "seasonStageId",
    "gameId",
    "statusNum",
    "extendedStatusNum",
    "startTimeUTC",
    "startDateEastern",
    "isHomeTeam",
    "nugget",
    "vTeam",
    "hTeam"
})
public class Game {

    @JsonProperty("seasonStageId")
    private Integer seasonStageId;
    @JsonProperty("gameId")
    private String gameId;
    @JsonProperty("statusNum")
    private Integer statusNum;
    @JsonProperty("extendedStatusNum")
    private Integer extendedStatusNum;
    @JsonProperty("startTimeUTC")
    private String startTimeUTC;
    @JsonProperty("startDateEastern")
    private String startDateEastern;
    @JsonProperty("isHomeTeam")
    private Boolean isHomeTeam;
    @JsonProperty("nugget")
    private Nugget nugget;
    @JsonProperty("vTeam")
    private TeamScore visitingTeamScore;
    @JsonProperty("hTeam")
    private TeamScore homeTeamScore;
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

    @JsonProperty("isHomeTeam")
    public Boolean getIsHomeTeam() {
        return isHomeTeam;
    }

    @JsonProperty("isHomeTeam")
    public void setIsHomeTeam(Boolean isHomeTeam) {
        this.isHomeTeam = isHomeTeam;
    }

    @JsonProperty("nugget")
    public Nugget getNugget() {
        return nugget;
    }

    @JsonProperty("nugget")
    public void setNugget(Nugget nugget) {
        this.nugget = nugget;
    }

    @JsonProperty("vTeam")
    public TeamScore getVisitingTeamScore() {
        return visitingTeamScore;
    }

    @JsonProperty("vTeam")
    public void setVisitingTeamScore(TeamScore vTeam) {
        this.visitingTeamScore = vTeam;
    }

    @JsonProperty("hTeam")
    public TeamScore getHomeTeamScore() {
        return homeTeamScore;
    }

    @JsonProperty("hTeam")
    public void setHomeTeamScore(TeamScore hTeam) {
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
