package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bc */
final class C7317bc extends zzcvs {

    /* renamed from: a */
    private zzcwx f14615a;

    /* renamed from: b */
    private zzdtu<zzcvo> f14616b;

    /* renamed from: c */
    private zzdtu<String> f14617c;

    /* renamed from: d */
    private zzdtu<zzcvy> f14618d;

    /* renamed from: e */
    private zzdtu<zzcwc> f14619e;

    /* renamed from: f */
    private zzdtu<zzcwj> f14620f;

    /* renamed from: g */
    private zzdtu<Boolean> f14621g;

    /* renamed from: h */
    private zzdtu<ApplicationInfo> f14622h;

    /* renamed from: i */
    private zzdtu<zzcwq> f14623i;

    /* renamed from: j */
    private zzdtu<zzcwu> f14624j;

    /* renamed from: k */
    private zzdtu<zzcxh> f14625k;

    /* renamed from: l */
    private zzdtu<String> f14626l;

    /* renamed from: m */
    private zzdtu<zzcez> f14627m;

    /* renamed from: n */
    private zzdtu<zzcez> f14628n;

    /* renamed from: o */
    private zzdtu<zzcez> f14629o;

    /* renamed from: p */
    private zzdtu<zzcez> f14630p;

    /* renamed from: q */
    private zzdtu<Map<zzczs, zzcez>> f14631q;

    /* renamed from: r */
    private zzdtu<Set<zzbuz<zzczz>>> f14632r;

    /* renamed from: s */
    private zzdtu<Set<zzbuz<zzczz>>> f14633s;

    /* renamed from: t */
    private zzdtu f14634t;

    /* renamed from: u */
    private zzdtu<zzczt> f14635u;

    /* renamed from: v */
    private final /* synthetic */ zzbkc f14636v;

    private C7317bc(zzbkc zzbkc, zzcwx zzcwx) {
        this.f14636v = zzbkc;
        this.f14615a = zzcwx;
        this.f14616b = new zzcvr(zzbln.m21332a(), this.f14636v.f19089i, this.f14636v.f19085e, zzcyx.m23130a());
        this.f14617c = new zzcwy(zzcwx);
        this.f14618d = new zzcwa(zzbjy.m21232a(), this.f14636v.f19089i, this.f14617c, zzcyx.m23130a());
        this.f14619e = new zzcwe(zzblj.m21324a(), zzcyx.m23130a(), this.f14636v.f19089i);
        this.f14620f = new zzcwl(zzblk.m21326a(), zzcyx.m23130a(), this.f14617c);
        this.f14621g = new zzcxa(zzcwx);
        this.f14622h = new zzcwz(zzcwx);
        this.f14623i = new zzcws(zzbll.m21328a(), this.f14636v.f19085e, this.f14621g, this.f14622h);
        this.f14624j = new zzcww(zzblm.m21330a(), this.f14636v.f19085e, this.f14636v.f19089i);
        this.f14625k = new zzcxj(zzcyx.m23130a());
        this.f14626l = new zzcxb(zzcwx);
        this.f14627m = zzdth.m24229a(zzcet.m22448a());
        this.f14628n = zzdth.m24229a(zzces.m22447a());
        this.f14629o = zzdth.m24229a(zzceu.m22449a());
        this.f14630p = zzdth.m24229a(zzcev.m22450a());
        zzdtm a = zzdtk.m24232a(4);
        a.mo29228a(zzczs.GMS_SIGNALS, this.f14627m);
        a.mo29228a(zzczs.BUILD_URL, this.f14628n);
        a.mo29228a(zzczs.HTTP, this.f14629o);
        a.mo29228a(zzczs.PRE_PROCESS, this.f14630p);
        this.f14631q = a.mo29227a();
        this.f14632r = zzdth.m24229a(new zzcew(this.f14626l, this.f14636v.f19089i, zzcyx.m23130a(), this.f14631q));
        zzdts a2 = zzdtq.m24242a(0, 1);
        a2.mo29234b(this.f14632r);
        zzdtq a3 = a2.mo29232a();
        this.f14633s = a3;
        this.f14634t = zzdab.m23182a(a3);
        this.f14635u = zzdth.m24229a(zzdaa.m23181a(zzcyx.m23130a(), this.f14636v.f19085e, this.f14634t));
    }

