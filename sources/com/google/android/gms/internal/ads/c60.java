package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

final class c60 extends j60<zzzk> {

    /* renamed from: b */
    private final /* synthetic */ Context f14711b;

    /* renamed from: c */
    private final /* synthetic */ zzyd f14712c;

    /* renamed from: d */
    private final /* synthetic */ String f14713d;

    /* renamed from: e */
    private final /* synthetic */ zzamp f14714e;

    /* renamed from: f */
    private final /* synthetic */ zzyh f14715f;

    c60(zzyh zzyh, Context context, zzyd zzyd, String str, zzamp zzamp) {
        this.f14715f = zzyh;
        this.f14711b = context;
        this.f14712c = zzyd;
        this.f14713d = str;
        this.f14714e = zzamp;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo25570a() {
        zzyh.m25653a(this.f14711b, "interstitial");
        return new zzabp();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo25572b() throws RemoteException {
        return this.f14715f.f23029a.mo29902a(this.f14711b, this.f14712c, this.f14713d, this.f14714e, 2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo25571a(zzzv zzzv) throws RemoteException {
        return zzzv.zzb(ObjectWrapper.m16391a(this.f14711b), this.f14712c, this.f14713d, this.f14714e, 15000000);
    }
}
