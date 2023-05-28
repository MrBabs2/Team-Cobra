package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;

public final class zzacc extends zzaav {

    /* renamed from: f */
    private final VideoController.VideoLifecycleCallbacks f17754f;

    public zzacc(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.f17754f = videoLifecycleCallbacks;
    }

    /* renamed from: b */
    public final void mo26939b(boolean z) {
        this.f17754f.onVideoMute(z);
    }

    public final void onVideoPause() {
        this.f17754f.onVideoPause();
    }

    public final void onVideoPlay() {
        this.f17754f.onVideoPlay();
    }

    public final void onVideoStart() {
        this.f17754f.onVideoStart();
    }

    /* renamed from: x */
    public final void mo26943x() {
        this.f17754f.onVideoEnd();
    }
}
