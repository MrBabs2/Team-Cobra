package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public final class zzaqr extends zzfn implements zzaqq {
    /* renamed from: a */
    public static zzaqq m19857a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
        if (queryLocalInterface instanceof zzaqq) {
            return (zzaqq) queryLocalInterface;
        }
        return new zzaqs(iBinder);
    }
}
