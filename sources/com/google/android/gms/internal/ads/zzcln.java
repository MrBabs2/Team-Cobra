package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzcln implements zzcka<zzbvx, zzams, zzcla> {

    /* renamed from: a */
    private final Context f20561a;

    /* renamed from: b */
    private final zzbws f20562b;

    /* renamed from: c */
    private final zzbai f20563c;

    public zzcln(Context context, zzbai zzbai, zzbws zzbws) {
        this.f20561a = context;
        this.f20563c = zzbai;
        this.f20562b = zzbws;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo28721a(zzcxu zzcxu, zzcxm zzcxm, zzcjy zzcjy) throws RemoteException, zzcmw {
        zzbvy a = this.f20562b.mo26025a(new zzbpr(zzcxu, zzcxm, zzcjy.f20302a), new zzbvz(new C7326bl(zzcjy)));
        ((zzcla) zzcjy.f20304c).mo28728a((zzamv) a.mo25592f());
        return a.mo26081h();
    }

    /* renamed from: b */
    public final void mo28722b(zzcxu zzcxu, zzcxm zzcxm, zzcjy<zzams, zzcla> zzcjy) throws RemoteException {
        if (this.f20563c.f18744h < 4100000) {
            ((zzams) zzcjy.f20303b).mo27415b(ObjectWrapper.m16391a(this.f20561a), zzcxu.f21162a.f21156a.f21167d, zzcxm.f21135s.toString(), (zzamv) zzcjy.f20304c);
        } else {
            ((zzams) zzcjy.f20303b).mo27409a(ObjectWrapper.m16391a(this.f20561a), zzcxu.f21162a.f21156a.f21167d, zzcxm.f21135s.toString(), zzazc.m20425a((zzazf) zzcxm.f21132p), (zzamv) zzcjy.f20304c);
        }
    }
}
