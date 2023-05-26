package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

@TargetApi(19)
final class e10 extends d10 {

    /* renamed from: j */
    private final AudioTimestamp f15041j = new AudioTimestamp();

    /* renamed from: k */
    private long f15042k;

    /* renamed from: l */
    private long f15043l;

    /* renamed from: m */
    private long f15044m;

    public e10() {
        super((c10) null);
    }

    /* renamed from: a */
    public final void mo25807a(AudioTrack audioTrack, boolean z) {
        super.mo25807a(audioTrack, z);
        this.f15042k = 0;
        this.f15043l = 0;
        this.f15044m = 0;
    }

    /* renamed from: d */
    public final boolean mo25810d() {
        boolean timestamp = this.f14791a.getTimestamp(this.f15041j);
        if (timestamp) {
            long j = this.f15041j.framePosition;
            if (this.f15043l > j) {
                this.f15042k++;
            }
            this.f15043l = j;
            this.f15044m = j + (this.f15042k << 32);
        }
        return timestamp;
    }

    /* renamed from: e */
    public final long mo25811e() {
        return this.f15041j.nanoTime;
    }

    /* renamed from: f */
    public final long mo25812f() {
        return this.f15044m;
    }
}
