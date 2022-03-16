package com.example.workflow.service;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class ProcessCredentialsDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) {
        String name = (String) delegateExecution.getVariable("credentials_name");
        String email = (String) delegateExecution.getVariable("credentials_email");
        String series = (String) delegateExecution.getVariable("credentials_passport_series");
        log.info("Saving credentials {}, {}, {}",name,email,series);
    }
}
