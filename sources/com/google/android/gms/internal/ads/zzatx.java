package com.google.android.gms.internal.ads;

public abstract class zzatx extends zzfn implements zzatw {
    public zzatx() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            r5 = 1
            if (r2 == r5) goto L_0x003a
            r0 = 2
            if (r2 == r0) goto L_0x0036
            r0 = 3
            if (r2 == r0) goto L_0x0016
            r0 = 4
            if (r2 == r0) goto L_0x000e
            r2 = 0
            return r2
        L_0x000e:
            int r2 = r3.readInt()
            r1.mo27651r(r2)
            goto L_0x003d
        L_0x0016:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x001e
            r2 = 0
            goto L_0x0032
        L_0x001e:
            java.lang.String r3 = "com.google.android.gms.ads.internal.rewarded.client.IRewardItem"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.zzatq
            if (r0 == 0) goto L_0x002c
            r2 = r3
            com.google.android.gms.internal.ads.zzatq r2 = (com.google.android.gms.internal.ads.zzatq) r2
            goto L_0x0032
        L_0x002c:
            com.google.android.gms.internal.ads.zzats r3 = new com.google.android.gms.internal.ads.zzats
            r3.<init>(r2)
            r2 = r3
        L_0x0032:
            r1.mo27650a(r2)
            goto L_0x003d
        L_0x0036:
            r1.mo27648O()
            goto L_0x003d
        L_0x003a:
            r1.mo27649V()
        L_0x003d:
            r4.writeNoException()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzatx.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
