package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public final class zzaiv extends zzfm implements zzait {
    zzaiv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    /* renamed from: b */
    public final void mo27321b(List<zzaio> list) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeTypedList(list);
        mo29280b(1, Z);
    }
}
