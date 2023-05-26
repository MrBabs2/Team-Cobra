package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzclx implements zzclw<zzbyn> {

    /* renamed from: a */
    private final zzbxo f20572a;

    /* renamed from: b */
    private final zzbbl f20573b;

    /* renamed from: c */
    private final zzcaq f20574c;

    public zzclx(zzbxo zzbxo, zzbbl zzbbl, zzcaq zzcaq) {
        this.f20572a = zzbxo;
        this.f20573b = zzbbl;
        this.f20574c = zzcaq;
    }

    /* renamed from: a */
    public final zzbbh<List<zzbbh<zzbyn>>> mo28716a(zzcxu zzcxu, zzcxm zzcxm) {
        zzbbh<zzccj> a = this.f20572a.mo26810d().mo28835a();
        this.f20572a.mo26810d().mo28837a(a);
        return zzbar.m20542a(zzbar.m20542a(a, new C7474fl(this, zzcxm), (Executor) this.f20573b), new C7510gl(this, zzcxu, zzcxm), (Executor) this.f20573b);
    }

    /* renamed from: b */
    public final boolean mo28717b(zzcxu zzcxu, zzcxm zzcxm) {
        zzcxq zzcxq = zzcxm.f21132p;
        return (zzcxq == null || zzcxq.f21154c == null) ? false : true;
    }

    /* renamed from: a */
    private final zzbbh<zzbyn> m22685a(zzcxu zzcxu, zzcxm zzcxm, JSONObject jSONObject) {
        zzbbh<zzccj> a = this.f20572a.mo26810d().mo28835a();
        zzbbh<zzbyt> a2 = this.f20574c.mo28619a(zzcxu, zzcxm, jSONObject);
        return zzbar.m20540a((zzbbh<? extends V>[]) new zzbbh[]{a, a2}).mo27900a(new C7662kl(this, a2, a, zzcxu, zzcxm, jSONObject), this.f20573b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzbyn mo28739a(zzbbh zzbbh, zzbbh zzbbh2, zzcxu zzcxu, zzcxm zzcxm, JSONObject jSONObject) throws Exception {
        zzbyt zzbyt = (zzbyt) zzbbh.get();
        zzccj zzccj = (zzccj) zzbbh2.get();
        zzbyv a = this.f20572a.mo26806a(new zzbpr(zzcxu, zzcxm, (String) null), new zzbzf(zzbyt), new zzbyc(jSONObject, zzccj));
        a.mo26880h().mo28640a();
        a.mo26881i().mo28650a(zzccj);
        a.mo26882j().mo28634a(zzbyt.mo28551r());
        return a.mo25593g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzbbh mo28738a(zzcxu zzcxu, zzcxm zzcxm, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return zzbar.m20538a((Throwable) new zzcgm(3));
        }
        if (zzcxu.f21162a.f21156a.f21175l <= 1) {
            return zzbar.m20543a(m22685a(zzcxu, zzcxm, jSONArray.getJSONObject(0)), C7625jl.f15762a, (Executor) this.f20573b);
        }
        int length = jSONArray.length();
        this.f20572a.mo26810d().mo28836a(Math.min(length, zzcxu.f21162a.f21156a.f21175l));
        ArrayList arrayList = new ArrayList(zzcxu.f21162a.f21156a.f21175l);
        for (int i = 0; i < zzcxu.f21162a.f21156a.f21175l; i++) {
            if (i < length) {
                arrayList.add(m22685a(zzcxu, zzcxm, jSONArray.getJSONObject(i)));
            } else {
                arrayList.add(zzbar.m20538a((Throwable) new zzcgm(3)));
            }
        }
        return zzbar.m20539a(arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzbbh mo28737a(zzcxm zzcxm, zzccj zzccj) throws Exception {
        JSONObject a = zzazc.m20429a("isNonagon", (Object) true);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("response", zzcxm.f21132p.f21154c);
        jSONObject.put("sdk_params", a);
        return zzbar.m20542a(zzccj.mo28641a("google.afma.nativeAds.preProcessJson", jSONObject), C7584il.f15672a, (Executor) this.f20573b);
    }
}
