package kotlin.p045h0.p046u.p047e.p048k0.p247g;

import java.util.ArrayList;
import java.util.Set;

/* renamed from: kotlin.h0.u.e.k0.g.h */
/* compiled from: DescriptorRenderer.kt */
public enum C9975h {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true);
    

    /* renamed from: t */
    public static final Set<C9975h> f27499t = null;

    /* renamed from: u */
    public static final Set<C9975h> f27500u = null;

    /* renamed from: f */
    private final boolean f27501f;

    /* renamed from: kotlin.h0.u.e.k0.g.h$a */
    /* compiled from: DescriptorRenderer.kt */
    public static final class C9976a {
        private C9976a() {
        }

        public /* synthetic */ C9976a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i;
        new C9976a((DefaultConstructorMarker) null);
        C9975h[] values = values();
        ArrayList arrayList = new ArrayList();
        for (C9975h hVar : values) {
            if (hVar.f27501f) {
                arrayList.add(hVar);
            }
        }
        f27499t = C10539w.m35818q(arrayList);
        f27500u = C10519k.m35655m(values());
    }

    private C9975h(boolean z) {
        this.f27501f = z;
    }
}
