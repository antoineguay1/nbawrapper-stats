
package com.drmilk.nbawrapper.domain.utils.player;

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
    "ppg",
    "rpg",
    "apg",
    "mpg",
    "topg",
    "spg",
    "bpg",
    "tpp",
    "ftp",
    "fgp",
    "assists",
    "blocks",
    "steals",
    "turnovers",
    "offReb",
    "defReb",
    "totReb",
    "fgm",
    "fga",
    "tpm",
    "tpa",
    "ftm",
    "fta",
    "pFouls",
    "points",
    "gamesPlayed",
    "gamesStarted",
    "plusminus",
    "min",
    "dd2",
    "td3"
})
public class Total {

    @JsonProperty("ppg")
    private String ppg;
    @JsonProperty("rpg")
    private String rpg;
    @JsonProperty("apg")
    private String apg;
    @JsonProperty("mpg")
    private String mpg;
    @JsonProperty("topg")
    private String topg;
    @JsonProperty("spg")
    private String spg;
    @JsonProperty("bpg")
    private String bpg;
    @JsonProperty("tpp")
    private String tpp;
    @JsonProperty("ftp")
    private String ftp;
    @JsonProperty("fgp")
    private String fgp;
    @JsonProperty("assists")
    private String assists;
    @JsonProperty("blocks")
    private String blocks;
    @JsonProperty("steals")
    private String steals;
    @JsonProperty("turnovers")
    private String turnovers;
    @JsonProperty("offReb")
    private String offReb;
    @JsonProperty("defReb")
    private String defReb;
    @JsonProperty("totReb")
    private String totReb;
    @JsonProperty("fgm")
    private String fgm;
    @JsonProperty("fga")
    private String fga;
    @JsonProperty("tpm")
    private String tpm;
    @JsonProperty("tpa")
    private String tpa;
    @JsonProperty("ftm")
    private String ftm;
    @JsonProperty("fta")
    private String fta;
    @JsonProperty("pFouls")
    private String pFouls;
    @JsonProperty("points")
    private String points;
    @JsonProperty("gamesPlayed")
    private String gamesPlayed;
    @JsonProperty("gamesStarted")
    private String gamesStarted;
    @JsonProperty("plusminus")
    private String plusminus;
    @JsonProperty("min")
    private String min;
    @JsonProperty("dd2")
    private String dd2;
    @JsonProperty("td3")
    private String td3;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ppg")
    public String getPpg() {
        return ppg;
    }

    @JsonProperty("ppg")
    public void setPpg(String ppg) {
        this.ppg = ppg;
    }

    @JsonProperty("rpg")
    public String getRpg() {
        return rpg;
    }

    @JsonProperty("rpg")
    public void setRpg(String rpg) {
        this.rpg = rpg;
    }

    @JsonProperty("apg")
    public String getApg() {
        return apg;
    }

    @JsonProperty("apg")
    public void setApg(String apg) {
        this.apg = apg;
    }

    @JsonProperty("mpg")
    public String getMpg() {
        return mpg;
    }

    @JsonProperty("mpg")
    public void setMpg(String mpg) {
        this.mpg = mpg;
    }

    @JsonProperty("topg")
    public String getTopg() {
        return topg;
    }

    @JsonProperty("topg")
    public void setTopg(String topg) {
        this.topg = topg;
    }

    @JsonProperty("spg")
    public String getSpg() {
        return spg;
    }

    @JsonProperty("spg")
    public void setSpg(String spg) {
        this.spg = spg;
    }

    @JsonProperty("bpg")
    public String getBpg() {
        return bpg;
    }

    @JsonProperty("bpg")
    public void setBpg(String bpg) {
        this.bpg = bpg;
    }

    @JsonProperty("tpp")
    public String getTpp() {
        return tpp;
    }

    @JsonProperty("tpp")
    public void setTpp(String tpp) {
        this.tpp = tpp;
    }

    @JsonProperty("ftp")
    public String getFtp() {
        return ftp;
    }

    @JsonProperty("ftp")
    public void setFtp(String ftp) {
        this.ftp = ftp;
    }

    @JsonProperty("fgp")
    public String getFgp() {
        return fgp;
    }

    @JsonProperty("fgp")
    public void setFgp(String fgp) {
        this.fgp = fgp;
    }

    @JsonProperty("assists")
    public String getAssists() {
        return assists;
    }

    @JsonProperty("assists")
    public void setAssists(String assists) {
        this.assists = assists;
    }

    @JsonProperty("blocks")
    public String getBlocks() {
        return blocks;
    }

    @JsonProperty("blocks")
    public void setBlocks(String blocks) {
        this.blocks = blocks;
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

    @JsonProperty("pFouls")
    public String getPFouls() {
        return pFouls;
    }

    @JsonProperty("pFouls")
    public void setPFouls(String pFouls) {
        this.pFouls = pFouls;
    }

    @JsonProperty("points")
    public String getPoints() {
        return points;
    }

    @JsonProperty("points")
    public void setPoints(String points) {
        this.points = points;
    }

    @JsonProperty("gamesPlayed")
    public String getGamesPlayed() {
        return gamesPlayed;
    }

    @JsonProperty("gamesPlayed")
    public void setGamesPlayed(String gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    @JsonProperty("gamesStarted")
    public String getGamesStarted() {
        return gamesStarted;
    }

    @JsonProperty("gamesStarted")
    public void setGamesStarted(String gamesStarted) {
        this.gamesStarted = gamesStarted;
    }

    @JsonProperty("plusminus")
    public String getPlusminus() {
        return plusminus;
    }

    @JsonProperty("plusminus")
    public void setPlusminus(String plusminus) {
        this.plusminus = plusminus;
    }

    @JsonProperty("min")
    public String getMin() {
        return min;
    }

    @JsonProperty("min")
    public void setMin(String min) {
        this.min = min;
    }

    @JsonProperty("dd2")
    public String getDd2() {
        return dd2;
    }

    @JsonProperty("dd2")
    public void setDd2(String dd2) {
        this.dd2 = dd2;
    }

    @JsonProperty("td3")
    public String getTd3() {
        return td3;
    }

    @JsonProperty("td3")
    public void setTd3(String td3) {
        this.td3 = td3;
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
