package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.n0 */
class C8321n0 extends C8316m0 {

    /* renamed from: h */
    protected final byte[] f23302h;

    C8321n0(byte[] bArr) {
        if (bArr != null) {
            this.f23302h = bArr;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final zzte mo30203a(int i, int i2) {
        int b = zzte.m26522b(0, i2, size());
        if (b == 0) {
            return zzte.f23433g;
        }
        return new C8306k0(this.f23302h, mo30137d(), b);
    }

    /* renamed from: b */
    public final boolean mo30207b() {
        int d = mo30137d();
        return C8259a3.m25882a(this.f23302h, d, size() + d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo30137d() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzte) || size() != ((zzte) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C8321n0)) {
            return obj.equals(this);
        }
        C8321n0 n0Var = (C8321n0) obj;
        int c = mo30376c();
        int c2 = n0Var.mo30376c();
        if (c == 0 || c2 == 0 || c == c2) {
            return mo30206a((zzte) n0Var, 0, size());
        }
        return false;
    }

    /* renamed from: h */
    public byte mo30138h(int i) {
        return this.f23302h[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public byte mo30139i(int i) {
        return this.f23302h[i];
    }

    public int size() {
        return this.f23302h.length;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30205a(zztd zztd) throws IOException {
        zztd.mo30374a(this.f23302h, mo30137d(), size());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo30204a(Charset charset) {
        return new String(this.f23302h, mo30137d(), size(), charset);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo30206a(zzte zzte, int i, int i2) {
        if (i2 > zzte.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > zzte.size()) {
            int size2 = zzte.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(zzte instanceof C8321n0)) {
            return zzte.mo30203a(0, i2).equals(mo30203a(0, i2));
        } else {
            C8321n0 n0Var = (C8321n0) zzte;
            byte[] bArr = this.f23302h;
            byte[] bArr2 = n0Var.f23302h;
            int d = mo30137d() + i2;
            int d2 = mo30137d();
            int d3 = n0Var.mo30137d();
            while (d2 < d) {
                if (bArr[d2] != bArr2[d3]) {
                    return false;
                }
                d2++;
                d3++;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo30202a(int i, int i2, int i3) {
        return zzuq.m26673a(i, this.f23302h, mo30137d(), i3);
    }
}
