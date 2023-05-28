package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzatm extends zzfm implements zzatk {
    zzatm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    /* renamed from: C */
    public final void mo26031C(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(6, Z);
    }

    /* renamed from: E */
    public final void mo26032E(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(8, Z);
    }

    /* renamed from: a */
    public final void mo26033a(IObjectWrapper iObjectWrapper, zzato zzato) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        zzfo.m24343a(Z, (Parcelable) zzato);
        mo29280b(7, Z);
    }

    /* renamed from: b */
    public final void mo26034b(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        Z.writeInt(i);
        mo29280b(2, Z);
    }

    /* renamed from: c */
    public final void mo26035c(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        Z.writeInt(i);
        mo29280b(9, Z);
    }

    /* renamed from: g */
    public final void mo26036g(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(4, Z);
    }

    /* renamed from: j */
    public final void mo26037j(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(5, Z);
    }

    /* renamed from: o */
    public final void mo26038o(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(1, Z);
    }

    /* renamed from: q */
    public final void mo26039q(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(3, Z);
    }

    /* renamed from: u */
    public final void mo26040u(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(10, Z);
    }

    /* renamed from: x */
    public final void mo26041x(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(11, Z);
    }

    public final void zzb(Bundle bundle) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) bundle);
        mo29280b(12, Z);
    }
}
