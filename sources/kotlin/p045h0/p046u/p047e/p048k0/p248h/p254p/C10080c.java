package kotlin.p045h0.p046u.p047e.p048k0.p248h.p254p;

import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;

/* renamed from: kotlin.h0.u.e.k0.h.p.c */
/* compiled from: JvmClassName */
public class C10080c {

    /* renamed from: a */
    private final String f27663a;

    private C10080c(String str) {
        if (str != null) {
            this.f27663a = str;
        } else {
            m33924a(5);
            throw null;
        }
    }

    /* renamed from: a */
    public static C10080c m33921a(String str) {
        if (str != null) {
            return new C10080c(str);
        }
        m33924a(0);
        throw null;
    }

    /* renamed from: a */
    private static /* synthetic */ void m33924a(int i) {
        String str = (i == 3 || i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 3 || i == 6 || i == 7 || i == 8) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 3 || i == 6 || i == 7 || i == 8) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public String mo35282b() {
        String str = this.f27663a;
        if (str != null) {
            return str;
        }
        m33924a(8);
        throw null;
    }

    /* renamed from: c */
    public C9934b mo35283c() {
        int lastIndexOf = this.f27663a.lastIndexOf("/");
        if (lastIndexOf != -1) {
            return new C9934b(this.f27663a.substring(0, lastIndexOf).replace('/', '.'));
        }
        C9934b bVar = C9934b.f27424c;
        if (bVar != null) {
            return bVar;
        }
        m33924a(7);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10080c.class != obj.getClass()) {
            return false;
        }
        return this.f27663a.equals(((C10080c) obj).f27663a);
    }

    public int hashCode() {
        return this.f27663a.hashCode();
    }

    public String toString() {
        return this.f27663a;
    }

    /* renamed from: a */
    public static C10080c m33922a(C9933a aVar) {
        if (aVar != null) {
            C9934b d = aVar.mo34986d();
            String replace = aVar.mo34987e().mo34994a().replace('.', '$');
            if (d.mo34996b()) {
                return new C10080c(replace);
            }
            return new C10080c(d.mo34994a().replace('.', '/') + "/" + replace);
        }
        m33924a(1);
        throw null;
    }

    /* renamed from: a */
    public static C10080c m33923a(C9934b bVar) {
        if (bVar != null) {
            return new C10080c(bVar.mo34994a().replace('.', '/'));
        }
        m33924a(2);
        throw null;
    }

    /* renamed from: a */
    public C9934b mo35281a() {
        return new C9934b(this.f27663a.replace('/', '.'));
    }
}
