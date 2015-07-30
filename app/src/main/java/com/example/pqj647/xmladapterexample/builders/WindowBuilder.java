package com.example.pqj647.xmladapterexample.builders;

import com.example.pqj647.xmladapterexample.models.Controller;
import com.example.pqj647.xmladapterexample.models.IWindow;
import com.example.pqj647.xmladapterexample.models.Window;

import java.util.List;

/**
 * Created by pqj647 on 7/30/2015.
 */
public class WindowBuilder implements IWindowBuilder{
    IWindow window = null;

    public WindowBuilder() {
        window = new Window();
    }
    @Override
    public void processDynamicTag(String dynamic) {
        window.setDynamic(Boolean.parseBoolean(dynamic));
    }

    @Override
    public void processDelayTag(String delay) {
        window.setDelay(delay);
    }

    @Override
    public void setControllerList(List<Controller> list) {
        window.setControllerList(list);
    }

    @Override
    public IWindow getInstace() {
        return window;
    }
}
