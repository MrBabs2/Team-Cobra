package com.flurry.sdk;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.flurry.sdk.l */
public final class C6913l {

    /* renamed from: a */
    protected Map<C6922m, String> f12957a;

    /* renamed from: b */
    public boolean f12958b;

    C6913l() {
        this.f12957a = new HashMap();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo23644a(C6922m mVar, String str) {
        this.f12957a.put(mVar, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C6913l mo23645b() {
        return new C6913l(Collections.unmodifiableMap(this.f12957a), this.f12958b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12957a);
        sb.append(this.f12958b);
        return sb.toString();
    }

    /* renamed from: a */
    public final Map<C6922m, String> mo23643a() {
        return this.f12957a;
    }

    private C6913l(Map<C6922m, String> map, boolean z) {
        this.f12957a = map;
        this.f12958b = z;
    }
}
