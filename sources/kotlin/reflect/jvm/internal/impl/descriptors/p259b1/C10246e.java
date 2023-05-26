package kotlin.reflect.jvm.internal.impl.descriptors.p259b1;

import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b1.e */
/* compiled from: AnnotationUseSiteTarget.kt */
public enum C10246e {
    FIELD((String) null, 1, (String) null),
    FILE((String) null, 1, (String) null),
    PROPERTY((String) null, 1, (String) null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER((String) null, 1, (String) null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");
    

    /* renamed from: f */
    private final String f27903f;

    private C10246e(String str) {
        if (str == null) {
            String name = name();
            if (name != null) {
                str = name.toLowerCase();
                C10202j.m34174a((Object) str, "(this as java.lang.String).toLowerCase()");
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        this.f27903f = str;
    }

    /* renamed from: a */
    public final String mo35427a() {
        return this.f27903f;
    }
}
