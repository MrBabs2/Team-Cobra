package kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;

/* renamed from: kotlin.h0.u.e.k0.h.m.f */
/* compiled from: ClassLiteralValue.kt */
public final class C10036f {

    /* renamed from: a */
    private final C9933a f27623a;

    /* renamed from: b */
    private final int f27624b;

    public C10036f(C9933a aVar, int i) {
        C10202j.m34178b(aVar, "classId");
        this.f27623a = aVar;
        this.f27624b = i;
    }

    /* renamed from: a */
    public final C9933a mo35237a() {
        return this.f27623a;
    }

    /* renamed from: b */
    public final int mo35238b() {
        return this.f27624b;
    }

    /* renamed from: c */
    public final int mo35239c() {
        return this.f27624b;
    }

    /* renamed from: d */
    public final C9933a mo35240d() {
        return this.f27623a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10036f) {
                C10036f fVar = (C10036f) obj;
                if (C10202j.m34176a((Object) this.f27623a, (Object) fVar.f27623a)) {
                    if (this.f27624b == fVar.f27624b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C9933a aVar = this.f27623a;
        return ((aVar != null ? aVar.hashCode() : 0) * 31) + this.f27624b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f27624b;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.f27623a);
        int i3 = this.f27624b;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(">");
        }
        String sb2 = sb.toString();
        C10202j.m34174a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
