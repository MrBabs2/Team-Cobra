package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzaua extends zzfm implements zzatz {
    zzaua(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    /* renamed from: b */
    public final IBinder mo27652b(IObjectWrapper iObjectWrapper, String str, zzamp zzamp, int i) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        Z.writeString(str);
        zzfo.m24342a(Z, (IInterface) zzamp);
        Z.writeInt(i);
        Parcel a = mo29278a(1, Z);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
