package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;

/* renamed from: com.google.android.gms.common.api.internal.h0 */
final class C7181h0 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ Result f13798f;

    /* renamed from: g */
    private final /* synthetic */ zacm f13799g;

    C7181h0(zacm zacm, Result result) {
        this.f13799g = zacm;
        this.f13798f = result;
    }

    public final void run() {
        try {
            BasePendingResult.f13699p.set(true);
            this.f13799g.f13956g.sendMessage(this.f13799g.f13956g.obtainMessage(0, this.f13799g.f13950a.mo24973a(this.f13798f)));
            BasePendingResult.f13699p.set(false);
            zacm.m15799b(this.f13798f);
            GoogleApiClient googleApiClient = (GoogleApiClient) this.f13799g.f13955f.get();
            if (googleApiClient != null) {
                googleApiClient.mo24942a(this.f13799g);
            }
        } catch (RuntimeException e) {
            this.f13799g.f13956g.sendMessage(this.f13799g.f13956g.obtainMessage(1, e));
            BasePendingResult.f13699p.set(false);
            zacm.m15799b(this.f13798f);
            GoogleApiClient googleApiClient2 = (GoogleApiClient) this.f13799g.f13955f.get();
            if (googleApiClient2 != null) {
                googleApiClient2.mo24942a(this.f13799g);
            }
        } catch (Throwable th) {
            BasePendingResult.f13699p.set(false);
            zacm.m15799b(this.f13798f);
            GoogleApiClient googleApiClient3 = (GoogleApiClient) this.f13799g.f13955f.get();
            if (googleApiClient3 != null) {
                googleApiClient3.mo24942a(this.f13799g);
            }
            throw th;
        }
    }
}
