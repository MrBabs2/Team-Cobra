package com.google.android.gms.internal.measurement;

import java.io.IOException;

public abstract class zzyi {

    /* renamed from: a */
    protected volatile int f23576a = -1;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo30484a() {
        return 0;
    }

    /* renamed from: a */
    public void mo30485a(zzya zzya) throws IOException {
    }

    /* renamed from: b */
    public final int mo30497b() {
        int a = mo30484a();
        this.f23576a = a;
        return a;
    }

    /* renamed from: c */
    public zzyi clone() throws CloneNotSupportedException {
        return (zzyi) super.clone();
    }

    /* renamed from: d */
    public final int mo30498d() {
        if (this.f23576a < 0) {
            mo30497b();
        }
        return this.f23576a;
    }

    public String toString() {
        return zzyj.m26760a(this);
    }
}
