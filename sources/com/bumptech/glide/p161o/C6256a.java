package com.bumptech.glide.p161o;

import com.bumptech.glide.load.C5904d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.o.a */
/* compiled from: EncoderRegistry */
public class C6256a {

    /* renamed from: a */
    private final List<C6257a<?>> f11419a = new ArrayList();

    /* renamed from: com.bumptech.glide.o.a$a */
    /* compiled from: EncoderRegistry */
    private static final class C6257a<T> {

        /* renamed from: a */
        private final Class<T> f11420a;

        /* renamed from: b */
        final C5904d<T> f11421b;

        C6257a(Class<T> cls, C5904d<T> dVar) {
            this.f11420a = cls;
            this.f11421b = dVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo20608a(Class<?> cls) {
            return this.f11420a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <T> C5904d<T> mo20606a(Class<T> cls) {
        for (C6257a next : this.f11419a) {
            if (next.mo20608a(cls)) {
                return next.f11421b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public synchronized <T> void mo20607a(Class<T> cls, C5904d<T> dVar) {
        this.f11419a.add(new C6257a(cls, dVar));
    }
}
