package com.example.pqj647.xmladapterexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.pqj647.xmladapterexample.models.IWindow;
import com.example.pqj647.xmladapterexample.xml.AbstractXMLAdapter;
import com.example.pqj647.xmladapterexample.xml.ExpatPullParserAdapter;


public class MainActivity extends ActionBarActivity {

    private final String xml = "<Window dynamic=\"true\" delay=\"10\">" +
            "            <controller automationId=\"Settings1\" monitoring=\"false\" check=\"existance\">   </controller>" +
            "            <controller automationId=\"Settings2\" monitoring=\"true\" check=\"existance\">   </controller>" +
            "        </Window>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        AbstractXMLAdapter adapter = new ExpatPullParserAdapter();
        IWindow window = adapter.parseXML(xml);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
