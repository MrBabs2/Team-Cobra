package kotlin.p045h0.p046u.p047e.p048k0.p247g;

import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9935c;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;

/* renamed from: kotlin.h0.u.e.k0.g.q */
/* compiled from: RenderingUtils.kt */
public final class C9991q {
    /* renamed from: a */
    public static final String m33627a(C9939f fVar) {
        C10202j.m34178b(fVar, "$this$render");
        if (m33628b(fVar)) {
            StringBuilder sb = new StringBuilder();
            String a = fVar.mo35021a();
            C10202j.m34174a((Object) a, "asString()");
            sb.append(String.valueOf('`') + a);
            sb.append('`');
            return sb.toString();
        }
        String a2 = fVar.mo35021a();
        C10202j.m34174a((Object) a2, "asString()");
        return a2;
    }

    /* renamed from: b */
    private static final boolean m33628b(C9939f fVar) {
        boolean z;
        if (fVar.mo35024e()) {
            return false;
        }
        String a = fVar.mo35021a();
        C10202j.m34174a((Object) a, "asString()");
        if (!C9984l.f27556a.contains(a)) {
            int i = 0;
            while (true) {
                if (i >= a.length()) {
                    z = false;
                    break;
                }
                char charAt = a.charAt(i);
                if (!Character.isLetterOrDigit(charAt) && charAt != '_') {
                    z = true;
                    break;
                }
                i++;
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final String m33626a(C9935c cVar) {
        C10202j.m34178b(cVar, "$this$render");
        List<C9939f> e = cVar.mo35012e();
        C10202j.m34174a((Object) e, "pathSegments()");
        return m33625a(e);
    }

    /* renamed from: a */
    public static final String m33625a(List<C9939f> list) {
        C10202j.m34178b(list, "pathSegments");
        StringBuilder sb = new StringBuilder();
        for (C9939f next : list) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(m33627a(next));
        }
        String sb2 = sb.toString();
        C10202j.m34174a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
