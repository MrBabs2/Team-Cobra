package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class zzj extends zza implements zzi {
    zzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: a */
    public final IObjectWrapper mo25553a(IObjectWrapper iObjectWrapper, String str, int i) throws RemoteException {
        Parcel B = mo30003B();
        zzc.m25834a(B, (IInterface) iObjectWrapper);
        B.writeString(str);
        B.writeInt(i);
        Parcel a = mo30004a(2, B);
        IObjectWrapper a2 = IObjectWrapper.Stub.m16389a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final int mo25554b(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel B = mo30003B();
        zzc.m25834a(B, (IInterface) iObjectWrapper);
        B.writeString(str);
        zzc.m25836a(B, z);
        Parcel a = mo30004a(3, B);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: f1 */
    public final int mo25556f1() throws RemoteException {
        Parcel a = mo30004a(6, mo30003B());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: a */
    public final int mo25552a(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel B = mo30003B();
        zzc.m25834a(B, (IInterface) iObjectWrapper);
        B.writeString(str);
        zzc.m25836a(B, z);
        Parcel a = mo30004a(5, B);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: b */
    public final IObjectWrapper mo25555b(IObjectWrapper iObjectWrapper, String str, int i) throws RemoteException {
        Parcel B = mo30003B();
        zzc.m25834a(B, (IInterface) iObjectWrapper);
        B.writeString(str);
        B.writeInt(i);
        Parcel a = mo30004a(4, B);
        IObjectWrapper a2 = IObjectWrapper.Stub.m16389a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
