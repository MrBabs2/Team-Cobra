package com.google.gson.p191t.p192l;

import com.google.gson.C8668e;
import com.google.gson.C8688q;
import com.google.gson.C8690r;
import com.google.gson.p191t.C8696b;
import com.google.gson.p194u.C8805a;
import com.google.gson.stream.C8691a;
import com.google.gson.stream.C8693b;
import com.google.gson.stream.C8694c;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: com.google.gson.t.l.a */
/* compiled from: ArrayTypeAdapter */
public final class C8737a<E> extends C8688q<Object> {

    /* renamed from: c */
    public static final C8690r f24854c = new C8738a();

    /* renamed from: a */
    private final Class<E> f24855a;

    /* renamed from: b */
    private final C8688q<E> f24856b;

    /* renamed from: com.google.gson.t.l.a$a */
    /* compiled from: ArrayTypeAdapter */
    static class C8738a implements C8690r {
        C8738a() {
        }

        /* renamed from: a */
        public <T> C8688q<T> mo32358a(C8668e eVar, C8805a<T> aVar) {
            Type type = aVar.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type d = C8696b.m28451d(type);
            return new C8737a(eVar, eVar.mo32299a(C8805a.get(d)), C8696b.m28452e(d));
        }
    }

    public C8737a(C8668e eVar, C8688q<E> qVar, Class<E> cls) {
        this.f24856b = new C8764m(eVar, qVar, cls);
        this.f24855a = cls;
    }

    /* renamed from: a */
    public Object mo32314a(C8691a aVar) throws IOException {
        if (aVar.peek() == C8693b.NULL) {
            aVar.mo32377x();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.mo32359a();
        while (aVar.mo32367m()) {
            arrayList.add(this.f24856b.mo32314a(aVar));
        }
        aVar.mo32365i();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f24855a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* renamed from: a */
    public void mo32316a(C8694c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.mo32400p();
            return;
        }
        cVar.mo32381a();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f24856b.mo32316a(cVar, Array.get(obj, i));
        }
        cVar.mo32390d();
    }
}
