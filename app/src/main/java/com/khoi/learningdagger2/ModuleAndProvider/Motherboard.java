package com.khoi.learningdagger2.ModuleAndProvider;

import android.util.Log;

import javax.inject.Inject;

//Third Party Library
public class Motherboard {
    //we dont own this class so we cant annotate it with @Inject

    private static final String TAG = "Laptop";
    private RandomAccessMemory randomAccessMemory;
    private Processor processor;


    public  Motherboard(RandomAccessMemory randomAccessMemory,Processor processor){
        this.processor = processor;
        this.randomAccessMemory = randomAccessMemory;
        Log.d(TAG, "Motherboard running");
    }
}
