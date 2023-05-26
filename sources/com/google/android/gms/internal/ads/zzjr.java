package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzjr implements zzjl {

    /* renamed from: a */
    private final int f22112a = 262144;

    /* renamed from: b */
    private int f22113b;

    /* renamed from: c */
    private int f22114c;

    /* renamed from: d */
    private zzjk[] f22115d = new zzjk[100];

    public zzjr(int i) {
        zzkh.m24657a(true);
    }

    /* renamed from: c */
    private final synchronized int m24626c() {
        return this.f22113b * this.f22112a;
    }

    /* renamed from: a */
    public final synchronized void mo29402a(zzjk zzjk) {
        zzkh.m24657a(zzjk.f22097a.length == this.f22112a);
        this.f22113b--;
        if (this.f22114c == this.f22115d.length) {
            this.f22115d = (zzjk[]) Arrays.copyOf(this.f22115d, this.f22115d.length << 1);
        }
        zzjk[] zzjkArr = this.f22115d;
        int i = this.f22114c;
        this.f22114c = i + 1;
        zzjkArr[i] = zzjk;
        notifyAll();
    }

    /* renamed from: b */
    public final synchronized zzjk mo29403b() {
        this.f22113b++;
        if (this.f22114c > 0) {
            zzjk[] zzjkArr = this.f22115d;
            int i = this.f22114c - 1;
            this.f22114c = i;
            return zzjkArr[i];
        }
        return new zzjk(new byte[this.f22112a], 0);
    }

    /* renamed from: b */
    public final synchronized void mo29406b(int i) {
        int max = Math.max(0, zzkq.m24685a(0, this.f22112a) - this.f22113b);
        if (max < this.f22114c) {
            Arrays.fill(this.f22115d, max, this.f22114c, (Object) null);
            this.f22114c = max;
        }
    }

    /* renamed from: a */
    public final int mo29401a() {
        return this.f22112a;
    }

    /* renamed from: a */
    public final synchronized void mo29405a(int i) throws InterruptedException {
        while (m24626c() > i) {
            wait();
        }
    }
}
