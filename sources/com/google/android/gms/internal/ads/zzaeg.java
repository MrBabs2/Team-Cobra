package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzaeg extends zzfm implements zzaee {
    zzaeg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    /* renamed from: t */
    public final float mo27211t() throws RemoteException {
        Parcel a = mo29278a(2, mo29277Z());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }
}
