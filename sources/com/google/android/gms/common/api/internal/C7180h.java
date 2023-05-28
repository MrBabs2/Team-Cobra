package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.h */
final class C7180h implements BaseGmsClient.ConnectionProgressReportCallbacks {

    /* renamed from: a */
    private final WeakReference<zaak> f13795a;

    /* renamed from: b */
    private final Api<?> f13796b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final boolean f13797c;

    public C7180h(zaak zaak, Api<?> api, boolean z) {
        this.f13795a = new WeakReference<>(zaak);
        this.f13796b = api;
        this.f13797c = z;
    }

    /* renamed from: a */
    public final void mo25038a(ConnectionResult connectionResult) {
        zaak zaak = (zaak) this.f13795a.get();
        if (zaak != null) {
            Preconditions.m16048b(Looper.myLooper() == zaak.f13869a.f13929s.mo24951f(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            zaak.f13870b.lock();
            try {
                if (zaak.m15655b(0)) {
                    if (!connectionResult.mo24846t()) {
                        zaak.m15654b(connectionResult, this.f13796b, this.f13797c);
                    }
                    if (zaak.m15659c()) {
                        zaak.m15661d();
                    }
                    zaak.f13870b.unlock();
                }
            } finally {
                zaak.f13870b.unlock();
            }
        }
    }
}
