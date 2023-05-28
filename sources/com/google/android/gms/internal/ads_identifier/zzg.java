package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzg extends zza implements zze {
    zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    /* renamed from: g */
    public final boolean mo29930g() throws RemoteException {
        Parcel a = mo29926a(6, mo29925Z());
        boolean a2 = zzc.m25769a(a);
        a.recycle();
        return a2;
    }

    public final String getId() throws RemoteException {
        Parcel a = mo29926a(1, mo29925Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: i */
    public final boolean mo29932i(boolean z) throws RemoteException {
        Parcel Z = mo29925Z();
        zzc.m25768a(Z, true);
        Parcel a = mo29926a(2, Z);
        boolean a2 = zzc.m25769a(a);
        a.recycle();
        return a2;
    }
}
