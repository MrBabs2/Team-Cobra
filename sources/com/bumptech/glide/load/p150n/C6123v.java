package com.bumptech.glide.load.p150n;

import com.bumptech.glide.C5878g;
import com.bumptech.glide.load.C5901a;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.p148m.C6034d;
import com.bumptech.glide.load.p150n.C6101n;
import com.bumptech.glide.p165q.C6301c;

/* renamed from: com.bumptech.glide.load.n.v */
/* compiled from: UnitModelLoader */
public class C6123v<Model> implements C6101n<Model, Model> {

    /* renamed from: a */
    private static final C6123v<?> f11221a = new C6123v<>();

    /* renamed from: com.bumptech.glide.load.n.v$a */
    /* compiled from: UnitModelLoader */
    public static class C6124a<Model> implements C6103o<Model, Model> {

        /* renamed from: a */
        private static final C6124a<?> f11222a = new C6124a<>();

        /* renamed from: a */
        public static <T> C6124a<T> m12334a() {
            return f11222a;
        }

        /* renamed from: a */
        public C6101n<Model, Model> mo20366a(C6109r rVar) {
            return C6123v.m12331a();
        }
    }

    /* renamed from: com.bumptech.glide.load.n.v$b */
    /* compiled from: UnitModelLoader */
    private static class C6125b<Model> implements C6034d<Model> {

        /* renamed from: f */
        private final Model f11223f;

        C6125b(Model model) {
            this.f11223f = model;
        }

        /* renamed from: a */
        public void mo20327a(C5878g gVar, C6034d.C6035a<? super Model> aVar) {
            aVar.mo20141a(this.f11223f);
        }

        /* renamed from: b */
        public void mo20329b() {
        }

        /* renamed from: c */
        public C5901a mo20330c() {
            return C5901a.LOCAL;
        }

        public void cancel() {
        }

        /* renamed from: a */
        public Class<Model> mo20323a() {
            return this.f11223f.getClass();
        }
    }

    /* renamed from: a */
    public static <T> C6123v<T> m12331a() {
        return f11221a;
    }

    /* renamed from: a */
    public boolean mo20364a(Model model) {
        return true;
    }

    /* renamed from: a */
    public C6101n.C6102a<Model> mo20362a(Model model, int i, int i2, C6027i iVar) {
        return new C6101n.C6102a<>(new C6301c(model), new C6125b(model));
    }
}
