package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.IntentSender;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;

public abstract class ResolvingResultCallbacks<R extends Result> extends ResultCallbacks<R> {

    /* renamed from: a */
    private final Activity f13677a;

    /* renamed from: b */
    private final int f13678b;

    @KeepForSdk
    /* renamed from: a */
    public final void mo24967a(Status status) {
        if (status.mo24985p()) {
            try {
                status.mo24980a(this.f13677a, this.f13678b);
            } catch (IntentSender.SendIntentException e) {
                Log.e("ResolvingResultCallback", "Failed to start resolution", e);
                mo24968b(new Status(8));
            }
        } else {
            mo24968b(status);
        }
    }

    /* renamed from: b */
    public abstract void mo24968b(Status status);
}
