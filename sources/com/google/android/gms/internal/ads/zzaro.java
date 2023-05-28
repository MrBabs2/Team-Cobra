package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class zzaro extends zzfm implements zzarm {
    zzaro(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* renamed from: a */
    public final zzari mo27587a(zzarg zzarg) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) zzarg);
        Parcel a = mo29278a(1, Z);
        zzari zzari = (zzari) zzfo.m24341a(a, zzari.CREATOR);
        a.recycle();
        return zzari;
    }

    /* renamed from: b */
    public final void mo27590b(zzarx zzarx, zzarr zzarr) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) zzarx);
        zzfo.m24342a(Z, (IInterface) zzarr);
        mo29280b(5, Z);
    }

    /* renamed from: a */
    public final void mo27588a(zzarg zzarg, zzarp zzarp) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) zzarg);
        zzfo.m24342a(Z, (IInterface) zzarp);
        mo29280b(2, Z);
    }

    /* renamed from: a */
    public final void mo27589a(zzarx zzarx, zzarr zzarr) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) zzarx);
        zzfo.m24342a(Z, (IInterface) zzarr);
        mo29280b(4, Z);
    }
}