    /* renamed from: d */
    private final zzcwn m16636d() {
        zzach a = zzbli.m21323a();
        zzbbl b = zzcyx.m23131b();
        List<String> e = this.f14615a.mo28809e();
        zzdto.m24236a(e, "Cannot return null from a non-@Nullable @Provides method");
        return new zzcwn(a, b, e);
    }

    /* renamed from: e */
    private final zzcvu m16637e() {
        zzawi b = zzbln.m21333b();
        zzbbl b2 = zzcyx.m23131b();
        String b3 = this.f14615a.mo28806b();
        zzdto.m24236a(b3, "Cannot return null from a non-@Nullable @Provides method");
        return new zzcvu(b, b2, b3, this.f14615a.mo28807c());
    }

    /* renamed from: a */
    public final zzcvb<JSONObject> mo25729a() {
        zzbbl b = zzcyx.m23131b();
        zzdtp a = zzdtp.m24238a(11);
        zzctz zzctz = new zzctz(new zzcwj(zzblk.m21327b(), zzcyx.m23131b(), zzcwy.m23051a(this.f14615a)), 0, (ScheduledExecutorService) this.f14636v.f19085e.get());
        zzdto.m24236a(zzctz, "Cannot return null from a non-@Nullable @Provides method");
        a.mo29229a(zzctz);
        zzctz zzctz2 = new zzctz(new zzcwq(zzbll.m21329b(), (ScheduledExecutorService) this.f14636v.f19085e.get(), this.f14615a.mo28808d(), zzcwz.m23052a(this.f14615a)), ((Long) zzyt.m25670e().mo27163a(zzacu.f17819L1)).longValue(), (ScheduledExecutorService) this.f14636v.f19085e.get());
        zzdto.m24236a(zzctz2, "Cannot return null from a non-@Nullable @Provides method");
        a.mo29229a(zzctz2);
        zzctz zzctz3 = new zzctz(new zzcwu(zzblm.m21331b(), (ScheduledExecutorService) this.f14636v.f19085e.get(), zzbjq.m21230a(this.f14636v.f19082b)), ((Long) zzyt.m25670e().mo27163a(zzacu.f17835P1)).longValue(), (ScheduledExecutorService) this.f14636v.f19085e.get());
        zzdto.m24236a(zzctz3, "Cannot return null from a non-@Nullable @Provides method");
        a.mo29229a(zzctz3);
        zzctz zzctz4 = new zzctz(new zzcvo(zzbln.m21333b(), zzbjq.m21230a(this.f14636v.f19082b), (ScheduledExecutorService) this.f14636v.f19085e.get(), zzcyx.m23131b()), 0, (ScheduledExecutorService) this.f14636v.f19085e.get());
        zzdto.m24236a(zzctz4, "Cannot return null from a non-@Nullable @Provides method");
        a.mo29229a(zzctz4);
        zzctz zzctz5 = new zzctz(new zzcxh(zzcyx.m23131b()), 0, (ScheduledExecutorService) this.f14636v.f19085e.get());
        zzdto.m24236a(zzctz5, "Cannot return null from a non-@Nullable @Provides method");
        a.mo29229a(zzctz5);
        a.mo29229a(zzcxe.m23053a());
        a.mo29229a(new zzcvy((zzasc) null, zzbjq.m21230a(this.f14636v.f19082b), zzcwy.m23051a(this.f14615a), zzcyx.m23131b()));
        a.mo29229a(new zzcwc(zzblj.m21325b(), zzcyx.m23131b(), zzbjq.m21230a(this.f14636v.f19082b)));
        a.mo29229a(m16636d());
        a.mo29229a(m16637e());
        a.mo29229a((zzcva) this.f14636v.f19097q.get());
        return new zzcvb<>(b, a.mo29231a());
    }

    /* renamed from: b */
    public final zzcvb<JSONObject> mo25730b() {
        return zzcxf.m23054a(this.f14636v.f19097q.get(), m16637e(), m16636d(), zzdth.m24230b(this.f14616b), zzdth.m24230b(this.f14618d), zzdth.m24230b(this.f14619e), zzdth.m24230b(this.f14620f), zzdth.m24230b(this.f14623i), zzdth.m24230b(this.f14624j), zzdth.m24230b(this.f14625k), zzcyx.m23131b());
    }

    /* renamed from: c */
    public final zzczt mo25731c() {
        return this.f14635u.get();
    }
}
