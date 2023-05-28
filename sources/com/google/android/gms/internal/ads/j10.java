package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

final class j10 implements zzlx {

    /* renamed from: b */
    private int f15700b = -1;

    /* renamed from: c */
    private int f15701c = -1;

    /* renamed from: d */
    private int f15702d = 0;

    /* renamed from: e */
    private ByteBuffer f15703e;

    /* renamed from: f */
    private ByteBuffer f15704f;

    /* renamed from: g */
    private boolean f15705g;

    public j10() {
        ByteBuffer byteBuffer = zzlx.f22232a;
        this.f15703e = byteBuffer;
        this.f15704f = byteBuffer;
    }

    /* renamed from: a */
    public final boolean mo25942a(int i, int i2, int i3) throws zzly {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new zzly(i, i2, i3);
        } else if (this.f15700b == i && this.f15701c == i2 && this.f15702d == i3) {
            return false;
        } else {
            this.f15700b = i;
            this.f15701c = i2;
            this.f15702d = i3;
            if (i3 != 2) {
                return true;
            }
            this.f15703e = zzlx.f22232a;
            return true;
        }
    }

    /* renamed from: b */
    public final boolean mo25943b() {
        int i = this.f15702d;
        return (i == 0 || i == 2) ? false : true;
    }

    /* renamed from: c */
    public final void mo25944c() {
        this.f15705g = true;
    }

    /* renamed from: d */
    public final ByteBuffer mo25945d() {
        ByteBuffer byteBuffer = this.f15704f;
        this.f15704f = zzlx.f22232a;
        return byteBuffer;
    }

    /* renamed from: e */
    public final int mo25946e() {
        return this.f15701c;
    }

    /* renamed from: f */
    public final int mo25947f() {
        return 2;
    }

    public final void flush() {
        this.f15704f = zzlx.f22232a;
        this.f15705g = false;
    }

    /* renamed from: n */
    public final boolean mo25949n() {
        return this.f15705g && this.f15704f == zzlx.f22232a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081 A[LOOP:2: B:23:0x0081->B:24:0x0083, LOOP_START, PHI: r0 
      PHI: (r0v2 int) = (r0v0 int), (r0v3 int) binds: [B:14:0x0041, B:24:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25940a(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.f15702d
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            if (r3 == r5) goto L_0x0020
            if (r3 == r6) goto L_0x0021
            if (r3 != r4) goto L_0x001a
            int r2 = r2 / 2
            goto L_0x0023
        L_0x001a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x0020:
            int r2 = r2 / r6
        L_0x0021:
            int r2 = r2 << 1
        L_0x0023:
            java.nio.ByteBuffer r3 = r7.f15703e
            int r3 = r3.capacity()
            if (r3 >= r2) goto L_0x003a
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.f15703e = r2
            goto L_0x003f
        L_0x003a:
            java.nio.ByteBuffer r2 = r7.f15703e
            r2.clear()
        L_0x003f:
            int r2 = r7.f15702d
            if (r2 == r5) goto L_0x0081
            if (r2 == r6) goto L_0x0068
            if (r2 != r4) goto L_0x0062
        L_0x0047:
            if (r0 >= r1) goto L_0x009c
            java.nio.ByteBuffer r2 = r7.f15703e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f15703e
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L_0x0047
        L_0x0062:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x0068:
            if (r0 >= r1) goto L_0x009c
            java.nio.ByteBuffer r2 = r7.f15703e
            r3 = 0
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f15703e
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + -128
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L_0x0068
        L_0x0081:
            if (r0 >= r1) goto L_0x009c
            java.nio.ByteBuffer r2 = r7.f15703e
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f15703e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L_0x0081
        L_0x009c:
            int r0 = r8.limit()
            r8.position(r0)
            java.nio.ByteBuffer r8 = r7.f15703e
            r8.flip()
            java.nio.ByteBuffer r8 = r7.f15703e
            r7.f15704f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j10.mo25940a(java.nio.ByteBuffer):void");
    }

    /* renamed from: a */
    public final void mo25939a() {
        flush();
        this.f15703e = zzlx.f22232a;
        this.f15700b = -1;
        this.f15701c = -1;
        this.f15702d = 0;
    }
}
