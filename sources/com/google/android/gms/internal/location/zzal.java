package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class zzal extends zza implements zzaj {
    zzal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    /* renamed from: a */
    public final void mo30023a(zzad zzad) throws RemoteException {
        Parcel Z = mo30016Z();
        zzc.m25873a(Z, (Parcelable) zzad);
        mo30019b(1, Z);
    }
}
