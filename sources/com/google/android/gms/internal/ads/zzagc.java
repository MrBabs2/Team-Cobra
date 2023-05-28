package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzagc extends zzfm implements zzaga {
    zzagc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    /* renamed from: n */
    public final boolean mo27270n(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        Parcel a = mo29278a(2, Z);
        boolean a2 = zzfo.m24345a(a);
        a.recycle();
        return a2;
    }
}
