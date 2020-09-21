package com.objectone.service;

import com.objectone.dto.Seller;
import com.objectone.dto.response.ProcessInstanceResponse;
import com.objectone.util.Const;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NcellServiceImpl implements NcellService {

    private final RuntimeService runtimeService;

    @Autowired
    public NcellServiceImpl(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }

    @Override
    public ProcessInstanceResponse startProcessInstance(Seller seller) {
        ProcessInstance instance = runtimeService.startProcessInstanceByKey(Const.PROCESS_INSTANCE_KEY, seller.convertToMap());
        return new ProcessInstanceResponse(
            instance.getProcessInstanceId(),
            instance.getStartTime(),
            instance.isEnded()
        );
    }
}
