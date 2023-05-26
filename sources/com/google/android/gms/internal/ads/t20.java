package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

final class t20 implements s20 {
    private t20() {
    }

    /* renamed from: a */
    public final MediaCodecInfo mo26538a(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    /* renamed from: a */
    public final boolean mo26539a() {
        return false;
    }

    /* renamed from: b */
    public final int mo26541b() {
        return MediaCodecList.getCodecCount();
    }

    /* renamed from: a */
    public final boolean mo26540a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }
}
