package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class zzdtp<T> {

    /* renamed from: a */
    private final List<T> f21760a = new ArrayList(11);

    private zzdtp(int i) {
    }

    /* renamed from: a */
    public static <T> zzdtp<T> m24238a(int i) {
        return new zzdtp<>(11);
    }

    /* renamed from: a */
    public final zzdtp<T> mo29229a(T t) {
        List<T> list = this.f21760a;
        zzdto.m24236a(t, "Set contributions cannot be null");
        list.add(t);
        return this;
    }

    /* renamed from: a */
    public final zzdtp<T> mo29230a(Collection<? extends T> collection) {
        for (Object a : collection) {
            zzdto.m24236a(a, "Set contributions cannot be null");
        }
        this.f21760a.addAll(collection);
        return this;
    }

    /* renamed from: a */
    public final Set<T> mo29231a() {
        int size = this.f21760a.size();
        if (size == 0) {
            return Collections.emptySet();
        }
        if (size != 1) {
            return Collections.unmodifiableSet(new HashSet(this.f21760a));
        }
        return Collections.singleton(this.f21760a.get(0));
    }
}
