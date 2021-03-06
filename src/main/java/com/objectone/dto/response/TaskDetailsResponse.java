package com.objectone.dto.response;

import lombok.Data;

import java.util.Map;

public class TaskDetailsResponse {
    private String taskId;
    private String taskName;
    private Map<String, Object> taskData;

    public TaskDetailsResponse() {
    }

    public TaskDetailsResponse(String taskId, String taskName, Map<String, Object> taskData) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskData = taskData;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Map<String, Object> getTaskData() {
        return taskData;
    }

    public void setTaskData(Map<String, Object> taskData) {
        this.taskData = taskData;
    }
}
