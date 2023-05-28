package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

@zzard
public final class zzabk extends RemoteCreator<zzaae> {
    public zzabk() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo25389a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        if (queryLocalInterface instanceof zzaae) {
            return (zzaae) queryLocalInterface;
        }
        return new zzaaf(iBinder);
    }

    /* renamed from: b */
    public final zzaab mo27053b(Context context) {
        try {
            IBinder d = ((zzaae) mo25545a(context)).mo26922d(ObjectWrapper.m16391a(context), 15000000);
            if (d == null) {
                return null;
            }
            IInterface queryLocalInterface = d.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof zzaab) {
                return (zzaab) queryLocalInterface;
            }
            return new zzaad(d);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzbad.m20522c("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }
}
