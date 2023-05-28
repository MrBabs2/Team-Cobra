package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class zzdbg extends zzfm implements zzdbf {
    zzdbg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    /* renamed from: a */
    public final zzdbd mo28899a(zzdbb zzdbb) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) zzdbb);
        Parcel a = mo29278a(1, Z);
        zzdbd zzdbd = (zzdbd) zzfo.m24341a(a, zzdbd.CREATOR);
        a.recycle();
        return zzdbd;
    }

    /* renamed from: a */
    public final void mo28900a(zzday zzday) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) zzday);
        mo29280b(2, Z);
    }
}
