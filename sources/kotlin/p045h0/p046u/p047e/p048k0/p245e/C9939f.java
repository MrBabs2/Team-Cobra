package kotlin.p045h0.p046u.p047e.p048k0.p245e;

/* renamed from: kotlin.h0.u.e.k0.e.f */
/* compiled from: Name */
public final class C9939f implements Comparable<C9939f> {

    /* renamed from: f */
    private final String f27435f;

    /* renamed from: g */
    private final boolean f27436g;

    private C9939f(String str, boolean z) {
        if (str != null) {
            this.f27435f = str;
            this.f27436g = z;
            return;
        }
        m33301a(0);
        throw null;
    }

    /* renamed from: a */
    private static /* synthetic */ void m33301a(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2) ? 2 : 3)];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[1] = "getIdentifier";
        }
        switch (i) {
            case 1:
            case 2:
                break;
            case 3:
                objArr[2] = "identifier";
                break;
            case 4:
                objArr[2] = "isValidIdentifier";
                break;
            case 5:
                objArr[2] = "special";
                break;
            case 6:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 2) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public static C9939f m33302b(String str) {
        if (str != null) {
            return new C9939f(str, false);
        }
        m33301a(3);
        throw null;
    }

    /* renamed from: c */
    public static boolean m33303c(String str) {
        if (str == null) {
            m33301a(4);
            throw null;
        } else if (str.isEmpty() || str.startsWith("<")) {
            return false;
        } else {
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt == '.' || charAt == '/' || charAt == '\\') {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public String mo35021a() {
        String str = this.f27435f;
        if (str != null) {
            return str;
        }
        m33301a(1);
        throw null;
    }

    /* renamed from: d */
    public String mo35023d() {
        if (!this.f27436g) {
            String a = mo35021a();
            if (a != null) {
                return a;
            }
            m33301a(2);
            throw null;
        }
        throw new IllegalStateException("not identifier: " + this);
    }

    /* renamed from: e */
    public boolean mo35024e() {
        return this.f27436g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9939f)) {
            return false;
        }
        C9939f fVar = (C9939f) obj;
        return this.f27436g == fVar.f27436g && this.f27435f.equals(fVar.f27435f);
    }

    public int hashCode() {
        return (this.f27435f.hashCode() * 31) + (this.f27436g ? 1 : 0);
    }

    public String toString() {
        return this.f27435f;
    }

    /* renamed from: a */
    public int compareTo(C9939f fVar) {
        return this.f27435f.compareTo(fVar.f27435f);
    }

    /* renamed from: a */
    public static C9939f m33300a(String str) {
        if (str == null) {
            m33301a(6);
            throw null;
        } else if (str.startsWith("<")) {
            return m33304d(str);
        } else {
            return m33302b(str);
        }
    }

    /* renamed from: d */
    public static C9939f m33304d(String str) {
        if (str == null) {
            m33301a(5);
            throw null;
        } else if (str.startsWith("<")) {
            return new C9939f(str, true);
        } else {
            throw new IllegalArgumentException("special name must start with '<': " + str);
        }
    }
}
