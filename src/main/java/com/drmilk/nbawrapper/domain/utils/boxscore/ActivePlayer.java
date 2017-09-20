
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
    "personId",
    "teamId",
    "isOnCourt",
    "points",
    "pos",
    "min",
    "fgm",
    "fga",
    "fgp",
    "ftm",
    "fta",
    "ftp",
    "tpm",
    "tpa",
    "tpp",
    "offReb",
    "defReb",
    "totReb",
    "assists",
    "pFouls",
    "steals",
    "turnovers",
    "blocks",
    "plusMinus",
    "dnp",
    "sortKey"
})
public class ActivePlayer {

    @JsonProperty("personId")
    private String personId;
    @JsonProperty("teamId")
    private String teamId;
    @JsonProperty("isOnCourt")
    private Boolean isOnCourt;
    @JsonProperty("points")
    private String points;
    @JsonProperty("pos")
    private String pos;
    @JsonProperty("min")
    private String min;
    @JsonProperty("fgm")
    private String fgm;
    @JsonProperty("fga")
    private String fga;
    @JsonProperty("fgp")
    private String fgp;
    @JsonProperty("ftm")
    private String ftm;
    @JsonProperty("fta")
    private String fta;
    @JsonProperty("ftp")
    private String ftp;
    @JsonProperty("tpm")
    private String tpm;
    @JsonProperty("tpa")
    private String tpa;
    @JsonProperty("tpp")
    private String tpp;
    @JsonProperty("offReb")
    private String offReb;
    @JsonProperty("defReb")
    private String defReb;
    @JsonProperty("totReb")
    private String totReb;
    @JsonProperty("assists")
    private String assists;
    @JsonProperty("pFouls")
    private String pFouls;
    @JsonProperty("steals")
    private String steals;
    @JsonProperty("turnovers")
    private String turnovers;
    @JsonProperty("blocks")
    private String blocks;
    @JsonProperty("plusMinus")
    private String plusMinus;
    @JsonProperty("dnp")
    private String dnp;
    @JsonProperty("sortKey")
    private SortKey sortKey;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("personId")
    public String getPersonId() {
        return personId;
    }

    @JsonProperty("personId")
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    @JsonProperty("teamId")
    public String getTeamId() {
        return teamId;
    }

    @JsonProperty("teamId")
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    @JsonProperty("isOnCourt")
    public Boolean getIsOnCourt() {
        return isOnCourt;
    }

    @JsonProperty("isOnCourt")
    public void setIsOnCourt(Boolean isOnCourt) {
        this.isOnCourt = isOnCourt;
    }

    @JsonProperty("points")
    public String getPoints() {
        return points;
    }

    @JsonProperty("points")
    public void setPoints(String points) {
        this.points = points;
    }

    @JsonProperty("pos")
    public String getPos() {
        return pos;
    }

    @JsonProperty("pos")
    public void setPos(String pos) {
        this.pos = pos;
    }

    @JsonProperty("min")
    public String getMin() {
        return min;
    }

    @JsonProperty("min")
    public void setMin(String min) {
        this.min = min;
    }

    @JsonProperty("fgm")
    public String getFgm() {
        return fgm;
    }

    @JsonProperty("fgm")
    public void setFgm(String fgm) {
        this.fgm = fgm;
    }

    @JsonProperty("fga")
    public String getFga() {
        return fga;
    }

    @JsonProperty("fga")
    public void setFga(String fga) {
        this.fga = fga;
    }

    @JsonProperty("fgp")
    public String getFgp() {
        return fgp;
    }

    @JsonProperty("fgp")
    public void setFgp(String fgp) {
        this.fgp = fgp;
    }

    @JsonProperty("ftm")
    public String getFtm() {
        return ftm;
    }

    @JsonProperty("ftm")
    public void setFtm(String ftm) {
        this.ftm = ftm;
    }

    @JsonProperty("fta")
    public String getFta() {
        return fta;
    }

    @JsonProperty("fta")
    public void setFta(String fta) {
        this.fta = fta;
    }

    @JsonProperty("ftp")
    public String getFtp() {
        return ftp;
    }

    @JsonProperty("ftp")
    public void setFtp(String ftp) {
        this.ftp = ftp;
    }

    @JsonProperty("tpm")
    public String getTpm() {
        return tpm;
    }

    @JsonProperty("tpm")
    public void setTpm(String tpm) {
        this.tpm = tpm;
    }

    @JsonProperty("tpa")
    public String getTpa() {
        return tpa;
    }

    @JsonProperty("tpa")
    public void setTpa(String tpa) {
        this.tpa = tpa;
    }

    @JsonProperty("tpp")
    public String getTpp() {
        return tpp;
    }

    @JsonProperty("tpp")
    public void setTpp(String tpp) {
        this.tpp = tpp;
    }

    @JsonProperty("offReb")
    public String getOffReb() {
        return offReb;
    }

    @JsonProperty("offReb")
    public void setOffReb(String offReb) {
        this.offReb = offReb;
    }

    @JsonProperty("defReb")
    public String getDefReb() {
        return defReb;
    }

    @JsonProperty("defReb")
    public void setDefReb(String defReb) {
        this.defReb = defReb;
    }

    @JsonProperty("totReb")
    public String getTotReb() {
        return totReb;
    }

    @JsonProperty("totReb")
    public void setTotReb(String totReb) {
        this.totReb = totReb;
    }

    @JsonProperty("assists")
    public String getAssists() {
        return assists;
    }

    @JsonProperty("assists")
    public void setAssists(String assists) {
        this.assists = assists;
    }

    @JsonProperty("pFouls")
    public String getPFouls() {
        return pFouls;
    }

    @JsonProperty("pFouls")
    public void setPFouls(String pFouls) {
        this.pFouls = pFouls;
    }

    @JsonProperty("steals")
    public String getSteals() {
        return steals;
    }

    @JsonProperty("steals")
    public void setSteals(String steals) {
        this.steals = steals;
    }

    @JsonProperty("turnovers")
    public String getTurnovers() {
        return turnovers;
    }

    @JsonProperty("turnovers")
    public void setTurnovers(String turnovers) {
        this.turnovers = turnovers;
    }

    @JsonProperty("blocks")
    public String getBlocks() {
        return blocks;
    }

    @JsonProperty("blocks")
    public void setBlocks(String blocks) {
        this.blocks = blocks;
    }

    @JsonProperty("plusMinus")
    public String getPlusMinus() {
        return plusMinus;
    }

    @JsonProperty("plusMinus")
    public void setPlusMinus(String plusMinus) {
        this.plusMinus = plusMinus;
    }

    @JsonProperty("dnp")
    public String getDnp() {
        return dnp;
    }

    @JsonProperty("dnp")
    public void setDnp(String dnp) {
        this.dnp = dnp;
    }

    @JsonProperty("sortKey")
    public SortKey getSortKey() {
        return sortKey;
    }

    @JsonProperty("sortKey")
    public void setSortKey(SortKey sortKey) {
        this.sortKey = sortKey;
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
