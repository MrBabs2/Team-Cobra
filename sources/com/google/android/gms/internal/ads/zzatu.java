package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzatu extends zzfn implements zzatt {
    public zzatu() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    /* renamed from: a */
    public static zzatt m19991a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        if (queryLocalInterface instanceof zzatt) {
            return (zzatt) queryLocalInterface;
        }
        return new zzatv(iBinder);
    }

    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v2, types: [com.google.android.gms.internal.ads.zzaub] */
    /* JADX WARNING: type inference failed for: r5v7, types: [com.google.android.gms.internal.ads.zzatw] */
    /* JADX WARNING: type inference failed for: r5v12, types: [com.google.android.gms.internal.ads.zzaue] */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: type inference failed for: r5v21 */
    /* JADX WARNING: type inference failed for: r5v22 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            r5 = 0
            switch(r2) {
                case 1: goto L_0x00ba;
                case 2: goto L_0x0099;
                case 3: goto L_0x008e;
                case 4: goto L_0x0083;
                case 5: goto L_0x0074;
                case 6: goto L_0x0052;
                case 7: goto L_0x0042;
                case 8: goto L_0x0032;
                case 9: goto L_0x0026;
                case 10: goto L_0x0012;
                case 11: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r2 = 0
            return r2
        L_0x0006:
            com.google.android.gms.internal.ads.zzatq r2 = r1.mo27119k1()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24342a((android.os.Parcel) r4, (android.os.IInterface) r2)
            goto L_0x00e1
        L_0x0012:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r2)
            boolean r3 = com.google.android.gms.internal.ads.zzfo.m24345a(r3)
            r1.mo27110a((com.google.android.gms.dynamic.IObjectWrapper) r2, (boolean) r3)
            r4.writeNoException()
            goto L_0x00e1
        L_0x0026:
            android.os.Bundle r2 = r1.getAdMetadata()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24347b(r4, r2)
            goto L_0x00e1
        L_0x0032:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.zzaao r2 = com.google.android.gms.internal.ads.zzaap.m18713a(r2)
            r1.mo27111a((com.google.android.gms.internal.ads.zzaao) r2)
            r4.writeNoException()
            goto L_0x00e1
        L_0x0042:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzaum> r2 = com.google.android.gms.internal.ads.zzaum.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzfo.m24341a((android.os.Parcel) r3, r2)
            com.google.android.gms.internal.ads.zzaum r2 = (com.google.android.gms.internal.ads.zzaum) r2
            r1.mo27114a((com.google.android.gms.internal.ads.zzaum) r2)
            r4.writeNoException()
            goto L_0x00e1
        L_0x0052:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x0059
            goto L_0x006c
        L_0x0059:
            java.lang.String r3 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.zzaue
            if (r5 == 0) goto L_0x0067
            r5 = r3
            com.google.android.gms.internal.ads.zzaue r5 = (com.google.android.gms.internal.ads.zzaue) r5
            goto L_0x006c
        L_0x0067:
            com.google.android.gms.internal.ads.zzauf r5 = new com.google.android.gms.internal.ads.zzauf
            r5.<init>(r2)
        L_0x006c:
            r1.mo27113a((com.google.android.gms.internal.ads.zzaue) r5)
            r4.writeNoException()
            goto L_0x00e1
        L_0x0074:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r2)
            r1.mo27120y(r2)
            r4.writeNoException()
            goto L_0x00e1
        L_0x0083:
            java.lang.String r2 = r1.getMediationAdapterClassName()
            r4.writeNoException()
            r4.writeString(r2)
            goto L_0x00e1
        L_0x008e:
            boolean r2 = r1.isLoaded()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24344a((android.os.Parcel) r4, (boolean) r2)
            goto L_0x00e1
        L_0x0099:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x00a0
            goto L_0x00b3
        L_0x00a0:
            java.lang.String r3 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.zzatw
            if (r5 == 0) goto L_0x00ae
            r5 = r3
            com.google.android.gms.internal.ads.zzatw r5 = (com.google.android.gms.internal.ads.zzatw) r5
            goto L_0x00b3
        L_0x00ae:
            com.google.android.gms.internal.ads.zzaty r5 = new com.google.android.gms.internal.ads.zzaty
            r5.<init>(r2)
        L_0x00b3:
            r1.mo27112a((com.google.android.gms.internal.ads.zzatw) r5)
            r4.writeNoException()
            goto L_0x00e1
        L_0x00ba:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzxz> r2 = com.google.android.gms.internal.ads.zzxz.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzfo.m24341a((android.os.Parcel) r3, r2)
            com.google.android.gms.internal.ads.zzxz r2 = (com.google.android.gms.internal.ads.zzxz) r2
            android.os.IBinder r3 = r3.readStrongBinder()
            if (r3 != 0) goto L_0x00c9
            goto L_0x00db
        L_0x00c9:
            java.lang.String r5 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback"
            android.os.IInterface r5 = r3.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzaub
            if (r0 == 0) goto L_0x00d6
            com.google.android.gms.internal.ads.zzaub r5 = (com.google.android.gms.internal.ads.zzaub) r5
            goto L_0x00db
        L_0x00d6:
            com.google.android.gms.internal.ads.zzaud r5 = new com.google.android.gms.internal.ads.zzaud
            r5.<init>(r3)
        L_0x00db:
            r1.mo27115a((com.google.android.gms.internal.ads.zzxz) r2, (com.google.android.gms.internal.ads.zzaub) r5)
            r4.writeNoException()
        L_0x00e1:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzatu.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
