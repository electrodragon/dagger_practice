package com.future_tech.daggerpractice.di;

import com.future_tech.daggerpractice.car.DieselEngine;
import com.future_tech.daggerpractice.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    private int mHorsePower;

    public DieselEngineModule(int horsePower) {
        mHorsePower = horsePower;
    }

    @Provides
    Engine provideEngine() {
        return new DieselEngine(mHorsePower);
    }
}
