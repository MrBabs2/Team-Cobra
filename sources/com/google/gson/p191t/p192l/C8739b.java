package com.google.gson.p191t.p192l;

import com.google.gson.C8668e;
import com.google.gson.C8688q;
import com.google.gson.C8690r;
import com.google.gson.p191t.C8696b;
import com.google.gson.p191t.C8700c;
import com.google.gson.p191t.C8727h;
import com.google.gson.p194u.C8805a;
import com.google.gson.stream.C8691a;
import com.google.gson.stream.C8693b;
import com.google.gson.stream.C8694c;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

/* renamed from: com.google.gson.t.l.b */
/* compiled from: CollectionTypeAdapterFactory */
public final class C8739b implements C8690r {

    /* renamed from: f */
    private final C8700c f24857f;

    public C8739b(C8700c cVar) {
        this.f24857f = cVar;
    }

    /* renamed from: a */
    public <T> C8688q<T> mo32358a(C8668e eVar, C8805a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type a = C8696b.m28440a(type, (Class<?>) rawType);
        return new C8740a(eVar, a, eVar.mo32299a(C8805a.get(a)), this.f24857f.mo32416a(aVar));
    }

    /* renamed from: com.google.gson.t.l.b$a */
    /* compiled from: CollectionTypeAdapterFactory */
    private static final class C8740a<E> extends C8688q<Collection<E>> {

        /* renamed from: a */
        private final C8688q<E> f24858a;

        /* renamed from: b */
        private final C8727h<? extends Collection<E>> f24859b;

        public C8740a(C8668e eVar, Type type, C8688q<E> qVar, C8727h<? extends Collection<E>> hVar) {
            this.f24858a = new C8764m(eVar, qVar, type);
            this.f24859b = hVar;
        }

        /* renamed from: a */
        public Collection<E> m28519a(C8691a aVar) throws IOException {
            if (aVar.peek() == C8693b.NULL) {
                aVar.mo32377x();
                return null;
            }
            Collection<E> collection = (Collection) this.f24859b.mo32418a();
            aVar.mo32359a();
            while (aVar.mo32367m()) {
                collection.add(this.f24858a.mo32314a(aVar));
            }
            aVar.mo32365i();
            return collection;
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, Collection<E> collection) throws IOException {
            if (collection == null) {
                cVar.mo32400p();
                return;
            }
            cVar.mo32381a();
            for (E a : collection) {
                this.f24858a.mo32316a(cVar, a);
            }
            cVar.mo32390d();
        }
    }
}
