package com.future_tech.daggerpractice;

import dagger.Component;

@Component (modules = WheelsModule.class)
public interface CarComponent {
    Car purchaseCar();
    void inject(MainActivity mainActivity);
}
