package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Set;
import kotlin.C10485x;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11904c;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11908g;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11911j;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11912k;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11913l;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11916o;
import kotlin.reflect.jvm.internal.impl.utils.C12169j;

/* renamed from: kotlin.h0.u.e.k0.k.g */
/* compiled from: AbstractTypeChecker.kt */
public abstract class C11839g implements C11916o {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f31547a;

    /* renamed from: b */
    private boolean f31548b;

    /* renamed from: c */
    private ArrayDeque<C11910i> f31549c;

    /* renamed from: d */
    private Set<C11910i> f31550d;

    /* renamed from: kotlin.h0.u.e.k0.k.g$a */
    /* compiled from: AbstractTypeChecker.kt */
    public enum C11840a {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER
    }

    /* renamed from: kotlin.h0.u.e.k0.k.g$b */
    /* compiled from: AbstractTypeChecker.kt */
    public enum C11841b {
        TAKE_FIRST_FOR_SUBTYPING,
        FORCE_NOT_SUBTYPE,
        CHECK_ANY_OF_THEM,
        INTERSECT_ARGUMENTS_AND_CHECK_AGAIN
    }

    /* renamed from: kotlin.h0.u.e.k0.k.g$c */
    /* compiled from: AbstractTypeChecker.kt */
    public static abstract class C11842c {

        /* renamed from: kotlin.h0.u.e.k0.k.g$c$a */
        /* compiled from: AbstractTypeChecker.kt */
        public static abstract class C11843a extends C11842c {
            public C11843a() {
                super((DefaultConstructorMarker) null);
            }
        }

        /* renamed from: kotlin.h0.u.e.k0.k.g$c$b */
        /* compiled from: AbstractTypeChecker.kt */
        public static final class C11844b extends C11842c {

            /* renamed from: a */
            public static final C11844b f31560a = new C11844b();

            private C11844b() {
                super((DefaultConstructorMarker) null);
            }

            /* renamed from: a */
            public C11910i mo38482a(C11839g gVar, C11908g gVar2) {
                C10202j.m34178b(gVar, "context");
                C10202j.m34178b(gVar2, "type");
                return gVar.mo38472h(gVar2);
            }
        }

        /* renamed from: kotlin.h0.u.e.k0.k.g$c$c */
        /* compiled from: AbstractTypeChecker.kt */
        public static final class C11845c extends C11842c {

            /* renamed from: a */
            public static final C11845c f31561a = new C11845c();

            private C11845c() {
                super((DefaultConstructorMarker) null);
            }

            /* renamed from: a */
            public Void mo38482a(C11839g gVar, C11908g gVar2) {
                C10202j.m34178b(gVar, "context");
                C10202j.m34178b(gVar2, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* renamed from: kotlin.h0.u.e.k0.k.g$c$d */
        /* compiled from: AbstractTypeChecker.kt */
        public static final class C11846d extends C11842c {

            /* renamed from: a */
            public static final C11846d f31562a = new C11846d();

            private C11846d() {
                super((DefaultConstructorMarker) null);
            }

            /* renamed from: a */
            public C11910i mo38482a(C11839g gVar, C11908g gVar2) {
                C10202j.m34178b(gVar, "context");
                C10202j.m34178b(gVar2, "type");
                return gVar.mo38469e(gVar2);
            }
        }

        private C11842c() {
        }

        /* renamed from: a */
        public abstract C11910i mo38482a(C11839g gVar, C11908g gVar2);

        public /* synthetic */ C11842c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public Boolean mo38458a(C11908g gVar, C11908g gVar2) {
        C10202j.m34178b(gVar, "subType");
        C10202j.m34178b(gVar2, "superType");
        return null;
    }

    /* renamed from: a */
    public abstract List<C11910i> mo38459a(C11910i iVar, C11913l lVar);

    /* renamed from: a */
    public abstract C11912k mo38461a(C11910i iVar, int i);

    /* renamed from: a */
    public abstract C11912k mo38462a(C11911j jVar, int i);

    /* renamed from: b */
    public C11841b mo38464b() {
        return C11841b.INTERSECT_ARGUMENTS_AND_CHECK_AGAIN;
    }

    /* renamed from: b */
    public abstract boolean mo38465b(C11913l lVar, C11913l lVar2);

    /* renamed from: c */
    public final ArrayDeque<C11910i> mo38466c() {
        return this.f31549c;
    }

    /* renamed from: c */
    public abstract C11913l mo38467c(C11908g gVar);

    /* renamed from: d */
    public final Set<C11910i> mo38468d() {
        return this.f31550d;
    }

    /* renamed from: e */
    public abstract C11910i mo38469e(C11908g gVar);

    /* renamed from: e */
    public final void mo38470e() {
        boolean z = !this.f31548b;
        if (!C10485x.f28360a || z) {
            this.f31548b = true;
            if (this.f31549c == null) {
                this.f31549c = new ArrayDeque<>(4);
            }
            if (this.f31550d == null) {
                this.f31550d = C12169j.f31935h.mo38799a();
                return;
            }
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    /* renamed from: f */
    public abstract boolean mo38471f();

    /* renamed from: h */
    public abstract C11910i mo38472h(C11908g gVar);

    /* renamed from: i */
    public abstract boolean mo38473i(C11910i iVar);

    /* renamed from: j */
    public abstract boolean mo38474j(C11908g gVar);

    /* renamed from: j */
    public abstract boolean mo38475j(C11910i iVar);

    /* renamed from: k */
    public abstract C11842c mo38476k(C11910i iVar);

    /* renamed from: k */
    public abstract boolean mo38477k(C11908g gVar);

    /* renamed from: l */
    public abstract boolean mo38478l(C11908g gVar);

    /* renamed from: m */
    public abstract boolean mo38479m(C11908g gVar);

    /* renamed from: n */
    public abstract boolean mo38480n(C11908g gVar);

    /* renamed from: o */
    public abstract C11908g mo38481o(C11908g gVar);

    /* renamed from: a */
    public C11840a mo38460a(C11910i iVar, C11904c cVar) {
        C10202j.m34178b(iVar, "subType");
        C10202j.m34178b(cVar, "superType");
        return C11840a.CHECK_SUBTYPE_AND_LOWER;
    }

    /* renamed from: a */
    public final void mo38463a() {
        ArrayDeque<C11910i> arrayDeque = this.f31549c;
        if (arrayDeque != null) {
            arrayDeque.clear();
            Set<C11910i> set = this.f31550d;
            if (set != null) {
                set.clear();
                this.f31548b = false;
                return;
            }
            C10202j.m34172a();
            throw null;
        }
        C10202j.m34172a();
        throw null;
    }
}
