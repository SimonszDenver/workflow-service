package com.objectone.flowable.service;

import lombok.extern.slf4j.Slf4j;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

import java.util.logging.Logger;

public class SORejectService implements JavaDelegate {

    Logger logger = Logger.getLogger(SORejectService.class.getName());

    @Override
    public void execute(DelegateExecution delegateExecution) {
        logger.info("SO Reject Service");
    }
}
