package com.future_tech.daggerpractice;

import android.util.Log;

public class Tires {
    //we don't own this class so we can't annotate it with @Inject

    private static final String TAG = "Tires";

    public void inflate() {
        Log.d(TAG, "Tires inflated");
    }
}
