package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

public final class zzcyb<T> {

    /* renamed from: a */
    private final Deque<zzbbh<T>> f21195a = new LinkedBlockingDeque();

    /* renamed from: b */
    private final Callable<T> f21196b;

    /* renamed from: c */
    private final zzbbl f21197c;

    public zzcyb(Callable<T> callable, zzbbl zzbbl) {
        this.f21196b = callable;
        this.f21197c = zzbbl;
    }

    /* renamed from: a */
    public final synchronized void mo28836a(int i) {
        int size = i - this.f21195a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f21195a.add(this.f21197c.mo27892a(this.f21196b));
        }
    }

    /* renamed from: a */
    public final synchronized zzbbh<T> mo28835a() {
        mo28836a(1);
        return this.f21195a.poll();
    }

    /* renamed from: a */
    public final synchronized void mo28837a(zzbbh<T> zzbbh) {
        this.f21195a.addFirst(zzbbh);
    }
}
