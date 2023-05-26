package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.p189authapi.zzc;
import com.google.android.gms.internal.p189authapi.zze;

public final class zzv extends zzc implements zzu {
    zzv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    /* renamed from: a */
    public final void mo24818a(zzs zzs, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel Z = mo29938Z();
        zze.m25783a(Z, (IInterface) zzs);
        zze.m25784a(Z, (Parcelable) googleSignInOptions);
        mo29939a(102, Z);
    }

    /* renamed from: b */
    public final void mo24819b(zzs zzs, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel Z = mo29938Z();
        zze.m25783a(Z, (IInterface) zzs);
        zze.m25784a(Z, (Parcelable) googleSignInOptions);
        mo29939a(103, Z);
    }
}
