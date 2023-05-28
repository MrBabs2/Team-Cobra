package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

public final class zzafc extends zzfm implements zzafa {
    zzafc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzaei mo27233C() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo29277Z()
            r1 = 6
            android.os.Parcel r0 = r4.mo29278a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzaei
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.internal.ads.zzaei r1 = (com.google.android.gms.internal.ads.zzaei) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.internal.ads.zzaek r2 = new com.google.android.gms.internal.ads.zzaek
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafc.mo27233C():com.google.android.gms.internal.ads.zzaei");
    }

    /* renamed from: a */
    public final void mo27235a(Bundle bundle) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) bundle);
        mo29280b(12, Z);
    }

    /* renamed from: b */
    public final String mo27236b() throws RemoteException {
        Parcel a = mo29278a(3, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: c */
    public final String mo27238c() throws RemoteException {
        Parcel a = mo29278a(7, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: d */
    public final String mo27240d() throws RemoteException {
        Parcel a = mo29278a(5, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void destroy() throws RemoteException {
        mo29280b(10, mo29277Z());
    }

    /* renamed from: e */
    public final IObjectWrapper mo27242e() throws RemoteException {
        Parcel a = mo29278a(16, mo29277Z());
        IObjectWrapper a2 = IObjectWrapper.Stub.m16389a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: f */
    public final List mo27243f() throws RemoteException {
        Parcel a = mo29278a(4, mo29277Z());
        ArrayList b = zzfo.m24346b(a);
        a.recycle();
        return b;
    }

    public final Bundle getExtras() throws RemoteException {
        Parcel a = mo29278a(9, mo29277Z());
        Bundle bundle = (Bundle) zzfo.m24341a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel a = mo29278a(17, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final zzaar getVideoController() throws RemoteException {
        Parcel a = mo29278a(11, mo29277Z());
        zzaar a2 = zzaas.m18725a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: j */
    public final IObjectWrapper mo27247j() throws RemoteException {
        Parcel a = mo29278a(2, mo29277Z());
        IObjectWrapper a2 = IObjectWrapper.Stub.m16389a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: l */
    public final String mo27248l() throws RemoteException {
        Parcel a = mo29278a(8, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzaea mo27234a() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo29277Z()
            r1 = 15
            android.os.Parcel r0 = r4.mo29278a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IAttributionInfo"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzaea
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzaea r1 = (com.google.android.gms.internal.ads.zzaea) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzaec r2 = new com.google.android.gms.internal.ads.zzaec
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafc.mo27234a():com.google.android.gms.internal.ads.zzaea");
    }

    /* renamed from: b */
    public final boolean mo27237b(Bundle bundle) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) bundle);
        Parcel a = mo29278a(13, Z);
        boolean a2 = zzfo.m24345a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: c */
    public final void mo27239c(Bundle bundle) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) bundle);
        mo29280b(14, Z);
    }
}
