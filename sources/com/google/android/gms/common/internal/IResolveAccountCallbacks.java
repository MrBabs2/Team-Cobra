package com.google.android.gms.common.internal;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

public interface IResolveAccountCallbacks extends IInterface {

    public static abstract class Stub extends zab implements IResolveAccountCallbacks {

        public static class Proxy extends zaa implements IResolveAccountCallbacks {
            /* renamed from: a */
            public void mo25370a(ResolveAccountResponse resolveAccountResponse) throws RemoteException {
                Parcel Z = mo29980Z();
                zac.m25823a(Z, (Parcelable) resolveAccountResponse);
                mo29983b(2, Z);
            }
        }

        public Stub() {
            super("com.google.android.gms.common.internal.IResolveAccountCallbacks");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo25060a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 2) {
                return false;
            }
            mo25370a((ResolveAccountResponse) zac.m25821a(parcel, ResolveAccountResponse.CREATOR));
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: a */
    void mo25370a(ResolveAccountResponse resolveAccountResponse) throws RemoteException;
}
