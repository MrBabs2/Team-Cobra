package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

final class z50 extends j60<zzzk> {

    /* renamed from: b */
    private final /* synthetic */ Context f17553b;

    /* renamed from: c */
    private final /* synthetic */ zzyd f17554c;

    /* renamed from: d */
    private final /* synthetic */ String f17555d;

    /* renamed from: e */
    private final /* synthetic */ zzamp f17556e;

    /* renamed from: f */
    private final /* synthetic */ zzyh f17557f;

    z50(zzyh zzyh, Context context, zzyd zzyd, String str, zzamp zzamp) {
        this.f17557f = zzyh;
        this.f17553b = context;
        this.f17554c = zzyd;
        this.f17555d = str;
        this.f17556e = zzamp;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo25570a() {
        zzyh.m25653a(this.f17553b, "banner");
        return new zzabp();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo25572b() throws RemoteException {
        return this.f17557f.f23029a.mo29902a(this.f17553b, this.f17554c, this.f17555d, this.f17556e, 1);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo25571a(zzzv zzzv) throws RemoteException {
        return zzzv.zza(ObjectWrapper.m16391a(this.f17553b), this.f17554c, this.f17555d, this.f17556e, 15000000);
    }
}
