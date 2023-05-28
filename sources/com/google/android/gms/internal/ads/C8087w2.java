package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p112n.p277e.p278a.C10567a;

/* renamed from: com.google.android.gms.internal.ads.w2 */
final class C8087w2 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C10567a f17057f;

    /* renamed from: g */
    private final /* synthetic */ zzanu f17058g;

    C8087w2(zzanu zzanu, C10567a aVar) {
        this.f17058g = zzanu;
        this.f17057f = aVar;
    }

    public final void run() {
        try {
            this.f17058g.f18240a.onAdFailedToLoad(zzaog.m19721a(this.f17057f));
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }
}
