package com.it.jms;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author huangchangling on 2017/10/25 0025
 */
public class Message implements Serializable{
    private static final long serialVersionUID = -1118236567096207803L;
    private Long objectId;
    private String objectType;
    private String eventType;
    private String addition;
    private String systemType;
    private String trackNumber;
    private String parentAppName;
    private String distributedContextJson;
    private Map<String, Object> attributes;

    public Message(Long objectId, String objectType, String eventType) {
        this.objectId = objectId;
        this.objectType = objectType;
        this.eventType = eventType;
        this.attributes = new HashMap();
    }

    public Message() {
        this.attributes = new HashMap();
    }

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getAddition() {
        return addition;
    }

    public void setAddition(String addition) {
        this.addition = addition;
    }

    public String getSystemType() {
        return systemType;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }

    public String getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(String trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String getParentAppName() {
        return parentAppName;
    }

    public void setParentAppName(String parentAppName) {
        this.parentAppName = parentAppName;
    }

    public String getDistributedContextJson() {
        return distributedContextJson;
    }

    public void setDistributedContextJson(String distributedContextJson) {
        this.distributedContextJson = distributedContextJson;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "Message{" +
                "eventType='" + eventType + '\'' +
                ", objectId=" + objectId +
                ", objectType='" + objectType + '\'' +
                '}';
    }
}
