package kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b;

import kotlin.C10485x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9713j;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p254p.C10080c;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p254p.C10081d;

/* renamed from: kotlin.h0.u.e.k0.c.b.l */
/* compiled from: methodSignatureMapping.kt */
final class C9718l implements C9717k<C9713j> {

    /* renamed from: a */
    public static final C9718l f26698a = new C9718l();

    private C9718l() {
    }

    /* renamed from: b */
    public C9713j.C9715b m31355b(String str) {
        C10202j.m34178b(str, "internalName");
        return new C9713j.C9715b(str);
    }

    /* renamed from: a */
    public C9713j mo34308b(C9713j jVar) {
        C10202j.m34178b(jVar, "possiblyPrimitiveType");
        if (!(jVar instanceof C9713j.C9716c)) {
            return jVar;
        }
        C9713j.C9716c cVar = (C9713j.C9716c) jVar;
        if (cVar.mo34304a() == null) {
            return jVar;
        }
        C10080c a = C10080c.m33923a(cVar.mo34304a().mo35290i());
        C10202j.m34174a((Object) a, "JvmClassName.byFqNameWit…mitiveType.wrapperFqName)");
        String b = a.mo35282b();
        C10202j.m34174a((Object) b, "JvmClassName.byFqNameWit…apperFqName).internalName");
        return mo34309b(b);
    }

    /* renamed from: b */
    public String mo34307a(C9713j jVar) {
        String a;
        C10202j.m34178b(jVar, "type");
        if (jVar instanceof C9713j.C9714a) {
            return "[" + mo34307a(((C9713j.C9714a) jVar).mo34302a());
        } else if (jVar instanceof C9713j.C9716c) {
            C10081d a2 = ((C9713j.C9716c) jVar).mo34304a();
            if (a2 == null || (a = a2.mo35287a()) == null) {
                return "V";
            }
            return a;
        } else if (jVar instanceof C9713j.C9715b) {
            return "L" + ((C9713j.C9715b) jVar).mo34303a() + ";";
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    public C9713j m31350a(String str) {
        C10081d dVar;
        C10202j.m34178b(str, "representation");
        boolean z = false;
        boolean z2 = str.length() > 0;
        if (!C10485x.f28360a || z2) {
            char charAt = str.charAt(0);
            C10081d[] values = C10081d.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    dVar = null;
                    break;
                }
                dVar = values[i];
                if (dVar.mo35287a().charAt(0) == charAt) {
                    break;
                }
                i++;
            }
            if (dVar != null) {
                return new C9713j.C9716c(dVar);
            }
            if (charAt == 'V') {
                return new C9713j.C9716c((C10081d) null);
            }
            if (charAt != '[') {
                if (charAt == 'L' && C12131w.m40102b((CharSequence) str, ';', false, 2, (Object) null)) {
                    z = true;
                }
                if (!C10485x.f28360a || z) {
                    String substring = str.substring(1, str.length() - 1);
                    C10202j.m34174a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    return new C9713j.C9715b(substring);
                }
                throw new AssertionError("Type that is not primitive nor array should be Object, but '" + str + "' was found");
            }
            String substring2 = str.substring(1);
            C10202j.m34174a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
            return new C9713j.C9714a(mo34306a(substring2));
        }
        throw new AssertionError("empty string as JvmType");
    }

    /* renamed from: a */
    public C9713j m31349a() {
        return mo34309b("java/lang/Class");
    }
}
