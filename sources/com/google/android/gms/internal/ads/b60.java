package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

final class b60 extends j60<zzzk> {

    /* renamed from: b */
    private final /* synthetic */ Context f14555b;

    /* renamed from: c */
    private final /* synthetic */ zzyd f14556c;

    /* renamed from: d */
    private final /* synthetic */ String f14557d;

    /* renamed from: e */
    private final /* synthetic */ zzyh f14558e;

    b60(zzyh zzyh, Context context, zzyd zzyd, String str) {
        this.f14558e = zzyh;
        this.f14555b = context;
        this.f14556c = zzyd;
        this.f14557d = str;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo25570a() {
        zzyh.m25653a(this.f14555b, "search");
        return new zzabp();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo25572b() throws RemoteException {
        return this.f14558e.f23029a.mo29902a(this.f14555b, this.f14556c, this.f14557d, (zzamp) null, 3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo25571a(zzzv zzzv) throws RemoteException {
        return zzzv.zza(ObjectWrapper.m16391a(this.f14555b), this.f14556c, this.f14557d, 15000000);
    }
}
