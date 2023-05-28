package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

public final class zzagi extends zzfm implements zzagg {
    zzagi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* renamed from: E0 */
    public final List mo27273E0() throws RemoteException {
        Parcel a = mo29278a(23, mo29277Z());
        ArrayList b = zzfo.m24346b(a);
        a.recycle();
        return b;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzaea mo27274a() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo29277Z()
            r1 = 14
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagi.mo27274a():com.google.android.gms.internal.ads.zzaea");
    }

    /* renamed from: b */
    public final String mo27279b() throws RemoteException {
        Parcel a = mo29278a(2, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: c */
    public final String mo27281c() throws RemoteException {
        Parcel a = mo29278a(6, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: d */
    public final String mo27283d() throws RemoteException {
        Parcel a = mo29278a(4, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzaee mo27284d0() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo29277Z()
            r1 = 29
            android.os.Parcel r0 = r4.mo29278a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IMediaContent"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzaee
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzaee r1 = (com.google.android.gms.internal.ads.zzaee) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzaeg r2 = new com.google.android.gms.internal.ads.zzaeg
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagi.mo27284d0():com.google.android.gms.internal.ads.zzaee");
    }

    public final void destroy() throws RemoteException {
        mo29280b(13, mo29277Z());
    }

    /* renamed from: e */
    public final IObjectWrapper mo27286e() throws RemoteException {
        Parcel a = mo29278a(19, mo29277Z());
        IObjectWrapper a2 = IObjectWrapper.Stub.m16389a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: e0 */
    public final boolean mo27287e0() throws RemoteException {
        Parcel a = mo29278a(24, mo29277Z());
        boolean a2 = zzfo.m24345a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: f */
    public final List mo27288f() throws RemoteException {
        Parcel a = mo29278a(3, mo29277Z());
        ArrayList b = zzfo.m24346b(a);
        a.recycle();
        return b;
    }

    public final Bundle getExtras() throws RemoteException {
        Parcel a = mo29278a(20, mo29277Z());
        Bundle bundle = (Bundle) zzfo.m24341a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel a = mo29278a(12, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final String getStore() throws RemoteException {
        Parcel a = mo29278a(9, mo29277Z());
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

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzaei mo27293h() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo29277Z()
            r1 = 5
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagi.mo27293h():com.google.android.gms.internal.ads.zzaei");
    }

    /* renamed from: h1 */
    public final void mo27294h1() throws RemoteException {
        mo29280b(28, mo29277Z());
    }

    /* renamed from: i */
    public final String mo27295i() throws RemoteException {
        Parcel a = mo29278a(10, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: j */
    public final IObjectWrapper mo27296j() throws RemoteException {
        Parcel a = mo29278a(18, mo29277Z());
        IObjectWrapper a2 = IObjectWrapper.Stub.m16389a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: k */
    public final double mo27297k() throws RemoteException {
        Parcel a = mo29278a(8, mo29277Z());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    /* renamed from: l */
    public final String mo27298l() throws RemoteException {
        Parcel a = mo29278a(7, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: u */
    public final void mo27299u() throws RemoteException {
        mo29280b(22, mo29277Z());
    }

    /* renamed from: w */
    public final void mo27300w() throws RemoteException {
        mo29280b(27, mo29277Z());
    }

    /* renamed from: b */
    public final boolean mo27280b(Bundle bundle) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) bundle);
        Parcel a = mo29278a(16, Z);
        boolean a2 = zzfo.m24345a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: c */
    public final void mo27282c(Bundle bundle) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) bundle);
        mo29280b(17, Z);
    }

    /* renamed from: a */
    public final void mo27275a(Bundle bundle) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) bundle);
        mo29280b(15, Z);
    }

    /* renamed from: a */
    public final void mo27278a(zzagd zzagd) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzagd);
        mo29280b(21, Z);
    }

    /* renamed from: a */
    public final void mo27277a(zzaak zzaak) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzaak);
        mo29280b(25, Z);
    }

    /* renamed from: a */
    public final void mo27276a(zzaag zzaag) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzaag);
        mo29280b(26, Z);
    }
}
