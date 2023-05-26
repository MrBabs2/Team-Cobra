package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

public abstract class zzdmr implements Serializable, Iterable<Byte> {

    /* renamed from: g */
    public static final zzdmr f21488g = new C7745mu(zzdod.f21587b);

    /* renamed from: h */
    private static final C7593iu f21489h = (C8225zt.m18654a() ? new C7782nu((C7409du) null) : new C7519gu((C7409du) null));

    /* renamed from: f */
    private int f21490f = 0;

    static {
        new C7446eu();
    }

    zzdmr() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static int m23761a(byte b) {
        return b & 255;
    }

    /* renamed from: a */
    public static zzdmr m23764a(byte[] bArr, int i, int i2) {
        m23766b(i, i + i2, bArr.length);
        return new C7745mu(f21489h.mo25976a(bArr, i, i2));
    }

    /* renamed from: b */
    public static zzdmr m23767b(byte[] bArr) {
        return m23764a(bArr, 0, bArr.length);
    }

    /* renamed from: j */
    static C7634ju m23768j(int i) {
        return new C7634ju(i, (C7409du) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo26248a(int i, int i2, int i3);

    /* renamed from: a */
    public abstract zzdmr mo26249a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo26250a(Charset charset);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo26251a(zzdmq zzdmq) throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo26044a(byte[] bArr, int i, int i2, int i3);

    /* renamed from: c */
    public abstract boolean mo26253c();

    /* renamed from: d */
    public abstract zzdnd mo26254d();

    public abstract boolean equals(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo29073f() {
        return this.f21490f;
    }

    /* renamed from: h */
    public abstract byte mo26046h(int i);

    public final int hashCode() {
        int i = this.f21490f;
        if (i == 0) {
            int size = size();
            i = mo26248a(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f21490f = i;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract byte mo26047i(int i);

    public /* synthetic */ Iterator iterator() {
        return new C7409du(this);
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    /* renamed from: b */
    public final String mo29072b() {
        return size() == 0 ? "" : mo26250a(zzdod.f21586a);
    }

    /* renamed from: a */
    static zzdmr m23763a(byte[] bArr) {
        return new C7745mu(bArr);
    }

    /* renamed from: a */
    public static zzdmr m23762a(String str) {
        return new C7745mu(str.getBytes(zzdod.f21586a));
    }

    /* renamed from: b */
    static int m23766b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    /* renamed from: a */
    public final byte[] mo29071a() {
        int size = size();
        if (size == 0) {
            return zzdod.f21587b;
        }
        byte[] bArr = new byte[size];
        mo26044a(bArr, 0, 0, size);
        return bArr;
    }
}
