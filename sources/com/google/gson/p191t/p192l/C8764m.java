package com.google.gson.p191t.p192l;

import com.google.gson.C8668e;
import com.google.gson.C8688q;
import com.google.gson.p191t.p192l.C8753i;
import com.google.gson.p194u.C8805a;
import com.google.gson.stream.C8691a;
import com.google.gson.stream.C8694c;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: com.google.gson.t.l.m */
/* compiled from: TypeAdapterRuntimeTypeWrapper */
final class C8764m<T> extends C8688q<T> {

    /* renamed from: a */
    private final C8668e f24909a;

    /* renamed from: b */
    private final C8688q<T> f24910b;

    /* renamed from: c */
    private final Type f24911c;

    C8764m(C8668e eVar, C8688q<T> qVar, Type type) {
        this.f24909a = eVar;
        this.f24910b = qVar;
        this.f24911c = type;
    }

    /* renamed from: a */
    public T mo32314a(C8691a aVar) throws IOException {
        return this.f24910b.mo32314a(aVar);
    }

    /* renamed from: a */
    public void mo32316a(C8694c cVar, T t) throws IOException {
        C8688q<T> qVar = this.f24910b;
        Type a = m28599a(this.f24911c, (Object) t);
        if (a != this.f24911c) {
            qVar = this.f24909a.mo32299a(C8805a.get(a));
            if (qVar instanceof C8753i.C8755b) {
                C8688q<T> qVar2 = this.f24910b;
                if (!(qVar2 instanceof C8753i.C8755b)) {
                    qVar = qVar2;
                }
            }
        }
        qVar.mo32316a(cVar, t);
    }

    /* renamed from: a */
    private Type m28599a(Type type, Object obj) {
        if (obj != null) {
            return (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type;
        }
        return type;
    }
}
