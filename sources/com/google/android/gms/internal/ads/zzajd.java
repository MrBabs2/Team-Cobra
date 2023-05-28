package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzajd extends zzfm implements zzajc {
    zzajd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    /* renamed from: h */
    public final void mo27332h(int i) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeInt(i);
        mo29280b(2, Z);
    }

    /* renamed from: o1 */
    public final void mo27333o1() throws RemoteException {
        mo29280b(1, mo29277Z());
    }
}
