package kotlin.p045h0.p046u.p047e.p048k0.p380k;

/* renamed from: kotlin.h0.u.e.k0.k.v0 */
/* compiled from: TypeProjectionBase */
public abstract class C11967v0 implements C11965u0 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11965u0)) {
            return false;
        }
        C11965u0 u0Var = (C11965u0) obj;
        return mo38597b() == u0Var.mo38597b() && mo38596a() == u0Var.mo38596a() && getType().equals(u0Var.getType());
    }

    public int hashCode() {
        return (mo38596a().hashCode() * 31) + (mo38597b() ? 17 : getType().hashCode());
    }

    public String toString() {
        if (mo38597b()) {
            return "*";
        }
        if (mo38596a() == C11838f1.INVARIANT) {
            return getType().toString();
        }
        return mo38596a() + " " + getType();
    }
}
