package com.example.pqj647.xmladapterexample.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pqj647 on 7/29/2015.
 */
public class Window implements IWindow{

    private boolean dynamic;
    private String delay;
    private List<Controller> controllerList;

    public Window () {
        controllerList = new ArrayList<Controller>();
    }

    public boolean isDynamic() {
        return dynamic;
    }

    public String getDelay() {
        return delay;
    }

    public void setDynamic(boolean dynamic) {
        this.dynamic = dynamic;
    }

    public void setDelay(String delay) {
        this.delay = delay;
    }

    public void setControllerList(List<Controller> controllerList) {
        this.controllerList = controllerList;
    }
}
