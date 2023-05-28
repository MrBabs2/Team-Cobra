package com.bumptech.glide.load.p150n;

import com.bumptech.glide.Registry;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.p150n.C6101n;
import com.bumptech.glide.p166r.C6315j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p050l.p075h.p083k.C5005e;

/* renamed from: com.bumptech.glide.load.n.r */
/* compiled from: MultiModelLoaderFactory */
public class C6109r {

    /* renamed from: e */
    private static final C6112c f11204e = new C6112c();

    /* renamed from: f */
    private static final C6101n<Object, Object> f11205f = new C6110a();

    /* renamed from: a */
    private final List<C6111b<?, ?>> f11206a;

    /* renamed from: b */
    private final C6112c f11207b;

    /* renamed from: c */
    private final Set<C6111b<?, ?>> f11208c;

    /* renamed from: d */
    private final C5005e<List<Throwable>> f11209d;

    /* renamed from: com.bumptech.glide.load.n.r$a */
    /* compiled from: MultiModelLoaderFactory */
    private static class C6110a implements C6101n<Object, Object> {
        C6110a() {
        }

        /* renamed from: a */
        public C6101n.C6102a<Object> mo20362a(Object obj, int i, int i2, C6027i iVar) {
            return null;
        }

        /* renamed from: a */
        public boolean mo20364a(Object obj) {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.r$b */
    /* compiled from: MultiModelLoaderFactory */
    private static class C6111b<Model, Data> {

        /* renamed from: a */
        private final Class<Model> f11210a;

        /* renamed from: b */
        final Class<Data> f11211b;

        /* renamed from: c */
        final C6103o<? extends Model, ? extends Data> f11212c;

        public C6111b(Class<Model> cls, Class<Data> cls2, C6103o<? extends Model, ? extends Data> oVar) {
            this.f11210a = cls;
            this.f11211b = cls2;
            this.f11212c = oVar;
        }

        /* renamed from: a */
        public boolean mo20419a(Class<?> cls, Class<?> cls2) {
            return mo20418a(cls) && this.f11211b.isAssignableFrom(cls2);
        }

        /* renamed from: a */
        public boolean mo20418a(Class<?> cls) {
            return this.f11210a.isAssignableFrom(cls);
        }
    }

    /* renamed from: com.bumptech.glide.load.n.r$c */
    /* compiled from: MultiModelLoaderFactory */
    static class C6112c {
        C6112c() {
        }

        /* renamed from: a */
        public <Model, Data> C6107q<Model, Data> mo20420a(List<C6101n<Model, Data>> list, C5005e<List<Throwable>> eVar) {
            return new C6107q<>(list, eVar);
        }
    }

    public C6109r(C5005e<List<Throwable>> eVar) {
        this(eVar, f11204e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized <Model, Data> void mo20416a(Class<Model> cls, Class<Data> cls2, C6103o<? extends Model, ? extends Data> oVar) {
        m12301a(cls, cls2, oVar, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized List<Class<?>> mo20417b(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C6111b next : this.f11206a) {
            if (!arrayList.contains(next.f11211b) && next.mo20418a(cls)) {
                arrayList.add(next.f11211b);
            }
        }
        return arrayList;
    }

    C6109r(C5005e<List<Throwable>> eVar, C6112c cVar) {
        this.f11206a = new ArrayList();
        this.f11208c = new HashSet();
        this.f11209d = eVar;
        this.f11207b = cVar;
    }

    /* renamed from: a */
    private <Model, Data> void m12301a(Class<Model> cls, Class<Data> cls2, C6103o<? extends Model, ? extends Data> oVar, boolean z) {
        C6111b bVar = new C6111b(cls, cls2, oVar);
        List<C6111b<?, ?>> list = this.f11206a;
        list.add(z ? list.size() : 0, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized <Model> List<C6101n<Model, ?>> mo20415a(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C6111b next : this.f11206a) {
                if (!this.f11208c.contains(next)) {
                    if (next.mo20418a(cls)) {
                        this.f11208c.add(next);
                        arrayList.add(m12300a((C6111b<?, ?>) next));
                        this.f11208c.remove(next);
                    }
                }
            }
        } catch (Throwable th) {
            this.f11208c.clear();
            throw th;
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized <Model, Data> C6101n<Model, Data> mo20414a(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C6111b next : this.f11206a) {
                if (this.f11208c.contains(next)) {
                    z = true;
                } else if (next.mo20419a(cls, cls2)) {
                    this.f11208c.add(next);
                    arrayList.add(m12300a((C6111b<?, ?>) next));
                    this.f11208c.remove(next);
                }
            }
            if (arrayList.size() > 1) {
                return this.f11207b.mo20420a(arrayList, this.f11209d);
            } else if (arrayList.size() == 1) {
                return (C6101n) arrayList.get(0);
            } else if (z) {
                return m12299a();
            } else {
                throw new Registry.NoModelLoaderAvailableException(cls, cls2);
            }
        } catch (Throwable th) {
            this.f11208c.clear();
            throw th;
        }
    }

    /* renamed from: a */
    private <Model, Data> C6101n<Model, Data> m12300a(C6111b<?, ?> bVar) {
        C6101n<? extends Model, ? extends Data> a = bVar.f11212c.mo20366a(this);
        C6315j.m12978a(a);
        return a;
    }

    /* renamed from: a */
    private static <Model, Data> C6101n<Model, Data> m12299a() {
        return f11205f;
    }
}
