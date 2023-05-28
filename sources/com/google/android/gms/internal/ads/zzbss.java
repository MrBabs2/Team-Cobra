package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.reward.AdMetadataListener;
import java.util.Set;

public final class zzbss extends zzbts<AdMetadataListener> implements zzagv {

    /* renamed from: g */
    private Bundle f19457g = new Bundle();

    public zzbss(Set<zzbuz<AdMetadataListener>> set) {
        super(set);
    }

    /* renamed from: a */
    public final synchronized void mo26408a(String str, Bundle bundle) {
        this.f19457g.putAll(bundle);
        mo28426a(C7503ge.f15305a);
    }

    /* renamed from: w */
    public final synchronized Bundle mo28420w() {
        return new Bundle(this.f19457g);
    }
}
