package com.google.android.gms.internal.safetynet;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzj extends zza implements zzi {
    zzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.safetynet.internal.ISafetyNetService");
    }

    /* renamed from: a */
    public final void mo30515a(zzg zzg) throws RemoteException {
        Parcel Z = mo30501Z();
        zzc.m26769a(Z, (IInterface) zzg);
        mo30502a(5, Z);
    }
}
