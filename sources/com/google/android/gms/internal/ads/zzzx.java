package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzzx extends zzfm implements zzzv {
    zzzx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzzk zza(com.google.android.gms.dynamic.IObjectWrapper r2, com.google.android.gms.internal.ads.zzyd r3, java.lang.String r4, com.google.android.gms.internal.ads.zzamp r5, int r6) throws android.os.RemoteException {
        /*
            r1 = this;
            android.os.Parcel r0 = r1.mo29277Z()
            com.google.android.gms.internal.ads.zzfo.m24342a((android.os.Parcel) r0, (android.os.IInterface) r2)
            com.google.android.gms.internal.ads.zzfo.m24343a((android.os.Parcel) r0, (android.os.Parcelable) r3)
            r0.writeString(r4)
            com.google.android.gms.internal.ads.zzfo.m24342a((android.os.Parcel) r0, (android.os.IInterface) r5)
            r0.writeInt(r6)
            r2 = 1
            android.os.Parcel r2 = r1.mo29278a(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            if (r3 != 0) goto L_0x0020
            r3 = 0
            goto L_0x0034
        L_0x0020:
            java.lang.String r4 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.zzzk
            if (r5 == 0) goto L_0x002e
            r3 = r4
            com.google.android.gms.internal.ads.zzzk r3 = (com.google.android.gms.internal.ads.zzzk) r3
            goto L_0x0034
        L_0x002e:
            com.google.android.gms.internal.ads.zzzm r4 = new com.google.android.gms.internal.ads.zzzm
            r4.<init>(r3)
            r3 = r4
        L_0x0034:
            r2.recycle()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzx.zza(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.ads.zzyd, java.lang.String, com.google.android.gms.internal.ads.zzamp, int):com.google.android.gms.internal.ads.zzzk");
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzzk zzb(com.google.android.gms.dynamic.IObjectWrapper r2, com.google.android.gms.internal.ads.zzyd r3, java.lang.String r4, com.google.android.gms.internal.ads.zzamp r5, int r6) throws android.os.RemoteException {
        /*
            r1 = this;
            android.os.Parcel r0 = r1.mo29277Z()
            com.google.android.gms.internal.ads.zzfo.m24342a((android.os.Parcel) r0, (android.os.IInterface) r2)
            com.google.android.gms.internal.ads.zzfo.m24343a((android.os.Parcel) r0, (android.os.Parcelable) r3)
            r0.writeString(r4)
            com.google.android.gms.internal.ads.zzfo.m24342a((android.os.Parcel) r0, (android.os.IInterface) r5)
            r0.writeInt(r6)
            r2 = 2
            android.os.Parcel r2 = r1.mo29278a(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            if (r3 != 0) goto L_0x0020
            r3 = 0
            goto L_0x0034
        L_0x0020:
            java.lang.String r4 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.zzzk
            if (r5 == 0) goto L_0x002e
            r3 = r4
            com.google.android.gms.internal.ads.zzzk r3 = (com.google.android.gms.internal.ads.zzzk) r3
            goto L_0x0034
        L_0x002e:
            com.google.android.gms.internal.ads.zzzm r4 = new com.google.android.gms.internal.ads.zzzm
            r4.<init>(r3)
            r3 = r4
        L_0x0034:
            r2.recycle()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzx.zzb(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.ads.zzyd, java.lang.String, com.google.android.gms.internal.ads.zzamp, int):com.google.android.gms.internal.ads.zzzk");
    }

    public final zzaem zzc(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        zzfo.m24342a(Z, (IInterface) iObjectWrapper2);
        Parcel a = mo29278a(5, Z);
        zzaem a2 = zzaen.m19058a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final zzaqg zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        Parcel a = mo29278a(8, Z);
        zzaqg zzac = zzaqh.zzac(a.readStrongBinder());
        a.recycle();
        return zzac;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzaab zzg(com.google.android.gms.dynamic.IObjectWrapper r4) throws android.os.RemoteException {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.mo29277Z()
            com.google.android.gms.internal.ads.zzfo.m24342a((android.os.Parcel) r0, (android.os.IInterface) r4)
            r4 = 4
            android.os.Parcel r4 = r3.mo29278a(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzaab
            if (r2 == 0) goto L_0x0022
            r0 = r1
            com.google.android.gms.internal.ads.zzaab r0 = (com.google.android.gms.internal.ads.zzaab) r0
            goto L_0x0028
        L_0x0022:
            com.google.android.gms.internal.ads.zzaad r1 = new com.google.android.gms.internal.ads.zzaad
            r1.<init>(r0)
            r0 = r1
        L_0x0028:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzx.zzg(com.google.android.gms.dynamic.IObjectWrapper):com.google.android.gms.internal.ads.zzaab");
    }

    public final zzaqq zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        Parcel a = mo29278a(7, Z);
        zzaqq a2 = zzaqr.m19857a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzzf zza(com.google.android.gms.dynamic.IObjectWrapper r2, java.lang.String r3, com.google.android.gms.internal.ads.zzamp r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            android.os.Parcel r0 = r1.mo29277Z()
            com.google.android.gms.internal.ads.zzfo.m24342a((android.os.Parcel) r0, (android.os.IInterface) r2)
            r0.writeString(r3)
            com.google.android.gms.internal.ads.zzfo.m24342a((android.os.Parcel) r0, (android.os.IInterface) r4)
            r0.writeInt(r5)
            r2 = 3
            android.os.Parcel r2 = r1.mo29278a(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            if (r3 != 0) goto L_0x001d
            r3 = 0
            goto L_0x0031
        L_0x001d:
            java.lang.String r4 = "com.google.android.gms.ads.internal.client.IAdLoaderBuilder"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.zzzf
            if (r5 == 0) goto L_0x002b
            r3 = r4
            com.google.android.gms.internal.ads.zzzf r3 = (com.google.android.gms.internal.ads.zzzf) r3
            goto L_0x0031
        L_0x002b:
            com.google.android.gms.internal.ads.zzzh r4 = new com.google.android.gms.internal.ads.zzzh
            r4.<init>(r3)
            r3 = r4
        L_0x0031:
            r2.recycle()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzx.zza(com.google.android.gms.dynamic.IObjectWrapper, java.lang.String, com.google.android.gms.internal.ads.zzamp, int):com.google.android.gms.internal.ads.zzzf");
    }

    public final zzatt zzb(IObjectWrapper iObjectWrapper, String str, zzamp zzamp, int i) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        Z.writeString(str);
        zzfo.m24342a(Z, (IInterface) zzamp);
        Z.writeInt(i);
        Parcel a = mo29278a(12, Z);
        zzatt a2 = zzatu.m19991a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final zzasw zza(IObjectWrapper iObjectWrapper, zzamp zzamp, int i) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        zzfo.m24342a(Z, (IInterface) zzamp);
        Z.writeInt(i);
        Parcel a = mo29278a(6, Z);
        zzasw a2 = zzasx.m19932a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzaab zza(com.google.android.gms.dynamic.IObjectWrapper r3, int r4) throws android.os.RemoteException {
        /*
            r2 = this;
            android.os.Parcel r0 = r2.mo29277Z()
            com.google.android.gms.internal.ads.zzfo.m24342a((android.os.Parcel) r0, (android.os.IInterface) r3)
            r0.writeInt(r4)
            r3 = 9
            android.os.Parcel r3 = r2.mo29278a(r3, r0)
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L_0x0018
            r4 = 0
            goto L_0x002c
        L_0x0018:
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzaab
            if (r1 == 0) goto L_0x0026
            r4 = r0
            com.google.android.gms.internal.ads.zzaab r4 = (com.google.android.gms.internal.ads.zzaab) r4
            goto L_0x002c
        L_0x0026:
            com.google.android.gms.internal.ads.zzaad r0 = new com.google.android.gms.internal.ads.zzaad
            r0.<init>(r4)
            r4 = r0
        L_0x002c:
            r3.recycle()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzx.zza(com.google.android.gms.dynamic.IObjectWrapper, int):com.google.android.gms.internal.ads.zzaab");
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzzk zza(com.google.android.gms.dynamic.IObjectWrapper r2, com.google.android.gms.internal.ads.zzyd r3, java.lang.String r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            android.os.Parcel r0 = r1.mo29277Z()
            com.google.android.gms.internal.ads.zzfo.m24342a((android.os.Parcel) r0, (android.os.IInterface) r2)
            com.google.android.gms.internal.ads.zzfo.m24343a((android.os.Parcel) r0, (android.os.Parcelable) r3)
            r0.writeString(r4)
            r0.writeInt(r5)
            r2 = 10
            android.os.Parcel r2 = r1.mo29278a(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            if (r3 != 0) goto L_0x001e
            r3 = 0
            goto L_0x0032
        L_0x001e:
            java.lang.String r4 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.zzzk
            if (r5 == 0) goto L_0x002c
            r3 = r4
            com.google.android.gms.internal.ads.zzzk r3 = (com.google.android.gms.internal.ads.zzzk) r3
            goto L_0x0032
        L_0x002c:
            com.google.android.gms.internal.ads.zzzm r4 = new com.google.android.gms.internal.ads.zzzm
            r4.<init>(r3)
            r3 = r4
        L_0x0032:
            r2.recycle()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzx.zza(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.ads.zzyd, java.lang.String, int):com.google.android.gms.internal.ads.zzzk");
    }

    public final zzaer zza(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) iObjectWrapper);
        zzfo.m24342a(Z, (IInterface) iObjectWrapper2);
        zzfo.m24342a(Z, (IInterface) iObjectWrapper3);
        Parcel a = mo29278a(11, Z);
        zzaer a2 = zzaes.m19069a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
