package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzaud extends zzfm implements zzaub {
    zzaud(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    /* renamed from: N */
    public final void mo27653N() throws RemoteException {
        mo29280b(1, mo29277Z());
    }

    /* renamed from: o */
    public final void mo27654o(int i) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeInt(i);
        mo29280b(2, Z);
    }
}
