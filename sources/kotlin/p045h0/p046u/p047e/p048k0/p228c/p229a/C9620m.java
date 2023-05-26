package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a;

import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9520g;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9534t;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;

/* renamed from: kotlin.h0.u.e.k0.c.a.m */
/* compiled from: JavaClassFinder.kt */
public interface C9620m {

    /* renamed from: kotlin.h0.u.e.k0.c.a.m$a */
    /* compiled from: JavaClassFinder.kt */
    public static final class C9621a {

        /* renamed from: a */
        private final C9933a f26506a;

        /* renamed from: b */
        private final byte[] f26507b;

        /* renamed from: c */
        private final C9520g f26508c;

        public C9621a(C9933a aVar, byte[] bArr, C9520g gVar) {
            C10202j.m34178b(aVar, "classId");
            this.f26506a = aVar;
            this.f26507b = bArr;
            this.f26508c = gVar;
        }

        /* renamed from: a */
        public final C9933a mo34174a() {
            return this.f26506a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9621a)) {
                return false;
            }
            C9621a aVar = (C9621a) obj;
            return C10202j.m34176a((Object) this.f26506a, (Object) aVar.f26506a) && C10202j.m34176a((Object) this.f26507b, (Object) aVar.f26507b) && C10202j.m34176a((Object) this.f26508c, (Object) aVar.f26508c);
        }

        public int hashCode() {
            C9933a aVar = this.f26506a;
            int i = 0;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            byte[] bArr = this.f26507b;
            int hashCode2 = (hashCode + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
            C9520g gVar = this.f26508c;
            if (gVar != null) {
                i = gVar.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "Request(classId=" + this.f26506a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f26507b) + ", outerClass=" + this.f26508c + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C9621a(C9933a aVar, byte[] bArr, C9520g gVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? null : gVar);
        }
    }

    /* renamed from: a */
    C9520g mo33658a(C9621a aVar);

    /* renamed from: a */
    C9534t mo33659a(C9934b bVar);

    /* renamed from: b */
    Set<String> mo33660b(C9934b bVar);
}
