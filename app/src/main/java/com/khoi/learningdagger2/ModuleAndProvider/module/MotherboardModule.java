package com.khoi.learningdagger2.ModuleAndProvider.module;

import com.khoi.learningdagger2.ModuleAndProvider.Laptop;
import com.khoi.learningdagger2.ModuleAndProvider.Motherboard;
import com.khoi.learningdagger2.ModuleAndProvider.Processor;
import com.khoi.learningdagger2.ModuleAndProvider.RandomAccessMemory;

import dagger.Module;
import dagger.Provides;

@Module
public class MotherboardModule {

    @Provides
    static Processor ProvideProcessor(){
        return new Processor();
    }

    @Provides
    static RandomAccessMemory randomAccessMemory(){
        RandomAccessMemory randomAccessMemory = new RandomAccessMemory();
        randomAccessMemory.Process();
        return randomAccessMemory;
    }

    @Provides
    static Motherboard providerMotherBoard(Processor processor,RandomAccessMemory randomAccessMemory){
        return new Motherboard(randomAccessMemory,processor);
    }
}
