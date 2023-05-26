package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class zzcgn {

    /* renamed from: a */
    private final zzbbl f20159a;

    /* renamed from: b */
    private final zzbbl f20160b;

    /* renamed from: c */
    private final zzchv f20161c;

    /* renamed from: d */
    private final zzdte<zzcig> f20162d;

    public zzcgn(zzbbl zzbbl, zzbbl zzbbl2, zzchv zzchv, zzdte<zzcig> zzdte) {
        this.f20159a = zzbbl;
        this.f20160b = zzbbl2;
        this.f20161c = zzchv;
        this.f20162d = zzdte;
    }

    /* renamed from: a */
    public final zzbbh<InputStream> mo28689a(zzarx zzarx) {
        zzbbh zzbbh;
        String str = zzarx.f18441i;
        zzk.zzlg();
        if (zzaxi.m20301e(str)) {
            zzbbh = zzbar.m20538a((Throwable) new zzcie(0));
        } else {
            if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17804H2)).booleanValue()) {
                zzbbh = zzbar.m20544a(this.f20159a.mo27892a(new C7955si(this, zzarx)), ExecutionException.class, C7992ti.f16907a, (Executor) this.f20160b);
            } else {
                zzbbh = this.f20161c.mo28697a(zzarx);
            }
        }
        zzbbh<InputStream> a = zzbar.m20544a(zzbbh, zzcie.class, new C8029ui(this, zzarx), (Executor) this.f20160b);
        if (!((Boolean) zzyt.m25670e().mo27163a(zzacu.f17804H2)).booleanValue()) {
            a.mo25573b(new C8066vi(zzbbh), zzbbm.f18749b);
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ InputStream mo28691b(zzarx zzarx) throws Exception {
        return (InputStream) this.f20161c.mo28697a(zzarx).get((long) ((Integer) zzyt.m25670e().mo27163a(zzacu.f17800G2)).intValue(), TimeUnit.SECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzbbh mo28690a(zzarx zzarx, zzcie zzcie) throws Exception {
        return this.f20162d.get().mo28700a(zzarx);
    }
}
