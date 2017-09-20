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
    "fastBreakPoints",
    "pointsInPaint",
    "biggestLead",
    "secondChancePoints",
    "pointsOffTurnovers",
    "longestRun",
    "totals",
    "leaders"
})
public class TeamStats {

    @JsonProperty("fastBreakPoints")
    private String fastBreakPoints;
    @JsonProperty("pointsInPaint")
    private String pointsInPaint;
    @JsonProperty("biggestLead")
    private String biggestLead;
    @JsonProperty("secondChancePoints")
    private String secondChancePoints;
    @JsonProperty("pointsOffTurnovers")
    private String pointsOffTurnovers;
    @JsonProperty("longestRun")
    private String longestRun;
    @JsonProperty("totals")
    private Totals totals;
    @JsonProperty("leaders")
    private Leaders leaders;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fastBreakPoints")
    public String getFastBreakPoints() {
        return fastBreakPoints;
    }

    @JsonProperty("fastBreakPoints")
    public void setFastBreakPoints(String fastBreakPoints) {
        this.fastBreakPoints = fastBreakPoints;
    }

    @JsonProperty("pointsInPaint")
    public String getPointsInPaint() {
        return pointsInPaint;
    }

    @JsonProperty("pointsInPaint")
    public void setPointsInPaint(String pointsInPaint) {
        this.pointsInPaint = pointsInPaint;
    }

    @JsonProperty("biggestLead")
    public String getBiggestLead() {
        return biggestLead;
    }

    @JsonProperty("biggestLead")
    public void setBiggestLead(String biggestLead) {
        this.biggestLead = biggestLead;
    }

    @JsonProperty("secondChancePoints")
    public String getSecondChancePoints() {
        return secondChancePoints;
    }

    @JsonProperty("secondChancePoints")
    public void setSecondChancePoints(String secondChancePoints) {
        this.secondChancePoints = secondChancePoints;
    }

    @JsonProperty("pointsOffTurnovers")
    public String getPointsOffTurnovers() {
        return pointsOffTurnovers;
    }

    @JsonProperty("pointsOffTurnovers")
    public void setPointsOffTurnovers(String pointsOffTurnovers) {
        this.pointsOffTurnovers = pointsOffTurnovers;
    }

    @JsonProperty("longestRun")
    public String getLongestRun() {
        return longestRun;
    }

    @JsonProperty("longestRun")
    public void setLongestRun(String longestRun) {
        this.longestRun = longestRun;
    }

    @JsonProperty("totals")
    public Totals getTotals() {
        return totals;
    }

    @JsonProperty("totals")
    public void setTotals(Totals totals) {
        this.totals = totals;
    }

    @JsonProperty("leaders")
    public Leaders getLeaders() {
        return leaders;
    }

    @JsonProperty("leaders")
    public void setLeaders(Leaders leaders) {
        this.leaders = leaders;
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
