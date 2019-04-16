package com.zandybillones.traceutil;

import android.util.Log;

public class Trace {

    private static final String TAG = "MINE";

    public static void show(String message) {
        String className = Thread.currentThread().getStackTrace()[3].getFileName();
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();

        largeLog(className + " " + methodName + " > " + message);

    }




    public static void largeLog(String content) {
        if (content.length() > 4000) {
            Log.d(TAG, "\n" + content.substring(0, 4000));
            largeLog(content.substring(4000));
        } else {
            Log.d(TAG, "\n" + content);
        }
    }

}
