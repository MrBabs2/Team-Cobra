package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

public final class zzaad extends zzfm implements zzaab {
    zzaad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    /* renamed from: B */
    public final void mo26908B() throws RemoteException {
        mo29280b(1, mo29277Z());
    }

    /* renamed from: G0 */
    public final float mo26909G0() throws RemoteException {
        Parcel a = mo29278a(7, mo29277Z());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    /* renamed from: a */
    public final void mo26910a(float f) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeFloat(f);
        mo29280b(2, Z);
    }

    /* renamed from: b */
    public final void mo26914b(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        Z.writeString(str);
        mo29280b(5, Z);
    }

    /* renamed from: f */
    public final void mo26915f(String str) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeString(str);
        mo29280b(10, Z);
    }

    /* renamed from: g */
    public final void mo26916g(boolean z) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24344a(Z, z);
        mo29280b(4, Z);
    }

    /* renamed from: k0 */
    public final List<zzaio> mo26917k0() throws RemoteException {
        Parcel a = mo29278a(13, mo29277Z());
        ArrayList<zzaio> createTypedArrayList = a.createTypedArrayList(zzaio.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: n */
    public final void mo26918n(String str) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeString(str);
        mo29280b(3, Z);
    }

    /* renamed from: r0 */
    public final String mo26919r0() throws RemoteException {
        Parcel a = mo29278a(9, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: s0 */
    public final boolean mo26920s0() throws RemoteException {
        Parcel a = mo29278a(8, mo29277Z());
        boolean a2 = zzfo.m24345a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo26913a(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeString(str);
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(6, Z);
    }

    /* renamed from: a */
    public final void mo26912a(zzamp zzamp) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzamp);
        mo29280b(11, Z);
    }

    /* renamed from: a */
    public final void mo26911a(zzait zzait) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzait);
        mo29280b(12, Z);
    }
}
