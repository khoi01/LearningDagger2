package com.khoi.learningdagger2.ModuleAndProvider;

import com.khoi.learningdagger2.ModuleAndProvider.module.MotherboardModule;

import dagger.Component;

@Component(modules = MotherboardModule.class)
public interface LaptopComponent {

    Laptop Init();
}
