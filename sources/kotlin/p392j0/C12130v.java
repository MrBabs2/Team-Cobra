package kotlin.p392j0;

import java.util.Comparator;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10185a0;
import kotlin.jvm.internal.C10202j;
import kotlin.p215c0.p216c.C9113l;

/* renamed from: kotlin.j0.v */
/* compiled from: StringsJVM.kt */
class C12130v extends C12129u {
    /* renamed from: a */
    public static /* synthetic */ String m40043a(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m40042a(str, c, c2, z);
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m40054b(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m40053b(str, str2, z);
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m40056c(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m40055c(str, str2, z);
    }

    /* renamed from: e */
    public static String m40057e(String str) {
        C10202j.m34178b(str, "$this$capitalize");
        if (!(str.length() > 0) || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 1);
        C10202j.m34174a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        if (substring != null) {
            String upperCase = substring.toUpperCase();
            C10202j.m34174a((Object) upperCase, "(this as java.lang.String).toUpperCase()");
            sb.append(upperCase);
            String substring2 = str.substring(1);
            C10202j.m34174a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
            sb.append(substring2);
            return sb.toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: f */
    public static String m40058f(String str) {
        C10202j.m34178b(str, "$this$decapitalize");
        if (!(str.length() > 0) || !Character.isUpperCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 1);
        C10202j.m34174a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        if (substring != null) {
            String lowerCase = substring.toLowerCase();
            C10202j.m34174a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
            sb.append(lowerCase);
            String substring2 = str.substring(1);
            C10202j.m34174a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
            sb.append(substring2);
            return sb.toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public static final String m40042a(String str, char c, char c2, boolean z) {
        C10202j.m34178b(str, "$this$replace");
        if (!z) {
            String replace = str.replace(c, c2);
            C10202j.m34174a((Object) replace, "(this as java.lang.Strin…replace(oldChar, newChar)");
            return replace;
        }
        return C12090n.m39916a(C12131w.m40097b((CharSequence) str, new char[]{c}, z, 0, 4, (Object) null), String.valueOf(c2), (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C9113l) null, 62, (Object) null);
    }

    /* renamed from: b */
    public static boolean m40053b(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        if (!z) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    /* renamed from: c */
    public static boolean m40055c(String str, String str2, boolean z) {
        C10202j.m34178b(str, "$this$startsWith");
        C10202j.m34178b(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return m40048a(str, 0, str2, 0, str2.length(), z);
    }

    /* renamed from: a */
    public static /* synthetic */ String m40045a(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m40044a(str, str2, str3, z);
    }

    /* renamed from: a */
    public static final String m40044a(String str, String str2, String str3, boolean z) {
        C10202j.m34178b(str, "$this$replace");
        C10202j.m34178b(str2, "oldValue");
        C10202j.m34178b(str3, "newValue");
        return C12090n.m39916a(C12131w.m40099b((CharSequence) str, new String[]{str2}, z, 0, 4, (Object) null), str3, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C9113l) null, 62, (Object) null);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m40050a(String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m40049a(str, str2, i, z);
    }

    /* renamed from: a */
    public static boolean m40049a(String str, String str2, int i, boolean z) {
        C10202j.m34178b(str, "$this$startsWith");
        C10202j.m34178b(str2, "prefix");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return m40048a(str, i, str2, 0, str2.length(), z);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m40052a(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m40051a(str, str2, z);
    }

    /* renamed from: a */
    public static final boolean m40051a(String str, String str2, boolean z) {
        C10202j.m34178b(str, "$this$endsWith");
        C10202j.m34178b(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return m40048a(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m40047a(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "$this$isBlank"
            kotlin.jvm.internal.C10202j.m34178b(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003e
            kotlin.g0.c r0 = kotlin.p392j0.C12131w.m40095b(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0020
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0020
        L_0x001e:
            r4 = 1
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x001e
            r3 = r0
            kotlin.y.e0 r3 = (kotlin.p262y.C10507e0) r3
            int r3 = r3.mo33492a()
            char r3 = r4.charAt(r3)
            boolean r3 = kotlin.p392j0.C12098a.m39942a((char) r3)
            if (r3 != 0) goto L_0x0024
            r4 = 0
        L_0x003c:
            if (r4 == 0) goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p392j0.C12130v.m40047a(java.lang.CharSequence):boolean");
    }

    /* renamed from: a */
    public static final boolean m40048a(String str, int i, String str2, int i2, int i3, boolean z) {
        C10202j.m34178b(str, "$this$regionMatches");
        C10202j.m34178b(str2, "other");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    /* renamed from: a */
    public static String m40041a(CharSequence charSequence, int i) {
        C10202j.m34178b(charSequence, "$this$repeat");
        int i2 = 1;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        } else if (i == 0) {
            return "";
        } else {
            if (i == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length == 0) {
                return "";
            }
            if (length != 1) {
                StringBuilder sb = new StringBuilder(charSequence.length() * i);
                if (1 <= i) {
                    while (true) {
                        sb.append(charSequence);
                        if (i2 == i) {
                            break;
                        }
                        i2++;
                    }
                }
                String sb2 = sb.toString();
                C10202j.m34174a((Object) sb2, "sb.toString()");
                return sb2;
            }
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = charAt;
            }
            return new String(cArr);
        }
    }

    /* renamed from: a */
    public static Comparator<String> m40046a(C10185a0 a0Var) {
        C10202j.m34178b(a0Var, "$this$CASE_INSENSITIVE_ORDER");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        C10202j.m34174a((Object) comparator, "java.lang.String.CASE_INSENSITIVE_ORDER");
        return comparator;
    }
}
