package com.google.android.gms.internal.ads;

public final class zzcji {

    /* renamed from: a */
    private int f20272a = 0;

    /* renamed from: b */
    private long f20273b = 0;

    /* renamed from: c */
    private long f20274c = 0;

    /* renamed from: d */
    private long f20275d = 0;

    /* renamed from: e */
    private final Object f20276e = new Object();

    /* renamed from: f */
    private final Object f20277f = new Object();

    /* renamed from: g */
    private final Object f20278g = new Object();

    /* renamed from: h */
    private final Object f20279h = new Object();

    /* renamed from: a */
    public final void mo28706a(int i) {
        synchronized (this.f20276e) {
            this.f20272a = i;
        }
    }

    /* renamed from: b */
    public final long mo28708b() {
        long j;
        synchronized (this.f20277f) {
            j = this.f20273b;
        }
        return j;
    }

    /* renamed from: c */
    public final synchronized void mo28711c(long j) {
        synchronized (this.f20278g) {
            this.f20274c = j;
        }
    }

    /* renamed from: d */
    public final synchronized long mo28712d() {
        long j;
        synchronized (this.f20279h) {
            j = this.f20275d;
        }
        return j;
    }

    /* renamed from: a */
    public final int mo28705a() {
        int i;
        synchronized (this.f20276e) {
            i = this.f20272a;
        }
        return i;
    }

    /* renamed from: b */
    public final synchronized void mo28709b(long j) {
        synchronized (this.f20279h) {
            this.f20275d = j;
        }
    }

    /* renamed from: c */
    public final synchronized long mo28710c() {
        long j;
        synchronized (this.f20278g) {
            j = this.f20274c;
        }
        return j;
    }

    /* renamed from: a */
    public final void mo28707a(long j) {
        synchronized (this.f20277f) {
            this.f20273b = j;
        }
    }
}
