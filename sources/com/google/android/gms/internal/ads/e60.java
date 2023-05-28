package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

final class e60 extends j60<zzaab> {

    /* renamed from: b */
    private final /* synthetic */ Context f15069b;

    /* renamed from: c */
    private final /* synthetic */ zzyh f15070c;

    e60(zzyh zzyh, Context context) {
        this.f15070c = zzyh;
        this.f15069b = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo25570a() {
        zzyh.m25653a(this.f15069b, "mobile_ads_settings");
        return new zzabr();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo25572b() throws RemoteException {
        return this.f15070c.f23031c.mo27053b(this.f15069b);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo25571a(zzzv zzzv) throws RemoteException {
        return zzzv.zza(ObjectWrapper.m16391a(this.f15069b), 15000000);
    }
}
