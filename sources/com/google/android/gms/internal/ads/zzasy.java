package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzasy extends zzfm implements zzasw {
    zzasy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* renamed from: B */
    public final void mo27121B(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(10, Z);
    }

    /* renamed from: F */
    public final void mo27122F(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(9, Z);
    }

    /* renamed from: a */
    public final void mo27125a(zzath zzath) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) zzath);
        mo29280b(1, Z);
    }

    public final void destroy() throws RemoteException {
        mo29280b(8, mo29277Z());
    }

    public final Bundle getAdMetadata() throws RemoteException {
        Parcel a = mo29278a(15, mo29277Z());
        Bundle bundle = (Bundle) zzfo.m24341a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel a = mo29278a(12, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final boolean isLoaded() throws RemoteException {
        Parcel a = mo29278a(5, mo29277Z());
        boolean a2 = zzfo.m24345a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: k */
    public final void mo27131k(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(11, Z);
    }

    /* renamed from: o */
    public final void mo27132o(String str) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeString(str);
        mo29280b(17, Z);
    }

    public final void pause() throws RemoteException {
        mo29280b(6, mo29277Z());
    }

    public final void resume() throws RemoteException {
        mo29280b(7, mo29277Z());
    }

    public final void setCustomData(String str) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeString(str);
        mo29280b(19, Z);
    }

    public final void setImmersiveMode(boolean z) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24344a(Z, z);
        mo29280b(34, Z);
    }

    public final void setUserId(String str) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeString(str);
        mo29280b(13, Z);
    }

    public final void show() throws RemoteException {
        mo29280b(2, mo29277Z());
    }

    /* renamed from: v */
    public final void mo27139v(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(18, Z);
    }

    /* renamed from: a */
    public final void mo27124a(zzatb zzatb) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzatb);
        mo29280b(3, Z);
    }

    /* renamed from: a */
    public final void mo27126a(zzzp zzzp) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzzp);
        mo29280b(14, Z);
    }

    /* renamed from: a */
    public final void mo27123a(zzasu zzasu) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzasu);
        mo29280b(16, Z);
    }
}
