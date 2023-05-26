package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzaat extends zzfm implements zzaar {
    zzaat(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    /* renamed from: K */
    public final boolean mo26927K() throws RemoteException {
        Parcel a = mo29278a(12, mo29277Z());
        boolean a2 = zzfo.m24345a(a);
        a.recycle();
        return a2;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: N0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzaau mo26928N0() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo29277Z()
            r1 = 11
            android.os.Parcel r0 = r4.mo29278a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzaau
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzaau r1 = (com.google.android.gms.internal.ads.zzaau) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzaaw r2 = new com.google.android.gms.internal.ads.zzaaw
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaat.mo26928N0():com.google.android.gms.internal.ads.zzaau");
    }

    /* renamed from: P0 */
    public final void mo26929P0() throws RemoteException {
        mo29280b(1, mo29277Z());
    }

    /* renamed from: Q0 */
    public final boolean mo26930Q0() throws RemoteException {
        Parcel a = mo29278a(10, mo29277Z());
        boolean a2 = zzfo.m24345a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: R */
    public final boolean mo26931R() throws RemoteException {
        Parcel a = mo29278a(4, mo29277Z());
        boolean a2 = zzfo.m24345a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: Z0 */
    public final float mo26932Z0() throws RemoteException {
        Parcel a = mo29278a(7, mo29277Z());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    /* renamed from: a */
    public final void mo26933a(zzaau zzaau) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzaau);
        mo29280b(8, Z);
    }

    /* renamed from: h */
    public final void mo26934h(boolean z) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24344a(Z, z);
        mo29280b(3, Z);
    }

    /* renamed from: l1 */
    public final float mo26935l1() throws RemoteException {
        Parcel a = mo29278a(6, mo29277Z());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    /* renamed from: o */
    public final int mo26936o() throws RemoteException {
        Parcel a = mo29278a(5, mo29277Z());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final void pause() throws RemoteException {
        mo29280b(2, mo29277Z());
    }

    /* renamed from: t */
    public final float mo26938t() throws RemoteException {
        Parcel a = mo29278a(9, mo29277Z());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }
}
