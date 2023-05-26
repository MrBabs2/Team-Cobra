package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbjj extends zzfm implements zzbjh {
    zzbjj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    /* renamed from: a */
    public final void mo28220a(zzbjf zzbjf) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzbjf);
        mo29280b(1, Z);
    }
}
