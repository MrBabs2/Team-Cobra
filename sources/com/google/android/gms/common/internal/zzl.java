package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class zzl extends zza implements IGmsCallbacks {
    zzl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* renamed from: a */
    public final void mo25310a(int i, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel B = mo30003B();
        B.writeInt(i);
        B.writeStrongBinder(iBinder);
        zzc.m25835a(B, (Parcelable) bundle);
        mo30006b(1, B);
    }

    /* renamed from: a */
    public final void mo25309a(int i, Bundle bundle) throws RemoteException {
        Parcel B = mo30003B();
        B.writeInt(i);
        zzc.m25835a(B, (Parcelable) bundle);
        mo30006b(2, B);
    }

    /* renamed from: a */
    public final void mo25311a(int i, IBinder iBinder, zzb zzb) throws RemoteException {
        Parcel B = mo30003B();
        B.writeInt(i);
        B.writeStrongBinder(iBinder);
        zzc.m25835a(B, (Parcelable) zzb);
        mo30006b(3, B);
    }
}
