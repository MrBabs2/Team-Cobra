package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzata extends zzfm implements zzasz {
    zzata(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
    }

    /* renamed from: a */
    public final IBinder mo27626a(IObjectWrapper iObjectWrapper, zzamp zzamp, int i) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        zzfo.m24342a(Z, (IInterface) zzamp);
        Z.writeInt(i);
        Parcel a = mo29278a(1, Z);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
