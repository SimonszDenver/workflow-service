package com.objectone.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

public class ProcessInstanceResponse {
    private String processInstanceId;
    private Date startTime;
    private boolean isEnded;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Date endTime;

    public ProcessInstanceResponse() {
    }

    public ProcessInstanceResponse(String processInstanceId, Date startTime, boolean isEnded, Date endTime) {
        this.processInstanceId = processInstanceId;
        this.startTime = startTime;
        this.isEnded = isEnded;
        this.endTime = endTime;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public boolean isEnded() {
        return isEnded;
    }

    public void setEnded(boolean ended) {
        isEnded = ended;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
