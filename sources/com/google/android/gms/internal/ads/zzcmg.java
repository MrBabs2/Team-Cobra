package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzcmg implements zzcka<zzbyn, zzaov, zzcla> {

    /* renamed from: a */
    private final Context f20582a;

    /* renamed from: b */
    private final zzbxo f20583b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public zzang f20584c;

    public zzcmg(Context context, zzbxo zzbxo) {
        this.f20582a = context;
        this.f20583b = zzbxo;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo28721a(zzcxu zzcxu, zzcxm zzcxm, zzcjy zzcjy) throws RemoteException, zzcmw {
        if (zzcxu.f21162a.f21156a.f21170g.contains(Integer.toString(6))) {
            zzbyt a = zzbyt.m22094a(this.f20584c);
            if (zzcxu.f21162a.f21156a.f21170g.contains(Integer.toString(a.mo28547n()))) {
                zzbyw a2 = this.f20583b.mo26807a(new zzbpr(zzcxu, zzcxm, zzcjy.f20302a), new zzbzf(a), new zzcag((zzand) null, (zzana) null, this.f20584c));
                ((zzcla) zzcjy.f20304c).mo28728a((zzamv) a2.mo25592f());
                return a2.mo25593g();
            }
            throw new zzcmw("No corresponding native ad listener", 0);
        }
        throw new zzcmw("Unified must be used for RTB.", 1);
    }

    /* renamed from: b */
    public final void mo28722b(zzcxu zzcxu, zzcxm zzcxm, zzcjy<zzaov, zzcla> zzcjy) throws RemoteException {
        ((zzaov) zzcjy.f20303b).mo27524a(zzcxm.f21112K, zzcxm.f21135s.toString(), zzcxu.f21162a.f21156a.f21167d, ObjectWrapper.m16391a(this.f20582a), (zzaop) new C7736ml(this, zzcjy), (zzamv) zzcjy.f20304c);
    }
}
