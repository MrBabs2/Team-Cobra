package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzd;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.e0 */
final class C7416e0 implements zzaho<zzbgz> {
    C7416e0() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25559a(Object obj, Map map) {
        zzbgz zzbgz = (zzbgz) obj;
        zzd F = zzbgz.mo25644F();
        if (F != null) {
            F.close();
            return;
        }
        zzd K = zzbgz.mo25648K();
        if (K != null) {
            K.close();
        } else {
            zzbad.m20523d("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
