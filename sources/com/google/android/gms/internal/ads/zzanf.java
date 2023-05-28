package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

public final class zzanf extends zzfm implements zzand {
    zzanf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    /* renamed from: C */
    public final zzaei mo27476C() throws RemoteException {
        Parcel a = mo29278a(5, mo29277Z());
        zzaei a2 = zzaej.m19049a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo27478a(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(14, Z);
    }

    /* renamed from: b */
    public final String mo27480b() throws RemoteException {
        Parcel a = mo29278a(2, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: c */
    public final String mo27482c() throws RemoteException {
        Parcel a = mo29278a(6, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: d */
    public final String mo27483d() throws RemoteException {
        Parcel a = mo29278a(4, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: e */
    public final void mo27485e(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(10, Z);
    }

    /* renamed from: f */
    public final List mo27486f() throws RemoteException {
        Parcel a = mo29278a(3, mo29277Z());
        ArrayList b = zzfo.m24346b(a);
        a.recycle();
        return b;
    }

    public final Bundle getExtras() throws RemoteException {
        Parcel a = mo29278a(13, mo29277Z());
        Bundle bundle = (Bundle) zzfo.m24341a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final zzaar getVideoController() throws RemoteException {
        Parcel a = mo29278a(16, mo29277Z());
        zzaar a2 = zzaas.m18725a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: l */
    public final String mo27489l() throws RemoteException {
        Parcel a = mo29278a(7, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: n */
    public final boolean mo27490n() throws RemoteException {
        Parcel a = mo29278a(11, mo29277Z());
        boolean a2 = zzfo.m24345a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: p */
    public final IObjectWrapper mo27491p() throws RemoteException {
        Parcel a = mo29278a(20, mo29277Z());
        IObjectWrapper a2 = IObjectWrapper.Stub.m16389a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: q */
    public final IObjectWrapper mo27492q() throws RemoteException {
        Parcel a = mo29278a(15, mo29277Z());
        IObjectWrapper a2 = IObjectWrapper.Stub.m16389a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: r */
    public final boolean mo27493r() throws RemoteException {
        Parcel a = mo29278a(12, mo29277Z());
        boolean a2 = zzfo.m24345a(a);
        a.recycle();
        return a2;
    }

    public final void recordImpression() throws RemoteException {
        mo29280b(8, mo29277Z());
    }

    /* renamed from: a */
    public final zzaea mo27477a() throws RemoteException {
        Parcel a = mo29278a(19, mo29277Z());
        zzaea a2 = zzaeb.m19041a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: e */
    public final IObjectWrapper mo27484e() throws RemoteException {
        Parcel a = mo29278a(21, mo29277Z());
        IObjectWrapper a2 = IObjectWrapper.Stub.m16389a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final void mo27481b(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(9, Z);
    }

    /* renamed from: a */
    public final void mo27479a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        zzfo.m24342a(Z, (IInterface) iObjectWrapper2);
        zzfo.m24342a(Z, (IInterface) iObjectWrapper3);
        mo29280b(22, Z);
    }
}
