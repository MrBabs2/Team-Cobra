package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class zzl extends zza implements zzk {
    zzl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: a */
    public final IObjectWrapper mo25557a(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel B = mo30003B();
        zzc.m25834a(B, (IInterface) iObjectWrapper);
        B.writeString(str);
        B.writeInt(i);
        zzc.m25834a(B, (IInterface) iObjectWrapper2);
        Parcel a = mo30004a(2, B);
        IObjectWrapper a2 = IObjectWrapper.Stub.m16389a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final IObjectWrapper mo25558b(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel B = mo30003B();
        zzc.m25834a(B, (IInterface) iObjectWrapper);
        B.writeString(str);
        B.writeInt(i);
        zzc.m25834a(B, (IInterface) iObjectWrapper2);
        Parcel a = mo30004a(3, B);
        IObjectWrapper a2 = IObjectWrapper.Stub.m16389a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
