package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a;

import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p237z.C9668d;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9737u;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9935c;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C9999c;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1.C11881r;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10350h0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10352i0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10360m0;

/* renamed from: kotlin.h0.u.e.k0.c.a.w */
/* compiled from: specialBuiltinMembers.kt */
public final class C9636w {

    /* renamed from: kotlin.h0.u.e.k0.c.a.w$a */
    /* compiled from: specialBuiltinMembers.kt */
    static final class C9637a extends C10203k implements C9113l<C10238b, Boolean> {

        /* renamed from: f */
        public static final C9637a f26541f = new C9637a();

        C9637a() {
            super(1);
        }

        /* renamed from: a */
        public final boolean mo34189a(C10238b bVar) {
            C10202j.m34178b(bVar, "it");
            return C9610e.f26499e.mo34168b(C10071a.m33887a(bVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo34189a((C10238b) obj));
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.c.a.w$b */
    /* compiled from: specialBuiltinMembers.kt */
    static final class C9638b extends C10203k implements C9113l<C10238b, Boolean> {

        /* renamed from: f */
        public static final C9638b f26542f = new C9638b();

        C9638b() {
            super(1);
        }

        /* renamed from: a */
        public final boolean mo34190a(C10238b bVar) {
            C10202j.m34178b(bVar, "it");
            return C9510c.f26366f.mo34018b((C10360m0) bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo34190a((C10238b) obj));
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.c.a.w$c */
    /* compiled from: specialBuiltinMembers.kt */
    static final class C9639c extends C10203k implements C9113l<C10238b, Boolean> {

        /* renamed from: f */
        public static final C9639c f26543f = new C9639c();

        C9639c() {
            super(1);
        }

        /* renamed from: a */
        public final boolean mo34191a(C10238b bVar) {
            C10202j.m34178b(bVar, "it");
            return C9333g.m30184c((C10359m) bVar) && C9541d.m30874b(bVar) != null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo34191a((C10238b) obj));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C9934b m31082b(C9934b bVar, String str) {
        C9934b a = bVar.mo34995a(C9939f.m33302b(str));
        C10202j.m34174a((Object) a, "child(Name.identifier(name))");
        return a;
    }

    /* renamed from: c */
    private static final C10238b m31084c(C10238b bVar) {
        if (C9333g.m30184c((C10359m) bVar)) {
            return m31085d(bVar);
        }
        return null;
    }

    /* renamed from: d */
    public static final <T extends C10238b> T m31085d(T t) {
        C10202j.m34178b(t, "$this$getOverriddenBuiltinWithDifferentJvmName");
        if (!C9510c.f26366f.mo34014a().contains(t.getName()) && !C9610e.f26499e.mo34167a().contains(C10071a.m33887a((C10238b) t).getName())) {
            return null;
        }
        if ((t instanceof C10352i0) || (t instanceof C10350h0)) {
            return C10071a.m33889a(t, false, C9637a.f26541f, 1, (Object) null);
        }
        if (t instanceof C10360m0) {
            return C10071a.m33889a(t, false, C9638b.f26542f, 1, (Object) null);
        }
        return null;
    }

    /* renamed from: e */
    public static final <T extends C10238b> T m31086e(T t) {
        C10202j.m34178b(t, "$this$getOverriddenSpecialBuiltin");
        T d = m31085d(t);
        if (d != null) {
            return d;
        }
        C9541d dVar = C9541d.f26377g;
        C9939f name = t.getName();
        C10202j.m34174a((Object) name, "name");
        if (!dVar.mo34077a(name)) {
            return null;
        }
        return C10071a.m33889a(t, false, C9639c.f26543f, 1, (Object) null);
    }

    /* renamed from: f */
    public static final boolean m31087f(C10238b bVar) {
        C10202j.m34178b(bVar, "$this$isFromJava");
        return C10071a.m33887a(bVar).mo33762b() instanceof C9668d;
    }

    /* renamed from: g */
    public static final boolean m31088g(C10238b bVar) {
        C10202j.m34178b(bVar, "$this$isFromJavaOrBuiltins");
        return m31087f(bVar) || C9333g.m30184c((C10359m) bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C9934b m31083b(C9935c cVar, String str) {
        C9934b h = cVar.mo35007a(C9939f.m33302b(str)).mo35016h();
        C10202j.m34174a((Object) h, "child(Name.identifier(name)).toSafe()");
        return h;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C9634u m31081b(String str, String str2, String str3, String str4) {
        C9939f b = C9939f.m33302b(str2);
        C10202j.m34174a((Object) b, "Name.identifier(name)");
        C9737u uVar = C9737u.f26706a;
        return new C9634u(b, uVar.mo34335a(str, str2 + '(' + str3 + ')' + str4));
    }

    /* renamed from: a */
    public static final boolean m31078a(C10238b bVar) {
        C10202j.m34178b(bVar, "$this$doesOverrideBuiltinWithDifferentJvmName");
        return m31085d(bVar) != null;
    }

    /* renamed from: a */
    public static final boolean m31079a(C10342e eVar, C10230a aVar) {
        C10202j.m34178b(eVar, "$this$hasRealKotlinSuperClassWithOverrideOf");
        C10202j.m34178b(aVar, "specialCallableDescriptor");
        C10359m b = aVar.mo33762b();
        if (b != null) {
            C11901j0 o = ((C10342e) b).mo35445o();
            C10202j.m34174a((Object) o, "(specialCallableDescript…ssDescriptor).defaultType");
            C10342e b2 = C9999c.m33673b(eVar);
            while (true) {
                boolean z = false;
                if (b2 == null) {
                    return false;
                }
                if (!(b2 instanceof C9668d)) {
                    if (C11881r.m39259e(b2.mo35445o(), o) != null) {
                        z = true;
                    }
                    if (z) {
                        return !C9333g.m30184c((C10359m) b2);
                    }
                }
                b2 = C9999c.m33673b(b2);
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        }
    }

    /* renamed from: b */
    public static final String m31080b(C10238b bVar) {
        C10238b a;
        C9939f a2;
        C10202j.m34178b(bVar, "callableMemberDescriptor");
        C10238b c = m31084c(bVar);
        if (c == null || (a = C10071a.m33887a(c)) == null) {
            return null;
        }
        if (a instanceof C10352i0) {
            return C9610e.f26499e.mo34165a(a);
        }
        if (!(a instanceof C10360m0) || (a2 = C9510c.f26366f.mo34016a((C10360m0) a)) == null) {
            return null;
        }
        return a2.mo35021a();
    }
}
