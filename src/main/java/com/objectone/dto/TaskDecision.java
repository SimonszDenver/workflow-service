package com.objectone.dto;

public class DistributorDecision {
    private String distributorId;
    private String taskId;
    private boolean decision;

    public DistributorDecision() {
    }

    public DistributorDecision(String distributorId, String taskId, boolean decision) {
        this.distributorId = distributorId;
        this.taskId = taskId;
        this.decision = decision;
    }

    public String getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(String distributorId) {
        this.distributorId = distributorId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public boolean isDecision() {
        return decision;
    }

    public void setDecision(boolean decision) {
        this.decision = decision;
    }
}
