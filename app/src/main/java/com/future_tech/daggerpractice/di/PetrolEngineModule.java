package com.future_tech.daggerpractice.di;

import com.future_tech.daggerpractice.car.Engine;
import com.future_tech.daggerpractice.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
