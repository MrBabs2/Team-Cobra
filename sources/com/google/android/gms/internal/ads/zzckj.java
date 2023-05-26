package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzckj implements zzcka<zzbnf, zzams, zzcla> {

    /* renamed from: a */
    private final Context f20317a;

    /* renamed from: b */
    private final zzbai f20318b;

    /* renamed from: c */
    private final zzboc f20319c;

    public zzckj(Context context, zzbai zzbai, zzboc zzboc) {
        this.f20317a = context;
        this.f20318b = zzbai;
        this.f20319c = zzboc;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo28721a(zzcxu zzcxu, zzcxm zzcxm, zzcjy zzcjy) throws RemoteException, zzcmw {
        zzboc zzboc = this.f20319c;
        zzbpr zzbpr = new zzbpr(zzcxu, zzcxm, zzcjy.f20302a);
        zzams zzams = (zzams) zzcjy.f20303b;
        zzams.getClass();
        zzbng a = zzboc.mo25824a(zzbpr, new zzbnk((View) ObjectWrapper.m16390H(((zzams) zzcjy.f20303b).mo27403Q()), (zzbgz) null, C7698lk.m17500a(zzams), zzcxm.f21134r.get(0)));
        a.mo25869i().mo28454a((View) ObjectWrapper.m16390H(((zzams) zzcjy.f20303b).mo27403Q()));
        ((zzcla) zzcjy.f20304c).mo28728a((zzamv) a.mo25592f());
        return a.mo25867g();
    }

    /* renamed from: b */
    public final void mo28722b(zzcxu zzcxu, zzcxm zzcxm, zzcjy<zzams, zzcla> zzcjy) throws RemoteException {
        zzyd a = zzcxy.m23100a(this.f20317a, zzcxm.f21134r);
        if (this.f20318b.f18744h < 4100000) {
            ((zzams) zzcjy.f20303b).mo27411a(ObjectWrapper.m16391a(this.f20317a), a, zzcxu.f21162a.f21156a.f21167d, zzcxm.f21135s.toString(), (zzamv) zzcjy.f20304c);
        } else {
            ((zzams) zzcjy.f20303b).mo27412a(ObjectWrapper.m16391a(this.f20317a), a, zzcxu.f21162a.f21156a.f21167d, zzcxm.f21135s.toString(), zzazc.m20425a((zzazf) zzcxm.f21132p), (zzamv) zzcjy.f20304c);
        }
    }
}
