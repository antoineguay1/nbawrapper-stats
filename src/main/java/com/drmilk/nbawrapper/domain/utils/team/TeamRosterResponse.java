
package com.drmilk.nbawrapper.domain.utils.team;

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
    "league"
})
public class TeamRosterResponse {

    @JsonProperty("_internal")
    private Internal internal;
    @JsonProperty("league")
    private RosterContainer league;
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

    @JsonProperty("league")
    public RosterContainer getLeague() {
        return league;
    }

    @JsonProperty("league")
    public void setLeague(RosterContainer league) {
        this.league = league;
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
