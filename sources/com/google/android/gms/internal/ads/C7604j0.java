package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.j0 */
final class C7604j0 implements zzaho<zzbgz> {
    C7604j0() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25559a(Object obj, Map map) {
        zzbgz zzbgz = (zzbgz) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzbgz.zzlc();
        } else if ("resume".equals(str)) {
            zzbgz.zzld();
        }
    }
}
