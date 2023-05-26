package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import java.util.Collection;
import java.util.List;
import kotlin.C10483v;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11814f;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.p215c0.p216c.C9102a;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10370q0;

/* renamed from: kotlin.h0.u.e.k0.k.h */
/* compiled from: AbstractTypeConstructor.kt */
public abstract class C11849h implements C11953s0 {

    /* renamed from: a */
    private final C11814f<C11850a> f31563a;

    /* renamed from: kotlin.h0.u.e.k0.k.h$a */
    /* compiled from: AbstractTypeConstructor.kt */
    private static final class C11850a {

        /* renamed from: a */
        private List<? extends C11824b0> f31564a = C10527n.m35729a(C11958u.f31662c);

        /* renamed from: b */
        private final Collection<C11824b0> f31565b;

        public C11850a(Collection<? extends C11824b0> collection) {
            C10202j.m34178b(collection, "allSupertypes");
            this.f31565b = collection;
        }

        /* renamed from: a */
        public final Collection<C11824b0> mo38485a() {
            return this.f31565b;
        }

        /* renamed from: b */
        public final List<C11824b0> mo38487b() {
            return this.f31564a;
        }

        /* renamed from: a */
        public final void mo38486a(List<? extends C11824b0> list) {
            C10202j.m34178b(list, "<set-?>");
            this.f31564a = list;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.k.h$b */
    /* compiled from: AbstractTypeConstructor.kt */
    static final class C11851b extends C10203k implements C9102a<C11850a> {

        /* renamed from: f */
        final /* synthetic */ C11849h f31566f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11851b(C11849h hVar) {
            super(0);
            this.f31566f = hVar;
        }

        public final C11850a invoke() {
            return new C11850a(this.f31566f.mo33783e());
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.k.h$c */
    /* compiled from: AbstractTypeConstructor.kt */
    static final class C11852c extends C10203k implements C9113l<Boolean, C11850a> {

        /* renamed from: f */
        public static final C11852c f31567f = new C11852c();

        C11852c() {
            super(1);
        }

        /* renamed from: a */
        public final C11850a mo38488a(boolean z) {
            return new C11850a(C10527n.m35729a(C11958u.f31662c));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo38488a(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.k.h$d */
    /* compiled from: AbstractTypeConstructor.kt */
    static final class C11853d extends C10203k implements C9113l<C11850a, C10483v> {

        /* renamed from: f */
        final /* synthetic */ C11849h f31568f;

        /* renamed from: kotlin.h0.u.e.k0.k.h$d$a */
        /* compiled from: AbstractTypeConstructor.kt */
        static final class C11854a extends C10203k implements C9113l<C11953s0, Collection<? extends C11824b0>> {

            /* renamed from: f */
            final /* synthetic */ C11853d f31569f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C11854a(C11853d dVar) {
                super(1);
                this.f31569f = dVar;
            }

            /* renamed from: a */
            public final Collection<C11824b0> invoke(C11953s0 s0Var) {
                C10202j.m34178b(s0Var, "it");
                return this.f31569f.f31568f.m39025a(s0Var, true);
            }
        }

        /* renamed from: kotlin.h0.u.e.k0.k.h$d$b */
        /* compiled from: AbstractTypeConstructor.kt */
        static final class C11855b extends C10203k implements C9113l<C11824b0, C10483v> {

            /* renamed from: f */
            final /* synthetic */ C11853d f31570f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C11855b(C11853d dVar) {
                super(1);
                this.f31570f = dVar;
            }

            /* renamed from: a */
            public final void mo38491a(C11824b0 b0Var) {
                C10202j.m34178b(b0Var, "it");
                this.f31570f.f31568f.mo38484a(b0Var);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo38491a((C11824b0) obj);
                return C10483v.f28357a;
            }
        }

        /* renamed from: kotlin.h0.u.e.k0.k.h$d$c */
        /* compiled from: AbstractTypeConstructor.kt */
        static final class C11856c extends C10203k implements C9113l<C11953s0, Collection<? extends C11824b0>> {

            /* renamed from: f */
            final /* synthetic */ C11853d f31571f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C11856c(C11853d dVar) {
                super(1);
                this.f31571f = dVar;
            }

            /* renamed from: a */
            public final Collection<C11824b0> invoke(C11953s0 s0Var) {
                C10202j.m34178b(s0Var, "it");
                return this.f31571f.f31568f.m39025a(s0Var, false);
            }
        }

        /* renamed from: kotlin.h0.u.e.k0.k.h$d$d */
        /* compiled from: AbstractTypeConstructor.kt */
        static final class C11857d extends C10203k implements C9113l<C11824b0, C10483v> {

            /* renamed from: f */
            final /* synthetic */ C11853d f31572f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C11857d(C11853d dVar) {
                super(1);
                this.f31572f = dVar;
            }

            /* renamed from: a */
            public final void mo38493a(C11824b0 b0Var) {
                C10202j.m34178b(b0Var, "it");
                this.f31572f.f31568f.mo35466b(b0Var);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo38493a((C11824b0) obj);
                return C10483v.f28357a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11853d(C11849h hVar) {
            super(1);
            this.f31568f = hVar;
        }

        /* renamed from: a */
        public final void mo38489a(C11850a aVar) {
            C10202j.m34178b(aVar, "supertypes");
            Collection<C11824b0> a = this.f31568f.mo33784g().mo35605a(this.f31568f, aVar.mo38485a(), new C11856c(this), new C11857d(this));
            List<T> list = null;
            if (a.isEmpty()) {
                C11824b0 f = this.f31568f.mo35467f();
                a = f != null ? C10527n.m35729a(f) : null;
                if (a == null) {
                    a = C10529o.m35736a();
                }
            }
            this.f31568f.mo33784g().mo35605a(this.f31568f, a, new C11854a(this), new C11855b(this));
            if (a instanceof List) {
                list = a;
            }
            List<T> list2 = list;
            if (list2 == null) {
                list2 = C10539w.m35815n(a);
            }
            aVar.mo38486a(list2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38489a((C11850a) obj);
            return C10483v.f28357a;
        }
    }

    public C11849h(C11817i iVar) {
        C10202j.m34178b(iVar, "storageManager");
        this.f31563a = iVar.mo38403a(new C11851b(this), C11852c.f31567f, new C11853d(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo38484a(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "type");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo35466b(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "type");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract Collection<C11824b0> mo33783e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C11824b0 mo35467f() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract C10370q0 mo33784g();

    /* renamed from: a */
    public List<C11824b0> m39028a() {
        return ((C11850a) this.f31563a.invoke()).mo38487b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Collection<C11824b0> m39025a(C11953s0 s0Var, boolean z) {
        List<T> d;
        C11849h hVar = (C11849h) (!(s0Var instanceof C11849h) ? null : s0Var);
        if (hVar != null && (d = C10539w.m35796d(((C11850a) hVar.f31563a.invoke()).mo38485a(), hVar.mo38434a(z))) != null) {
            return d;
        }
        Collection<C11824b0> a = s0Var.mo35229a();
        C10202j.m34174a((Object) a, "supertypes");
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Collection<C11824b0> mo38434a(boolean z) {
        return C10529o.m35736a();
    }
}
