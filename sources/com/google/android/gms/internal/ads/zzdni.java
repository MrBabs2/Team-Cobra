package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;

public abstract class zzdni extends zzdmq {

    /* renamed from: b */
    private static final Logger f21494b = Logger.getLogger(zzdni.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f21495c = C7596ix.m17220b();

    /* renamed from: a */
    C8004tu f21496a;

    /* renamed from: com.google.android.gms.internal.ads.zzdni$a */
    static class C8237a extends zzdni {

        /* renamed from: d */
        private final byte[] f21497d;

        /* renamed from: e */
        private final int f21498e;

        /* renamed from: f */
        private final int f21499f;

        /* renamed from: g */
        private int f21500g;

        C8237a(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.f21497d = bArr;
                    this.f21498e = i;
                    this.f21500g = i;
                    this.f21499f = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: a */
        public void mo29077a() {
        }

        /* renamed from: a */
        public final void mo29084a(int i, int i2) throws IOException {
            mo29099b(i, 5);
            mo29111d(i2);
        }

        /* renamed from: b */
        public final void mo29099b(int i, int i2) throws IOException {
            mo29098b((i << 3) | i2);
        }

        /* renamed from: c */
        public final void mo29107c(int i, int i2) throws IOException {
            mo29099b(i, 0);
            mo29081a(i2);
        }

        /* renamed from: d */
        public final void mo29112d(int i, int i2) throws IOException {
            mo29099b(i, 0);
            mo29098b(i2);
        }

        /* renamed from: e */
        public final int mo29114e() {
            return this.f21500g - this.f21498e;
        }

        /* renamed from: b */
        public final void mo29102b(int i, zzdpk zzdpk) throws IOException {
            mo29099b(1, 3);
            mo29112d(2, i);
            mo29087a(3, zzdpk);
            mo29099b(1, 4);
        }

        /* renamed from: a */
        public final void mo29085a(int i, long j) throws IOException {
            mo29099b(i, 0);
            mo29091a(j);
        }

        /* renamed from: c */
        public final void mo29108c(int i, long j) throws IOException {
            mo29099b(i, 1);
            mo29109c(j);
        }

        /* renamed from: d */
        public final void mo29111d(int i) throws IOException {
            try {
                byte[] bArr = this.f21497d;
                int i2 = this.f21500g;
                int i3 = i2 + 1;
                this.f21500g = i3;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.f21497d;
                int i4 = i3 + 1;
                this.f21500g = i4;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.f21497d;
                int i5 = i4 + 1;
                this.f21500g = i5;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.f21497d;
                this.f21500g = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f21500g), Integer.valueOf(this.f21499f), 1}), e);
            }
        }

        /* renamed from: a */
        public final void mo29090a(int i, boolean z) throws IOException {
            mo29099b(i, 0);
            mo29078a(z ? (byte) 1 : 0);
        }

        /* renamed from: c */
        public final void mo29110c(byte[] bArr, int i, int i2) throws IOException {
            mo29098b(i2);
            mo29104b(bArr, 0, i2);
        }

        /* renamed from: b */
        public final void mo29101b(int i, zzdmr zzdmr) throws IOException {
            mo29099b(1, 3);
            mo29112d(2, i);
            mo29086a(3, zzdmr);
            mo29099b(1, 4);
        }

        /* renamed from: a */
        public final void mo29089a(int i, String str) throws IOException {
            mo29099b(i, 2);
            mo29094a(str);
        }

        /* renamed from: c */
        public final void mo29109c(long j) throws IOException {
            try {
                byte[] bArr = this.f21497d;
                int i = this.f21500g;
                int i2 = i + 1;
                this.f21500g = i2;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.f21497d;
                int i3 = i2 + 1;
                this.f21500g = i3;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.f21497d;
                int i4 = i3 + 1;
                this.f21500g = i4;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.f21497d;
                int i5 = i4 + 1;
                this.f21500g = i5;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.f21497d;
                int i6 = i5 + 1;
                this.f21500g = i6;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.f21497d;
                int i7 = i6 + 1;
                this.f21500g = i7;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.f21497d;
                int i8 = i7 + 1;
                this.f21500g = i8;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.f21497d;
                this.f21500g = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f21500g), Integer.valueOf(this.f21499f), 1}), e);
            }
        }

        /* renamed from: a */
        public final void mo29086a(int i, zzdmr zzdmr) throws IOException {
            mo29099b(i, 2);
            mo29092a(zzdmr);
        }

        /* renamed from: b */
        public final void mo29098b(int i) throws IOException {
            if (!zzdni.f21495c || mo29097b() < 10) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f21497d;
                    int i2 = this.f21500g;
                    this.f21500g = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f21497d;
                    int i3 = this.f21500g;
                    this.f21500g = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f21500g), Integer.valueOf(this.f21499f), 1}), e);
                }
            } else {
                while ((i & -128) != 0) {
                    byte[] bArr3 = this.f21497d;
                    int i4 = this.f21500g;
                    this.f21500g = i4 + 1;
                    C7596ix.m17213a(bArr3, (long) i4, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr4 = this.f21497d;
                int i5 = this.f21500g;
                this.f21500g = i5 + 1;
                C7596ix.m17213a(bArr4, (long) i5, (byte) i);
            }
        }

        /* renamed from: a */
        public final void mo29092a(zzdmr zzdmr) throws IOException {
            mo29098b(zzdmr.size());
            zzdmr.mo26251a((zzdmq) this);
        }

        /* renamed from: a */
        public final void mo29087a(int i, zzdpk zzdpk) throws IOException {
            mo29099b(i, 2);
            mo29093a(zzdpk);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo29088a(int i, zzdpk zzdpk, C7784nw nwVar) throws IOException {
            mo29099b(i, 2);
            zzdmi zzdmi = (zzdmi) zzdpk;
            int a = zzdmi.mo29062a();
            if (a == -1) {
                a = nwVar.mo25751c(zzdmi);
                zzdmi.mo29063a(a);
            }
            mo29098b(a);
            nwVar.mo25746a(zzdpk, (C8118wx) this.f21496a);
        }

        /* renamed from: b */
        public final void mo29104b(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f21497d, this.f21500g, i2);
                this.f21500g += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f21500g), Integer.valueOf(this.f21499f), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: b */
        public final int mo29097b() {
            return this.f21499f - this.f21500g;
        }

        /* renamed from: a */
        public final void mo29093a(zzdpk zzdpk) throws IOException {
            mo29098b(zzdpk.mo29133h());
            zzdpk.mo29128a(this);
        }

        /* renamed from: a */
        public final void mo29078a(byte b) throws IOException {
            try {
                byte[] bArr = this.f21497d;
                int i = this.f21500g;
                this.f21500g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f21500g), Integer.valueOf(this.f21499f), 1}), e);
            }
        }

        /* renamed from: a */
        public final void mo29081a(int i) throws IOException {
            if (i >= 0) {
                mo29098b(i);
            } else {
                mo29091a((long) i);
            }
        }

        /* renamed from: a */
        public final void mo29091a(long j) throws IOException {
            if (!zzdni.f21495c || mo29097b() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f21497d;
                    int i = this.f21500g;
                    this.f21500g = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f21497d;
                    int i2 = this.f21500g;
                    this.f21500g = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f21500g), Integer.valueOf(this.f21499f), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f21497d;
                    int i3 = this.f21500g;
                    this.f21500g = i3 + 1;
                    C7596ix.m17213a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f21497d;
                int i4 = this.f21500g;
                this.f21500g = i4 + 1;
                C7596ix.m17213a(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: a */
        public final void mo29070a(byte[] bArr, int i, int i2) throws IOException {
            mo29104b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo29094a(String str) throws IOException {
            int i = this.f21500g;
            try {
                int g = zzdni.m23842g(str.length() * 3);
                int g2 = zzdni.m23842g(str.length());
                if (g2 == g) {
                    int i2 = i + g2;
                    this.f21500g = i2;
                    int a = C7711lx.m17526a(str, this.f21497d, i2, mo29097b());
                    this.f21500g = i;
                    mo29098b((a - i) - g2);
                    this.f21500g = a;
                    return;
                }
                mo29098b(C7711lx.m17525a((CharSequence) str));
                this.f21500g = C7711lx.m17526a(str, this.f21497d, this.f21500g, mo29097b());
            } catch (C7859px e) {
                this.f21500g = i;
                mo29095a(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc((Throwable) e2);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.zzdni$b */
    static final class C8238b extends C8237a {

        /* renamed from: h */
        private final ByteBuffer f21501h;

        /* renamed from: i */
        private int f21502i;

        C8238b(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f21501h = byteBuffer;
            this.f21502i = byteBuffer.position();
        }

        /* renamed from: a */
        public final void mo29077a() {
            this.f21501h.position(this.f21502i + mo29114e());
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.zzdni$c */
    static final class C8239c extends zzdni {

        /* renamed from: d */
        private final ByteBuffer f21503d;

        /* renamed from: e */
        private final ByteBuffer f21504e;

        C8239c(ByteBuffer byteBuffer) {
            super();
            this.f21503d = byteBuffer;
            this.f21504e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            byteBuffer.position();
        }

        /* renamed from: a */
        public final void mo29084a(int i, int i2) throws IOException {
            mo29099b(i, 5);
            mo29111d(i2);
        }

        /* renamed from: b */
        public final void mo29099b(int i, int i2) throws IOException {
            mo29098b((i << 3) | i2);
        }

        /* renamed from: c */
        public final void mo29107c(int i, int i2) throws IOException {
            mo29099b(i, 0);
            mo29081a(i2);
        }

        /* renamed from: d */
        public final void mo29112d(int i, int i2) throws IOException {
            mo29099b(i, 0);
            mo29098b(i2);
        }

        /* renamed from: b */
        public final void mo29102b(int i, zzdpk zzdpk) throws IOException {
            mo29099b(1, 3);
            mo29112d(2, i);
            mo29087a(3, zzdpk);
            mo29099b(1, 4);
        }

        /* renamed from: a */
        public final void mo29085a(int i, long j) throws IOException {
            mo29099b(i, 0);
            mo29091a(j);
        }

        /* renamed from: c */
        public final void mo29108c(int i, long j) throws IOException {
            mo29099b(i, 1);
            mo29109c(j);
        }

        /* renamed from: d */
        public final void mo29111d(int i) throws IOException {
            try {
                this.f21504e.putInt(i);
            } catch (BufferOverflowException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: a */
        public final void mo29090a(int i, boolean z) throws IOException {
            mo29099b(i, 0);
            mo29078a(z ? (byte) 1 : 0);
        }

        /* renamed from: c */
        public final void mo29110c(byte[] bArr, int i, int i2) throws IOException {
            mo29098b(i2);
            mo29104b(bArr, 0, i2);
        }

        /* renamed from: b */
        public final void mo29101b(int i, zzdmr zzdmr) throws IOException {
            mo29099b(1, 3);
            mo29112d(2, i);
            mo29086a(3, zzdmr);
            mo29099b(1, 4);
        }

        /* renamed from: a */
        public final void mo29089a(int i, String str) throws IOException {
            mo29099b(i, 2);
            mo29094a(str);
        }

        /* renamed from: c */
        public final void mo29109c(long j) throws IOException {
            try {
                this.f21504e.putLong(j);
            } catch (BufferOverflowException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: c */
        private final void m23925c(String str) throws IOException {
            try {
                C7711lx.m17527a((CharSequence) str, this.f21504e);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: a */
        public final void mo29086a(int i, zzdmr zzdmr) throws IOException {
            mo29099b(i, 2);
            mo29092a(zzdmr);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo29115b(zzdpk zzdpk, C7784nw nwVar) throws IOException {
            zzdmi zzdmi = (zzdmi) zzdpk;
            int a = zzdmi.mo29062a();
            if (a == -1) {
                a = nwVar.mo25751c(zzdmi);
                zzdmi.mo29063a(a);
            }
            mo29098b(a);
            nwVar.mo25746a(zzdpk, (C8118wx) this.f21496a);
        }

        /* renamed from: a */
        public final void mo29087a(int i, zzdpk zzdpk) throws IOException {
            mo29099b(i, 2);
            mo29093a(zzdpk);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo29088a(int i, zzdpk zzdpk, C7784nw nwVar) throws IOException {
            mo29099b(i, 2);
            mo29115b(zzdpk, nwVar);
        }

        /* renamed from: a */
        public final void mo29093a(zzdpk zzdpk) throws IOException {
            mo29098b(zzdpk.mo29133h());
            zzdpk.mo29128a(this);
        }

        /* renamed from: b */
        public final void mo29098b(int i) throws IOException {
            while ((i & -128) != 0) {
                this.f21504e.put((byte) ((i & 127) | 128));
                i >>>= 7;
            }
            try {
                this.f21504e.put((byte) i);
            } catch (BufferOverflowException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: a */
        public final void mo29078a(byte b) throws IOException {
            try {
                this.f21504e.put(b);
            } catch (BufferOverflowException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: a */
        public final void mo29092a(zzdmr zzdmr) throws IOException {
            mo29098b(zzdmr.size());
            zzdmr.mo26251a((zzdmq) this);
        }

        /* renamed from: b */
        public final void mo29104b(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.f21504e.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc((Throwable) e);
            } catch (BufferOverflowException e2) {
                throw new zzc((Throwable) e2);
            }
        }

        /* renamed from: a */
        public final void mo29081a(int i) throws IOException {
            if (i >= 0) {
                mo29098b(i);
            } else {
                mo29091a((long) i);
            }
        }

        /* renamed from: b */
        public final int mo29097b() {
            return this.f21504e.remaining();
        }

        /* renamed from: a */
        public final void mo29091a(long j) throws IOException {
            while ((-128 & j) != 0) {
                this.f21504e.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            try {
                this.f21504e.put((byte) ((int) j));
            } catch (BufferOverflowException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: a */
        public final void mo29070a(byte[] bArr, int i, int i2) throws IOException {
            mo29104b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo29094a(String str) throws IOException {
            int position = this.f21504e.position();
            try {
                int g = zzdni.m23842g(str.length() * 3);
                int g2 = zzdni.m23842g(str.length());
                if (g2 == g) {
                    int position2 = this.f21504e.position() + g2;
                    this.f21504e.position(position2);
                    m23925c(str);
                    int position3 = this.f21504e.position();
                    this.f21504e.position(position);
                    mo29098b(position3 - position2);
                    this.f21504e.position(position3);
                    return;
                }
                mo29098b(C7711lx.m17525a((CharSequence) str));
                m23925c(str);
            } catch (C7859px e) {
                this.f21504e.position(position);
                mo29095a(str, e);
            } catch (IllegalArgumentException e2) {
                throw new zzc((Throwable) e2);
            }
        }

        /* renamed from: a */
        public final void mo29077a() {
            this.f21503d.position(this.f21504e.position());
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.zzdni$d */
    static final class C8240d extends zzdni {

        /* renamed from: d */
        private final ByteBuffer f21505d;

        /* renamed from: e */
        private final ByteBuffer f21506e;

        /* renamed from: f */
        private final long f21507f;

        /* renamed from: g */
        private final long f21508g;

        /* renamed from: h */
        private final long f21509h;

        /* renamed from: i */
        private final long f21510i;

        /* renamed from: j */
        private long f21511j = this.f21508g;

        C8240d(ByteBuffer byteBuffer) {
            super();
            this.f21505d = byteBuffer;
            this.f21506e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long a = C7596ix.m17202a(byteBuffer);
            this.f21507f = a;
            this.f21508g = a + ((long) byteBuffer.position());
            long limit = this.f21507f + ((long) byteBuffer.limit());
            this.f21509h = limit;
            this.f21510i = limit - 10;
        }

        /* renamed from: i */
        private final void m23954i(long j) {
            this.f21506e.position((int) (j - this.f21507f));
        }

        /* renamed from: a */
        public final void mo29084a(int i, int i2) throws IOException {
            mo29099b(i, 5);
            mo29111d(i2);
        }

        /* renamed from: b */
        public final void mo29099b(int i, int i2) throws IOException {
            mo29098b((i << 3) | i2);
        }

        /* renamed from: c */
        public final void mo29107c(int i, int i2) throws IOException {
            mo29099b(i, 0);
            mo29081a(i2);
        }

        /* renamed from: d */
        public final void mo29112d(int i, int i2) throws IOException {
            mo29099b(i, 0);
            mo29098b(i2);
        }

        /* renamed from: b */
        public final void mo29102b(int i, zzdpk zzdpk) throws IOException {
            mo29099b(1, 3);
            mo29112d(2, i);
            mo29087a(3, zzdpk);
            mo29099b(1, 4);
        }

        /* renamed from: a */
        public final void mo29085a(int i, long j) throws IOException {
            mo29099b(i, 0);
            mo29091a(j);
        }

        /* renamed from: c */
        public final void mo29108c(int i, long j) throws IOException {
            mo29099b(i, 1);
            mo29109c(j);
        }

        /* renamed from: d */
        public final void mo29111d(int i) throws IOException {
            this.f21506e.putInt((int) (this.f21511j - this.f21507f), i);
            this.f21511j += 4;
        }

        /* renamed from: a */
        public final void mo29090a(int i, boolean z) throws IOException {
            mo29099b(i, 0);
            mo29078a(z ? (byte) 1 : 0);
        }

        /* renamed from: c */
        public final void mo29110c(byte[] bArr, int i, int i2) throws IOException {
            mo29098b(i2);
            mo29104b(bArr, 0, i2);
        }

        /* renamed from: b */
        public final void mo29101b(int i, zzdmr zzdmr) throws IOException {
            mo29099b(1, 3);
            mo29112d(2, i);
            mo29086a(3, zzdmr);
            mo29099b(1, 4);
        }

        /* renamed from: a */
        public final void mo29089a(int i, String str) throws IOException {
            mo29099b(i, 2);
            mo29094a(str);
        }

        /* renamed from: c */
        public final void mo29109c(long j) throws IOException {
            this.f21506e.putLong((int) (this.f21511j - this.f21507f), j);
            this.f21511j += 8;
        }

        /* renamed from: a */
        public final void mo29086a(int i, zzdmr zzdmr) throws IOException {
            mo29099b(i, 2);
            mo29092a(zzdmr);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo29116b(zzdpk zzdpk, C7784nw nwVar) throws IOException {
            zzdmi zzdmi = (zzdmi) zzdpk;
            int a = zzdmi.mo29062a();
            if (a == -1) {
                a = nwVar.mo25751c(zzdmi);
                zzdmi.mo29063a(a);
            }
            mo29098b(a);
            nwVar.mo25746a(zzdpk, (C8118wx) this.f21496a);
        }

        /* renamed from: a */
        public final void mo29087a(int i, zzdpk zzdpk) throws IOException {
            mo29099b(i, 2);
            mo29093a(zzdpk);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo29088a(int i, zzdpk zzdpk, C7784nw nwVar) throws IOException {
            mo29099b(i, 2);
            mo29116b(zzdpk, nwVar);
        }

        /* renamed from: a */
        public final void mo29093a(zzdpk zzdpk) throws IOException {
            mo29098b(zzdpk.mo29133h());
            zzdpk.mo29128a(this);
        }

        /* renamed from: b */
        public final void mo29098b(int i) throws IOException {
            if (this.f21511j <= this.f21510i) {
                while ((i & -128) != 0) {
                    long j = this.f21511j;
                    this.f21511j = j + 1;
                    C7596ix.m17205a(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                long j2 = this.f21511j;
                this.f21511j = 1 + j2;
                C7596ix.m17205a(j2, (byte) i);
                return;
            }
            while (true) {
                long j3 = this.f21511j;
                if (j3 >= this.f21509h) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f21511j), Long.valueOf(this.f21509h), 1}));
                } else if ((i & -128) == 0) {
                    this.f21511j = 1 + j3;
                    C7596ix.m17205a(j3, (byte) i);
                    return;
                } else {
                    this.f21511j = j3 + 1;
                    C7596ix.m17205a(j3, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            }
        }

        /* renamed from: a */
        public final void mo29078a(byte b) throws IOException {
            long j = this.f21511j;
            if (j < this.f21509h) {
                this.f21511j = 1 + j;
                C7596ix.m17205a(j, b);
                return;
            }
            throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f21511j), Long.valueOf(this.f21509h), 1}));
        }

        /* renamed from: a */
        public final void mo29092a(zzdmr zzdmr) throws IOException {
            mo29098b(zzdmr.size());
            zzdmr.mo26251a((zzdmq) this);
        }

        /* renamed from: a */
        public final void mo29081a(int i) throws IOException {
            if (i >= 0) {
                mo29098b(i);
            } else {
                mo29091a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo29104b(byte[] bArr, int i, int i2) throws IOException {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = (long) i2;
                long j2 = this.f21511j;
                if (this.f21509h - j >= j2) {
                    C7596ix.m17214a(bArr, (long) i, j2, j);
                    this.f21511j += j;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException(DonationsAnalytics.VALUE);
            }
            throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f21511j), Long.valueOf(this.f21509h), Integer.valueOf(i2)}));
        }

        /* renamed from: a */
        public final void mo29091a(long j) throws IOException {
            if (this.f21511j <= this.f21510i) {
                while ((j & -128) != 0) {
                    long j2 = this.f21511j;
                    this.f21511j = j2 + 1;
                    C7596ix.m17205a(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                long j3 = this.f21511j;
                this.f21511j = 1 + j3;
                C7596ix.m17205a(j3, (byte) ((int) j));
                return;
            }
            while (true) {
                long j4 = this.f21511j;
                if (j4 >= this.f21509h) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f21511j), Long.valueOf(this.f21509h), 1}));
                } else if ((j & -128) == 0) {
                    this.f21511j = 1 + j4;
                    C7596ix.m17205a(j4, (byte) ((int) j));
                    return;
                } else {
                    this.f21511j = j4 + 1;
                    C7596ix.m17205a(j4, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            }
        }

        /* renamed from: b */
        public final int mo29097b() {
            return (int) (this.f21509h - this.f21511j);
        }

        /* renamed from: a */
        public final void mo29070a(byte[] bArr, int i, int i2) throws IOException {
            mo29104b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo29094a(String str) throws IOException {
            long j = this.f21511j;
            try {
                int g = zzdni.m23842g(str.length() * 3);
                int g2 = zzdni.m23842g(str.length());
                if (g2 == g) {
                    int i = ((int) (this.f21511j - this.f21507f)) + g2;
                    this.f21506e.position(i);
                    C7711lx.m17527a((CharSequence) str, this.f21506e);
                    int position = this.f21506e.position() - i;
                    mo29098b(position);
                    this.f21511j += (long) position;
                    return;
                }
                int a = C7711lx.m17525a((CharSequence) str);
                mo29098b(a);
                m23954i(this.f21511j);
                C7711lx.m17527a((CharSequence) str, this.f21506e);
                this.f21511j += (long) a;
            } catch (C7859px e) {
                this.f21511j = j;
                m23954i(j);
                mo29095a(str, e);
            } catch (IllegalArgumentException e2) {
                throw new zzc((Throwable) e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzc((Throwable) e3);
            }
        }

        /* renamed from: a */
        public final void mo29077a() {
            this.f21505d.position((int) (this.f21511j - this.f21507f));
        }
    }

    public static class zzc extends IOException {
        zzc() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        zzc(java.lang.String r3) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L_0x0011
                java.lang.String r3 = r1.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L_0x0016:
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdni.zzc.<init>(java.lang.String):void");
        }

        zzc(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        zzc(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L_0x0011
                java.lang.String r3 = r1.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L_0x0016:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdni.zzc.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    private zzdni() {
    }

    /* renamed from: a */
    public static zzdni m23812a(byte[] bArr) {
        return new C8237a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static int m23813b(double d) {
        return 8;
    }

    /* renamed from: b */
    public static int m23814b(float f) {
        return 4;
    }

    /* renamed from: b */
    public static int m23824b(boolean z) {
        return 1;
    }

    /* renamed from: d */
    public static int m23830d(int i, long j) {
        return m23835e(i) + m23837e(j);
    }

    /* renamed from: e */
    public static int m23837e(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: f */
    public static int m23839f(int i, int i2) {
        return m23835e(i) + m23838f(i2);
    }

    /* renamed from: g */
    public static int m23842g(int i) {
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

    /* renamed from: g */
    public static int m23843g(int i, int i2) {
        return m23835e(i) + m23842g(i2);
    }

    /* renamed from: g */
    public static int m23845g(long j) {
        return 8;
    }

    /* renamed from: h */
    public static int m23847h(int i, int i2) {
        return m23835e(i) + m23842g(m23857l(i2));
    }

    /* renamed from: h */
    public static int m23849h(long j) {
        return 8;
    }

    /* renamed from: i */
    public static int m23850i(int i) {
        return 4;
    }

    /* renamed from: i */
    public static int m23851i(int i, int i2) {
        return m23835e(i) + 4;
    }

    /* renamed from: i */
    private static long m23852i(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: j */
    public static int m23853j(int i) {
        return 4;
    }

    /* renamed from: j */
    public static int m23854j(int i, int i2) {
        return m23835e(i) + 4;
    }

    /* renamed from: k */
    public static int m23856k(int i, int i2) {
        return m23835e(i) + m23838f(i2);
    }

    /* renamed from: l */
    private static int m23857l(int i) {
        return (i >> 31) ^ (i << 1);
    }

    @Deprecated
    /* renamed from: m */
    public static int m23858m(int i) {
        return m23842g(i);
    }

    /* renamed from: a */
    public abstract void mo29077a() throws IOException;

    /* renamed from: a */
    public abstract void mo29078a(byte b) throws IOException;

    /* renamed from: a */
    public abstract void mo29081a(int i) throws IOException;

    /* renamed from: a */
    public abstract void mo29084a(int i, int i2) throws IOException;

    /* renamed from: a */
    public abstract void mo29085a(int i, long j) throws IOException;

    /* renamed from: a */
    public abstract void mo29086a(int i, zzdmr zzdmr) throws IOException;

    /* renamed from: a */
    public abstract void mo29087a(int i, zzdpk zzdpk) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo29088a(int i, zzdpk zzdpk, C7784nw nwVar) throws IOException;

    /* renamed from: a */
    public abstract void mo29089a(int i, String str) throws IOException;

    /* renamed from: a */
    public abstract void mo29090a(int i, boolean z) throws IOException;

    /* renamed from: a */
    public abstract void mo29091a(long j) throws IOException;

    /* renamed from: a */
    public abstract void mo29092a(zzdmr zzdmr) throws IOException;

    /* renamed from: a */
    public abstract void mo29093a(zzdpk zzdpk) throws IOException;

    /* renamed from: a */
    public abstract void mo29094a(String str) throws IOException;

    /* renamed from: b */
    public abstract int mo29097b();

    /* renamed from: b */
    public abstract void mo29098b(int i) throws IOException;

    /* renamed from: b */
    public abstract void mo29099b(int i, int i2) throws IOException;

    /* renamed from: b */
    public final void mo29100b(int i, long j) throws IOException {
        mo29085a(i, m23852i(j));
    }

    /* renamed from: b */
    public abstract void mo29101b(int i, zzdmr zzdmr) throws IOException;

    /* renamed from: b */
    public abstract void mo29102b(int i, zzdpk zzdpk) throws IOException;

    /* renamed from: b */
    public abstract void mo29104b(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: c */
    public final void mo29106c(int i) throws IOException {
        mo29098b(m23857l(i));
    }

    /* renamed from: c */
    public abstract void mo29107c(int i, int i2) throws IOException;

    /* renamed from: c */
    public abstract void mo29108c(int i, long j) throws IOException;

    /* renamed from: c */
    public abstract void mo29109c(long j) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo29110c(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: d */
    public abstract void mo29111d(int i) throws IOException;

    /* renamed from: d */
    public abstract void mo29112d(int i, int i2) throws IOException;

    /* renamed from: e */
    public final void mo29113e(int i, int i2) throws IOException {
        mo29112d(i, m23857l(i2));
    }

    /* renamed from: c */
    public static int m23826c(int i, zzdmr zzdmr) {
        int e = m23835e(i);
        int size = zzdmr.size();
        return e + m23842g(size) + size;
    }

    /* renamed from: e */
    public static int m23836e(int i, long j) {
        return m23835e(i) + m23837e(j);
    }

    /* renamed from: f */
    public static int m23840f(int i, long j) {
        return m23835e(i) + m23837e(m23852i(j));
    }

    /* renamed from: g */
    public static int m23844g(int i, long j) {
        return m23835e(i) + 8;
    }

    /* renamed from: b */
    public final void mo29103b(long j) throws IOException {
        mo29091a(m23852i(j));
    }

    /* renamed from: a */
    public static zzdni m23811a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new C8238b(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        } else if (C7596ix.m17224c()) {
            return new C8240d(byteBuffer);
        } else {
            return new C8239c(byteBuffer);
        }
    }

    /* renamed from: b */
    public static int m23816b(int i, float f) {
        return m23835e(i) + 4;
    }

    /* renamed from: d */
    public static int m23832d(int i, zzdpk zzdpk) {
        return (m23835e(1) << 1) + m23843g(2, i) + m23827c(3, zzdpk);
    }

    /* renamed from: e */
    public static int m23835e(int i) {
        return m23842g(i << 3);
    }

    /* renamed from: h */
    public static int m23848h(int i, long j) {
        return m23835e(i) + 8;
    }

    /* renamed from: k */
    public static int m23855k(int i) {
        return m23838f(i);
    }

    /* renamed from: b */
    public static int m23815b(int i, double d) {
        return m23835e(i) + 8;
    }

    /* renamed from: f */
    public static int m23838f(int i) {
        if (i >= 0) {
            return m23842g(i);
        }
        return 10;
    }

    /* renamed from: h */
    public static int m23846h(int i) {
        return m23842g(m23857l(i));
    }

    /* renamed from: b */
    public static int m23820b(int i, boolean z) {
        return m23835e(i) + 1;
    }

    /* renamed from: c */
    public static int m23827c(int i, zzdpk zzdpk) {
        return m23835e(i) + m23822b(zzdpk);
    }

    /* renamed from: f */
    public static int m23841f(long j) {
        return m23837e(m23852i(j));
    }

    /* renamed from: b */
    public static int m23819b(int i, String str) {
        return m23835e(i) + m23823b(str);
    }

    /* renamed from: d */
    public static int m23831d(int i, zzdmr zzdmr) {
        return (m23835e(1) << 1) + m23843g(2, i) + m23826c(3, zzdmr);
    }

    /* renamed from: c */
    public final void mo29105c() {
        if (mo29097b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: b */
    static int m23818b(int i, zzdpk zzdpk, C7784nw nwVar) {
        return m23835e(i) + m23810a(zzdpk, nwVar);
    }

    /* renamed from: b */
    public static int m23817b(int i, zzdor zzdor) {
        return (m23835e(1) << 1) + m23843g(2, i) + m23808a(3, zzdor);
    }

    @Deprecated
    /* renamed from: c */
    static int m23828c(int i, zzdpk zzdpk, C7784nw nwVar) {
        int e = m23835e(i) << 1;
        zzdmi zzdmi = (zzdmi) zzdpk;
        int a = zzdmi.mo29062a();
        if (a == -1) {
            a = nwVar.mo25751c(zzdmi);
            zzdmi.mo29063a(a);
        }
        return e + a;
    }

    /* renamed from: d */
    public static int m23833d(long j) {
        return m23837e(j);
    }

    /* renamed from: a */
    public final void mo29083a(int i, float f) throws IOException {
        mo29084a(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: b */
    public static int m23823b(String str) {
        int i;
        try {
            i = C7711lx.m17525a((CharSequence) str);
        } catch (C7859px unused) {
            i = str.getBytes(zzdod.f21586a).length;
        }
        return m23842g(i) + i;
    }

    /* renamed from: a */
    public final void mo29082a(int i, double d) throws IOException {
        mo29108c(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void mo29080a(float f) throws IOException {
        mo29111d(Float.floatToRawIntBits(f));
    }

    @Deprecated
    /* renamed from: c */
    public static int m23829c(zzdpk zzdpk) {
        return zzdpk.mo29133h();
    }

    /* renamed from: a */
    public final void mo29079a(double d) throws IOException {
        mo29109c(Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void mo29096a(boolean z) throws IOException {
        mo29078a(z ? (byte) 1 : 0);
    }

    /* renamed from: a */
    public static int m23808a(int i, zzdor zzdor) {
        int e = m23835e(i);
        int b = zzdor.mo29151b();
        return e + m23842g(b) + b;
    }

    /* renamed from: b */
    public static int m23821b(zzdmr zzdmr) {
        int size = zzdmr.size();
        return m23842g(size) + size;
    }

    /* renamed from: b */
    public static int m23825b(byte[] bArr) {
        int length = bArr.length;
        return m23842g(length) + length;
    }

    /* renamed from: a */
    public static int m23809a(zzdor zzdor) {
        int b = zzdor.mo29151b();
        return m23842g(b) + b;
    }

    /* renamed from: b */
    public static int m23822b(zzdpk zzdpk) {
        int h = zzdpk.mo29133h();
        return m23842g(h) + h;
    }

    /* renamed from: a */
    static int m23810a(zzdpk zzdpk, C7784nw nwVar) {
        zzdmi zzdmi = (zzdmi) zzdpk;
        int a = zzdmi.mo29062a();
        if (a == -1) {
            a = nwVar.mo25751c(zzdmi);
            zzdmi.mo29063a(a);
        }
        return m23842g(a) + a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29095a(String str, C7859px pxVar) throws IOException {
        f21494b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", pxVar);
        byte[] bytes = str.getBytes(zzdod.f21586a);
        try {
            mo29098b(bytes.length);
            mo29070a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzc((Throwable) e);
        } catch (zzc e2) {
            throw e2;
        }
    }
}
