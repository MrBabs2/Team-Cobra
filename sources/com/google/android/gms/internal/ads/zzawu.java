package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

@zzard
public final class zzawu implements zzut {

    /* renamed from: a */
    private final Object f18616a = new Object();

    /* renamed from: b */
    private final zzaxb f18617b;

    /* renamed from: c */
    private final zzawt f18618c;
    @VisibleForTesting

    /* renamed from: d */
    private final zzawr f18619d;
    @VisibleForTesting

    /* renamed from: e */
    private final HashSet<zzawj> f18620e = new HashSet<>();
    @VisibleForTesting

    /* renamed from: f */
    private final HashSet<Object> f18621f = new HashSet<>();

    public zzawu(String str, zzaxb zzaxb) {
        this.f18619d = new zzawr(str, zzaxb);
        this.f18617b = zzaxb;
        this.f18618c = new zzawt();
    }

    /* renamed from: a */
    public final void mo27757a(zzawj zzawj) {
        synchronized (this.f18616a) {
            this.f18620e.add(zzawj);
        }
    }

    /* renamed from: b */
    public final void mo27760b() {
        synchronized (this.f18616a) {
            this.f18619d.mo27750b();
        }
    }

    /* renamed from: a */
    public final void mo27759a(HashSet<zzawj> hashSet) {
        synchronized (this.f18616a) {
            this.f18620e.addAll(hashSet);
        }
    }

    /* renamed from: a */
    public final Bundle mo27754a(Context context, zzaws zzaws) {
        HashSet hashSet = new HashSet();
        synchronized (this.f18616a) {
            hashSet.addAll(this.f18620e);
            this.f18620e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.f18619d.mo27747a(context, this.f18618c.mo27753b()));
        Bundle bundle2 = new Bundle();
        Iterator<Object> it = this.f18621f.iterator();
        if (!it.hasNext()) {
            bundle.putBundle("slots", bundle2);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(((zzawj) it2.next()).mo27717a());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            zzaws.mo27751a(hashSet);
            return bundle;
        }
        it.next();
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public final void mo26760a(boolean z) {
        long b = zzk.zzln().mo25498b();
        if (z) {
            if (b - this.f18617b.mo27785h() > ((Long) zzyt.m25670e().mo27163a(zzacu.f17790E0)).longValue()) {
                this.f18619d.f18607d = -1;
                return;
            }
            this.f18619d.f18607d = this.f18617b.mo27783f();
            return;
        }
        this.f18617b.mo27767a(b);
        this.f18617b.mo27773b(this.f18619d.f18607d);
    }

    /* renamed from: a */
    public final void mo27756a() {
        synchronized (this.f18616a) {
            this.f18619d.mo27748a();
        }
    }

    /* renamed from: a */
    public final void mo27758a(zzxz zzxz, long j) {
        synchronized (this.f18616a) {
            this.f18619d.mo27749a(zzxz, j);
        }
    }

    /* renamed from: a */
    public final zzawj mo27755a(Clock clock, String str) {
        return new zzawj(clock, this, this.f18618c.mo27752a(), str);
    }
}
