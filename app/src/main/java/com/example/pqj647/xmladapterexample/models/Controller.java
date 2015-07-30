package com.example.pqj647.xmladapterexample.models;

/**
 * Created by pqj647 on 7/29/2015.
 */
public class Controller implements IController{
    private String automationId;
    private boolean monitoring;
    private String check;

    public String getAutomationId() {
        return automationId;
    }

    public boolean isMonitoring() {
        return monitoring;
    }

    public String getCheck() {
        return check;
    }

    public void setAutomationId(String automationId) {
        this.automationId = automationId;
    }

    public void setMonitoring(boolean monitoring) {
        this.monitoring = monitoring;
    }

    public void setCheck(String check) {
        this.check = check;
    }
}
