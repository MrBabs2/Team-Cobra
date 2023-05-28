package com.google.zxing.p198h.p199b;

import java.util.Arrays;

/* renamed from: com.google.zxing.h.b.e */
/* compiled from: DefaultPlacement */
public class C8832e {

    /* renamed from: a */
    private final CharSequence f25090a;

    /* renamed from: b */
    private final int f25091b;

    /* renamed from: c */
    private final int f25092c;

    /* renamed from: d */
    private final byte[] f25093d;

    public C8832e(CharSequence charSequence, int i, int i2) {
        this.f25090a = charSequence;
        this.f25092c = i;
        this.f25091b = i2;
        byte[] bArr = new byte[(i * i2)];
        this.f25093d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    /* renamed from: b */
    private boolean m28844b(int i, int i2) {
        return this.f25093d[(i2 * this.f25092c) + i] >= 0;
    }

    /* renamed from: c */
    private void m28845c(int i) {
        m28841a(this.f25091b - 3, 0, i, 1);
        m28841a(this.f25091b - 2, 0, i, 2);
        m28841a(this.f25091b - 1, 0, i, 3);
        m28841a(0, this.f25092c - 2, i, 4);
        m28841a(0, this.f25092c - 1, i, 5);
        m28841a(1, this.f25092c - 1, i, 6);
        m28841a(2, this.f25092c - 1, i, 7);
        m28841a(3, this.f25092c - 1, i, 8);
    }

    /* renamed from: d */
    private void m28846d(int i) {
        m28841a(this.f25091b - 1, 0, i, 1);
        m28841a(this.f25091b - 1, this.f25092c - 1, i, 2);
        m28841a(0, this.f25092c - 3, i, 3);
        m28841a(0, this.f25092c - 2, i, 4);
        m28841a(0, this.f25092c - 1, i, 5);
        m28841a(1, this.f25092c - 3, i, 6);
        m28841a(1, this.f25092c - 2, i, 7);
        m28841a(1, this.f25092c - 1, i, 8);
    }

    /* renamed from: a */
    public final boolean mo32617a(int i, int i2) {
        return this.f25093d[(i2 * this.f25092c) + i] == 1;
    }

    /* renamed from: a */
    private void m28842a(int i, int i2, boolean z) {
        this.f25093d[(i2 * this.f25092c) + i] = z ? (byte) 1 : 0;
    }

    /* renamed from: b */
    private void m28843b(int i) {
        m28841a(this.f25091b - 3, 0, i, 1);
        m28841a(this.f25091b - 2, 0, i, 2);
        m28841a(this.f25091b - 1, 0, i, 3);
        m28841a(0, this.f25092c - 4, i, 4);
        m28841a(0, this.f25092c - 3, i, 5);
        m28841a(0, this.f25092c - 2, i, 6);
        m28841a(0, this.f25092c - 1, i, 7);
        m28841a(1, this.f25092c - 1, i, 8);
    }

    /* renamed from: a */
    public final void mo32616a() {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 4;
        while (true) {
            if (i5 == this.f25091b && i3 == 0) {
                m28839a(i4);
                i4++;
            }
            if (i5 == this.f25091b - 2 && i3 == 0 && this.f25092c % 4 != 0) {
                m28843b(i4);
                i4++;
            }
            if (i5 == this.f25091b - 2 && i3 == 0 && this.f25092c % 8 == 4) {
                m28845c(i4);
                i4++;
            }
            if (i5 == this.f25091b + 4 && i3 == 2 && this.f25092c % 8 == 0) {
                m28846d(i4);
                i4++;
            }
            do {
                if (i5 < this.f25091b && i3 >= 0 && !m28844b(i3, i5)) {
                    m28840a(i5, i3, i4);
                    i4++;
                }
                i5 -= 2;
                i3 += 2;
                if (i5 < 0 || i3 >= this.f25092c) {
                    int i6 = i5 + 1;
                    int i7 = i3 + 3;
                }
                m28840a(i5, i3, i4);
                i4++;
                i5 -= 2;
                i3 += 2;
                break;
            } while (i3 >= this.f25092c);
            int i62 = i5 + 1;
            int i72 = i3 + 3;
            do {
                if (i62 >= 0 && i72 < this.f25092c && !m28844b(i72, i62)) {
                    m28840a(i62, i72, i4);
                    i4++;
                }
                i62 += 2;
                i72 -= 2;
                if (i62 >= this.f25091b) {
                    break;
                }
            } while (i72 >= 0);
            i5 = i62 + 3;
            i3 = i72 + 1;
            i = this.f25091b;
            if (i5 >= i && i3 >= (i2 = this.f25092c)) {
                break;
            }
        }
        if (!m28844b(i2 - 1, i - 1)) {
            m28842a(this.f25092c - 1, this.f25091b - 1, true);
            m28842a(this.f25092c - 2, this.f25091b - 2, true);
        }
    }

    /* renamed from: a */
    private void m28841a(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.f25091b;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        if (i2 < 0) {
            int i6 = this.f25092c;
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        boolean z = true;
        if ((this.f25090a.charAt(i3) & (1 << (8 - i4))) == 0) {
            z = false;
        }
        m28842a(i2, i, z);
    }

    /* renamed from: a */
    private void m28840a(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        m28841a(i4, i5, i3, 1);
        int i6 = i2 - 1;
        m28841a(i4, i6, i3, 2);
        int i7 = i - 1;
        m28841a(i7, i5, i3, 3);
        m28841a(i7, i6, i3, 4);
        m28841a(i7, i2, i3, 5);
        m28841a(i, i5, i3, 6);
        m28841a(i, i6, i3, 7);
        m28841a(i, i2, i3, 8);
    }

    /* renamed from: a */
    private void m28839a(int i) {
        m28841a(this.f25091b - 1, 0, i, 1);
        m28841a(this.f25091b - 1, 1, i, 2);
        m28841a(this.f25091b - 1, 2, i, 3);
        m28841a(0, this.f25092c - 2, i, 4);
        m28841a(0, this.f25092c - 1, i, 5);
        m28841a(1, this.f25092c - 1, i, 6);
        m28841a(2, this.f25092c - 1, i, 7);
        m28841a(3, this.f25092c - 1, i, 8);
    }
}
