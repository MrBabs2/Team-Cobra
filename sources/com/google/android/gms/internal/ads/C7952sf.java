package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.sf */
final class C7952sf implements zzaho<Object> {

    /* renamed from: a */
    private WeakReference<zzbxx> f16847a;

    private C7952sf(zzbxx zzbxx) {
        this.f16847a = new WeakReference<>(zzbxx);
    }

    /* renamed from: a */
    public final void mo25559a(Object obj, Map<String, String> map) {
        zzbxx zzbxx = (zzbxx) this.f16847a.get();
        if (zzbxx != null) {
            zzbxx.f19626g.mo28408w();
        }
    }
}
