package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

@zzard
public final class zzaya {

    /* renamed from: a */
    private boolean f18661a = false;

    /* renamed from: b */
    private float f18662b = 1.0f;

    /* renamed from: c */
    private final synchronized boolean m20375c() {
        return this.f18662b >= 0.0f;
    }

    /* renamed from: a */
    public final synchronized void mo27829a(float f) {
        this.f18662b = f;
    }

    /* renamed from: b */
    public final synchronized boolean mo27831b() {
        return this.f18661a;
    }

    /* renamed from: a */
    public final synchronized float mo27828a() {
        if (!m20375c()) {
            return 1.0f;
        }
        return this.f18662b;
    }

    /* renamed from: a */
    public final synchronized void mo27830a(boolean z) {
        this.f18661a = z;
    }

    /* renamed from: a */
    public static float m20374a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return ((float) streamVolume) / ((float) streamMaxVolume);
    }
}
