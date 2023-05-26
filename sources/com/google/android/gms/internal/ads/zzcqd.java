package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbqy;
import com.google.android.gms.internal.ads.zzbtv;
import java.util.concurrent.Executor;

public final class zzcqd extends zzzl {

    /* renamed from: f */
    private final zzbjm f20786f;

    /* renamed from: g */
    private final Context f20787g;

    /* renamed from: h */
    private final Executor f20788h;

    /* renamed from: i */
    private final zzcpw f20789i = new zzcpw();

    /* renamed from: j */
    private final zzcpy f20790j = new zzcpy();

    /* renamed from: k */
    private final zzcqc f20791k = new zzcqc();

    /* renamed from: l */
    private final zzcxx f20792l;

    /* renamed from: m */
    private zzado f20793m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public zzbvx f20794n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public zzbbh<zzbvx> f20795o;

    /* renamed from: p */
    private boolean f20796p;

    public zzcqd(zzbjm zzbjm, Context context, zzyd zzyd, String str) {
        zzcxx zzcxx = new zzcxx();
        this.f20792l = zzcxx;
        this.f20796p = false;
        this.f20786f = zzbjm;
        zzcxx.mo28823a(zzyd);
        zzcxx.mo28825a(str);
        this.f20788h = zzbjm.mo28224a();
        this.f20787g = context;
    }

    /* renamed from: p1 */
    private final synchronized boolean m22864p1() {
        return this.f20794n != null && !this.f20794n.mo28463f();
    }

    /* renamed from: I */
    public final IObjectWrapper mo27066I() {
        return null;
    }

    /* renamed from: I0 */
    public final zzzs mo27067I0() {
        return this.f20790j.mo28764a();
    }

    /* renamed from: S0 */
    public final zzyz mo27068S0() {
        return this.f20789i.mo28761a();
    }

    /* renamed from: V0 */
    public final zzyd mo27069V0() {
        return null;
    }

    /* renamed from: a */
    public final void mo27070a(zzaax zzaax) {
    }

    /* renamed from: a */
    public final void mo27073a(zzaqn zzaqn) {
    }

    /* renamed from: a */
    public final void mo27074a(zzaqt zzaqt, String str) {
    }

    /* renamed from: a */
    public final void mo27076a(zzyd zzyd) {
    }

    /* renamed from: a */
    public final void mo27077a(zzyw zzyw) {
    }

    /* renamed from: a */
    public final void mo27078a(zzyz zzyz) {
        Preconditions.m16042a("setAdListener must be called on the main UI thread.");
        this.f20789i.mo28762a(zzyz);
    }

    /* renamed from: b */
    public final synchronized boolean mo27082b(zzxz zzxz) {
        Preconditions.m16042a("loadAd must be called on the main UI thread.");
        if (this.f20795o == null) {
            if (!m22864p1()) {
                zzcya.m23108a(this.f20787g, zzxz.f22986k);
                this.f20794n = null;
                zzcxx zzcxx = this.f20792l;
                zzcxx.mo28822a(zzxz);
                zzcxv c = zzcxx.mo28832c();
                zzbtv.zza zza = new zzbtv.zza();
                if (this.f20791k != null) {
                    zza.mo28441a((zzbrl) this.f20791k, this.f20786f.mo28224a());
                    zza.mo28445a((zzbsr) this.f20791k, this.f20786f.mo28224a());
                    zza.mo28442a((zzbro) this.f20791k, this.f20786f.mo28224a());
                }
                zzbwt g = this.f20786f.mo28230g();
                zzbqy.zza zza2 = new zzbqy.zza();
                zza2.mo28402a(this.f20787g);
                zza2.mo28404a(c);
                zzbwt a = g.mo25969a(zza2.mo28406a());
                zza.mo28441a((zzbrl) this.f20789i, this.f20786f.mo28224a());
                zza.mo28445a((zzbsr) this.f20789i, this.f20786f.mo28224a());
                zza.mo28442a((zzbro) this.f20789i, this.f20786f.mo28224a());
                zza.mo28446a((zzxr) this.f20789i, this.f20786f.mo28224a());
                zza.mo28439a((AppEventListener) this.f20790j, this.f20786f.mo28224a());
                zzbws a2 = a.mo25970a(zza.mo28448a()).mo25971a(new zzcow(this.f20793m)).mo25968a();
                zzbbh<zzbvx> b = a2.mo26026b();
                this.f20795o = b;
                zzbar.m20546a(b, new C7365cn(this, a2), this.f20788h);
                return true;
            }
        }
        return false;
    }

