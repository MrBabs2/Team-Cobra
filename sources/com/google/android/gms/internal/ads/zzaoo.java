package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzaoo extends zzfm implements zzaom {
    zzaoo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    /* renamed from: a */
    public final void mo25873a(String str) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeString(str);
        mo29280b(3, Z);
    }

    /* renamed from: s */
    public final void mo25874s() throws RemoteException {
        mo29280b(2, mo29277Z());
    }
}
