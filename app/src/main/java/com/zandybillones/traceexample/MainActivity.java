package com.zandybillones.traceexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zandybillones.traceutil.Trace;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Trace.show("Hello World!!!");
    }
}
