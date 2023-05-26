package p415t.p417b.p419g;

import java.io.PrintStream;

/* renamed from: t.b.g.j */
/* compiled from: Util */
public final class C12955j {

    /* renamed from: a */
    private static C12957b f33242a = null;

    /* renamed from: b */
    private static boolean f33243b = false;

    /* renamed from: t.b.g.j$b */
    /* compiled from: Util */
    private static final class C12957b extends SecurityManager {
        private C12957b() {
        }

        /* access modifiers changed from: protected */
        public Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    private C12955j() {
    }

    /* renamed from: a */
    public static Class<?> m41899a() {
        int i;
        C12957b b = m41902b();
        if (b == null) {
            return null;
        }
        Class<?>[] classContext = b.getClassContext();
        String name = C12955j.class.getName();
        int i2 = 0;
        while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
            i2++;
        }
        if (i2 < classContext.length && (i = i2 + 2) < classContext.length) {
            return classContext[i];
        }
        throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
    }

    /* renamed from: b */
    public static boolean m41903b(String str) {
        String c = m41904c(str);
        if (c == null) {
            return false;
        }
        return c.equalsIgnoreCase("true");
    }

    /* renamed from: c */
    public static String m41904c(String str) {
        if (str != null) {
            try {
                return System.getProperty(str);
            } catch (SecurityException unused) {
                return null;
            }
        } else {
            throw new IllegalArgumentException("null input");
        }
    }

    /* renamed from: b */
    private static C12957b m41902b() {
        C12957b bVar = f33242a;
        if (bVar != null) {
            return bVar;
        }
        if (f33243b) {
            return null;
        }
        C12957b c = m41905c();
        f33242a = c;
        f33243b = true;
        return c;
    }

    /* renamed from: c */
    private static C12957b m41905c() {
        try {
            return new C12957b();
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static final void m41901a(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }

    /* renamed from: a */
    public static final void m41900a(String str) {
        PrintStream printStream = System.err;
        printStream.println("SLF4J: " + str);
    }
}
