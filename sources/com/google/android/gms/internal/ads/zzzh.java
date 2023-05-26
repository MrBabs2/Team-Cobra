package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

public final class zzzh extends zzfm implements zzzf {
    zzzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzzc mo27054T() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo29277Z()
            r1 = 1
            android.os.Parcel r0 = r4.mo29278a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdLoader"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzzc
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.internal.ads.zzzc r1 = (com.google.android.gms.internal.ads.zzzc) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.internal.ads.zzze r2 = new com.google.android.gms.internal.ads.zzze
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzh.mo27054T():com.google.android.gms.internal.ads.zzzc");
    }

    /* renamed from: a */
    public final void mo27057a(zzafi zzafi) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzafi);
        mo29280b(3, Z);
    }

    /* renamed from: b */
    public final void mo27064b(zzyz zzyz) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzyz);
        mo29280b(2, Z);
    }

    /* renamed from: a */
    public final void mo27058a(zzafl zzafl) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzafl);
        mo29280b(4, Z);
    }

    /* renamed from: b */
    public final void mo27065b(zzzy zzzy) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzzy);
        mo29280b(7, Z);
    }

    /* renamed from: a */
    public final void mo27063a(String str, zzafr zzafr, zzafo zzafo) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeString(str);
        zzfo.m24342a(Z, (IInterface) zzafr);
        zzfo.m24342a(Z, (IInterface) zzafo);
        mo29280b(5, Z);
    }

    /* renamed from: a */
    public final void mo27056a(zzady zzady) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) zzady);
        mo29280b(6, Z);
    }

    /* renamed from: a */
    public final void mo27059a(zzafu zzafu, zzyd zzyd) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzafu);
        zzfo.m24343a(Z, (Parcelable) zzyd);
        mo29280b(8, Z);
    }

    /* renamed from: a */
    public final void mo27055a(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) publisherAdViewOptions);
        mo29280b(9, Z);
    }

    /* renamed from: a */
    public final void mo27060a(zzafx zzafx) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzafx);
        mo29280b(10, Z);
    }

    /* renamed from: a */
    public final void mo27061a(zzaiy zzaiy) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24343a(Z, (Parcelable) zzaiy);
        mo29280b(13, Z);
    }

    /* renamed from: a */
    public final void mo27062a(zzaje zzaje) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzaje);
        mo29280b(14, Z);
    }
}
