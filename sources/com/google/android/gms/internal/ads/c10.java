package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

final class c10 extends Thread {

    /* renamed from: f */
    private final /* synthetic */ AudioTrack f14691f;

    /* renamed from: g */
    private final /* synthetic */ zzmh f14692g;

    c10(zzmh zzmh, AudioTrack audioTrack) {
        this.f14692g = zzmh;
        this.f14691f = audioTrack;
    }

    public final void run() {
        try {
            this.f14691f.flush();
            this.f14691f.release();
        } finally {
            this.f14692g.f22270f.open();
        }
    }
}
