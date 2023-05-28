package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p112n.p277e.p278a.C10567a;

/* renamed from: com.google.android.gms.internal.ads.u2 */
final class C8013u2 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C10567a f16935f;

    /* renamed from: g */
    private final /* synthetic */ zzanu f16936g;

    C8013u2(zzanu zzanu, C10567a aVar) {
        this.f16936g = zzanu;
        this.f16935f = aVar;
    }

    public final void run() {
        try {
            this.f16936g.f18240a.onAdFailedToLoad(zzaog.m19721a(this.f16935f));
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }
}
