package com.google.gson.p191t;

import com.google.gson.C8675f;
import com.google.gson.JsonIOException;
import com.google.gson.p194u.C8805a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* renamed from: com.google.gson.t.c */
/* compiled from: ConstructorConstructor */
public final class C8700c {

    /* renamed from: a */
    private final Map<Type, C8675f<?>> f24798a;

    /* renamed from: com.google.gson.t.c$a */
    /* compiled from: ConstructorConstructor */
    class C8701a implements C8727h<T> {
        C8701a(C8700c cVar) {
        }

        /* renamed from: a */
        public T mo32418a() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: com.google.gson.t.c$b */
    /* compiled from: ConstructorConstructor */
    class C8702b implements C8727h<T> {
        C8702b(C8700c cVar) {
        }

        /* renamed from: a */
        public T mo32418a() {
            return new TreeMap();
        }
    }

    /* renamed from: com.google.gson.t.c$c */
    /* compiled from: ConstructorConstructor */
    class C8703c implements C8727h<T> {
        C8703c(C8700c cVar) {
        }

        /* renamed from: a */
        public T mo32418a() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: com.google.gson.t.c$d */
    /* compiled from: ConstructorConstructor */
    class C8704d implements C8727h<T> {
        C8704d(C8700c cVar) {
        }

        /* renamed from: a */
        public T mo32418a() {
            return new C8719g();
        }
    }

    /* renamed from: com.google.gson.t.c$e */
    /* compiled from: ConstructorConstructor */
    class C8705e implements C8727h<T> {

        /* renamed from: a */
        private final C8732k f24799a = C8732k.m28507a();

        /* renamed from: b */
        final /* synthetic */ Class f24800b;

        /* renamed from: c */
        final /* synthetic */ Type f24801c;

        C8705e(C8700c cVar, Class cls, Type type) {
            this.f24800b = cls;
            this.f24801c = type;
        }

        /* renamed from: a */
        public T mo32418a() {
            try {
                return this.f24799a.mo32474a(this.f24800b);
            } catch (Exception e) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f24801c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e);
            }
        }
    }

    /* renamed from: com.google.gson.t.c$f */
    /* compiled from: ConstructorConstructor */
    class C8706f implements C8727h<T> {

        /* renamed from: a */
        final /* synthetic */ C8675f f24802a;

        /* renamed from: b */
        final /* synthetic */ Type f24803b;

        C8706f(C8700c cVar, C8675f fVar, Type type) {
            this.f24802a = fVar;
            this.f24803b = type;
        }

        /* renamed from: a */
        public T mo32418a() {
            return this.f24802a.mo32322a(this.f24803b);
        }
    }

    /* renamed from: com.google.gson.t.c$g */
    /* compiled from: ConstructorConstructor */
    class C8707g implements C8727h<T> {

        /* renamed from: a */
        final /* synthetic */ C8675f f24804a;

        /* renamed from: b */
        final /* synthetic */ Type f24805b;

        C8707g(C8700c cVar, C8675f fVar, Type type) {
            this.f24804a = fVar;
            this.f24805b = type;
        }

        /* renamed from: a */
        public T mo32418a() {
            return this.f24804a.mo32322a(this.f24805b);
        }
    }

    /* renamed from: com.google.gson.t.c$h */
    /* compiled from: ConstructorConstructor */
    class C8708h implements C8727h<T> {

        /* renamed from: a */
        final /* synthetic */ Constructor f24806a;

        C8708h(C8700c cVar, Constructor constructor) {
            this.f24806a = constructor;
        }

        /* renamed from: a */
        public T mo32418a() {
            try {
                return this.f24806a.newInstance((Object[]) null);
            } catch (InstantiationException e) {
                throw new RuntimeException("Failed to invoke " + this.f24806a + " with no args", e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to invoke " + this.f24806a + " with no args", e2.getTargetException());
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        }
    }

    /* renamed from: com.google.gson.t.c$i */
    /* compiled from: ConstructorConstructor */
    class C8709i implements C8727h<T> {
        C8709i(C8700c cVar) {
        }

        /* renamed from: a */
        public T mo32418a() {
            return new TreeSet();
        }
    }

    /* renamed from: com.google.gson.t.c$j */
    /* compiled from: ConstructorConstructor */
    class C8710j implements C8727h<T> {

        /* renamed from: a */
        final /* synthetic */ Type f24807a;

        C8710j(C8700c cVar, Type type) {
            this.f24807a = type;
        }

        /* renamed from: a */
        public T mo32418a() {
            Type type = this.f24807a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new JsonIOException("Invalid EnumSet type: " + this.f24807a.toString());
            }
            throw new JsonIOException("Invalid EnumSet type: " + this.f24807a.toString());
        }
    }

    /* renamed from: com.google.gson.t.c$k */
    /* compiled from: ConstructorConstructor */
    class C8711k implements C8727h<T> {
        C8711k(C8700c cVar) {
        }

        /* renamed from: a */
        public T mo32418a() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: com.google.gson.t.c$l */
    /* compiled from: ConstructorConstructor */
    class C8712l implements C8727h<T> {
        C8712l(C8700c cVar) {
        }

        /* renamed from: a */
        public T mo32418a() {
            return new ArrayDeque();
        }
    }

    /* renamed from: com.google.gson.t.c$m */
    /* compiled from: ConstructorConstructor */
    class C8713m implements C8727h<T> {
        C8713m(C8700c cVar) {
        }

        /* renamed from: a */
        public T mo32418a() {
            return new ArrayList();
        }
    }

    /* renamed from: com.google.gson.t.c$n */
    /* compiled from: ConstructorConstructor */
    class C8714n implements C8727h<T> {
        C8714n(C8700c cVar) {
        }

        /* renamed from: a */
        public T mo32418a() {
            return new ConcurrentSkipListMap();
        }
    }

    public C8700c(Map<Type, C8675f<?>> map) {
        this.f24798a = map;
    }

    /* renamed from: b */
    private <T> C8727h<T> m28458b(Type type, Class<? super T> cls) {
        return new C8705e(this, cls, type);
    }

    /* renamed from: a */
    public <T> C8727h<T> mo32416a(C8805a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        C8675f fVar = this.f24798a.get(type);
        if (fVar != null) {
            return new C8706f(this, fVar, type);
        }
        C8675f fVar2 = this.f24798a.get(rawType);
        if (fVar2 != null) {
            return new C8707g(this, fVar2, type);
        }
        C8727h<T> a = m28456a(rawType);
        if (a != null) {
            return a;
        }
        C8727h<T> a2 = m28457a(type, rawType);
        if (a2 != null) {
            return a2;
        }
        return m28458b(type, rawType);
    }

    public String toString() {
        return this.f24798a.toString();
    }

    /* renamed from: a */
    private <T> C8727h<T> m28456a(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return new C8708h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private <T> C8727h<T> m28457a(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new C8709i(this);
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new C8710j(this, type);
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new C8711k(this);
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new C8712l(this);
            }
            return new C8713m(this);
        } else if (!Map.class.isAssignableFrom(cls)) {
            return null;
        } else {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new C8714n(this);
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new C8701a(this);
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new C8702b(this);
            }
            if (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(C8805a.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) {
                return new C8704d(this);
            }
            return new C8703c(this);
        }
    }
}
