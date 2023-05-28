package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

final class a60 extends j60<zzaqg> {

    /* renamed from: b */
    private final /* synthetic */ Activity f14408b;

    /* renamed from: c */
    private final /* synthetic */ zzyh f14409c;

    a60(zzyh zzyh, Activity activity) {
        this.f14409c = zzyh;
        this.f14408b = activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo25570a() {
        zzyh.m25653a(this.f14408b, "ad_overlay");
        return null;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo25572b() throws RemoteException {
        return this.f14409c.f23034f.mo27567a(this.f14408b);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo25571a(zzzv zzzv) throws RemoteException {
        return zzzv.zzf(ObjectWrapper.m16391a(this.f14408b));
    }
}
