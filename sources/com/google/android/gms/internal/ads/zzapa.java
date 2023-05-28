package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzapa extends zzfm implements zzaoy {
    zzapa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    /* renamed from: h */
    public final void mo27532h(String str) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeString(str);
        mo29280b(1, Z);
    }

    public final void onFailure(String str) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeString(str);
        mo29280b(2, Z);
    }
}
