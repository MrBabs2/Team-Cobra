package com.google.android.gms.internal.ads;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.ut */
final class C8040ut {

    /* renamed from: a */
    private final ConcurrentHashMap<C8077vt, List<Throwable>> f16979a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f16980b = new ReferenceQueue<>();

    C8040ut() {
    }

    /* renamed from: a */
    public final List<Throwable> mo26664a(Throwable th, boolean z) {
        Reference<? extends Throwable> poll = this.f16980b.poll();
        while (poll != null) {
            this.f16979a.remove(poll);
            poll = this.f16980b.poll();
        }
        List<Throwable> list = this.f16979a.get(new C8077vt(th, (ReferenceQueue<Throwable>) null));
        if (!z || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f16979a.putIfAbsent(new C8077vt(th, this.f16980b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
