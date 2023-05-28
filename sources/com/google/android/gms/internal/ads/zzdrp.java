package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class zzdrp {

    /* renamed from: a */
    private final ByteBuffer f21646a;

    /* renamed from: b */
    private zzdni f21647b;

    /* renamed from: c */
    private int f21648c;

    private zzdrp(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    /* renamed from: a */
    public static zzdrp m24114a(byte[] bArr) {
        return m24115a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static int m24121b(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: c */
    private static int m24122c(int i) {
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

    /* renamed from: c */
    public static int m24123c(int i, int i2) {
        return m24111a(i) + m24117b(i2);
    }

    /* renamed from: d */
    private final void m24124d(int i) throws IOException {
        byte b = (byte) i;
        if (this.f21646a.hasRemaining()) {
            this.f21646a.put(b);
            return;
        }
        throw new zzdrq(this.f21646a.position(), this.f21646a.limit());
    }

    /* renamed from: e */
    private final void m24125e(int i) throws IOException {
        while ((i & -128) != 0) {
            m24124d((i & 127) | 128);
            i >>>= 7;
        }
        m24124d(i);
    }

    /* renamed from: b */
    public final void mo29197b(int i, int i2) throws IOException {
        mo29190a(i, 0);
        if (i2 >= 0) {
            m24125e(i2);
        } else {
            mo29196a((long) i2);
        }
    }

    private zzdrp(ByteBuffer byteBuffer) {
        this.f21646a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: a */
    public static zzdrp m24115a(byte[] bArr, int i, int i2) {
        return new zzdrp(bArr, 0, i2);
    }

    /* renamed from: a */
    public final void mo29194a(int i, boolean z) throws IOException {
        mo29190a(3, 0);
        byte b = z ? (byte) 1 : 0;
        if (this.f21646a.hasRemaining()) {
            this.f21646a.put(b);
            return;
        }
        throw new zzdrq(this.f21646a.position(), this.f21646a.limit());
    }

    /* renamed from: b */
    public static int m24119b(int i, String str) {
        return m24111a(i) + m24113a(str);
    }

    /* renamed from: b */
    public static int m24118b(int i, zzdrw zzdrw) {
        int a = m24111a(i);
        int a2 = zzdrw.mo29209a();
        return a + m24122c(a2) + a2;
    }

    /* renamed from: a */
    public final void mo29193a(int i, String str) throws IOException {
        mo29190a(i, 2);
        try {
            int c = m24122c(str.length());
            if (c == m24122c(str.length() * 3)) {
                int position = this.f21646a.position();
                if (this.f21646a.remaining() >= c) {
                    this.f21646a.position(position + c);
                    m24116a((CharSequence) str, this.f21646a);
                    int position2 = this.f21646a.position();
                    this.f21646a.position(position);
                    m24125e((position2 - position) - c);
                    this.f21646a.position(position2);
                    return;
                }
                throw new zzdrq(position + c, this.f21646a.limit());
            }
            m24125e(m24112a((CharSequence) str));
            m24116a((CharSequence) str, this.f21646a);
        } catch (BufferOverflowException e) {
            zzdrq zzdrq = new zzdrq(this.f21646a.position(), this.f21646a.limit());
            zzdrq.initCause(e);
            throw zzdrq;
        }
    }

    /* renamed from: b */
    public static int m24120b(int i, byte[] bArr) {
        return m24111a(i) + m24122c(bArr.length) + bArr.length;
    }

    /* renamed from: b */
    public static int m24117b(int i) {
        if (i >= 0) {
            return m24122c(i);
        }
        return 10;
    }

    /* renamed from: a */
    public final void mo29192a(int i, zzdrw zzdrw) throws IOException {
        mo29190a(i, 2);
        if (zzdrw.f21655a < 0) {
            zzdrw.mo29209a();
        }
        m24125e(zzdrw.f21655a);
        zzdrw.mo29198a(this);
    }

    /* renamed from: a */
    public final void mo29191a(int i, zzdpk zzdpk) throws IOException {
        if (this.f21647b == null) {
            this.f21647b = zzdni.m23811a(this.f21646a);
            this.f21648c = this.f21646a.position();
        } else if (this.f21648c != this.f21646a.position()) {
            this.f21647b.mo29104b(this.f21646a.array(), this.f21648c, this.f21646a.position() - this.f21648c);
            this.f21648c = this.f21646a.position();
        }
        zzdni zzdni = this.f21647b;
        zzdni.mo29087a(i, zzdpk);
        zzdni.mo29077a();
        this.f21648c = this.f21646a.position();
    }

    /* renamed from: a */
    public final void mo29195a(int i, byte[] bArr) throws IOException {
        mo29190a(i, 2);
        m24125e(bArr.length);
        int length = bArr.length;
        if (this.f21646a.remaining() >= length) {
            this.f21646a.put(bArr, 0, length);
            return;
        }
        throw new zzdrq(this.f21646a.position(), this.f21646a.limit());
    }

    /* renamed from: a */
    private static int m24112a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: a */
    private static void m24116a(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int i2;
        char charAt;
        if (!byteBuffer.isReadOnly()) {
            int i3 = 0;
            if (byteBuffer.hasArray()) {
                try {
                    byte[] array = byteBuffer.array();
                    int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    int remaining = byteBuffer.remaining();
                    int length = charSequence.length();
                    int i4 = remaining + arrayOffset;
                    while (i3 < length) {
                        int i5 = i3 + arrayOffset;
                        if (i5 >= i4 || (charAt = charSequence.charAt(i3)) >= 128) {
                            break;
                        }
                        array[i5] = (byte) charAt;
                        i3++;
                    }
                    if (i3 == length) {
                        i = arrayOffset + length;
                    } else {
                        i = arrayOffset + i3;
                        while (i3 < length) {
                            char charAt2 = charSequence.charAt(i3);
                            if (charAt2 < 128 && i < i4) {
                                i2 = i + 1;
                                array[i] = (byte) charAt2;
                            } else if (charAt2 < 2048 && i <= i4 - 2) {
                                int i6 = i + 1;
                                array[i] = (byte) ((charAt2 >>> 6) | 960);
                                i = i6 + 1;
                                array[i6] = (byte) ((charAt2 & '?') | 128);
                                i3++;
                            } else if ((charAt2 < 55296 || 57343 < charAt2) && i <= i4 - 3) {
                                int i7 = i + 1;
                                array[i] = (byte) ((charAt2 >>> 12) | 480);
                                int i8 = i7 + 1;
                                array[i7] = (byte) (((charAt2 >>> 6) & 63) | 128);
                                i2 = i8 + 1;
                                array[i8] = (byte) ((charAt2 & '?') | 128);
                            } else if (i <= i4 - 4) {
                                int i9 = i3 + 1;
                                if (i9 != charSequence.length()) {
                                    char charAt3 = charSequence.charAt(i9);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        int i10 = i + 1;
                                        array[i] = (byte) ((codePoint >>> 18) | 240);
                                        int i11 = i10 + 1;
                                        array[i10] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i12 = i11 + 1;
                                        array[i11] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i = i12 + 1;
                                        array[i12] = (byte) ((codePoint & 63) | 128);
                                        i3 = i9;
                                        i3++;
                                    } else {
                                        i3 = i9;
                                    }
                                }
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i3 - 1);
                                throw new IllegalArgumentException(sb.toString());
                            } else {
                                StringBuilder sb2 = new StringBuilder(37);
                                sb2.append("Failed writing ");
                                sb2.append(charAt2);
                                sb2.append(" at index ");
                                sb2.append(i);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            }
                            i = i2;
                            i3++;
                        }
                    }
                    byteBuffer.position(i - byteBuffer.arrayOffset());
                } catch (ArrayIndexOutOfBoundsException e) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e);
                    throw bufferOverflowException;
                }
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char charAt4 = charSequence.charAt(i3);
                    if (charAt4 < 128) {
                        byteBuffer.put((byte) charAt4);
                    } else if (charAt4 < 2048) {
                        byteBuffer.put((byte) ((charAt4 >>> 6) | 960));
                        byteBuffer.put((byte) ((charAt4 & '?') | 128));
                    } else if (charAt4 < 55296 || 57343 < charAt4) {
                        byteBuffer.put((byte) ((charAt4 >>> 12) | 480));
                        byteBuffer.put((byte) (((charAt4 >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((charAt4 & '?') | 128));
                    } else {
                        int i13 = i3 + 1;
                        if (i13 != charSequence.length()) {
                            char charAt5 = charSequence.charAt(i13);
                            if (Character.isSurrogatePair(charAt4, charAt5)) {
                                int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                byteBuffer.put((byte) ((codePoint2 >>> 18) | 240));
                                byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                                byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                                byteBuffer.put((byte) ((codePoint2 & 63) | 128));
                                i3 = i13;
                            } else {
                                i3 = i13;
                            }
                        }
                        StringBuilder sb3 = new StringBuilder(39);
                        sb3.append("Unpaired surrogate at index ");
                        sb3.append(i3 - 1);
                        throw new IllegalArgumentException(sb3.toString());
                    }
                    i3++;
                }
            }
        } else {
            throw new ReadOnlyBufferException();
        }
    }

    /* renamed from: a */
    public static int m24113a(String str) {
        int a = m24112a((CharSequence) str);
        return m24122c(a) + a;
    }

    /* renamed from: a */
    public final void mo29189a() {
        if (this.f21646a.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(this.f21646a.remaining())}));
        }
    }

    /* renamed from: a */
    public final void mo29190a(int i, int i2) throws IOException {
        m24125e((i << 3) | i2);
    }

    /* renamed from: a */
    public static int m24111a(int i) {
        return m24122c(i << 3);
    }

    /* renamed from: a */
    public final void mo29196a(long j) throws IOException {
        while ((-128 & j) != 0) {
            m24124d((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m24124d((int) j);
    }
}
