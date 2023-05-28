package com.airbnb.epoxy;

import android.os.Handler;

public abstract class AsyncEpoxyController extends C5607n {
    public AsyncEpoxyController() {
        this(true);
    }

    private static Handler getHandler(boolean z) {
        return z ? C5605m.m10648a() : C5605m.f9885a;
    }

    public AsyncEpoxyController(boolean z) {
        this(z, z);
    }

    public AsyncEpoxyController(boolean z, boolean z2) {
        super(getHandler(z), getHandler(z2));
    }
}
