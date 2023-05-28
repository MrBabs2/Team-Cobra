package kotlin.p045h0.p046u.p047e.p048k0.p245e;

import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.h0.u.e.k0.e.e */
/* compiled from: FqNamesUtil.kt */
public final class C9938e {
    /* renamed from: a */
    public static final boolean m33298a(C9934b bVar, C9934b bVar2) {
        C10202j.m34178b(bVar, "$this$isSubpackageOf");
        C10202j.m34178b(bVar2, "packageName");
        if (C10202j.m34176a((Object) bVar, (Object) bVar2) || bVar2.mo34996b()) {
            return true;
        }
        String a = bVar.mo34994a();
        C10202j.m34174a((Object) a, "this.asString()");
        String a2 = bVar2.mo34994a();
        C10202j.m34174a((Object) a2, "packageName.asString()");
        return m33297a(a, a2);
    }

    /* renamed from: b */
    public static final C9934b m33299b(C9934b bVar, C9934b bVar2) {
        C10202j.m34178b(bVar, "$this$tail");
        C10202j.m34178b(bVar2, "prefix");
        if (!m33298a(bVar, bVar2) || bVar2.mo34996b()) {
            return bVar;
        }
        if (C10202j.m34176a((Object) bVar, (Object) bVar2)) {
            C9934b bVar3 = C9934b.f27424c;
            C10202j.m34174a((Object) bVar3, "FqName.ROOT");
            return bVar3;
        }
        String a = bVar.mo34994a();
        C10202j.m34174a((Object) a, "asString()");
        int length = bVar2.mo34994a().length() + 1;
        if (a != null) {
            String substring = a.substring(length);
            C10202j.m34174a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            return new C9934b(substring);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    private static final boolean m33297a(String str, String str2) {
        return C12130v.m40056c(str, str2, false, 2, (Object) null) && str.charAt(str2.length()) == '.';
    }

    /* renamed from: a */
    public static final boolean m33296a(String str) {
        if (str == null) {
            return false;
        }
        C9942i iVar = C9942i.BEGINNING;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            int i2 = C9937d.f27434a[iVar.ordinal()];
            if (i2 == 1 || i2 == 2) {
                if (!Character.isJavaIdentifierPart(charAt)) {
                    return false;
                }
                iVar = C9942i.MIDDLE;
            } else if (i2 != 3) {
                continue;
            } else if (charAt == '.') {
                iVar = C9942i.AFTER_DOT;
            } else if (!Character.isJavaIdentifierPart(charAt)) {
                return false;
            }
        }
        if (iVar != C9942i.AFTER_DOT) {
            return true;
        }
        return false;
    }
}
