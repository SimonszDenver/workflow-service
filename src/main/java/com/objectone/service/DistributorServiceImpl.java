package com.objectone.service;

import com.objectone.dto.Seller;
import com.objectone.dto.TaskDecision;
import com.objectone.dto.response.CommonResponse;
import com.objectone.dto.response.TaskDetailsResponse;
import com.objectone.util.Common;
import com.objectone.util.Const;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DistributorServiceImpl implements DistributorService {

    @Autowired
    private TaskService taskService;

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private Common common;

    @Override
    public List<TaskDetailsResponse> getAllAssignedTasks(String distributorId){
        List<Task> tasks = taskService.createTaskQuery().taskAssignee(distributorId).list();
        return common.getTaskDetails(tasks);
    }

    @Override
    public CommonResponse takeDistributorDecision(TaskDecision taskDecision){
        Map<String, Object> variables = new HashMap<>();
        variables.put(Const.ACTION, taskDecision.getAction());
        taskService.complete(taskDecision.getTaskId(), variables);
        return new CommonResponse(Const.SUCCESS);
    }

    @Override
    public CommonResponse updateProcessVariables(String instanceId, Seller seller) {
        runtimeService.setVariable(instanceId, "sellerDetails", seller.getSellerDetails());
        return new CommonResponse(Const.SUCCESS);
    }
}
