package com.future_tech.daggerpractice;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    private Engine mEngine;
    private Wheels mWheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        mEngine = engine;
        mWheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        Log.d(TAG, "driving...");
    }

}
