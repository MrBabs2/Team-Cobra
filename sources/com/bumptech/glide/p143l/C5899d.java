package com.bumptech.glide.p143l;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.bumptech.glide.l.d */
/* compiled from: GifHeaderParser */
public class C5899d {

    /* renamed from: a */
    private final byte[] f10745a = new byte[256];

    /* renamed from: b */
    private ByteBuffer f10746b;

    /* renamed from: c */
    private C5898c f10747c;

    /* renamed from: d */
    private int f10748d = 0;

    /* renamed from: c */
    private boolean m11634c() {
        return this.f10747c.f10733b != 0;
    }

    /* renamed from: d */
    private int m11635d() {
        try {
            return this.f10746b.get() & 255;
        } catch (Exception unused) {
            this.f10747c.f10733b = 1;
            return 0;
        }
    }

    /* renamed from: e */
    private void m11636e() {
        this.f10747c.f10735d.f10721a = m11643l();
        this.f10747c.f10735d.f10722b = m11643l();
        this.f10747c.f10735d.f10723c = m11643l();
        this.f10747c.f10735d.f10724d = m11643l();
        int d = m11635d();
        boolean z = false;
        boolean z2 = (d & 128) != 0;
        int pow = (int) Math.pow(2.0d, (double) ((d & 7) + 1));
        C5897b bVar = this.f10747c.f10735d;
        if ((d & 64) != 0) {
            z = true;
        }
        bVar.f10725e = z;
        if (z2) {
            this.f10747c.f10735d.f10731k = m11632a(pow);
        } else {
            this.f10747c.f10735d.f10731k = null;
        }
        this.f10747c.f10735d.f10730j = this.f10746b.position();
        m11646o();
        if (!m11634c()) {
            C5898c cVar = this.f10747c;
            cVar.f10734c++;
            cVar.f10736e.add(cVar.f10735d);
        }
    }

    /* renamed from: f */
    private void m11637f() {
        int d = m11635d();
        this.f10748d = d;
        if (d > 0) {
            int i = 0;
            int i2 = 0;
            while (i < this.f10748d) {
                try {
                    i2 = this.f10748d - i;
                    this.f10746b.get(this.f10745a, i, i2);
                    i += i2;
                } catch (Exception e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.f10748d, e);
                    }
                    this.f10747c.f10733b = 1;
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    private void m11638g() {
        m11633b(Integer.MAX_VALUE);
    }

    /* renamed from: h */
    private void m11639h() {
        m11635d();
        int d = m11635d();
        C5897b bVar = this.f10747c.f10735d;
        int i = (d & 28) >> 2;
        bVar.f10727g = i;
        boolean z = true;
        if (i == 0) {
            bVar.f10727g = 1;
        }
        C5897b bVar2 = this.f10747c.f10735d;
        if ((d & 1) == 0) {
            z = false;
        }
        bVar2.f10726f = z;
        int l = m11643l();
        if (l < 2) {
            l = 10;
        }
        C5897b bVar3 = this.f10747c.f10735d;
        bVar3.f10729i = l * 10;
        bVar3.f10728h = m11635d();
        m11635d();
    }

    /* renamed from: i */
    private void m11640i() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m11635d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f10747c.f10733b = 1;
            return;
        }
        m11641j();
        if (this.f10747c.f10739h && !m11634c()) {
            C5898c cVar = this.f10747c;
            cVar.f10732a = m11632a(cVar.f10740i);
            C5898c cVar2 = this.f10747c;
            cVar2.f10743l = cVar2.f10732a[cVar2.f10741j];
        }
    }

    /* renamed from: j */
    private void m11641j() {
        this.f10747c.f10737f = m11643l();
        this.f10747c.f10738g = m11643l();
        int d = m11635d();
        this.f10747c.f10739h = (d & 128) != 0;
        this.f10747c.f10740i = (int) Math.pow(2.0d, (double) ((d & 7) + 1));
        this.f10747c.f10741j = m11635d();
        this.f10747c.f10742k = m11635d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11642k() {
        /*
            r3 = this;
        L_0x0000:
            r3.m11637f()
            byte[] r0 = r3.f10745a
            r1 = 0
            byte r1 = r0[r1]
            r2 = 1
            if (r1 != r2) goto L_0x001b
            byte r1 = r0[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 2
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            com.bumptech.glide.l.c r2 = r3.f10747c
            int r0 = r0 << 8
            r0 = r0 | r1
            r2.f10744m = r0
        L_0x001b:
            int r0 = r3.f10748d
            if (r0 <= 0) goto L_0x0025
            boolean r0 = r3.m11634c()
            if (r0 == 0) goto L_0x0000
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p143l.C5899d.m11642k():void");
    }

    /* renamed from: l */
    private int m11643l() {
        return this.f10746b.getShort();
    }

    /* renamed from: m */
    private void m11644m() {
        this.f10746b = null;
        Arrays.fill(this.f10745a, (byte) 0);
        this.f10747c = new C5898c();
        this.f10748d = 0;
    }

    /* renamed from: n */
    private void m11645n() {
        int d;
        do {
            d = m11635d();
            this.f10746b.position(Math.min(this.f10746b.position() + d, this.f10746b.limit()));
        } while (d > 0);
    }

    /* renamed from: o */
    private void m11646o() {
        m11635d();
        m11645n();
    }

    /* renamed from: a */
    public C5899d mo20059a(ByteBuffer byteBuffer) {
        m11644m();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f10746b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f10746b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    /* renamed from: b */
    public C5898c mo20061b() {
        if (this.f10746b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (m11634c()) {
            return this.f10747c;
        } else {
            m11640i();
            if (!m11634c()) {
                m11638g();
                C5898c cVar = this.f10747c;
                if (cVar.f10734c < 0) {
                    cVar.f10733b = 1;
                }
            }
            return this.f10747c;
        }
    }

    /* renamed from: a */
    public void mo20060a() {
        this.f10746b = null;
        this.f10747c = null;
    }

    /* renamed from: a */
    private int[] m11632a(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.f10746b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.f10747c.f10733b = 1;
        }
        return iArr;
    }

    /* renamed from: b */
    private void m11633b(int i) {
        boolean z = false;
        while (!z && !m11634c() && this.f10747c.f10734c <= i) {
            int d = m11635d();
            if (d == 33) {
                int d2 = m11635d();
                if (d2 == 1) {
                    m11645n();
                } else if (d2 == 249) {
                    this.f10747c.f10735d = new C5897b();
                    m11639h();
                } else if (d2 == 254) {
                    m11645n();
                } else if (d2 != 255) {
                    m11645n();
                } else {
                    m11637f();
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < 11; i2++) {
                        sb.append((char) this.f10745a[i2]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m11642k();
                    } else {
                        m11645n();
                    }
                }
            } else if (d == 44) {
                C5898c cVar = this.f10747c;
                if (cVar.f10735d == null) {
                    cVar.f10735d = new C5897b();
                }
                m11636e();
            } else if (d != 59) {
                this.f10747c.f10733b = 1;
            } else {
                z = true;
            }
        }
    }
}
