package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbqy;
import com.google.android.gms.internal.ads.zzbtv;
import java.util.Collections;

@zzard
public final class zzcpt extends zzzl implements zzbtf {

    /* renamed from: f */
    private final zzbjm f20765f;

    /* renamed from: g */
    private final Context f20766g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final ViewGroup f20767h;

    /* renamed from: i */
    private final zzcpw f20768i = new zzcpw();

    /* renamed from: j */
    private final zzcpv f20769j = new zzcpv();

    /* renamed from: k */
    private final zzcpy f20770k = new zzcpy();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final zzbtb f20771l;

    /* renamed from: m */
    private final zzcxx f20772m = new zzcxx();

    /* renamed from: n */
    private zzado f20773n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public zzbnf f20774o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public zzbbh<zzbnf> f20775p;

    public zzcpt(zzbjm zzbjm, Context context, zzyd zzyd, String str) {
        this.f20767h = new FrameLayout(context);
        this.f20765f = zzbjm;
        this.f20766g = context;
        zzcxx zzcxx = this.f20772m;
        zzcxx.mo28823a(zzyd);
        zzcxx.mo28825a(str);
        zzbtb c = zzbjm.mo28226c();
        this.f20771l = c;
        c.mo28428a(this, this.f20765f.mo28224a());
    }

    /* renamed from: a */
    private final synchronized zzboc m22817a(zzcxv zzcxv) {
        zzbod a;
        zzbtv.zza zza;
        zzbod f = this.f20765f.mo28229f();
        zzbqy.zza zza2 = new zzbqy.zza();
        zza2.mo28402a(this.f20766g);
        zza2.mo28404a(zzcxv);
        a = f.mo25781a(zza2.mo28406a());
        zza = new zzbtv.zza();
        zza.mo28446a((zzxr) this.f20768i, this.f20765f.mo28224a());
        zza.mo28446a((zzxr) this.f20769j, this.f20765f.mo28224a());
        zza.mo28441a((zzbrl) this.f20768i, this.f20765f.mo28224a());
        zza.mo28445a((zzbsr) this.f20768i, this.f20765f.mo28224a());
        zza.mo28442a((zzbro) this.f20768i, this.f20765f.mo28224a());
        zza.mo28439a((AppEventListener) this.f20770k, this.f20765f.mo28224a());
        return a.mo25782a(zza.mo28448a()).mo25784a(new zzcow(this.f20773n)).mo25783a(new zzbxk(zzbzc.f19749h, (zzyz) null)).mo25780a(new zzbox(this.f20771l)).mo25779a(new zzbnc(this.f20767h)).mo25778a();
    }

    /* renamed from: I */
    public final IObjectWrapper mo27066I() {
        Preconditions.m16042a("destroy must be called on the main UI thread.");
        return ObjectWrapper.m16391a(this.f20767h);
    }

    /* renamed from: I0 */
    public final zzzs mo27067I0() {
        return this.f20770k.mo28764a();
    }

    /* renamed from: S0 */
    public final zzyz mo27068S0() {
        return this.f20768i.mo28761a();
    }

    /* renamed from: V0 */
    public final synchronized zzyd mo27069V0() {
        Preconditions.m16042a("getAdSize must be called on the main UI thread.");
        if (this.f20774o != null) {
            return zzcxy.m23100a(this.f20766g, Collections.singletonList(this.f20774o.mo26815h()));
        }
        return this.f20772m.mo28834d();
    }

