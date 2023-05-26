package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzatv extends zzfm implements zzatt {
    zzatv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    /* renamed from: a */
    public final void mo27115a(zzxz zzxz, zzaub zzaub) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) zzxz);
        zzfo.m24342a(Z, (IInterface) zzaub);
        mo29280b(1, Z);
    }

    public final Bundle getAdMetadata() throws RemoteException {
        Parcel a = mo29278a(9, mo29277Z());
        Bundle bundle = (Bundle) zzfo.m24341a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel a = mo29278a(4, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final boolean isLoaded() throws RemoteException {
        Parcel a = mo29278a(3, mo29277Z());
        boolean a2 = zzfo.m24345a(a);
        a.recycle();
        return a2;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: k1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzatq mo27119k1() throws android.os.RemoteException {
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
            java.lang.String r2 = "com.google.android.gms.ads.internal.rewarded.client.IRewardItem"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzatq
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzatq r1 = (com.google.android.gms.internal.ads.zzatq) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzats r2 = new com.google.android.gms.internal.ads.zzats
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzatv.mo27119k1():com.google.android.gms.internal.ads.zzatq");
    }

    /* renamed from: y */
    public final void mo27120y(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(5, Z);
    }

    /* renamed from: a */
    public final void mo27112a(zzatw zzatw) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzatw);
        mo29280b(2, Z);
    }

    /* renamed from: a */
    public final void mo27113a(zzaue zzaue) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzaue);
        mo29280b(6, Z);
    }

    /* renamed from: a */
    public final void mo27114a(zzaum zzaum) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) zzaum);
        mo29280b(7, Z);
    }

    /* renamed from: a */
    public final void mo27111a(zzaao zzaao) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzaao);
        mo29280b(8, Z);
    }

    /* renamed from: a */
    public final void mo27110a(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        zzfo.m24344a(Z, z);
        mo29280b(10, Z);
    }
}
