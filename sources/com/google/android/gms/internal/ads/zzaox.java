package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzaox extends zzfm implements zzaov {
    zzaox(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    /* renamed from: O0 */
    public final zzapj mo27520O0() throws RemoteException {
        Parcel a = mo29278a(3, mo29277Z());
        zzapj zzapj = (zzapj) zzfo.m24341a(a, zzapj.CREATOR);
        a.recycle();
        return zzapj;
    }

    /* renamed from: a */
    public final void mo27521a(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzyd zzyd, zzaoy zzaoy) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        Z.writeString(str);
        zzfo.m24343a(Z, (Parcelable) bundle);
        zzfo.m24343a(Z, (Parcelable) bundle2);
        zzfo.m24343a(Z, (Parcelable) zzyd);
        zzfo.m24342a(Z, (IInterface) zzaoy);
        mo29280b(1, Z);
    }

    /* renamed from: a1 */
    public final zzapj mo27527a1() throws RemoteException {
        Parcel a = mo29278a(2, mo29277Z());
        zzapj zzapj = (zzapj) zzfo.m24341a(a, zzapj.CREATOR);
        a.recycle();
        return zzapj;
    }

    public final zzaar getVideoController() throws RemoteException {
        Parcel a = mo29278a(5, mo29277Z());
        zzaar a2 = zzaas.m18725a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: l */
    public final boolean mo27529l(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        Parcel a = mo29278a(15, Z);
        boolean a2 = zzfo.m24345a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: m */
    public final boolean mo27530m(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        Parcel a = mo29278a(17, Z);
        boolean a2 = zzfo.m24345a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: p */
    public final void mo27531p(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(10, Z);
    }

    /* renamed from: a */
    public final void mo27526a(String[] strArr, Bundle[] bundleArr) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeStringArray(strArr);
        Z.writeTypedArray(bundleArr, 0);
        mo29280b(11, Z);
    }

    /* renamed from: a */
    public final void mo27522a(String str, String str2, zzxz zzxz, IObjectWrapper iObjectWrapper, zzaoj zzaoj, zzamv zzamv, zzyd zzyd) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeString(str);
        Z.writeString(str2);
        zzfo.m24343a(Z, (Parcelable) zzxz);
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        zzfo.m24342a(Z, (IInterface) zzaoj);
        zzfo.m24342a(Z, (IInterface) zzamv);
        zzfo.m24343a(Z, (Parcelable) zzyd);
        mo29280b(13, Z);
    }

    /* renamed from: a */
    public final void mo27523a(String str, String str2, zzxz zzxz, IObjectWrapper iObjectWrapper, zzaom zzaom, zzamv zzamv) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeString(str);
        Z.writeString(str2);
        zzfo.m24343a(Z, (Parcelable) zzxz);
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        zzfo.m24342a(Z, (IInterface) zzaom);
        zzfo.m24342a(Z, (IInterface) zzamv);
        mo29280b(14, Z);
    }

    /* renamed from: a */
    public final void mo27525a(String str, String str2, zzxz zzxz, IObjectWrapper iObjectWrapper, zzaos zzaos, zzamv zzamv) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeString(str);
        Z.writeString(str2);
        zzfo.m24343a(Z, (Parcelable) zzxz);
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        zzfo.m24342a(Z, (IInterface) zzaos);
        zzfo.m24342a(Z, (IInterface) zzamv);
        mo29280b(16, Z);
    }

    /* renamed from: a */
    public final void mo27524a(String str, String str2, zzxz zzxz, IObjectWrapper iObjectWrapper, zzaop zzaop, zzamv zzamv) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeString(str);
        Z.writeString(str2);
        zzfo.m24343a(Z, (Parcelable) zzxz);
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        zzfo.m24342a(Z, (IInterface) zzaop);
        zzfo.m24342a(Z, (IInterface) zzamv);
        mo29280b(18, Z);
    }
}
