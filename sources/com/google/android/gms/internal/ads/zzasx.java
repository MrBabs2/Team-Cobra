package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzasx extends zzfn implements zzasw {
    public zzasx() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* renamed from: a */
    public static zzasw m19932a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        if (queryLocalInterface instanceof zzasw) {
            return (zzasw) queryLocalInterface;
        }
        return new zzasy(iBinder);
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzatb] */
    /* JADX WARNING: type inference failed for: r1v5, types: [com.google.android.gms.internal.ads.zzasu] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
        /*
            r2 = this;
            r6 = 1
            if (r3 == r6) goto L_0x0113
            r0 = 2
            if (r3 == r0) goto L_0x010c
            r0 = 3
            r1 = 0
            if (r3 == r0) goto L_0x00eb
            r0 = 34
            if (r3 == r0) goto L_0x00e0
            switch(r3) {
                case 5: goto L_0x00d5;
                case 6: goto L_0x00ce;
                case 7: goto L_0x00c7;
                case 8: goto L_0x00c0;
                case 9: goto L_0x00b1;
                case 10: goto L_0x00a1;
                case 11: goto L_0x0091;
                case 12: goto L_0x0085;
                case 13: goto L_0x0079;
                case 14: goto L_0x0069;
                case 15: goto L_0x005d;
                case 16: goto L_0x003b;
                case 17: goto L_0x002f;
                case 18: goto L_0x001f;
                case 19: goto L_0x0013;
                default: goto L_0x0011;
            }
        L_0x0011:
            r3 = 0
            return r3
        L_0x0013:
            java.lang.String r3 = r4.readString()
            r2.setCustomData(r3)
            r5.writeNoException()
            goto L_0x0121
        L_0x001f:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r3)
            r2.mo27139v(r3)
            r5.writeNoException()
            goto L_0x0121
        L_0x002f:
            java.lang.String r3 = r4.readString()
            r2.mo27132o(r3)
            r5.writeNoException()
            goto L_0x0121
        L_0x003b:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x0042
            goto L_0x0055
        L_0x0042:
            java.lang.String r4 = "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.zzasu
            if (r0 == 0) goto L_0x0050
            r1 = r4
            com.google.android.gms.internal.ads.zzasu r1 = (com.google.android.gms.internal.ads.zzasu) r1
            goto L_0x0055
        L_0x0050:
            com.google.android.gms.internal.ads.zzasv r1 = new com.google.android.gms.internal.ads.zzasv
            r1.<init>(r3)
        L_0x0055:
            r2.mo27123a((com.google.android.gms.internal.ads.zzasu) r1)
            r5.writeNoException()
            goto L_0x0121
        L_0x005d:
            android.os.Bundle r3 = r2.getAdMetadata()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24347b(r5, r3)
            goto L_0x0121
        L_0x0069:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.internal.ads.zzzp r3 = com.google.android.gms.internal.ads.zzzq.m25764a(r3)
            r2.mo27126a((com.google.android.gms.internal.ads.zzzp) r3)
            r5.writeNoException()
            goto L_0x0121
        L_0x0079:
            java.lang.String r3 = r4.readString()
            r2.setUserId(r3)
            r5.writeNoException()
            goto L_0x0121
        L_0x0085:
            java.lang.String r3 = r2.getMediationAdapterClassName()
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x0121
        L_0x0091:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r3)
            r2.mo27131k(r3)
            r5.writeNoException()
            goto L_0x0121
        L_0x00a1:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r3)
            r2.mo27121B(r3)
            r5.writeNoException()
            goto L_0x0121
        L_0x00b1:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r3)
            r2.mo27122F(r3)
            r5.writeNoException()
            goto L_0x0121
        L_0x00c0:
            r2.destroy()
            r5.writeNoException()
            goto L_0x0121
        L_0x00c7:
            r2.resume()
            r5.writeNoException()
            goto L_0x0121
        L_0x00ce:
            r2.pause()
            r5.writeNoException()
            goto L_0x0121
        L_0x00d5:
            boolean r3 = r2.isLoaded()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24344a((android.os.Parcel) r5, (boolean) r3)
            goto L_0x0121
        L_0x00e0:
            boolean r3 = com.google.android.gms.internal.ads.zzfo.m24345a(r4)
            r2.setImmersiveMode(r3)
            r5.writeNoException()
            goto L_0x0121
        L_0x00eb:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x00f2
            goto L_0x0105
        L_0x00f2:
            java.lang.String r4 = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.zzatb
            if (r0 == 0) goto L_0x0100
            r1 = r4
            com.google.android.gms.internal.ads.zzatb r1 = (com.google.android.gms.internal.ads.zzatb) r1
            goto L_0x0105
        L_0x0100:
            com.google.android.gms.internal.ads.zzatd r1 = new com.google.android.gms.internal.ads.zzatd
            r1.<init>(r3)
        L_0x0105:
            r2.mo27124a((com.google.android.gms.internal.ads.zzatb) r1)
            r5.writeNoException()
            goto L_0x0121
        L_0x010c:
            r2.show()
            r5.writeNoException()
            goto L_0x0121
        L_0x0113:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzath> r3 = com.google.android.gms.internal.ads.zzath.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.zzfo.m24341a((android.os.Parcel) r4, r3)
            com.google.android.gms.internal.ads.zzath r3 = (com.google.android.gms.internal.ads.zzath) r3
            r2.mo27125a((com.google.android.gms.internal.ads.zzath) r3)
            r5.writeNoException()
        L_0x0121:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzasx.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
