package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* renamed from: com.google.android.gms.internal.ads.oz */
final class C7824oz extends Thread {

    /* renamed from: f */
    private final /* synthetic */ AudioTrack f16517f;

    /* renamed from: g */
    private final /* synthetic */ zzhq f16518g;

    C7824oz(zzhq zzhq, AudioTrack audioTrack) {
        this.f16518g = zzhq;
        this.f16517f = audioTrack;
    }

    public final void run() {
        try {
            this.f16517f.release();
        } finally {
            this.f16518g.f21971a.open();
        }
    }
}
