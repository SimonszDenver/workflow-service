package com.objectone.controller;

import com.objectone.dto.Seller;
import com.objectone.dto.response.ProcessDefinitionResponse;
import com.objectone.dto.response.ProcessInstanceResponse;
import com.objectone.service.BusinessFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/business-flow")
public class BusinessFlowController {

    @Autowired
    private BusinessFlowService businessFlowService;

    @PostMapping(value = "/start", consumes = "application/json", produces = "application/json")
    public ResponseEntity<ProcessInstanceResponse> startProcessInstance(@RequestBody Seller seller){
        return new ResponseEntity<>(businessFlowService.startProcessInstance(seller), HttpStatus.OK);
    }

    @GetMapping("/process-definition")
    public ResponseEntity<List<ProcessDefinitionResponse>> getAllProcessDefinitions(){
        return new ResponseEntity<>(businessFlowService.getAllProcessDefinitions(), HttpStatus.OK);
    }

    @GetMapping("/process-instances/{definitionId}")
    public ResponseEntity<List<ProcessInstanceResponse>> getAllRunningProcessInstances(@PathVariable String definitionId){
        return new ResponseEntity<>(businessFlowService.getAllRunningProcessInstances(definitionId), HttpStatus.OK);
    }

    @GetMapping("/process-instances/{instanceId}/diagram")
    public ResponseEntity getDiagramForProcessInstance(@PathVariable String instanceId){
        return new ResponseEntity(businessFlowService.getDiagramForProcessInstance(instanceId), HttpStatus.OK);
    }

    @GetMapping("/history/process-instances/{definitionId}")
    public ResponseEntity<List<ProcessInstanceResponse>> getAllHistoricProcessInstances(@PathVariable String definitionId){
        return new ResponseEntity<>(businessFlowService.getAllHistoricProcessInstances(definitionId), HttpStatus.OK);
    }
}
