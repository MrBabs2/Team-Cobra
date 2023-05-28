package kotlin.jvm.internal;

import kotlin.p045h0.C9153b;
import kotlin.p045h0.C9160h;
import kotlin.p045h0.C9171m;

/* renamed from: kotlin.jvm.internal.l */
/* compiled from: MutablePropertyReference0 */
public abstract class C10204l extends C10207o implements C9160h {
    public C10204l() {
    }

    /* access modifiers changed from: protected */
    public C9153b computeReflected() {
        return C10216x.m34189a(this);
    }

    public Object getDelegate() {
        return ((C9160h) getReflected()).getDelegate();
    }

    public Object invoke() {
        return get();
    }

    public C10204l(Object obj) {
        super(obj);
    }

    public C9171m.C9172a getGetter() {
        return ((C9160h) getReflected()).getGetter();
    }

    public C9160h.C9161a getSetter() {
        return ((C9160h) getReflected()).getSetter();
    }
}
