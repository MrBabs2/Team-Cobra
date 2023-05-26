package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzaef extends zzfn implements zzaee {
    public zzaef() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        float t = mo27211t();
        parcel2.writeNoException();
        parcel2.writeFloat(t);
        return true;
    }
}
