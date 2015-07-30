package com.example.pqj647.xmladapterexample.models;

/**
 * Created by pqj647 on 7/29/2015.
 */
public interface IController extends IBasicModel{
    public String getAutomationId();

    public boolean isMonitoring();

    public String getCheck();

    public void setAutomationId(String automationId);

    public void setMonitoring(boolean monitoring);

    public void setCheck(String check);
}
