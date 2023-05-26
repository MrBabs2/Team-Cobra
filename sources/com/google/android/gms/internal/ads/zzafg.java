package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

public final class zzafg extends zzfm implements zzafe {
    zzafg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    /* renamed from: L0 */
    public final IObjectWrapper mo27249L0() throws RemoteException {
        Parcel a = mo29278a(9, mo29277Z());
        IObjectWrapper a2 = IObjectWrapper.Stub.m16389a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: c */
    public final String mo27250c(String str) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeString(str);
        Parcel a = mo29278a(1, Z);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void destroy() throws RemoteException {
        mo29280b(8, mo29277Z());
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzaei mo27252e(java.lang.String r4) throws android.os.RemoteException {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.mo29277Z()
            r0.writeString(r4)
            r4 = 2
            android.os.Parcel r4 = r3.mo29278a(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzaei
            if (r2 == 0) goto L_0x0022
            r0 = r1
            com.google.android.gms.internal.ads.zzaei r0 = (com.google.android.gms.internal.ads.zzaei) r0
            goto L_0x0028
        L_0x0022:
            com.google.android.gms.internal.ads.zzaek r1 = new com.google.android.gms.internal.ads.zzaek
            r1.<init>(r0)
            r0 = r1
        L_0x0028:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafg.mo27252e(java.lang.String):com.google.android.gms.internal.ads.zzaei");
    }

    public final List<String> getAvailableAssetNames() throws RemoteException {
        Parcel a = mo29278a(3, mo29277Z());
        ArrayList<String> createStringArrayList = a.createStringArrayList();
        a.recycle();
        return createStringArrayList;
    }

    public final String getCustomTemplateId() throws RemoteException {
        Parcel a = mo29278a(4, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final zzaar getVideoController() throws RemoteException {
        Parcel a = mo29278a(7, mo29277Z());
        zzaar a2 = zzaas.m18725a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: j */
    public final IObjectWrapper mo27256j() throws RemoteException {
        Parcel a = mo29278a(11, mo29277Z());
        IObjectWrapper a2 = IObjectWrapper.Stub.m16389a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void performClick(String str) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeString(str);
        mo29280b(5, Z);
    }

    /* renamed from: r */
    public final boolean mo27258r(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        Parcel a = mo29278a(10, Z);
        boolean a2 = zzfo.m24345a(a);
        a.recycle();
        return a2;
    }

    public final void recordImpression() throws RemoteException {
        mo29280b(6, mo29277Z());
    }
}
