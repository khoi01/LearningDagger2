package com.khoi.learningdagger2.Method;

import javax.inject.Inject;

public class Creature {




    @Inject
    public Creature(){
    }


    //this method called,after constructor get called.
    @Inject
    public void AddLive(Live live){
        live.init();
    }
}
