package com.google.android.gms.internal.ads;

public abstract class zzawb extends zzfn implements zzawa {
    public zzawb() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
        /*
            r3 = this;
            r7 = 1
            if (r4 != r7) goto L_0x0036
            android.os.IBinder r4 = r5.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r4)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzawc> r0 = com.google.android.gms.internal.ads.zzawc.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzfo.m24341a((android.os.Parcel) r5, r0)
            com.google.android.gms.internal.ads.zzawc r0 = (com.google.android.gms.internal.ads.zzawc) r0
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L_0x001b
            r5 = 0
            goto L_0x002f
        L_0x001b:
            java.lang.String r1 = "com.google.android.gms.ads.internal.signals.ISignalCallback"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzavy
            if (r2 == 0) goto L_0x0029
            r5 = r1
            com.google.android.gms.internal.ads.zzavy r5 = (com.google.android.gms.internal.ads.zzavy) r5
            goto L_0x002f
        L_0x0029:
            com.google.android.gms.internal.ads.zzavz r1 = new com.google.android.gms.internal.ads.zzavz
            r1.<init>(r5)
            r5 = r1
        L_0x002f:
            r3.mo27709a(r4, r0, r5)
            r6.writeNoException()
            return r7
        L_0x0036:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawb.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
