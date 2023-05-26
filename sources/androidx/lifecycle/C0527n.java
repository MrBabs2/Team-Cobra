package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.n */
/* compiled from: Lifecycling */
public class C0527n {

    /* renamed from: a */
    private static Map<Class<?>, Integer> f2185a = new HashMap();

    /* renamed from: b */
    private static Map<Class<?>, List<Constructor<? extends C0512d>>> f2186b = new HashMap();

    /* renamed from: a */
    static C0519h m2596a(Object obj) {
        boolean z = obj instanceof C0519h;
        boolean z2 = obj instanceof C0511c;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((C0511c) obj, (C0519h) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((C0511c) obj, (C0519h) null);
        }
        if (z) {
            return (C0519h) obj;
        }
        Class<?> cls = obj.getClass();
        if (m2599b(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = f2186b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m2595a((Constructor) list.get(0), obj));
        }
        C0512d[] dVarArr = new C0512d[list.size()];
        for (int i = 0; i < list.size(); i++) {
            dVarArr[i] = m2595a((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(dVarArr);
    }

    /* renamed from: b */
    private static int m2599b(Class<?> cls) {
        Integer num = f2185a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int d = m2601d(cls);
        f2185a.put(cls, Integer.valueOf(d));
        return d;
    }

    /* renamed from: c */
    private static boolean m2600c(Class<?> cls) {
        return cls != null && C0520i.class.isAssignableFrom(cls);
    }

    /* renamed from: d */
    private static int m2601d(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends C0512d> a = m2598a(cls);
        if (a != null) {
            f2186b.put(cls, Collections.singletonList(a));
            return 2;
        } else if (C0507a.f2159c.mo3019b(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m2600c(superclass)) {
                if (m2599b(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f2186b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (m2600c(cls2)) {
                    if (m2599b(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f2186b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f2186b.put(cls, arrayList);
            return 2;
        }
    }

    /* renamed from: a */
    private static C0512d m2595a(Constructor<? extends C0512d> constructor, Object obj) {
        try {
            return (C0512d) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: a */
    private static Constructor<? extends C0512d> m2598a(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String a = m2597a(canonicalName);
            if (!name.isEmpty()) {
                a = name + "." + a;
            }
            Constructor<?> declaredConstructor = Class.forName(a).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static String m2597a(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }
}
