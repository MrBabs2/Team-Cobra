package p112n.p113d.p114a;

import java.util.Map;

/* renamed from: n.d.a.a */
public abstract class C10561a {

    /* renamed from: a */
    protected boolean f28407a;

    /* renamed from: b */
    protected Map<String, String> f28408b;

    /* renamed from: a */
    public Map<String, String> mo36108a() {
        return this.f28408b;
    }

    /* renamed from: b */
    public boolean mo36109b() {
        return this.f28407a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r2 = r4.f28408b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            if (r5 == 0) goto L_0x0030
            java.lang.Class<n.d.a.a> r2 = p112n.p113d.p114a.C10561a.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L_0x0010
            goto L_0x0030
        L_0x0010:
            n.d.a.a r5 = (p112n.p113d.p114a.C10561a) r5
            boolean r2 = r4.f28407a
            boolean r3 = r5.mo36109b()
            if (r2 != r3) goto L_0x0030
            java.util.Map<java.lang.String, java.lang.String> r2 = r4.f28408b
            if (r2 == 0) goto L_0x0029
            java.util.Map r5 = r5.mo36108a()
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x0030
            goto L_0x002f
        L_0x0029:
            java.util.Map r5 = r5.mo36108a()
            if (r5 != 0) goto L_0x0030
        L_0x002f:
            return r0
        L_0x0030:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p112n.p113d.p114a.C10561a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = (this.f28407a ? 1 : 0) * true;
        Map<String, String> map = this.f28408b;
        return i + (map != null ? map.hashCode() : 0);
    }
}
