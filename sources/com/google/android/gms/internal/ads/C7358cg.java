package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;

/* renamed from: com.google.android.gms.internal.ads.cg */
final class C7358cg implements zzaho<Object> {

    /* renamed from: a */
    private final /* synthetic */ zzagd f14753a;

    /* renamed from: b */
    private final /* synthetic */ zzbzq f14754b;

    C7358cg(zzbzq zzbzq, zzagd zzagd) {
        this.f14754b = zzbzq;
        this.f14753a = zzagd;
    }

    /* renamed from: a */
    public final void mo25559a(Object obj, Map<String, String> map) {
        try {
            this.f14754b.f19806k = Long.valueOf(Long.parseLong(map.get("timestamp")));
        } catch (NumberFormatException unused) {
            zzbad.m20519b("Failed to call parse unconfirmedClickTimestamp.");
        }
        this.f14754b.f19805j = map.get(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID);
        String str = map.get("asset_id");
        zzagd zzagd = this.f14753a;
        if (zzagd == null) {
            zzbad.m20516a("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            zzagd.onUnconfirmedClickReceived(str);
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }
}
