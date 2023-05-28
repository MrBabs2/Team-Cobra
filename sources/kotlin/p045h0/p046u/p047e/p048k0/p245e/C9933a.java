package kotlin.p045h0.p046u.p047e.p048k0.p245e;

/* renamed from: kotlin.h0.u.e.k0.e.a */
/* compiled from: ClassId */
public final class C9933a {

    /* renamed from: a */
    private final C9934b f27421a;

    /* renamed from: b */
    private final C9934b f27422b;

    /* renamed from: c */
    private final boolean f27423c;

    public C9933a(C9934b bVar, C9934b bVar2, boolean z) {
        if (bVar == null) {
            m33261a(1);
            throw null;
        } else if (bVar2 != null) {
            this.f27421a = bVar;
            this.f27422b = bVar2;
            this.f27423c = z;
        } else {
            m33261a(2);
            throw null;
        }
    }

    /* renamed from: a */
    public static C9933a m33260a(C9934b bVar) {
        if (bVar != null) {
            return new C9933a(bVar.mo34998c(), bVar.mo35000e());
        }
        m33261a(0);
        throw null;
    }

    /* renamed from: a */
    private static /* synthetic */ void m33261a(int i) {
        String str = (i == 5 || i == 6 || i == 7 || i == 9 || i == 13 || i == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 5 || i == 6 || i == 7 || i == 9 || i == 13 || i == 14) ? 2 : 3)];
        switch (i) {
            case 1:
            case 3:
                objArr[0] = "packageFqName";
                break;
            case 2:
                objArr[0] = "relativeClassName";
                break;
            case 4:
                objArr[0] = "topLevelName";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 10:
                objArr[0] = "segment";
                break;
            case 11:
            case 12:
                objArr[0] = "string";
                break;
            default:
                objArr[0] = "topLevelFqName";
                break;
        }
        if (i == 5) {
            objArr[1] = "getPackageFqName";
        } else if (i == 6) {
            objArr[1] = "getRelativeClassName";
        } else if (i == 7) {
            objArr[1] = "getShortClassName";
        } else if (i == 9) {
            objArr[1] = "asSingleFqName";
        } else if (i == 13 || i == 14) {
            objArr[1] = "asString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                objArr[2] = "<init>";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
                break;
            case 8:
                objArr[2] = "createNestedClassId";
                break;
            case 10:
                objArr[2] = "startsWith";
                break;
            case 11:
            case 12:
                objArr[2] = "fromString";
                break;
            default:
                objArr[2] = "topLevel";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 5 || i == 6 || i == 7 || i == 9 || i == 13 || i == 14) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public String mo34984b() {
        if (this.f27421a.mo34996b()) {
            String a = this.f27422b.mo34994a();
            if (a != null) {
                return a;
            }
            m33261a(13);
            throw null;
        }
        String str = this.f27421a.mo34994a().replace('.', '/') + "/" + this.f27422b.mo34994a();
        if (str != null) {
            return str;
        }
        m33261a(14);
        throw null;
    }

    /* renamed from: c */
    public C9933a mo34985c() {
        C9934b c = this.f27422b.mo34998c();
        if (c.mo34996b()) {
            return null;
        }
        return new C9933a(mo34986d(), c, this.f27423c);
    }

    /* renamed from: d */
    public C9934b mo34986d() {
        C9934b bVar = this.f27421a;
        if (bVar != null) {
            return bVar;
        }
        m33261a(5);
        throw null;
    }

    /* renamed from: e */
    public C9934b mo34987e() {
        C9934b bVar = this.f27422b;
        if (bVar != null) {
            return bVar;
        }
        m33261a(6);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9933a.class != obj.getClass()) {
            return false;
        }
        C9933a aVar = (C9933a) obj;
        if (!this.f27421a.equals(aVar.f27421a) || !this.f27422b.equals(aVar.f27422b) || this.f27423c != aVar.f27423c) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C9939f mo34989f() {
        C9939f e = this.f27422b.mo35000e();
        if (e != null) {
            return e;
        }
        m33261a(7);
        throw null;
    }

    /* renamed from: g */
    public boolean mo34990g() {
        return this.f27423c;
    }

    /* renamed from: h */
    public boolean mo34991h() {
        return !this.f27422b.mo34998c().mo34996b();
    }

    public int hashCode() {
        return (((this.f27421a.hashCode() * 31) + this.f27422b.hashCode()) * 31) + Boolean.valueOf(this.f27423c).hashCode();
    }

    public String toString() {
        if (!this.f27421a.mo34996b()) {
            return mo34984b();
        }
        return "/" + mo34984b();
    }

    /* renamed from: a */
    public C9933a mo34982a(C9939f fVar) {
        if (fVar != null) {
            return new C9933a(mo34986d(), this.f27422b.mo34995a(fVar), this.f27423c);
        }
        m33261a(8);
        throw null;
    }

    /* renamed from: a */
    public C9934b mo34983a() {
        if (this.f27421a.mo34996b()) {
            C9934b bVar = this.f27422b;
            if (bVar != null) {
                return bVar;
            }
            m33261a(9);
            throw null;
        }
        return new C9934b(this.f27421a.mo34994a() + "." + this.f27422b.mo34994a());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C9933a(C9934b bVar, C9939f fVar) {
        this(bVar, C9934b.m33272c(fVar), false);
        if (bVar == null) {
            m33261a(3);
            throw null;
        } else if (fVar != null) {
        } else {
            m33261a(4);
            throw null;
        }
    }

    /* renamed from: a */
    public static C9933a m33258a(String str) {
        if (str != null) {
            return m33259a(str, false);
        }
        m33261a(11);
        throw null;
    }

    /* renamed from: a */
    public static C9933a m33259a(String str, boolean z) {
        if (str != null) {
            return new C9933a(new C9934b(C12131w.m40111d(str, '/', "").replace('/', '.')), new C9934b(C12131w.m40091b(str, '/', str)), z);
        }
        m33261a(12);
        throw null;
    }
}
