package kotlin.reflect.jvm.internal.impl.descriptors;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.f */
/* compiled from: ClassKind */
public enum C10345f {
    CLASS,
    INTERFACE,
    ENUM_CLASS,
    ENUM_ENTRY,
    ANNOTATION_CLASS,
    OBJECT;

    /* renamed from: a */
    public boolean mo35599a() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
