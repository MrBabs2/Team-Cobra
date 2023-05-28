package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

@zzard
public final class zzaqd {

    /* renamed from: b */
    private static final Object f18306b = new Object();
    @VisibleForTesting

    /* renamed from: c */
    private static boolean f18307c = false;
    @VisibleForTesting

    /* renamed from: d */
    private static boolean f18308d = false;
    @VisibleForTesting

    /* renamed from: a */
    private zzdah f18309a;

    @VisibleForTesting
    /* renamed from: c */
    private final void m19842c(Context context) {
        synchronized (f18306b) {
            if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17980w2)).booleanValue() && !f18308d) {
                try {
                    f18308d = true;
                    this.f18309a = (zzdah) zzbae.m20528a(context, "com.google.android.gms.ads.omid.DynamiteOmid", C7755n3.f16276a);
                } catch (zzbag e) {
                    zzbad.m20524d("#007 Could not call remote method.", e);
                }
            }
        }
    }

    /* renamed from: a */
    public final String mo27562a(Context context) {
        if (!((Boolean) zzyt.m25670e().mo27163a(zzacu.f17980w2)).booleanValue()) {
            return null;
        }
        try {
            m19842c(context);
            String valueOf = String.valueOf(this.f18309a.mo28877E());
            return valueOf.length() != 0 ? "a.".concat(valueOf) : new String("a.");
        } catch (RemoteException | NullPointerException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
            return null;
        }
    }

    /* renamed from: b */
    public final boolean mo27566b(Context context) {
        synchronized (f18306b) {
            if (!((Boolean) zzyt.m25670e().mo27163a(zzacu.f17980w2)).booleanValue()) {
                return false;
            }
            if (f18307c) {
                return true;
            }
            try {
                m19842c(context);
                boolean i = this.f18309a.mo28881i(ObjectWrapper.m16391a(context));
                f18307c = i;
                return i;
            } catch (RemoteException e) {
                e = e;
                zzbad.m20524d("#007 Could not call remote method.", e);
                return false;
            } catch (NullPointerException e2) {
                e = e2;
                zzbad.m20524d("#007 Could not call remote method.", e);
                return false;
            }
        }
    }

    /* renamed from: a */
    public final IObjectWrapper mo27560a(String str, WebView webView, String str2, String str3, String str4) {
        return mo27561a(str, webView, str2, str3, str4, "Google");
    }

    /* renamed from: a */
    public final IObjectWrapper mo27561a(String str, WebView webView, String str2, String str3, String str4, String str5) {
        synchronized (f18306b) {
            try {
                if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17980w2)).booleanValue()) {
                    if (f18307c) {
                        try {
                            return this.f18309a.mo28879a(str, ObjectWrapper.m16391a(webView), str2, str3, str4, str5);
                        } catch (RemoteException | NullPointerException e) {
                            zzbad.m20524d("#007 Could not call remote method.", e);
                            return null;
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void mo27565b(IObjectWrapper iObjectWrapper) {
        synchronized (f18306b) {
            if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17980w2)).booleanValue()) {
                if (f18307c) {
                    try {
                        this.f18309a.mo28878G(iObjectWrapper);
                    } catch (RemoteException | NullPointerException e) {
                        zzbad.m20524d("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo27563a(IObjectWrapper iObjectWrapper) {
        synchronized (f18306b) {
            if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17980w2)).booleanValue()) {
                if (f18307c) {
                    try {
                        this.f18309a.mo28876D(iObjectWrapper);
                    } catch (RemoteException | NullPointerException e) {
                        zzbad.m20524d("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo27564a(IObjectWrapper iObjectWrapper, View view) {
        synchronized (f18306b) {
            if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17980w2)).booleanValue()) {
                if (f18307c) {
                    try {
                        this.f18309a.mo28880a(iObjectWrapper, ObjectWrapper.m16391a(view));
                    } catch (RemoteException | NullPointerException e) {
                        zzbad.m20524d("#007 Could not call remote method.", e);
                    }
                }
            }
        }
    }
}
