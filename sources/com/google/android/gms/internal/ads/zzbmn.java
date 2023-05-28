package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class zzbmn implements zzo, zzbrw, zzbrx, zzue {

    /* renamed from: f */
    private final zzbmg f19178f;

    /* renamed from: g */
    private final zzbml f19179g;

    /* renamed from: h */
    private final Set<zzbgz> f19180h = new HashSet();

    /* renamed from: i */
    private final zzamd<JSONObject, JSONObject> f19181i;

    /* renamed from: j */
    private final Executor f19182j;

    /* renamed from: k */
    private final Clock f19183k;

    /* renamed from: l */
    private final AtomicBoolean f19184l = new AtomicBoolean(false);

    /* renamed from: m */
    private final zzbmp f19185m = new zzbmp();

    /* renamed from: n */
    private boolean f19186n = false;

    /* renamed from: o */
    private WeakReference<Object> f19187o = new WeakReference<>(this);

    public zzbmn(zzaly zzaly, zzbml zzbml, Executor executor, zzbmg zzbmg, Clock clock) {
        this.f19178f = zzbmg;
        zzaln<JSONObject> zzaln = zzalo.f18180b;
        this.f19181i = zzaly.mo27375a("google.afma.activeView.handleUpdate", zzaln, zzaln);
        this.f19179g = zzbml;
        this.f19182j = executor;
        this.f19183k = clock;
    }

    /* renamed from: o */
    private final void m21363o() {
        for (zzbgz b : this.f19180h) {
            this.f19178f.mo28269b(b);
        }
        this.f19178f.mo28266a();
    }

    /* renamed from: a */
    public final synchronized void mo28271a(zzbgz zzbgz) {
        this.f19180h.add(zzbgz);
        this.f19178f.mo28267a(zzbgz);
    }

    /* renamed from: b */
    public final synchronized void mo26820b(Context context) {
        this.f19185m.f19189b = false;
        mo28273j();
    }

    /* renamed from: d */
    public final synchronized void mo26821d(Context context) {
        this.f19185m.f19189b = true;
        mo28273j();
    }

    /* renamed from: j */
    public final synchronized void mo28273j() {
        if (!(this.f19187o.get() != null)) {
            mo28274n();
        } else if (!this.f19186n && this.f19184l.get()) {
            try {
                this.f19185m.f19190c = this.f19183k.mo25499c();
                JSONObject a = this.f19179g.mo25813a(this.f19185m);
                for (zzbgz vcVar : this.f19180h) {
                    this.f19182j.execute(new C8060vc(vcVar, a));
                }
                zzbao.m20537b(this.f19181i.zzf(a), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e) {
                zzawz.m20168e("Failed to call ActiveViewJS", e);
            }
        }
    }

    /* renamed from: n */
    public final synchronized void mo28274n() {
        m21363o();
        this.f19186n = true;
    }

    public final synchronized void onAdImpression() {
        if (this.f19184l.compareAndSet(false, true)) {
            this.f19178f.mo28268a(this);
            mo28273j();
        }
    }

    public final synchronized void onPause() {
        this.f19185m.f19189b = true;
        mo28273j();
    }

    public final synchronized void onResume() {
        this.f19185m.f19189b = false;
        mo28273j();
    }

    public final void zzsz() {
    }

    public final void zzta() {
    }

    /* renamed from: a */
    public final void mo28272a(Object obj) {
        this.f19187o = new WeakReference<>(obj);
    }

    /* renamed from: a */
    public final synchronized void mo25659a(zzud zzud) {
        this.f19185m.f19188a = zzud.f22775j;
        this.f19185m.f19192e = zzud;
        mo28273j();
    }

    /* renamed from: a */
    public final synchronized void mo26819a(Context context) {
        this.f19185m.f19191d = "u";
        mo28273j();
        m21363o();
        this.f19186n = true;
    }
}
