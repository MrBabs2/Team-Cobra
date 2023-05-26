package kotlin.jvm.internal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C9125d;
import kotlin.jvm.internal.p258c0.C10190a;
import kotlin.jvm.internal.p258c0.C10191b;
import kotlin.jvm.internal.p258c0.C10194e;
import kotlin.p215c0.p216c.C9102a;
import kotlin.p215c0.p216c.C9103b;
import kotlin.p215c0.p216c.C9104c;
import kotlin.p215c0.p216c.C9105d;
import kotlin.p215c0.p216c.C9106e;
import kotlin.p215c0.p216c.C9107f;
import kotlin.p215c0.p216c.C9108g;
import kotlin.p215c0.p216c.C9109h;
import kotlin.p215c0.p216c.C9110i;
import kotlin.p215c0.p216c.C9111j;
import kotlin.p215c0.p216c.C9112k;
import kotlin.p215c0.p216c.C9113l;
import kotlin.p215c0.p216c.C9114m;
import kotlin.p215c0.p216c.C9115n;
import kotlin.p215c0.p216c.C9116o;
import kotlin.p215c0.p216c.C9117p;
import kotlin.p215c0.p216c.C9118q;
import kotlin.p215c0.p216c.C9119r;
import kotlin.p215c0.p216c.C9120s;
import kotlin.p215c0.p216c.C9121t;
import kotlin.p215c0.p216c.C9122u;
import kotlin.p215c0.p216c.C9123v;
import kotlin.p215c0.p216c.C9124w;

/* renamed from: kotlin.jvm.internal.b0 */
/* compiled from: TypeIntrinsics */
public class C10187b0 {
    /* renamed from: a */
    private static <T extends Throwable> T m34141a(T t) {
        C10202j.m34171a(t, C10187b0.class.getName());
        return t;
    }

    /* renamed from: b */
    public static List m34145b(Object obj) {
        if (!(obj instanceof C10190a) || (obj instanceof C10194e)) {
            return m34150f(obj);
        }
        m34143a(obj, "kotlin.collections.MutableList");
        throw null;
    }

    /* renamed from: c */
    public static Map m34147c(Object obj) {
        if (!(obj instanceof C10190a)) {
            return m34151g(obj);
        }
        m34143a(obj, "kotlin.collections.MutableMap");
        throw null;
    }

    /* renamed from: d */
    public static Set m34148d(Object obj) {
        if (!(obj instanceof C10190a)) {
            return m34152h(obj);
        }
        m34143a(obj, "kotlin.collections.MutableSet");
        throw null;
    }

    /* renamed from: e */
    public static Collection m34149e(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            m34139a(e);
            throw null;
        }
    }

    /* renamed from: f */
    public static List m34150f(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            m34139a(e);
            throw null;
        }
    }

    /* renamed from: g */
    public static Map m34151g(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            m34139a(e);
            throw null;
        }
    }

    /* renamed from: h */
    public static Set m34152h(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            m34139a(e);
            throw null;
        }
    }

    /* renamed from: i */
    public static int m34153i(Object obj) {
        if (obj instanceof C10199g) {
            return ((C10199g) obj).getArity();
        }
        if (obj instanceof C9102a) {
            return 0;
        }
        if (obj instanceof C9113l) {
            return 1;
        }
        if (obj instanceof C9117p) {
            return 2;
        }
        if (obj instanceof C9118q) {
            return 3;
        }
        if (obj instanceof C9119r) {
            return 4;
        }
        if (obj instanceof C9120s) {
            return 5;
        }
        if (obj instanceof C9121t) {
            return 6;
        }
        if (obj instanceof C9122u) {
            return 7;
        }
        if (obj instanceof C9123v) {
            return 8;
        }
        if (obj instanceof C9124w) {
            return 9;
        }
        if (obj instanceof C9103b) {
            return 10;
        }
        if (obj instanceof C9104c) {
            return 11;
        }
        if (obj instanceof C9105d) {
            return 12;
        }
        if (obj instanceof C9106e) {
            return 13;
        }
        if (obj instanceof C9107f) {
            return 14;
        }
        if (obj instanceof C9108g) {
            return 15;
        }
        if (obj instanceof C9109h) {
            return 16;
        }
        if (obj instanceof C9110i) {
            return 17;
        }
        if (obj instanceof C9111j) {
            return 18;
        }
        if (obj instanceof C9112k) {
            return 19;
        }
        if (obj instanceof C9114m) {
            return 20;
        }
        if (obj instanceof C9115n) {
            return 21;
        }
        return obj instanceof C9116o ? 22 : -1;
    }

    /* renamed from: a */
    public static void m34143a(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        m34144a(name + " cannot be cast to " + str);
        throw null;
    }

    /* renamed from: a */
    public static void m34144a(String str) {
        m34139a(new ClassCastException(str));
        throw null;
    }

    /* renamed from: b */
    public static boolean m34146b(Object obj, int i) {
        return (obj instanceof C9125d) && m34153i(obj) == i;
    }

    /* renamed from: a */
    public static ClassCastException m34139a(ClassCastException classCastException) {
        m34141a(classCastException);
        throw classCastException;
    }

    /* renamed from: a */
    public static Collection m34142a(Object obj) {
        if (!(obj instanceof C10190a) || (obj instanceof C10191b)) {
            return m34149e(obj);
        }
        m34143a(obj, "kotlin.collections.MutableCollection");
        throw null;
    }

    /* renamed from: a */
    public static Object m34140a(Object obj, int i) {
        if (obj == null || m34146b(obj, i)) {
            return obj;
        }
        m34143a(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }
}
