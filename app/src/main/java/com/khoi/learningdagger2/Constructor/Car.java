package com.khoi.learningdagger2.Constructor;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";
    Engine engine;
    Wheel wheel;

    @Inject
    Car(Engine engine,Wheel wheel){
        this.engine = engine;
        this.wheel = wheel;

    }

    public void driver(){
        Log.d(TAG, "zfoom zfoom ");
    }
}
