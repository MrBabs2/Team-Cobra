package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

public final class zzcpm extends zzzl {

    /* renamed from: f */
    private final Context f20742f;

    /* renamed from: g */
    private final zzyz f20743g;

    /* renamed from: h */
    private final zzcxv f20744h;

    /* renamed from: i */
    private final zzbnf f20745i;

    /* renamed from: j */
    private final ViewGroup f20746j;

    public zzcpm(Context context, zzyz zzyz, zzcxv zzcxv, zzbnf zzbnf) {
        this.f20742f = context;
        this.f20743g = zzyz;
        this.f20744h = zzcxv;
        this.f20745i = zzbnf;
        FrameLayout frameLayout = new FrameLayout(this.f20742f);
        frameLayout.removeAllViews();
        frameLayout.addView(this.f20745i.mo26814g(), zzk.zzli().mo27823b());
        frameLayout.setMinimumHeight(mo27069V0().f23018h);
        frameLayout.setMinimumWidth(mo27069V0().f23021k);
        this.f20746j = frameLayout;
    }

    /* renamed from: I */
    public final IObjectWrapper mo27066I() throws RemoteException {
        return ObjectWrapper.m16391a(this.f20746j);
    }

    /* renamed from: I0 */
    public final zzzs mo27067I0() throws RemoteException {
        return this.f20744h.f21177n;
    }

    /* renamed from: S0 */
    public final zzyz mo27068S0() throws RemoteException {
        return this.f20743g;
    }

    /* renamed from: V0 */
    public final zzyd mo27069V0() {
        return zzcxy.m23100a(this.f20742f, Collections.singletonList(this.f20745i.mo26815h()));
    }

    /* renamed from: a */
    public final void mo27070a(zzaax zzaax) throws RemoteException {
    }

    /* renamed from: a */
    public final void mo27071a(zzacd zzacd) throws RemoteException {
        zzbad.m20521c("setVideoOptions is not supported in Publisher AdView returned by AdLoader.");
    }

    /* renamed from: a */
    public final void mo27073a(zzaqn zzaqn) throws RemoteException {
    }

    /* renamed from: a */
    public final void mo27074a(zzaqt zzaqt, String str) throws RemoteException {
    }

    /* renamed from: a */
    public final void mo27075a(zzatb zzatb) throws RemoteException {
    }

    /* renamed from: b */
    public final boolean mo27082b(zzxz zzxz) throws RemoteException {
        zzbad.m20521c("loadAd is not supported for a Publisher AdView returned from AdLoader.");
        return false;
    }

    /* renamed from: d1 */
    public final String mo27083d1() throws RemoteException {
        return this.f20744h.f21169f;
    }

    public final void destroy() throws RemoteException {
        Preconditions.m16042a("destroy must be called on the main UI thread.");
        this.f20745i.mo28384a();
    }

    /* renamed from: f */
    public final void mo27085f(boolean z) throws RemoteException {
        zzbad.m20521c("setManualImpressionsEnabled is not supported in Publisher AdView returned by AdLoader.");
    }

    /* renamed from: g1 */
    public final void mo27086g1() throws RemoteException {
        this.f20745i.mo26817j();
    }

    public final Bundle getAdMetadata() throws RemoteException {
        zzbad.m20521c("getAdMetadata is not supported in Publisher AdView returned by AdLoader.");
        return new Bundle();
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        return this.f20745i.mo28385b();
    }

    public final zzaar getVideoController() throws RemoteException {
        return this.f20745i.mo26813f();
    }

    /* renamed from: k */
    public final void mo27090k(String str) throws RemoteException {
    }

    /* renamed from: m */
    public final boolean mo27091m() throws RemoteException {
        return false;
    }

    public final void pause() throws RemoteException {
        Preconditions.m16042a("destroy must be called on the main UI thread.");
        this.f20745i.mo28386d().mo28409a((Context) null);
    }

    public final void resume() throws RemoteException {
        Preconditions.m16042a("destroy must be called on the main UI thread.");
        this.f20745i.mo28386d().mo28411b((Context) null);
    }

    public final void setImmersiveMode(boolean z) throws RemoteException {
    }

    public final void setUserId(String str) throws RemoteException {
    }

    public final void showInterstitial() throws RemoteException {
    }

    /* renamed from: v */
    public final String mo27097v() throws RemoteException {
        return this.f20745i.mo28387e();
    }

    /* renamed from: w0 */
    public final void mo27098w0() throws RemoteException {
    }

    /* renamed from: y */
    public final boolean mo27099y() throws RemoteException {
        return false;
    }

    /* renamed from: a */
    public final void mo27076a(zzyd zzyd) throws RemoteException {
        zzbnf zzbnf = this.f20745i;
        if (zzbnf != null) {
            zzbnf.mo26811a(this.f20746j, zzyd);
        }
    }

    /* renamed from: a */
    public final void mo27072a(zzado zzado) throws RemoteException {
        zzbad.m20521c("setOnCustomRenderedAdLoadedListener is not supported in Publisher AdView returned by AdLoader.");
    }

    /* renamed from: a */
    public final void mo27077a(zzyw zzyw) throws RemoteException {
        zzbad.m20521c("setAdClickListener is not supported in Publisher AdView returned by AdLoader.");
    }

    /* renamed from: a */
    public final void mo27081a(zzzy zzzy) throws RemoteException {
        zzbad.m20521c("setCorrelationIdProvider is not supported in Publisher AdView returned by AdLoader.");
    }

    /* renamed from: a */
    public final void mo27078a(zzyz zzyz) throws RemoteException {
        zzbad.m20521c("setAdListener is not supported in Publisher AdView returned by AdLoader.");
    }

    /* renamed from: a */
    public final void mo27080a(zzzs zzzs) throws RemoteException {
        zzbad.m20521c("setAppEventListener is not supported in Publisher AdView returned by AdLoader.");
    }

    /* renamed from: a */
    public final void mo27079a(zzzp zzzp) throws RemoteException {
        zzbad.m20521c("setAdMetadataListener is not supported in Publisher AdView returned by AdLoader.");
    }
}
