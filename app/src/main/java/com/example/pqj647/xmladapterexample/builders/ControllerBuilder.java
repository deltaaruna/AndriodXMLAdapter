package com.example.pqj647.xmladapterexample.builders;

import com.example.pqj647.xmladapterexample.models.Controller;
import com.example.pqj647.xmladapterexample.models.IBasicModel;
import com.example.pqj647.xmladapterexample.models.IController;
import com.example.pqj647.xmladapterexample.models.IWindow;

/**
 * Created by pqj647 on 7/30/2015.
 */
public class ControllerBuilder implements IControllerBuilder{
    private IController controller;

    public ControllerBuilder() {
        controller = new Controller();
    }

    @Override
    public IController getInstace() {
        return controller;
    }

    @Override
    public void processAutomationId(String automationId) {
        controller.setAutomationId(automationId);
    }

    @Override
    public void processMonitoring(String monitoring) {
        controller.setMonitoring(Boolean.parseBoolean(monitoring));
    }

    @Override
    public void processCheck(String check) {
        controller.setCheck(check);
    }
}
