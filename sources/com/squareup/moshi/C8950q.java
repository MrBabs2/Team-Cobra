package com.squareup.moshi;

import com.squareup.moshi.C8924f;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

/* renamed from: com.squareup.moshi.q */
/* compiled from: MapJsonAdapter */
final class C8950q<K, V> extends C8924f<Map<K, V>> {

    /* renamed from: c */
    public static final C8924f.C8929e f25426c = new C8951a();

    /* renamed from: a */
    private final C8924f<K> f25427a;

    /* renamed from: b */
    private final C8924f<V> f25428b;

    /* renamed from: com.squareup.moshi.q$a */
    /* compiled from: MapJsonAdapter */
    class C8951a implements C8924f.C8929e {
        C8951a() {
        }

        /* renamed from: a */
        public C8924f<?> mo32832a(Type type, Set<? extends Annotation> set, C8952r rVar) {
            Class<?> d;
            if (!set.isEmpty() || (d = C8970t.m29525d(type)) != Map.class) {
                return null;
            }
            Type[] b = C8970t.m29523b(type, d);
            return new C8950q(rVar, b[0], b[1]).nullSafe();
        }
    }

    C8950q(C8952r rVar, Type type, Type type2) {
        this.f25427a = rVar.mo32969a(type);
        this.f25428b = rVar.mo32969a(type2);
    }

    /* renamed from: a */
    public void toJson(C8939o oVar, Map<K, V> map) throws IOException {
        oVar.mo32893b();
        for (Map.Entry next : map.entrySet()) {
            if (next.getKey() != null) {
                oVar.mo32922u();
                this.f25427a.toJson(oVar, next.getKey());
                this.f25428b.toJson(oVar, next.getValue());
            } else {
                throw new JsonDataException("Map key is null at " + oVar.getPath());
            }
        }
        oVar.mo32901l();
    }

    public String toString() {
        return "JsonAdapter(" + this.f25427a + "=" + this.f25428b + ")";
    }

    public Map<K, V> fromJson(C8930i iVar) throws IOException {
        C8940p pVar = new C8940p();
        iVar.mo32868b();
        while (iVar.mo32874m()) {
            iVar.mo32883x();
            K fromJson = this.f25427a.fromJson(iVar);
            V fromJson2 = this.f25428b.fromJson(iVar);
            Object put = pVar.put(fromJson, fromJson2);
            if (put != null) {
                throw new JsonDataException("Map key '" + fromJson + "' has multiple values at path " + iVar.getPath() + ": " + put + " and " + fromJson2);
            }
        }
        iVar.mo32872i();
        return pVar;
    }
}
