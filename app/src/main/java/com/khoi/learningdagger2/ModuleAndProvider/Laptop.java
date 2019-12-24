package com.khoi.learningdagger2.ModuleAndProvider;

import android.util.Log;

import javax.inject.Inject;

public class Laptop {

    private static final String TAG = "Laptop";
    private HardDisk hardDisk;
    private Motherboard motherboard;

    @Inject
    Laptop(HardDisk hardDisk,Motherboard motherboard){
        this.hardDisk = hardDisk;
        this.motherboard = motherboard;
        Log.d(TAG, "Laptop running.");
    }
}
