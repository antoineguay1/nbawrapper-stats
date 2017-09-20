
package com.drmilk.nbawrapper.domain.utils.scoreboard;

import java.util.HashMap;
import java.util.List;
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
    "numGames",
    "games"
})
public class Scoreboard {

    @JsonProperty("_internal")
    private Internal internal;
    @JsonProperty("numGames")
    private Integer numGames;
    @JsonProperty("games")
    private List<GameDetails> games = null;
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

    @JsonProperty("numGames")
    public Integer getNumGames() {
        return numGames;
    }

    @JsonProperty("numGames")
    public void setNumGames(Integer numGames) {
        this.numGames = numGames;
    }

    @JsonProperty("games")
    public List<GameDetails> getGames() {
        return games;
    }

    @JsonProperty("games")
    public void setGames(List<GameDetails> games) {
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
