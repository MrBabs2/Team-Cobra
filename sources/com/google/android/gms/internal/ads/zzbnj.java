package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

public final class zzbnj implements zzdti<C8171yc> {

    /* renamed from: a */
    private final zzdtu<Context> f19230a;

    /* renamed from: b */
    private final zzdtu<zzcxn> f19231b;

    /* renamed from: c */
    private final zzdtu<View> f19232c;

    /* renamed from: d */
    private final zzdtu<zzbgz> f19233d;

    /* renamed from: e */
    private final zzdtu<zzbpb> f19234e;

    /* renamed from: f */
    private final zzdtu<zzbzc> f19235f;

    /* renamed from: g */
    private final zzdtu<zzbvd> f19236g;

    /* renamed from: h */
    private final zzdtu<zzcpm> f19237h;

    /* renamed from: i */
    private final zzdtu<Executor> f19238i;

    /* renamed from: j */
    private final zzdtu<zzcxu> f19239j;

    /* renamed from: k */
    private final zzdtu<zzcxm> f19240k;

    /* renamed from: l */
    private final zzdtu<zzbry> f19241l;

    /* renamed from: m */
    private final zzdtu<zzbso> f19242m;

    /* renamed from: n */
    private final zzdtu<String> f19243n;

    public zzbnj(zzdtu<Context> zzdtu, zzdtu<zzcxn> zzdtu2, zzdtu<View> zzdtu3, zzdtu<zzbgz> zzdtu4, zzdtu<zzbpb> zzdtu5, zzdtu<zzbzc> zzdtu6, zzdtu<zzbvd> zzdtu7, zzdtu<zzcpm> zzdtu8, zzdtu<Executor> zzdtu9, zzdtu<zzcxu> zzdtu10, zzdtu<zzcxm> zzdtu11, zzdtu<zzbry> zzdtu12, zzdtu<zzbso> zzdtu13, zzdtu<String> zzdtu14) {
        this.f19230a = zzdtu;
        this.f19231b = zzdtu2;
        this.f19232c = zzdtu3;
        this.f19233d = zzdtu4;
        this.f19234e = zzdtu5;
        this.f19235f = zzdtu6;
        this.f19236g = zzdtu7;
        this.f19237h = zzdtu8;
        this.f19238i = zzdtu9;
        this.f19239j = zzdtu10;
        this.f19240k = zzdtu11;
        this.f19241l = zzdtu12;
        this.f19242m = zzdtu13;
        this.f19243n = zzdtu14;
    }

    /* renamed from: a */
    public static C8171yc m21401a(Context context, zzcxn zzcxn, View view, zzbgz zzbgz, zzbpb zzbpb, zzbzc zzbzc, zzbvd zzbvd, zzdte<zzcpm> zzdte, Executor executor) {
        return new C8171yc(context, zzcxn, view, zzbgz, zzbpb, zzbzc, zzbvd, zzdte, executor);
    }

    public final /* synthetic */ Object get() {
        C8171yc ycVar = new C8171yc(this.f19230a.get(), this.f19231b.get(), this.f19232c.get(), this.f19233d.get(), this.f19234e.get(), this.f19235f.get(), this.f19236g.get(), zzdth.m24230b(this.f19237h), this.f19238i.get());
        zzbql.m21800a((zzbpc) ycVar, this.f19239j.get());
        zzbql.m21799a((zzbpc) ycVar, this.f19240k.get());
        zzbql.m21797a((zzbpc) ycVar, this.f19241l.get());
        zzbql.m21798a((zzbpc) ycVar, this.f19242m.get());
        zzbql.m21801a((zzbpc) ycVar, this.f19243n.get());
        return ycVar;
    }
}
