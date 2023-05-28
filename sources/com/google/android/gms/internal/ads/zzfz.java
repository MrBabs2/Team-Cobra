package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzfz extends zzfm implements zzfx {
    zzfz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    /* renamed from: a */
    public final void mo29284a(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        Z.writeString(str);
        mo29280b(2, Z);
    }

    /* renamed from: b1 */
    public final void mo29288b1() throws RemoteException {
        mo29280b(3, mo29277Z());
    }

    /* renamed from: f */
    public final void mo29289f(int i) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeInt(i);
        mo29280b(7, Z);
    }

    /* renamed from: l */
    public final void mo29290l(int i) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeInt(i);
        mo29280b(6, Z);
    }

    /* renamed from: a */
    public final void mo29287a(int[] iArr) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeIntArray((int[]) null);
        mo29280b(4, Z);
    }

    /* renamed from: a */
    public final void mo29286a(byte[] bArr) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeByteArray(bArr);
        mo29280b(5, Z);
    }

    /* renamed from: a */
    public final void mo29285a(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        Z.writeString(str);
        Z.writeString((String) null);
        mo29280b(8, Z);
    }
}
