package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

public interface IGmsCallbacks extends IInterface {

    public static abstract class zza extends zzb implements IGmsCallbacks {
        public zza() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo25364a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                mo25310a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) zzc.m25833a(parcel, Bundle.CREATOR));
            } else if (i == 2) {
                mo25309a(parcel.readInt(), (Bundle) zzc.m25833a(parcel, Bundle.CREATOR));
            } else if (i != 3) {
                return false;
            } else {
                mo25311a(parcel.readInt(), parcel.readStrongBinder(), (zzb) zzc.m25833a(parcel, zzb.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: a */
    void mo25309a(int i, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo25310a(int i, IBinder iBinder, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo25311a(int i, IBinder iBinder, zzb zzb) throws RemoteException;
}
