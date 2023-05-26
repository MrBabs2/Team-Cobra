package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

public final class zzanc extends zzfm implements zzana {
    zzanc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    /* renamed from: a */
    public final void mo27456a(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(16, Z);
    }

    /* renamed from: b */
    public final String mo27458b() throws RemoteException {
        Parcel a = mo29278a(2, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: c */
    public final String mo27460c() throws RemoteException {
        Parcel a = mo29278a(6, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: d */
    public final String mo27461d() throws RemoteException {
        Parcel a = mo29278a(4, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: e */
    public final void mo27463e(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(12, Z);
    }

    /* renamed from: f */
    public final List mo27464f() throws RemoteException {
        Parcel a = mo29278a(3, mo29277Z());
        ArrayList b = zzfo.m24346b(a);
        a.recycle();
        return b;
    }

    public final Bundle getExtras() throws RemoteException {
        Parcel a = mo29278a(15, mo29277Z());
        Bundle bundle = (Bundle) zzfo.m24341a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final String getStore() throws RemoteException {
        Parcel a = mo29278a(8, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final zzaar getVideoController() throws RemoteException {
        Parcel a = mo29278a(17, mo29277Z());
        zzaar a2 = zzaas.m18725a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: h */
    public final zzaei mo27468h() throws RemoteException {
        Parcel a = mo29278a(5, mo29277Z());
        zzaei a2 = zzaej.m19049a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: i */
    public final String mo27469i() throws RemoteException {
        Parcel a = mo29278a(9, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: k */
    public final double mo27470k() throws RemoteException {
        Parcel a = mo29278a(7, mo29277Z());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    /* renamed from: n */
    public final boolean mo27471n() throws RemoteException {
        Parcel a = mo29278a(13, mo29277Z());
        boolean a2 = zzfo.m24345a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: p */
    public final IObjectWrapper mo27472p() throws RemoteException {
        Parcel a = mo29278a(20, mo29277Z());
        IObjectWrapper a2 = IObjectWrapper.Stub.m16389a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: q */
    public final IObjectWrapper mo27473q() throws RemoteException {
        Parcel a = mo29278a(18, mo29277Z());
        IObjectWrapper a2 = IObjectWrapper.Stub.m16389a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: r */
    public final boolean mo27474r() throws RemoteException {
        Parcel a = mo29278a(14, mo29277Z());
        boolean a2 = zzfo.m24345a(a);
        a.recycle();
        return a2;
    }

    public final void recordImpression() throws RemoteException {
        mo29280b(10, mo29277Z());
    }

    /* renamed from: a */
    public final zzaea mo27455a() throws RemoteException {
        Parcel a = mo29278a(19, mo29277Z());
        zzaea a2 = zzaeb.m19041a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: e */
    public final IObjectWrapper mo27462e() throws RemoteException {
        Parcel a = mo29278a(21, mo29277Z());
        IObjectWrapper a2 = IObjectWrapper.Stub.m16389a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final void mo27459b(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(11, Z);
    }

    /* renamed from: a */
    public final void mo27457a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        zzfo.m24342a(Z, (IInterface) iObjectWrapper2);
        zzfo.m24342a(Z, (IInterface) iObjectWrapper3);
        mo29280b(22, Z);
    }
}
