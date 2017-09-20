
package com.drmilk.nbawrapper.domain.utils.player;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "teamId",
    "pickNum",
    "roundNum",
    "seasonYear"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Draft {

    @JsonProperty("teamId")
    private String teamId;
    @JsonProperty("pickNum")
    private String pickNum;
    @JsonProperty("roundNum")
    private String roundNum;
    @JsonProperty("seasonYear")
    private String seasonYear;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    @JsonProperty("teamId")
    public String getTeamId() {
        return teamId;
    }

    @JsonProperty("teamId")
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    @JsonProperty("pickNum")
    public String getPickNum() {
        return pickNum;
    }

    @JsonProperty("pickNum")
    public void setPickNum(String pickNum) {
        this.pickNum = pickNum;
    }

    @JsonProperty("roundNum")
    public String getRoundNum() {
        return roundNum;
    }

    @JsonProperty("roundNum")
    public void setRoundNum(String roundNum) {
        this.roundNum = roundNum;
    }

    @JsonProperty("seasonYear")
    public String getSeasonYear() {
        return seasonYear;
    }

    @JsonProperty("seasonYear")
    public void setSeasonYear(String seasonYear) {
        this.seasonYear = seasonYear;
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
