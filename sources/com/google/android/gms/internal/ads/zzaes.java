package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzaes extends zzfn implements zzaer {
    public zzaes() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    /* renamed from: a */
    public static zzaer m19069a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        if (queryLocalInterface instanceof zzaer) {
            return (zzaer) queryLocalInterface;
        }
        return new zzaet(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo27108c(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
        } else if (i == 2) {
            mo27107T0();
        } else if (i != 3) {
            return false;
        } else {
            mo27109d(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
