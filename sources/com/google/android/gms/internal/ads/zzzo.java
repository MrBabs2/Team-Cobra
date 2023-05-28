package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzzo extends zzfm implements zzzn {
    zzzo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    /* renamed from: a */
    public final IBinder mo29924a(IObjectWrapper iObjectWrapper, zzyd zzyd, String str, zzamp zzamp, int i, int i2) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        zzfo.m24343a(Z, (Parcelable) zzyd);
        Z.writeString(str);
        zzfo.m24342a(Z, (IInterface) zzamp);
        Z.writeInt(i);
        Z.writeInt(i2);
        Parcel a = mo29278a(2, Z);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
