package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.location.zza;
import com.google.android.gms.internal.location.zzc;

public final class zzz extends zza implements zzx {
    zzz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationListener");
    }

    /* renamed from: a */
    public final void mo30013a(Location location) throws RemoteException {
        Parcel Z = mo30016Z();
        zzc.m25873a(Z, (Parcelable) location);
        mo30019b(1, Z);
    }
}
