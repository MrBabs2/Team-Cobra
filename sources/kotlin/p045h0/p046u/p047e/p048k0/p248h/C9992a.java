package kotlin.p045h0.p046u.p047e.p048k0.p248h;

import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C10007i;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1.C11868g;
import kotlin.p215c0.p216c.C9117p;
import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10240b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;

/* renamed from: kotlin.h0.u.e.k0.h.a */
/* compiled from: DescriptorEquivalenceForOverrides.kt */
public final class C9992a {

    /* renamed from: a */
    public static final C9992a f27571a = new C9992a();

    /* renamed from: kotlin.h0.u.e.k0.h.a$a */
    /* compiled from: DescriptorEquivalenceForOverrides.kt */
    static final class C9993a extends C10203k implements C9117p<C10359m, C10359m, Boolean> {

        /* renamed from: f */
        public static final C9993a f27572f = new C9993a();

        C9993a() {
            super(2);
        }

        /* renamed from: a */
        public final boolean mo35202a(C10359m mVar, C10359m mVar2) {
            return false;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(mo35202a((C10359m) obj, (C10359m) obj2));
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.h.a$b */
    /* compiled from: DescriptorEquivalenceForOverrides.kt */
    static final class C9994b implements C11868g.C11869a {

        /* renamed from: a */
        final /* synthetic */ C10230a f27573a;

        /* renamed from: b */
        final /* synthetic */ C10230a f27574b;

        /* renamed from: kotlin.h0.u.e.k0.h.a$b$a */
        /* compiled from: DescriptorEquivalenceForOverrides.kt */
        static final class C9995a extends C10203k implements C9117p<C10359m, C10359m, Boolean> {

            /* renamed from: f */
            final /* synthetic */ C9994b f27575f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9995a(C9994b bVar) {
                super(2);
                this.f27575f = bVar;
            }

            /* renamed from: a */
            public final boolean mo35205a(C10359m mVar, C10359m mVar2) {
                return C10202j.m34176a((Object) mVar, (Object) this.f27575f.f27573a) && C10202j.m34176a((Object) mVar2, (Object) this.f27575f.f27574b);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(mo35205a((C10359m) obj, (C10359m) obj2));
            }
        }

        C9994b(C10230a aVar, C10230a aVar2) {
            this.f27573a = aVar;
            this.f27574b = aVar2;
        }

        /* renamed from: b */
        public final boolean mo35203a(C11953s0 s0Var, C11953s0 s0Var2) {
            C10202j.m34178b(s0Var, "c1");
            C10202j.m34178b(s0Var2, "c2");
            if (C10202j.m34176a((Object) s0Var, (Object) s0Var2)) {
                return true;
            }
            C10349h b = s0Var.mo33781b();
            C10349h b2 = s0Var2.mo33781b();
            if (!(b instanceof C10375s0) || !(b2 instanceof C10375s0)) {
                return false;
            }
            return C9992a.f27571a.m33634a((C10375s0) b, (C10375s0) b2, (C9117p<? super C10359m, ? super C10359m, Boolean>) new C9995a(this));
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.h.a$c */
    /* compiled from: DescriptorEquivalenceForOverrides.kt */
    static final class C9996c extends C10203k implements C9117p<C10359m, C10359m, Boolean> {

        /* renamed from: f */
        public static final C9996c f27576f = new C9996c();

        C9996c() {
            super(2);
        }

        /* renamed from: a */
        public final boolean mo35206a(C10359m mVar, C10359m mVar2) {
            return false;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(mo35206a((C10359m) obj, (C10359m) obj2));
        }
    }

    private C9992a() {
    }

    /* renamed from: a */
    public final boolean mo35201a(C10359m mVar, C10359m mVar2) {
        if ((mVar instanceof C10342e) && (mVar2 instanceof C10342e)) {
            return m33632a((C10342e) mVar, (C10342e) mVar2);
        }
        if ((mVar instanceof C10375s0) && (mVar2 instanceof C10375s0)) {
            return m33631a(this, (C10375s0) mVar, (C10375s0) mVar2, (C9117p) null, 4, (Object) null);
        } else if ((mVar instanceof C10230a) && (mVar2 instanceof C10230a)) {
            return m33629a(this, (C10230a) mVar, (C10230a) mVar2, false, 4, (Object) null);
        } else if (!(mVar instanceof C10240b0) || !(mVar2 instanceof C10240b0)) {
            return C10202j.m34176a((Object) mVar, (Object) mVar2);
        } else {
            return C10202j.m34176a((Object) ((C10240b0) mVar).mo35425c(), (Object) ((C10240b0) mVar2).mo35425c());
        }
    }

    /* renamed from: a */
    private final boolean m33632a(C10342e eVar, C10342e eVar2) {
        return C10202j.m34176a((Object) eVar.mo33766h(), (Object) eVar2.mo33766h());
    }

    /* renamed from: a */
    static /* synthetic */ boolean m33631a(C9992a aVar, C10375s0 s0Var, C10375s0 s0Var2, C9117p pVar, int i, Object obj) {
        if ((i & 4) != 0) {
            pVar = C9996c.f27576f;
        }
        return aVar.m33634a(s0Var, s0Var2, (C9117p<? super C10359m, ? super C10359m, Boolean>) pVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m33634a(C10375s0 s0Var, C10375s0 s0Var2, C9117p<? super C10359m, ? super C10359m, Boolean> pVar) {
        if (C10202j.m34176a((Object) s0Var, (Object) s0Var2)) {
            return true;
        }
        if (!C10202j.m34176a((Object) s0Var.mo33762b(), (Object) s0Var2.mo33762b()) && m33633a((C10359m) s0Var, (C10359m) s0Var2, pVar) && s0Var.mo35442e() == s0Var2.mo35442e()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m33629a(C9992a aVar, C10230a aVar2, C10230a aVar3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return aVar.mo35200a(aVar2, aVar3, z);
    }

    /* renamed from: a */
    public final boolean mo35200a(C10230a aVar, C10230a aVar2, boolean z) {
        C10202j.m34178b(aVar, "a");
        C10202j.m34178b(aVar2, "b");
        if (C10202j.m34176a((Object) aVar, (Object) aVar2)) {
            return true;
        }
        if ((!C10202j.m34176a((Object) aVar.getName(), (Object) aVar2.getName())) || C10202j.m34176a((Object) aVar.mo33762b(), (Object) aVar2.mo33762b()) || C9999c.m33693r(aVar) || C9999c.m33693r(aVar2) || !m33633a((C10359m) aVar, (C10359m) aVar2, (C9117p<? super C10359m, ? super C10359m, Boolean>) C9993a.f27572f)) {
            return false;
        }
        C10007i a = C10007i.m33724a((C11868g.C11869a) new C9994b(aVar, aVar2));
        C10202j.m34174a((Object) a, "OverridingUtil.createWit…= a && y == b})\n        }");
        C10007i.C10017j a2 = a.mo35212a(aVar, aVar2, (C10342e) null, !z);
        C10202j.m34174a((Object) a2, "overridingUtil.isOverrid… null, !ignoreReturnType)");
        if (a2.mo35220a() == C10007i.C10017j.C10018a.OVERRIDABLE) {
            C10007i.C10017j a3 = a.mo35212a(aVar2, aVar, (C10342e) null, !z);
            C10202j.m34174a((Object) a3, "overridingUtil.isOverrid… null, !ignoreReturnType)");
            if (a3.mo35220a() == C10007i.C10017j.C10018a.OVERRIDABLE) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m33633a(C10359m mVar, C10359m mVar2, C9117p<? super C10359m, ? super C10359m, Boolean> pVar) {
        C10359m b = mVar.mo33762b();
        C10359m b2 = mVar2.mo33762b();
        if ((b instanceof C10238b) || (b2 instanceof C10238b)) {
            return pVar.invoke(b, b2).booleanValue();
        }
        return mo35201a(b, b2);
    }
}
