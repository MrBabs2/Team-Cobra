package kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b;

import java.io.Serializable;

/* renamed from: kotlin.h0.u.e.k0.b.b.e */
/* compiled from: LookupLocation.kt */
public final class C9402e implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C9402e f26138h = new C9402e(-1, -1);

    /* renamed from: i */
    public static final C9403a f26139i = new C9403a((DefaultConstructorMarker) null);

    /* renamed from: f */
    private final int f26140f;

    /* renamed from: g */
    private final int f26141g;

    /* renamed from: kotlin.h0.u.e.k0.b.b.e$a */
    /* compiled from: LookupLocation.kt */
    public static final class C9403a {
        private C9403a() {
        }

        /* renamed from: a */
        public final C9402e mo33852a() {
            return C9402e.f26138h;
        }

        public /* synthetic */ C9403a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C9402e(int i, int i2) {
        this.f26140f = i;
        this.f26141g = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9402e) {
                C9402e eVar = (C9402e) obj;
                if (this.f26140f == eVar.f26140f) {
                    if (this.f26141g == eVar.f26141g) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f26140f * 31) + this.f26141g;
    }

    public String toString() {
        return "Position(line=" + this.f26140f + ", column=" + this.f26141g + ")";
    }
}
