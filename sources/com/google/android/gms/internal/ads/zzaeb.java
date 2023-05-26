package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public abstract class zzaeb extends zzfn implements zzaea {
    public zzaeb() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    /* renamed from: a */
    public static zzaea m19041a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        if (queryLocalInterface instanceof zzaea) {
            return (zzaea) queryLocalInterface;
        }
        return new zzaec(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            String M = mo27194M();
            parcel2.writeNoException();
            parcel2.writeString(M);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            List<zzaei> H = mo27193H();
            parcel2.writeNoException();
            parcel2.writeList(H);
            return true;
        }
    }
}
