package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class zzdw extends zzcf<Integer, Object> {

    /* renamed from: b */
    public Long f21769b;

    /* renamed from: c */
    public Boolean f21770c;

    /* renamed from: d */
    public Boolean f21771d;

    public zzdw() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final HashMap<Integer, Object> mo28671a() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.f21769b);
        hashMap.put(1, this.f21770c);
        hashMap.put(2, this.f21771d);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo29235b(String str) {
        HashMap a = zzcf.m22455a(str);
        if (a != null) {
            this.f21769b = (Long) a.get(0);
            this.f21770c = (Boolean) a.get(1);
            this.f21771d = (Boolean) a.get(2);
        }
    }

    public zzdw(String str) {
        mo29235b(str);
    }
}
