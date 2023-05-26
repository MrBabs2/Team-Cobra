package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public final class zzamu extends zzfm implements zzams {
    zzamu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* renamed from: B0 */
    public final Bundle mo27402B0() throws RemoteException {
        Parcel a = mo29278a(19, mo29277Z());
        Bundle bundle = (Bundle) zzfo.m24341a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: Q */
    public final IObjectWrapper mo27403Q() throws RemoteException {
        Parcel a = mo29278a(2, mo29277Z());
        IObjectWrapper a2 = IObjectWrapper.Stub.m16389a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzang mo27404U() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo29277Z()
            r1 = 27
            android.os.Parcel r0 = r4.mo29278a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzang
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzang r1 = (com.google.android.gms.internal.ads.zzang) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzani r2 = new com.google.android.gms.internal.ads.zzani
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamu.mo27404U():com.google.android.gms.internal.ads.zzang");
    }

    /* renamed from: a */
    public final void mo27411a(IObjectWrapper iObjectWrapper, zzyd zzyd, zzxz zzxz, String str, zzamv zzamv) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        zzfo.m24343a(Z, (Parcelable) zzyd);
        zzfo.m24343a(Z, (Parcelable) zzxz);
        Z.writeString(str);
        zzfo.m24342a(Z, (IInterface) zzamv);
        mo29280b(1, Z);
    }

    /* renamed from: b */
    public final void mo27415b(IObjectWrapper iObjectWrapper, zzxz zzxz, String str, zzamv zzamv) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        zzfo.m24343a(Z, (Parcelable) zzxz);
        Z.writeString(str);
        zzfo.m24342a(Z, (IInterface) zzamv);
        mo29280b(3, Z);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzand mo27416c1() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo29277Z()
            r1 = 16
            android.os.Parcel r0 = r4.mo29278a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzand
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzand r1 = (com.google.android.gms.internal.ads.zzand) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzanf r2 = new com.google.android.gms.internal.ads.zzanf
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamu.mo27416c1():com.google.android.gms.internal.ads.zzand");
    }

    public final void destroy() throws RemoteException {
        mo29280b(5, mo29277Z());
    }

    /* renamed from: g0 */
    public final zzafe mo27418g0() throws RemoteException {
        Parcel a = mo29278a(24, mo29277Z());
        zzafe a2 = zzaff.m19133a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final Bundle getInterstitialAdapterInfo() throws RemoteException {
        Parcel a = mo29278a(18, mo29277Z());
        Bundle bundle = (Bundle) zzfo.m24341a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final zzaar getVideoController() throws RemoteException {
        Parcel a = mo29278a(26, mo29277Z());
        zzaar a2 = zzaas.m18725a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final boolean isInitialized() throws RemoteException {
        Parcel a = mo29278a(13, mo29277Z());
        boolean a2 = zzfo.m24345a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: n0 */
    public final boolean mo27422n0() throws RemoteException {
        Parcel a = mo29278a(22, mo29277Z());
        boolean a2 = zzfo.m24345a(a);
        a.recycle();
        return a2;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: n1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzana mo27423n1() throws android.os.RemoteException {
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
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzana
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzana r1 = (com.google.android.gms.internal.ads.zzana) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzanc r2 = new com.google.android.gms.internal.ads.zzanc
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamu.mo27423n1():com.google.android.gms.internal.ads.zzana");
    }

    public final void pause() throws RemoteException {
        mo29280b(8, mo29277Z());
    }

    public final void resume() throws RemoteException {
        mo29280b(9, mo29277Z());
    }

    public final void setImmersiveMode(boolean z) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24344a(Z, z);
        mo29280b(25, Z);
    }

    public final void showInterstitial() throws RemoteException {
        mo29280b(4, mo29277Z());
    }

    public final void showVideo() throws RemoteException {
        mo29280b(12, mo29277Z());
    }

    /* renamed from: t */
    public final void mo27429t(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(30, Z);
    }

    /* renamed from: w */
    public final void mo27430w(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        mo29280b(21, Z);
    }

    public final Bundle zzsh() throws RemoteException {
        Parcel a = mo29278a(17, mo29277Z());
        Bundle bundle = (Bundle) zzfo.m24341a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: a */
    public final void mo27412a(IObjectWrapper iObjectWrapper, zzyd zzyd, zzxz zzxz, String str, String str2, zzamv zzamv) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        zzfo.m24343a(Z, (Parcelable) zzyd);
        zzfo.m24343a(Z, (Parcelable) zzxz);
        Z.writeString(str);
        Z.writeString(str2);
        zzfo.m24342a(Z, (IInterface) zzamv);
        mo29280b(6, Z);
    }

    /* renamed from: a */
    public final void mo27409a(IObjectWrapper iObjectWrapper, zzxz zzxz, String str, String str2, zzamv zzamv) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        zzfo.m24343a(Z, (Parcelable) zzxz);
        Z.writeString(str);
        Z.writeString(str2);
        zzfo.m24342a(Z, (IInterface) zzamv);
        mo29280b(7, Z);
    }

    /* renamed from: a */
    public final void mo27408a(IObjectWrapper iObjectWrapper, zzxz zzxz, String str, zzatk zzatk, String str2) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        zzfo.m24343a(Z, (Parcelable) zzxz);
        Z.writeString(str);
        zzfo.m24342a(Z, (IInterface) zzatk);
        Z.writeString(str2);
        mo29280b(10, Z);
    }

    /* renamed from: a */
    public final void mo27413a(zzxz zzxz, String str) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) zzxz);
        Z.writeString(str);
        mo29280b(11, Z);
    }

    /* renamed from: a */
    public final void mo27410a(IObjectWrapper iObjectWrapper, zzxz zzxz, String str, String str2, zzamv zzamv, zzady zzady, List<String> list) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        zzfo.m24343a(Z, (Parcelable) zzxz);
        Z.writeString(str);
        Z.writeString(str2);
        zzfo.m24342a(Z, (IInterface) zzamv);
        zzfo.m24343a(Z, (Parcelable) zzady);
        Z.writeStringList(list);
        mo29280b(14, Z);
    }

    /* renamed from: a */
    public final void mo27414a(zzxz zzxz, String str, String str2) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) zzxz);
        Z.writeString(str);
        Z.writeString(str2);
        mo29280b(20, Z);
    }

    /* renamed from: a */
    public final void mo27406a(IObjectWrapper iObjectWrapper, zzatk zzatk, List<String> list) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        zzfo.m24342a(Z, (IInterface) zzatk);
        Z.writeStringList(list);
        mo29280b(23, Z);
    }

    /* renamed from: a */
    public final void mo27407a(IObjectWrapper iObjectWrapper, zzxz zzxz, String str, zzamv zzamv) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        zzfo.m24343a(Z, (Parcelable) zzxz);
        Z.writeString(str);
        zzfo.m24342a(Z, (IInterface) zzamv);
        mo29280b(28, Z);
    }

    /* renamed from: a */
    public final void mo27405a(IObjectWrapper iObjectWrapper, zzaiq zzaiq, List<zzaiw> list) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        zzfo.m24342a(Z, (IInterface) zzaiq);
        Z.writeTypedList(list);
        mo29280b(31, Z);
    }
}
