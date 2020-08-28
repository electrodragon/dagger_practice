package com.future_tech.daggerpractice;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    @Inject Engine mEngine;
    private Wheels mWheels;

    @Inject
    public Car(Wheels wheels) {
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
