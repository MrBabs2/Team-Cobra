package com.squareup.moshi;

import com.squareup.moshi.C8924f;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.squareup.moshi.d */
/* compiled from: CollectionJsonAdapter */
abstract class C8920d<C extends Collection<T>, T> extends C8924f<C> {

    /* renamed from: b */
    public static final C8924f.C8929e f25340b = new C8921a();

    /* renamed from: a */
    private final C8924f<T> f25341a;

    /* renamed from: com.squareup.moshi.d$a */
    /* compiled from: CollectionJsonAdapter */
    class C8921a implements C8924f.C8929e {
        C8921a() {
        }

        /* renamed from: a */
        public C8924f<?> mo32832a(Type type, Set<? extends Annotation> set, C8952r rVar) {
            Class<?> d = C8970t.m29525d(type);
            if (!set.isEmpty()) {
                return null;
            }
            if (d == List.class || d == Collection.class) {
                return C8920d.m29324a(type, rVar).nullSafe();
            }
            if (d == Set.class) {
                return C8920d.m29325b(type, rVar).nullSafe();
            }
            return null;
        }
    }

    /* renamed from: com.squareup.moshi.d$b */
    /* compiled from: CollectionJsonAdapter */
    class C8922b extends C8920d<Collection<T>, T> {
        C8922b(C8924f fVar) {
            super(fVar, (C8921a) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Collection<T> mo32841a() {
            return new ArrayList();
        }

        public /* bridge */ /* synthetic */ Object fromJson(C8930i iVar) throws IOException {
            return C8920d.super.fromJson(iVar);
        }

        public /* bridge */ /* synthetic */ void toJson(C8939o oVar, Object obj) throws IOException {
            C8920d.super.mo32842a(oVar, (Collection) obj);
        }
    }

    /* renamed from: com.squareup.moshi.d$c */
    /* compiled from: CollectionJsonAdapter */
    class C8923c extends C8920d<Set<T>, T> {
        C8923c(C8924f fVar) {
            super(fVar, (C8921a) null);
        }

        public /* bridge */ /* synthetic */ Object fromJson(C8930i iVar) throws IOException {
            return C8920d.super.fromJson(iVar);
        }

        public /* bridge */ /* synthetic */ void toJson(C8939o oVar, Object obj) throws IOException {
            C8920d.super.mo32842a(oVar, (Set) obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Set<T> m29331a() {
            return new LinkedHashSet();
        }
    }

    /* synthetic */ C8920d(C8924f fVar, C8921a aVar) {
        this(fVar);
    }

    /* renamed from: a */
    static <T> C8924f<Collection<T>> m29324a(Type type, C8952r rVar) {
        return new C8922b(rVar.mo32969a(C8970t.m29519a(type, (Class<?>) Collection.class)));
    }

    /* renamed from: b */
    static <T> C8924f<Set<T>> m29325b(Type type, C8952r rVar) {
        return new C8923c(rVar.mo32969a(C8970t.m29519a(type, (Class<?>) Collection.class)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract C mo32841a();

    public C fromJson(C8930i iVar) throws IOException {
        C a = mo32841a();
        iVar.mo32864a();
        while (iVar.mo32874m()) {
            a.add(this.f25341a.fromJson(iVar));
        }
        iVar.mo32870d();
        return a;
    }

    public String toString() {
        return this.f25341a + ".collection()";
    }

    private C8920d(C8924f<T> fVar) {
        this.f25341a = fVar;
    }

    /* renamed from: a */
    public void mo32842a(C8939o oVar, C c) throws IOException {
        oVar.mo32889a();
        for (Object json : c) {
            this.f25341a.toJson(oVar, json);
        }
        oVar.mo32900i();
    }
}
