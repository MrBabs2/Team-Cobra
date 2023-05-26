package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.ads.mt */
abstract class C7744mt implements zzdlk {

    /* renamed from: c */
    private static final int[] f16257c = m17588b(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: a */
    int[] f16258a;

    /* renamed from: b */
    private final int f16259b;

    C7744mt(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length == 32) {
            this.f16258a = m17588b(bArr);
            this.f16259b = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    /* renamed from: a */
    private static int m17584a(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    /* renamed from: b */
    private static int[] m17588b(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo26218a();

    /* renamed from: a */
    public final byte[] mo26247a(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length <= Integer.MAX_VALUE - mo26218a()) {
            ByteBuffer allocate = ByteBuffer.allocate(mo26218a() + bArr.length);
            mo26246a(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int[] mo26219a(int[] iArr, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo26246a(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
        if (byteBuffer.remaining() - mo26218a() >= bArr.length) {
            byte[] a = zzdlo.m23738a(mo26218a());
            byteBuffer.put(a);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int remaining = wrap.remaining();
            int i = (remaining / 64) + 1;
            for (int i2 = 0; i2 < i; i2++) {
                ByteBuffer a2 = mo26245a(a, this.f16259b + i2);
                if (i2 == i - 1) {
                    zzdjs.m23699a(byteBuffer, wrap, a2, remaining % 64);
                } else {
                    zzdjs.m23699a(byteBuffer, wrap, a2, 64);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ByteBuffer mo26245a(byte[] bArr, int i) {
        int[] a = mo26219a(m17588b(bArr), i);
        int[] iArr = (int[]) a.clone();
        m17585a(iArr);
        for (int i2 = 0; i2 < a.length; i2++) {
            a[i2] = a[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(a, 0, 16);
        return order;
    }

    /* renamed from: a */
    static void m17587a(int[] iArr, int[] iArr2) {
        int[] iArr3 = f16257c;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, f16257c.length, 8);
    }

    /* renamed from: a */
    static void m17585a(int[] iArr) {
        int[] iArr2 = iArr;
        for (int i = 0; i < 10; i++) {
            m17586a(iArr2, 0, 4, 8, 12);
            m17586a(iArr2, 1, 5, 9, 13);
            m17586a(iArr2, 2, 6, 10, 14);
            m17586a(iArr2, 3, 7, 11, 15);
            m17586a(iArr2, 0, 5, 10, 15);
            m17586a(iArr2, 1, 6, 11, 12);
            m17586a(iArr2, 2, 7, 8, 13);
            m17586a(iArr2, 3, 4, 9, 14);
        }
    }

    /* renamed from: a */
    private static void m17586a(int[] iArr, int i, int i2, int i3, int i4) {
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = m17584a(iArr[i4] ^ iArr[i], 16);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = m17584a(iArr[i2] ^ iArr[i3], 12);
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = m17584a(iArr[i] ^ iArr[i4], 8);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = m17584a(iArr[i2] ^ iArr[i3], 7);
    }
}
