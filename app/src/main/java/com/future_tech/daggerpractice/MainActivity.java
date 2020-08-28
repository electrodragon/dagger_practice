package com.future_tech.daggerpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.future_tech.daggerpractice.car.Car;
import com.future_tech.daggerpractice.di.CarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car mCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.create();
        carComponent.inject(this);

        mCar.drive();
    }
}