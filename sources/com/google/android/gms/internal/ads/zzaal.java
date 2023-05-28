package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzaal extends zzfn implements zzaak {
    public zzaal() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    /* renamed from: a */
    public static zzaak m18710a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        if (queryLocalInterface instanceof zzaak) {
            return (zzaak) queryLocalInterface;
        }
        return new zzaam(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String description = getDescription();
            parcel2.writeNoException();
            parcel2.writeString(description);
        } else if (i != 2) {
            return false;
        } else {
            String Y = mo26924Y();
            parcel2.writeNoException();
            parcel2.writeString(Y);
        }
        return true;
    }
}
