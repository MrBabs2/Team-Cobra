package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzadn extends zzfm implements zzadl {
    zzadn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    /* renamed from: Y0 */
    public final String mo27187Y0() throws RemoteException {
        Parcel a = mo29278a(1, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final String getContent() throws RemoteException {
        Parcel a = mo29278a(2, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: h */
    public final void mo27189h(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(3, Z);
    }

    public final void recordClick() throws RemoteException {
        mo29280b(4, mo29277Z());
    }

    public final void recordImpression() throws RemoteException {
        mo29280b(5, mo29277Z());
    }
}
