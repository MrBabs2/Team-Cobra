package androidx.lifecycle;

import androidx.lifecycle.C0514f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a */
/* compiled from: ClassesInfoCache */
class C0507a {

    /* renamed from: c */
    static C0507a f2159c = new C0507a();

    /* renamed from: a */
    private final Map<Class<?>, C0508a> f2160a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, Boolean> f2161b = new HashMap();

    /* renamed from: androidx.lifecycle.a$b */
    /* compiled from: ClassesInfoCache */
    static class C0509b {

        /* renamed from: a */
        final int f2164a;

        /* renamed from: b */
        final Method f2165b;

        C0509b(int i, Method method) {
            this.f2164a = i;
            this.f2165b = method;
            method.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3021a(C0521j jVar, C0514f.C0515a aVar, Object obj) {
            try {
                int i = this.f2164a;
                if (i == 0) {
                    this.f2165b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f2165b.invoke(obj, new Object[]{jVar});
                } else if (i == 2) {
                    this.f2165b.invoke(obj, new Object[]{jVar, aVar});
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0509b.class != obj.getClass()) {
                return false;
            }
            C0509b bVar = (C0509b) obj;
            if (this.f2164a != bVar.f2164a || !this.f2165b.getName().equals(bVar.f2165b.getName())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f2164a * 31) + this.f2165b.getName().hashCode();
        }
    }

    C0507a() {
    }

    /* renamed from: c */
    private Method[] m2557c(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0508a mo3018a(Class<?> cls) {
        C0508a aVar = this.f2160a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return m2555a(cls, (Method[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo3019b(Class<?> cls) {
        Boolean bool = this.f2161b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] c = m2557c(cls);
        for (Method annotation : c) {
            if (((C0531r) annotation.getAnnotation(C0531r.class)) != null) {
                m2555a(cls, c);
                return true;
            }
        }
        this.f2161b.put(cls, false);
        return false;
    }

    /* renamed from: androidx.lifecycle.a$a */
    /* compiled from: ClassesInfoCache */
    static class C0508a {

        /* renamed from: a */
        final Map<C0514f.C0515a, List<C0509b>> f2162a = new HashMap();

        /* renamed from: b */
        final Map<C0509b, C0514f.C0515a> f2163b;

        C0508a(Map<C0509b, C0514f.C0515a> map) {
            this.f2163b = map;
            for (Map.Entry next : map.entrySet()) {
                C0514f.C0515a aVar = (C0514f.C0515a) next.getValue();
                List list = this.f2162a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f2162a.put(aVar, list);
                }
                list.add(next.getKey());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3020a(C0521j jVar, C0514f.C0515a aVar, Object obj) {
            m2560a(this.f2162a.get(aVar), jVar, aVar, obj);
            m2560a(this.f2162a.get(C0514f.C0515a.ON_ANY), jVar, aVar, obj);
        }

        /* renamed from: a */
        private static void m2560a(List<C0509b> list, C0521j jVar, C0514f.C0515a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).mo3021a(jVar, aVar, obj);
                }
            }
        }
    }

    /* renamed from: a */
    private void m2556a(Map<C0509b, C0514f.C0515a> map, C0509b bVar, C0514f.C0515a aVar, Class<?> cls) {
        C0514f.C0515a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f2165b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* renamed from: a */
    private C0508a m2555a(Class<?> cls, Method[] methodArr) {
        int i;
        C0508a a;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (a = mo3018a(superclass)) == null)) {
            hashMap.putAll(a.f2163b);
        }
        for (Class a2 : cls.getInterfaces()) {
            for (Map.Entry next : mo3018a(a2).f2163b.entrySet()) {
                m2556a(hashMap, (C0509b) next.getKey(), (C0514f.C0515a) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m2557c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            C0531r rVar = (C0531r) method.getAnnotation(C0531r.class);
            if (rVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C0521j.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C0514f.C0515a value = rVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C0514f.C0515a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == C0514f.C0515a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m2556a(hashMap, new C0509b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0508a aVar = new C0508a(hashMap);
        this.f2160a.put(cls, aVar);
        this.f2161b.put(cls, Boolean.valueOf(z));
        return aVar;
    }
}
