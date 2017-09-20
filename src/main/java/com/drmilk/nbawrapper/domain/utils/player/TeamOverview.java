
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
    "seasonStart",
    "seasonEnd"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamOverview {

    @JsonProperty("teamId")
    private String teamId;
    @JsonProperty("seasonStart")
    private String seasonStart;
    @JsonProperty("seasonEnd")
    private String seasonEnd;
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

    @JsonProperty("seasonStart")
    public String getSeasonStart() {
        return seasonStart;
    }

    @JsonProperty("seasonStart")
    public void setSeasonStart(String seasonStart) {
        this.seasonStart = seasonStart;
    }

    @JsonProperty("seasonEnd")
    public String getSeasonEnd() {
        return seasonEnd;
    }

    @JsonProperty("seasonEnd")
    public void setSeasonEnd(String seasonEnd) {
        this.seasonEnd = seasonEnd;
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
