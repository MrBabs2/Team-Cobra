package kotlin.p392j0;

import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.j0.t */
/* compiled from: StringNumberConversionsJVM.kt */
class C12128t extends C12127s {
    /* renamed from: a */
    public static Double m40033a(String str) {
        C10202j.m34178b(str, "$this$toDoubleOrNull");
        try {
            if (C12118l.f31891a.mo38744b(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Float m40034b(String str) {
        C10202j.m34178b(str, "$this$toFloatOrNull");
        try {
            if (C12118l.f31891a.mo38744b(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
