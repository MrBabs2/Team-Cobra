package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

public final class zzcok implements zzcjv<zzbnf> {

    /* renamed from: a */
    private final Context f20697a;

    /* renamed from: b */
    private final zzboc f20698b;

    /* renamed from: c */
    private final zzado f20699c;

    /* renamed from: d */
    private final zzbbl f20700d;

    /* renamed from: e */
    private final zzczt f20701e;

    public zzcok(Context context, zzboc zzboc, zzczt zzczt, zzbbl zzbbl, zzado zzado) {
        this.f20697a = context;
        this.f20698b = zzboc;
        this.f20701e = zzczt;
        this.f20700d = zzbbl;
        this.f20699c = zzado;
    }

    /* renamed from: a */
    public final zzbbh<zzbnf> mo28716a(zzcxu zzcxu, zzcxm zzcxm) {
        zzbng a = this.f20698b.mo25824a(new zzbpr(zzcxu, zzcxm, (String) null), (zzbnk) new C7774nm(this, new View(this.f20697a), (zzbgz) null, C7700lm.f16176a, zzcxm.f21134r.get(0)));
        zzcoo j = a.mo25870j();
        zzcxq zzcxq = zzcxm.f21132p;
        return this.f20701e.mo28849a(zzczs.CUSTOM_RENDER_SYN).mo28854a((zzczd) new C7737mm(this, new zzadj(j, zzcxq.f21153b, zzcxq.f21152a)), this.f20700d).mo28863a(zzczs.CUSTOM_RENDER_ACK).mo28859a(zzbar.m20539a(a.mo25867g())).mo28856a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f21132p;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo28717b(com.google.android.gms.internal.ads.zzcxu r1, com.google.android.gms.internal.ads.zzcxm r2) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.zzado r1 = r0.f20699c
            if (r1 == 0) goto L_0x000e
            com.google.android.gms.internal.ads.zzcxq r1 = r2.f21132p
            if (r1 == 0) goto L_0x000e
            java.lang.String r1 = r1.f21152a
            if (r1 == 0) goto L_0x000e
            r1 = 1
            return r1
        L_0x000e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcok.mo28717b(com.google.android.gms.internal.ads.zzcxu, com.google.android.gms.internal.ads.zzcxm):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28748a(zzadj zzadj) throws Exception {
        this.f20699c.mo27192a(zzadj);
    }
}
