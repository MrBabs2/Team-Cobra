package kotlin.jvm.internal;

import kotlin.p045h0.C9153b;
import kotlin.p045h0.C9171m;

/* renamed from: kotlin.jvm.internal.q */
/* compiled from: PropertyReference0 */
public abstract class C10209q extends C10213u implements C9171m {
    /* access modifiers changed from: protected */
    public C9153b computeReflected() {
        return C10216x.m34191a(this);
    }

    public Object getDelegate() {
        return ((C9171m) getReflected()).getDelegate();
    }

    public Object invoke() {
        return get();
    }

    public C9171m.C9172a getGetter() {
        return ((C9171m) getReflected()).getGetter();
    }
}
