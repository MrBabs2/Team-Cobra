package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a;

import java.util.List;
import kotlin.C10485x;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p386l.p387m.C12019a;

/* renamed from: kotlin.h0.u.e.k0.c.a.v */
/* compiled from: propertiesConventionUtil.kt */
public final class C9635v {
    /* renamed from: a */
    public static final C9939f m31072a(C9939f fVar, boolean z) {
        C10202j.m34178b(fVar, "methodName");
        return m31071a(fVar, "set", false, z ? "is" : null, 4, (Object) null);
    }

    /* renamed from: b */
    public static final C9939f m31073b(C9939f fVar) {
        C10202j.m34178b(fVar, "methodName");
        C9939f a = m31071a(fVar, "get", false, (String) null, 12, (Object) null);
        return a != null ? a : m31071a(fVar, "is", false, (String) null, 8, (Object) null);
    }

    /* renamed from: c */
    public static final List<C9939f> m31074c(C9939f fVar) {
        C10202j.m34178b(fVar, "methodName");
        return C10529o.m35743c(m31072a(fVar, false), m31072a(fVar, true));
    }

    /* renamed from: a */
    static /* synthetic */ C9939f m31071a(C9939f fVar, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return m31070a(fVar, str, z, str2);
    }

    /* renamed from: a */
    private static final C9939f m31070a(C9939f fVar, String str, boolean z, String str2) {
        if (fVar.mo35024e()) {
            return null;
        }
        String d = fVar.mo35023d();
        C10202j.m34174a((Object) d, "methodName.identifier");
        if (!C12130v.m40056c(d, str, false, 2, (Object) null) || d.length() == str.length()) {
            return null;
        }
        char charAt = d.charAt(str.length());
        if ('a' <= charAt && 'z' >= charAt) {
            return null;
        }
        if (str2 != null) {
            if (!C10485x.f28360a || z) {
                return C9939f.m33302b(str2 + C12131w.m40069a(d, (CharSequence) str));
            }
            throw new AssertionError("Assertion failed");
        } else if (!z) {
            return fVar;
        } else {
            String a = C12019a.m39714a(C12131w.m40069a(d, (CharSequence) str), true);
            if (!C9939f.m33303c(a)) {
                return null;
            }
            return C9939f.m33302b(a);
        }
    }

    /* renamed from: a */
    public static final List<C9939f> m31069a(C9939f fVar) {
        C10202j.m34178b(fVar, "name");
        String a = fVar.mo35021a();
        C10202j.m34174a((Object) a, "name.asString()");
        if (C9631r.m31053b(a)) {
            return C10529o.m35739b(m31073b(fVar));
        }
        if (C9631r.m31054c(a)) {
            return m31074c(fVar);
        }
        return C9610e.f26499e.mo34166a(fVar);
    }
}
