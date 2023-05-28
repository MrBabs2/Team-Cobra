package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class zzdl extends zzcf<Integer, Long> {

    /* renamed from: b */
    public long f21472b;

    /* renamed from: c */
    public long f21473c;

    public zzdl() {
        this.f21472b = -1;
        this.f21473c = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Long> mo28671a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, Long.valueOf(this.f21472b));
        hashMap.put(1, Long.valueOf(this.f21473c));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo29059b(String str) {
        HashMap a = zzcf.m22455a(str);
        if (a != null) {
            this.f21472b = ((Long) a.get(0)).longValue();
            this.f21473c = ((Long) a.get(1)).longValue();
        }
    }

    public zzdl(String str) {
        this();
        mo29059b(str);
    }
}
