package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

public final class zzcci implements zzaho<Object> {

    /* renamed from: a */
    private final zzafo f19953a;

    /* renamed from: b */
    private final zzccj f19954b;

    /* renamed from: c */
    private final zzdte<zzccd> f19955c;

    public zzcci(zzbzc zzbzc, zzbyt zzbyt, zzccj zzccj, zzdte<zzccd> zzdte) {
        this.f19953a = zzbzc.mo28567b(zzbyt.mo28538e());
        this.f19954b = zzccj;
        this.f19955c = zzdte;
    }

    /* renamed from: a */
    public final void mo28640a() {
        if (this.f19953a != null) {
            this.f19954b.mo28645a("/nativeAdCustomClick", (zzaho<Object>) this);
        }
    }

    /* renamed from: a */
    public final void mo25559a(Object obj, Map<String, String> map) {
        String str = map.get("asset");
        try {
            this.f19953a.mo27263a(this.f19955c.get(), str);
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            zzbad.m20522c(sb.toString(), e);
        }
    }
}
