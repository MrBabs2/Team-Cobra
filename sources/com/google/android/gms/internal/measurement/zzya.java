package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class zzya {

    /* renamed from: a */
    private final ByteBuffer f23567a;

    private zzya(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    /* renamed from: a */
    public static zzya m26737a(byte[] bArr, int i, int i2) {
        return new zzya(bArr, 0, i2);
    }

    /* renamed from: b */
    public static zzya m26739b(byte[] bArr) {
        return m26737a(bArr, 0, bArr.length);
    }

    /* renamed from: c */
    public static int m26740c(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: d */
    private final void m26741d(int i) throws IOException {
        byte b = (byte) i;
        if (this.f23567a.hasRemaining()) {
            this.f23567a.put(b);
            return;
        }
        throw new zzyb(this.f23567a.position(), this.f23567a.limit());
    }

    private zzya(ByteBuffer byteBuffer) {
        this.f23567a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: b */
    public static int m26738b(int i) {
        return m26740c(i << 3);
    }

    /* renamed from: a */
    public final void mo30482a(zzyi zzyi) throws IOException {
        mo30480a(zzyi.mo30498d());
        zzyi.mo30485a(this);
    }

    /* renamed from: a */
    public static int m26736a(int i, zzyi zzyi) {
        int b = m26738b(i);
        int b2 = zzyi.mo30497b();
        return b + m26740c(b2) + b2;
    }

    /* renamed from: a */
    public final void mo30483a(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.f23567a.remaining() >= length) {
            this.f23567a.put(bArr, 0, length);
            return;
        }
        throw new zzyb(this.f23567a.position(), this.f23567a.limit());
    }

    /* renamed from: a */
    public final void mo30481a(int i, int i2) throws IOException {
        mo30480a((i << 3) | i2);
    }

    /* renamed from: a */
    public final void mo30480a(int i) throws IOException {
        while ((i & -128) != 0) {
            m26741d((i & 127) | 128);
            i >>>= 7;
        }
        m26741d(i);
    }
}
