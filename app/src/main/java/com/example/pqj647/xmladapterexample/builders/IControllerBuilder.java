package com.example.pqj647.xmladapterexample.builders;

import com.example.pqj647.xmladapterexample.models.IBasicModel;

/**
 * Created by pqj647 on 7/30/2015.
 */
public interface IControllerBuilder extends IBuilder {
    public void processAutomationId(String automationId);
    public void processMonitoring(String monitoring);
    public void processCheck(String check);
}
