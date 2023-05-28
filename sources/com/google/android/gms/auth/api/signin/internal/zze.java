package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p050l.p094l.p096b.C5119a;

public final class zze extends C5119a<Void> implements SignInConnectionListener {

    /* renamed from: o */
    private Semaphore f13597o = new Semaphore(0);

    /* renamed from: p */
    private Set<GoogleApiClient> f13598p;

    public zze(Context context, Set<GoogleApiClient> set) {
        super(context);
        this.f13598p = set;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final Void mo17758t() {
        int i = 0;
        for (GoogleApiClient a : this.f13598p) {
            if (a.mo24944a((SignInConnectionListener) this)) {
                i++;
            }
        }
        try {
            this.f13597o.tryAcquire(i, 5, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo17778l() {
        this.f13597o.drainPermits();
        mo17773e();
    }

    public final void onComplete() {
        this.f13597o.release();
    }
}
