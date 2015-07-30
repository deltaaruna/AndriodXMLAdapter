package com.example.pqj647.xmladapterexample.builders;

import com.example.pqj647.xmladapterexample.models.Controller;

import java.util.List;

/**
 * Created by pqj647 on 7/30/2015.
 */
public interface IWindowBuilder extends IBuilder {
    public void processDynamicTag(String dynamic);
    public void processDelayTag(String dynamic);
    public void setControllerList(List<Controller> list);
}
