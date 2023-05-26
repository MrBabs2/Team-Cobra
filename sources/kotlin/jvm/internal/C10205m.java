package kotlin.jvm.internal;

import kotlin.p045h0.C9153b;
import kotlin.p045h0.C9162i;
import kotlin.p045h0.C9173n;

/* renamed from: kotlin.jvm.internal.m */
/* compiled from: MutablePropertyReference1 */
public abstract class C10205m extends C10207o implements C9162i {
    /* access modifiers changed from: protected */
    public C9153b computeReflected() {
        return C10216x.m34190a(this);
    }

    public Object invoke(Object obj) {
        return get(obj);
    }

    public C9173n.C9174a getGetter() {
        return ((C9162i) getReflected()).getGetter();
    }

    public C9162i.C9163a getSetter() {
        return ((C9162i) getReflected()).getSetter();
    }
}
