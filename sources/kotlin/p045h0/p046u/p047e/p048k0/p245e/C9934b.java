package kotlin.p045h0.p046u.p047e.p048k0.p245e;

import java.util.List;

/* renamed from: kotlin.h0.u.e.k0.e.b */
/* compiled from: FqName */
public final class C9934b {

    /* renamed from: c */
    public static final C9934b f27424c = new C9934b("");

    /* renamed from: a */
    private final C9935c f27425a;

    /* renamed from: b */
    private transient C9934b f27426b;

    public C9934b(String str) {
        if (str != null) {
            this.f27425a = new C9935c(str, this);
        } else {
            m33271a(1);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m33271a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
                objArr[2] = "startsWith";
                break;
            case 13:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: a */
    public String mo34994a() {
        String a = this.f27425a.mo35006a();
        if (a != null) {
            return a;
        }
        m33271a(4);
        throw null;
    }

    /* renamed from: b */
    public boolean mo34996b() {
        return this.f27425a.mo35008b();
    }

    /* renamed from: c */
    public C9934b mo34998c() {
        C9934b bVar = this.f27426b;
        if (bVar != null) {
            if (bVar != null) {
                return bVar;
            }
            m33271a(6);
            throw null;
        } else if (!mo34996b()) {
            C9934b bVar2 = new C9934b(this.f27425a.mo35011d());
            this.f27426b = bVar2;
            if (bVar2 != null) {
                return bVar2;
            }
            m33271a(7);
            throw null;
        } else {
            throw new IllegalStateException("root");
        }
    }

    /* renamed from: d */
    public List<C9939f> mo34999d() {
        List<C9939f> e = this.f27425a.mo35012e();
        if (e != null) {
            return e;
        }
        m33271a(11);
        throw null;
    }

    /* renamed from: e */
    public C9939f mo35000e() {
        C9939f f = this.f27425a.mo35014f();
        if (f != null) {
            return f;
        }
        m33271a(9);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9934b) && this.f27425a.equals(((C9934b) obj).f27425a);
    }

    /* renamed from: f */
    public C9939f mo35002f() {
        C9939f g = this.f27425a.mo35015g();
        if (g != null) {
            return g;
        }
        m33271a(10);
        throw null;
    }

    /* renamed from: g */
    public C9935c mo35003g() {
        C9935c cVar = this.f27425a;
        if (cVar != null) {
            return cVar;
        }
        m33271a(5);
        throw null;
    }

    public int hashCode() {
        return this.f27425a.hashCode();
    }

    public String toString() {
        return this.f27425a.toString();
    }

    /* renamed from: a */
    public C9934b mo34995a(C9939f fVar) {
        if (fVar != null) {
            return new C9934b(this.f27425a.mo35007a(fVar), this);
        }
        m33271a(8);
        throw null;
    }

    /* renamed from: b */
    public boolean mo34997b(C9939f fVar) {
        if (fVar != null) {
            return this.f27425a.mo35009b(fVar);
        }
        m33271a(12);
        throw null;
    }

    public C9934b(C9935c cVar) {
        if (cVar != null) {
            this.f27425a = cVar;
        } else {
            m33271a(2);
            throw null;
        }
    }

    private C9934b(C9935c cVar, C9934b bVar) {
        if (cVar != null) {
            this.f27425a = cVar;
            this.f27426b = bVar;
            return;
        }
        m33271a(3);
        throw null;
    }

    /* renamed from: c */
    public static C9934b m33272c(C9939f fVar) {
        if (fVar != null) {
            return new C9934b(C9935c.m33283c(fVar));
        }
        m33271a(13);
        throw null;
    }
}
