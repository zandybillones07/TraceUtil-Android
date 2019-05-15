package com.zandybillones.traceexample;

import android.app.Application;

import com.zandybillones.traceutil.Trace;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Trace.isEnabled(true);
        Trace.setTag("HELLO");
    }


}
