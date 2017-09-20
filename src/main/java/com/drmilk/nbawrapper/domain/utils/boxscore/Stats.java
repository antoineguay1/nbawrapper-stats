
package com.drmilk.nbawrapper.domain.utils.boxscore;

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
    "timesTied",
    "leadChanges",
    "vTeam",
    "hTeam",
    "activePlayers"
})
public class Stats {

    @JsonProperty("timesTied")
    private String timesTied;
    @JsonProperty("leadChanges")
    private String leadChanges;
    @JsonProperty("vTeam")
    private TeamStats visitingTeam;
    @JsonProperty("hTeam")
    private TeamStats homeTeam;
    @JsonProperty("activePlayers")
    private List<ActivePlayer> activePlayers = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("timesTied")
    public String getTimesTied() {
        return timesTied;
    }

    @JsonProperty("timesTied")
    public void setTimesTied(String timesTied) {
        this.timesTied = timesTied;
    }

    @JsonProperty("leadChanges")
    public String getLeadChanges() {
        return leadChanges;
    }

    @JsonProperty("leadChanges")
    public void setLeadChanges(String leadChanges) {
        this.leadChanges = leadChanges;
    }

    @JsonProperty("vTeam")
    public TeamStats getVisitingTeam() {
        return visitingTeam;
    }

    @JsonProperty("vTeam")
    public void setVisitingTeam(TeamStats vTeam) {
        this.visitingTeam = vTeam;
    }

    @JsonProperty("hTeam")
    public TeamStats getHomeTeam() {
        return homeTeam;
    }

    @JsonProperty("hTeam")
    public void setHomeTeam(TeamStats hTeam) {
        this.homeTeam = hTeam;
    }

    @JsonProperty("activePlayers")
    public List<ActivePlayer> getActivePlayers() {
        return activePlayers;
    }

    @JsonProperty("activePlayers")
    public void setActivePlayers(List<ActivePlayer> activePlayers) {
        this.activePlayers = activePlayers;
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
