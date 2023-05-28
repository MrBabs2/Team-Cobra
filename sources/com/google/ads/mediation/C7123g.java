package com.google.ads.mediation;

import com.google.android.gms.ads.reward.AdMetadataListener;

/* renamed from: com.google.ads.mediation.g */
final class C7123g extends AdMetadataListener {

    /* renamed from: a */
    private final /* synthetic */ AbstractAdViewAdapter f13398a;

    C7123g(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.f13398a = abstractAdViewAdapter;
    }

    public final void onAdMetadataChanged() {
        if (this.f13398a.zzmh != null && this.f13398a.zzmi != null) {
            this.f13398a.zzmi.zzb(this.f13398a.zzmh.getAdMetadata());
        }
    }
}
