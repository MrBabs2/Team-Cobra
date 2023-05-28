package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzaet extends zzfm implements zzaer {
    zzaet(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    /* renamed from: T0 */
    public final void mo27107T0() throws RemoteException {
        mo29280b(2, mo29277Z());
    }

    /* renamed from: c */
    public final void mo27108c(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(1, Z);
    }

    /* renamed from: d */
    public final void mo27109d(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(3, Z);
    }
}
