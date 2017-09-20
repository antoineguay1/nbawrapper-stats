
package com.drmilk.nbawrapper.domain.utils.player;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "firstName",
    "lastName",
    "personId",
    "teamId",
    "jersey",
    "isActive",
    "pos",
    "heightFeet",
    "heightInches",
    "heightMeters",
    "weightPounds",
    "weightKilograms",
    "dateOfBirthUTC",
    "teams",
    "draft",
    "nbaDebutYear",
    "yearsPro",
    "collegeName",
    "lastAffiliation",
    "country"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class LeaguePlayer {

    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("personId")
    private String personId;
    @JsonProperty("teamId")
    private String teamId;
    @JsonProperty("jersey")
    private String jersey;
    @JsonProperty("isActive")
    private Boolean isActive;
    @JsonProperty("pos")
    private String pos;
    @JsonProperty("heightFeet")
    private String heightFeet;
    @JsonProperty("heightInches")
    private String heightInches;
    @JsonProperty("heightMeters")
    private String heightMeters;
    @JsonProperty("weightPounds")
    private String weightPounds;
    @JsonProperty("weightKilograms")
    private String weightKilograms;
    @JsonProperty("dateOfBirthUTC")
    private String dateOfBirthUTC;
    @JsonProperty("teams")
    private List<TeamOverview> teams = null;
    @JsonProperty("draft")
    private Draft draft;
    @JsonProperty("nbaDebutYear")
    private String nbaDebutYear;
    @JsonProperty("yearsPro")
    private String yearsPro;
    @JsonProperty("collegeName")
    private String collegeName;
    @JsonProperty("lastAffiliation")
    private String lastAffiliation;
    @JsonProperty("country")
    private String country;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

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

    @JsonProperty("jersey")
    public String getJersey() {
        return jersey;
    }

    @JsonProperty("jersey")
    public void setJersey(String jersey) {
        this.jersey = jersey;
    }

    @JsonProperty("isActive")
    public Boolean getIsActive() {
        return isActive;
    }

    @JsonProperty("isActive")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @JsonProperty("pos")
    public String getPos() {
        return pos;
    }

    @JsonProperty("pos")
    public void setPos(String pos) {
        this.pos = pos;
    }

    @JsonProperty("heightFeet")
    public String getHeightFeet() {
        return heightFeet;
    }

    @JsonProperty("heightFeet")
    public void setHeightFeet(String heightFeet) {
        this.heightFeet = heightFeet;
    }

    @JsonProperty("heightInches")
    public String getHeightInches() {
        return heightInches;
    }

    @JsonProperty("heightInches")
    public void setHeightInches(String heightInches) {
        this.heightInches = heightInches;
    }

    @JsonProperty("heightMeters")
    public String getHeightMeters() {
        return heightMeters;
    }

    @JsonProperty("heightMeters")
    public void setHeightMeters(String heightMeters) {
        this.heightMeters = heightMeters;
    }

    @JsonProperty("weightPounds")
    public String getWeightPounds() {
        return weightPounds;
    }

    @JsonProperty("weightPounds")
    public void setWeightPounds(String weightPounds) {
        this.weightPounds = weightPounds;
    }

    @JsonProperty("weightKilograms")
    public String getWeightKilograms() {
        return weightKilograms;
    }

    @JsonProperty("weightKilograms")
    public void setWeightKilograms(String weightKilograms) {
        this.weightKilograms = weightKilograms;
    }

    @JsonProperty("dateOfBirthUTC")
    public String getDateOfBirthUTC() {
        return dateOfBirthUTC;
    }

    @JsonProperty("dateOfBirthUTC")
    public void setDateOfBirthUTC(String dateOfBirthUTC) {
        this.dateOfBirthUTC = dateOfBirthUTC;
    }

    @JsonProperty("teams")
    public List<TeamOverview> getTeams() {
        return teams;
    }

    @JsonProperty("teams")
    public void setTeams(List<TeamOverview> teams) {
        this.teams = teams;
    }

    @JsonProperty("draft")
    public Draft getDraft() {
        return draft;
    }

    @JsonProperty("draft")
    public void setDraft(Draft draft) {
        this.draft = draft;
    }

    @JsonProperty("nbaDebutYear")
    public String getNbaDebutYear() {
        return nbaDebutYear;
    }

    @JsonProperty("nbaDebutYear")
    public void setNbaDebutYear(String nbaDebutYear) {
        this.nbaDebutYear = nbaDebutYear;
    }

    @JsonProperty("yearsPro")
    public String getYearsPro() {
        return yearsPro;
    }

    @JsonProperty("yearsPro")
    public void setYearsPro(String yearsPro) {
        this.yearsPro = yearsPro;
    }

    @JsonProperty("collegeName")
    public String getCollegeName() {
        return collegeName;
    }

    @JsonProperty("collegeName")
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @JsonProperty("lastAffiliation")
    public String getLastAffiliation() {
        return lastAffiliation;
    }

    @JsonProperty("lastAffiliation")
    public void setLastAffiliation(String lastAffiliation) {
        this.lastAffiliation = lastAffiliation;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
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
