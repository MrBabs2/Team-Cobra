package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

public abstract class zzte implements Serializable, Iterable<Byte> {

    /* renamed from: g */
    public static final zzte f23433g = new C8321n0(zzuq.f23510b);

    /* renamed from: f */
    private int f23434f = 0;

    static {
        if (C8281f0.m25931a()) {
            new C8325o0((C8286g0) null);
        } else {
            new C8301j0((C8286g0) null);
        }
        new C8291h0();
    }

    zzte() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static int m26519a(byte b) {
        return b & 255;
    }

    /* renamed from: a */
    public static zzte m26520a(String str) {
        return new C8321n0(str.getBytes(zzuq.f23509a));
    }

    /* renamed from: b */
    static int m26522b(int i, int i2, int i3) {
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

    /* renamed from: j */
    static C8311l0 m26523j(int i) {
        return new C8311l0(i, (C8286g0) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo30202a(int i, int i2, int i3);

    /* renamed from: a */
    public abstract zzte mo30203a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo30204a(Charset charset);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo30205a(zztd zztd) throws IOException;

    /* renamed from: b */
    public abstract boolean mo30207b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo30376c() {
        return this.f23434f;
    }

    public abstract boolean equals(Object obj);

    /* renamed from: h */
    public abstract byte mo30138h(int i);

    public final int hashCode() {
        int i = this.f23434f;
        if (i == 0) {
            int size = size();
            i = mo30202a(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f23434f = i;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract byte mo30139i(int i);

    public /* synthetic */ Iterator iterator() {
        return new C8286g0(this);
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    /* renamed from: a */
    public final String mo30375a() {
        return size() == 0 ? "" : mo30204a(zzuq.f23509a);
    }
}
