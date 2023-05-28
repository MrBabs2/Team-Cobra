package com.google.android.gms.internal.ads;

public abstract class zzajb extends zzfn implements zzaja {
    public zzajb() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            r5 = 3
            if (r2 == r5) goto L_0x003d
            r5 = 4
            if (r2 == r5) goto L_0x0036
            r5 = 5
            if (r2 == r5) goto L_0x000b
            r2 = 0
            return r2
        L_0x000b:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r2)
            android.os.IBinder r3 = r3.readStrongBinder()
            if (r3 != 0) goto L_0x001b
            r3 = 0
            goto L_0x002f
        L_0x001b:
            java.lang.String r5 = "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback"
            android.os.IInterface r5 = r3.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzajc
            if (r0 == 0) goto L_0x0029
            r3 = r5
            com.google.android.gms.internal.ads.zzajc r3 = (com.google.android.gms.internal.ads.zzajc) r3
            goto L_0x002f
        L_0x0029:
            com.google.android.gms.internal.ads.zzajd r5 = new com.google.android.gms.internal.ads.zzajd
            r5.<init>(r3)
            r3 = r5
        L_0x002f:
            r1.mo27329a(r2, r3)
            r4.writeNoException()
            goto L_0x0047
        L_0x0036:
            r1.destroy()
            r4.writeNoException()
            goto L_0x0047
        L_0x003d:
            com.google.android.gms.internal.ads.zzaar r2 = r1.getVideoController()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24342a((android.os.Parcel) r4, (android.os.IInterface) r2)
        L_0x0047:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajb.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
