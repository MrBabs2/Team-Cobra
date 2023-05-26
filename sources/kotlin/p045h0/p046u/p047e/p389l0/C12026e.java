package kotlin.p045h0.p046u.p047e.p389l0;

import java.io.Serializable;

/* renamed from: kotlin.h0.u.e.l0.e */
/* compiled from: MapEntry */
final class C12026e<K, V> implements Serializable {

    /* renamed from: f */
    public final K f31780f;

    /* renamed from: g */
    public final V f31781g;

    public C12026e(K k, V v) {
        this.f31780f = k;
        this.f31781g = v;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof kotlin.p045h0.p046u.p047e.p389l0.C12026e
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            kotlin.h0.u.e.l0.e r4 = (kotlin.p045h0.p046u.p047e.p389l0.C12026e) r4
            K r0 = r3.f31780f
            if (r0 != 0) goto L_0x0011
            K r0 = r4.f31780f
            if (r0 != 0) goto L_0x0029
            goto L_0x0019
        L_0x0011:
            K r2 = r4.f31780f
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0029
        L_0x0019:
            V r0 = r3.f31781g
            V r4 = r4.f31781g
            if (r0 != 0) goto L_0x0022
            if (r4 != 0) goto L_0x0029
            goto L_0x0028
        L_0x0022:
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0029
        L_0x0028:
            r1 = 1
        L_0x0029:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p389l0.C12026e.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        K k = this.f31780f;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.f31781g;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return this.f31780f + "=" + this.f31781g;
    }
}
