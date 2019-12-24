package com.khoi.learningdagger2.Field;

import android.util.Log;

import javax.inject.Inject;

public class Robot {
    private static final String TAG = "Robot";
    @Inject BodyParts bodyParts;
    @Inject Processor processor;

    @Inject
    public Robot(){

    }

    public void move(){
        bodyParts.init();
        Log.d(TAG, "move: ");
    }
}
