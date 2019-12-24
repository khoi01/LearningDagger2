package com.khoi.learningdagger2.Field;

import com.khoi.learningdagger2.MainActivity;

import dagger.Component;

@Component
public interface RobotComponent {

    void inject(MainActivity mainActivity);
}
