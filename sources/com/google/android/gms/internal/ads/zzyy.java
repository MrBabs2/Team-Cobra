package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;

public final class zzyy extends zzfm implements zzyw {
    zzyy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    public final void onAdClicked() throws RemoteException {
        mo29280b(1, mo29277Z());
    }
}
