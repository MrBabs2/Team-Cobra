package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public final class zzmx implements zzlx {

    /* renamed from: b */
    private int f22300b = -1;

    /* renamed from: c */
    private int f22301c = -1;

    /* renamed from: d */
    private k10 f22302d;

    /* renamed from: e */
    private float f22303e = 1.0f;

    /* renamed from: f */
    private float f22304f = 1.0f;

    /* renamed from: g */
    private ByteBuffer f22305g;

    /* renamed from: h */
    private ShortBuffer f22306h;

    /* renamed from: i */
    private ByteBuffer f22307i;

    /* renamed from: j */
    private long f22308j;

    /* renamed from: k */
    private long f22309k;

    /* renamed from: l */
    private boolean f22310l;

    public zzmx() {
        ByteBuffer byteBuffer = zzlx.f22232a;
        this.f22305g = byteBuffer;
        this.f22306h = byteBuffer.asShortBuffer();
        this.f22307i = zzlx.f22232a;
    }

    /* renamed from: a */
    public final float mo29536a(float f) {
        float a = zzsy.m25279a(f, 0.1f, 8.0f);
        this.f22303e = a;
        return a;
    }

    /* renamed from: b */
    public final float mo29537b(float f) {
        this.f22304f = zzsy.m25279a(f, 0.1f, 8.0f);
        return f;
    }

    /* renamed from: c */
    public final void mo25944c() {
        this.f22302d.mo26153a();
        this.f22310l = true;
    }

    /* renamed from: d */
    public final ByteBuffer mo25945d() {
        ByteBuffer byteBuffer = this.f22307i;
        this.f22307i = zzlx.f22232a;
        return byteBuffer;
    }

    /* renamed from: e */
    public final int mo25946e() {
        return this.f22300b;
    }

    /* renamed from: f */
    public final int mo25947f() {
        return 2;
    }

    public final void flush() {
        k10 k10 = new k10(this.f22301c, this.f22300b);
        this.f22302d = k10;
        k10.mo26154a(this.f22303e);
        this.f22302d.mo26157b(this.f22304f);
        this.f22307i = zzlx.f22232a;
        this.f22308j = 0;
        this.f22309k = 0;
        this.f22310l = false;
    }

    /* renamed from: g */
    public final long mo29538g() {
        return this.f22308j;
    }

    /* renamed from: h */
    public final long mo29539h() {
        return this.f22309k;
    }

    /* renamed from: n */
    public final boolean mo25949n() {
        if (!this.f22310l) {
            return false;
        }
        k10 k10 = this.f22302d;
        return k10 == null || k10.mo26156b() == 0;
    }

    /* renamed from: a */
    public final boolean mo25942a(int i, int i2, int i3) throws zzly {
        if (i3 != 2) {
            throw new zzly(i, i2, i3);
        } else if (this.f22301c == i && this.f22300b == i2) {
            return false;
        } else {
            this.f22301c = i;
            this.f22300b = i2;
            return true;
        }
    }

    /* renamed from: b */
    public final boolean mo25943b() {
        return Math.abs(this.f22303e - 1.0f) >= 0.01f || Math.abs(this.f22304f - 1.0f) >= 0.01f;
    }

    /* renamed from: a */
    public final void mo25940a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f22308j += (long) remaining;
            this.f22302d.mo26155a(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int b = (this.f22302d.mo26156b() * this.f22300b) << 1;
        if (b > 0) {
            if (this.f22305g.capacity() < b) {
                ByteBuffer order = ByteBuffer.allocateDirect(b).order(ByteOrder.nativeOrder());
                this.f22305g = order;
                this.f22306h = order.asShortBuffer();
            } else {
                this.f22305g.clear();
                this.f22306h.clear();
            }
            this.f22302d.mo26158b(this.f22306h);
            this.f22309k += (long) b;
            this.f22305g.limit(b);
            this.f22307i = this.f22305g;
        }
    }

    /* renamed from: a */
    public final void mo25939a() {
        this.f22302d = null;
        ByteBuffer byteBuffer = zzlx.f22232a;
        this.f22305g = byteBuffer;
        this.f22306h = byteBuffer.asShortBuffer();
        this.f22307i = zzlx.f22232a;
        this.f22300b = -1;
        this.f22301c = -1;
        this.f22308j = 0;
        this.f22309k = 0;
        this.f22310l = false;
    }
}
