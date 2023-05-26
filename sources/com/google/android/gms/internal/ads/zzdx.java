package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class zzdx extends zzcf<Integer, Long> {

    /* renamed from: b */
    public Long f21772b;

    /* renamed from: c */
    public Long f21773c;

    public zzdx() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Long> mo28671a() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f21772b);
        hashMap.put(1, this.f21773c);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo29236b(String str) {
        HashMap a = zzcf.m22455a(str);
        if (a != null) {
            this.f21772b = (Long) a.get(0);
            this.f21773c = (Long) a.get(1);
        }
    }

    public zzdx(String str) {
        mo29236b(str);
    }
}
