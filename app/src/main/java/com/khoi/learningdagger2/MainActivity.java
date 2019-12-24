package com.khoi.learningdagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.khoi.learningdagger2.Constructor.Car;
import com.khoi.learningdagger2.Constructor.CarComponent;
import com.khoi.learningdagger2.Constructor.DaggerCarComponent;
import com.khoi.learningdagger2.Field.DaggerRobotComponent;
import com.khoi.learningdagger2.Field.Robot;
import com.khoi.learningdagger2.Field.RobotComponent;
import com.khoi.learningdagger2.Method.Creature;
import com.khoi.learningdagger2.Method.CreatureComponent;
import com.khoi.learningdagger2.Method.DaggerCreatureComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject Robot robot;
    private Car car;
    private Creature creature;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        applyConstructorInjection();
        applyFieldInjection();
        applyMethodInjection();
    }


    public void applyConstructorInjection(){

        CarComponent component = DaggerCarComponent.create();
        car = component.InitCar();
        car.driver();
    }

    public void applyFieldInjection(){
        RobotComponent component = DaggerRobotComponent.create();
        component.inject(this);
        robot.move();
    }


    public void applyMethodInjection(){
        CreatureComponent component = DaggerCreatureComponent.create();
        creature = component.Init();
    }




}
