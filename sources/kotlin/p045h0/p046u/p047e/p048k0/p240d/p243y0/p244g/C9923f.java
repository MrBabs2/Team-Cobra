package kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g;

import java.util.Arrays;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9868a;

/* renamed from: kotlin.h0.u.e.k0.d.y0.g.f */
/* compiled from: JvmMetadataVersion.kt */
public final class C9923f extends C9868a {

    /* renamed from: g */
    public static final C9923f f27380g = new C9923f(1, 1, 15);

    /* renamed from: f */
    private final boolean f27381f;

    /* renamed from: kotlin.h0.u.e.k0.d.y0.g.f$a */
    /* compiled from: JvmMetadataVersion.kt */
    public static final class C9924a {
        private C9924a() {
        }

        public /* synthetic */ C9924a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C9924a((DefaultConstructorMarker) null);
        new C9923f(new int[0]);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9923f(int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        C10202j.m34178b(iArr, "versionArray");
        this.f27381f = z;
    }

    /* renamed from: d */
    public boolean mo34934d() {
        boolean z;
        if (mo34840a() == 1 && mo34843b() == 0) {
            return false;
        }
        if (this.f27381f) {
            z = mo34844b(f27380g);
        } else {
            z = mo34840a() == 1 && mo34843b() <= 4;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C9923f(int... iArr) {
        this(iArr, false);
        C10202j.m34178b(iArr, "numbers");
    }
}
