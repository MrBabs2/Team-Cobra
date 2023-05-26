package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzcnd implements zzcka<zzcdb, zzaov, zzcla> {

    /* renamed from: a */
    private final Context f20645a;

    /* renamed from: b */
    private final zzcdf f20646b;

    public zzcnd(Context context, zzcdf zzcdf) {
        this.f20645a = context;
        this.f20646b = zzcdf;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo28721a(zzcxu zzcxu, zzcxm zzcxm, zzcjy zzcjy) throws RemoteException, zzcmw {
        zzcjx zzcjx = new zzcjx(zzcxm);
        zzcdc a = this.f20646b.mo26174a(new zzbpr(zzcxu, zzcxm, zzcjy.f20302a), new zzcdd(new C7921rl(zzcjy, zzcjx)));
        zzcjx.mo28719a(a.mo25590d());
        ((zzcla) zzcjy.f20304c).mo28728a((zzamv) a.mo26210l());
        return a.mo26208j();
    }

    /* renamed from: b */
    public final void mo28722b(zzcxu zzcxu, zzcxm zzcxm, zzcjy<zzaov, zzcla> zzcjy) throws RemoteException {
        ((zzaov) zzcjy.f20303b).mo27525a(zzcxm.f21112K, zzcxm.f21135s.toString(), zzcxu.f21162a.f21156a.f21167d, ObjectWrapper.m16391a(this.f20645a), (zzaos) new C7995tl(this, zzcjy), (zzamv) zzcjy.f20304c);
    }
}
