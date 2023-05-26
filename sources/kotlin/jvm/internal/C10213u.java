package kotlin.jvm.internal;

import kotlin.p045h0.C9153b;
import kotlin.p045h0.C9168l;

/* renamed from: kotlin.jvm.internal.u */
/* compiled from: PropertyReference */
public abstract class C10213u extends C10188c implements C9168l {
    public C10213u() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10213u) {
            C10213u uVar = (C10213u) obj;
            if (!getOwner().equals(uVar.getOwner()) || !getName().equals(uVar.getName()) || !getSignature().equals(uVar.getSignature()) || !C10202j.m34176a(getBoundReceiver(), uVar.getBoundReceiver())) {
                return false;
            }
            return true;
        } else if (obj instanceof C9168l) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public boolean isConst() {
        return getReflected().isConst();
    }

    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        C9153b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public C10213u(Object obj) {
        super(obj);
    }

    /* access modifiers changed from: protected */
    public C9168l getReflected() {
        return (C9168l) super.getReflected();
    }
}
