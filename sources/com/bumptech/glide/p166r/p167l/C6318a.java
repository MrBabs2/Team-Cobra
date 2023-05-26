package com.bumptech.glide.p166r.p167l;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p050l.p075h.p083k.C5005e;
import p050l.p075h.p083k.C5007g;

/* renamed from: com.bumptech.glide.r.l.a */
/* compiled from: FactoryPools */
public final class C6318a {

    /* renamed from: a */
    private static final C6325g<Object> f11573a = new C6319a();

    /* renamed from: com.bumptech.glide.r.l.a$a */
    /* compiled from: FactoryPools */
    class C6319a implements C6325g<Object> {
        C6319a() {
        }

        /* renamed from: a */
        public void mo20772a(Object obj) {
        }
    }

    /* renamed from: com.bumptech.glide.r.l.a$b */
    /* compiled from: FactoryPools */
    class C6320b implements C6322d<List<T>> {
        C6320b() {
        }

        /* renamed from: a */
        public List<T> m13012a() {
            return new ArrayList();
        }
    }

    /* renamed from: com.bumptech.glide.r.l.a$c */
    /* compiled from: FactoryPools */
    class C6321c implements C6325g<List<T>> {
        C6321c() {
        }

        /* renamed from: a */
        public void mo20772a(List<T> list) {
            list.clear();
        }
    }

    /* renamed from: com.bumptech.glide.r.l.a$d */
    /* compiled from: FactoryPools */
    public interface C6322d<T> {
        /* renamed from: a */
        T mo20120a();
    }

    /* renamed from: com.bumptech.glide.r.l.a$f */
    /* compiled from: FactoryPools */
    public interface C6324f {
        /* renamed from: i */
        C6327c mo20121i();
    }

    /* renamed from: com.bumptech.glide.r.l.a$g */
    /* compiled from: FactoryPools */
    public interface C6325g<T> {
        /* renamed from: a */
        void mo20772a(T t);
    }

    /* renamed from: a */
    public static <T extends C6324f> C5005e<T> m13006a(int i, C6322d<T> dVar) {
        return m13007a(new C5007g(i), dVar);
    }

    /* renamed from: b */
    public static <T> C5005e<List<T>> m13009b() {
        return m13005a(20);
    }

    /* renamed from: a */
    public static <T> C5005e<List<T>> m13005a(int i) {
        return m13008a(new C5007g(i), new C6320b(), new C6321c());
    }

    /* renamed from: a */
    private static <T extends C6324f> C5005e<T> m13007a(C5005e<T> eVar, C6322d<T> dVar) {
        return m13008a(eVar, dVar, m13004a());
    }

    /* renamed from: a */
    private static <T> C5005e<T> m13008a(C5005e<T> eVar, C6322d<T> dVar, C6325g<T> gVar) {
        return new C6323e(eVar, dVar, gVar);
    }

    /* renamed from: a */
    private static <T> C6325g<T> m13004a() {
        return f11573a;
    }

    /* renamed from: com.bumptech.glide.r.l.a$e */
    /* compiled from: FactoryPools */
    private static final class C6323e<T> implements C5005e<T> {

        /* renamed from: a */
        private final C6322d<T> f11574a;

        /* renamed from: b */
        private final C6325g<T> f11575b;

        /* renamed from: c */
        private final C5005e<T> f11576c;

        C6323e(C5005e<T> eVar, C6322d<T> dVar, C6325g<T> gVar) {
            this.f11576c = eVar;
            this.f11574a = dVar;
            this.f11575b = gVar;
        }

        /* renamed from: a */
        public T mo17456a() {
            T a = this.f11576c.mo17456a();
            if (a == null) {
                a = this.f11574a.mo20120a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + a.getClass());
                }
            }
            if (a instanceof C6324f) {
                ((C6324f) a).mo20121i().mo20775a(false);
            }
            return a;
        }

        /* renamed from: a */
        public boolean mo17457a(T t) {
            if (t instanceof C6324f) {
                ((C6324f) t).mo20121i().mo20775a(true);
            }
            this.f11575b.mo20772a(t);
            return this.f11576c.mo17457a(t);
        }
    }
}
