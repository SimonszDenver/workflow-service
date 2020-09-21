package com.objectone.service;

import com.objectone.dto.Seller;
import com.objectone.dto.response.ProcessDefinitionResponse;
import com.objectone.dto.response.ProcessInstanceResponse;
import com.objectone.util.Const;
import org.flowable.engine.HistoryService;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.history.HistoricProcessInstance;
import org.flowable.engine.repository.ProcessDefinition;
import org.flowable.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BusinessFlowServiceImpl implements BusinessFlowService {

    private final RuntimeService runtimeService;

    private final RepositoryService repositoryService;

    private final HistoryService historyService;

    @Autowired
    public BusinessFlowServiceImpl(RuntimeService runtimeService, RepositoryService repositoryService, HistoryService historyService) {
        this.runtimeService = runtimeService;
        this.repositoryService = repositoryService;
        this.historyService = historyService;
    }

    @Override
    public ProcessInstanceResponse startProcessInstance(Seller seller) {
        ProcessInstance instance = runtimeService.startProcessInstanceByKey(Const.PROCESS_INSTANCE_KEY, seller.convertToMap());
        return new ProcessInstanceResponse(
            instance.getProcessInstanceId(),
            instance.getStartTime(),
            instance.isEnded(),
            null
        );
    }

    @Override
    public List<ProcessDefinitionResponse> getAllProcessDefinitions() {
        List<ProcessDefinition> processDefinitionsList = repositoryService.createProcessDefinitionQuery().list();
        return processDefinitionsList.stream().map(pd -> new ProcessDefinitionResponse(pd.getId(), pd.getName(), pd.getKey(), pd.getVersion())).collect(Collectors.toList());
    }

    @Override
    public List<ProcessInstanceResponse> getAllRunningProcessInstances(String definitionId) {
        List<ProcessInstance> processInstanceList = runtimeService.createProcessInstanceQuery().processDefinitionId(definitionId).list();
        return processInstanceList.stream().map(pi -> new ProcessInstanceResponse(pi.getProcessInstanceId(), pi.getStartTime(), pi.isEnded(), null)).collect(Collectors.toList());
    }

    @Override
    public Object getDiagramForProcessInstance(String instanceId) {
//        ProcessInstance processInstance = runtimeService.createProcessInstanceQuery().processInstanceId(instanceId).list().get(0);
//        repositoryService.getProcessDiagram()
        return null;
    }

    @Override
    public List<ProcessInstanceResponse> getAllHistoricProcessInstances(String definitionId) {
        List<HistoricProcessInstance> processInstancesList = historyService.createHistoricProcessInstanceQuery().processDefinitionId(definitionId).list();
        return processInstancesList.stream().map(hpi -> new ProcessInstanceResponse(hpi.getId(), hpi.getStartTime(), true, hpi.getEndTime())).collect(Collectors.toList());
    }
}
