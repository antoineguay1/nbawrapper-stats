
package com.drmilk.nbawrapper.domain.utils.player;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "seasonYear",
    "teams",
    "total"
})
public class Season {

    @JsonProperty("seasonYear")
    private Integer seasonYear;
    @JsonProperty("teams")
    private List<TeamOverview> teams = null;
    @JsonProperty("total")
    private Total total;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("seasonYear")
    public Integer getSeasonYear() {
        return seasonYear;
    }

    @JsonProperty("seasonYear")
    public void setSeasonYear(Integer seasonYear) {
        this.seasonYear = seasonYear;
    }

    @JsonProperty("teams")
    public List<TeamOverview> getTeams() {
        return teams;
    }

    @JsonProperty("teams")
    public void setTeams(List<TeamOverview> teams) {
        this.teams = teams;
    }

    @JsonProperty("total")
    public Total getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Total total) {
        this.total = total;
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
