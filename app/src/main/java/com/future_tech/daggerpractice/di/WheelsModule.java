package com.future_tech.daggerpractice.di;

import com.future_tech.daggerpractice.car.Rims;
import com.future_tech.daggerpractice.car.Tires;
import com.future_tech.daggerpractice.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }
}
