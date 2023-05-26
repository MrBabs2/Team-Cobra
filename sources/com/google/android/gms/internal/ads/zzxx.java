package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

@zzard
public final class zzxx extends RemoteCreator<zzzn> {
    @VisibleForTesting
    public zzxx() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    /* renamed from: a */
    public final zzzk mo29902a(Context context, zzyd zzyd, String str, zzamp zzamp, int i) {
        try {
            IBinder a = ((zzzn) mo25545a(context)).mo29924a(ObjectWrapper.m16391a(context), zzyd, str, zzamp, 15000000, i);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzzk) {
                return (zzzk) queryLocalInterface;
            }
            return new zzzm(a);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzbad.m20517a("Could not create remote AdManager.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo25389a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (queryLocalInterface instanceof zzzn) {
            return (zzzn) queryLocalInterface;
        }
        return new zzzo(iBinder);
    }
}
