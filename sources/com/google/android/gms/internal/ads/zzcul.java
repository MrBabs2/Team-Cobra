package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

public final class zzcul implements zzcva<zzcuk> {

    /* renamed from: a */
    private final zzbbl f20968a;

    /* renamed from: b */
    private final ScheduledExecutorService f20969b;

    /* renamed from: c */
    private final List<zzcpk> f20970c;

    /* renamed from: d */
    private final Context f20971d;

    /* renamed from: e */
    private final zzcxv f20972e;

    /* renamed from: f */
    private String f20973f;

    public zzcul(zzbbl zzbbl, ScheduledExecutorService scheduledExecutorService, String str, zzcpf zzcpf, Context context, zzcxv zzcxv) {
        this.f20968a = zzbbl;
        this.f20969b = scheduledExecutorService;
        this.f20973f = str;
        this.f20971d = context;
        this.f20972e = zzcxv;
        if (zzcpf.mo28755b().containsKey(zzcxv.f21169f)) {
            this.f20970c = zzcpf.mo28755b().get(zzcxv.f21169f);
        } else {
            this.f20970c = Collections.emptyList();
        }
    }

    /* renamed from: b */
    static final /* synthetic */ zzcuk m22998b(List list) throws Exception {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(((zzbbh) it.next()).get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return new zzcuk(jSONArray.toString());
    }

    /* renamed from: a */
    public final zzbbh<zzcuk> mo25785a() {
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17889c1)).booleanValue()) {
            return zzbar.m20542a(this.f20968a.mo27892a(new C7998to(this)), new C8035uo(this), (Executor) this.f20968a);
        }
        return zzbar.m20539a(null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ List mo28797b() throws Exception {
        ArrayList arrayList = new ArrayList();
        for (zzcpk next : this.f20970c) {
            zzbbr zzbbr = new zzbbr();
            zzcpl zzcpl = new zzcpl(next, zzbbr);
            Bundle bundle = this.f20972e.f21167d.f22993r;
            Bundle bundle2 = bundle != null ? bundle.getBundle(next.f20735a) : null;
            arrayList.add(zzbar.m20541a(zzbbr, ((Long) zzyt.m25670e().mo27163a(zzacu.f17884b1)).longValue(), TimeUnit.MILLISECONDS, this.f20969b));
            this.f20968a.execute(new C8072vo(this, next, bundle2, zzcpl, zzbbr));
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28796a(zzcpk zzcpk, Bundle bundle, zzcpl zzcpl, zzbbr zzbbr) {
        try {
            zzcpk.f20737c.mo27521a(ObjectWrapper.m16391a(this.f20971d), this.f20973f, bundle, zzcpk.f20736b, this.f20972e.f21168e, (zzaoy) zzcpl);
        } catch (Exception e) {
            zzbbr.mo27903a(new Exception("Error calling adapter"));
            zzbad.m20520b("", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzbbh mo28795a(List list) throws Exception {
        return zzbar.m20551b(list).mo27900a(new C8109wo(list), this.f20968a);
    }
}
