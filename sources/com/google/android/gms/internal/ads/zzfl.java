package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class zzfl<T> {

    /* renamed from: a */
    private final Map<String, AtomicReference<T>> f21859a = new HashMap();

    /* renamed from: a */
    public final AtomicReference<T> mo29276a(String str) {
        synchronized (this) {
            if (!this.f21859a.containsKey(str)) {
                this.f21859a.put(str, new AtomicReference());
            }
        }
        return this.f21859a.get(str);
    }
}
