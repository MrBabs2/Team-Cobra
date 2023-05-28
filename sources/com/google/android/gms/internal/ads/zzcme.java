package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzcme implements zzcka<zzbyn, zzams, zzcla> {

    /* renamed from: a */
    private final Context f20578a;

    /* renamed from: b */
    private final zzbxo f20579b;

    public zzcme(Context context, zzbxo zzbxo) {
        this.f20578a = context;
        this.f20579b = zzbxo;
    }

    /* renamed from: a */
    private static boolean m22691a(zzcxu zzcxu, int i) {
        return zzcxu.f21162a.f21156a.f21170g.contains(Integer.toString(i));
    }

    /* renamed from: b */
    public final void mo28722b(zzcxu zzcxu, zzcxm zzcxm, zzcjy<zzams, zzcla> zzcjy) throws RemoteException {
        zzcxv zzcxv = zzcxu.f21162a.f21156a;
        ((zzams) zzcjy.f20303b).mo27410a(ObjectWrapper.m16391a(this.f20578a), zzcxu.f21162a.f21156a.f21167d, zzcxm.f21135s.toString(), zzazc.m20425a((zzazf) zzcxm.f21132p), (zzamv) zzcjy.f20304c, zzcxv.f21172i, zzcxv.f21170g);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo28721a(zzcxu zzcxu, zzcxm zzcxm, zzcjy zzcjy) throws RemoteException, zzcmw {
        zzbyt zzbyt;
        zzana n1 = ((zzams) zzcjy.f20303b).mo27423n1();
        zzand c1 = ((zzams) zzcjy.f20303b).mo27416c1();
        zzang U = ((zzams) zzcjy.f20303b).mo27404U();
        if (U != null && m22691a(zzcxu, 6)) {
            zzbyt = zzbyt.m22094a(U);
        } else if (n1 != null && m22691a(zzcxu, 6)) {
            zzbyt = zzbyt.m22096b(n1);
        } else if (n1 != null && m22691a(zzcxu, 2)) {
            zzbyt = zzbyt.m22092a(n1);
        } else if (c1 != null && m22691a(zzcxu, 6)) {
            zzbyt = zzbyt.m22097b(c1);
        } else if (c1 == null || !m22691a(zzcxu, 1)) {
            throw new zzcmw("No native ad mappers", 0);
        } else {
            zzbyt = zzbyt.m22093a(c1);
        }
        if (zzcxu.f21162a.f21156a.f21170g.contains(Integer.toString(zzbyt.mo28547n()))) {
            zzbyw a = this.f20579b.mo26807a(new zzbpr(zzcxu, zzcxm, zzcjy.f20302a), new zzbzf(zzbyt), new zzcag(c1, n1, U));
            ((zzcla) zzcjy.f20304c).mo28728a((zzamv) a.mo25592f());
            return a.mo25593g();
        }
        throw new zzcmw("No corresponding native ad listener", 0);
    }
}
