package com.google.android.gms.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.location.zza;
import com.google.android.gms.internal.location.zzc;

public final class zzw extends zza implements zzu {
    zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationCallback");
    }

    /* renamed from: a */
    public final void mo30011a(LocationAvailability locationAvailability) throws RemoteException {
        Parcel Z = mo30016Z();
        zzc.m25873a(Z, (Parcelable) locationAvailability);
        mo30019b(2, Z);
    }

    /* renamed from: a */
    public final void mo30012a(LocationResult locationResult) throws RemoteException {
        Parcel Z = mo30016Z();
        zzc.m25873a(Z, (Parcelable) locationResult);
        mo30019b(1, Z);
    }
}
