package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

@TargetApi(14)
@zzard
public final class zzbcy {

    /* renamed from: a */
    private final long f18796a = TimeUnit.MILLISECONDS.toNanos(((Long) zzyt.m25670e().mo27163a(zzacu.f17773A)).longValue());

    /* renamed from: b */
    private long f18797b;

    /* renamed from: c */
    private boolean f18798c = true;

    zzbcy() {
    }

    /* renamed from: a */
    public final void mo27965a() {
        this.f18798c = true;
    }

    /* renamed from: a */
    public final void mo27966a(SurfaceTexture surfaceTexture, zzbcn zzbcn) {
        if (zzbcn != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (this.f18798c || Math.abs(timestamp - this.f18797b) >= this.f18796a) {
                this.f18798c = false;
                this.f18797b = timestamp;
                zzaxi.f18651h.post(new C7313b8(this, zzbcn));
            }
        }
    }
}
