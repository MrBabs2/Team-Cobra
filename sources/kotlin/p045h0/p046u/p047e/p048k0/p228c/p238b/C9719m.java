package kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b;

import java.util.Arrays;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11782u;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9520g;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;

/* renamed from: kotlin.h0.u.e.k0.c.b.m */
/* compiled from: KotlinClassFinder.kt */
public interface C9719m extends C11782u {

    /* renamed from: kotlin.h0.u.e.k0.c.b.m$a */
    /* compiled from: KotlinClassFinder.kt */
    public static abstract class C9720a {

        /* renamed from: kotlin.h0.u.e.k0.c.b.m$a$a */
        /* compiled from: KotlinClassFinder.kt */
        public static final class C9721a extends C9720a {

            /* renamed from: a */
            private final byte[] f26699a;

            /* renamed from: b */
            public final byte[] mo34313b() {
                return this.f26699a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C9721a) && C10202j.m34176a((Object) this.f26699a, (Object) ((C9721a) obj).f26699a);
                }
                return true;
            }

            public int hashCode() {
                byte[] bArr = this.f26699a;
                if (bArr != null) {
                    return Arrays.hashCode(bArr);
                }
                return 0;
            }

            public String toString() {
                return "ClassFileContent(content=" + Arrays.toString(this.f26699a) + ")";
            }
        }

        /* renamed from: kotlin.h0.u.e.k0.c.b.m$a$b */
        /* compiled from: KotlinClassFinder.kt */
        public static final class C9722b extends C9720a {

            /* renamed from: a */
            private final C9724o f26700a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9722b(C9724o oVar) {
                super((DefaultConstructorMarker) null);
                C10202j.m34178b(oVar, "kotlinJvmBinaryClass");
                this.f26700a = oVar;
            }

            /* renamed from: b */
            public final C9724o mo34317b() {
                return this.f26700a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C9722b) && C10202j.m34176a((Object) this.f26700a, (Object) ((C9722b) obj).f26700a);
                }
                return true;
            }

            public int hashCode() {
                C9724o oVar = this.f26700a;
                if (oVar != null) {
                    return oVar.hashCode();
                }
                return 0;
            }

            public String toString() {
                return "KotlinClass(kotlinJvmBinaryClass=" + this.f26700a + ")";
            }
        }

        private C9720a() {
        }

        /* renamed from: a */
        public final C9724o mo34312a() {
            C9722b bVar = (C9722b) (!(this instanceof C9722b) ? null : this);
            if (bVar != null) {
                return bVar.mo34317b();
            }
            return null;
        }

        public /* synthetic */ C9720a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    C9720a mo33672a(C9520g gVar);

    /* renamed from: a */
    C9720a mo33673a(C9933a aVar);
}
