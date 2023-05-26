package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import kotlin.C10219k;
import kotlin.C9134f;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9168l;
import kotlin.p215c0.p216c.C9102a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;

/* renamed from: kotlin.h0.u.e.k0.k.n0 */
/* compiled from: StarProjectionImpl.kt */
public final class C11940n0 extends C11967v0 {

    /* renamed from: c */
    static final /* synthetic */ C9168l[] f31642c = {C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a(C11940n0.class), "_type", "get_type()Lorg/jetbrains/kotlin/types/KotlinType;"))};

    /* renamed from: a */
    private final C9134f f31643a = C10181i.m34135a(C10219k.PUBLICATION, new C11941a(this));
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C10375s0 f31644b;

    /* renamed from: kotlin.h0.u.e.k0.k.n0$a */
    /* compiled from: StarProjectionImpl.kt */
    static final class C11941a extends C10203k implements C9102a<C11824b0> {

        /* renamed from: f */
        final /* synthetic */ C11940n0 f31645f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11941a(C11940n0 n0Var) {
            super(0);
            this.f31645f = n0Var;
        }

        public final C11824b0 invoke() {
            return C11943o0.m39490a(this.f31645f.f31644b);
        }
    }

    public C11940n0(C10375s0 s0Var) {
        C10202j.m34178b(s0Var, "typeParameter");
        this.f31644b = s0Var;
    }

    /* renamed from: c */
    private final C11824b0 m39481c() {
        C9134f fVar = this.f31643a;
        C9168l lVar = f31642c[0];
        return (C11824b0) fVar.getValue();
    }

    /* renamed from: b */
    public boolean mo38597b() {
        return true;
    }

    public C11824b0 getType() {
        return m39481c();
    }

    /* renamed from: a */
    public C11838f1 mo38596a() {
        return C11838f1.OUT_VARIANCE;
    }
}
