package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: com.google.android.gms.internal.ads.jz */
final class C7639jz implements C7602iz {
    private C7639jz() {
    }

    /* renamed from: a */
    public final MediaCodecInfo mo26105a(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    /* renamed from: a */
    public final boolean mo26106a() {
        return false;
    }

    /* renamed from: b */
    public final int mo26108b() {
        return MediaCodecList.getCodecCount();
    }

    /* renamed from: a */
    public final boolean mo26107a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }
}
