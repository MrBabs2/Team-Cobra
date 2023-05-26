package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

@TargetApi(21)
/* renamed from: com.google.android.gms.internal.ads.kz */
final class C7676kz implements C7602iz {

    /* renamed from: a */
    private final int f16029a;

    /* renamed from: b */
    private MediaCodecInfo[] f16030b;

    public C7676kz(boolean z) {
        this.f16029a = z ? 1 : 0;
    }

    /* renamed from: c */
    private final void m17461c() {
        if (this.f16030b == null) {
            this.f16030b = new MediaCodecList(this.f16029a).getCodecInfos();
        }
    }

    /* renamed from: a */
    public final MediaCodecInfo mo26105a(int i) {
        m17461c();
        return this.f16030b[i];
    }

    /* renamed from: a */
    public final boolean mo26106a() {
        return true;
    }

    /* renamed from: b */
    public final int mo26108b() {
        m17461c();
        return this.f16030b.length;
    }

    /* renamed from: a */
    public final boolean mo26107a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }
}
