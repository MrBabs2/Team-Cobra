package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

public final class zag extends zaa implements zaf {
    zag(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: a */
    public final void mo30693a(IAccountAccessor iAccountAccessor, int i, boolean z) throws RemoteException {
        Parcel Z = mo29980Z();
        zac.m25822a(Z, (IInterface) iAccountAccessor);
        Z.writeInt(i);
        zac.m25824a(Z, z);
        mo29983b(9, Z);
    }

    /* renamed from: g */
    public final void mo30695g(int i) throws RemoteException {
        Parcel Z = mo29980Z();
        Z.writeInt(i);
        mo29983b(7, Z);
    }

    /* renamed from: a */
    public final void mo30694a(zah zah, zad zad) throws RemoteException {
        Parcel Z = mo29980Z();
        zac.m25823a(Z, (Parcelable) zah);
        zac.m25822a(Z, (IInterface) zad);
        mo29983b(12, Z);
    }
}
