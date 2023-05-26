package kotlin.p045h0.p046u.p047e.p048k0.p386l.p387m;

import java.util.Iterator;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.h0.u.e.k0.l.m.a */
/* compiled from: capitalizeDecapitalize.kt */
public final class C12019a {
    /* renamed from: a */
    public static final String m39714a(String str, boolean z) {
        Object obj;
        C10202j.m34178b(str, "$this$decapitalizeSmartForCompiler");
        if ((str.length() == 0) || !m39715a(str, 0, z)) {
            return str;
        }
        if (str.length() == 1 || !m39715a(str, 1, z)) {
            return z ? m39716b(str) : C12130v.m40058f(str);
        }
        Iterator it = C12131w.m40095b(str).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!m39715a(str, ((Number) obj).intValue(), z)) {
                break;
            }
        }
        Integer num = (Integer) obj;
        if (num == null) {
            return m39717b(str, z);
        }
        int intValue = num.intValue() - 1;
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, intValue);
        C10202j.m34174a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb.append(m39717b(substring, z));
        String substring2 = str.substring(intValue);
        C10202j.m34174a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
        sb.append(substring2);
        return sb.toString();
    }

    /* renamed from: b */
    private static final String m39717b(String str, boolean z) {
        if (z) {
            return m39718c(str);
        }
        if (str != null) {
            String lowerCase = str.toLowerCase();
            C10202j.m34174a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
            return lowerCase;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: c */
    public static final String m39718c(String str) {
        C10202j.m34178b(str, "$this$toLowerCaseAsciiOnly");
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('A' <= charAt && 'Z' >= charAt) {
                charAt = Character.toLowerCase(charAt);
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        C10202j.m34174a((Object) sb2, "builder.toString()");
        return sb2;
    }

    /* renamed from: b */
    public static final String m39716b(String str) {
        char charAt;
        C10202j.m34178b(str, "$this$decapitalizeAsciiOnly");
        if ((str.length() == 0) || 'A' > (charAt = str.charAt(0)) || 'Z' < charAt) {
            return str;
        }
        char lowerCase = Character.toLowerCase(charAt);
        String substring = str.substring(1);
        C10202j.m34174a((Object) substring, "(this as java.lang.String).substring(startIndex)");
        return String.valueOf(lowerCase) + substring;
    }

    /* renamed from: a */
    private static final boolean m39715a(String str, int i, boolean z) {
        char charAt = str.charAt(i);
        if (z) {
            return 'A' <= charAt && 'Z' >= charAt;
        }
        return Character.isUpperCase(charAt);
    }

    /* renamed from: a */
    public static final String m39713a(String str) {
        char charAt;
        C10202j.m34178b(str, "$this$capitalizeAsciiOnly");
        if ((str.length() == 0) || 'a' > (charAt = str.charAt(0)) || 'z' < charAt) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        String substring = str.substring(1);
        C10202j.m34174a((Object) substring, "(this as java.lang.String).substring(startIndex)");
        return String.valueOf(upperCase) + substring;
    }
}
