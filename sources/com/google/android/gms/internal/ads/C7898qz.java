package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

@TargetApi(19)
/* renamed from: com.google.android.gms.internal.ads.qz */
final class C7898qz extends C7861pz {

    /* renamed from: g */
    private final AudioTimestamp f16692g = new AudioTimestamp();

    /* renamed from: h */
    private long f16693h;

    /* renamed from: i */
    private long f16694i;

    /* renamed from: j */
    private long f16695j;

    public C7898qz() {
        super((C7824oz) null);
    }

    /* renamed from: a */
    public final void mo26447a(AudioTrack audioTrack, boolean z) {
        super.mo26447a(audioTrack, z);
        this.f16693h = 0;
        this.f16694i = 0;
        this.f16695j = 0;
    }

    /* renamed from: d */
    public final boolean mo26451d() {
        boolean timestamp = this.f16617a.getTimestamp(this.f16692g);
        if (timestamp) {
            long j = this.f16692g.framePosition;
            if (this.f16694i > j) {
                this.f16693h++;
            }
            this.f16694i = j;
            this.f16695j = j + (this.f16693h << 32);
        }
        return timestamp;
    }

    /* renamed from: e */
    public final long mo26452e() {
        return this.f16692g.nanoTime;
    }

    /* renamed from: f */
    public final long mo26453f() {
        return this.f16695j;
    }
}
