package kotlinx.coroutines;

import kotlinx.coroutines.p393g2.C12206a;

/* renamed from: kotlinx.coroutines.x0 */
/* compiled from: EventLoop.common.kt */
public abstract class C12322x0 extends C12324y {

    /* renamed from: g */
    private long f32142g;

    /* renamed from: h */
    private boolean f32143h;

    /* renamed from: i */
    private C12206a<C12304r0<?>> f32144i;

    /* renamed from: c */
    private final long m40656c(boolean z) {
        return z ? 4294967296L : 1;
    }

    /* renamed from: a */
    public final void mo39040a(C12304r0<?> r0Var) {
        C12206a<C12304r0<?>> aVar = this.f32144i;
        if (aVar == null) {
            aVar = new C12206a<>();
            this.f32144i = aVar;
        }
        aVar.mo38856a(r0Var);
    }

    /* renamed from: b */
    public final void mo39042b(boolean z) {
        this.f32142g += m40656c(z);
        if (!z) {
            this.f32143h = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public long mo39043m() {
        C12206a<C12304r0<?>> aVar = this.f32144i;
        if (aVar == null || aVar.mo38857a()) {
            return Long.MAX_VALUE;
        }
        return 0;
    }

    /* renamed from: o */
    public final boolean mo39044o() {
        return this.f32142g >= m40656c(true);
    }

    /* renamed from: p */
    public final boolean mo39045p() {
        C12206a<C12304r0<?>> aVar = this.f32144i;
        if (aVar != null) {
            return aVar.mo38857a();
        }
        return true;
    }

    /* renamed from: q */
    public final boolean mo39046q() {
        C12304r0 b;
        C12206a<C12304r0<?>> aVar = this.f32144i;
        if (aVar == null || (b = aVar.mo38858b()) == null) {
            return false;
        }
        b.run();
        return true;
    }

    /* access modifiers changed from: protected */
    public void shutdown() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m40655a(C12322x0 x0Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            x0Var.mo39042b(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    /* renamed from: a */
    public final void mo39041a(boolean z) {
        long c = this.f32142g - m40656c(z);
        this.f32142g = c;
        if (c <= 0) {
            if (C12248i0.m40396a()) {
                if (!(this.f32142g == 0)) {
                    throw new AssertionError();
                }
            }
            if (this.f32143h) {
                shutdown();
            }
        }
    }
}
