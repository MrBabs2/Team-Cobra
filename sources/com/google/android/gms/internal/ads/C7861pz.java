package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* renamed from: com.google.android.gms.internal.ads.pz */
class C7861pz {

    /* renamed from: a */
    protected AudioTrack f16617a;

    /* renamed from: b */
    private boolean f16618b;

    /* renamed from: c */
    private int f16619c;

    /* renamed from: d */
    private long f16620d;

    /* renamed from: e */
    private long f16621e;

    /* renamed from: f */
    private long f16622f;

    private C7861pz() {
    }

    /* renamed from: a */
    public void mo26447a(AudioTrack audioTrack, boolean z) {
        this.f16617a = audioTrack;
        this.f16618b = z;
        this.f16620d = 0;
        this.f16621e = 0;
        this.f16622f = 0;
        if (audioTrack != null) {
            this.f16619c = audioTrack.getSampleRate();
        }
    }

    /* renamed from: b */
    public final long mo26449b() {
        long playbackHeadPosition = ((long) this.f16617a.getPlaybackHeadPosition()) & 4294967295L;
        if (zzkq.f22154a <= 22 && this.f16618b) {
            if (this.f16617a.getPlayState() == 1) {
                this.f16620d = playbackHeadPosition;
            } else if (this.f16617a.getPlayState() == 2 && playbackHeadPosition == 0) {
                this.f16622f = this.f16620d;
            }
            playbackHeadPosition += this.f16622f;
        }
        if (this.f16620d > playbackHeadPosition) {
            this.f16621e++;
        }
        this.f16620d = playbackHeadPosition;
        return playbackHeadPosition + (this.f16621e << 32);
    }

    /* renamed from: c */
    public final long mo26450c() {
        return (mo26449b() * 1000000) / ((long) this.f16619c);
    }

    /* renamed from: d */
    public boolean mo26451d() {
        return false;
    }

    /* renamed from: e */
    public long mo26452e() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public long mo26453f() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ C7861pz(C7824oz ozVar) {
        this();
    }

    /* renamed from: a */
    public final boolean mo26448a() {
        return zzkq.f22154a <= 22 && this.f16618b && this.f16617a.getPlayState() == 2 && this.f16617a.getPlaybackHeadPosition() == 0;
    }
}
