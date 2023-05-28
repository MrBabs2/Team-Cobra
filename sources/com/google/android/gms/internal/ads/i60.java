package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

final class i60 extends j60<zzatt> {

    /* renamed from: b */
    private final /* synthetic */ Context f15576b;

    /* renamed from: c */
    private final /* synthetic */ String f15577c;

    /* renamed from: d */
    private final /* synthetic */ zzamp f15578d;

    i60(zzyh zzyh, Context context, String str, zzamp zzamp) {
        this.f15576b = context;
        this.f15577c = str;
        this.f15578d = zzamp;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo25570a() {
        zzyh.m25653a(this.f15576b, "rewarded");
        return new zzabv();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo25572b() throws RemoteException {
        return zzauj.m20029a(this.f15576b, this.f15577c, this.f15578d);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo25571a(zzzv zzzv) throws RemoteException {
        return zzzv.zzb(ObjectWrapper.m16391a(this.f15576b), this.f15577c, this.f15578d, 15000000);
    }
}
