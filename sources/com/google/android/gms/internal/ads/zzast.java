package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzast extends zzfm implements zzasr {
    zzast(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    public final int getAmount() throws RemoteException {
        Parcel a = mo29278a(2, mo29277Z());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final String getType() throws RemoteException {
        Parcel a = mo29278a(1, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
