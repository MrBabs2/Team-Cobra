package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import p050l.p066e.C4881g;

public final class zzbzc {

    /* renamed from: h */
    public static final zzbzc f19749h = new zzbze().mo28573a();

    /* renamed from: a */
    private final zzafl f19750a;

    /* renamed from: b */
    private final zzafi f19751b;

    /* renamed from: c */
    private final zzafx f19752c;

    /* renamed from: d */
    private final zzafu f19753d;

    /* renamed from: e */
    private final zzaje f19754e;

    /* renamed from: f */
    private final C4881g<String, zzafr> f19755f;

    /* renamed from: g */
    private final C4881g<String, zzafo> f19756g;

    private zzbzc(zzbze zzbze) {
        this.f19750a = zzbze.f19757a;
        this.f19751b = zzbze.f19758b;
        this.f19752c = zzbze.f19759c;
        this.f19755f = new C4881g<>(zzbze.f19762f);
        this.f19756g = new C4881g<>(zzbze.f19763g);
        this.f19753d = zzbze.f19760d;
        this.f19754e = zzbze.f19761e;
    }

    /* renamed from: a */
    public final zzafl mo28564a() {
        return this.f19750a;
    }

    /* renamed from: b */
    public final zzafi mo28566b() {
        return this.f19751b;
    }

    /* renamed from: c */
    public final zzafx mo28568c() {
        return this.f19752c;
    }

    /* renamed from: d */
    public final zzafu mo28569d() {
        return this.f19753d;
    }

    /* renamed from: e */
    public final zzaje mo28570e() {
        return this.f19754e;
    }

    /* renamed from: f */
    public final ArrayList<String> mo28571f() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.f19752c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.f19750a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.f19751b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (this.f19755f.size() > 0) {
            arrayList.add(Integer.toString(3));
        }
        if (this.f19754e != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    /* renamed from: g */
    public final ArrayList<String> mo28572g() {
        ArrayList<String> arrayList = new ArrayList<>(this.f19755f.size());
        for (int i = 0; i < this.f19755f.size(); i++) {
            arrayList.add(this.f19755f.mo17022b(i));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final zzafr mo28565a(String str) {
        return this.f19755f.get(str);
    }

    /* renamed from: b */
    public final zzafo mo28567b(String str) {
        return this.f19756g.get(str);
    }
}
