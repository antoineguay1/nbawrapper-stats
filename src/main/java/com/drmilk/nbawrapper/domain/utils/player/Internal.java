
package com.drmilk.nbawrapper.domain.utils.player;

import java.util.HashMap;
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
    "pubDateTime",
    "xslt",
    "eventName"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Internal {

    @JsonProperty("pubDateTime")
    private String pubDateTime;
    @JsonProperty("xslt")
    private String xslt;
    @JsonProperty("eventName")
    private String eventName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pubDateTime")
    public String getPubDateTime() {
        return pubDateTime;
    }

    @JsonProperty("pubDateTime")
    public void setPubDateTime(String pubDateTime) {
        this.pubDateTime = pubDateTime;
    }

    @JsonProperty("xslt")
    public String getXslt() {
        return xslt;
    }

    @JsonProperty("xslt")
    public void setXslt(String xslt) {
        this.xslt = xslt;
    }

    @JsonProperty("eventName")
    public String getEventName() {
        return eventName;
    }

    @JsonProperty("eventName")
    public void setEventName(String eventName) {
        this.eventName = eventName;
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
