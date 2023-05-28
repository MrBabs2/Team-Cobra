package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.ads.mu */
class C7745mu extends C7708lu {

    /* renamed from: i */
    protected final byte[] f16260i;

    C7745mu(byte[] bArr) {
        if (bArr != null) {
            this.f16260i = bArr;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final zzdmr mo26249a(int i, int i2) {
        int b = zzdmr.m23766b(0, i2, size());
        if (b == 0) {
            return zzdmr.f21488g;
        }
        return new C7556hu(this.f16260i, mo26045g(), b);
    }

    /* renamed from: c */
    public final boolean mo26253c() {
        int g = mo26045g();
        return C7711lx.m17529a(this.f16260i, g, size() + g);
    }

    /* renamed from: d */
    public final zzdnd mo26254d() {
        return zzdnd.m23782a(this.f16260i, mo26045g(), size(), true);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdmr) || size() != ((zzdmr) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C7745mu)) {
            return obj.equals(this);
        }
        C7745mu muVar = (C7745mu) obj;
        int f = mo29073f();
        int f2 = muVar.mo29073f();
        if (f == 0 || f2 == 0 || f == f2) {
            return mo26252a((zzdmr) muVar, 0, size());
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public int mo26045g() {
        return 0;
    }

    /* renamed from: h */
    public byte mo26046h(int i) {
        return this.f16260i[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public byte mo26047i(int i) {
        return this.f16260i[i];
    }

    public int size() {
        return this.f16260i.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26044a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f16260i, 0, bArr, 0, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo26251a(zzdmq zzdmq) throws IOException {
        zzdmq.mo29070a(this.f16260i, mo26045g(), size());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo26250a(Charset charset) {
        return new String(this.f16260i, mo26045g(), size(), charset);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo26252a(zzdmr zzdmr, int i, int i2) {
        if (i2 > zzdmr.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > zzdmr.size()) {
            int size2 = zzdmr.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(zzdmr instanceof C7745mu)) {
            return zzdmr.mo26249a(0, i2).equals(mo26249a(0, i2));
        } else {
            C7745mu muVar = (C7745mu) zzdmr;
            byte[] bArr = this.f16260i;
            byte[] bArr2 = muVar.f16260i;
            int g = mo26045g() + i2;
            int g2 = mo26045g();
            int g3 = muVar.mo26045g();
            while (g2 < g) {
                if (bArr[g2] != bArr2[g3]) {
                    return false;
                }
                g2++;
                g3++;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo26248a(int i, int i2, int i3) {
        return zzdod.m24030a(i, this.f16260i, mo26045g(), i3);
    }
}
