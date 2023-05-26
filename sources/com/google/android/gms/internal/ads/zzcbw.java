package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

public final class zzcbw extends zzajb implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzadv {

    /* renamed from: f */
    private View f19914f;

    /* renamed from: g */
    private zzaar f19915g;

    /* renamed from: h */
    private zzbyn f19916h;

    /* renamed from: i */
    private boolean f19917i = false;

    /* renamed from: j */
    private boolean f19918j = false;

    public zzcbw(zzbyn zzbyn, zzbyt zzbyt) {
        this.f19914f = zzbyt.mo28550q();
        this.f19915g = zzbyt.mo28546m();
        this.f19916h = zzbyn;
        if (zzbyt.mo28551r() != null) {
            zzbyt.mo28551r().mo25655a((zzadv) this);
        }
    }

    /* renamed from: q1 */
    private final void m22310q1() {
        View view = this.f19914f;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f19914f);
            }
        }
    }

    /* renamed from: r1 */
    private final void m22311r1() {
        View view;
        zzbyn zzbyn = this.f19916h;
        if (zzbyn != null && (view = this.f19914f) != null) {
            zzbyn.mo28498a(view, Collections.emptyMap(), Collections.emptyMap(), zzbyn.m22064c(this.f19914f));
        }
    }

    /* renamed from: R0 */
    public final void mo27202R0() {
        zzaxi.f18651h.post(new C7543hh(this));
    }

    /* renamed from: a */
    public final void mo27329a(IObjectWrapper iObjectWrapper, zzajc zzajc) throws RemoteException {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        if (this.f19917i) {
            zzbad.m20519b("Instream ad is destroyed already.");
            m22309a(zzajc, 2);
        } else if (this.f19914f == null || this.f19915g == null) {
            String str = this.f19914f == null ? "can not get video view." : "can not get video controller.";
            zzbad.m20519b(str.length() != 0 ? "Instream internal error: ".concat(str) : new String("Instream internal error: "));
            m22309a(zzajc, 0);
        } else if (this.f19918j) {
            zzbad.m20519b("Instream ad should not be used again.");
            m22309a(zzajc, 1);
        } else {
            this.f19918j = true;
            m22310q1();
            ((ViewGroup) ObjectWrapper.m16390H(iObjectWrapper)).addView(this.f19914f, new ViewGroup.LayoutParams(-1, -1));
            zzk.zzmd();
            zzbbz.m20571a(this.f19914f, (ViewTreeObserver.OnGlobalLayoutListener) this);
            zzk.zzmd();
            zzbbz.m20572a(this.f19914f, (ViewTreeObserver.OnScrollChangedListener) this);
            m22311r1();
            try {
                zzajc.mo27333o1();
            } catch (RemoteException e) {
                zzbad.m20524d("#007 Could not call remote method.", e);
            }
        }
    }

    public final void destroy() throws RemoteException {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        m22310q1();
        zzbyn zzbyn = this.f19916h;
        if (zzbyn != null) {
            zzbyn.mo28384a();
        }
        this.f19916h = null;
        this.f19914f = null;
        this.f19915g = null;
        this.f19917i = true;
    }

    public final zzaar getVideoController() throws RemoteException {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        if (!this.f19917i) {
            return this.f19915g;
        }
        zzbad.m20519b("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    public final void onGlobalLayout() {
        m22311r1();
    }

    public final void onScrollChanged() {
        m22311r1();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p1 */
    public final /* synthetic */ void mo28639p1() {
        try {
            destroy();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    private static void m22309a(zzajc zzajc, int i) {
        try {
            zzajc.mo27332h(i);
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }
}
