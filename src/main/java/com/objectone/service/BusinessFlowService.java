package com.objectone.service;

import com.objectone.dto.Seller;
import com.objectone.dto.response.ProcessDefinitionResponse;
import com.objectone.dto.response.ProcessInstanceResponse;

import java.util.List;

public interface BusinessFlowService {
    ProcessInstanceResponse startProcessInstance(Seller seller);

    List<ProcessDefinitionResponse> getAllProcessDefinitions();

    List<ProcessInstanceResponse> getAllRunningProcessInstances(String definitionId);

    Object getDiagramForProcessInstance(String instanceId);

    List<ProcessInstanceResponse> getAllHistoricProcessInstances(String definitionId);
}
