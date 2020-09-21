package com.objectone.service;

import com.objectone.dto.TaskDecision;
import com.objectone.dto.response.CommonResponse;
import com.objectone.dto.response.TaskDetailsResponse;
import com.objectone.util.Common;
import com.objectone.util.Const;
import org.flowable.engine.TaskService;
import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ServiceOperationServiceImpl implements ServiceOperationService {

    @Autowired
    private TaskService taskService;

    @Autowired
    private Common common;

    @Override
    public List<TaskDetailsResponse> getAllGroupTasks(String group){
        List<Task> soTasks = taskService.createTaskQuery().taskCandidateGroup(group).list();
        return common.getTaskDetails(soTasks);
    }

    @Override
    public CommonResponse soDecision(TaskDecision taskDecision){
        Map<String, Object> variables = new HashMap<>();
        variables.put(Const.SO_ACTION, taskDecision.getAction());
        taskService.complete(taskDecision.getTaskId(), variables);
        return new CommonResponse(Const.SUCCESS);
    }
}
