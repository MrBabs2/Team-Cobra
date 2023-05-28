package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzwl;

public final class zzcel implements zzdti<zzcez> {

    /* renamed from: a */
    private static final zzcel f20069a = new zzcel();

    /* renamed from: a */
    public static zzcel m22440a() {
        return f20069a;
    }

    public final /* synthetic */ Object get() {
        zzcez zzcez = new zzcez(zzwl.zza.zzb.REQUEST_WILL_UPDATE_SIGNALS, zzwl.zza.zzb.REQUEST_DID_UPDATE_SIGNALS, zzwl.zza.zzb.REQUEST_FAILED_TO_UPDATE_SIGNALS);
        zzdto.m24236a(zzcez, "Cannot return null from a non-@Nullable @Provides method");
        return zzcez;
    }
}
