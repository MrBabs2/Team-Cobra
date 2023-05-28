package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;

@zzard
public final class zzabb {

    /* renamed from: a */
    private final zzamo f17713a;

    /* renamed from: b */
    private final AtomicBoolean f17714b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final VideoController f17715c;
    @VisibleForTesting

    /* renamed from: d */
    private final zzyv f17716d;

    /* renamed from: e */
    private zzxr f17717e;

    /* renamed from: f */
    private AdListener f17718f;

    /* renamed from: g */
    private AdSize[] f17719g;

    /* renamed from: h */
    private AppEventListener f17720h;

    /* renamed from: i */
    private Correlator f17721i;

    /* renamed from: j */
    private zzzk f17722j;

    /* renamed from: k */
    private OnCustomRenderedAdLoadedListener f17723k;

    /* renamed from: l */
    private VideoOptions f17724l;

    /* renamed from: m */
    private String f17725m;

    /* renamed from: n */
    private ViewGroup f17726n;

    /* renamed from: o */
    private int f17727o;

    /* renamed from: p */
    private boolean f17728p;

    public zzabb(ViewGroup viewGroup) {
        this(viewGroup, (AttributeSet) null, false, zzyc.f23015a, 0);
    }

    /* renamed from: a */
    private static boolean m18803a(int i) {
        return i == 1;
    }

