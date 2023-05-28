package kotlin.jvm.internal;

import kotlin.p045h0.C9153b;
import kotlin.p045h0.C9173n;

/* renamed from: kotlin.jvm.internal.s */
/* compiled from: PropertyReference1 */
public abstract class C10211s extends C10213u implements C9173n {
    /* access modifiers changed from: protected */
    public C9153b computeReflected() {
        return C10216x.m34192a(this);
    }

    public Object invoke(Object obj) {
        return get(obj);
    }

    public C9173n.C9174a getGetter() {
        return ((C9173n) getReflected()).getGetter();
    }
}
