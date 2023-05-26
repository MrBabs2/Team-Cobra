package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class zzczl<O> {

    /* renamed from: a */
    private final E f21241a;

    /* renamed from: b */
    private final String f21242b;

    /* renamed from: c */
    private final zzbbh<?> f21243c;

    /* renamed from: d */
    private final List<zzbbh<?>> f21244d;

    /* renamed from: e */
    private final zzbbh<O> f21245e;

    /* renamed from: f */
    final /* synthetic */ zzczf f21246f;

    private zzczl(zzczf zzczf, E e, String str, zzbbh<?> zzbbh, List<zzbbh<?>> list, zzbbh<O> zzbbh2) {
        this.f21246f = zzczf;
        this.f21241a = e;
        this.f21242b = str;
        this.f21243c = zzbbh;
        this.f21244d = list;
        this.f21245e = zzbbh2;
    }

    /* renamed from: a */
    public final zzczl<O> mo28864a(String str) {
        return new zzczl(this.f21246f, this.f21241a, str, this.f21243c, this.f21244d, this.f21245e);
    }

    /* renamed from: a */
    public final <O2> zzczl<O2> mo28860a(zzczc<O, O2> zzczc) {
        return mo28858a(new C7515gq(zzczc));
    }

    /* renamed from: a */
    public final <O2> zzczl<O2> mo28858a(zzbal<O, O2> zzbal) {
        return m23151a(zzbal, (Executor) this.f21246f.f21233a);
    }

    /* renamed from: a */
    private final <O2> zzczl<O2> m23151a(zzbal<O, O2> zzbal, Executor executor) {
        return new zzczl(this.f21246f, this.f21241a, this.f21242b, this.f21243c, this.f21244d, zzbar.m20542a(this.f21245e, zzbal, executor));
    }

    /* renamed from: a */
    public final <O2> zzczl<O2> mo28859a(zzbbh<O2> zzbbh) {
        return m23151a(new C7552hq(zzbbh), zzbbm.f18749b);
    }

    /* synthetic */ zzczl(zzczf zzczf, Object obj, String str, zzbbh zzbbh, List list, zzbbh zzbbh2, C7405dq dqVar) {
        this(zzczf, obj, (String) null, zzbbh, list, zzbbh2);
    }

    /* renamed from: a */
    public final <T extends Throwable> zzczl<O> mo28862a(Class<T> cls, zzczc<T, O> zzczc) {
        return mo28861a(cls, new C7589iq(zzczc));
    }

    /* renamed from: a */
    public final <T extends Throwable> zzczl<O> mo28861a(Class<T> cls, zzbal<T, O> zzbal) {
        zzczf zzczf = this.f21246f;
        return new zzczl(zzczf, this.f21241a, this.f21242b, this.f21243c, this.f21244d, zzbar.m20544a(this.f21245e, cls, zzbal, (Executor) zzczf.f21233a));
    }

    /* renamed from: a */
    public final zzczl<O> mo28857a(long j, TimeUnit timeUnit) {
        zzczf zzczf = this.f21246f;
        return new zzczl(zzczf, this.f21241a, this.f21242b, this.f21243c, this.f21244d, zzbar.m20541a(this.f21245e, j, timeUnit, zzczf.f21234b));
    }

    /* renamed from: a */
    public final zzcze<E, O> mo28856a() {
        E e = this.f21241a;
        String str = this.f21242b;
        if (str == null) {
            str = this.f21246f.mo28851b(e);
        }
        zzcze<E, O> zzcze = new zzcze<>(e, str, this.f21245e);
        this.f21246f.f21235c.mo26217c(zzcze);
        this.f21243c.mo25573b(new C7630jq(this, zzcze), zzbbm.f18749b);
        zzbar.m20546a(zzcze, new C7667kq(this, zzcze), zzbbm.f18749b);
        return zzcze;
    }

    /* renamed from: a */
    public final zzczl<O> mo28863a(E e) {
        return this.f21246f.mo28850a(e, mo28856a());
    }
}
