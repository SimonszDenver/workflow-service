package com.objectone.controller;

import com.objectone.dto.TaskDecision;
import com.objectone.dto.response.CommonResponse;
import com.objectone.dto.response.TaskDetailsResponse;
import com.objectone.service.SOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/so")
public class SOController {
/* Service Operation controller */
    @Autowired
    private SOService soService;

    @GetMapping(value = "/tasks")
    public ResponseEntity<List<TaskDetailsResponse>> getAllGroupTasks(){
        return new ResponseEntity<>(soService.getAllGroupTasks(), HttpStatus.OK);
    }

    @PostMapping(value = "/decision", consumes = "application/json", produces = "application/json")
    public ResponseEntity<CommonResponse> approveRejectSoTasks(@RequestBody TaskDecision taskDecision){
        return new ResponseEntity<>(soService.soDecision(taskDecision), HttpStatus.OK);
    }
}
