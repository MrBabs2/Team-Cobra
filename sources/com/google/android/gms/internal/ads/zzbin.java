package com.google.android.gms.internal.ads;

@zzard
public final class zzbin {

    /* renamed from: a */
    private final int f19019a;

    /* renamed from: b */
    public final int f19020b;

    /* renamed from: c */
    public final int f19021c;

    private zzbin(int i, int i2, int i3) {
        this.f19019a = i;
        this.f19021c = i2;
        this.f19020b = i3;
    }

    /* renamed from: a */
    public static zzbin m21123a(zzyd zzyd) {
        if (zzyd.f23019i) {
            return new zzbin(3, 0, 0);
        }
        if (zzyd.f23024n) {
            return new zzbin(2, 0, 0);
        }
        if (zzyd.f23023m) {
            return m21124f();
        }
        return m21122a(zzyd.f23021k, zzyd.f23018h);
    }

    /* renamed from: f */
    public static zzbin m21124f() {
        return new zzbin(0, 0, 0);
    }

    /* renamed from: g */
    public static zzbin m21125g() {
        return new zzbin(4, 0, 0);
    }

    /* renamed from: h */
    public static zzbin m21126h() {
        return new zzbin(5, 0, 0);
    }

    /* renamed from: b */
    public final boolean mo28181b() {
        return this.f19019a == 3;
    }

    /* renamed from: c */
    public final boolean mo28182c() {
        return this.f19019a == 0;
    }

    /* renamed from: d */
    public final boolean mo28183d() {
        return this.f19019a == 4;
    }

    /* renamed from: e */
    public final boolean mo28184e() {
        return this.f19019a == 5;
    }

    /* renamed from: a */
    public static zzbin m21122a(int i, int i2) {
        return new zzbin(1, i, i2);
    }

    /* renamed from: a */
    public final boolean mo28180a() {
        return this.f19019a == 2;
    }
}
