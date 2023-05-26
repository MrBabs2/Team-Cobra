package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

public final class zzaec extends zzfm implements zzaea {
    zzaec(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    /* renamed from: H */
    public final List<zzaei> mo27193H() throws RemoteException {
        Parcel a = mo29278a(3, mo29277Z());
        ArrayList b = zzfo.m24346b(a);
        a.recycle();
        return b;
    }

    /* renamed from: M */
    public final String mo27194M() throws RemoteException {
        Parcel a = mo29278a(2, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
