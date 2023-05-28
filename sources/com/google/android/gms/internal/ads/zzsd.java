package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzsd {

    /* renamed from: a */
    private final Map<String, String> f22640a = new HashMap();

    /* renamed from: b */
    private Map<String, String> f22641b;

    /* renamed from: a */
    public final synchronized Map<String, String> mo29709a() {
        if (this.f22641b == null) {
            this.f22641b = Collections.unmodifiableMap(new HashMap(this.f22640a));
        }
        return this.f22641b;
    }
}
