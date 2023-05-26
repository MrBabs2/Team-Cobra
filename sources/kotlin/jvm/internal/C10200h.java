package kotlin.jvm.internal;

import kotlin.p045h0.C9153b;
import kotlin.p045h0.C9157f;

/* renamed from: kotlin.jvm.internal.h */
/* compiled from: FunctionReference */
public class C10200h extends C10188c implements C10199g, C9157f {

    /* renamed from: f */
    private final int f27842f;

    public C10200h(int i) {
        this.f27842f = i;
    }

    /* access modifiers changed from: protected */
    public C9153b computeReflected() {
        return C10216x.m34188a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10200h) {
            C10200h hVar = (C10200h) obj;
            if (getOwner() != null ? getOwner().equals(hVar.getOwner()) : hVar.getOwner() == null) {
                if (!getName().equals(hVar.getName()) || !getSignature().equals(hVar.getSignature()) || !C10202j.m34176a(getBoundReceiver(), hVar.getBoundReceiver())) {
                    return false;
                }
                return true;
            }
            return false;
        } else if (obj instanceof C9157f) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int getArity() {
        return this.f27842f;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        C9153b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    /* access modifiers changed from: protected */
    public C9157f getReflected() {
        return (C9157f) super.getReflected();
    }

    public C10200h(int i, Object obj) {
        super(obj);
        this.f27842f = i;
    }
}
