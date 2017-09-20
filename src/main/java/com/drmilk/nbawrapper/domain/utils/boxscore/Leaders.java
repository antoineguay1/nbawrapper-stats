
package com.drmilk.nbawrapper.domain.utils.boxscore;

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
    "points",
    "rebounds",
    "assists"
})
public class Leaders {

    @JsonProperty("points")
    private Points points;
    @JsonProperty("rebounds")
    private Rebounds rebounds;
    @JsonProperty("assists")
    private Assists assists;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("points")
    public Points getPoints() {
        return points;
    }

    @JsonProperty("points")
    public void setPoints(Points points) {
        this.points = points;
    }

    @JsonProperty("rebounds")
    public Rebounds getRebounds() {
        return rebounds;
    }

    @JsonProperty("rebounds")
    public void setRebounds(Rebounds rebounds) {
        this.rebounds = rebounds;
    }

    @JsonProperty("assists")
    public Assists getAssists() {
        return assists;
    }

    @JsonProperty("assists")
    public void setAssists(Assists assists) {
        this.assists = assists;
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
