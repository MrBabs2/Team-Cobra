package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbqy;
import com.google.android.gms.internal.ads.zzbtv;
import com.google.android.gms.internal.ads.zzcqt;

public final class zzcqq extends zzawb {

    /* renamed from: f */
    private zzbjm f20819f;

    public zzcqq(zzbjm zzbjm) {
        this.f20819f = zzbjm;
    }

    /* renamed from: a */
    public final void mo27709a(IObjectWrapper iObjectWrapper, zzawc zzawc, zzavy zzavy) {
        String str = zzawc.f18569f;
        String str2 = zzawc.f18570g;
        zzyd zzyd = zzawc.f18571h;
        zzcqp j = this.f20819f.mo28233j();
        zzbqy.zza zza = new zzbqy.zza();
        zza.mo28402a((Context) ObjectWrapper.m16390H(iObjectWrapper));
        zzcxx zzcxx = new zzcxx();
        zzcxx.mo28825a(str);
        zzcxx.mo28822a(new zzya().mo29906a());
        zzcxx.mo28823a(zzyd);
        zza.mo28404a(zzcxx.mo28832c());
        zzcqp a = j.mo26238a(zza.mo28406a());
        zzcqt.zza zza2 = new zzcqt.zza();
        zza2.mo28780a(str2);
        zzcqp a2 = a.mo26239a(new zzcqt(zza2));
        new zzbtv.zza().mo28448a();
        zzbar.m20546a(a2.mo26237a().mo26319a(), new C7664kn(this, zzavy), this.f20819f.mo28224a());
    }
}
