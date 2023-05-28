package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C10483v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.p225o.C9367c;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.C9405a;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.C9633t;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.C9640x;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.C9409a;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.C9416d;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.C9422h;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p237z.C9665a;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p237z.C9674h;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p237z.C9675i;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p237z.C9676j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p237z.C9677k;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10037g;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10042j;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11821a1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11834e1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p384k1.C11924a;
import kotlin.p215c0.p216c.C9113l;
import kotlin.p215c0.p216c.C9117p;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10358l0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10241a;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10243c;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10254i;
import kotlin.reflect.jvm.internal.impl.utils.C12157e;
import kotlin.reflect.jvm.internal.impl.utils.C12162h;

/* renamed from: kotlin.h0.u.e.k0.c.a.d0.l */
/* compiled from: signatureEnhancement.kt */
public final class C9587l {

    /* renamed from: a */
    private final C9405a f26453a;

    /* renamed from: b */
    private final C12157e f26454b;

    /* renamed from: kotlin.h0.u.e.k0.c.a.d0.l$a */
    /* compiled from: signatureEnhancement.kt */
    private static class C9588a {

        /* renamed from: a */
        private final C11824b0 f26455a;

        /* renamed from: b */
        private final boolean f26456b;

        /* renamed from: c */
        private final boolean f26457c;

        public C9588a(C11824b0 b0Var, boolean z, boolean z2) {
            C10202j.m34178b(b0Var, "type");
            this.f26455a = b0Var;
            this.f26456b = z;
            this.f26457c = z2;
        }

        /* renamed from: a */
        public final boolean mo34138a() {
            return this.f26457c;
        }

        /* renamed from: b */
        public final C11824b0 mo34139b() {
            return this.f26455a;
        }

