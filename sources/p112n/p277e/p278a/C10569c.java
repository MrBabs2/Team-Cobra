package p112n.p277e.p278a;

import com.google.android.gms.ads.AdSize;

@Deprecated
/* renamed from: n.e.a.c */
public final class C10569c {

    /* renamed from: b */
    public static final C10569c f28428b = new C10569c(-1, -2, "mb");

    /* renamed from: c */
    public static final C10569c f28429c = new C10569c(320, 50, "mb");

    /* renamed from: d */
    public static final C10569c f28430d = new C10569c(300, 250, "as");

    /* renamed from: e */
    public static final C10569c f28431e = new C10569c(468, 60, "as");

    /* renamed from: f */
    public static final C10569c f28432f = new C10569c(728, 90, "as");

    /* renamed from: g */
    public static final C10569c f28433g = new C10569c(160, 600, "as");

    /* renamed from: a */
    private final AdSize f28434a;

    public C10569c(AdSize adSize) {
        this.f28434a = adSize;
    }

    /* renamed from: a */
    public final int mo36114a() {
        return this.f28434a.getHeight();
    }

    /* renamed from: b */
    public final int mo36115b() {
        return this.f28434a.getWidth();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10569c)) {
            return false;
        }
        return this.f28434a.equals(((C10569c) obj).f28434a);
    }

    public final int hashCode() {
        return this.f28434a.hashCode();
    }

    public final String toString() {
        return this.f28434a.toString();
    }

    private C10569c(int i, int i2, String str) {
        this(new AdSize(i, i2));
    }
}
