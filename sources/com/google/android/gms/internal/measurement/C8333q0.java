package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.q0 */
final class C8333q0 extends zztq {

    /* renamed from: a */
    private int f23327a;

    /* renamed from: b */
    private int f23328b;

    /* renamed from: c */
    private int f23329c;

    /* renamed from: d */
    private int f23330d;

    /* renamed from: e */
    private int f23331e;

    private C8333q0(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f23331e = Integer.MAX_VALUE;
        this.f23327a = i2 + i;
        this.f23329c = i;
        this.f23330d = i;
    }

    /* renamed from: b */
    private final void m26116b() {
        int i = this.f23327a + this.f23328b;
        this.f23327a = i;
        int i2 = i - this.f23330d;
        int i3 = this.f23331e;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f23328b = i4;
            this.f23327a = i - i4;
            return;
        }
        this.f23328b = 0;
    }

    /* renamed from: a */
    public final int mo30230a(int i) throws zzuv {
        if (i >= 0) {
            int a = i + mo30229a();
            int i2 = this.f23331e;
            if (a <= i2) {
                this.f23331e = a;
                m26116b();
                return i2;
            }
            throw zzuv.m26687a();
        }
        throw zzuv.m26688b();
    }

    /* renamed from: a */
    public final int mo30229a() {
        return this.f23329c - this.f23330d;
    }
}
