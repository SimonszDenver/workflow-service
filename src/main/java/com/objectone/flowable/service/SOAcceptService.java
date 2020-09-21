package com.objectone.flowable.service;

import lombok.extern.slf4j.Slf4j;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

import java.util.logging.Logger;

public class SOAcceptService implements JavaDelegate {
    Logger logger = Logger.getLogger(SOAcceptService.class.getName());
    @Override
    public void execute(DelegateExecution delegateExecution) {
        logger.info("SO Accept Service");
    }
}
