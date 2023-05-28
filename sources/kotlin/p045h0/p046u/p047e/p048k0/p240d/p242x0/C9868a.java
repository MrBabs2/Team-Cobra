package kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p215c0.p216c.C9113l;

/* renamed from: kotlin.h0.u.e.k0.d.x0.a */
/* compiled from: BinaryVersion.kt */
public abstract class C9868a {

    /* renamed from: a */
    private final int f27221a;

    /* renamed from: b */
    private final int f27222b;

    /* renamed from: c */
    private final int f27223c;

    /* renamed from: d */
    private final List<Integer> f27224d;

    /* renamed from: e */
    private final int[] f27225e;

    /* renamed from: kotlin.h0.u.e.k0.d.x0.a$a */
    /* compiled from: BinaryVersion.kt */
    public static final class C9869a {
        private C9869a() {
        }

        public /* synthetic */ C9869a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C9869a((DefaultConstructorMarker) null);
    }

    public C9868a(int... iArr) {
        C10202j.m34178b(iArr, "numbers");
        this.f27225e = iArr;
        Integer b = C10519k.m35629b(iArr, 0);
        int i = -1;
        this.f27221a = b != null ? b.intValue() : -1;
        Integer b2 = C10519k.m35629b(this.f27225e, 1);
        this.f27222b = b2 != null ? b2.intValue() : -1;
        Integer b3 = C10519k.m35629b(this.f27225e, 2);
        this.f27223c = b3 != null ? b3.intValue() : i;
        int[] iArr2 = this.f27225e;
        this.f27224d = iArr2.length > 3 ? C10539w.m35815n(C10516j.m35586a(iArr2).subList(3, this.f27225e.length)) : C10529o.m35736a();
    }

    /* renamed from: a */
    public final int mo34840a() {
        return this.f27221a;
    }

    /* renamed from: b */
    public final int mo34843b() {
        return this.f27222b;
    }

    /* renamed from: c */
    public final int[] mo34845c() {
        return this.f27225e;
    }

    public boolean equals(Object obj) {
        if (obj != null && C10202j.m34176a((Object) getClass(), (Object) obj.getClass())) {
            C9868a aVar = (C9868a) obj;
            return this.f27221a == aVar.f27221a && this.f27222b == aVar.f27222b && this.f27223c == aVar.f27223c && C10202j.m34176a((Object) this.f27224d, (Object) aVar.f27224d);
        }
    }

    public int hashCode() {
        int i = this.f27221a;
        int i2 = i + (i * 31) + this.f27222b;
        int i3 = i2 + (i2 * 31) + this.f27223c;
        return i3 + (i3 * 31) + this.f27224d.hashCode();
    }

    public String toString() {
        int[] c = mo34845c();
        ArrayList arrayList = new ArrayList();
        int length = c.length;
        for (int i = 0; i < length; i++) {
            int i2 = c[i];
            if (!(i2 != -1)) {
                break;
            }
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList.isEmpty() ? "unknown" : C10539w.m35773a(arrayList, ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C9113l) null, 62, (Object) null);
    }

    /* renamed from: a */
    public final boolean mo34842a(C9868a aVar) {
        C10202j.m34178b(aVar, "version");
        return mo34841a(aVar.f27221a, aVar.f27222b, aVar.f27223c);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo34844b(kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9868a r5) {
        /*
            r4 = this;
            java.lang.String r0 = "ourVersion"
            kotlin.jvm.internal.C10202j.m34178b(r5, r0)
            int r0 = r4.f27221a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0016
            int r0 = r5.f27221a
            if (r0 != 0) goto L_0x0021
            int r0 = r4.f27222b
            int r5 = r5.f27222b
            if (r0 != r5) goto L_0x0021
            goto L_0x0022
        L_0x0016:
            int r3 = r5.f27221a
            if (r0 != r3) goto L_0x0021
            int r0 = r4.f27222b
            int r5 = r5.f27222b
            if (r0 > r5) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9868a.mo34844b(kotlin.h0.u.e.k0.d.x0.a):boolean");
    }

    /* renamed from: a */
    public final boolean mo34841a(int i, int i2, int i3) {
        int i4 = this.f27221a;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.f27222b;
        if (i5 > i2) {
            return true;
        }
        if (i5 >= i2 && this.f27223c >= i3) {
            return true;
        }
        return false;
    }
}
