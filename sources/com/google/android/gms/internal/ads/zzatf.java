package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

@zzard
public final class zzatf extends RemoteCreator<zzasz> {
    public zzatf() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    /* renamed from: a */
    public final zzasw mo27635a(Context context, zzamp zzamp) {
        try {
            IBinder a = ((zzasz) mo25545a(context)).mo27626a(ObjectWrapper.m16391a(context), zzamp, 15000000);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            if (queryLocalInterface instanceof zzasw) {
                return (zzasw) queryLocalInterface;
            }
            return new zzasy(a);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzbad.m20522c("Could not get remote RewardedVideoAd.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo25389a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        if (queryLocalInterface instanceof zzasz) {
            return (zzasz) queryLocalInterface;
        }
        return new zzata(iBinder);
    }
}
