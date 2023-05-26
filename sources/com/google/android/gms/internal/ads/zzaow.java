package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzaow extends zzfn implements zzaov {
    public zzaow() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    /* renamed from: a */
    public static zzaov m19768a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        if (queryLocalInterface instanceof zzaov) {
            return (zzaov) queryLocalInterface;
        }
        return new zzaox(iBinder);
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [com.google.android.gms.internal.ads.zzaoj] */
    /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.gms.internal.ads.zzaoo] */
    /* JADX WARNING: type inference failed for: r2v13, types: [com.google.android.gms.internal.ads.zzaom] */
    /* JADX WARNING: type inference failed for: r5v8, types: [com.google.android.gms.internal.ads.zzaom] */
    /* JADX WARNING: type inference failed for: r2v18, types: [com.google.android.gms.internal.ads.zzaou] */
    /* JADX WARNING: type inference failed for: r2v19, types: [com.google.android.gms.internal.ads.zzaos] */
    /* JADX WARNING: type inference failed for: r5v11, types: [com.google.android.gms.internal.ads.zzaos] */
    /* JADX WARNING: type inference failed for: r2v24, types: [com.google.android.gms.internal.ads.zzaor] */
    /* JADX WARNING: type inference failed for: r2v25, types: [com.google.android.gms.internal.ads.zzaop] */
    /* JADX WARNING: type inference failed for: r5v14, types: [com.google.android.gms.internal.ads.zzaop] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r14, android.os.Parcel r15, android.os.Parcel r16, int r17) throws android.os.RemoteException {
        /*
            r13 = this;
            r8 = r13
            r0 = r14
            r1 = r15
            r9 = r16
            r10 = 1
            r2 = 0
            if (r0 == r10) goto L_0x01c3
            r3 = 2
            if (r0 == r3) goto L_0x01b8
            r3 = 3
            if (r0 == r3) goto L_0x01ad
            r3 = 5
            if (r0 == r3) goto L_0x01a1
            r3 = 10
            if (r0 == r3) goto L_0x0191
            r3 = 11
            if (r0 == r3) goto L_0x017d
            switch(r0) {
                case 13: goto L_0x0128;
                case 14: goto L_0x00dd;
                case 15: goto L_0x00c9;
                case 16: goto L_0x007e;
                case 17: goto L_0x006a;
                case 18: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            r0 = 0
            return r0
        L_0x001f:
            java.lang.String r3 = r15.readString()
            java.lang.String r4 = r15.readString()
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzxz> r0 = com.google.android.gms.internal.ads.zzxz.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzfo.m24341a((android.os.Parcel) r15, r0)
            r5 = r0
            com.google.android.gms.internal.ads.zzxz r5 = (com.google.android.gms.internal.ads.zzxz) r5
            android.os.IBinder r0 = r15.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r6 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r0)
            android.os.IBinder r0 = r15.readStrongBinder()
            if (r0 != 0) goto L_0x0040
        L_0x003e:
            r7 = r2
            goto L_0x0053
        L_0x0040:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback"
            android.os.IInterface r2 = r0.queryLocalInterface(r2)
            boolean r7 = r2 instanceof com.google.android.gms.internal.ads.zzaop
            if (r7 == 0) goto L_0x004d
            com.google.android.gms.internal.ads.zzaop r2 = (com.google.android.gms.internal.ads.zzaop) r2
            goto L_0x003e
        L_0x004d:
            com.google.android.gms.internal.ads.zzaor r2 = new com.google.android.gms.internal.ads.zzaor
            r2.<init>(r0)
            goto L_0x003e
        L_0x0053:
            android.os.IBinder r0 = r15.readStrongBinder()
            com.google.android.gms.internal.ads.zzamv r11 = com.google.android.gms.internal.ads.zzamw.m19484a(r0)
            r0 = r13
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r11
            r0.mo27524a((java.lang.String) r1, (java.lang.String) r2, (com.google.android.gms.internal.ads.zzxz) r3, (com.google.android.gms.dynamic.IObjectWrapper) r4, (com.google.android.gms.internal.ads.zzaop) r5, (com.google.android.gms.internal.ads.zzamv) r6)
            r16.writeNoException()
            goto L_0x0212
        L_0x006a:
            android.os.IBinder r0 = r15.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r0)
            boolean r0 = r13.mo27530m(r0)
            r16.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24344a((android.os.Parcel) r9, (boolean) r0)
            goto L_0x0212
        L_0x007e:
            java.lang.String r3 = r15.readString()
            java.lang.String r4 = r15.readString()
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzxz> r0 = com.google.android.gms.internal.ads.zzxz.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzfo.m24341a((android.os.Parcel) r15, r0)
            r5 = r0
            com.google.android.gms.internal.ads.zzxz r5 = (com.google.android.gms.internal.ads.zzxz) r5
            android.os.IBinder r0 = r15.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r6 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r0)
            android.os.IBinder r0 = r15.readStrongBinder()
            if (r0 != 0) goto L_0x009f
        L_0x009d:
            r7 = r2
            goto L_0x00b2
        L_0x009f:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback"
            android.os.IInterface r2 = r0.queryLocalInterface(r2)
            boolean r7 = r2 instanceof com.google.android.gms.internal.ads.zzaos
            if (r7 == 0) goto L_0x00ac
            com.google.android.gms.internal.ads.zzaos r2 = (com.google.android.gms.internal.ads.zzaos) r2
            goto L_0x009d
        L_0x00ac:
            com.google.android.gms.internal.ads.zzaou r2 = new com.google.android.gms.internal.ads.zzaou
            r2.<init>(r0)
            goto L_0x009d
        L_0x00b2:
            android.os.IBinder r0 = r15.readStrongBinder()
            com.google.android.gms.internal.ads.zzamv r11 = com.google.android.gms.internal.ads.zzamw.m19484a(r0)
            r0 = r13
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r11
            r0.mo27525a((java.lang.String) r1, (java.lang.String) r2, (com.google.android.gms.internal.ads.zzxz) r3, (com.google.android.gms.dynamic.IObjectWrapper) r4, (com.google.android.gms.internal.ads.zzaos) r5, (com.google.android.gms.internal.ads.zzamv) r6)
            r16.writeNoException()
            goto L_0x0212
        L_0x00c9:
            android.os.IBinder r0 = r15.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r0)
            boolean r0 = r13.mo27529l(r0)
            r16.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24344a((android.os.Parcel) r9, (boolean) r0)
            goto L_0x0212
        L_0x00dd:
            java.lang.String r3 = r15.readString()
            java.lang.String r4 = r15.readString()
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzxz> r0 = com.google.android.gms.internal.ads.zzxz.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzfo.m24341a((android.os.Parcel) r15, r0)
            r5 = r0
            com.google.android.gms.internal.ads.zzxz r5 = (com.google.android.gms.internal.ads.zzxz) r5
            android.os.IBinder r0 = r15.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r6 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r0)
            android.os.IBinder r0 = r15.readStrongBinder()
            if (r0 != 0) goto L_0x00fe
        L_0x00fc:
            r7 = r2
            goto L_0x0111
        L_0x00fe:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback"
            android.os.IInterface r2 = r0.queryLocalInterface(r2)
            boolean r7 = r2 instanceof com.google.android.gms.internal.ads.zzaom
            if (r7 == 0) goto L_0x010b
            com.google.android.gms.internal.ads.zzaom r2 = (com.google.android.gms.internal.ads.zzaom) r2
            goto L_0x00fc
        L_0x010b:
            com.google.android.gms.internal.ads.zzaoo r2 = new com.google.android.gms.internal.ads.zzaoo
            r2.<init>(r0)
            goto L_0x00fc
        L_0x0111:
            android.os.IBinder r0 = r15.readStrongBinder()
            com.google.android.gms.internal.ads.zzamv r11 = com.google.android.gms.internal.ads.zzamw.m19484a(r0)
            r0 = r13
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r11
            r0.mo27523a((java.lang.String) r1, (java.lang.String) r2, (com.google.android.gms.internal.ads.zzxz) r3, (com.google.android.gms.dynamic.IObjectWrapper) r4, (com.google.android.gms.internal.ads.zzaom) r5, (com.google.android.gms.internal.ads.zzamv) r6)
            r16.writeNoException()
            goto L_0x0212
        L_0x0128:
            java.lang.String r3 = r15.readString()
            java.lang.String r4 = r15.readString()
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzxz> r0 = com.google.android.gms.internal.ads.zzxz.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzfo.m24341a((android.os.Parcel) r15, r0)
            r5 = r0
            com.google.android.gms.internal.ads.zzxz r5 = (com.google.android.gms.internal.ads.zzxz) r5
            android.os.IBinder r0 = r15.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r6 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r0)
            android.os.IBinder r0 = r15.readStrongBinder()
            if (r0 != 0) goto L_0x0149
        L_0x0147:
            r7 = r2
            goto L_0x015c
        L_0x0149:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback"
            android.os.IInterface r2 = r0.queryLocalInterface(r2)
            boolean r7 = r2 instanceof com.google.android.gms.internal.ads.zzaoj
            if (r7 == 0) goto L_0x0156
            com.google.android.gms.internal.ads.zzaoj r2 = (com.google.android.gms.internal.ads.zzaoj) r2
            goto L_0x0147
        L_0x0156:
            com.google.android.gms.internal.ads.zzaol r2 = new com.google.android.gms.internal.ads.zzaol
            r2.<init>(r0)
            goto L_0x0147
        L_0x015c:
            android.os.IBinder r0 = r15.readStrongBinder()
            com.google.android.gms.internal.ads.zzamv r11 = com.google.android.gms.internal.ads.zzamw.m19484a(r0)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzyd> r0 = com.google.android.gms.internal.ads.zzyd.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzfo.m24341a((android.os.Parcel) r15, r0)
            r12 = r0
            com.google.android.gms.internal.ads.zzyd r12 = (com.google.android.gms.internal.ads.zzyd) r12
            r0 = r13
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r11
            r7 = r12
            r0.mo27522a(r1, r2, r3, r4, r5, r6, r7)
            r16.writeNoException()
            goto L_0x0212
        L_0x017d:
            java.lang.String[] r0 = r15.createStringArray()
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            java.lang.Object[] r1 = r15.createTypedArray(r2)
            android.os.Bundle[] r1 = (android.os.Bundle[]) r1
            r13.mo27526a(r0, r1)
            r16.writeNoException()
            goto L_0x0212
        L_0x0191:
            android.os.IBinder r0 = r15.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r0)
            r13.mo27531p(r0)
            r16.writeNoException()
            goto L_0x0212
        L_0x01a1:
            com.google.android.gms.internal.ads.zzaar r0 = r13.getVideoController()
            r16.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24342a((android.os.Parcel) r9, (android.os.IInterface) r0)
            goto L_0x0212
        L_0x01ad:
            com.google.android.gms.internal.ads.zzapj r0 = r13.mo27520O0()
            r16.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24347b(r9, r0)
            goto L_0x0212
        L_0x01b8:
            com.google.android.gms.internal.ads.zzapj r0 = r13.mo27527a1()
            r16.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24347b(r9, r0)
            goto L_0x0212
        L_0x01c3:
            android.os.IBinder r0 = r15.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r0)
            java.lang.String r4 = r15.readString()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzfo.m24341a((android.os.Parcel) r15, r0)
            r5 = r0
            android.os.Bundle r5 = (android.os.Bundle) r5
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzfo.m24341a((android.os.Parcel) r15, r0)
            r6 = r0
            android.os.Bundle r6 = (android.os.Bundle) r6
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzyd> r0 = com.google.android.gms.internal.ads.zzyd.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzfo.m24341a((android.os.Parcel) r15, r0)
            r7 = r0
            com.google.android.gms.internal.ads.zzyd r7 = (com.google.android.gms.internal.ads.zzyd) r7
            android.os.IBinder r0 = r15.readStrongBinder()
            if (r0 != 0) goto L_0x01f2
            r11 = r2
            goto L_0x0205
        L_0x01f2:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzaoy
            if (r2 == 0) goto L_0x01ff
            com.google.android.gms.internal.ads.zzaoy r1 = (com.google.android.gms.internal.ads.zzaoy) r1
            goto L_0x0204
        L_0x01ff:
            com.google.android.gms.internal.ads.zzapa r1 = new com.google.android.gms.internal.ads.zzapa
            r1.<init>(r0)
        L_0x0204:
            r11 = r1
        L_0x0205:
            r0 = r13
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r11
            r0.mo27521a((com.google.android.gms.dynamic.IObjectWrapper) r1, (java.lang.String) r2, (android.os.Bundle) r3, (android.os.Bundle) r4, (com.google.android.gms.internal.ads.zzyd) r5, (com.google.android.gms.internal.ads.zzaoy) r6)
            r16.writeNoException()
        L_0x0212:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaow.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
