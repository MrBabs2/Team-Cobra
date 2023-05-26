package kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9775f;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9870b;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9875c;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9880h;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;

/* renamed from: kotlin.h0.u.e.k0.i.b.a0 */
/* compiled from: ProtoContainer.kt */
public abstract class C11689a0 {

    /* renamed from: a */
    private final C9875c f31257a;

    /* renamed from: b */
    private final C9880h f31258b;

    /* renamed from: c */
    private final C10362n0 f31259c;

    /* renamed from: kotlin.h0.u.e.k0.i.b.a0$a */
    /* compiled from: ProtoContainer.kt */
    public static final class C11690a extends C11689a0 {

        /* renamed from: d */
        private final C9933a f31260d;

        /* renamed from: e */
        private final C9775f.C9778c f31261e;

        /* renamed from: f */
        private final boolean f31262f;

        /* renamed from: g */
        private final C9775f f31263g;

        /* renamed from: h */
        private final C11690a f31264h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11690a(C9775f fVar, C9875c cVar, C9880h hVar, C10362n0 n0Var, C11690a aVar) {
            super(cVar, hVar, n0Var, (DefaultConstructorMarker) null);
            C10202j.m34178b(fVar, "classProto");
            C10202j.m34178b(cVar, "nameResolver");
            C10202j.m34178b(hVar, "typeTable");
            this.f31263g = fVar;
            this.f31264h = aVar;
            this.f31260d = C11792y.m38824a(cVar, fVar.mo34482r());
            C9775f.C9778c a = C9870b.f27240e.mo34851a(this.f31263g.mo34481q());
            this.f31261e = a == null ? C9775f.C9778c.CLASS : a;
            Boolean a2 = C9870b.f27241f.m32856a(this.f31263g.mo34481q());
            C10202j.m34174a((Object) a2, "Flags.IS_INNER.get(classProto.flags)");
            this.f31262f = a2.booleanValue();
        }

        /* renamed from: a */
        public C9934b mo38256a() {
            C9934b a = this.f31260d.mo34983a();
            C10202j.m34174a((Object) a, "classId.asSingleFqName()");
            return a;
        }

        /* renamed from: e */
        public final C9933a mo38261e() {
            return this.f31260d;
        }

        /* renamed from: f */
        public final C9775f mo38262f() {
            return this.f31263g;
        }

        /* renamed from: g */
        public final C9775f.C9778c mo38263g() {
            return this.f31261e;
        }

        /* renamed from: h */
        public final C11690a mo38264h() {
            return this.f31264h;
        }

        /* renamed from: i */
        public final boolean mo38265i() {
            return this.f31262f;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.i.b.a0$b */
    /* compiled from: ProtoContainer.kt */
    public static final class C11691b extends C11689a0 {

        /* renamed from: d */
        private final C9934b f31265d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11691b(C9934b bVar, C9875c cVar, C9880h hVar, C10362n0 n0Var) {
            super(cVar, hVar, n0Var, (DefaultConstructorMarker) null);
            C10202j.m34178b(bVar, "fqName");
            C10202j.m34178b(cVar, "nameResolver");
            C10202j.m34178b(hVar, "typeTable");
            this.f31265d = bVar;
        }

        /* renamed from: a */
        public C9934b mo38256a() {
            return this.f31265d;
        }
    }

    private C11689a0(C9875c cVar, C9880h hVar, C10362n0 n0Var) {
        this.f31257a = cVar;
        this.f31258b = hVar;
        this.f31259c = n0Var;
    }

    /* renamed from: a */
    public abstract C9934b mo38256a();

    /* renamed from: b */
    public final C9875c mo38257b() {
        return this.f31257a;
    }

    /* renamed from: c */
    public final C10362n0 mo38258c() {
        return this.f31259c;
    }

    /* renamed from: d */
    public final C9880h mo38259d() {
        return this.f31258b;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + mo38256a();
    }

    public /* synthetic */ C11689a0(C9875c cVar, C9880h hVar, C10362n0 n0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, hVar, n0Var);
    }
}
