package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzaam extends zzfm implements zzaak {
    zzaam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    /* renamed from: Y */
    public final String mo26924Y() throws RemoteException {
        Parcel a = mo29278a(2, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final String getDescription() throws RemoteException {
        Parcel a = mo29278a(1, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
