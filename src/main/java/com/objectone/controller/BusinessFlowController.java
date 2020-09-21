package com.objectone.controller;

import com.objectone.dto.Seller;
import com.objectone.dto.response.ProcessInstanceResponse;
import com.objectone.service.NcellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ncell")
public class NcellController {

    @Autowired
    private NcellService ncellService;

    @PostMapping(value = "/start", consumes = "application/json", produces = "application/json")
    public ResponseEntity<ProcessInstanceResponse> startProcessInstance(@RequestBody Seller seller){
        return new ResponseEntity<>(ncellService.startProcessInstance(seller), HttpStatus.OK);
    }

    /* Class - BusinessFlowController */
    /*
    * Running Instances
    * Diagrams
    *
    * Definition
    */
}
