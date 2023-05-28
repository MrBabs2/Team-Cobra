package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

final class d60 extends j60<zzzf> {

    /* renamed from: b */
    private final /* synthetic */ Context f14820b;

    /* renamed from: c */
    private final /* synthetic */ String f14821c;

    /* renamed from: d */
    private final /* synthetic */ zzamp f14822d;

    /* renamed from: e */
    private final /* synthetic */ zzyh f14823e;

    d60(zzyh zzyh, Context context, String str, zzamp zzamp) {
        this.f14823e = zzyh;
        this.f14820b = context;
        this.f14821c = str;
        this.f14822d = zzamp;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo25570a() {
        zzyh.m25653a(this.f14820b, "native_ad");
        return new zzabl();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo25572b() throws RemoteException {
        return this.f14823e.f23030b.mo29901a(this.f14820b, this.f14821c, this.f14822d);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo25571a(zzzv zzzv) throws RemoteException {
        return zzzv.zza(ObjectWrapper.m16391a(this.f14820b), this.f14821c, this.f14822d, 15000000);
    }
}
