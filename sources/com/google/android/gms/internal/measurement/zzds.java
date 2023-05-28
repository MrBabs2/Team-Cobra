package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class zzds extends zzq implements zzdq {
    zzds(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    public final void zzb(Bundle bundle) throws RemoteException {
        Parcel Z = mo30361Z();
        zzs.m26507a(Z, (Parcelable) bundle);
        mo30364b(1, Z);
    }
}
