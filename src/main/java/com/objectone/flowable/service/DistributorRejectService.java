package com.objectone.flowable.service;

import lombok.extern.slf4j.Slf4j;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

import java.util.logging.Logger;

public class DistributorRejectService implements JavaDelegate {
    Logger logger = Logger.getLogger(DistributorRejectService.class.getName());
    @Override
    public void execute(DelegateExecution delegateExecution) {
        logger.info("Distributor Reject Service");
    }
}
