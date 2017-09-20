
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
    "name",
    "pos",
    "points",
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
    "plusMinus"
})
public class SortKey {

    @JsonProperty("name")
    private Integer name;
    @JsonProperty("pos")
    private Integer pos;
    @JsonProperty("points")
    private Integer points;
    @JsonProperty("min")
    private Integer min;
    @JsonProperty("fgm")
    private Integer fgm;
    @JsonProperty("fga")
    private Integer fga;
    @JsonProperty("fgp")
    private Integer fgp;
    @JsonProperty("ftm")
    private Integer ftm;
    @JsonProperty("fta")
    private Integer fta;
    @JsonProperty("ftp")
    private Integer ftp;
    @JsonProperty("tpm")
    private Integer tpm;
    @JsonProperty("tpa")
    private Integer tpa;
    @JsonProperty("tpp")
    private Integer tpp;
    @JsonProperty("offReb")
    private Integer offReb;
    @JsonProperty("defReb")
    private Integer defReb;
    @JsonProperty("totReb")
    private Integer totReb;
    @JsonProperty("assists")
    private Integer assists;
    @JsonProperty("pFouls")
    private Integer pFouls;
    @JsonProperty("steals")
    private Integer steals;
    @JsonProperty("turnovers")
    private Integer turnovers;
    @JsonProperty("blocks")
    private Integer blocks;
    @JsonProperty("plusMinus")
    private Integer plusMinus;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public Integer getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(Integer name) {
        this.name = name;
    }

    @JsonProperty("pos")
    public Integer getPos() {
        return pos;
    }

    @JsonProperty("pos")
    public void setPos(Integer pos) {
        this.pos = pos;
    }

    @JsonProperty("points")
    public Integer getPoints() {
        return points;
    }

    @JsonProperty("points")
    public void setPoints(Integer points) {
        this.points = points;
    }

    @JsonProperty("min")
    public Integer getMin() {
        return min;
    }

    @JsonProperty("min")
    public void setMin(Integer min) {
        this.min = min;
    }

    @JsonProperty("fgm")
    public Integer getFgm() {
        return fgm;
    }

    @JsonProperty("fgm")
    public void setFgm(Integer fgm) {
        this.fgm = fgm;
    }

    @JsonProperty("fga")
    public Integer getFga() {
        return fga;
    }

    @JsonProperty("fga")
    public void setFga(Integer fga) {
        this.fga = fga;
    }

    @JsonProperty("fgp")
    public Integer getFgp() {
        return fgp;
    }

    @JsonProperty("fgp")
    public void setFgp(Integer fgp) {
        this.fgp = fgp;
    }

    @JsonProperty("ftm")
    public Integer getFtm() {
        return ftm;
    }

    @JsonProperty("ftm")
    public void setFtm(Integer ftm) {
        this.ftm = ftm;
    }

    @JsonProperty("fta")
    public Integer getFta() {
        return fta;
    }

    @JsonProperty("fta")
    public void setFta(Integer fta) {
        this.fta = fta;
    }

    @JsonProperty("ftp")
    public Integer getFtp() {
        return ftp;
    }

    @JsonProperty("ftp")
    public void setFtp(Integer ftp) {
        this.ftp = ftp;
    }

    @JsonProperty("tpm")
    public Integer getTpm() {
        return tpm;
    }

    @JsonProperty("tpm")
    public void setTpm(Integer tpm) {
        this.tpm = tpm;
    }

    @JsonProperty("tpa")
    public Integer getTpa() {
        return tpa;
    }

    @JsonProperty("tpa")
    public void setTpa(Integer tpa) {
        this.tpa = tpa;
    }

    @JsonProperty("tpp")
    public Integer getTpp() {
        return tpp;
    }

    @JsonProperty("tpp")
    public void setTpp(Integer tpp) {
        this.tpp = tpp;
    }

    @JsonProperty("offReb")
    public Integer getOffReb() {
        return offReb;
    }

    @JsonProperty("offReb")
    public void setOffReb(Integer offReb) {
        this.offReb = offReb;
    }

    @JsonProperty("defReb")
    public Integer getDefReb() {
        return defReb;
    }

    @JsonProperty("defReb")
    public void setDefReb(Integer defReb) {
        this.defReb = defReb;
    }

    @JsonProperty("totReb")
    public Integer getTotReb() {
        return totReb;
    }

    @JsonProperty("totReb")
    public void setTotReb(Integer totReb) {
        this.totReb = totReb;
    }

    @JsonProperty("assists")
    public Integer getAssists() {
        return assists;
    }

    @JsonProperty("assists")
    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    @JsonProperty("pFouls")
    public Integer getPFouls() {
        return pFouls;
    }

    @JsonProperty("pFouls")
    public void setPFouls(Integer pFouls) {
        this.pFouls = pFouls;
    }

    @JsonProperty("steals")
    public Integer getSteals() {
        return steals;
    }

    @JsonProperty("steals")
    public void setSteals(Integer steals) {
        this.steals = steals;
    }

    @JsonProperty("turnovers")
    public Integer getTurnovers() {
        return turnovers;
    }

    @JsonProperty("turnovers")
    public void setTurnovers(Integer turnovers) {
        this.turnovers = turnovers;
    }

    @JsonProperty("blocks")
    public Integer getBlocks() {
        return blocks;
    }

    @JsonProperty("blocks")
    public void setBlocks(Integer blocks) {
        this.blocks = blocks;
    }

    @JsonProperty("plusMinus")
    public Integer getPlusMinus() {
        return plusMinus;
    }

    @JsonProperty("plusMinus")
    public void setPlusMinus(Integer plusMinus) {
        this.plusMinus = plusMinus;
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
