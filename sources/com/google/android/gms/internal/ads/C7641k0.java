package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.k0 */
final class C7641k0 implements zzaho<zzbgz> {
    C7641k0() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25559a(Object obj, Map map) {
        zzbgz zzbgz = (zzbgz) obj;
        if (map.keySet().contains("start")) {
            zzbgz.mo25697k().mo28140c();
        } else if (map.keySet().contains("stop")) {
            zzbgz.mo25697k().mo28142d();
        } else if (map.keySet().contains("cancel")) {
            zzbgz.mo25697k().mo28143e();
        }
    }
}
