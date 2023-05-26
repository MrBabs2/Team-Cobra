package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzclq implements zzcka<zzbvx, zzaov, zzcla> {

    /* renamed from: a */
    private final Context f20567a;

    /* renamed from: b */
    private final zzbws f20568b;

    public zzclq(Context context, zzbws zzbws) {
        this.f20567a = context;
        this.f20568b = zzbws;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo28721a(zzcxu zzcxu, zzcxm zzcxm, zzcjy zzcjy) throws RemoteException, zzcmw {
        zzcjx zzcjx = new zzcjx(zzcxm);
        zzbvy a = this.f20568b.mo26025a(new zzbpr(zzcxu, zzcxm, zzcjy.f20302a), new zzbvz(new C7363cl(zzcjy, zzcjx)));
        zzcjx.mo28719a(a.mo25590d());
        ((zzcla) zzcjy.f20304c).mo28728a((zzamv) a.mo25592f());
        return a.mo26081h();
    }

    /* renamed from: b */
    public final void mo28722b(zzcxu zzcxu, zzcxm zzcxm, zzcjy<zzaov, zzcla> zzcjy) throws RemoteException {
        ((zzaov) zzcjy.f20303b).mo27523a(zzcxm.f21112K, zzcxm.f21135s.toString(), zzcxu.f21162a.f21156a.f21167d, ObjectWrapper.m16391a(this.f20567a), (zzaom) new C7437el(this, zzcjy), (zzamv) zzcjy.f20304c);
    }
}
