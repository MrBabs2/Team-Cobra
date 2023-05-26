package kotlin.p045h0.p046u.p047e.p048k0.p223a.p224n;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9327b;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9331e;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.p224n.C9352b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.reflect.jvm.internal.impl.descriptors.C10240b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;
import kotlin.reflect.jvm.internal.impl.descriptors.p260c1.C10268b;

/* renamed from: kotlin.h0.u.e.k0.a.n.a */
/* compiled from: BuiltInFictitiousFunctionClassFactory.kt */
public final class C9349a implements C10268b {

    /* renamed from: c */
    public static final C9350a f26020c = new C9350a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C11817i f26021a;

    /* renamed from: b */
    private final C10393y f26022b;

    /* renamed from: kotlin.h0.u.e.k0.a.n.a$a */
    /* compiled from: BuiltInFictitiousFunctionClassFactory.kt */
    public static final class C9350a {
        private C9350a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final C9351b m30286b(String str, C9934b bVar) {
            C9352b.C9356d a = C9352b.C9356d.f26042m.mo33790a(bVar, str);
            if (a == null) {
                return null;
            }
            int length = a.mo33787a().length();
            if (str != null) {
                String substring = str.substring(length);
                C10202j.m34174a((Object) substring, "(this as java.lang.String).substring(startIndex)");
                Integer a2 = m30284a(substring);
                if (a2 != null) {
                    return new C9351b(a, a2.intValue());
                }
                return null;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }

        public /* synthetic */ C9350a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C9352b.C9356d mo33749a(String str, C9934b bVar) {
            C10202j.m34178b(str, "className");
            C10202j.m34178b(bVar, "packageFqName");
            C9351b b = m30286b(str, bVar);
            if (b != null) {
                return b.mo33752c();
            }
            return null;
        }

        /* renamed from: a */
        private final Integer m30284a(String str) {
            if (str.length() == 0) {
                return null;
            }
            int length = str.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                int charAt = str.charAt(i2) - '0';
                if (charAt < 0 || 9 < charAt) {
                    return null;
                }
                i = (i * 10) + charAt;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.a.n.a$b */
    /* compiled from: BuiltInFictitiousFunctionClassFactory.kt */
    private static final class C9351b {

        /* renamed from: a */
        private final C9352b.C9356d f26023a;

        /* renamed from: b */
        private final int f26024b;

        public C9351b(C9352b.C9356d dVar, int i) {
            C10202j.m34178b(dVar, "kind");
            this.f26023a = dVar;
            this.f26024b = i;
        }

        /* renamed from: a */
        public final C9352b.C9356d mo33750a() {
            return this.f26023a;
        }

        /* renamed from: b */
        public final int mo33751b() {
            return this.f26024b;
        }

        /* renamed from: c */
        public final C9352b.C9356d mo33752c() {
            return this.f26023a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C9351b) {
                    C9351b bVar = (C9351b) obj;
                    if (C10202j.m34176a((Object) this.f26023a, (Object) bVar.f26023a)) {
                        if (this.f26024b == bVar.f26024b) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C9352b.C9356d dVar = this.f26023a;
            return ((dVar != null ? dVar.hashCode() : 0) * 31) + this.f26024b;
        }

        public String toString() {
            return "KindWithArity(kind=" + this.f26023a + ", arity=" + this.f26024b + ")";
        }
    }

    public C9349a(C11817i iVar, C10393y yVar) {
        C10202j.m34178b(iVar, "storageManager");
        C10202j.m34178b(yVar, "module");
        this.f26021a = iVar;
        this.f26022b = yVar;
    }

    /* renamed from: a */
    public boolean mo33748a(C9934b bVar, C9939f fVar) {
        C10202j.m34178b(bVar, "packageFqName");
        C10202j.m34178b(fVar, "name");
        String a = fVar.mo35021a();
        C10202j.m34174a((Object) a, "name.asString()");
        if ((C12130v.m40056c(a, "Function", false, 2, (Object) null) || C12130v.m40056c(a, "KFunction", false, 2, (Object) null) || C12130v.m40056c(a, "SuspendFunction", false, 2, (Object) null) || C12130v.m40056c(a, "KSuspendFunction", false, 2, (Object) null)) && f26020c.m30286b(a, bVar) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public C10342e mo33747a(C9933a aVar) {
        C10202j.m34178b(aVar, "classId");
        if (!aVar.mo34990g() && !aVar.mo34991h()) {
            String a = aVar.mo34987e().mo34994a();
            C10202j.m34174a((Object) a, "classId.relativeClassName.asString()");
            if (!C12131w.m40085a((CharSequence) a, (CharSequence) "Function", false, 2, (Object) null)) {
                return null;
            }
            C9934b d = aVar.mo34986d();
            C10202j.m34174a((Object) d, "classId.packageFqName");
            C9351b a2 = f26020c.m30286b(a, d);
            if (a2 != null) {
                C9352b.C9356d a3 = a2.mo33750a();
                int b = a2.mo33751b();
                List<C10240b0> D = this.f26022b.mo35554a(d).mo35539D();
                ArrayList arrayList = new ArrayList();
                for (T next : D) {
                    if (next instanceof C9327b) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object next2 : arrayList) {
                    if (next2 instanceof C9331e) {
                        arrayList2.add(next2);
                    }
                }
                C10240b0 b0Var = (C9331e) C10539w.m35803f(arrayList2);
                if (b0Var == null) {
                    b0Var = (C9327b) C10539w.m35799e(arrayList);
                }
                return new C9352b(this.f26021a, b0Var, a3, b);
            }
        }
        return null;
    }

    /* renamed from: a */
    public Collection<C10342e> mo33746a(C9934b bVar) {
        C10202j.m34178b(bVar, "packageFqName");
        return C10530o0.m35747a();
    }
}
