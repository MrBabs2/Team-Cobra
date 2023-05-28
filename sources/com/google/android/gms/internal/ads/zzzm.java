package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzzm extends zzfm implements zzzk {
    zzzm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* renamed from: I */
    public final IObjectWrapper mo27066I() throws RemoteException {
        Parcel a = mo29278a(1, mo29277Z());
        IObjectWrapper a2 = IObjectWrapper.Stub.m16389a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: I0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzzs mo27067I0() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo29277Z()
            r1 = 32
            android.os.Parcel r0 = r4.mo29278a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAppEventListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzzs
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzzs r1 = (com.google.android.gms.internal.ads.zzzs) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzzu r2 = new com.google.android.gms.internal.ads.zzzu
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzm.mo27067I0():com.google.android.gms.internal.ads.zzzs");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: S0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzyz mo27068S0() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo29277Z()
            r1 = 33
            android.os.Parcel r0 = r4.mo29278a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzyz
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzyz r1 = (com.google.android.gms.internal.ads.zzyz) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzzb r2 = new com.google.android.gms.internal.ads.zzzb
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzm.mo27068S0():com.google.android.gms.internal.ads.zzyz");
    }

    /* renamed from: V0 */
    public final zzyd mo27069V0() throws RemoteException {
        Parcel a = mo29278a(12, mo29277Z());
        zzyd zzyd = (zzyd) zzfo.m24341a(a, zzyd.CREATOR);
        a.recycle();
        return zzyd;
    }

    /* renamed from: a */
    public final void mo27078a(zzyz zzyz) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzyz);
        mo29280b(7, Z);
    }

    /* renamed from: b */
    public final boolean mo27082b(zzxz zzxz) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) zzxz);
        Parcel a = mo29278a(4, Z);
        boolean a2 = zzfo.m24345a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: d1 */
    public final String mo27083d1() throws RemoteException {
        Parcel a = mo29278a(31, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void destroy() throws RemoteException {
        mo29280b(2, mo29277Z());
    }

    /* renamed from: f */
    public final void mo27085f(boolean z) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24344a(Z, z);
        mo29280b(22, Z);
    }

    /* renamed from: g1 */
    public final void mo27086g1() throws RemoteException {
        mo29280b(11, mo29277Z());
    }

    public final Bundle getAdMetadata() throws RemoteException {
        Parcel a = mo29278a(37, mo29277Z());
        Bundle bundle = (Bundle) zzfo.m24341a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel a = mo29278a(18, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzaar getVideoController() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo29277Z()
            r1 = 26
            android.os.Parcel r0 = r4.mo29278a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoController"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzaar
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzaar r1 = (com.google.android.gms.internal.ads.zzaar) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzaat r2 = new com.google.android.gms.internal.ads.zzaat
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzm.getVideoController():com.google.android.gms.internal.ads.zzaar");
    }

    /* renamed from: k */
    public final void mo27090k(String str) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeString(str);
        mo29280b(38, Z);
    }

    /* renamed from: m */
    public final boolean mo27091m() throws RemoteException {
        Parcel a = mo29278a(3, mo29277Z());
        boolean a2 = zzfo.m24345a(a);
        a.recycle();
        return a2;
    }

    public final void pause() throws RemoteException {
        mo29280b(5, mo29277Z());
    }

    public final void resume() throws RemoteException {
        mo29280b(6, mo29277Z());
    }

    public final void setImmersiveMode(boolean z) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24344a(Z, z);
        mo29280b(34, Z);
    }

    public final void setUserId(String str) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeString(str);
        mo29280b(25, Z);
    }

    public final void showInterstitial() throws RemoteException {
        mo29280b(9, mo29277Z());
    }

    /* renamed from: v */
    public final String mo27097v() throws RemoteException {
        Parcel a = mo29278a(35, mo29277Z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: w0 */
    public final void mo27098w0() throws RemoteException {
        mo29280b(10, mo29277Z());
    }

    /* renamed from: y */
    public final boolean mo27099y() throws RemoteException {
        Parcel a = mo29278a(23, mo29277Z());
        boolean a2 = zzfo.m24345a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo27080a(zzzs zzzs) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzzs);
        mo29280b(8, Z);
    }

    /* renamed from: a */
    public final void mo27076a(zzyd zzyd) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) zzyd);
        mo29280b(13, Z);
    }

    /* renamed from: a */
    public final void mo27073a(zzaqn zzaqn) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzaqn);
        mo29280b(14, Z);
    }

    /* renamed from: a */
    public final void mo27074a(zzaqt zzaqt, String str) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzaqt);
        Z.writeString(str);
        mo29280b(15, Z);
    }

    /* renamed from: a */
    public final void mo27072a(zzado zzado) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzado);
        mo29280b(19, Z);
    }

    /* renamed from: a */
    public final void mo27077a(zzyw zzyw) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzyw);
        mo29280b(20, Z);
    }

    /* renamed from: a */
    public final void mo27081a(zzzy zzzy) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzzy);
        mo29280b(21, Z);
    }

    /* renamed from: a */
    public final void mo27075a(zzatb zzatb) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzatb);
        mo29280b(24, Z);
    }

    /* renamed from: a */
    public final void mo27071a(zzacd zzacd) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) zzacd);
        mo29280b(29, Z);
    }

    /* renamed from: a */
    public final void mo27070a(zzaax zzaax) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) zzaax);
        mo29280b(30, Z);
    }

    /* renamed from: a */
    public final void mo27079a(zzzp zzzp) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzzp);
        mo29280b(36, Z);
    }
}
