package com.bumptech.glide.p161o;

import com.bumptech.glide.p166r.C6314i;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p050l.p066e.C4868a;

/* renamed from: com.bumptech.glide.o.d */
/* compiled from: ModelToResourceClassCache */
public class C6260d {

    /* renamed from: a */
    private final AtomicReference<C6314i> f11426a = new AtomicReference<>();

    /* renamed from: b */
    private final C4868a<C6314i, List<Class<?>>> f11427b = new C4868a<>();

    /* renamed from: a */
    public List<Class<?>> mo20614a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        C6314i andSet = this.f11426a.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new C6314i(cls, cls2, cls3);
        } else {
            andSet.mo20768a(cls, cls2, cls3);
        }
        synchronized (this.f11427b) {
            list = this.f11427b.get(andSet);
        }
        this.f11426a.set(andSet);
        return list;
    }

    /* renamed from: a */
    public void mo20615a(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f11427b) {
            this.f11427b.put(new C6314i(cls, cls2, cls3), list);
        }
    }
}
