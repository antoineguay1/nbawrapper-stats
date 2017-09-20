
package com.drmilk.nbawrapper.domain.utils.scoreboard;

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
    "current",
    "type",
    "maxRegular",
    "isHalftime",
    "isEndOfPeriod"
})
public class Period {

    @JsonProperty("current")
    private Integer current;
    @JsonProperty("type")
    private Integer type;
    @JsonProperty("maxRegular")
    private Integer maxRegular;
    @JsonProperty("isHalftime")
    private Boolean isHalftime;
    @JsonProperty("isEndOfPeriod")
    private Boolean isEndOfPeriod;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("current")
    public Integer getCurrent() {
        return current;
    }

    @JsonProperty("current")
    public void setCurrent(Integer current) {
        this.current = current;
    }

    @JsonProperty("type")
    public Integer getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Integer type) {
        this.type = type;
    }

    @JsonProperty("maxRegular")
    public Integer getMaxRegular() {
        return maxRegular;
    }

    @JsonProperty("maxRegular")
    public void setMaxRegular(Integer maxRegular) {
        this.maxRegular = maxRegular;
    }

    @JsonProperty("isHalftime")
    public Boolean getIsHalftime() {
        return isHalftime;
    }

    @JsonProperty("isHalftime")
    public void setIsHalftime(Boolean isHalftime) {
        this.isHalftime = isHalftime;
    }

    @JsonProperty("isEndOfPeriod")
    public Boolean getIsEndOfPeriod() {
        return isEndOfPeriod;
    }

    @JsonProperty("isEndOfPeriod")
    public void setIsEndOfPeriod(Boolean isEndOfPeriod) {
        this.isEndOfPeriod = isEndOfPeriod;
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
