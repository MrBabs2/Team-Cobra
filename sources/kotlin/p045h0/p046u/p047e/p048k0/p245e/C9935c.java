package kotlin.p045h0.p046u.p047e.p048k0.p245e;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.p215c0.p216c.C9113l;

/* renamed from: kotlin.h0.u.e.k0.e.c */
/* compiled from: FqNameUnsafe */
public final class C9935c {

    /* renamed from: e */
    private static final C9939f f27427e = C9939f.m33304d("<root>");

    /* renamed from: f */
    private static final Pattern f27428f = Pattern.compile("\\.");

    /* renamed from: g */
    private static final C9113l<String, C9939f> f27429g = new C9936a();

    /* renamed from: a */
    private final String f27430a;

    /* renamed from: b */
    private transient C9934b f27431b;

    /* renamed from: c */
    private transient C9935c f27432c;

    /* renamed from: d */
    private transient C9939f f27433d;

    /* renamed from: kotlin.h0.u.e.k0.e.c$a */
    /* compiled from: FqNameUnsafe */
    static class C9936a implements C9113l<String, C9939f> {
        C9936a() {
        }

        /* renamed from: a */
        public C9939f invoke(String str) {
            return C9939f.m33300a(str);
        }
    }

    C9935c(String str, C9934b bVar) {
        if (str == null) {
            m33282a(0);
            throw null;
        } else if (bVar != null) {
            this.f27430a = str;
            this.f27431b = bVar;
        } else {
            m33282a(1);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m33282a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
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
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: i */
    private void m33284i() {
        int lastIndexOf = this.f27430a.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.f27433d = C9939f.m33300a(this.f27430a.substring(lastIndexOf + 1));
            this.f27432c = new C9935c(this.f27430a.substring(0, lastIndexOf));
            return;
        }
        this.f27433d = C9939f.m33300a(this.f27430a);
        this.f27432c = C9934b.f27424c.mo35003g();
    }

    /* renamed from: a */
    public String mo35006a() {
        String str = this.f27430a;
        if (str != null) {
            return str;
        }
        m33282a(4);
        throw null;
    }

    /* renamed from: b */
    public boolean mo35008b() {
        return this.f27430a.isEmpty();
    }

    /* renamed from: c */
    public boolean mo35010c() {
        return this.f27431b != null || mo35006a().indexOf(60) < 0;
    }

    /* renamed from: d */
    public C9935c mo35011d() {
        C9935c cVar = this.f27432c;
        if (cVar != null) {
            if (cVar != null) {
                return cVar;
            }
            m33282a(7);
            throw null;
        } else if (!mo35008b()) {
            m33284i();
            C9935c cVar2 = this.f27432c;
            if (cVar2 != null) {
                return cVar2;
            }
            m33282a(8);
            throw null;
        } else {
            throw new IllegalStateException("root");
        }
    }

    /* renamed from: e */
    public List<C9939f> mo35012e() {
        List<C9939f> emptyList = mo35008b() ? Collections.emptyList() : C10519k.m35621a((T[]) f27428f.split(this.f27430a), f27429g);
        if (emptyList != null) {
            return emptyList;
        }
        m33282a(14);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9935c) && this.f27430a.equals(((C9935c) obj).f27430a);
    }

    /* renamed from: f */
    public C9939f mo35014f() {
        C9939f fVar = this.f27433d;
        if (fVar != null) {
            if (fVar != null) {
                return fVar;
            }
            m33282a(10);
            throw null;
        } else if (!mo35008b()) {
            m33284i();
            C9939f fVar2 = this.f27433d;
            if (fVar2 != null) {
                return fVar2;
            }
            m33282a(11);
            throw null;
        } else {
            throw new IllegalStateException("root");
        }
    }

    /* renamed from: g */
    public C9939f mo35015g() {
        if (mo35008b()) {
            C9939f fVar = f27427e;
            if (fVar != null) {
                return fVar;
            }
            m33282a(12);
            throw null;
        }
        C9939f f = mo35014f();
        if (f != null) {
            return f;
        }
        m33282a(13);
        throw null;
    }

    /* renamed from: h */
    public C9934b mo35016h() {
        C9934b bVar = this.f27431b;
        if (bVar == null) {
            C9934b bVar2 = new C9934b(this);
            this.f27431b = bVar2;
            if (bVar2 != null) {
                return bVar2;
            }
            m33282a(6);
            throw null;
        } else if (bVar != null) {
            return bVar;
        } else {
            m33282a(5);
            throw null;
        }
    }

    public int hashCode() {
        return this.f27430a.hashCode();
    }

    public String toString() {
        String a = mo35008b() ? f27427e.mo35021a() : this.f27430a;
        if (a != null) {
            return a;
        }
        m33282a(17);
        throw null;
    }

    /* renamed from: c */
    public static C9935c m33283c(C9939f fVar) {
        if (fVar != null) {
            return new C9935c(fVar.mo35021a(), C9934b.f27424c.mo35003g(), fVar);
        }
        m33282a(16);
        throw null;
    }

    /* renamed from: a */
    public C9935c mo35007a(C9939f fVar) {
        String str;
        if (fVar != null) {
            if (mo35008b()) {
                str = fVar.mo35021a();
            } else {
                str = this.f27430a + "." + fVar.mo35021a();
            }
            return new C9935c(str, this, fVar);
        }
        m33282a(9);
        throw null;
    }

    /* renamed from: b */
    public boolean mo35009b(C9939f fVar) {
        if (fVar != null) {
            int indexOf = this.f27430a.indexOf(46);
            if (mo35008b()) {
                return false;
            }
            String str = this.f27430a;
            String a = fVar.mo35021a();
            if (indexOf == -1) {
                indexOf = this.f27430a.length();
            }
            return str.regionMatches(0, a, 0, indexOf);
        }
        m33282a(15);
        throw null;
    }

    public C9935c(String str) {
        if (str != null) {
            this.f27430a = str;
        } else {
            m33282a(2);
            throw null;
        }
    }

    private C9935c(String str, C9935c cVar, C9939f fVar) {
        if (str != null) {
            this.f27430a = str;
            this.f27432c = cVar;
            this.f27433d = fVar;
            return;
        }
        m33282a(3);
        throw null;
    }
}
