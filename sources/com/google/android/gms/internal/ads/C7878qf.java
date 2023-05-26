package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.qf */
final class C7878qf implements zzaho<Object> {

    /* renamed from: a */
    private WeakReference<zzbxx> f16659a;

    private C7878qf(zzbxx zzbxx) {
        this.f16659a = new WeakReference<>(zzbxx);
    }

    /* renamed from: a */
    public final void mo25559a(Object obj, Map<String, String> map) {
        zzbxx zzbxx = (zzbxx) this.f16659a.get();
        if (zzbxx != null && "_ac".equals(map.get("eventName"))) {
            zzbxx.f19627h.onAdClicked();
        }
    }
}
