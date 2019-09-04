package org.camunda.bpm.simpledemo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.logging.Logger;

public class ProcessStarted implements JavaDelegate {

    private final Logger LOGGER = Logger.getLogger(ProcessStarted.class.getName());

    public void execute(DelegateExecution execution) throws Exception {

        LOGGER.info("Process Started");

    }
}