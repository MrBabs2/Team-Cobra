package kotlin.reflect.jvm.internal.impl.descriptors;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.w */
/* compiled from: Modality.kt */
public enum C10388w {
    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;
    

    /* renamed from: k */
    public static final C10389a f28187k = null;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.w$a */
    /* compiled from: Modality.kt */
    public static final class C10389a {
        private C10389a() {
        }

        /* renamed from: a */
        public final C10388w mo35613a(boolean z, boolean z2) {
            if (z) {
                return C10388w.ABSTRACT;
            }
            if (z2) {
                return C10388w.OPEN;
            }
            return C10388w.FINAL;
        }

        public /* synthetic */ C10389a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        f28187k = new C10389a((DefaultConstructorMarker) null);
    }
}
