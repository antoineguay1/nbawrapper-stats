
package com.drmilk.nbawrapper.domain.utils.boxscore;

import java.util.HashMap;
import java.util.Map;

import com.drmilk.nbawrapper.domain.utils.player.Internal;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_internal",
    "basicGameData",
    "stats"
})
public class Boxscore {

    @JsonProperty("_internal")
    private Internal internal;
    @JsonProperty("basicGameData")
    private BasicGameData basicGameData;
    @JsonProperty("stats")
    private Stats stats;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_internal")
    public Internal getInternal() {
        return internal;
    }

    @JsonProperty("_internal")
    public void setInternal(Internal internal) {
        this.internal = internal;
    }

    @JsonProperty("basicGameData")
    public BasicGameData getBasicGameData() {
        return basicGameData;
    }

    @JsonProperty("basicGameData")
    public void setBasicGameData(BasicGameData basicGameData) {
        this.basicGameData = basicGameData;
    }

    @JsonProperty("stats")
    public Stats getStats() {
        return stats;
    }

    @JsonProperty("stats")
    public void setStats(Stats stats) {
        this.stats = stats;
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
