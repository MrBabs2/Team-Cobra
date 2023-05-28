package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzamr extends zzfm implements zzamp {
    zzamr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* renamed from: g */
    public final zzaov mo27399g(String str) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeString(str);
        Parcel a = mo29278a(3, Z);
        zzaov a2 = zzaow.m19768a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzams mo27400q(java.lang.String r4) throws android.os.RemoteException {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.mo29277Z()
            r0.writeString(r4)
            r4 = 1
            android.os.Parcel r4 = r3.mo29278a(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzams
            if (r2 == 0) goto L_0x0022
            r0 = r1
            com.google.android.gms.internal.ads.zzams r0 = (com.google.android.gms.internal.ads.zzams) r0
            goto L_0x0028
        L_0x0022:
            com.google.android.gms.internal.ads.zzamu r1 = new com.google.android.gms.internal.ads.zzamu
            r1.<init>(r0)
            r0 = r1
        L_0x0028:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamr.mo27400q(java.lang.String):com.google.android.gms.internal.ads.zzams");
    }

    /* renamed from: r */
    public final boolean mo27401r(String str) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeString(str);
        Parcel a = mo29278a(2, Z);
        boolean a2 = zzfo.m24345a(a);
        a.recycle();
        return a2;
    }
}
