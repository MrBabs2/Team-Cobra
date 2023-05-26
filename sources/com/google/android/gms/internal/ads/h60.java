package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

final class h60 extends j60<zzasw> {

    /* renamed from: b */
    private final /* synthetic */ Context f15357b;

    /* renamed from: c */
    private final /* synthetic */ zzamp f15358c;

    /* renamed from: d */
    private final /* synthetic */ zzyh f15359d;

    h60(zzyh zzyh, Context context, zzamp zzamp) {
        this.f15359d = zzyh;
        this.f15357b = context;
        this.f15358c = zzamp;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo25570a() {
        zzyh.m25653a(this.f15357b, "rewarded_video");
        return new zzabx();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo25572b() throws RemoteException {
        return this.f15359d.f23033e.mo27635a(this.f15357b, this.f15358c);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo25571a(zzzv zzzv) throws RemoteException {
        return zzzv.zza(ObjectWrapper.m16391a(this.f15357b), this.f15358c, 15000000);
    }
}
