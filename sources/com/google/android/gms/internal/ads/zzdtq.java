package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class zzdtq<T> implements zzdti<Set<T>> {

    /* renamed from: a */
    private final List<zzdtu<T>> f21761a;

    /* renamed from: b */
    private final List<zzdtu<Collection<T>>> f21762b;

    static {
        zzdtj.m24231a(Collections.emptySet());
    }

    private zzdtq(List<zzdtu<T>> list, List<zzdtu<Collection<T>>> list2) {
        this.f21761a = list;
        this.f21762b = list2;
    }

    /* renamed from: a */
    public static <T> zzdts<T> m24242a(int i, int i2) {
        return new zzdts<>(i, i2);
    }

    public final /* synthetic */ Object get() {
        int size = this.f21761a.size();
        ArrayList arrayList = new ArrayList(this.f21762b.size());
        int size2 = this.f21762b.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) this.f21762b.get(i).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet b = zzdtf.m24225b(size);
        int size3 = this.f21761a.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj = this.f21761a.get(i2).get();
            zzdto.m24235a(obj);
            b.add(obj);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object next : (Collection) arrayList.get(i3)) {
                zzdto.m24235a(next);
                b.add(next);
            }
        }
        return Collections.unmodifiableSet(b);
    }
}
