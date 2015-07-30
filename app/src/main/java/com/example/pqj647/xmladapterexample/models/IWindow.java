package com.example.pqj647.xmladapterexample.models;

import java.util.List;

/**
 * Created by pqj647 on 7/29/2015.
 */
public interface IWindow extends IBasicModel {
    public boolean isDynamic();
    public String getDelay();
    public void setDynamic(boolean dynamic);
    public void setDelay(String delay);
    public void setControllerList(List<Controller> controllerList);
}
