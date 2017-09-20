
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
    "seasonStageId",
    "ppg",
    "trpg",
    "apg",
    "fgp",
    "tpp",
    "ftp",
    "bpg",
    "spg",
    "tpg",
    "pfpg"
})
public class TeamLeaders {

    @JsonProperty("seasonStageId")
    private Integer seasonStageId;
    @JsonProperty("ppg")
    private List<Leader> pointsPG = null;
    @JsonProperty("trpg")
    private List<Leader> totalReboundsPG = null;
    @JsonProperty("apg")
    private List<Leader> assistsPG = null;
    @JsonProperty("fgp")
    private List<Leader> fieldGoalPercentage = null;
    @JsonProperty("tpp")
    private List<Leader> threePointPercentage = null;
    @JsonProperty("ftp")
    private List<Leader> freeThrowPercentage = null;
    @JsonProperty("bpg")
    private List<Leader> blocksPG = null;
    @JsonProperty("spg")
    private List<Leader> stealsPG = null;
    @JsonProperty("tpg")
    private List<Leader> turnoversPG = null;
    @JsonProperty("pfpg")
    private List<Leader> personalFoulPG = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("seasonStageId")
    public Integer getSeasonStageId() {
        return seasonStageId;
    }

    @JsonProperty("seasonStageId")
    public void setSeasonStageId(Integer seasonStageId) {
        this.seasonStageId = seasonStageId;
    }

    @JsonProperty("ppg")
    public List<Leader> getPointsPG() {
        return pointsPG;
    }

    @JsonProperty("ppg")
    public void setPointsPG(List<Leader> ppg) {
        this.pointsPG = ppg;
    }

    @JsonProperty("trpg")
    public List<Leader> getTotalReboundsPG() {
        return totalReboundsPG;
    }

    @JsonProperty("trpg")
    public void setTotalReboundsPG(List<Leader> trpg) {
        this.totalReboundsPG = trpg;
    }

    @JsonProperty("apg")
    public List<Leader> getAssistsPG() {
        return assistsPG;
    }

    @JsonProperty("apg")
    public void setAssistsPG(List<Leader> apg) {
        this.assistsPG = apg;
    }

    @JsonProperty("fgp")
    public List<Leader> getFieldGoalPercentage() {
        return fieldGoalPercentage;
    }

    @JsonProperty("fgp")
    public void setFieldGoalPercentage(List<Leader> fgp) {
        this.fieldGoalPercentage = fgp;
    }

    @JsonProperty("tpp")
    public List<Leader> getThreePointPercentage() {
        return threePointPercentage;
    }

    @JsonProperty("tpp")
    public void setThreePointPercentage(List<Leader> tpp) {
        this.threePointPercentage = tpp;
    }

    @JsonProperty("ftp")
    public List<Leader> getFreeThrowPercentage() {
        return freeThrowPercentage;
    }

    @JsonProperty("ftp")
    public void setFreeThrowPercentage(List<Leader> ftp) {
        this.freeThrowPercentage = ftp;
    }

    @JsonProperty("bpg")
    public List<Leader> getBlocksPG() {
        return blocksPG;
    }

    @JsonProperty("bpg")
    public void setBlocksPG(List<Leader> bpg) {
        this.blocksPG = bpg;
    }

    @JsonProperty("spg")
    public List<Leader> getStealsPG() {
        return stealsPG;
    }

    @JsonProperty("spg")
    public void setStealsPG(List<Leader> spg) {
        this.stealsPG = spg;
    }

    @JsonProperty("tpg")
    public List<Leader> getTurnoversPG() {
        return turnoversPG;
    }

    @JsonProperty("tpg")
    public void setTurnoversPG(List<Leader> tpg) {
        this.turnoversPG = tpg;
    }

    @JsonProperty("pfpg")
    public List<Leader> getPersonalFoulPG() {
        return personalFoulPG;
    }

    @JsonProperty("pfpg")
    public void setPersonalFoulPG(List<Leader> pfpg) {
        this.personalFoulPG = pfpg;
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
