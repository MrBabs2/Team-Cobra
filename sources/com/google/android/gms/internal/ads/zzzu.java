package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzzu extends zzfm implements zzzs {
    zzzu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public final void onAppEvent(String str, String str2) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeString(str);
        Z.writeString(str2);
        mo29280b(1, Z);
    }
}
