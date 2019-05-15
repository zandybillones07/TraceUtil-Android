package com.zandybillones.traceutil;

import android.util.Log;

public class Trace {

    private boolean isEnabled = true;
    private String tag = "MINE";

    private static volatile Trace instance = new Trace();

    private Trace() {}

    public static Trace getInstance() {
        return instance;
    }

    public static void show(String message) {
        String className = Thread.currentThread().getStackTrace()[3].getFileName();
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();

        if (getInstance().isEnabled) {
            getInstance().largeLog(className + " " + methodName + " > " + message);
        }
    }




    public void largeLog(String content) {
        String tag = getInstance().tag;
        if (content.length() > 4000) {
            Log.d(tag, "\n" + content.substring(0, 4000));
            largeLog(content.substring(4000));
        } else {
            Log.d(tag, "\n" + content);
        }
    }

    public static void isEnabled(boolean isEnabled) {
        getInstance().isEnabled = isEnabled;
    }

    public static void setTag(String tagName) {
        getInstance().tag = tagName;
    }


}
