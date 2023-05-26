package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* renamed from: com.google.android.gms.internal.ads.t2 */
final class C7976t2 implements InitializationCompleteCallback {

    /* renamed from: a */
    private final /* synthetic */ zzaiq f16879a;

    C7976t2(zzanl zzanl, zzaiq zzaiq) {
        this.f16879a = zzaiq;
    }

    public final void onInitializationFailed(String str) {
        try {
            this.f16879a.onInitializationFailed(str);
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
    }

    public final void onInitializationSucceeded() {
        try {
            this.f16879a.onInitializationSucceeded();
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
    }
}