    /* renamed from: Z */
    public final synchronized void mo28425Z() {
        boolean z;
        ViewParent parent = this.f20767h.getParent();
        if (!(parent instanceof View)) {
            z = false;
        } else {
            View view = (View) parent;
            z = zzk.zzlg().mo27802a(view, view.getContext());
        }
        if (z) {
            mo27082b(this.f20772m.mo28828a());
        } else {
            this.f20771l.mo28421b(60);
        }
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
    public final void mo27075a(zzatb zzatb) {
    }

    /* renamed from: b */
    public final synchronized boolean mo27082b(zzxz zzxz) {
        Preconditions.m16042a("loadAd must be called on the main UI thread.");
        if (this.f20775p != null) {
            return false;
        }
        zzcya.m23108a(this.f20766g, zzxz.f22986k);
        zzcxx zzcxx = this.f20772m;
        zzcxx.mo28822a(zzxz);
        zzboc a = m22817a(zzcxx.mo28832c());
        zzbbh<zzbnf> b = a.mo25827b();
        this.f20775p = b;
        zzbar.m20546a(b, new C7291an(this, a), this.f20765f.mo28224a());
        return true;
    }

    /* renamed from: d1 */
    public final synchronized String mo27083d1() {
        return this.f20772m.mo28831b();
    }

    public final synchronized void destroy() {
        Preconditions.m16042a("destroy must be called on the main UI thread.");
        if (this.f20774o != null) {
            this.f20774o.mo28384a();
        }
    }

    /* renamed from: f */
    public final synchronized void mo27085f(boolean z) {
        Preconditions.m16042a("setManualImpressionsEnabled must be called from the main thread.");
        this.f20772m.mo28827a(z);
    }

    /* renamed from: g1 */
    public final synchronized void mo27086g1() {
        Preconditions.m16042a("recordManualImpression must be called on the main UI thread.");
        if (this.f20774o != null) {
            this.f20774o.mo26817j();
        }
    }

    public final Bundle getAdMetadata() {
        Preconditions.m16042a("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    public final synchronized String getMediationAdapterClassName() {
        if (this.f20774o == null) {
            return null;
        }
        return this.f20774o.mo28385b();
    }

    public final synchronized zzaar getVideoController() {
        Preconditions.m16042a("getVideoController must be called from the main thread.");
        if (this.f20774o == null) {
            return null;
        }
        return this.f20774o.mo26813f();
    }

    /* renamed from: k */
    public final void mo27090k(String str) {
    }

    /* renamed from: m */
    public final boolean mo27091m() {
        return false;
    }

    public final synchronized void pause() {
        Preconditions.m16042a("pause must be called on the main UI thread.");
        if (this.f20774o != null) {
            this.f20774o.mo28386d().mo28409a((Context) null);
        }
    }

    public final synchronized void resume() {
        Preconditions.m16042a("resume must be called on the main UI thread.");
        if (this.f20774o != null) {
            this.f20774o.mo28386d().mo28411b((Context) null);
        }
    }

    public final void setImmersiveMode(boolean z) {
    }

    public final void setUserId(String str) {
    }

    public final void showInterstitial() {
    }

    /* renamed from: v */
    public final synchronized String mo27097v() {
        if (this.f20774o == null) {
            return null;
        }
        return this.f20774o.mo28387e();
    }

    /* renamed from: w0 */
    public final void mo27098w0() {
    }

    /* renamed from: y */
    public final synchronized boolean mo27099y() {
        return this.f20775p != null && !this.f20775p.isDone();
    }

    /* renamed from: a */
    public final void mo27078a(zzyz zzyz) {
        Preconditions.m16042a("setAdListener must be called on the main UI thread.");
        this.f20768i.mo28762a(zzyz);
    }

    /* renamed from: a */
    public final void mo27080a(zzzs zzzs) {
        Preconditions.m16042a("setAppEventListener must be called on the main UI thread.");
        this.f20770k.mo28765a(zzzs);
    }

    /* renamed from: a */
    public final synchronized void mo27076a(zzyd zzyd) {
        Preconditions.m16042a("setAdSize must be called on the main UI thread.");
        this.f20772m.mo28823a(zzyd);
        if (this.f20774o != null) {
            this.f20774o.mo26811a(this.f20767h, zzyd);
        }
    }

    /* renamed from: a */
    public final synchronized void mo27081a(zzzy zzzy) {
        Preconditions.m16042a("setCorrelationIdProvider must be called on the main UI thread");
        this.f20772m.mo28824a(zzzy);
    }

    /* renamed from: a */
    public final synchronized void mo27071a(zzacd zzacd) {
        Preconditions.m16042a("setVideoOptions must be called on the main UI thread.");
        this.f20772m.mo28819a(zzacd);
    }

    /* renamed from: a */
    public final void mo27077a(zzyw zzyw) {
        Preconditions.m16042a("setAdListener must be called on the main UI thread.");
        this.f20769j.mo28760a(zzyw);
    }

    /* renamed from: a */
    public final synchronized void mo27072a(zzado zzado) {
        Preconditions.m16042a("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f20773n = zzado;
    }

    /* renamed from: a */
    public final void mo27079a(zzzp zzzp) {
        Preconditions.m16042a("setAdMetadataListener must be called on the main UI thread.");
    }
}
