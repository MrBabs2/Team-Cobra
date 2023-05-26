package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class zzap extends zza implements zzao {
    zzap(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    /* renamed from: a */
    public final void mo30028a(zzbf zzbf) throws RemoteException {
        Parcel Z = mo30016Z();
        zzc.m25873a(Z, (Parcelable) zzbf);
        mo30017a(59, Z);
    }

    /* renamed from: a */
    public final void mo30029a(zzo zzo) throws RemoteException {
        Parcel Z = mo30016Z();
        zzc.m25873a(Z, (Parcelable) zzo);
        mo30017a(75, Z);
    }

    /* renamed from: a */
    public final void mo30030a(boolean z) throws RemoteException {
        Parcel Z = mo30016Z();
        zzc.m25874a(Z, z);
        mo30017a(12, Z);
    }
}
