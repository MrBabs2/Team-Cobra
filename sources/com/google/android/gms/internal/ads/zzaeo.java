package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzaeo extends zzfm implements zzaem {
    zzaeo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    /* renamed from: a */
    public final void mo27101a(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        Z.writeInt(i);
        mo29280b(5, Z);
    }

    /* renamed from: b */
    public final void mo27102b(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeString(str);
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(1, Z);
    }

    /* renamed from: c */
    public final void mo27103c(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(3, Z);
    }

    /* renamed from: d */
    public final void mo27104d(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(6, Z);
    }

    public final void destroy() throws RemoteException {
        mo29280b(4, mo29277Z());
    }

    /* renamed from: l */
    public final IObjectWrapper mo27106l(String str) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeString(str);
        Parcel a = mo29278a(2, Z);
        IObjectWrapper a2 = IObjectWrapper.Stub.m16389a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
