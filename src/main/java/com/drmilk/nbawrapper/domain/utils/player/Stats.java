
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
    "latest",
    "careerSummary",
    "regularSeason"
})
public class Stats {

    @JsonProperty("latest")
    private Latest latest;
    @JsonProperty("careerSummary")
    private CareerSummary careerSummary;
    @JsonProperty("regularSeason")
    private RegularSeason regularSeason;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("latest")
    public Latest getLatest() {
        return latest;
    }

    @JsonProperty("latest")
    public void setLatest(Latest latest) {
        this.latest = latest;
    }

    @JsonProperty("careerSummary")
    public CareerSummary getCareerSummary() {
        return careerSummary;
    }

    @JsonProperty("careerSummary")
    public void setCareerSummary(CareerSummary careerSummary) {
        this.careerSummary = careerSummary;
    }

    @JsonProperty("regularSeason")
    public RegularSeason getRegularSeason() {
        return regularSeason;
    }

    @JsonProperty("regularSeason")
    public void setRegularSeason(RegularSeason regularSeason) {
        this.regularSeason = regularSeason;
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
