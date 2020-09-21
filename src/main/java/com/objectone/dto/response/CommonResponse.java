package com.objectone.dto.response;

public class CommonResponse {
    private String status;

    public CommonResponse() {
    }

    public CommonResponse(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
