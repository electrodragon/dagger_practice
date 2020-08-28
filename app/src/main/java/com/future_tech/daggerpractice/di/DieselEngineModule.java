package com.future_tech.daggerpractice.di;

import com.future_tech.daggerpractice.car.DieselEngine;
import com.future_tech.daggerpractice.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {
    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}
