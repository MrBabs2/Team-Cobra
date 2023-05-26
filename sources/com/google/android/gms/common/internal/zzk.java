package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;

public final class zzk extends zza implements zzi {
    zzk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: D */
    public final IObjectWrapper mo25213D() throws RemoteException {
        Parcel a = mo30004a(1, mo30003B());
        IObjectWrapper a2 = IObjectWrapper.Stub.m16389a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: g */
    public final int mo25216g() throws RemoteException {
        Parcel a = mo30004a(2, mo30003B());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
