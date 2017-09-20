
package com.drmilk.nbawrapper.domain.utils.team;

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
    "isNBAFranchise",
    "isAllStar",
    "city",
    "altcityName",
    "fullName",
    "tricode",
    "teamId",
    "nickname",
    "urlName",
    "confName",
    "divName"
})
public class TeamSummary {

    @JsonProperty("isNBAFranchise")
    private Boolean isNBAFranchise;
    @JsonProperty("isAllStar")
    private Boolean isAllStar;
    @JsonProperty("city")
    private String city;
    @JsonProperty("altcityName")
    private String altcityName;
    @JsonProperty("fullName")
    private String fullName;
    @JsonProperty("tricode")
    private String tricode;
    @JsonProperty("teamId")
    private String teamId;
    @JsonProperty("nickname")
    private String nickname;
    @JsonProperty("urlName")
    private String urlName;
    @JsonProperty("confName")
    private String confName;
    @JsonProperty("divName")
    private String divName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("isNBAFranchise")
    public Boolean getIsNBAFranchise() {
        return isNBAFranchise;
    }

    @JsonProperty("isNBAFranchise")
    public void setIsNBAFranchise(Boolean isNBAFranchise) {
        this.isNBAFranchise = isNBAFranchise;
    }

    @JsonProperty("isAllStar")
    public Boolean getIsAllStar() {
        return isAllStar;
    }

    @JsonProperty("isAllStar")
    public void setIsAllStar(Boolean isAllStar) {
        this.isAllStar = isAllStar;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("altcityName")
    public String getAltcityName() {
        return altcityName;
    }

    @JsonProperty("altcityName")
    public void setAltcityName(String altcityName) {
        this.altcityName = altcityName;
    }

    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @JsonProperty("tricode")
    public String getTricode() {
        return tricode;
    }

    @JsonProperty("tricode")
    public void setTricode(String tricode) {
        this.tricode = tricode;
    }

    @JsonProperty("teamId")
    public String getTeamId() {
        return teamId;
    }

    @JsonProperty("teamId")
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    @JsonProperty("nickname")
    public String getNickname() {
        return nickname;
    }

    @JsonProperty("nickname")
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @JsonProperty("urlName")
    public String getUrlName() {
        return urlName;
    }

    @JsonProperty("urlName")
    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }

    @JsonProperty("confName")
    public String getConfName() {
        return confName;
    }

    @JsonProperty("confName")
    public void setConfName(String confName) {
        this.confName = confName;
    }

    @JsonProperty("divName")
    public String getDivName() {
        return divName;
    }

    @JsonProperty("divName")
    public void setDivName(String divName) {
        this.divName = divName;
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