        /* renamed from: c */
        public final boolean mo34140c() {
            return this.f26456b;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.c.a.d0.l$b */
    /* compiled from: signatureEnhancement.kt */
    private final class C9589b {

        /* renamed from: a */
        private final C10241a f26458a;

        /* renamed from: b */
        private final C11824b0 f26459b;

        /* renamed from: c */
        private final Collection<C11824b0> f26460c;

        /* renamed from: d */
        private final boolean f26461d;

        /* renamed from: e */
        private final C9422h f26462e;

        /* renamed from: f */
        private final C9405a.C9406a f26463f;

        /* renamed from: g */
        final /* synthetic */ C9587l f26464g;

        /* renamed from: kotlin.h0.u.e.k0.c.a.d0.l$b$a */
        /* compiled from: signatureEnhancement.kt */
        static final class C9590a extends C10203k implements C9113l<Integer, C9550d> {

            /* renamed from: f */
            final /* synthetic */ C9550d[] f26465f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9590a(C9550d[] dVarArr) {
                super(1);
                this.f26465f = dVarArr;
            }

            /* renamed from: a */
            public final C9550d mo34142a(int i) {
                C9550d[] dVarArr = this.f26465f;
                return (i < 0 || i > C10519k.m35649g(dVarArr)) ? C9550d.f26395f.mo34091a() : dVarArr[i];
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return mo34142a(((Number) obj).intValue());
            }
        }

        /* renamed from: kotlin.h0.u.e.k0.c.a.d0.l$b$b */
        /* compiled from: signatureEnhancement.kt */
        static final class C9591b extends C10203k implements C9113l<Integer, C9550d> {

            /* renamed from: f */
            final /* synthetic */ C9607r f26466f;

            /* renamed from: g */
            final /* synthetic */ C9113l f26467g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9591b(C9607r rVar, C9113l lVar) {
                super(1);
                this.f26466f = rVar;
                this.f26467g = lVar;
            }

            /* renamed from: a */
            public final C9550d mo34143a(int i) {
                C9550d dVar = this.f26466f.mo34164a().get(Integer.valueOf(i));
                return dVar != null ? dVar : (C9550d) this.f26467g.invoke(Integer.valueOf(i));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return mo34143a(((Number) obj).intValue());
            }
        }

        /* renamed from: kotlin.h0.u.e.k0.c.a.d0.l$b$c */
        /* compiled from: signatureEnhancement.kt */
        static final class C9592c extends C10203k implements C9113l<C11834e1, Boolean> {

            /* renamed from: f */
            public static final C9592c f26468f = new C9592c();

            C9592c() {
                super(1);
            }

            /* renamed from: a */
            public final boolean mo34144a(C11834e1 e1Var) {
                C10349h b = e1Var.mo35227v0().mo33781b();
                if (b == null) {
                    return false;
                }
                C10202j.m34174a((Object) b, "it.constructor.declarati… ?: return@contains false");
                if (!C10202j.m34176a((Object) b.getName(), (Object) C9367c.f26064m.mo33801a().mo35000e()) || !C10202j.m34176a((Object) C10071a.m33885a((C10359m) b), (Object) C9367c.f26064m.mo33801a())) {
                    return false;
                }
                return true;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(mo34144a((C11834e1) obj));
            }
        }

        /* renamed from: kotlin.h0.u.e.k0.c.a.d0.l$b$d */
        /* compiled from: signatureEnhancement.kt */
        static final class C9593d extends C10203k implements C9117p<List<? extends C9934b>, T, T> {

            /* renamed from: f */
            final /* synthetic */ C10249g f26469f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9593d(C10249g gVar) {
                super(2);
                this.f26469f = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0038 A[ORIG_RETURN, RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final <T> T invoke(java.util.List<kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b> r5, T r6) {
                /*
                    r4 = this;
                    java.lang.String r0 = "$this$ifPresent"
                    kotlin.jvm.internal.C10202j.m34178b(r5, r0)
                    java.lang.String r0 = "qualifier"
                    kotlin.jvm.internal.C10202j.m34178b(r6, r0)
                    boolean r0 = r5 instanceof java.util.Collection
                    r1 = 1
                    r2 = 0
                    if (r0 == 0) goto L_0x0018
                    boolean r0 = r5.isEmpty()
                    if (r0 == 0) goto L_0x0018
                L_0x0016:
                    r1 = 0
                    goto L_0x0035
                L_0x0018:
                    java.util.Iterator r5 = r5.iterator()
                L_0x001c:
                    boolean r0 = r5.hasNext()
                    if (r0 == 0) goto L_0x0016
                    java.lang.Object r0 = r5.next()
                    kotlin.h0.u.e.k0.e.b r0 = (kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b) r0
                    kotlin.reflect.jvm.internal.impl.descriptors.b1.g r3 = r4.f26469f
                    kotlin.reflect.jvm.internal.impl.descriptors.b1.c r0 = r3.mo33885a(r0)
                    if (r0 == 0) goto L_0x0032
                    r0 = 1
                    goto L_0x0033
                L_0x0032:
                    r0 = 0
                L_0x0033:
                    if (r0 == 0) goto L_0x001c
                L_0x0035:
                    if (r1 == 0) goto L_0x0038
                    goto L_0x0039
                L_0x0038:
                    r6 = 0
                L_0x0039:
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9587l.C9589b.C9593d.invoke(java.util.List, java.lang.Object):java.lang.Object");
            }
        }

        /* renamed from: kotlin.h0.u.e.k0.c.a.d0.l$b$e */
        /* compiled from: signatureEnhancement.kt */
        static final class C9594e extends C10203k implements C9117p<T, T, T> {

            /* renamed from: f */
            public static final C9594e f26470f = new C9594e();

            C9594e() {
                super(2);
            }

            public final <T> T invoke(T t, T t2) {
                if (t == null || t2 == null || C10202j.m34176a((Object) t, (Object) t2)) {
                    return t != null ? t : t2;
                }
                return null;
            }
        }

        /* renamed from: kotlin.h0.u.e.k0.c.a.d0.l$b$f */
        /* compiled from: signatureEnhancement.kt */
        static final class C9595f extends C10203k implements C9117p<C11824b0, C9422h, C10483v> {

            /* renamed from: f */
            final /* synthetic */ ArrayList f26471f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9595f(ArrayList arrayList) {
                super(2);
                this.f26471f = arrayList;
            }

            /* renamed from: a */
            public final void mo34146a(C11824b0 b0Var, C9422h hVar) {
                C10202j.m34178b(b0Var, "type");
                C10202j.m34178b(hVar, "ownerContext");
                C9422h b = C9409a.m30481b(hVar, b0Var.getAnnotations());
                ArrayList arrayList = this.f26471f;
                C9416d b2 = b.mo33893b();
                arrayList.add(new C9605p(b0Var, b2 != null ? b2.mo33884a(C9405a.C9406a.TYPE_USE) : null));
                for (C11965u0 next : b0Var.mo35226u0()) {
                    if (next.mo38597b()) {
                        ArrayList arrayList2 = this.f26471f;
                        C11824b0 type = next.getType();
                        C10202j.m34174a((Object) type, "arg.type");
                        arrayList2.add(new C9605p(type, (C9550d) null));
                    } else {
                        C11824b0 type2 = next.getType();
                        C10202j.m34174a((Object) type2, "arg.type");
                        mo34146a(type2, b);
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo34146a((C11824b0) obj, (C9422h) obj2);
                return C10483v.f28357a;
            }
        }

        public C9589b(C9587l lVar, C10241a aVar, C11824b0 b0Var, Collection<? extends C11824b0> collection, boolean z, C9422h hVar, C9405a.C9406a aVar2) {
            C10202j.m34178b(b0Var, "fromOverride");
            C10202j.m34178b(collection, "fromOverridden");
            C10202j.m34178b(hVar, "containerContext");
            C10202j.m34178b(aVar2, "containerApplicabilityType");
            this.f26464g = lVar;
            this.f26458a = aVar;
            this.f26459b = b0Var;
            this.f26460c = collection;
            this.f26461d = z;
            this.f26462e = hVar;
            this.f26463f = aVar2;
        }

        /* renamed from: a */
        public static /* synthetic */ C9588a m30961a(C9589b bVar, C9607r rVar, int i, Object obj) {
            if ((i & 1) != 0) {
                rVar = null;
            }
            return bVar.mo34141a(rVar);
        }

        /* renamed from: b */
        private final boolean m30963b() {
            C10241a aVar = this.f26458a;
            C11824b0 b0Var = null;
            if (!(aVar instanceof C10386v0)) {
                aVar = null;
            }
            C10386v0 v0Var = (C10386v0) aVar;
            if (v0Var != null) {
                b0Var = v0Var.mo35486a0();
            }
            return b0Var != null;
        }

        /* renamed from: a */
        public final C9588a mo34141a(C9607r rVar) {
            C9113l<Integer, C9550d> a = m30956a();
            C9591b bVar = rVar != null ? new C9591b(rVar, a) : null;
            boolean a2 = C11821a1.m38908a(this.f26459b, (C9113l<C11834e1, Boolean>) C9592c.f26468f);
            C11824b0 b0Var = this.f26459b;
            if (bVar != null) {
                a = bVar;
            }
            C11824b0 a3 = C9609t.m30996a(b0Var, a);
            if (a3 != null) {
                return new C9588a(a3, true, a2);
            }
            return new C9588a(this.f26459b, false, a2);
        }

        /* renamed from: b */
        private final List<C9605p> m30962b(C11824b0 b0Var) {
            ArrayList arrayList = new ArrayList(1);
            new C9595f(arrayList).mo34146a(b0Var, this.f26462e);
            return arrayList;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9550d m30957a(kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0 r12) {
            /*
                r11 = this;
                boolean r0 = kotlin.p045h0.p046u.p047e.p048k0.p380k.C11975y.m39644b(r12)
                if (r0 == 0) goto L_0x0018
                kotlin.h0.u.e.k0.k.v r0 = kotlin.p045h0.p046u.p047e.p048k0.p380k.C11975y.m39643a(r12)
                kotlin.n r1 = new kotlin.n
                kotlin.h0.u.e.k0.k.j0 r2 = r0.mo38609z0()
                kotlin.h0.u.e.k0.k.j0 r0 = r0.mo38607A0()
                r1.<init>(r2, r0)
                goto L_0x001d
            L_0x0018:
                kotlin.n r1 = new kotlin.n
                r1.<init>(r12, r12)
            L_0x001d:
                java.lang.Object r0 = r1.mo35389a()
                kotlin.h0.u.e.k0.k.b0 r0 = (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r0
                java.lang.Object r1 = r1.mo35390b()
                kotlin.h0.u.e.k0.k.b0 r1 = (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r1
                kotlin.h0.u.e.k0.a.o.c r2 = kotlin.p045h0.p046u.p047e.p048k0.p223a.p225o.C9367c.f26064m
                kotlin.h0.u.e.k0.c.a.d0.d r10 = new kotlin.h0.u.e.k0.c.a.d0.d
                boolean r3 = r0.mo34094w0()
                r4 = 0
                if (r3 == 0) goto L_0x0038
                kotlin.h0.u.e.k0.c.a.d0.g r3 = kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9554g.NULLABLE
            L_0x0036:
                r5 = r3
                goto L_0x0042
            L_0x0038:
                boolean r3 = r1.mo34094w0()
                if (r3 != 0) goto L_0x0041
                kotlin.h0.u.e.k0.c.a.d0.g r3 = kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9554g.NOT_NULL
                goto L_0x0036
            L_0x0041:
                r5 = r4
            L_0x0042:
                boolean r0 = r2.mo33809b((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r0)
                if (r0 == 0) goto L_0x004b
                kotlin.h0.u.e.k0.c.a.d0.e r0 = kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9552e.READ_ONLY
                goto L_0x0055
            L_0x004b:
                boolean r0 = r2.mo33805a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r1)
                if (r0 == 0) goto L_0x0054
                kotlin.h0.u.e.k0.c.a.d0.e r0 = kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9552e.MUTABLE
                goto L_0x0055
            L_0x0054:
                r0 = r4
            L_0x0055:
                kotlin.h0.u.e.k0.k.e1 r12 = r12.mo38439x0()
                boolean r6 = r12 instanceof kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9553f
                r7 = 0
                r8 = 8
                r9 = 0
                r3 = r10
                r4 = r5
                r5 = r0
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9587l.C9589b.m30957a(kotlin.h0.u.e.k0.k.b0):kotlin.h0.u.e.k0.c.a.d0.d");
        }

        /* renamed from: a */
        private final C9550d m30959a(C11824b0 b0Var, boolean z, C9550d dVar) {
            C10249g gVar;
            C10241a aVar;
            if (!z || (aVar = this.f26458a) == null) {
                gVar = b0Var.getAnnotations();
            } else {
                gVar = C10254i.m34293a(aVar.getAnnotations(), b0Var.getAnnotations());
            }
            C9593d dVar2 = new C9593d(gVar);
            C9594e eVar = C9594e.f26470f;
            C9554g gVar2 = null;
            if (z) {
                C9416d b = this.f26462e.mo33893b();
                dVar = b != null ? b.mo33884a(this.f26463f) : null;
            }
            C9555h a = m30960a(gVar);
            if (a == null) {
                a = (dVar == null || dVar.mo34088b() == null) ? null : new C9555h(dVar.mo34088b(), dVar.mo34090d());
            }
            C9554g a2 = a != null ? a.mo34096a() : null;
            C9552e eVar2 = (C9552e) eVar.invoke(dVar2.invoke(C9633t.m31066j(), C9552e.READ_ONLY), dVar2.invoke(C9633t.m31063g(), C9552e.MUTABLE));
            if (a != null) {
                gVar2 = a.mo34096a();
            }
            boolean z2 = false;
            boolean z3 = gVar2 == C9554g.NOT_NULL && C11924a.m39419c(b0Var);
            if (a != null && a.mo34098b()) {
                z2 = true;
            }
            return new C9550d(a2, eVar2, z3, z2);
        }

        /* renamed from: a */
        private final C9555h m30960a(C10249g gVar) {
            C9587l lVar = this.f26464g;
            Iterator it = gVar.iterator();
            while (it.hasNext()) {
                C9555h a = lVar.mo34137a((C10243c) it.next());
                if (a != null) {
                    return a;
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final kotlin.p215c0.p216c.C9113l<java.lang.Integer, kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9550d> m30956a() {
            /*
                r14 = this;
                java.util.Collection<kotlin.h0.u.e.k0.k.b0> r0 = r14.f26460c
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r2 = kotlin.p262y.C10531p.m35750a(r0, (int) r2)
                r1.<init>(r2)
                java.util.Iterator r0 = r0.iterator()
            L_0x0011:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0025
                java.lang.Object r2 = r0.next()
                kotlin.h0.u.e.k0.k.b0 r2 = (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r2
                java.util.List r2 = r14.m30962b(r2)
                r1.add(r2)
                goto L_0x0011
            L_0x0025:
                kotlin.h0.u.e.k0.k.b0 r0 = r14.f26459b
                java.util.List r0 = r14.m30962b(r0)
                boolean r2 = r14.f26461d
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x005f
                java.util.Collection<kotlin.h0.u.e.k0.k.b0> r2 = r14.f26460c
                boolean r5 = r2 instanceof java.util.Collection
                if (r5 == 0) goto L_0x003f
                boolean r5 = r2.isEmpty()
                if (r5 == 0) goto L_0x003f
            L_0x003d:
                r2 = 0
                goto L_0x005b
            L_0x003f:
                java.util.Iterator r2 = r2.iterator()
            L_0x0043:
                boolean r5 = r2.hasNext()
                if (r5 == 0) goto L_0x003d
                java.lang.Object r5 = r2.next()
                kotlin.h0.u.e.k0.k.b0 r5 = (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r5
                kotlin.h0.u.e.k0.k.h1.g r6 = kotlin.p045h0.p046u.p047e.p048k0.p380k.p381h1.C11868g.f31579a
                kotlin.h0.u.e.k0.k.b0 r7 = r14.f26459b
                boolean r5 = r6.mo38535a(r5, r7)
                r5 = r5 ^ r4
                if (r5 == 0) goto L_0x0043
                r2 = 1
            L_0x005b:
                if (r2 == 0) goto L_0x005f
                r2 = 1
                goto L_0x0060
            L_0x005f:
                r2 = 0
            L_0x0060:
                if (r2 == 0) goto L_0x0064
                r5 = 1
                goto L_0x0068
            L_0x0064:
                int r5 = r0.size()
            L_0x0068:
                kotlin.h0.u.e.k0.c.a.d0.d[] r6 = new kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9550d[r5]
                r7 = 0
            L_0x006b:
                if (r7 >= r5) goto L_0x00c9
                if (r7 != 0) goto L_0x0071
                r8 = 1
                goto L_0x0072
            L_0x0071:
                r8 = 0
            L_0x0072:
                if (r8 != 0) goto L_0x0079
                if (r2 != 0) goto L_0x0077
                goto L_0x0079
            L_0x0077:
                r9 = 0
                goto L_0x007a
            L_0x0079:
                r9 = 1
            L_0x007a:
                boolean r10 = kotlin.C10485x.f28360a
                if (r10 == 0) goto L_0x0089
                if (r9 == 0) goto L_0x0081
                goto L_0x0089
            L_0x0081:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.String r1 = "Only head type constructors should be computed"
                r0.<init>(r1)
                throw r0
            L_0x0089:
                java.lang.Object r9 = r0.get(r7)
                kotlin.h0.u.e.k0.c.a.d0.p r9 = (kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9605p) r9
                kotlin.h0.u.e.k0.k.b0 r10 = r9.mo34158a()
                kotlin.h0.u.e.k0.c.a.d0.d r9 = r9.mo34159b()
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                java.util.Iterator r12 = r1.iterator()
            L_0x00a0:
                boolean r13 = r12.hasNext()
                if (r13 == 0) goto L_0x00c0
                java.lang.Object r13 = r12.next()
                java.util.List r13 = (java.util.List) r13
                java.lang.Object r13 = kotlin.p262y.C10539w.m35792d(r13, (int) r7)
                kotlin.h0.u.e.k0.c.a.d0.p r13 = (kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9605p) r13
                if (r13 == 0) goto L_0x00b9
                kotlin.h0.u.e.k0.k.b0 r13 = r13.mo34160c()
                goto L_0x00ba
            L_0x00b9:
                r13 = 0
            L_0x00ba:
                if (r13 == 0) goto L_0x00a0
                r11.add(r13)
                goto L_0x00a0
            L_0x00c0:
                kotlin.h0.u.e.k0.c.a.d0.d r8 = r14.m30958a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r10, (java.util.Collection<? extends kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0>) r11, (kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9550d) r9, (boolean) r8)
                r6[r7] = r8
                int r7 = r7 + 1
                goto L_0x006b
            L_0x00c9:
                kotlin.h0.u.e.k0.c.a.d0.l$b$a r0 = new kotlin.h0.u.e.k0.c.a.d0.l$b$a
                r0.<init>(r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9587l.C9589b.m30956a():kotlin.c0.c.l");
        }

        /* JADX WARNING: Removed duplicated region for block: B:63:0x0115  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0128  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9550d m30958a(kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0 r11, java.util.Collection<? extends kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0> r12, kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9550d r13, boolean r14) {
            /*
                r10 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 10
                int r1 = kotlin.p262y.C10531p.m35750a(r12, (int) r1)
                r0.<init>(r1)
                java.util.Iterator r1 = r12.iterator()
            L_0x000f:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0023
                java.lang.Object r2 = r1.next()
                kotlin.h0.u.e.k0.k.b0 r2 = (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r2
                kotlin.h0.u.e.k0.c.a.d0.d r2 = r10.m30957a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r2)
                r0.add(r2)
                goto L_0x000f
            L_0x0023:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r2 = r0.iterator()
            L_0x002c:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x0042
                java.lang.Object r3 = r2.next()
                kotlin.h0.u.e.k0.c.a.d0.d r3 = (kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9550d) r3
                kotlin.h0.u.e.k0.c.a.d0.e r3 = r3.mo34087a()
                if (r3 == 0) goto L_0x002c
                r1.add(r3)
                goto L_0x002c
            L_0x0042:
                java.util.Set r1 = kotlin.p262y.C10539w.m35818q(r1)
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r3 = r0.iterator()
            L_0x004f:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x0065
                java.lang.Object r4 = r3.next()
                kotlin.h0.u.e.k0.c.a.d0.d r4 = (kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9550d) r4
                kotlin.h0.u.e.k0.c.a.d0.g r4 = r4.mo34088b()
                if (r4 == 0) goto L_0x004f
                r2.add(r4)
                goto L_0x004f
            L_0x0065:
                java.util.Set r2 = kotlin.p262y.C10539w.m35818q(r2)
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Iterator r12 = r12.iterator()
            L_0x0072:
                boolean r4 = r12.hasNext()
                if (r4 == 0) goto L_0x0090
                java.lang.Object r4 = r12.next()
                kotlin.h0.u.e.k0.k.b0 r4 = (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r4
                kotlin.h0.u.e.k0.k.b0 r4 = kotlin.p045h0.p046u.p047e.p048k0.p380k.C11828c1.m38953b(r4)
                kotlin.h0.u.e.k0.c.a.d0.d r4 = r10.m30957a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r4)
                kotlin.h0.u.e.k0.c.a.d0.g r4 = r4.mo34088b()
                if (r4 == 0) goto L_0x0072
                r3.add(r4)
                goto L_0x0072
            L_0x0090:
                java.util.Set r12 = kotlin.p262y.C10539w.m35818q(r3)
                kotlin.h0.u.e.k0.c.a.d0.d r11 = r10.m30959a(r11, r14, r13)
                boolean r13 = r11.mo34090d()
                r3 = 1
                r13 = r13 ^ r3
                r4 = 0
                if (r13 == 0) goto L_0x00a3
                r13 = r11
                goto L_0x00a4
            L_0x00a3:
                r13 = r4
            L_0x00a4:
                if (r13 == 0) goto L_0x00ab
                kotlin.h0.u.e.k0.c.a.d0.g r13 = r13.mo34088b()
                goto L_0x00ac
            L_0x00ab:
                r13 = r4
            L_0x00ac:
                kotlin.h0.u.e.k0.c.a.d0.g r5 = r11.mo34088b()
                boolean r6 = r10.f26461d
                r7 = 0
                if (r6 == 0) goto L_0x00b9
                if (r14 == 0) goto L_0x00b9
                r6 = 1
                goto L_0x00ba
            L_0x00b9:
                r6 = 0
            L_0x00ba:
                kotlin.h0.u.e.k0.c.a.d0.g r8 = kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9603n.m30984a(r2, r13, r6)
                if (r8 == 0) goto L_0x00d2
                boolean r9 = r10.m30963b()
                if (r9 == 0) goto L_0x00ce
                if (r14 == 0) goto L_0x00ce
                kotlin.h0.u.e.k0.c.a.d0.g r14 = kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9554g.NULLABLE
                if (r8 != r14) goto L_0x00ce
                r14 = 1
                goto L_0x00cf
            L_0x00ce:
                r14 = 0
            L_0x00cf:
                if (r14 != 0) goto L_0x00d2
                r4 = r8
            L_0x00d2:
                kotlin.h0.u.e.k0.c.a.d0.e r14 = kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9552e.MUTABLE
                kotlin.h0.u.e.k0.c.a.d0.e r8 = kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9552e.READ_ONLY
                kotlin.h0.u.e.k0.c.a.d0.e r9 = r11.mo34087a()
                java.lang.Object r14 = kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9603n.m30982a(r1, r14, r8, r9, r6)
                kotlin.h0.u.e.k0.c.a.d0.e r14 = (kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9552e) r14
                if (r5 != r13) goto L_0x00ec
                boolean r13 = kotlin.jvm.internal.C10202j.m34176a((java.lang.Object) r12, (java.lang.Object) r2)
                r13 = r13 ^ r3
                if (r13 == 0) goto L_0x00ea
                goto L_0x00ec
            L_0x00ea:
                r13 = 0
                goto L_0x00ed
            L_0x00ec:
                r13 = 1
            L_0x00ed:
                boolean r11 = r11.mo34089c()
                if (r11 != 0) goto L_0x0117
                boolean r11 = r0.isEmpty()
                if (r11 == 0) goto L_0x00fb
            L_0x00f9:
                r11 = 0
                goto L_0x0112
            L_0x00fb:
                java.util.Iterator r11 = r0.iterator()
            L_0x00ff:
                boolean r0 = r11.hasNext()
                if (r0 == 0) goto L_0x00f9
                java.lang.Object r0 = r11.next()
                kotlin.h0.u.e.k0.c.a.d0.d r0 = (kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9550d) r0
                boolean r0 = r0.mo34089c()
                if (r0 == 0) goto L_0x00ff
                r11 = 1
            L_0x0112:
                if (r11 == 0) goto L_0x0115
                goto L_0x0117
            L_0x0115:
                r11 = 0
                goto L_0x0118
            L_0x0117:
                r11 = 1
            L_0x0118:
                if (r4 != 0) goto L_0x0125
                if (r13 == 0) goto L_0x0125
                kotlin.h0.u.e.k0.c.a.d0.g r12 = kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9603n.m30984a(r12, r5, r6)
                kotlin.h0.u.e.k0.c.a.d0.d r11 = kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9603n.m30983a(r12, r14, r3, r11)
                return r11
            L_0x0125:
                if (r4 != 0) goto L_0x0128
                goto L_0x0129
            L_0x0128:
                r3 = 0
            L_0x0129:
                kotlin.h0.u.e.k0.c.a.d0.d r11 = kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9603n.m30983a(r4, r14, r3, r11)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9587l.C9589b.m30958a(kotlin.h0.u.e.k0.k.b0, java.util.Collection, kotlin.h0.u.e.k0.c.a.d0.d, boolean):kotlin.h0.u.e.k0.c.a.d0.d");
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.c.a.d0.l$c */
    /* compiled from: signatureEnhancement.kt */
    private static final class C9596c extends C9588a {

        /* renamed from: d */
        private final boolean f26472d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9596c(C11824b0 b0Var, boolean z, boolean z2, boolean z3) {
            super(b0Var, z2, z3);
            C10202j.m34178b(b0Var, "type");
            this.f26472d = z;
        }

        /* renamed from: d */
        public final boolean mo34147d() {
            return this.f26472d;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.c.a.d0.l$d */
    /* compiled from: signatureEnhancement.kt */
    static final class C9597d extends C10203k implements C9113l<C10238b, C11824b0> {

        /* renamed from: f */
        public static final C9597d f26473f = new C9597d();

        C9597d() {
            super(1);
        }

        /* renamed from: a */
        public final C11824b0 invoke(C10238b bVar) {
            C10202j.m34178b(bVar, "it");
            C10358l0 b0 = bVar.mo35405b0();
            if (b0 != null) {
                C10202j.m34174a((Object) b0, "it.extensionReceiverParameter!!");
                C11824b0 type = b0.getType();
                C10202j.m34174a((Object) type, "it.extensionReceiverParameter!!.type");
                return type;
            }
            C10202j.m34172a();
            throw null;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.c.a.d0.l$e */
    /* compiled from: signatureEnhancement.kt */
    static final class C9598e extends C10203k implements C9113l<C10238b, C11824b0> {

        /* renamed from: f */
        public static final C9598e f26474f = new C9598e();

        C9598e() {
            super(1);
        }

        /* renamed from: a */
        public final C11824b0 invoke(C10238b bVar) {
            C10202j.m34178b(bVar, "it");
            C11824b0 returnType = bVar.getReturnType();
            if (returnType != null) {
                return returnType;
            }
            C10202j.m34172a();
            throw null;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.c.a.d0.l$f */
    /* compiled from: signatureEnhancement.kt */
    static final class C9599f extends C10203k implements C9113l<C10238b, C11824b0> {

        /* renamed from: f */
        final /* synthetic */ C10386v0 f26475f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9599f(C10386v0 v0Var) {
            super(1);
            this.f26475f = v0Var;
        }

        /* renamed from: a */
        public final C11824b0 invoke(C10238b bVar) {
            C10202j.m34178b(bVar, "it");
            C10386v0 v0Var = bVar.mo35407f().get(this.f26475f.mo35487e());
            C10202j.m34174a((Object) v0Var, "it.valueParameters[p.index]");
            C11824b0 type = v0Var.getType();
            C10202j.m34174a((Object) type, "it.valueParameters[p.index].type");
            return type;
        }
    }

    public C9587l(C9405a aVar, C12157e eVar) {
        C10202j.m34178b(aVar, "annotationTypeQualifierResolver");
        C10202j.m34178b(eVar, "jsr305State");
        this.f26453a = aVar;
        this.f26454b = eVar;
    }

    /* renamed from: b */
    private final C9555h m30949b(C10243c cVar) {
        C9555h hVar;
        C9934b c = cVar.mo33922c();
        if (c == null) {
            return null;
        }
        if (C9633t.m31065i().contains(c)) {
            hVar = new C9555h(C9554g.NULLABLE, false, 2, (DefaultConstructorMarker) null);
        } else if (C9633t.m31064h().contains(c)) {
            hVar = new C9555h(C9554g.NOT_NULL, false, 2, (DefaultConstructorMarker) null);
        } else if (C10202j.m34176a((Object) c, (Object) C9633t.m31062f())) {
            hVar = m30950c(cVar);
        } else if (C10202j.m34176a((Object) c, (Object) C9633t.m31060d()) && this.f26454b.mo38757b()) {
            hVar = new C9555h(C9554g.NULLABLE, false, 2, (DefaultConstructorMarker) null);
        } else if (C10202j.m34176a((Object) c, (Object) C9633t.m31059c()) && this.f26454b.mo38757b()) {
            hVar = new C9555h(C9554g.NOT_NULL, false, 2, (DefaultConstructorMarker) null);
        } else if (C10202j.m34176a((Object) c, (Object) C9633t.m31057a())) {
            hVar = new C9555h(C9554g.NOT_NULL, true);
        } else {
            hVar = C10202j.m34176a((Object) c, (Object) C9633t.m31058b()) ? new C9555h(C9554g.NULLABLE, true) : null;
        }
        if (hVar != null) {
            return (hVar.mo34098b() || !(cVar instanceof C9675i) || !((C9675i) cVar).mo33923e()) ? hVar : C9555h.m30903a(hVar, (C9554g) null, true, 1, (Object) null);
        }
        return null;
    }

    /* renamed from: c */
    private final C9555h m30950c(C10243c cVar) {
        C9555h hVar;
        C10037g<?> a = C10071a.m33886a(cVar);
        if (!(a instanceof C10042j)) {
            a = null;
        }
        C10042j jVar = (C10042j) a;
        if (jVar == null) {
            return new C9555h(C9554g.NOT_NULL, false, 2, (DefaultConstructorMarker) null);
        }
        String a2 = jVar.mo35251b().mo35021a();
        switch (a2.hashCode()) {
            case 73135176:
                if (!a2.equals("MAYBE")) {
                    return null;
                }
                break;
            case 74175084:
                if (!a2.equals("NEVER")) {
                    return null;
                }
                break;
            case 433141802:
                if (a2.equals("UNKNOWN")) {
                    hVar = new C9555h(C9554g.FORCE_FLEXIBILITY, false, 2, (DefaultConstructorMarker) null);
                    break;
                } else {
                    return null;
                }
            case 1933739535:
                if (a2.equals("ALWAYS")) {
                    hVar = new C9555h(C9554g.NOT_NULL, false, 2, (DefaultConstructorMarker) null);
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        hVar = new C9555h(C9554g.NULLABLE, false, 2, (DefaultConstructorMarker) null);
        return hVar;
    }

    /* renamed from: a */
    public final C9555h mo34137a(C10243c cVar) {
        C9555h b;
        C10202j.m34178b(cVar, "annotationDescriptor");
        C9555h b2 = m30949b(cVar);
        if (b2 != null) {
            return b2;
        }
        C10243c d = this.f26453a.mo33857d(cVar);
        if (d == null) {
            return null;
        }
        C12162h a = this.f26453a.mo33853a(cVar);
        if (!a.mo38770d() && (b = m30949b(d)) != null) {
            return C9555h.m30903a(b, (C9554g) null, a.mo38771e(), 1, (Object) null);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01e0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.C10238b> D m30947a(D r17, kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.C9422h r18) {
        /*
            r16 = this;
            r7 = r16
            r8 = r17
            boolean r0 = r8 instanceof kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p237z.C9666b
            if (r0 != 0) goto L_0x0009
            return r8
        L_0x0009:
            r9 = r8
            kotlin.h0.u.e.k0.c.a.z.b r9 = (kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p237z.C9666b) r9
            kotlin.reflect.jvm.internal.impl.descriptors.b$a r0 = r9.mo35423g()
            kotlin.reflect.jvm.internal.impl.descriptors.b$a r1 = kotlin.reflect.jvm.internal.impl.descriptors.C10238b.C10239a.FAKE_OVERRIDE
            r10 = 1
            if (r0 != r1) goto L_0x0029
            kotlin.reflect.jvm.internal.impl.descriptors.b r0 = r9.mo35404a()
            java.lang.String r1 = "original"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r0, (java.lang.String) r1)
            java.util.Collection r0 = r0.mo35406d()
            int r0 = r0.size()
            if (r0 != r10) goto L_0x0029
            return r8
        L_0x0029:
            kotlin.reflect.jvm.internal.impl.descriptors.b1.g r0 = r17.getAnnotations()
            r1 = r18
            kotlin.h0.u.e.k0.c.a.a0.h r4 = kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.C9409a.m30481b(r1, r0)
            boolean r0 = r8 instanceof kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p237z.C9673g
            r11 = 0
            if (r0 == 0) goto L_0x0058
            r0 = r8
            kotlin.h0.u.e.k0.c.a.z.g r0 = (kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p237z.C9673g) r0
            kotlin.reflect.jvm.internal.impl.descriptors.d1.a0 r1 = r0.getGetter()
            if (r1 == 0) goto L_0x0058
            boolean r1 = r1.mo35569P()
            if (r1 != 0) goto L_0x0058
            kotlin.reflect.jvm.internal.impl.descriptors.d1.a0 r0 = r0.getGetter()
            if (r0 == 0) goto L_0x0054
            java.lang.String r1 = "getter!!"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r0, (java.lang.String) r1)
            r2 = r0
            goto L_0x0059
        L_0x0054:
            kotlin.jvm.internal.C10202j.m34172a()
            throw r11
        L_0x0058:
            r2 = r8
        L_0x0059:
            kotlin.reflect.jvm.internal.impl.descriptors.l0 r0 = r9.mo35405b0()
            if (r0 == 0) goto L_0x0080
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C10382u
            if (r0 != 0) goto L_0x0065
            r0 = r11
            goto L_0x0066
        L_0x0065:
            r0 = r2
        L_0x0066:
            kotlin.reflect.jvm.internal.impl.descriptors.u r0 = (kotlin.reflect.jvm.internal.impl.descriptors.C10382u) r0
            if (r0 == 0) goto L_0x0073
            kotlin.reflect.jvm.internal.impl.descriptors.a$a<kotlin.reflect.jvm.internal.impl.descriptors.v0> r1 = kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p237z.C9670f.f26594J
            java.lang.Object r0 = r0.mo34229a(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.v0 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.C10386v0) r0
            goto L_0x0074
        L_0x0073:
            r0 = r11
        L_0x0074:
            kotlin.h0.u.e.k0.c.a.d0.l$d r1 = kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9587l.C9597d.f26473f
            kotlin.h0.u.e.k0.c.a.d0.l$b r0 = r7.m30946a(r8, r0, r4, r1)
            kotlin.h0.u.e.k0.c.a.d0.l$a r0 = kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9587l.C9589b.m30961a((kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9587l.C9589b) r0, (kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9607r) r11, (int) r10, (java.lang.Object) r11)
            r12 = r0
            goto L_0x0081
        L_0x0080:
            r12 = r11
        L_0x0081:
            boolean r0 = r8 instanceof kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p237z.C9670f
            if (r0 != 0) goto L_0x0087
            r0 = r11
            goto L_0x0088
        L_0x0087:
            r0 = r8
        L_0x0088:
            kotlin.h0.u.e.k0.c.a.z.f r0 = (kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p237z.C9670f) r0
            r13 = 0
            if (r0 == 0) goto L_0x00b6
            kotlin.h0.u.e.k0.c.b.u r1 = kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9737u.f26706a
            kotlin.reflect.jvm.internal.impl.descriptors.m r3 = r0.mo33762b()
            if (r3 == 0) goto L_0x00ae
            kotlin.reflect.jvm.internal.impl.descriptors.e r3 = (kotlin.reflect.jvm.internal.impl.descriptors.C10342e) r3
            r5 = 3
            java.lang.String r0 = kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9734s.m31395a(r0, r13, r13, r5, r11)
            java.lang.String r0 = r1.mo34337a((kotlin.reflect.jvm.internal.impl.descriptors.C10342e) r3, (java.lang.String) r0)
            if (r0 == 0) goto L_0x00b6
            java.util.Map r1 = kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9556i.m30910d()
            java.lang.Object r0 = r1.get(r0)
            kotlin.h0.u.e.k0.c.a.d0.j r0 = (kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9585j) r0
            r14 = r0
            goto L_0x00b7
        L_0x00ae:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            r0.<init>(r1)
            throw r0
        L_0x00b6:
            r14 = r11
        L_0x00b7:
            if (r14 == 0) goto L_0x0111
            java.util.List r0 = r14.mo34130a()
            int r0 = r0.size()
            java.util.List r1 = r9.mo35407f()
            int r1 = r1.size()
            if (r0 != r1) goto L_0x00cd
            r0 = 1
            goto L_0x00ce
        L_0x00cd:
            r0 = 0
        L_0x00ce:
            boolean r1 = kotlin.C10485x.f28360a
            if (r1 == 0) goto L_0x0111
            if (r0 == 0) goto L_0x00d5
            goto L_0x0111
        L_0x00d5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Predefined enhancement info for "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = " has "
            r0.append(r1)
            java.util.List r1 = r14.mo34130a()
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = ", but "
            r0.append(r1)
            java.util.List r1 = r9.mo35407f()
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = " expected"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
        L_0x0111:
            java.util.List r0 = r2.mo35407f()
            java.lang.String r1 = "annotationOwnerForMember.valueParameters"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r0, (java.lang.String) r1)
            java.util.ArrayList r15 = new java.util.ArrayList
            r6 = 10
            int r1 = kotlin.p262y.C10531p.m35750a(r0, (int) r6)
            r15.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0129:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x019a
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.v0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.C10386v0) r1
            kotlin.h0.u.e.k0.c.a.d0.l$f r3 = new kotlin.h0.u.e.k0.c.a.d0.l$f
            r3.<init>(r1)
            kotlin.h0.u.e.k0.c.a.d0.l$b r3 = r7.m30946a(r8, r1, r4, r3)
            if (r14 == 0) goto L_0x0151
            java.util.List r5 = r14.mo34130a()
            if (r5 == 0) goto L_0x0151
            int r6 = r1.mo35487e()
            java.lang.Object r5 = kotlin.p262y.C10539w.m35792d(r5, (int) r6)
            kotlin.h0.u.e.k0.c.a.d0.r r5 = (kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9607r) r5
            goto L_0x0152
        L_0x0151:
            r5 = r11
        L_0x0152:
            kotlin.h0.u.e.k0.c.a.d0.l$a r3 = r3.mo34141a((kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9607r) r5)
            boolean r5 = r3.mo34140c()
            java.lang.String r6 = "p"
            if (r5 == 0) goto L_0x0163
            kotlin.h0.u.e.k0.k.b0 r5 = r3.mo34139b()
            goto L_0x016f
        L_0x0163:
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r1, (java.lang.String) r6)
            kotlin.h0.u.e.k0.k.b0 r5 = r1.getType()
            java.lang.String r11 = "p.type"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r5, (java.lang.String) r11)
        L_0x016f:
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r1, (java.lang.String) r6)
            boolean r5 = r7.m30948a((kotlin.reflect.jvm.internal.impl.descriptors.C10386v0) r1, (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r5)
            boolean r6 = r3.mo34140c()
            if (r6 != 0) goto L_0x0185
            boolean r1 = r1.mo35489h0()
            if (r5 == r1) goto L_0x0183
            goto L_0x0185
        L_0x0183:
            r1 = 0
            goto L_0x0186
        L_0x0185:
            r1 = 1
        L_0x0186:
            kotlin.h0.u.e.k0.c.a.d0.l$c r6 = new kotlin.h0.u.e.k0.c.a.d0.l$c
            kotlin.h0.u.e.k0.k.b0 r11 = r3.mo34139b()
            boolean r3 = r3.mo34138a()
            r6.<init>(r11, r5, r1, r3)
            r15.add(r6)
            r6 = 10
            r11 = 0
            goto L_0x0129
        L_0x019a:
            r3 = 1
            boolean r0 = r8 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C10352i0
            if (r0 != 0) goto L_0x01a1
            r0 = 0
            goto L_0x01a2
        L_0x01a1:
            r0 = r8
        L_0x01a2:
            kotlin.reflect.jvm.internal.impl.descriptors.i0 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.C10352i0) r0
            if (r0 == 0) goto L_0x01af
            boolean r0 = kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.p231n.C9434c.m30551a(r0)
            if (r0 != r10) goto L_0x01af
            kotlin.h0.u.e.k0.c.a.a$a r0 = kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.C9405a.C9406a.FIELD
            goto L_0x01b1
        L_0x01af:
            kotlin.h0.u.e.k0.c.a.a$a r0 = kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.C9405a.C9406a.METHOD_RETURN_TYPE
        L_0x01b1:
            r5 = r0
            kotlin.h0.u.e.k0.c.a.d0.l$e r6 = kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9587l.C9598e.f26474f
            r0 = r16
            r1 = r17
            r11 = 10
            kotlin.h0.u.e.k0.c.a.d0.l$b r0 = r0.m30945a(r1, r2, r3, r4, r5, r6)
            if (r14 == 0) goto L_0x01c5
            kotlin.h0.u.e.k0.c.a.d0.r r1 = r14.mo34131b()
            goto L_0x01c6
        L_0x01c5:
            r1 = 0
        L_0x01c6:
            kotlin.h0.u.e.k0.c.a.d0.l$a r0 = r0.mo34141a((kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9607r) r1)
            if (r12 == 0) goto L_0x01d2
            boolean r1 = r12.mo34138a()
            if (r1 == r10) goto L_0x01fc
        L_0x01d2:
            boolean r1 = r0.mo34138a()
            if (r1 != 0) goto L_0x01fc
            boolean r1 = r15.isEmpty()
            if (r1 == 0) goto L_0x01e0
        L_0x01de:
            r1 = 0
            goto L_0x01f7
        L_0x01e0:
            java.util.Iterator r1 = r15.iterator()
        L_0x01e4:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01de
            java.lang.Object r2 = r1.next()
            kotlin.h0.u.e.k0.c.a.d0.l$c r2 = (kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9587l.C9596c) r2
            boolean r2 = r2.mo34138a()
            if (r2 == 0) goto L_0x01e4
            r1 = 1
        L_0x01f7:
            if (r1 == 0) goto L_0x01fa
            goto L_0x01fc
        L_0x01fa:
            r1 = 0
            goto L_0x01fd
        L_0x01fc:
            r1 = 1
        L_0x01fd:
            if (r12 == 0) goto L_0x0205
            boolean r2 = r12.mo34140c()
            if (r2 == r10) goto L_0x022f
        L_0x0205:
            boolean r2 = r0.mo34140c()
            if (r2 != 0) goto L_0x022f
            boolean r2 = r15.isEmpty()
            if (r2 == 0) goto L_0x0213
        L_0x0211:
            r10 = 0
            goto L_0x0229
        L_0x0213:
            java.util.Iterator r2 = r15.iterator()
        L_0x0217:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0211
            java.lang.Object r3 = r2.next()
            kotlin.h0.u.e.k0.c.a.d0.l$c r3 = (kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9587l.C9596c) r3
            boolean r3 = r3.mo34140c()
            if (r3 == 0) goto L_0x0217
        L_0x0229:
            if (r10 != 0) goto L_0x022f
            if (r1 == 0) goto L_0x022e
            goto L_0x022f
        L_0x022e:
            return r8
        L_0x022f:
            if (r1 == 0) goto L_0x023f
            kotlin.reflect.jvm.internal.impl.descriptors.a$a r1 = kotlin.p045h0.p046u.p047e.p048k0.p248h.p252n.C10069a.m33882a()
            kotlin.h0.u.e.k0.c.a.g r2 = new kotlin.h0.u.e.k0.c.a.g
            r2.<init>(r8)
            kotlin.n r1 = kotlin.C10481t.m35502a(r1, r2)
            goto L_0x0240
        L_0x023f:
            r1 = 0
        L_0x0240:
            if (r12 == 0) goto L_0x0247
            kotlin.h0.u.e.k0.k.b0 r2 = r12.mo34139b()
            goto L_0x0248
        L_0x0247:
            r2 = 0
        L_0x0248:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = kotlin.p262y.C10531p.m35750a(r15, (int) r11)
            r3.<init>(r4)
            java.util.Iterator r4 = r15.iterator()
        L_0x0255:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0272
            java.lang.Object r5 = r4.next()
            kotlin.h0.u.e.k0.c.a.d0.l$c r5 = (kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9587l.C9596c) r5
            kotlin.h0.u.e.k0.c.a.z.l r6 = new kotlin.h0.u.e.k0.c.a.z.l
            kotlin.h0.u.e.k0.k.b0 r8 = r5.mo34139b()
            boolean r5 = r5.mo34147d()
            r6.<init>(r8, r5)
            r3.add(r6)
            goto L_0x0255
        L_0x0272:
            kotlin.h0.u.e.k0.k.b0 r0 = r0.mo34139b()
            kotlin.h0.u.e.k0.c.a.z.b r0 = r9.mo34220a(r2, r3, r0, r1)
            if (r0 == 0) goto L_0x027d
            return r0
        L_0x027d:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type D"
            r0.<init>(r1)
            goto L_0x0286
        L_0x0285:
            throw r0
        L_0x0286:
            goto L_0x0285
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9587l.m30947a(kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.h0.u.e.k0.c.a.a0.h):kotlin.reflect.jvm.internal.impl.descriptors.b");
    }

    /* renamed from: a */
    private final boolean m30948a(C10386v0 v0Var, C11824b0 b0Var) {
        boolean z;
        C9665a a = C9677k.m31184a(v0Var);
        if (a instanceof C9676j) {
            z = C9640x.m31092a(b0Var, ((C9676j) a).mo34232a()) != null;
        } else if (C10202j.m34176a((Object) a, (Object) C9674h.f26605a)) {
            z = C11821a1.m38907a(b0Var);
        } else if (a == null) {
            z = v0Var.mo35489h0();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (!z || !v0Var.mo35406d().isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.C9409a.m30481b(r11, r10.getAnnotations());
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9587l.C9589b m30946a(kotlin.reflect.jvm.internal.impl.descriptors.C10238b r9, kotlin.reflect.jvm.internal.impl.descriptors.C10386v0 r10, kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.C9422h r11, kotlin.p215c0.p216c.C9113l<? super kotlin.reflect.jvm.internal.impl.descriptors.C10238b, ? extends kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0> r12) {
        /*
            r8 = this;
            if (r10 == 0) goto L_0x000e
            kotlin.reflect.jvm.internal.impl.descriptors.b1.g r0 = r10.getAnnotations()
            kotlin.h0.u.e.k0.c.a.a0.h r0 = kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.C9409a.m30481b(r11, r0)
            if (r0 == 0) goto L_0x000e
            r5 = r0
            goto L_0x000f
        L_0x000e:
            r5 = r11
        L_0x000f:
            kotlin.h0.u.e.k0.c.a.a$a r6 = kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.C9405a.C9406a.VALUE_PARAMETER
            r4 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r7 = r12
            kotlin.h0.u.e.k0.c.a.d0.l$b r9 = r1.m30945a(r2, r3, r4, r5, r6, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9587l.m30946a(kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.v0, kotlin.h0.u.e.k0.c.a.a0.h, kotlin.c0.c.l):kotlin.h0.u.e.k0.c.a.d0.l$b");
    }

    /* renamed from: a */
    private final C9589b m30945a(C10238b bVar, C10241a aVar, boolean z, C9422h hVar, C9405a.C9406a aVar2, C9113l<? super C10238b, ? extends C11824b0> lVar) {
        C11824b0 b0Var = (C11824b0) lVar.invoke(bVar);
        Collection<? extends C10238b> d = bVar.mo35406d();
        C10202j.m34174a((Object) d, "this.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(C10531p.m35750a(d, 10));
        for (C10238b bVar2 : d) {
            C10202j.m34174a((Object) bVar2, "it");
            arrayList.add((C11824b0) lVar.invoke(bVar2));
        }
        return new C9589b(this, aVar, b0Var, arrayList, z, C9409a.m30481b(hVar, ((C11824b0) lVar.invoke(bVar)).getAnnotations()), aVar2);
    }

    /* renamed from: a */
    public final <D extends C10238b> Collection<D> mo34136a(C9422h hVar, Collection<? extends D> collection) {
        C10202j.m34178b(hVar, "c");
        C10202j.m34178b(collection, "platformSignatures");
        ArrayList arrayList = new ArrayList(C10531p.m35750a(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(m30947a((C10238b) it.next(), hVar));
        }
        return arrayList;
    }
}
