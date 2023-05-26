package kotlin.reflect.jvm.internal.impl.descriptors.p259b1;

import java.util.Map;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p247g.C9949c;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10037g;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10243c;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b1.d */
/* compiled from: AnnotationDescriptorImpl */
public class C10245d implements C10243c {

    /* renamed from: a */
    private final C11824b0 f27890a;

    /* renamed from: b */
    private final Map<C9939f, C10037g<?>> f27891b;

    /* renamed from: c */
    private final C10362n0 f27892c;

    public C10245d(C11824b0 b0Var, Map<C9939f, C10037g<?>> map, C10362n0 n0Var) {
        if (b0Var == null) {
            m34274a(0);
            throw null;
        } else if (map == null) {
            m34274a(1);
            throw null;
        } else if (n0Var != null) {
            this.f27890a = b0Var;
            this.f27891b = map;
            this.f27892c = n0Var;
        } else {
            m34274a(2);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m34274a(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 3 || i == 4 || i == 5) ? 2 : 3)];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = "source";
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 3 || i == 4 || i == 5)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 3 || i == 4 || i == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: a */
    public Map<C9939f, C10037g<?>> mo33921a() {
        Map<C9939f, C10037g<?>> map = this.f27891b;
        if (map != null) {
            return map;
        }
        m34274a(4);
        throw null;
    }

    /* renamed from: c */
    public C9934b mo33922c() {
        return C10243c.C10244a.m34273a(this);
    }

    public C11824b0 getType() {
        C11824b0 b0Var = this.f27890a;
        if (b0Var != null) {
            return b0Var;
        }
        m34274a(3);
        throw null;
    }

    /* renamed from: p */
    public C10362n0 mo33925p() {
        C10362n0 n0Var = this.f27892c;
        if (n0Var != null) {
            return n0Var;
        }
        m34274a(5);
        throw null;
    }

    public String toString() {
        return C9949c.f27453a.mo35036a((C10243c) this, (C10246e) null);
    }
}
