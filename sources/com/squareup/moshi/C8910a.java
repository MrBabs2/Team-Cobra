package com.squareup.moshi;

import com.squareup.moshi.C8924f;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.squareup.moshi.a */
/* compiled from: ArrayJsonAdapter */
final class C8910a extends C8924f<Object> {

    /* renamed from: c */
    public static final C8924f.C8929e f25320c = new C8911a();

    /* renamed from: a */
    private final Class<?> f25321a;

    /* renamed from: b */
    private final C8924f<Object> f25322b;

    /* renamed from: com.squareup.moshi.a$a */
    /* compiled from: ArrayJsonAdapter */
    class C8911a implements C8924f.C8929e {
        C8911a() {
        }

        /* renamed from: a */
        public C8924f<?> mo32832a(Type type, Set<? extends Annotation> set, C8952r rVar) {
            Type a = C8970t.m29518a(type);
            if (a != null && set.isEmpty()) {
                return new C8910a(C8970t.m29525d(a), rVar.mo32969a(a)).nullSafe();
            }
            return null;
        }
    }

    C8910a(Class<?> cls, C8924f<Object> fVar) {
        this.f25321a = cls;
        this.f25322b = fVar;
    }

    public Object fromJson(C8930i iVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        iVar.mo32864a();
        while (iVar.mo32874m()) {
            arrayList.add(this.f25322b.fromJson(iVar));
        }
        iVar.mo32870d();
        Object newInstance = Array.newInstance(this.f25321a, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    public void toJson(C8939o oVar, Object obj) throws IOException {
        oVar.mo32889a();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f25322b.toJson(oVar, Array.get(obj, i));
        }
        oVar.mo32900i();
    }

    public String toString() {
        return this.f25322b + ".array()";
    }
}
