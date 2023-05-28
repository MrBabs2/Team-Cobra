package kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.C9134f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9168l;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11827c0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11970w0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11976y0;
import kotlin.p215c0.p216c.C9102a;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.h0.u.e.k0.h.m.n */
/* compiled from: IntegerLiteralTypeConstructor.kt */
public final class C10048n implements C11953s0 {

    /* renamed from: f */
    static final /* synthetic */ C9168l[] f27633f = {C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a(C10048n.class), "supertypes", "getSupertypes()Ljava/util/List;"))};

    /* renamed from: g */
    public static final C10049a f27634g = new C10049a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final long f27635a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C10393y f27636b;

    /* renamed from: c */
    private final Set<C11824b0> f27637c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C11901j0 f27638d;

    /* renamed from: e */
    private final C9134f f27639e;

    /* renamed from: kotlin.h0.u.e.k0.h.m.n$a */
    /* compiled from: IntegerLiteralTypeConstructor.kt */
    public static final class C10049a {

        /* renamed from: kotlin.h0.u.e.k0.h.m.n$a$a */
        /* compiled from: IntegerLiteralTypeConstructor.kt */
        private enum C10050a {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE
        }

        private C10049a() {
        }

        /* renamed from: a */
        public final C11901j0 mo35256a(Collection<? extends C11901j0> collection) {
            C10202j.m34178b(collection, "types");
            return m33852a(collection, C10050a.INTERSECTION_TYPE);
        }

        public /* synthetic */ C10049a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final C11901j0 m33852a(Collection<? extends C11901j0> collection, C10050a aVar) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator<T> it = collection.iterator();
            if (it.hasNext()) {
                T next = it.next();
                while (it.hasNext()) {
                    C10049a aVar2 = C10048n.f27634g;
                    next = aVar2.m33855a((C11901j0) next, (C11901j0) it.next(), aVar);
                }
                return (C11901j0) next;
            }
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }

        /* renamed from: a */
        private final C11901j0 m33855a(C11901j0 j0Var, C11901j0 j0Var2, C10050a aVar) {
            if (j0Var == null || j0Var2 == null) {
                return null;
            }
            C11953s0 v0 = j0Var.mo35227v0();
            C11953s0 v02 = j0Var2.mo35227v0();
            boolean z = v0 instanceof C10048n;
            if (z && (v02 instanceof C10048n)) {
                return m33853a((C10048n) v0, (C10048n) v02, aVar);
            }
            if (z) {
                return m33854a((C10048n) v0, j0Var2);
            }
            if (v02 instanceof C10048n) {
                return m33854a((C10048n) v02, j0Var);
            }
            return null;
        }

        /* renamed from: a */
        private final C11901j0 m33853a(C10048n nVar, C10048n nVar2, C10050a aVar) {
            Set<T> set;
            int i = C10053o.f27645a[aVar.ordinal()];
            if (i == 1) {
                set = C10539w.m35781b(nVar.mo35254e(), nVar2.mo35254e());
            } else if (i == 2) {
                set = C10539w.m35797d(nVar.mo35254e(), nVar2.mo35254e());
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return C11827c0.m38947a(C10249g.f27910c.mo35429a(), new C10048n(nVar.f27635a, nVar.f27636b, set, (DefaultConstructorMarker) null), false);
        }

        /* renamed from: a */
        private final C11901j0 m33854a(C10048n nVar, C11901j0 j0Var) {
            if (nVar.mo35254e().contains(j0Var)) {
                return j0Var;
            }
            return null;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.h.m.n$b */
    /* compiled from: IntegerLiteralTypeConstructor.kt */
    static final class C10051b extends C10203k implements C9102a<List<C11901j0>> {

        /* renamed from: f */
        final /* synthetic */ C10048n f27643f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10051b(C10048n nVar) {
            super(0);
            this.f27643f = nVar;
        }

        public final List<C11901j0> invoke() {
            C10342e l = this.f27643f.mo35232l().mo33716l();
            C10202j.m34174a((Object) l, "builtIns.comparable");
            C11901j0 o = l.mo35445o();
            C10202j.m34174a((Object) o, "builtIns.comparable.defaultType");
            List<C11901j0> d = C10529o.m35745d(C11976y0.m39651a(o, C10527n.m35729a(new C11970w0(C11838f1.IN_VARIANCE, this.f27643f.f27638d)), (C10249g) null, 2, (Object) null));
            if (!this.f27643f.m33844f()) {
                d.add(this.f27643f.mo35232l().mo33728x());
            }
            return d;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.h.m.n$c */
    /* compiled from: IntegerLiteralTypeConstructor.kt */
    static final class C10052c extends C10203k implements C9113l<C11824b0, String> {

        /* renamed from: f */
        public static final C10052c f27644f = new C10052c();

        C10052c() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(C11824b0 b0Var) {
            C10202j.m34178b(b0Var, "it");
            return b0Var.toString();
        }
    }

    public /* synthetic */ C10048n(long j, C10393y yVar, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, yVar, set);
    }

    /* renamed from: a */
    private final List<C11824b0> mo35229a() {
        C9134f fVar = this.f27639e;
        C9168l lVar = f27633f[0];
        return (List) fVar.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final boolean m33844f() {
        Collection<C11824b0> a = C10063u.m33874a(this.f27636b);
        if ((a instanceof Collection) && a.isEmpty()) {
            return true;
        }
        for (C11824b0 contains : a) {
            if (!(!this.f27637c.contains(contains))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    private final String m33845g() {
        return '[' + C10539w.m35773a(this.f27637c, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C10052c.f27644f, 30, (Object) null) + ']';
    }

    /* renamed from: b */
    public C10349h mo33781b() {
        return null;
    }

    /* renamed from: c */
    public boolean mo33782c() {
        return false;
    }

    /* renamed from: e */
    public final Set<C11824b0> mo35254e() {
        return this.f27637c;
    }

    public List<C10375s0> getParameters() {
        return C10529o.m35736a();
    }

    /* renamed from: l */
    public C9333g mo35232l() {
        return this.f27636b.mo35561l();
    }

    public String toString() {
        return "IntegerLiteralType" + m33845g();
    }

    private C10048n(long j, C10393y yVar, Set<? extends C11824b0> set) {
        this.f27638d = C11827c0.m38947a(C10249g.f27910c.mo35429a(), this, false);
        this.f27639e = C10181i.m34134a(new C10051b(this));
        this.f27635a = j;
        this.f27636b = yVar;
        this.f27637c = set;
    }

    /* renamed from: a */
    public Collection<C11824b0> m33846a() {
        return mo35229a();
    }

    /* renamed from: a */
    public final boolean mo35253a(C11953s0 s0Var) {
        C10202j.m34178b(s0Var, "constructor");
        Set<C11824b0> set = this.f27637c;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (C11824b0 v0 : set) {
            if (C10202j.m34176a((Object) v0.mo35227v0(), (Object) s0Var)) {
                return true;
            }
        }
        return false;
    }
}