    /* renamed from: d1 */
    public final synchronized String mo27083d1() {
        return this.f20792l.mo28831b();
    }

    public final synchronized void destroy() {
        Preconditions.m16042a("destroy must be called on the main UI thread.");
        if (this.f20794n != null) {
            this.f20794n.mo28464g().mo28412d((Context) null);
        }
    }

    /* renamed from: f */
    public final synchronized void mo27085f(boolean z) {
        Preconditions.m16042a("setManualImpressionsEnabled must be called from the main thread.");
        this.f20792l.mo28827a(z);
    }

    /* renamed from: g1 */
    public final void mo27086g1() {
    }

    public final Bundle getAdMetadata() {
        Preconditions.m16042a("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    public final synchronized String getMediationAdapterClassName() {
        if (this.f20794n == null) {
            return null;
        }
        return this.f20794n.mo28385b();
    }

    public final zzaar getVideoController() {
        return null;
    }

    /* renamed from: k */
    public final void mo27090k(String str) {
    }

    /* renamed from: m */
    public final synchronized boolean mo27091m() {
        Preconditions.m16042a("isLoaded must be called on the main UI thread.");
        return m22864p1();
    }

    public final synchronized void pause() {
        Preconditions.m16042a("pause must be called on the main UI thread.");
        if (this.f20794n != null) {
            this.f20794n.mo28464g().mo28409a((Context) null);
        }
    }

    public final synchronized void resume() {
        Preconditions.m16042a("resume must be called on the main UI thread.");
        if (this.f20794n != null) {
            this.f20794n.mo28464g().mo28411b((Context) null);
        }
    }

    public final synchronized void setImmersiveMode(boolean z) {
        Preconditions.m16042a("setImmersiveMode must be called on the main UI thread.");
        this.f20796p = z;
    }

    public final void setUserId(String str) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void showInterstitial() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "showInterstitial must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.m16042a((java.lang.String) r0)     // Catch:{ all -> 0x001d }
            com.google.android.gms.internal.ads.zzbvx r0 = r2.f20794n     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x000c
            monitor-exit(r2)
            return
        L_0x000c:
            com.google.android.gms.internal.ads.zzbvx r0 = r2.f20794n     // Catch:{ all -> 0x001d }
            boolean r0 = r0.mo28465h()     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001b
            com.google.android.gms.internal.ads.zzbvx r0 = r2.f20794n     // Catch:{ all -> 0x001d }
            boolean r1 = r2.f20796p     // Catch:{ all -> 0x001d }
            r0.mo28462a(r1)     // Catch:{ all -> 0x001d }
        L_0x001b:
            monitor-exit(r2)
            return
        L_0x001d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcqd.showInterstitial():void");
    }

    /* renamed from: v */
    public final synchronized String mo27097v() {
        if (this.f20794n == null) {
            return null;
        }
        return this.f20794n.mo28387e();
    }

    /* renamed from: w0 */
    public final void mo27098w0() {
    }

    /* renamed from: y */
    public final synchronized boolean mo27099y() {
        return this.f20795o != null && !this.f20795o.isDone();
    }

    /* renamed from: a */
    public final void mo27080a(zzzs zzzs) {
        Preconditions.m16042a("setAppEventListener must be called on the main UI thread.");
        this.f20790j.mo28765a(zzzs);
    }

    /* renamed from: a */
    public final synchronized void mo27081a(zzzy zzzy) {
        Preconditions.m16042a("setCorrelationIdProvider must be called on the main UI thread");
        this.f20792l.mo28824a(zzzy);
    }

    /* renamed from: a */
    public final synchronized void mo27071a(zzacd zzacd) {
        this.f20792l.mo28819a(zzacd);
    }

    /* renamed from: a */
    public final synchronized void mo27072a(zzado zzado) {
        Preconditions.m16042a("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f20793m = zzado;
    }

    /* renamed from: a */
    public final void mo27079a(zzzp zzzp) {
        Preconditions.m16042a("setAdMetadataListener must be called on the main UI thread.");
    }

    /* renamed from: a */
    public final void mo27075a(zzatb zzatb) {
        this.f20791k.mo28771a(zzatb);
    }
}
