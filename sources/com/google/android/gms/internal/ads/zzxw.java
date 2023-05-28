package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

@zzard
public final class zzxw extends RemoteCreator<zzzi> {
    public zzxw() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    /* renamed from: a */
    public final zzzf mo29901a(Context context, String str, zzamp zzamp) {
        try {
            IBinder a = ((zzzi) mo25545a(context)).mo29923a(ObjectWrapper.m16391a(context), str, zzamp, 15000000);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof zzzf) {
                return (zzzf) queryLocalInterface;
            }
            return new zzzh(a);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzbad.m20522c("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo25389a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        if (queryLocalInterface instanceof zzzi) {
            return (zzzi) queryLocalInterface;
        }
        return new zzzj(iBinder);
    }
}
