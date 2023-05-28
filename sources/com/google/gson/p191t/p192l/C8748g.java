package com.google.gson.p191t.p192l;

import com.google.gson.C8668e;
import com.google.gson.C8679j;
import com.google.gson.C8682m;
import com.google.gson.C8688q;
import com.google.gson.C8690r;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p191t.C8696b;
import com.google.gson.p191t.C8700c;
import com.google.gson.p191t.C8717e;
import com.google.gson.p191t.C8727h;
import com.google.gson.p191t.C8729j;
import com.google.gson.p194u.C8805a;
import com.google.gson.stream.C8691a;
import com.google.gson.stream.C8693b;
import com.google.gson.stream.C8694c;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.gson.t.l.g */
/* compiled from: MapTypeAdapterFactory */
public final class C8748g implements C8690r {

    /* renamed from: f */
    private final C8700c f24874f;

    /* renamed from: g */
    final boolean f24875g;

    public C8748g(C8700c cVar, boolean z) {
        this.f24874f = cVar;
        this.f24875g = z;
    }

    /* renamed from: a */
    public <T> C8688q<T> mo32358a(C8668e eVar, C8805a<T> aVar) {
        Type type = aVar.getType();
        if (!Map.class.isAssignableFrom(aVar.getRawType())) {
            return null;
        }
        Type[] b = C8696b.m28449b(type, C8696b.m28452e(type));
        return new C8749a(eVar, b[0], m28562a(eVar, b[0]), b[1], eVar.mo32299a(C8805a.get(b[1])), this.f24874f.mo32416a(aVar));
    }

    /* renamed from: com.google.gson.t.l.g$a */
    /* compiled from: MapTypeAdapterFactory */
    private final class C8749a<K, V> extends C8688q<Map<K, V>> {

        /* renamed from: a */
        private final C8688q<K> f24876a;

        /* renamed from: b */
        private final C8688q<V> f24877b;

        /* renamed from: c */
        private final C8727h<? extends Map<K, V>> f24878c;

        public C8749a(C8668e eVar, Type type, C8688q<K> qVar, Type type2, C8688q<V> qVar2, C8727h<? extends Map<K, V>> hVar) {
            this.f24876a = new C8764m(eVar, qVar, type);
            this.f24877b = new C8764m(eVar, qVar2, type2);
            this.f24878c = hVar;
        }

        /* renamed from: a */
        public Map<K, V> m28566a(C8691a aVar) throws IOException {
            C8693b peek = aVar.peek();
            if (peek == C8693b.NULL) {
                aVar.mo32377x();
                return null;
            }
            Map<K, V> map = (Map) this.f24878c.mo32418a();
            if (peek == C8693b.BEGIN_ARRAY) {
                aVar.mo32359a();
                while (aVar.mo32367m()) {
                    aVar.mo32359a();
                    K a = this.f24876a.mo32314a(aVar);
                    if (map.put(a, this.f24877b.mo32314a(aVar)) == null) {
                        aVar.mo32365i();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + a);
                    }
                }
                aVar.mo32365i();
            } else {
                aVar.mo32361b();
                while (aVar.mo32367m()) {
                    C8717e.f24821a.mo32380a(aVar);
                    K a2 = this.f24876a.mo32314a(aVar);
                    if (map.put(a2, this.f24877b.mo32314a(aVar)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + a2);
                    }
                }
                aVar.mo32366l();
            }
            return map;
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, Map<K, V> map) throws IOException {
            if (map == null) {
                cVar.mo32400p();
            } else if (!C8748g.this.f24875g) {
                cVar.mo32386b();
                for (Map.Entry next : map.entrySet()) {
                    cVar.mo32384a(String.valueOf(next.getKey()));
                    this.f24877b.mo32316a(cVar, next.getValue());
                }
                cVar.mo32396i();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Map.Entry next2 : map.entrySet()) {
                    C8679j a = this.f24876a.mo32356a(next2.getKey());
                    arrayList.add(a);
                    arrayList2.add(next2.getValue());
                    z |= a.mo32331d() || a.mo32333g();
                }
                if (z) {
                    cVar.mo32381a();
                    int size = arrayList.size();
                    while (i < size) {
                        cVar.mo32381a();
                        C8729j.m28506a((C8679j) arrayList.get(i), cVar);
                        this.f24877b.mo32316a(cVar, arrayList2.get(i));
                        cVar.mo32390d();
                        i++;
                    }
                    cVar.mo32390d();
                    return;
                }
                cVar.mo32386b();
                int size2 = arrayList.size();
                while (i < size2) {
                    cVar.mo32384a(m28564a((C8679j) arrayList.get(i)));
                    this.f24877b.mo32316a(cVar, arrayList2.get(i));
                    i++;
                }
                cVar.mo32396i();
            }
        }

        /* renamed from: a */
        private String m28564a(C8679j jVar) {
            if (jVar.mo32334h()) {
                C8682m c = jVar.mo32330c();
                if (c.mo32353x()) {
                    return String.valueOf(c.mo32350t());
                }
                if (c.mo32352v()) {
                    return Boolean.toString(c.mo32345j());
                }
                if (c.mo32354y()) {
                    return c.mo32351u();
                }
                throw new AssertionError();
            } else if (jVar.mo32332f()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: a */
    private C8688q<?> m28562a(C8668e eVar, Type type) {
        if (type == Boolean.TYPE || type == Boolean.class) {
            return C8765n.f24943f;
        }
        return eVar.mo32299a(C8805a.get(type));
    }
}
