package com.google.android.gms.internal.ads;

public abstract class zzarn extends zzfn implements zzarm {
    public zzarn() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzarp] */
    /* JADX WARNING: type inference failed for: r1v6, types: [com.google.android.gms.internal.ads.zzarr] */
    /* JADX WARNING: type inference failed for: r1v11, types: [com.google.android.gms.internal.ads.zzarr] */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: type inference failed for: r1v20 */
    /* JADX WARNING: type inference failed for: r1v21 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
        /*
            r3 = this;
            r7 = 1
            if (r4 == r7) goto L_0x0088
            r0 = 2
            r1 = 0
            if (r4 == r0) goto L_0x005f
            r0 = 4
            java.lang.String r2 = "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener"
            if (r4 == r0) goto L_0x0038
            r0 = 5
            if (r4 == r0) goto L_0x0011
            r4 = 0
            return r4
        L_0x0011:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzarx> r4 = com.google.android.gms.internal.ads.zzarx.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.zzfo.m24341a((android.os.Parcel) r5, r4)
            com.google.android.gms.internal.ads.zzarx r4 = (com.google.android.gms.internal.ads.zzarx) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L_0x0020
            goto L_0x0031
        L_0x0020:
            android.os.IInterface r0 = r5.queryLocalInterface(r2)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzarr
            if (r1 == 0) goto L_0x002c
            r1 = r0
            com.google.android.gms.internal.ads.zzarr r1 = (com.google.android.gms.internal.ads.zzarr) r1
            goto L_0x0031
        L_0x002c:
            com.google.android.gms.internal.ads.zzart r1 = new com.google.android.gms.internal.ads.zzart
            r1.<init>(r5)
        L_0x0031:
            r3.mo27590b(r4, r1)
            r6.writeNoException()
            goto L_0x009a
        L_0x0038:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzarx> r4 = com.google.android.gms.internal.ads.zzarx.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.zzfo.m24341a((android.os.Parcel) r5, r4)
            com.google.android.gms.internal.ads.zzarx r4 = (com.google.android.gms.internal.ads.zzarx) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L_0x0047
            goto L_0x0058
        L_0x0047:
            android.os.IInterface r0 = r5.queryLocalInterface(r2)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzarr
            if (r1 == 0) goto L_0x0053
            r1 = r0
            com.google.android.gms.internal.ads.zzarr r1 = (com.google.android.gms.internal.ads.zzarr) r1
            goto L_0x0058
        L_0x0053:
            com.google.android.gms.internal.ads.zzart r1 = new com.google.android.gms.internal.ads.zzart
            r1.<init>(r5)
        L_0x0058:
            r3.mo27589a((com.google.android.gms.internal.ads.zzarx) r4, (com.google.android.gms.internal.ads.zzarr) r1)
            r6.writeNoException()
            goto L_0x009a
        L_0x005f:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzarg> r4 = com.google.android.gms.internal.ads.zzarg.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.zzfo.m24341a((android.os.Parcel) r5, r4)
            com.google.android.gms.internal.ads.zzarg r4 = (com.google.android.gms.internal.ads.zzarg) r4
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L_0x006e
            goto L_0x0081
        L_0x006e:
            java.lang.String r0 = "com.google.android.gms.ads.internal.request.IAdResponseListener"
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzarp
            if (r1 == 0) goto L_0x007c
            r1 = r0
            com.google.android.gms.internal.ads.zzarp r1 = (com.google.android.gms.internal.ads.zzarp) r1
            goto L_0x0081
        L_0x007c:
            com.google.android.gms.internal.ads.zzarq r1 = new com.google.android.gms.internal.ads.zzarq
            r1.<init>(r5)
        L_0x0081:
            r3.mo27588a((com.google.android.gms.internal.ads.zzarg) r4, (com.google.android.gms.internal.ads.zzarp) r1)
            r6.writeNoException()
            goto L_0x009a
        L_0x0088:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzarg> r4 = com.google.android.gms.internal.ads.zzarg.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.zzfo.m24341a((android.os.Parcel) r5, r4)
            com.google.android.gms.internal.ads.zzarg r4 = (com.google.android.gms.internal.ads.zzarg) r4
            com.google.android.gms.internal.ads.zzari r4 = r3.mo27587a(r4)
            r6.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24347b(r6, r4)
        L_0x009a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzarn.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
