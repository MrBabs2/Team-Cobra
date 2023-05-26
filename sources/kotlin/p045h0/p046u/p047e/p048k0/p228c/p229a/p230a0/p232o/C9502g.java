package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.p232o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C10221n;
import kotlin.C10485x;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p247g.C9949c;
import kotlin.p045h0.p046u.p047e.p048k0.p247g.C9977i;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11897i0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11966v;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1.C11868g;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p384k1.C11924a;
import kotlin.p215c0.p216c.C9113l;
import kotlin.p215c0.p216c.C9117p;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.h0.u.e.k0.c.a.a0.o.g */
/* compiled from: RawType.kt */
public final class C9502g extends C11966v implements C11897i0 {

    /* renamed from: kotlin.h0.u.e.k0.c.a.a0.o.g$a */
    /* compiled from: RawType.kt */
    static final class C9503a extends C10203k implements C9117p<String, String, Boolean> {

        /* renamed from: f */
        public static final C9503a f26351f = new C9503a();

        C9503a() {
            super(2);
        }

        /* renamed from: a */
        public final boolean mo34010a(String str, String str2) {
            C10202j.m34178b(str, "first");
            C10202j.m34178b(str2, "second");
            return C10202j.m34176a((Object) str, (Object) C12131w.m40069a(str2, (CharSequence) "out ")) || C10202j.m34176a((Object) str2, (Object) "*");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(mo34010a((String) obj, (String) obj2));
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.c.a.a0.o.g$b */
    /* compiled from: RawType.kt */
    static final class C9504b extends C10203k implements C9113l<C11824b0, List<? extends String>> {

        /* renamed from: f */
        final /* synthetic */ C9949c f26352f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9504b(C9949c cVar) {
            super(1);
            this.f26352f = cVar;
        }

        /* renamed from: a */
        public final List<String> invoke(C11824b0 b0Var) {
            C10202j.m34178b(b0Var, "type");
            List<C11965u0> u0 = b0Var.mo35226u0();
            ArrayList arrayList = new ArrayList(C10531p.m35750a(u0, 10));
            for (C11965u0 a : u0) {
                arrayList.add(this.f26352f.mo35035a(a));
            }
            return arrayList;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.c.a.a0.o.g$c */
    /* compiled from: RawType.kt */
    static final class C9505c extends C10203k implements C9117p<String, String, String> {

        /* renamed from: f */
        public static final C9505c f26353f = new C9505c();

        C9505c() {
            super(2);
        }

        /* renamed from: a */
        public final String invoke(String str, String str2) {
            C10202j.m34178b(str, "$this$replaceArgs");
            C10202j.m34178b(str2, "newArgs");
            if (!C12131w.m40082a((CharSequence) str, '<', false, 2, (Object) null)) {
                return str;
            }
            return C12131w.m40107c(str, '<', (String) null, 2, (Object) null) + '<' + str2 + '>' + C12131w.m40092b(str, '>', (String) null, 2, (Object) null);
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.c.a.a0.o.g$d */
    /* compiled from: RawType.kt */
    static final class C9506d extends C10203k implements C9113l<String, String> {

        /* renamed from: f */
        public static final C9506d f26354f = new C9506d();

        C9506d() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(String str) {
            C10202j.m34178b(str, "it");
            return "(raw) " + str;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9502g(C11901j0 j0Var, C11901j0 j0Var2) {
        super(j0Var, j0Var2);
        C10202j.m34178b(j0Var, "lowerBound");
        C10202j.m34178b(j0Var2, "upperBound");
        boolean b = C11868g.f31579a.mo38536b(j0Var, j0Var2);
        if (C10485x.f28360a && !b) {
            throw new AssertionError("Lower bound " + j0Var + " of a flexible type must be a subtype of the upper bound " + j0Var2);
        }
    }

    /* renamed from: m */
    public C10096h mo34008m() {
        C10349h b = mo35227v0().mo33781b();
        if (!(b instanceof C10342e)) {
            b = null;
        }
        C10342e eVar = (C10342e) b;
        if (eVar != null) {
            C10096h a = eVar.mo35451a(C9501f.f26350d);
            C10202j.m34174a((Object) a, "classDescriptor.getMemberScope(RawSubstitution)");
            return a;
        }
        throw new IllegalStateException(("Incorrect classifier: " + mo35227v0().mo33781b()).toString());
    }

    /* renamed from: y0 */
    public C11901j0 mo34009y0() {
        return mo38609z0();
    }

    /* renamed from: a */
    public C9502g m30803a(C10249g gVar) {
        C10202j.m34178b(gVar, "newAnnotations");
        return new C9502g(mo38609z0().mo34006a(gVar), mo38607A0().mo34006a(gVar));
    }

    /* renamed from: a */
    public C9502g m30804a(boolean z) {
        return new C9502g(mo38609z0().mo34007a(z), mo38607A0().mo34007a(z));
    }

    /* renamed from: a */
    public String mo34005a(C9949c cVar, C9977i iVar) {
        C10202j.m34178b(cVar, "renderer");
        C10202j.m34178b(iVar, "options");
        C9503a aVar = C9503a.f26351f;
        C9504b bVar = new C9504b(cVar);
        C9505c cVar2 = C9505c.f26353f;
        String a = cVar.mo35034a((C11824b0) mo38609z0());
        String a2 = cVar.mo35034a((C11824b0) mo38607A0());
        if (iVar.mo35092c()) {
            return "raw (" + a + ".." + a2 + ')';
        } else if (mo38607A0().mo35226u0().isEmpty()) {
            return cVar.mo35031a(a, a2, C11924a.m39418b(this));
        } else {
            List<String> a3 = bVar.invoke(mo38609z0());
            List<String> a4 = bVar.invoke(mo38607A0());
            String a5 = C10539w.m35773a(a3, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C9506d.f26354f, 30, (Object) null);
            List<C10221n<T, R>> e = C10539w.m35800e(a3, a4);
            boolean z = true;
            if (!(e instanceof Collection) || !e.isEmpty()) {
                Iterator<T> it = e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C10221n nVar = (C10221n) it.next();
                    if (!C9503a.f26351f.mo34010a((String) nVar.mo35391c(), (String) nVar.mo35392d())) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                a2 = cVar2.invoke(a2, a5);
            }
            String a6 = cVar2.invoke(a, a5);
            if (C10202j.m34176a((Object) a6, (Object) a2)) {
                return a6;
            }
            return cVar.mo35031a(a6, a2, C11924a.m39418b(this));
        }
    }
}
