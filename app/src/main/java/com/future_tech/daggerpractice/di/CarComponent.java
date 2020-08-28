package com.future_tech.daggerpractice.di;

import com.future_tech.daggerpractice.MainActivity;
import com.future_tech.daggerpractice.car.Car;

import dagger.Component;

@Component (modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {
    Car purchaseCar();
    void inject(MainActivity mainActivity);
}
