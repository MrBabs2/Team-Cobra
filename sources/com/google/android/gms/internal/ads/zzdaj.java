package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzdaj extends zzfm implements zzdah {
    zzdaj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.omid.IOmid");
    }

    /* renamed from: D */
    public final void mo28876D(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(4, Z);
    }

    /* renamed from: E */
    public final String mo28877E() throws RemoteException {
        Parcel a = mo29278a(6, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: G */
    public final void mo28878G(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(7, Z);
    }

    /* renamed from: a */
    public final void mo28880a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        zzfo.m24342a(Z, (IInterface) iObjectWrapper2);
        mo29280b(5, Z);
    }

    /* renamed from: i */
    public final boolean mo28881i(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        Parcel a = mo29278a(2, Z);
        boolean a2 = zzfo.m24345a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final IObjectWrapper mo28879a(String str, IObjectWrapper iObjectWrapper, String str2, String str3, String str4, String str5) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeString(str);
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        Z.writeString(str2);
        Z.writeString(str3);
        Z.writeString(str4);
        Z.writeString(str5);
        Parcel a = mo29278a(9, Z);
        IObjectWrapper a2 = IObjectWrapper.Stub.m16389a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
