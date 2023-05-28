package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class zzvz extends zzfm implements zzvy {
    zzvz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    /* renamed from: a */
    public final zzvs mo29855a(zzvv zzvv) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) zzvv);
        Parcel a = mo29278a(1, Z);
        zzvs zzvs = (zzvs) zzfo.m24341a(a, zzvs.CREATOR);
        a.recycle();
        return zzvs;
    }
}
