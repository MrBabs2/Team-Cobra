package com.google.android.gms.common.api.internal;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

public interface IStatusCallback extends IInterface {

    public static abstract class Stub extends zab implements IStatusCallback {

        public static class zaa extends com.google.android.gms.internal.base.zaa implements IStatusCallback {
            /* renamed from: d */
            public final void mo25059d(Status status) throws RemoteException {
                Parcel Z = mo29980Z();
                zac.m25823a(Z, (Parcelable) status);
                mo29984c(1, Z);
            }
        }

        public Stub() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo25060a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            mo25059d((Status) zac.m25821a(parcel, Status.CREATOR));
            return true;
        }
    }

    /* renamed from: d */
    void mo25059d(Status status) throws RemoteException;
}
