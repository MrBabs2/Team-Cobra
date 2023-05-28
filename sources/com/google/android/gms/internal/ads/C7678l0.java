package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.l0 */
final class C7678l0 implements zzaho<zzbgz> {
    C7678l0() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25559a(Object obj, Map map) {
        zzbgz zzbgz = (zzbgz) obj;
        if (map.keySet().contains("start")) {
            zzbgz.mo25680c(true);
        }
        if (map.keySet().contains("stop")) {
            zzbgz.mo25680c(false);
        }
    }
}
