package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzrz implements zzrt {

    /* renamed from: a */
    private final boolean f22617a;

    /* renamed from: b */
    private final int f22618b;

    /* renamed from: c */
    private final zzrs[] f22619c;

    /* renamed from: d */
    private int f22620d;

    /* renamed from: e */
    private int f22621e;

    /* renamed from: f */
    private int f22622f;

    /* renamed from: g */
    private zzrs[] f22623g;

    public zzrz(boolean z, int i) {
        this(true, 65536, 0);
    }

    /* renamed from: a */
    public final synchronized void mo29705a(int i) {
        boolean z = i < this.f22620d;
        this.f22620d = i;
        if (z) {
            mo29701b();
        }
    }

    /* renamed from: b */
    public final synchronized void mo29701b() {
        int max = Math.max(0, zzsy.m25281a(this.f22620d, this.f22618b) - this.f22621e);
        if (max < this.f22622f) {
            Arrays.fill(this.f22623g, max, this.f22622f, (Object) null);
            this.f22622f = max;
        }
    }

    /* renamed from: c */
    public final synchronized zzrs mo29702c() {
        zzrs zzrs;
        this.f22621e++;
        if (this.f22622f > 0) {
            zzrs[] zzrsArr = this.f22623g;
            int i = this.f22622f - 1;
            this.f22622f = i;
            zzrs = zzrsArr[i];
            this.f22623g[i] = null;
        } else {
            zzrs = new zzrs(new byte[this.f22618b], 0);
        }
        return zzrs;
    }

    /* renamed from: d */
    public final synchronized void mo29706d() {
        if (this.f22617a) {
            mo29705a(0);
        }
    }

    /* renamed from: e */
    public final synchronized int mo29707e() {
        return this.f22621e * this.f22618b;
    }

    private zzrz(boolean z, int i, int i2) {
        zzsk.m25216a(true);
        zzsk.m25216a(true);
        this.f22617a = true;
        this.f22618b = 65536;
        this.f22622f = 0;
        this.f22623g = new zzrs[100];
        this.f22619c = new zzrs[1];
    }

    /* renamed from: a */
    public final synchronized void mo29699a(zzrs zzrs) {
        this.f22619c[0] = zzrs;
        mo29700a(this.f22619c);
    }

    /* renamed from: a */
    public final synchronized void mo29700a(zzrs[] zzrsArr) {
        boolean z;
        if (this.f22622f + zzrsArr.length >= this.f22623g.length) {
            this.f22623g = (zzrs[]) Arrays.copyOf(this.f22623g, Math.max(this.f22623g.length << 1, this.f22622f + zzrsArr.length));
        }
        for (zzrs zzrs : zzrsArr) {
            if (zzrs.f22604a != null) {
                if (zzrs.f22604a.length != this.f22618b) {
                    z = false;
                    zzsk.m25216a(z);
                    zzrs[] zzrsArr2 = this.f22623g;
                    int i = this.f22622f;
                    this.f22622f = i + 1;
                    zzrsArr2[i] = zzrs;
                }
            }
            z = true;
            zzsk.m25216a(z);
            zzrs[] zzrsArr22 = this.f22623g;
            int i2 = this.f22622f;
            this.f22622f = i2 + 1;
            zzrsArr22[i2] = zzrs;
        }
        this.f22621e -= zzrsArr.length;
        notifyAll();
    }

    /* renamed from: a */
    public final int mo29698a() {
        return this.f22618b;
    }
}
