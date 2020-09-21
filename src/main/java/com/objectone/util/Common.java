package com.objectone.util;

import com.objectone.dto.response.TaskDetailsResponse;
import org.flowable.engine.TaskService;
import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class Common {

    @Autowired
    private TaskService taskService;

    /* Convert Task to Task Details. Filter important Properties*/
    public List<TaskDetailsResponse> getTaskDetails(List<Task> tasks) {
        List<TaskDetailsResponse> taskDetailResponses = new ArrayList<>();
        for (Task task : tasks) {
            Map<String, Object> processVariables = taskService.getVariables(task.getId());
            taskDetailResponses.add(new TaskDetailsResponse(task.getId(), task.getName(), processVariables));
        }
        return taskDetailResponses;
    }
}
