package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

@TargetApi(21)
final class u20 implements s20 {

    /* renamed from: a */
    private final int f16937a;

    /* renamed from: b */
    private MediaCodecInfo[] f16938b;

    public u20(boolean z) {
        this.f16937a = z ? 1 : 0;
    }

    /* renamed from: c */
    private final void m18273c() {
        if (this.f16938b == null) {
            this.f16938b = new MediaCodecList(this.f16937a).getCodecInfos();
        }
    }

    /* renamed from: a */
    public final MediaCodecInfo mo26538a(int i) {
        m18273c();
        return this.f16938b[i];
    }

    /* renamed from: a */
    public final boolean mo26539a() {
        return true;
    }

    /* renamed from: b */
    public final int mo26541b() {
        m18273c();
        return this.f16938b.length;
    }

    /* renamed from: a */
    public final boolean mo26540a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }
}
