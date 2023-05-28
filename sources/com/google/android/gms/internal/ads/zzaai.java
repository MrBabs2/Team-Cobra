package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;

public final class zzaai extends zzfm implements zzaag {
    zzaai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    public final void onAdMuted() throws RemoteException {
        mo29280b(1, mo29277Z());
    }
}
