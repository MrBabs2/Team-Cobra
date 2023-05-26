package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class zzamx extends zzfm implements zzamv {
    zzamx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    /* renamed from: J */
    public final void mo27432J() throws RemoteException {
        mo29280b(13, mo29277Z());
    }

    /* renamed from: a */
    public final void mo27434a(zzamy zzamy) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzamy);
        mo29280b(7, Z);
    }

    /* renamed from: c */
    public final void mo27437c(int i) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeInt(i);
        mo29280b(17, Z);
    }

    /* renamed from: i */
    public final void mo27438i(String str) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeString(str);
        mo29280b(12, Z);
    }

    /* renamed from: j1 */
    public final void mo27439j1() throws RemoteException {
        mo29280b(18, mo29277Z());
    }

    public final void onAdClicked() throws RemoteException {
        mo29280b(1, mo29277Z());
    }

    public final void onAdClosed() throws RemoteException {
        mo29280b(2, mo29277Z());
    }

    public final void onAdFailedToLoad(int i) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeInt(i);
        mo29280b(3, Z);
    }

    public final void onAdImpression() throws RemoteException {
        mo29280b(8, mo29277Z());
    }

    public final void onAdLeftApplication() throws RemoteException {
        mo29280b(4, mo29277Z());
    }

    public final void onAdLoaded() throws RemoteException {
        mo29280b(6, mo29277Z());
    }

    public final void onAdOpened() throws RemoteException {
        mo29280b(5, mo29277Z());
    }

    public final void onAppEvent(String str, String str2) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeString(str);
        Z.writeString(str2);
        mo29280b(9, Z);
    }

    public final void onVideoPause() throws RemoteException {
        mo29280b(15, mo29277Z());
    }

    public final void onVideoPlay() throws RemoteException {
        mo29280b(20, mo29277Z());
    }

    /* renamed from: x */
    public final void mo27450x() throws RemoteException {
        mo29280b(11, mo29277Z());
    }

    public final void zzb(Bundle bundle) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) bundle);
        mo29280b(19, Z);
    }

    /* renamed from: a */
    public final void mo27433a(zzafe zzafe, String str) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzafe);
        Z.writeString(str);
        mo29280b(10, Z);
    }

    /* renamed from: a */
    public final void mo27435a(zzato zzato) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) zzato);
        mo29280b(14, Z);
    }

    /* renamed from: a */
    public final void mo27436a(zzatq zzatq) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzatq);
        mo29280b(16, Z);
    }
}
