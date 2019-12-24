package com.khoi.learningdagger2.ModuleAndProvider;

import android.util.Log;

import javax.inject.Inject;

public class HardDisk {

    private static final String TAG = "Laptop";
    @Inject
    public  HardDisk(){
        Log.d(TAG, "HardDisk Running");
    }
}
