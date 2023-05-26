package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzagf extends zzfm implements zzagd {
    zzagf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    public final void onUnconfirmedClickCancelled() throws RemoteException {
        mo29280b(2, mo29277Z());
    }

    public final void onUnconfirmedClickReceived(String str) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeString(str);
        mo29280b(1, Z);
    }
}
