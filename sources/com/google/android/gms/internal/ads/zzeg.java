package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class zzeg extends zzcf<Integer, Long> {

    /* renamed from: b */
    public Long f21805b;

    /* renamed from: c */
    public Long f21806c;

    /* renamed from: d */
    public Long f21807d;

    /* renamed from: e */
    public Long f21808e;

    public zzeg() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Long> mo28671a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f21805b);
        hashMap.put(1, this.f21806c);
        hashMap.put(2, this.f21807d);
        hashMap.put(3, this.f21808e);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo29257b(String str) {
        HashMap a = zzcf.m22455a(str);
        if (a != null) {
            this.f21805b = (Long) a.get(0);
            this.f21806c = (Long) a.get(1);
            this.f21807d = (Long) a.get(2);
            this.f21808e = (Long) a.get(3);
        }
    }

    public zzeg(String str) {
        mo29257b(str);
    }
}
