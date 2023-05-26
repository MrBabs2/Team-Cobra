package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.w3 */
final /* synthetic */ class C8088w3 implements zzbaf {

    /* renamed from: a */
    static final zzbaf f17059a = new C8088w3();

    private C8088w3() {
    }

    public final Object apply(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
        if (queryLocalInterface instanceof zzatz) {
            return (zzatz) queryLocalInterface;
        }
        return new zzaua(iBinder);
    }
}
