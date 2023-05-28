package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class zzze extends zzfm implements zzzc {
    zzze(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    /* renamed from: a */
    public final void mo25847a(zzxz zzxz) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) zzxz);
        mo29280b(1, Z);
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel a = mo29278a(2, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: v */
    public final String mo25850v() throws RemoteException {
        Parcel a = mo29278a(4, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: y */
    public final boolean mo25851y() throws RemoteException {
        Parcel a = mo29278a(3, mo29277Z());
        boolean a2 = zzfo.m24345a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo25848a(zzxz zzxz, int i) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) zzxz);
        Z.writeInt(i);
        mo29280b(5, Z);
    }
}
