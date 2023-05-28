package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.os.Handler;

@TargetApi(23)
final class v30 implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a */
    private final /* synthetic */ zzth f17001a;

    private v30(zzth zzth, MediaCodec mediaCodec) {
        this.f17001a = zzth;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        zzth zzth = this.f17001a;
        if (this == zzth.f22721y0) {
            zzth.mo29760z();
        }
    }
}
