package com.future_tech.daggerpractice.car;

import javax.inject.Inject;

public class Wheels {
    //we don't own this class so we can't annotate it with @Inject

    private Rims mRims;
    private Tires mTires;

    @Inject
    public Wheels(Rims rims, Tires tires) {
        mRims = rims;
        mTires = tires;
    }
}
