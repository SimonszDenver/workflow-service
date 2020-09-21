package com.objectone.controller;

import com.objectone.dto.Seller;
import com.objectone.dto.TaskDecision;
import com.objectone.dto.response.CommonResponse;
import com.objectone.dto.response.TaskDetailsResponse;
import com.objectone.service.DistributorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/distributor")
public class DistributorController {

    @Autowired
    private DistributorService distributorService;

    @GetMapping(value = "/tasks/{distributorId}", produces = "application/json")
    public ResponseEntity<List<TaskDetailsResponse>> getAllAssignedTasks(@PathVariable String distributorId){
        return new ResponseEntity<>(distributorService.getAllAssignedTasks(distributorId), HttpStatus.OK);
    }

    @PutMapping(value = "/tasks/decision",consumes = "application/json", produces = "application/json")
    public ResponseEntity<CommonResponse> takeDistributorDecision(@RequestBody TaskDecision taskDecision){
        return new ResponseEntity<>(distributorService.takeDistributorDecision(taskDecision), HttpStatus.OK);
    }

    @PutMapping(value = "/tasks/{instanceId}")
    public ResponseEntity<CommonResponse> updateProcessVariables(@PathVariable String instanceId, @RequestBody Seller seller){
        return new ResponseEntity<>(distributorService.updateProcessVariables(instanceId, seller), HttpStatus.OK);
    }
}
