package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;

class d10 {

    /* renamed from: a */
    protected AudioTrack f14791a;

    /* renamed from: b */
    private boolean f14792b;

    /* renamed from: c */
    private int f14793c;

    /* renamed from: d */
    private long f14794d;

    /* renamed from: e */
    private long f14795e;

    /* renamed from: f */
    private long f14796f;

    /* renamed from: g */
    private long f14797g;

    /* renamed from: h */
    private long f14798h;

    /* renamed from: i */
    private long f14799i;

    private d10() {
    }

    /* renamed from: a */
    public void mo25807a(AudioTrack audioTrack, boolean z) {
        this.f14791a = audioTrack;
        this.f14792b = z;
        this.f14797g = -9223372036854775807L;
        this.f14794d = 0;
        this.f14795e = 0;
        this.f14796f = 0;
        if (audioTrack != null) {
            this.f14793c = audioTrack.getSampleRate();
        }
    }

    /* renamed from: b */
    public final long mo25808b() {
        return (mo25809c() * 1000000) / ((long) this.f14793c);
    }

    /* renamed from: c */
    public final long mo25809c() {
        if (this.f14797g != -9223372036854775807L) {
            return Math.min(this.f14799i, this.f14798h + ((((SystemClock.elapsedRealtime() * 1000) - this.f14797g) * ((long) this.f14793c)) / 1000000));
        }
        int playState = this.f14791a.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) this.f14791a.getPlaybackHeadPosition());
        if (this.f14792b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f14796f = this.f14794d;
            }
            playbackHeadPosition += this.f14796f;
        }
        if (this.f14794d > playbackHeadPosition) {
            this.f14795e++;
        }
        this.f14794d = playbackHeadPosition;
        return playbackHeadPosition + (this.f14795e << 32);
    }

    /* renamed from: d */
    public boolean mo25810d() {
        return false;
    }

    /* renamed from: e */
    public long mo25811e() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public long mo25812f() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ d10(c10 c10) {
        this();
    }

    /* renamed from: a */
    public final void mo25806a(long j) {
        this.f14798h = mo25809c();
        this.f14797g = SystemClock.elapsedRealtime() * 1000;
        this.f14799i = j;
        this.f14791a.stop();
    }

    /* renamed from: a */
    public final void mo25805a() {
        if (this.f14797g == -9223372036854775807L) {
            this.f14791a.pause();
        }
    }
}
