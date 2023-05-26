package com.bumptech.glide.p159m;

import android.util.Log;
import com.bumptech.glide.p162p.C6268d;
import com.bumptech.glide.p166r.C6316k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.m.n */
/* compiled from: RequestTracker */
public class C6248n {

    /* renamed from: a */
    private final Set<C6268d> f11407a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private final List<C6268d> f11408b = new ArrayList();

    /* renamed from: c */
    private boolean f11409c;

    /* renamed from: a */
    public boolean mo20586a(C6268d dVar) {
        return m12703a(dVar, true);
    }

    /* renamed from: b */
    public void mo20588b(C6268d dVar) {
        this.f11407a.add(dVar);
        if (!this.f11409c) {
            dVar.mo20681b();
            return;
        }
        dVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f11408b.add(dVar);
    }

    /* renamed from: c */
    public void mo20589c() {
        for (T t : C6316k.m12993a(this.f11407a)) {
            if (!t.mo20692g() && !t.mo20690f()) {
                t.clear();
                if (!this.f11409c) {
                    t.mo20681b();
                } else {
                    this.f11408b.add(t);
                }
            }
        }
    }

    /* renamed from: d */
    public void mo20590d() {
        this.f11409c = false;
        for (T t : C6316k.m12993a(this.f11407a)) {
            if (!t.mo20692g() && !t.isRunning()) {
                t.mo20681b();
            }
        }
        this.f11408b.clear();
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f11407a.size() + ", isPaused=" + this.f11409c + "}";
    }

    /* renamed from: a */
    private boolean m12703a(C6268d dVar, boolean z) {
        boolean z2 = true;
        if (dVar == null) {
            return true;
        }
        boolean remove = this.f11407a.remove(dVar);
        if (!this.f11408b.remove(dVar) && !remove) {
            z2 = false;
        }
        if (z2) {
            dVar.clear();
            if (z) {
                dVar.mo20678a();
            }
        }
        return z2;
    }

    /* renamed from: a */
    public void mo20585a() {
        for (T a : C6316k.m12993a(this.f11407a)) {
            m12703a(a, false);
        }
        this.f11408b.clear();
    }

    /* renamed from: b */
    public void mo20587b() {
        this.f11409c = true;
        for (T t : C6316k.m12993a(this.f11407a)) {
            if (t.isRunning()) {
                t.clear();
                this.f11408b.add(t);
            }
        }
    }
}
