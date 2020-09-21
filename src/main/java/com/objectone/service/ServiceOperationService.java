package com.objectone.service;

import com.objectone.dto.TaskDecision;
import com.objectone.dto.response.CommonResponse;
import com.objectone.dto.response.TaskDetailsResponse;

import java.util.List;

public interface ServiceOperationService {
    List<TaskDetailsResponse> getAllGroupTasks(String group);

    CommonResponse soDecision(TaskDecision taskDecision);
}
