package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzavz extends zzfm implements zzavy {
    zzavz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    /* renamed from: c */
    public final void mo27703c(String str, String str2) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeString(str);
        Z.writeString(str2);
        mo29280b(1, Z);
    }

    public final void onError(String str) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeString(str);
        mo29280b(2, Z);
    }
}
