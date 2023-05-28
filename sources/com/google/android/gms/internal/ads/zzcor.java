package com.google.android.gms.internal.ads;

public final class zzcor<AdT> implements zzcjv<AdT> {

    /* renamed from: a */
    private final zzado f20713a;

    /* renamed from: b */
    private final zzbbl f20714b;

    /* renamed from: c */
    private final zzczt f20715c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final zzcou<AdT> f20716d;

    public zzcor(zzczt zzczt, zzbbl zzbbl, zzado zzado, zzcou<AdT> zzcou) {
        this.f20715c = zzczt;
        this.f20714b = zzbbl;
        this.f20713a = zzado;
        this.f20716d = zzcou;
    }

    /* renamed from: a */
    public final zzbbh<AdT> mo28716a(zzcxu zzcxu, zzcxm zzcxm) {
        zzbbr zzbbr = new zzbbr();
        zzcoz zzcoz = new zzcoz();
        zzcoz.mo28752a(new C7848pm(this, zzbbr, zzcxu, zzcxm, zzcoz));
        zzcxq zzcxq = zzcxm.f21132p;
        return this.f20715c.mo28849a(zzczs.CUSTOM_RENDER_SYN).mo28854a((zzczd) new C7811om(this, new zzadj(zzcoz, zzcxq.f21153b, zzcxq.f21152a)), this.f20714b).mo28863a(zzczs.CUSTOM_RENDER_ACK).mo28859a(zzbbr).mo28856a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f21132p;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo28717b(com.google.android.gms.internal.ads.zzcxu r1, com.google.android.gms.internal.ads.zzcxm r2) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.zzado r1 = r0.f20713a
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcor.mo28717b(com.google.android.gms.internal.ads.zzcxu, com.google.android.gms.internal.ads.zzcxm):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28749a(zzadj zzadj) throws Exception {
        this.f20713a.mo27192a(zzadj);
    }
}
