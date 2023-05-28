package kotlin.p045h0.p046u.p047e.p048k0.p380k;

/* renamed from: kotlin.h0.u.e.k0.k.f1 */
/* compiled from: Variance.kt */
public enum C11838f1 {
    INVARIANT("", true, true, 0),
    IN_VARIANCE("in", true, false, -1),
    OUT_VARIANCE("out", false, true, 1);
    

    /* renamed from: f */
    private final String f31545f;

    /* renamed from: g */
    private final boolean f31546g;

    private C11838f1(String str, boolean z, boolean z2, int i) {
        this.f31545f = str;
        this.f31546g = z2;
    }

    /* renamed from: a */
    public final boolean mo38455a() {
        return this.f31546g;
    }

    /* renamed from: d */
    public final String mo38456d() {
        return this.f31545f;
    }

    public String toString() {
        return this.f31545f;
    }
}
