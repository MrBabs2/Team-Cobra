package p415t.p417b;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import p415t.p417b.p418f.C12944c;
import p415t.p417b.p418f.C12945d;
import p415t.p417b.p419g.C12950e;
import p415t.p417b.p419g.C12953h;
import p415t.p417b.p419g.C12954i;
import p415t.p417b.p419g.C12955j;
import p415t.p417b.p420h.C12961c;

/* renamed from: t.b.c */
/* compiled from: LoggerFactory */
public final class C12939c {

    /* renamed from: a */
    static volatile int f33208a;

    /* renamed from: b */
    static final C12954i f33209b = new C12954i();

    /* renamed from: c */
    static final C12950e f33210c = new C12950e();

    /* renamed from: d */
    static boolean f33211d = C12955j.m41903b("slf4j.detectLoggerNameMismatch");

    /* renamed from: e */
    private static final String[] f33212e = {"1.6", "1.7"};

    /* renamed from: f */
    private static String f33213f = "org/slf4j/impl/StaticLoggerBinder.class";

    private C12939c() {
    }

    /* renamed from: a */
    private static final void m41779a() {
        Set<URL> set = null;
        try {
            if (!m41793f()) {
                set = m41789c();
                m41790c(set);
            }
            C12961c.m41938c();
            f33208a = 3;
            m41787b(set);
            m41791d();
            m41795h();
            f33209b.mo41349a();
        } catch (NoClassDefFoundError e) {
            if (m41788b(e.getMessage())) {
                f33208a = 4;
                C12955j.m41900a("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                C12955j.m41900a("Defaulting to no-operation (NOP) logger implementation");
                C12955j.m41900a("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                return;
            }
            m41781a((Throwable) e);
            throw e;
        } catch (NoSuchMethodError e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                f33208a = 2;
                C12955j.m41900a("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                C12955j.m41900a("Your binding is version 1.5.5 or earlier.");
                C12955j.m41900a("Upgrade your binding to version 1.6.x.");
            }
            throw e2;
        } catch (Exception e3) {
            m41781a((Throwable) e3);
            throw new IllegalStateException("Unexpected initialization failure", e3);
        }
    }

    /* renamed from: b */
    private static boolean m41788b(String str) {
        if (str == null) {
            return false;
        }
        return str.contains("org/slf4j/impl/StaticLoggerBinder") || str.contains("org.slf4j.impl.StaticLoggerBinder");
    }

    /* renamed from: c */
    static Set<URL> m41789c() {
        Enumeration<URL> enumeration;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = C12939c.class.getClassLoader();
            if (classLoader == null) {
                enumeration = ClassLoader.getSystemResources(f33213f);
            } else {
                enumeration = classLoader.getResources(f33213f);
            }
            while (enumeration.hasMoreElements()) {
                linkedHashSet.add(enumeration.nextElement());
            }
        } catch (IOException e) {
            C12955j.m41901a("Error getting resources from path", e);
        }
        return linkedHashSet;
    }

    /* renamed from: d */
    private static void m41791d() {
        synchronized (f33209b) {
            f33209b.mo41352d();
            for (C12953h next : f33209b.mo41351c()) {
                next.mo41341a(m41778a(next.getName()));
            }
        }
    }

    /* renamed from: e */
    public static C12937a m41792e() {
        if (f33208a == 0) {
            synchronized (C12939c.class) {
                if (f33208a == 0) {
                    f33208a = 1;
                    m41794g();
                }
            }
        }
        int i = f33208a;
        if (i == 1) {
            return f33209b;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        } else if (i == 3) {
            return C12961c.m41938c().mo41358a();
        } else {
            if (i == 4) {
                return f33210c;
            }
            throw new IllegalStateException("Unreachable code");
        }
    }

    /* renamed from: f */
    private static boolean m41793f() {
        String c = C12955j.m41904c("java.vendor.url");
        if (c == null) {
            return false;
        }
        return c.toLowerCase().contains("android");
    }

    /* renamed from: g */
    private static final void m41794g() {
        m41779a();
        if (f33208a == 3) {
            m41796i();
        }
    }

    /* renamed from: h */
    private static void m41795h() {
        LinkedBlockingQueue<C12945d> b = f33209b.mo41350b();
        int size = b.size();
        ArrayList<C12945d> arrayList = new ArrayList<>(128);
        int i = 0;
        while (b.drainTo(arrayList, 128) != 0) {
            for (C12945d dVar : arrayList) {
                m41782a(dVar);
                int i2 = i + 1;
                if (i == 0) {
                    m41783a(dVar, size);
                }
                i = i2;
            }
            arrayList.clear();
        }
    }

    /* renamed from: i */
    private static final void m41796i() {
        try {
            String str = C12961c.f33262c;
            boolean z = false;
            for (String startsWith : f33212e) {
                if (str.startsWith(startsWith)) {
                    z = true;
                }
            }
            if (!z) {
                C12955j.m41900a("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f33212e).toString());
                C12955j.m41900a("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            }
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            C12955j.m41901a("Unexpected problem occured during version sanity check", th);
        }
    }

    /* renamed from: b */
    private static void m41786b() {
        C12955j.m41900a("The following set of substitute loggers may have been accessed");
        C12955j.m41900a("during the initialization phase. Logging calls during this");
        C12955j.m41900a("phase were not honored. However, subsequent logging calls to these");
        C12955j.m41900a("loggers will work as normally expected.");
        C12955j.m41900a("See also http://www.slf4j.org/codes.html#substituteLogger");
    }

    /* renamed from: b */
    private static void m41787b(Set<URL> set) {
        if (set != null && m41785a(set)) {
            C12955j.m41900a("Actual binding is of type [" + C12961c.m41938c().mo41359b() + "]");
        }
    }

    /* renamed from: c */
    private static void m41790c(Set<URL> set) {
        if (m41785a(set)) {
            C12955j.m41900a("Class path contains multiple SLF4J bindings.");
            for (URL url : set) {
                C12955j.m41900a("Found binding in [" + url + "]");
            }
            C12955j.m41900a("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    /* renamed from: a */
    static void m41781a(Throwable th) {
        f33208a = 2;
        C12955j.m41901a("Failed to instantiate SLF4J LoggerFactory", th);
    }

    /* renamed from: a */
    private static void m41783a(C12945d dVar, int i) {
        if (dVar.mo41324a().mo41344d()) {
            m41780a(i);
        } else if (!dVar.mo41324a().mo41345e()) {
            m41786b();
        }
    }

    /* renamed from: a */
    private static void m41782a(C12945d dVar) {
        if (dVar != null) {
            C12953h a = dVar.mo41324a();
            String name = a.getName();
            if (a.mo41347f()) {
                throw new IllegalStateException("Delegate logger cannot be null at this state.");
            } else if (!a.mo41345e()) {
                if (a.mo41344d()) {
                    a.mo41342a((C12944c) dVar);
                } else {
                    C12955j.m41900a(name);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m41780a(int i) {
        C12955j.m41900a("A number (" + i + ") of logging calls during the initialization phase have been intercepted and are");
        C12955j.m41900a("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        C12955j.m41900a("See also http://www.slf4j.org/codes.html#replay");
    }

    /* renamed from: a */
    private static boolean m41785a(Set<URL> set) {
        return set.size() > 1;
    }

    /* renamed from: a */
    public static C12938b m41778a(String str) {
        return m41792e().mo41304a(str);
    }

    /* renamed from: a */
    public static C12938b m41777a(Class<?> cls) {
        Class<?> a;
        C12938b a2 = m41778a(cls.getName());
        if (f33211d && (a = C12955j.m41899a()) != null && m41784a(cls, a)) {
            C12955j.m41900a(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", new Object[]{a2.getName(), a.getName()}));
            C12955j.m41900a("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return a2;
    }

    /* renamed from: a */
    private static boolean m41784a(Class<?> cls, Class<?> cls2) {
        return !cls2.isAssignableFrom(cls);
    }
}
