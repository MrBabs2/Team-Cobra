package kotlin.reflect.jvm.internal.impl.descriptors.p259b1;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b1.b */
/* compiled from: AnnotatedImpl */
public class C10242b implements C10241a {

    /* renamed from: f */
    private final C10249g f27889f;

    public C10242b(C10249g gVar) {
        if (gVar != null) {
            this.f27889f = gVar;
        } else {
            m34269a(0);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m34269a(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 1 ? 3 : 2)];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw (i != 1 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public C10249g getAnnotations() {
        C10249g gVar = this.f27889f;
        if (gVar != null) {
            return gVar;
        }
        m34269a(1);
        throw null;
    }
}
