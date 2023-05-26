package kotlin.p045h0.p046u.p047e.p390m0;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9539y;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;

/* renamed from: kotlin.h0.u.e.m0.y */
/* compiled from: ReflectJavaValueParameter.kt */
public final class C12066y extends C12053n implements C9539y {

    /* renamed from: a */
    private final C12063w f31819a;

    /* renamed from: b */
    private final Annotation[] f31820b;

    /* renamed from: c */
    private final String f31821c;

    /* renamed from: d */
    private final boolean f31822d;

    public C12066y(C12063w wVar, Annotation[] annotationArr, String str, boolean z) {
        C10202j.m34178b(wVar, "type");
        C10202j.m34178b(annotationArr, "reflectAnnotations");
        this.f31819a = wVar;
        this.f31820b = annotationArr;
        this.f31821c = str;
        this.f31822d = z;
    }

    public C9939f getName() {
        String str = this.f31821c;
        if (str != null) {
            return C9939f.m33300a(str);
        }
        return null;
    }

    /* renamed from: h */
    public boolean mo34029h() {
        return false;
    }

    /* renamed from: n */
    public boolean mo34074n() {
        return this.f31822d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C12066y.class.getName());
        sb.append(": ");
        sb.append(mo34074n() ? "vararg " : "");
        sb.append(getName());
        sb.append(": ");
        sb.append(getType());
        return sb.toString();
    }

    /* renamed from: a */
    public C12032c m39859a(C9934b bVar) {
        C10202j.m34178b(bVar, "fqName");
        return C12038g.m39769a(this.f31820b, bVar);
    }

    public List<C12032c> getAnnotations() {
        return C12038g.m39768a(this.f31820b);
    }

    public C12063w getType() {
        return this.f31819a;
    }
}
