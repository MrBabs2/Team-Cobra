package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

public final class zah extends zaa implements ISignInButtonCreator {
    zah(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    /* renamed from: a */
    public final IObjectWrapper mo25371a(IObjectWrapper iObjectWrapper, SignInButtonConfig signInButtonConfig) throws RemoteException {
        Parcel Z = mo29980Z();
        zac.m25822a(Z, (IInterface) iObjectWrapper);
        zac.m25823a(Z, (Parcelable) signInButtonConfig);
        Parcel a = mo29981a(2, Z);
        IObjectWrapper a2 = IObjectWrapper.Stub.m16389a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
