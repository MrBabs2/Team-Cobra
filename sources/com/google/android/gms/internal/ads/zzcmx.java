package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzcmx<AdT> implements zzbal<zzcxu, AdT> {

    /* renamed from: a */
    private final zzczt f20625a;

    /* renamed from: b */
    private final zzbrm f20626b;

    /* renamed from: c */
    private final zzdae f20627c;

    /* renamed from: d */
    private final Executor f20628d;

    /* renamed from: e */
    private final ScheduledExecutorService f20629e;

    /* renamed from: f */
    private final zzbpe<AdT> f20630f;

    /* renamed from: g */
    private final zzcmu f20631g;

    public zzcmx(zzczt zzczt, zzcmu zzcmu, zzbrm zzbrm, zzdae zzdae, zzbpe<AdT> zzbpe, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f20625a = zzczt;
        this.f20631g = zzcmu;
        this.f20626b = zzbrm;
        this.f20627c = zzdae;
        this.f20630f = zzbpe;
        this.f20628d = executor;
        this.f20629e = scheduledExecutorService;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzbbh mo28743a(zzcxm zzcxm, zzcjv zzcjv, zzcxu zzcxu, Throwable th) throws Exception {
        zzcmu zzcmu = this.f20631g;
        zzbbh a = zzbar.m20541a(zzcjv.mo28716a(zzcxu, zzcxm), (long) zzcxm.f21110I, TimeUnit.MILLISECONDS, this.f20629e);
        zzcmu.mo28741a(zzcxm, a);
        return a;
    }

    public final /* synthetic */ zzbbh zzf(Object obj) throws Exception {
        zzcxu zzcxu = (zzcxu) obj;
        zzcze<E, I> a = this.f20625a.mo28849a(zzczs.RENDER_CONFIG_INIT).mo28853a(zzbar.m20538a((Throwable) new zzcmw("No ad configs", 3))).mo28856a();
        this.f20626b.mo28428a(new zzbmd(zzcxu, this.f20627c), this.f20628d);
        int i = 0;
        for (zzcxm next : zzcxu.f21163b.f21157a) {
            Iterator<String> it = next.f21117a.iterator();
            while (true) {
                if (it.hasNext()) {
                    String next2 = it.next();
                    zzcjv<AdT> a2 = this.f20630f.mo26320a(next.f21118b, next2);
                    if (a2 != null && a2.mo28717b(zzcxu, next)) {
                        zzczl<I> a3 = this.f20625a.mo28850a(zzczs.RENDER_CONFIG_WATERFALL, a);
                        StringBuilder sb = new StringBuilder(String.valueOf(next2).length() + 26);
                        sb.append("render-config-");
                        sb.append(i);
                        sb.append("-");
                        sb.append(next2);
                        a = a3.mo28864a(sb.toString()).mo28861a(Throwable.class, new C7810ol(this, next, a2, zzcxu)).mo28856a();
                        break;
                    }
                } else {
                    break;
                }
            }
            i++;
        }
        return a;
    }
}
