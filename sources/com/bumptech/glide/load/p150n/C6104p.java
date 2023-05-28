package com.bumptech.glide.load.p150n;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p050l.p075h.p083k.C5005e;

/* renamed from: com.bumptech.glide.load.n.p */
/* compiled from: ModelLoaderRegistry */
public class C6104p {

    /* renamed from: a */
    private final C6109r f11191a;

    /* renamed from: b */
    private final C6105a f11192b;

    /* renamed from: com.bumptech.glide.load.n.p$a */
    /* compiled from: ModelLoaderRegistry */
    private static class C6105a {

        /* renamed from: a */
        private final Map<Class<?>, C6106a<?>> f11193a = new HashMap();

        /* renamed from: com.bumptech.glide.load.n.p$a$a */
        /* compiled from: ModelLoaderRegistry */
        private static class C6106a<Model> {

            /* renamed from: a */
            final List<C6101n<Model, ?>> f11194a;

            public C6106a(List<C6101n<Model, ?>> list) {
                this.f11194a = list;
            }
        }

        C6105a() {
        }

        /* renamed from: a */
        public void mo20411a() {
            this.f11193a.clear();
        }

        /* renamed from: a */
        public <Model> void mo20412a(Class<Model> cls, List<C6101n<Model, ?>> list) {
            if (this.f11193a.put(cls, new C6106a(list)) != null) {
                throw new IllegalStateException("Already cached loaders for model: " + cls);
            }
        }

        /* renamed from: a */
        public <Model> List<C6101n<Model, ?>> mo20410a(Class<Model> cls) {
            C6106a aVar = this.f11193a.get(cls);
            if (aVar == null) {
                return null;
            }
            return aVar.f11194a;
        }
    }

    public C6104p(C5005e<List<Throwable>> eVar) {
        this(new C6109r(eVar));
    }

    /* renamed from: b */
    private synchronized <A> List<C6101n<A, ?>> m12283b(Class<A> cls) {
        List<C6101n<A, ?>> a;
        a = this.f11192b.mo20410a(cls);
        if (a == null) {
            a = Collections.unmodifiableList(this.f11191a.mo20415a(cls));
            this.f11192b.mo20412a(cls, a);
        }
        return a;
    }

    /* renamed from: a */
    public synchronized <Model, Data> void mo20409a(Class<Model> cls, Class<Data> cls2, C6103o<? extends Model, ? extends Data> oVar) {
        this.f11191a.mo20416a(cls, cls2, oVar);
        this.f11192b.mo20411a();
    }

    private C6104p(C6109r rVar) {
        this.f11192b = new C6105a();
        this.f11191a = rVar;
    }

    /* renamed from: a */
    public <A> List<C6101n<A, ?>> mo20408a(A a) {
        List b = m12283b(m12282b(a));
        int size = b.size();
        List<C6101n<A, ?>> emptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            C6101n nVar = (C6101n) b.get(i);
            if (nVar.mo20364a(a)) {
                if (z) {
                    emptyList = new ArrayList<>(size - i);
                    z = false;
                }
                emptyList.add(nVar);
            }
        }
        return emptyList;
    }

    /* renamed from: b */
    private static <A> Class<A> m12282b(A a) {
        return a.getClass();
    }

    /* renamed from: a */
    public synchronized List<Class<?>> mo20407a(Class<?> cls) {
        return this.f11191a.mo20417b(cls);
    }
}
