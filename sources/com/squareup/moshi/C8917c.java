package com.squareup.moshi;

import com.squareup.moshi.C8924f;
import com.squareup.moshi.C8930i;
import com.squareup.moshi.p206u.C8973c;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: com.squareup.moshi.c */
/* compiled from: ClassJsonAdapter */
final class C8917c<T> extends C8924f<T> {

    /* renamed from: d */
    public static final C8924f.C8929e f25333d = new C8918a();

    /* renamed from: a */
    private final C8912b<T> f25334a;

    /* renamed from: b */
    private final C8919b<?>[] f25335b;

    /* renamed from: c */
    private final C8930i.C8931a f25336c;

    C8917c(C8912b<T> bVar, Map<String, C8919b<?>> map) {
        this.f25334a = bVar;
        this.f25335b = (C8919b[]) map.values().toArray(new C8919b[map.size()]);
        this.f25336c = C8930i.C8931a.m29357a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    public T fromJson(C8930i iVar) throws IOException {
        try {
            T a = this.f25334a.mo32833a();
            try {
                iVar.mo32868b();
                while (iVar.mo32874m()) {
                    int a2 = iVar.mo32861a(this.f25336c);
                    if (a2 == -1) {
                        iVar.mo32884y();
                        iVar.mo32885z();
                    } else {
                        this.f25335b[a2].mo32839a(iVar, (Object) a);
                    }
                }
                iVar.mo32872i();
                return a;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            C8973c.m29533a(e2);
            throw null;
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        }
    }

    public void toJson(C8939o oVar, T t) throws IOException {
        try {
            oVar.mo32893b();
            for (C8919b<?> bVar : this.f25335b) {
                oVar.mo32892a(bVar.f25337a);
                bVar.mo32840a(oVar, (Object) t);
            }
            oVar.mo32901l();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public String toString() {
        return "JsonAdapter(" + this.f25334a + ")";
    }

    /* renamed from: com.squareup.moshi.c$b */
    /* compiled from: ClassJsonAdapter */
    static class C8919b<T> {

        /* renamed from: a */
        final String f25337a;

        /* renamed from: b */
        final Field f25338b;

        /* renamed from: c */
        final C8924f<T> f25339c;

        C8919b(String str, Field field, C8924f<T> fVar) {
            this.f25337a = str;
            this.f25338b = field;
            this.f25339c = fVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo32839a(C8930i iVar, Object obj) throws IOException, IllegalAccessException {
            this.f25338b.set(obj, this.f25339c.fromJson(iVar));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo32840a(C8939o oVar, Object obj) throws IllegalAccessException, IOException {
            this.f25339c.toJson(oVar, this.f25338b.get(obj));
        }
    }

    /* renamed from: com.squareup.moshi.c$a */
    /* compiled from: ClassJsonAdapter */
    class C8918a implements C8924f.C8929e {
        C8918a() {
        }

        /* renamed from: a */
        public C8924f<?> mo32832a(Type type, Set<? extends Annotation> set, C8952r rVar) {
            if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
                return null;
            }
            Class<?> d = C8970t.m29525d(type);
            if (d.isInterface() || d.isEnum() || !set.isEmpty()) {
                return null;
            }
            if (C8973c.m29545b(d)) {
                String str = "Platform " + d;
                if (type instanceof ParameterizedType) {
                    str = str + " in " + type;
                }
                throw new IllegalArgumentException(str + " requires explicit JsonAdapter to be registered");
            } else if (d.isAnonymousClass()) {
                throw new IllegalArgumentException("Cannot serialize anonymous class " + d.getName());
            } else if (d.isLocalClass()) {
                throw new IllegalArgumentException("Cannot serialize local class " + d.getName());
            } else if (d.getEnclosingClass() != null && !Modifier.isStatic(d.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize non-static nested class " + d.getName());
            } else if (Modifier.isAbstract(d.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize abstract class " + d.getName());
            } else if (!C8973c.m29542a(d)) {
                C8912b<?> a = C8912b.m29313a(d);
                TreeMap treeMap = new TreeMap();
                while (type != Object.class) {
                    m29319a(rVar, type, (Map<String, C8919b<?>>) treeMap);
                    type = C8970t.m29524c(type);
                }
                return new C8917c(a, treeMap).nullSafe();
            } else {
                throw new IllegalArgumentException("Cannot serialize Kotlin type " + d.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapter from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
            }
        }

        /* renamed from: a */
        private void m29319a(C8952r rVar, Type type, Map<String, C8919b<?>> map) {
            Class<?> d = C8970t.m29525d(type);
            boolean b = C8973c.m29545b(d);
            for (Field field : d.getDeclaredFields()) {
                if (m29320a(b, field.getModifiers())) {
                    Type a = C8973c.m29537a(type, d, field.getGenericType());
                    Set<? extends Annotation> a2 = C8973c.m29540a((AnnotatedElement) field);
                    String name = field.getName();
                    C8924f<T> a3 = rVar.mo32971a(a, a2, name);
                    field.setAccessible(true);
                    C4746e eVar = (C4746e) field.getAnnotation(C4746e.class);
                    if (eVar != null) {
                        name = eVar.name();
                    }
                    C8919b bVar = new C8919b(name, field, a3);
                    C8919b put = map.put(name, bVar);
                    if (put != null) {
                        throw new IllegalArgumentException("Conflicting fields:\n    " + put.f25338b + "\n    " + bVar.f25338b);
                    }
                }
            }
        }

        /* renamed from: a */
        private boolean m29320a(boolean z, int i) {
            if (Modifier.isStatic(i) || Modifier.isTransient(i)) {
                return false;
            }
            if (Modifier.isPublic(i) || Modifier.isProtected(i) || !z) {
                return true;
            }
            return false;
        }
    }
}
