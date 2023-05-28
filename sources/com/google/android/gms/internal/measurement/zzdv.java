package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class zzdv extends zzq implements zzdt {
    zzdv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* renamed from: a */
    public final void mo30325a(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel Z = mo30361Z();
        Z.writeString(str);
        Z.writeString(str2);
        zzs.m26507a(Z, (Parcelable) bundle);
        Z.writeLong(j);
        mo30364b(1, Z);
    }

    /* renamed from: l0 */
    public final int mo30326l0() throws RemoteException {
        Parcel a = mo30362a(2, mo30361Z());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
