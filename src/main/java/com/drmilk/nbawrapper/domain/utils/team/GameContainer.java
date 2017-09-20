
package com.drmilk.nbawrapper.domain.utils.team;

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
    "lastStandardGamePlayedIndex",
    "standard"
})
public class GameContainer {

    @JsonProperty("lastStandardGamePlayedIndex")
    private Integer lastStandardGamePlayedIndex;
    @JsonProperty("standard")
    private List<Game> games = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("lastStandardGamePlayedIndex")
    public Integer getLastStandardGamePlayedIndex() {
        return lastStandardGamePlayedIndex;
    }

    @JsonProperty("lastStandardGamePlayedIndex")
    public void setLastStandardGamePlayedIndex(Integer lastStandardGamePlayedIndex) {
        this.lastStandardGamePlayedIndex = lastStandardGamePlayedIndex;
    }

    @JsonProperty("standard")
    public List<Game> getGames() {
        return games;
    }

    @JsonProperty("standard")
    public void setGames(List<Game> games) {
        this.games = games;
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
