package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.util.VisibleForTesting;

public final class zzp {

    /* renamed from: d */
    private static zzp f13601d;
    @VisibleForTesting

    /* renamed from: a */
    private Storage f13602a;
    @VisibleForTesting

    /* renamed from: b */
    private GoogleSignInAccount f13603b;
    @VisibleForTesting

    /* renamed from: c */
    private GoogleSignInOptions f13604c = this.f13602a.mo24794c();

    private zzp(Context context) {
        Storage a = Storage.m15189a(context);
        this.f13602a = a;
        this.f13603b = a.mo24793b();
    }

    /* renamed from: a */
    public static synchronized zzp m15225a(Context context) {
        zzp b;
        synchronized (zzp.class) {
            b = m15226b(context.getApplicationContext());
        }
        return b;
    }

    /* renamed from: b */
    private static synchronized zzp m15226b(Context context) {
        zzp zzp;
        synchronized (zzp.class) {
            if (f13601d == null) {
                f13601d = new zzp(context);
            }
            zzp = f13601d;
        }
        return zzp;
    }

    /* renamed from: a */
    public final synchronized void mo24813a() {
        this.f13602a.mo24791a();
    }

    /* renamed from: a */
    public final synchronized void mo24814a(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f13602a.mo24792a(googleSignInAccount, googleSignInOptions);
        this.f13603b = googleSignInAccount;
        this.f13604c = googleSignInOptions;
    }
}
