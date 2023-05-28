package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.mg */
final /* synthetic */ class C7731mg implements Callable {

    /* renamed from: f */
    private final zzcaq f16233f;

    /* renamed from: g */
    private final zzbbh f16234g;

    /* renamed from: h */
    private final zzbbh f16235h;

    /* renamed from: i */
    private final zzbbh f16236i;

    /* renamed from: j */
    private final zzbbh f16237j;

    /* renamed from: k */
    private final zzbbh f16238k;

    /* renamed from: l */
    private final JSONObject f16239l;

    /* renamed from: m */
    private final zzbbh f16240m;

    /* renamed from: n */
    private final zzbbh f16241n;

    /* renamed from: o */
    private final zzbbh f16242o;

    C7731mg(zzcaq zzcaq, zzbbh zzbbh, zzbbh zzbbh2, zzbbh zzbbh3, zzbbh zzbbh4, zzbbh zzbbh5, JSONObject jSONObject, zzbbh zzbbh6, zzbbh zzbbh7, zzbbh zzbbh8) {
        this.f16233f = zzcaq;
        this.f16234g = zzbbh;
        this.f16235h = zzbbh2;
        this.f16236i = zzbbh3;
        this.f16237j = zzbbh4;
        this.f16238k = zzbbh5;
        this.f16239l = jSONObject;
        this.f16240m = zzbbh6;
        this.f16241n = zzbbh7;
        this.f16242o = zzbbh8;
    }

    public final Object call() {
        zzbbh zzbbh = this.f16234g;
        zzbbh zzbbh2 = this.f16235h;
        zzbbh zzbbh3 = this.f16236i;
        zzbbh zzbbh4 = this.f16237j;
        zzbbh zzbbh5 = this.f16238k;
        JSONObject jSONObject = this.f16239l;
        zzbbh zzbbh6 = this.f16240m;
        zzbbh zzbbh7 = this.f16241n;
        zzbbh zzbbh8 = this.f16242o;
        zzbyt zzbyt = (zzbyt) zzbbh.get();
        zzbyt.mo28531a((List<zzadw>) (List) zzbbh2.get());
        zzbyt.mo28526a((zzaei) zzbbh3.get());
        zzbyt.mo28533b((zzaei) zzbbh4.get());
        zzbyt.mo28525a((zzaea) zzbbh5.get());
        zzbyt.mo28535b(zzcau.m22287b(jSONObject));
        zzbyt.mo28524a(zzcau.m22288c(jSONObject));
        zzbgz zzbgz = (zzbgz) zzbbh6.get();
        if (zzbgz != null) {
            zzbyt.mo28527a(zzbgz);
            zzbyt.mo28521a(zzbgz.getView());
            zzbyt.mo28523a((zzaar) zzbgz.mo25685e());
        }
        zzbgz zzbgz2 = (zzbgz) zzbbh7.get();
        if (zzbgz2 != null) {
            zzbyt.mo28534b(zzbgz2);
        }
        for (zzcbg zzcbg : (List) zzbbh8.get()) {
            int i = zzcbg.f19894a;
            if (i == 1) {
                zzbyt.mo28530a(zzcbg.f19895b, zzcbg.f19896c);
            } else if (i == 2) {
                zzbyt.mo28529a(zzcbg.f19895b, zzcbg.f19897d);
            }
        }
        return zzbyt;
    }
}
