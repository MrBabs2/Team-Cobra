package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzckm implements zzcka<zzbnf, zzaov, zzcla> {

    /* renamed from: a */
    private final Context f20323a;

    /* renamed from: b */
    private final zzboc f20324b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public View f20325c;

    public zzckm(Context context, zzboc zzboc) {
        this.f20323a = context;
        this.f20324b = zzboc;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo28721a(zzcxu zzcxu, zzcxm zzcxm, zzcjy zzcjy) throws RemoteException, zzcmw {
        zzboc zzboc = this.f20324b;
        zzbpr zzbpr = new zzbpr(zzcxu, zzcxm, zzcjy.f20302a);
        View view = this.f20325c;
        zzaov zzaov = (zzaov) zzcjy.f20303b;
        zzaov.getClass();
        zzbng a = zzboc.mo25824a(zzbpr, new zzbnk(view, (zzbgz) null, C7735mk.m17568a(zzaov), zzcxm.f21134r.get(0)));
        a.mo25869i().mo28454a(this.f20325c);
        ((zzcla) zzcjy.f20304c).mo28728a((zzamv) a.mo25592f());
        return a.mo25867g();
    }

    /* renamed from: b */
    public final void mo28722b(zzcxu zzcxu, zzcxm zzcxm, zzcjy<zzaov, zzcla> zzcjy) throws RemoteException {
        ((zzaov) zzcjy.f20303b).mo27522a(zzcxm.f21112K, zzcxm.f21135s.toString(), zzcxu.f21162a.f21156a.f21167d, ObjectWrapper.m16391a(this.f20323a), new C7809ok(this, zzcjy), (zzamv) zzcjy.f20304c, zzcxu.f21162a.f21156a.f21168e);
    }
}
