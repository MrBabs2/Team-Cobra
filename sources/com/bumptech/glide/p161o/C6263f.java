package com.bumptech.glide.p161o;

import com.bumptech.glide.load.C6029k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.o.f */
/* compiled from: ResourceEncoderRegistry */
public class C6263f {

    /* renamed from: a */
    private final List<C6264a<?>> f11433a = new ArrayList();

    /* renamed from: com.bumptech.glide.o.f$a */
    /* compiled from: ResourceEncoderRegistry */
    private static final class C6264a<T> {

        /* renamed from: a */
        private final Class<T> f11434a;

        /* renamed from: b */
        final C6029k<T> f11435b;

        C6264a(Class<T> cls, C6029k<T> kVar) {
            this.f11434a = cls;
            this.f11435b = kVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo20623a(Class<?> cls) {
            return this.f11434a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <Z> void mo20622a(Class<Z> cls, C6029k<Z> kVar) {
        this.f11433a.add(new C6264a(cls, kVar));
    }

    /* renamed from: a */
    public synchronized <Z> C6029k<Z> mo20621a(Class<Z> cls) {
        int size = this.f11433a.size();
        for (int i = 0; i < size; i++) {
            C6264a aVar = this.f11433a.get(i);
            if (aVar.mo20623a(cls)) {
                return aVar.f11435b;
            }
        }
        return null;
    }
}
