package kotlin.p045h0.p046u.p047e.p048k0.p380k.p385l1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C10221n;
import kotlin.C10483v;
import kotlin.C10485x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p247g.C9945b;
import kotlin.p045h0.p046u.p047e.p048k0.p247g.C9949c;
import kotlin.p045h0.p046u.p047e.p048k0.p247g.C9977i;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p249l.p250a.C10024b;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p249l.p250a.C10026d;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11821a1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11827c0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11828c1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11834e1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11955t0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11970w0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11972x0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11975y;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11976y0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11978z0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p384k1.C11924a;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;
import p015cm.aptoide.p016pt.database.room.RoomNotification;

/* renamed from: kotlin.h0.u.e.k0.k.l1.c */
/* compiled from: CapturedTypeApproximation.kt */
public final class C11930c {

    /* renamed from: kotlin.h0.u.e.k0.k.l1.c$a */
    /* compiled from: CapturedTypeApproximation.kt */
    static final class C11931a extends C10203k implements C9113l<C11824b0, C11824b0> {

        /* renamed from: f */
        final /* synthetic */ C11824b0 f31634f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11931a(C11824b0 b0Var) {
            super(1);
            this.f31634f = b0Var;
        }

        /* renamed from: a */
        public final C11824b0 invoke(C11824b0 b0Var) {
            C10202j.m34178b(b0Var, "$this$makeNullableIfNeeded");
            C11824b0 b = C11821a1.m38910b(b0Var, this.f31634f.mo34094w0());
            C10202j.m34174a((Object) b, "TypeUtils.makeNullableIf…s, type.isMarkedNullable)");
            return b;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.k.l1.c$b */
    /* compiled from: CapturedTypeApproximation.kt */
    static final class C11932b extends C10203k implements C9113l<C11834e1, Boolean> {

        /* renamed from: f */
        public static final C11932b f31635f = new C11932b();

        C11932b() {
            super(1);
        }

        /* renamed from: a */
        public final boolean mo38585a(C11834e1 e1Var) {
            C10202j.m34174a((Object) e1Var, "it");
            return C10026d.m33800a((C11824b0) e1Var);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo38585a((C11834e1) obj));
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.k.l1.c$c */
    /* compiled from: CapturedTypeApproximation.kt */
    public static final class C11933c extends C11955t0 {
        C11933c() {
        }

        /* renamed from: a */
        public C11965u0 mo38586a(C11953s0 s0Var) {
            C10202j.m34178b(s0Var, RoomNotification.KEY);
            if (!(s0Var instanceof C10024b)) {
                s0Var = null;
            }
            C10024b bVar = (C10024b) s0Var;
            if (bVar == null) {
                return null;
            }
            if (bVar.mo35228d().mo38597b()) {
                return new C11970w0(C11838f1.OUT_VARIANCE, bVar.mo35228d().getType());
            }
            return bVar.mo35228d();
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.k.l1.c$d */
    /* compiled from: CapturedTypeApproximation.kt */
    static final class C11934d extends C10203k implements C9113l<C9977i, C10483v> {

        /* renamed from: f */
        public static final C11934d f31636f = new C11934d();

        C11934d() {
            super(1);
        }

        /* renamed from: a */
        public final void mo38587a(C9977i iVar) {
            C10202j.m34178b(iVar, "$receiver");
            iVar.mo35083a((C9945b) C9945b.C9946a.f27450a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38587a((C9977i) obj);
            return C10483v.f28357a;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.k.l1.c$e */
    /* compiled from: CapturedTypeApproximation.kt */
    static final class C11935e extends C10203k implements C9113l<C11838f1, C11838f1> {

        /* renamed from: f */
        final /* synthetic */ C11936d f31637f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11935e(C11936d dVar) {
            super(1);
            this.f31637f = dVar;
        }

        /* renamed from: a */
        public final C11838f1 invoke(C11838f1 f1Var) {
            C10202j.m34178b(f1Var, "variance");
            return f1Var == this.f31637f.mo38591c().mo35439G() ? C11838f1.INVARIANT : f1Var;
        }
    }

    /* renamed from: a */
    private static final C11936d m39449a(C11965u0 u0Var, C10375s0 s0Var) {
        int i = C11929b.f31632a[C11978z0.m39660a(s0Var.mo35439G(), u0Var).ordinal()];
        if (i == 1) {
            C11824b0 type = u0Var.getType();
            C10202j.m34174a((Object) type, "type");
            C11824b0 type2 = u0Var.getType();
            C10202j.m34174a((Object) type2, "type");
            return new C11936d(s0Var, type, type2);
        } else if (i == 2) {
            C11824b0 type3 = u0Var.getType();
            C10202j.m34174a((Object) type3, "type");
            C11901j0 u = C10071a.m33892b((C10359m) s0Var).mo33725u();
            C10202j.m34174a((Object) u, "typeParameter.builtIns.nullableAnyType");
            return new C11936d(s0Var, type3, u);
        } else if (i == 3) {
            C11901j0 t = C10071a.m33892b((C10359m) s0Var).mo33724t();
            C10202j.m34174a((Object) t, "typeParameter.builtIns.nothingType");
            C11824b0 type4 = u0Var.getType();
            C10202j.m34174a((Object) type4, "type");
            return new C11936d(s0Var, t, type4);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: b */
    private static final C11965u0 m39452b(C11936d dVar) {
        C11970w0 w0Var;
        boolean d = dVar.mo38592d();
        if (!C10485x.f28360a || d) {
            C11935e eVar = new C11935e(dVar);
            if (C10202j.m34176a((Object) dVar.mo38589a(), (Object) dVar.mo38590b())) {
                return new C11970w0(dVar.mo38589a());
            }
            if (C9333g.m30202n(dVar.mo38589a()) && dVar.mo38591c().mo35439G() != C11838f1.IN_VARIANCE) {
                w0Var = new C11970w0(eVar.invoke(C11838f1.OUT_VARIANCE), dVar.mo38590b());
            } else if (C9333g.m30204p(dVar.mo38590b())) {
                w0Var = new C11970w0(eVar.invoke(C11838f1.IN_VARIANCE), dVar.mo38589a());
            } else {
                w0Var = new C11970w0(eVar.invoke(C11838f1.OUT_VARIANCE), dVar.mo38590b());
            }
            return w0Var;
        }
        C9949c a = C9949c.f27455c.mo35049a((C9113l<? super C9977i, C10483v>) C11934d.f31636f);
        throw new AssertionError("Only consistent enhanced type projection can be converted to type projection, but " + '[' + a.mo35037a((C10359m) dVar.mo38591c()) + ": <" + a.mo35034a(dVar.mo38589a()) + ", " + a.mo35034a(dVar.mo38590b()) + ">]" + " was found");
    }

    /* renamed from: a */
    public static final C11965u0 m39451a(C11965u0 u0Var, boolean z) {
        if (u0Var == null) {
            return null;
        }
        if (u0Var.mo38597b()) {
            return u0Var;
        }
        C11824b0 type = u0Var.getType();
        C10202j.m34174a((Object) type, "typeProjection.type");
        if (!C11821a1.m38908a(type, (C9113l<C11834e1, Boolean>) C11932b.f31635f)) {
            return u0Var;
        }
        C11838f1 a = u0Var.mo38596a();
        C10202j.m34174a((Object) a, "typeProjection.projectionKind");
        if (a == C11838f1.OUT_VARIANCE) {
            return new C11970w0(a, m39447a(type).mo38580d());
        }
        if (z) {
            return new C11970w0(a, m39447a(type).mo38579c());
        }
        return m39450a(u0Var);
    }

    /* renamed from: a */
    private static final C11965u0 m39450a(C11965u0 u0Var) {
        C11978z0 a = C11978z0.m39663a((C11972x0) new C11933c());
        C10202j.m34174a((Object) a, "TypeSubstitutor.create(o…ojection\n        }\n    })");
        return a.mo38621b(u0Var);
    }

    /* renamed from: a */
    public static final C11928a<C11824b0> m39447a(C11824b0 b0Var) {
        Object obj;
        C10202j.m34178b(b0Var, "type");
        if (C11975y.m39644b(b0Var)) {
            C11928a<C11824b0> a = m39447a((C11824b0) C11975y.m39645c(b0Var));
            C11928a<C11824b0> a2 = m39447a((C11824b0) C11975y.m39646d(b0Var));
            return new C11928a<>(C11828c1.m38952a(C11827c0.m38946a(C11975y.m39645c(a.mo38579c()), C11975y.m39646d(a2.mo38579c())), b0Var), C11828c1.m38952a(C11827c0.m38946a(C11975y.m39645c(a.mo38580d()), C11975y.m39646d(a2.mo38580d())), b0Var));
        }
        C11953s0 v0 = b0Var.mo35227v0();
        boolean z = true;
        if (C10026d.m33800a(b0Var)) {
            if (v0 != null) {
                C11965u0 d = ((C10024b) v0).mo35228d();
                C11931a aVar = new C11931a(b0Var);
                C11824b0 type = d.getType();
                C10202j.m34174a((Object) type, "typeProjection.type");
                C11824b0 a3 = aVar.invoke(type);
                int i = C11929b.f31633b[d.mo38596a().ordinal()];
                if (i == 1) {
                    C11901j0 u = C11924a.m39418b(b0Var).mo33725u();
                    C10202j.m34174a((Object) u, "type.builtIns.nullableAnyType");
                    return new C11928a<>(a3, u);
                } else if (i == 2) {
                    C11901j0 t = C11924a.m39418b(b0Var).mo33724t();
                    C10202j.m34174a((Object) t, "type.builtIns.nothingType");
                    return new C11928a<>(aVar.invoke(t), a3);
                } else {
                    throw new AssertionError("Only nontrivial projections should have been captured, not: " + d);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            }
        } else if (b0Var.mo35226u0().isEmpty() || b0Var.mo35226u0().size() != v0.getParameters().size()) {
            return new C11928a<>(b0Var, b0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<C11965u0> u0 = b0Var.mo35226u0();
            List<C10375s0> parameters = v0.getParameters();
            C10202j.m34174a((Object) parameters, "typeConstructor.parameters");
            for (C10221n next : C10539w.m35800e(u0, parameters)) {
                C11965u0 u0Var = (C11965u0) next.mo35389a();
                C10375s0 s0Var = (C10375s0) next.mo35390b();
                C10202j.m34174a((Object) s0Var, "typeParameter");
                C11936d a4 = m39449a(u0Var, s0Var);
                if (u0Var.mo38597b()) {
                    arrayList.add(a4);
                    arrayList2.add(a4);
                } else {
                    C11928a<C11936d> a5 = m39448a(a4);
                    arrayList.add(a5.mo38577a());
                    arrayList2.add(a5.mo38578b());
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((C11936d) it.next()).mo38592d()) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                obj = C11924a.m39418b(b0Var).mo33724t();
                C10202j.m34174a(obj, "type.builtIns.nothingType");
            } else {
                obj = m39446a(b0Var, (List<C11936d>) arrayList);
            }
            return new C11928a<>(obj, m39446a(b0Var, (List<C11936d>) arrayList2));
        }
    }

    /* renamed from: a */
    private static final C11824b0 m39446a(C11824b0 b0Var, List<C11936d> list) {
        boolean z = b0Var.mo35226u0().size() == list.size();
        if (!C10485x.f28360a || z) {
            ArrayList arrayList = new ArrayList(C10531p.m35750a(list, 10));
            for (C11936d b : list) {
                arrayList.add(m39452b(b));
            }
            return C11976y0.m39648a(b0Var, (List) arrayList, (C10249g) null, 2, (Object) null);
        }
        throw new AssertionError("Incorrect type arguments " + list);
    }

    /* renamed from: a */
    private static final C11928a<C11936d> m39448a(C11936d dVar) {
        C11928a<C11824b0> a = m39447a(dVar.mo38589a());
        C11928a<C11824b0> a2 = m39447a(dVar.mo38590b());
        return new C11928a<>(new C11936d(dVar.mo38591c(), a.mo38578b(), a2.mo38577a()), new C11936d(dVar.mo38591c(), a.mo38577a(), a2.mo38578b()));
    }
}
