package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

public final class zzctv implements zzcuz<Bundle> {

    /* renamed from: a */
    private final String f20944a;

    public zzctv(String str) {
        this.f20944a = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static boolean m22980a(Set<String> set) {
        return set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner");
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25833a(Object obj) {
        zzcxz.m23105a((Bundle) obj, "omid_v", this.f20944a);
    }
}
