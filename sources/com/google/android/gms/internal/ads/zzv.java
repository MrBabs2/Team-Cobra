package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzv {

    /* renamed from: a */
    private final AtomicInteger f22821a;

    /* renamed from: b */
    private final Set<zzr<?>> f22822b;

    /* renamed from: c */
    private final PriorityBlockingQueue<zzr<?>> f22823c;

    /* renamed from: d */
    private final PriorityBlockingQueue<zzr<?>> f22824d;

    /* renamed from: e */
    private final zzb f22825e;

    /* renamed from: f */
    private final zzm f22826f;

    /* renamed from: g */
    private final zzab f22827g;

    /* renamed from: h */
    private final zzn[] f22828h;

    /* renamed from: i */
    private zzd f22829i;

    /* renamed from: j */
    private final List<zzx> f22830j;

    /* renamed from: k */
    private final List<zzw> f22831k;

    private zzv(zzb zzb, zzm zzm, int i, zzab zzab) {
        this.f22821a = new AtomicInteger();
        this.f22822b = new HashSet();
        this.f22823c = new PriorityBlockingQueue<>();
        this.f22824d = new PriorityBlockingQueue<>();
        this.f22830j = new ArrayList();
        this.f22831k = new ArrayList();
        this.f22825e = zzb;
        this.f22826f = zzm;
        this.f22828h = new zzn[4];
        this.f22827g = zzab;
    }

    /* renamed from: a */
    public final void mo29829a() {
        zzd zzd = this.f22829i;
        if (zzd != null) {
            zzd.mo28866a();
        }
        for (zzn zzn : this.f22828h) {
            if (zzn != null) {
                zzn.mo29549a();
            }
        }
        zzd zzd2 = new zzd(this.f22823c, this.f22824d, this.f22825e, this.f22827g);
        this.f22829i = zzd2;
        zzd2.start();
        for (int i = 0; i < this.f22828h.length; i++) {
            zzn zzn2 = new zzn(this.f22824d, this.f22826f, this.f22825e, this.f22827g);
            this.f22828h[i] = zzn2;
            zzn2.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final <T> void mo29831b(zzr<T> zzr) {
        synchronized (this.f22822b) {
            this.f22822b.remove(zzr);
        }
        synchronized (this.f22830j) {
            for (zzx a : this.f22830j) {
                a.mo29888a(zzr);
            }
        }
        mo29830a(zzr, 5);
    }

    /* renamed from: a */
    public final <T> zzr<T> mo29828a(zzr<T> zzr) {
        zzr.mo29648a(this);
        synchronized (this.f22822b) {
            this.f22822b.add(zzr);
        }
        zzr.mo29654b(this.f22821a.incrementAndGet());
        zzr.mo29653a("add-to-queue");
        mo29830a(zzr, 0);
        if (!zzr.mo29663q()) {
            this.f22824d.add(zzr);
            return zzr;
        }
        this.f22823c.add(zzr);
        return zzr;
    }

    private zzv(zzb zzb, zzm zzm, int i) {
        this(zzb, zzm, 4, new zzi(new Handler(Looper.getMainLooper())));
    }

    public zzv(zzb zzb, zzm zzm) {
        this(zzb, zzm, 4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29830a(zzr<?> zzr, int i) {
        synchronized (this.f22831k) {
            for (zzw a : this.f22831k) {
                a.mo29856a(zzr, i);
            }
        }
    }
}
