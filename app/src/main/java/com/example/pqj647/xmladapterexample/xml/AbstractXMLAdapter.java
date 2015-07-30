package com.example.pqj647.xmladapterexample.xml;

import com.example.pqj647.xmladapterexample.models.IController;
import com.example.pqj647.xmladapterexample.models.IWindow;

/**
 * Created by pqj647 on 7/29/2015.
 */
public abstract class AbstractXMLAdapter<T1, T2> {
    protected T1 parser;
    public abstract IWindow parseXML(T2 xmlResource);
    public abstract IWindow processWindowTag() throws Exception;
    public abstract IController processControllerTag() throws Exception;
}
