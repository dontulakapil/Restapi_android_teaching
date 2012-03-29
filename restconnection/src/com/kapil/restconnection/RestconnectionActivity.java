package com.kapil.restconnection;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
 
public class RestconnectionActivity extends Activity 
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
 
        TextView textView = (TextView)findViewById(R.id.outputTextView);
 
        RestClient client = new RestClient("http://127.0.0.1:8888/ListenForRestclient.html?gwt.codesvr=127.0.0.1:9997");
        client.AddParam("message", "Hello World");
 
        try
        {
            client.Execute(RequestMethod.GET);
        }
        catch (Exception e)
        {
            textView.setText(e.getMessage());
        }
 
        String response = client.getResponse();
        textView.setText(response);
    }
}