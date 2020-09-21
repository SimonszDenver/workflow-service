package com.objectone.dto;

public class TaskDecision {
    private String taskId;
    private String action;

    public TaskDecision() {
    }

    public TaskDecision(String taskId, String action) {
        this.taskId = taskId;
        this.action = action;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
