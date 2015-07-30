package com.example.pqj647.xmladapterexample.xml;

import android.util.Xml;

import com.example.pqj647.xmladapterexample.builders.ControllerBuilder;
import com.example.pqj647.xmladapterexample.builders.IControllerBuilder;
import com.example.pqj647.xmladapterexample.builders.IWindowBuilder;
import com.example.pqj647.xmladapterexample.builders.WindowBuilder;
import com.example.pqj647.xmladapterexample.models.IController;
import com.example.pqj647.xmladapterexample.models.IWindow;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pqj647 on 7/29/2015.
 */
public class ExpatPullParserAdapter extends AbstractXMLAdapter<XmlPullParser, String> {

    @Override
    public IWindow parseXML(String xmlResource) {
        try {
            parser = Xml.newPullParser();
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
            parser.setInput(new StringReader(xmlResource));
            parser.nextTag();
            return processWindowTag();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public IWindow processWindowTag() throws Exception {

        List entries = new ArrayList();
        parser.require(XmlPullParser.START_TAG, null, "Window");

        IWindowBuilder windowBuilder = new WindowBuilder();
        windowBuilder.processDelayTag(parser.getAttributeValue(null, "delay"));
        windowBuilder.processDynamicTag(parser.getAttributeValue(null, "dynamic"));

        while (parser.next() != XmlPullParser.END_TAG) {
            if (parser.getEventType() != XmlPullParser.START_TAG) {
                continue;
            }
            String name = parser.getName();
            // Starts by looking for the entry tag
            if (name.equals("controller")) {
                entries.add(processControllerTag());
            } else {
                skip(parser);
            }
        }
        windowBuilder.setControllerList(entries);
        return (IWindow)windowBuilder.getInstace();
    }

    private void skip(XmlPullParser parser) throws XmlPullParserException, IOException {
        if (parser.getEventType() != XmlPullParser.START_TAG) {
            throw new IllegalStateException();
        }
        int depth = 1;
        while (depth != 0) {
            switch (parser.next()) {
                case XmlPullParser.END_TAG:
                    depth--;
                    break;
                case XmlPullParser.START_TAG:
                    depth++;
                    break;
            }
        }
    }

    @Override
    public IController processControllerTag() throws Exception {
        IControllerBuilder builder = new ControllerBuilder();
        builder.processAutomationId(parser.getAttributeValue(null, "automationId"));
        builder.processMonitoring(parser.getAttributeValue(null, "monitoring"));
        builder.processCheck(parser.getAttributeValue(null, "check"));

        while (parser.next() != XmlPullParser.END_TAG) {
            if (parser.getEventType() != XmlPullParser.START_TAG) {
                continue;
            }
        }

        return (IController)builder.getInstace();
    }
}
