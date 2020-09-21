package com.objectone.controller;

import com.objectone.dto.TaskDecision;
import com.objectone.dto.response.CommonResponse;
import com.objectone.dto.response.TaskDetailsResponse;
import com.objectone.service.ServiceOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service-operation")
public class ServiceOperationController {

    @Autowired
    private ServiceOperationService serviceOperationService;

    @GetMapping(value = "/tasks/{group}", produces = "application/json")
    public ResponseEntity<List<TaskDetailsResponse>> getAllGroupTasks(@PathVariable String group){
        return new ResponseEntity<>(serviceOperationService.getAllGroupTasks(group), HttpStatus.OK);
    }

    @PutMapping(value = "/tasks/decision", consumes = "application/json", produces = "application/json")
    public ResponseEntity<CommonResponse> approveRejectSoTasks(@RequestBody TaskDecision taskDecision){
        return new ResponseEntity<>(serviceOperationService.soDecision(taskDecision), HttpStatus.OK);
    }
}
