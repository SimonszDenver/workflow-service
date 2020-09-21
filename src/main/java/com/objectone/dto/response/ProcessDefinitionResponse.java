package com.objectone.dto.response;

public class ProcessDefinitionResponse {
    private String id;
    private String name;
    private String key;
    private int version;

    public ProcessDefinitionResponse() {
    }

    public ProcessDefinitionResponse(String id, String name, String key, int version) {
        this.id = id;
        this.name = name;
        this.key = key;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
