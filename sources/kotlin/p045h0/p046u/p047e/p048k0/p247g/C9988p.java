package kotlin.p045h0.p046u.p047e.p048k0.p247g;

import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.h0.u.e.k0.g.p */
/* compiled from: DescriptorRenderer.kt */
public enum C9988p {
    ;

    /* renamed from: kotlin.h0.u.e.k0.g.p$a */
    /* compiled from: DescriptorRenderer.kt */
    static final class C9989a extends C9988p {
        C9989a(String str, int i) {
            super(str, i, (DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public String mo35199a(String str) {
            C10202j.m34178b(str, "string");
            return C12130v.m40045a(C12130v.m40045a(str, "<", "&lt;", false, 4, (Object) null), ">", "&gt;", false, 4, (Object) null);
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.g.p$b */
    /* compiled from: DescriptorRenderer.kt */
    static final class C9990b extends C9988p {
        C9990b(String str, int i) {
            super(str, i, (DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public String mo35199a(String str) {
            C10202j.m34178b(str, "string");
            return str;
        }
    }

    /* renamed from: a */
    public abstract String mo35199a(String str);
}
