package com.khoi.learningdagger2.Method;

import android.util.Log;

import javax.inject.Inject;

public class Live {

    private static final String TAG = "Live";
    @Inject
    public Live(){

    }

    public void init() {
        Log.d(TAG, "live adding to creature");
    }
}
