package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

@zzard
public final class zzami extends zzbjg {

    /* renamed from: g */
    private static final AtomicBoolean f18195g = new AtomicBoolean(false);

    /* renamed from: f */
    private final AppMeasurementSdk f18196f;

    private zzami(AppMeasurementSdk appMeasurementSdk) {
        this.f18196f = appMeasurementSdk;
    }

    /* renamed from: a */
    public static void m19401a(Context context, String str) {
        if (f18195g.compareAndSet(false, true)) {
            new Thread(new C7865q2(context, str)).start();
        }
    }

    /* renamed from: J0 */
    public final String mo27380J0() throws RemoteException {
        return this.f18196f.mo30646d();
    }

    /* renamed from: b */
    public final void mo27386b(String str, String str2, Bundle bundle) throws RemoteException {
        this.f18196f.mo30642b(str, str2, bundle);
    }

    /* renamed from: b0 */
    public final String mo27387b0() throws RemoteException {
        return this.f18196f.mo30644c();
    }

    /* renamed from: f */
    public final void mo27388f(Bundle bundle) throws RemoteException {
        this.f18196f.mo30635a(bundle);
    }

    /* renamed from: f0 */
    public final long mo27389f0() throws RemoteException {
        return this.f18196f.mo30631a();
    }

    /* renamed from: g */
    public final Bundle mo27390g(Bundle bundle) throws RemoteException {
        return this.f18196f.mo30639b(bundle);
    }

    /* renamed from: i */
    public final void mo27391i(Bundle bundle) throws RemoteException {
        this.f18196f.mo30645c(bundle);
    }

    /* renamed from: i0 */
    public final String mo27392i0() throws RemoteException {
        return this.f18196f.mo30647e();
    }

    /* renamed from: j */
    public final int mo27393j(String str) throws RemoteException {
        return this.f18196f.mo30643c(str);
    }

    /* renamed from: p */
    public final void mo27394p(String str) throws RemoteException {
        this.f18196f.mo30636a(str);
    }

    /* renamed from: s */
    public final void mo27395s(String str) throws RemoteException {
        this.f18196f.mo30641b(str);
    }

    /* renamed from: x0 */
    public final String mo27396x0() throws RemoteException {
        return this.f18196f.mo30640b();
    }

    /* renamed from: y0 */
    public final String mo27397y0() throws RemoteException {
        return this.f18196f.mo30648f();
    }

    /* renamed from: b */
    public final List mo27384b(String str, String str2) throws RemoteException {
        return this.f18196f.mo30632a(str, str2);
    }

    /* renamed from: a */
    public final void mo27383a(String str, String str2, IObjectWrapper iObjectWrapper) throws RemoteException {
        this.f18196f.mo30638a(str, str2, iObjectWrapper != null ? ObjectWrapper.m16390H(iObjectWrapper) : null);
    }

    /* renamed from: b */
    public final void mo27385b(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        this.f18196f.mo30634a(iObjectWrapper != null ? (Activity) ObjectWrapper.m16390H(iObjectWrapper) : null, str, str2);
    }

    /* renamed from: b */
    static final /* synthetic */ void m19402b(Context context, String str) {
        boolean z;
        zzacu.m18983a(context);
        if (!((Boolean) zzyt.m25670e().mo27163a(zzacu.f17942n0)).booleanValue()) {
            if (!((Boolean) zzyt.m25670e().mo27163a(zzacu.f17938m0)).booleanValue()) {
                z = false;
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", z);
                ((zzbjh) zzbae.m20528a(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", C7902r2.f16733a)).mo28220a(new zzami(AppMeasurementSdk.m26833a(context, "Ads", "am", str, bundle)));
            }
        }
        z = true;
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("measurementEnabled", z);
        try {
            ((zzbjh) zzbae.m20528a(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", C7902r2.f16733a)).mo28220a(new zzami(AppMeasurementSdk.m26833a(context, "Ads", "am", str, bundle2)));
        } catch (RemoteException | zzbag | NullPointerException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final Map mo27381a(String str, String str2, boolean z) throws RemoteException {
        return this.f18196f.mo30633a(str, str2, z);
    }

    /* renamed from: a */
    public final void mo27382a(String str, String str2, Bundle bundle) throws RemoteException {
        this.f18196f.mo30637a(str, str2, bundle);
    }
}
