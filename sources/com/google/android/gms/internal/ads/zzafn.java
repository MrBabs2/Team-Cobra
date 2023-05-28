package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzafn extends zzfm implements zzafl {
    zzafn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    /* renamed from: a */
    public final void mo27262a(zzafa zzafa) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzafa);
        mo29280b(1, Z);
    }
}
