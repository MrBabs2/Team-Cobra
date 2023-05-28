package com.google.android.gms.common.api;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;

public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    @KeepForSdk
    /* renamed from: a */
    public final void mo24971a(R r) {
        Status status = r.getStatus();
        if (status.mo24986q()) {
            mo24972b(r);
            return;
        }
        mo24967a(status);
        if (r instanceof Releasable) {
            try {
                ((Releasable) r).mo24917a();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(r);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("ResultCallbacks", sb.toString(), e);
            }
        }
    }

    /* renamed from: a */
    public abstract void mo24967a(Status status);

    /* renamed from: b */
    public abstract void mo24972b(R r);
}
