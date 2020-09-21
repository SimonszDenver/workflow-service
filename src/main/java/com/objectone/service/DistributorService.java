package com.objectone.service;

import com.objectone.dto.Seller;
import com.objectone.dto.TaskDecision;
import com.objectone.dto.response.CommonResponse;
import com.objectone.dto.response.TaskDetailsResponse;

import java.util.List;

public interface DistributorService {
    List<TaskDetailsResponse> getAllAssignedTasks(String distributorId);

    CommonResponse takeDistributorDecision(TaskDecision taskDecision);

    CommonResponse updateProcessVariables(String instanceId, Seller seller);
}
