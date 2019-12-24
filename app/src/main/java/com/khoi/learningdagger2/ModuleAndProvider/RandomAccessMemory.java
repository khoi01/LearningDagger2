package com.khoi.learningdagger2.ModuleAndProvider;

import android.util.Log;

import javax.inject.Inject;

//Third Party Library
public class RandomAccessMemory {
    private static final String TAG = "Laptop";
    public RandomAccessMemory(){
        
    }
    
    public void Process(){
        Log.d(TAG, "Random Access Memory Running ");
    }
}
