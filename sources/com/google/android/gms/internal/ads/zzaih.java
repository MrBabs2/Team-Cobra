package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class zzaih extends zzfm implements zzaig {
    zzaih(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    /* renamed from: a */
    public final void mo27316a(zzaia zzaia, zzaie zzaie) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) zzaia);
        zzfo.m24342a(Z, (IInterface) zzaie);
        mo29281c(2, Z);
    }
}
