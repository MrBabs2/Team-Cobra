package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONObject;

public final class zzcoc implements zzcjz<zzaov, zzcla> {

    /* renamed from: a */
    private final zzclc f20680a;

    public zzcoc(zzclc zzclc) {
        this.f20680a = zzclc;
    }

    /* renamed from: a */
    public final zzcjy<zzaov, zzcla> mo28720a(String str, JSONObject jSONObject) throws RemoteException {
        zzaov a = this.f20680a.mo28732a(str);
        if (a == null) {
            return null;
        }
        return new zzcjy<>(a, new zzcla(), str);
    }
}
