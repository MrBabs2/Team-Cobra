package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzaty extends zzfm implements zzatw {
    zzaty(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    /* renamed from: O */
    public final void mo27648O() throws RemoteException {
        mo29280b(2, mo29277Z());
    }

    /* renamed from: V */
    public final void mo27649V() throws RemoteException {
        mo29280b(1, mo29277Z());
    }

    /* renamed from: a */
    public final void mo27650a(zzatq zzatq) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzatq);
        mo29280b(3, Z);
    }

    /* renamed from: r */
    public final void mo27651r(int i) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeInt(i);
        mo29280b(4, Z);
    }
}
