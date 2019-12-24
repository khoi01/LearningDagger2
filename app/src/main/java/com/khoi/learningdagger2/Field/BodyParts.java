package com.khoi.learningdagger2.Field;

import android.util.Log;

import javax.inject.Inject;

public class BodyParts {
    private static final String TAG = "BodyParts";

    @Inject
    BodyParts(){

    }

    public void init(){
        Log.d(TAG, " gear assemble! ");
    }
}
