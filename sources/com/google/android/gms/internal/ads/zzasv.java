package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzasv extends zzfm implements zzasu {
    zzasv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    /* renamed from: a */
    public final void mo27625a(zzasr zzasr, String str, String str2) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzasr);
        Z.writeString(str);
        Z.writeString(str2);
        mo29280b(2, Z);
    }
}
