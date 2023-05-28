package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.RemoteException;

public final class zzart extends zzfm implements zzarr {
    zzart(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    /* renamed from: a */
    public final void mo27591a(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) parcelFileDescriptor);
        mo29280b(1, Z);
    }

    /* renamed from: a */
    public final void mo27592a(zzaym zzaym) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) zzaym);
        mo29280b(2, Z);
    }
}
