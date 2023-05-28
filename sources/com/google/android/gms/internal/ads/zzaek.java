package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzaek extends zzfm implements zzaei {
    zzaek(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    /* renamed from: D0 */
    public final IObjectWrapper mo27203D0() throws RemoteException {
        Parcel a = mo29278a(1, mo29277Z());
        IObjectWrapper a2 = IObjectWrapper.Stub.m16389a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: F */
    public final Uri mo27204F() throws RemoteException {
        Parcel a = mo29278a(2, mo29277Z());
        Uri uri = (Uri) zzfo.m24341a(a, Uri.CREATOR);
        a.recycle();
        return uri;
    }

    public final int getHeight() throws RemoteException {
        Parcel a = mo29278a(5, mo29277Z());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final int getWidth() throws RemoteException {
        Parcel a = mo29278a(4, mo29277Z());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: t0 */
    public final double mo27207t0() throws RemoteException {
        Parcel a = mo29278a(3, mo29277Z());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }
}
