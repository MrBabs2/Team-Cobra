package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import java.util.Map;

@zzard
public final class zzapt {

    /* renamed from: a */
    private final zzbgz f18276a;

    /* renamed from: b */
    private final boolean f18277b;

    /* renamed from: c */
    private final String f18278c;

    public zzapt(zzbgz zzbgz, Map<String, String> map) {
        this.f18276a = zzbgz;
        this.f18278c = map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            this.f18277b = Boolean.parseBoolean(map.get("allowOrientationChange"));
        } else {
            this.f18277b = true;
        }
    }

    /* renamed from: a */
    public final void mo27545a() {
        int i;
        if (this.f18276a == null) {
            zzbad.m20523d("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(this.f18278c)) {
            zzk.zzli();
            i = 7;
        } else if ("landscape".equalsIgnoreCase(this.f18278c)) {
            zzk.zzli();
            i = 6;
        } else if (this.f18277b) {
            i = -1;
        } else {
            i = zzk.zzli().mo27809a();
        }
        this.f18276a.setRequestedOrientation(i);
    }
}