    /* renamed from: a */
    public final void mo26990a() {
        try {
            if (this.f17722j != null) {
                this.f17722j.destroy();
            }
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: b */
    public final AdListener mo27002b() {
        return this.f17718f;
    }

    /* renamed from: c */
    public final AdSize mo27004c() {
        zzyd V0;
        try {
            if (!(this.f17722j == null || (V0 = this.f17722j.mo27069V0()) == null)) {
                return zzb.zza(V0.f23020j, V0.f23017g, V0.f23016f);
            }
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
        AdSize[] adSizeArr = this.f17719g;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    /* renamed from: d */
    public final AdSize[] mo27005d() {
        return this.f17719g;
    }

    /* renamed from: e */
    public final String mo27006e() {
        zzzk zzzk;
        if (this.f17725m == null && (zzzk = this.f17722j) != null) {
            try {
                this.f17725m = zzzk.mo27083d1();
            } catch (RemoteException e) {
                zzbad.m20524d("#007 Could not call remote method.", e);
            }
        }
        return this.f17725m;
    }

    /* renamed from: f */
    public final AppEventListener mo27007f() {
        return this.f17720h;
    }

    /* renamed from: g */
    public final String mo27008g() {
        try {
            if (this.f17722j != null) {
                return this.f17722j.mo27097v();
            }
            return null;
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
            return null;
        }
    }

    /* renamed from: h */
    public final OnCustomRenderedAdLoadedListener mo27009h() {
        return this.f17723k;
    }

    /* renamed from: i */
    public final VideoController mo27010i() {
        return this.f17715c;
    }

    /* renamed from: j */
    public final VideoOptions mo27011j() {
        return this.f17724l;
    }

    /* renamed from: k */
    public final boolean mo27012k() {
        try {
            if (this.f17722j != null) {
                return this.f17722j.mo27099y();
            }
            return false;
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
            return false;
        }
    }

    /* renamed from: l */
    public final void mo27013l() {
        try {
            if (this.f17722j != null) {
                this.f17722j.pause();
            }
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: m */
    public final void mo27014m() {
        if (!this.f17714b.getAndSet(true)) {
            try {
                if (this.f17722j != null) {
                    this.f17722j.mo27086g1();
                }
            } catch (RemoteException e) {
                zzbad.m20524d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: n */
    public final void mo27015n() {
        try {
            if (this.f17722j != null) {
                this.f17722j.resume();
            }
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: o */
    public final zzaar mo27016o() {
        zzzk zzzk = this.f17722j;
        if (zzzk == null) {
            return null;
        }
        try {
            return zzzk.getVideoController();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo27003b(AdSize... adSizeArr) {
        this.f17719g = adSizeArr;
        try {
            if (this.f17722j != null) {
                this.f17722j.mo27076a(m18802a(this.f17726n.getContext(), this.f17719g, this.f17727o));
            }
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
        this.f17726n.requestLayout();
    }

    public zzabb(ViewGroup viewGroup, int i) {
        this(viewGroup, (AttributeSet) null, false, zzyc.f23015a, i);
    }

    /* renamed from: a */
    public final void mo26996a(zzaaz zzaaz) {
        zzzk zzzk;
        try {
            if (this.f17722j == null) {
                if ((this.f17719g == null || this.f17725m == null) && this.f17722j == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.f17726n.getContext();
                zzyd a = m18802a(context, this.f17719g, this.f17727o);
                if ("search_v2".equals(a.f23016f)) {
                    zzzk = (zzzk) new b60(zzyt.m25667b(), context, a, this.f17725m).mo26124a(context, false);
                } else {
                    zzzk = (zzzk) new z50(zzyt.m25667b(), context, a, this.f17725m, this.f17713a).mo26124a(context, false);
                }
                this.f17722j = zzzk;
                zzzk.mo27078a((zzyz) new zzxv(this.f17716d));
                if (this.f17717e != null) {
                    this.f17722j.mo27077a((zzyw) new zzxs(this.f17717e));
                }
                if (this.f17720h != null) {
                    this.f17722j.mo27080a((zzzs) new zzyf(this.f17720h));
                }
                if (this.f17723k != null) {
                    this.f17722j.mo27072a((zzado) new zzadr(this.f17723k));
                }
                if (this.f17721i != null) {
                    this.f17722j.mo27081a((zzzy) this.f17721i.zzdf());
                }
                if (this.f17724l != null) {
                    this.f17722j.mo27071a(new zzacd(this.f17724l));
                }
                this.f17722j.mo27085f(this.f17728p);
                try {
                    IObjectWrapper I = this.f17722j.mo27066I();
                    if (I != null) {
                        this.f17726n.addView((View) ObjectWrapper.m16390H(I));
                    }
                } catch (RemoteException e) {
                    zzbad.m20524d("#007 Could not call remote method.", e);
                }
            }
            if (this.f17722j.mo27082b(zzyc.m25642a(this.f17726n.getContext(), zzaaz))) {
                this.f17713a.mo27398b(zzaaz.mo26963m());
            }
        } catch (RemoteException e2) {
            zzbad.m20524d("#007 Could not call remote method.", e2);
        }
    }

    public zzabb(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, zzyc.f23015a, 0);
    }

    public zzabb(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, false, zzyc.f23015a, i);
    }

    @VisibleForTesting
    private zzabb(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzyc zzyc, zzzk zzzk, int i) {
        this.f17713a = new zzamo();
        this.f17715c = new VideoController();
        this.f17716d = new C7267a(this);
        this.f17726n = viewGroup;
        this.f17722j = null;
        this.f17714b = new AtomicBoolean(false);
        this.f17727o = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzyg zzyg = new zzyg(context, attributeSet);
                this.f17719g = zzyg.mo29915a(z);
                this.f17725m = zzyg.mo29914a();
                if (viewGroup.isInEditMode()) {
                    zzazt a = zzyt.m25666a();
                    AdSize adSize = this.f17719g[0];
                    int i2 = this.f17727o;
                    zzyd zzyd = new zzyd(context, adSize);
                    zzyd.f23025o = m18803a(i2);
                    a.mo27880a(viewGroup, zzyd, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                zzyt.m25666a().mo27881a(viewGroup, new zzyd(context, AdSize.BANNER), e.getMessage(), e.getMessage());
            }
        }
    }

    @VisibleForTesting
    private zzabb(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzyc zzyc, int i) {
        this(viewGroup, attributeSet, z, zzyc, (zzzk) null, i);
    }

    /* renamed from: a */
    public final void mo26991a(AdListener adListener) {
        this.f17718f = adListener;
        this.f17716d.mo29922a(adListener);
    }

    /* renamed from: a */
    public final void mo26997a(zzxr zzxr) {
        try {
            this.f17717e = zzxr;
            if (this.f17722j != null) {
                this.f17722j.mo27077a((zzyw) zzxr != null ? new zzxs(zzxr) : null);
            }
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo27000a(AdSize... adSizeArr) {
        if (this.f17719g == null) {
            mo27003b(adSizeArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    /* renamed from: a */
    public final void mo26998a(String str) {
        if (this.f17725m == null) {
            this.f17725m = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    /* renamed from: a */
    public final void mo26994a(AppEventListener appEventListener) {
        try {
            this.f17720h = appEventListener;
            if (this.f17722j != null) {
                this.f17722j.mo27080a((zzzs) appEventListener != null ? new zzyf(appEventListener) : null);
            }
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo26995a(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.f17723k = onCustomRenderedAdLoadedListener;
        try {
            if (this.f17722j != null) {
                this.f17722j.mo27072a((zzado) onCustomRenderedAdLoadedListener != null ? new zzadr(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo26999a(boolean z) {
        this.f17728p = z;
        try {
            if (this.f17722j != null) {
                this.f17722j.mo27085f(z);
            }
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo26992a(Correlator correlator) {
        zzyu zzyu;
        this.f17721i = correlator;
        try {
            if (this.f17722j != null) {
                zzzk zzzk = this.f17722j;
                if (correlator == null) {
                    zzyu = null;
                } else {
                    zzyu = correlator.zzdf();
                }
                zzzk.mo27081a((zzzy) zzyu);
            }
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo26993a(VideoOptions videoOptions) {
        zzacd zzacd;
        this.f17724l = videoOptions;
        try {
            if (this.f17722j != null) {
                zzzk zzzk = this.f17722j;
                if (videoOptions == null) {
                    zzacd = null;
                } else {
                    zzacd = new zzacd(videoOptions);
                }
                zzzk.mo27071a(zzacd);
            }
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final boolean mo27001a(zzzk zzzk) {
        if (zzzk == null) {
            return false;
        }
        try {
            IObjectWrapper I = zzzk.mo27066I();
            if (I == null || ((View) ObjectWrapper.m16390H(I)).getParent() != null) {
                return false;
            }
            this.f17726n.addView((View) ObjectWrapper.m16390H(I));
            this.f17722j = zzzk;
            return true;
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
            return false;
        }
    }

    /* renamed from: a */
    private static zzyd m18802a(Context context, AdSize[] adSizeArr, int i) {
        zzyd zzyd = new zzyd(context, adSizeArr);
        zzyd.f23025o = m18803a(i);
        return zzyd;
    }
}
