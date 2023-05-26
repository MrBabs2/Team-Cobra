package com.google.android.gms.internal.ads;

public abstract class zzamt extends zzfn implements zzams {
    public zzamt() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* JADX WARNING: type inference failed for: r11v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r11v4, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) throws android.os.RemoteException {
        /*
            r9 = this;
            r13 = 0
            java.lang.String r0 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener"
            switch(r10) {
                case 1: goto L_0x029d;
                case 2: goto L_0x0292;
                case 3: goto L_0x0260;
                case 4: goto L_0x0258;
                case 5: goto L_0x0250;
                case 6: goto L_0x020b;
                case 7: goto L_0x01cf;
                case 8: goto L_0x01c7;
                case 9: goto L_0x01bf;
                case 10: goto L_0x0195;
                case 11: goto L_0x0181;
                case 12: goto L_0x0179;
                case 13: goto L_0x016d;
                case 14: goto L_0x0125;
                case 15: goto L_0x0119;
                case 16: goto L_0x010d;
                case 17: goto L_0x0101;
                case 18: goto L_0x00f5;
                case 19: goto L_0x00e9;
                case 20: goto L_0x00d1;
                case 21: goto L_0x00c1;
                case 22: goto L_0x00b5;
                case 23: goto L_0x0099;
                case 24: goto L_0x008d;
                case 25: goto L_0x0081;
                case 26: goto L_0x0075;
                case 27: goto L_0x0069;
                case 28: goto L_0x0036;
                case 29: goto L_0x0006;
                case 30: goto L_0x0026;
                case 31: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r10 = 0
            return r10
        L_0x0008:
            android.os.IBinder r10 = r11.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r10)
            android.os.IBinder r13 = r11.readStrongBinder()
            com.google.android.gms.internal.ads.zzaiq r13 = com.google.android.gms.internal.ads.zzair.m19268a(r13)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzaiw> r0 = com.google.android.gms.internal.ads.zzaiw.CREATOR
            java.util.ArrayList r11 = r11.createTypedArrayList(r0)
            r9.mo27405a((com.google.android.gms.dynamic.IObjectWrapper) r10, (com.google.android.gms.internal.ads.zzaiq) r13, (java.util.List<com.google.android.gms.internal.ads.zzaiw>) r11)
            r12.writeNoException()
            goto L_0x02dc
        L_0x0026:
            android.os.IBinder r10 = r11.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r10)
            r9.mo27429t(r10)
            r12.writeNoException()
            goto L_0x02dc
        L_0x0036:
            android.os.IBinder r10 = r11.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r10)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzxz> r1 = com.google.android.gms.internal.ads.zzxz.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzfo.m24341a((android.os.Parcel) r11, r1)
            com.google.android.gms.internal.ads.zzxz r1 = (com.google.android.gms.internal.ads.zzxz) r1
            java.lang.String r2 = r11.readString()
            android.os.IBinder r11 = r11.readStrongBinder()
            if (r11 != 0) goto L_0x0051
            goto L_0x0061
        L_0x0051:
            android.os.IInterface r13 = r11.queryLocalInterface(r0)
            boolean r0 = r13 instanceof com.google.android.gms.internal.ads.zzamv
            if (r0 == 0) goto L_0x005c
            com.google.android.gms.internal.ads.zzamv r13 = (com.google.android.gms.internal.ads.zzamv) r13
            goto L_0x0061
        L_0x005c:
            com.google.android.gms.internal.ads.zzamx r13 = new com.google.android.gms.internal.ads.zzamx
            r13.<init>(r11)
        L_0x0061:
            r9.mo27407a(r10, r1, r2, r13)
            r12.writeNoException()
            goto L_0x02dc
        L_0x0069:
            com.google.android.gms.internal.ads.zzang r10 = r9.mo27404U()
            r12.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24342a((android.os.Parcel) r12, (android.os.IInterface) r10)
            goto L_0x02dc
        L_0x0075:
            com.google.android.gms.internal.ads.zzaar r10 = r9.getVideoController()
            r12.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24342a((android.os.Parcel) r12, (android.os.IInterface) r10)
            goto L_0x02dc
        L_0x0081:
            boolean r10 = com.google.android.gms.internal.ads.zzfo.m24345a(r11)
            r9.setImmersiveMode(r10)
            r12.writeNoException()
            goto L_0x02dc
        L_0x008d:
            com.google.android.gms.internal.ads.zzafe r10 = r9.mo27418g0()
            r12.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24342a((android.os.Parcel) r12, (android.os.IInterface) r10)
            goto L_0x02dc
        L_0x0099:
            android.os.IBinder r10 = r11.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r10)
            android.os.IBinder r13 = r11.readStrongBinder()
            com.google.android.gms.internal.ads.zzatk r13 = com.google.android.gms.internal.ads.zzatl.m19969a(r13)
            java.util.ArrayList r11 = r11.createStringArrayList()
            r9.mo27406a((com.google.android.gms.dynamic.IObjectWrapper) r10, (com.google.android.gms.internal.ads.zzatk) r13, (java.util.List<java.lang.String>) r11)
            r12.writeNoException()
            goto L_0x02dc
        L_0x00b5:
            boolean r10 = r9.mo27422n0()
            r12.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24344a((android.os.Parcel) r12, (boolean) r10)
            goto L_0x02dc
        L_0x00c1:
            android.os.IBinder r10 = r11.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r10)
            r9.mo27430w(r10)
            r12.writeNoException()
            goto L_0x02dc
        L_0x00d1:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzxz> r10 = com.google.android.gms.internal.ads.zzxz.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.ads.zzfo.m24341a((android.os.Parcel) r11, r10)
            com.google.android.gms.internal.ads.zzxz r10 = (com.google.android.gms.internal.ads.zzxz) r10
            java.lang.String r13 = r11.readString()
            java.lang.String r11 = r11.readString()
            r9.mo27414a((com.google.android.gms.internal.ads.zzxz) r10, (java.lang.String) r13, (java.lang.String) r11)
            r12.writeNoException()
            goto L_0x02dc
        L_0x00e9:
            android.os.Bundle r10 = r9.mo27402B0()
            r12.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24347b(r12, r10)
            goto L_0x02dc
        L_0x00f5:
            android.os.Bundle r10 = r9.getInterstitialAdapterInfo()
            r12.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24347b(r12, r10)
            goto L_0x02dc
        L_0x0101:
            android.os.Bundle r10 = r9.zzsh()
            r12.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24347b(r12, r10)
            goto L_0x02dc
        L_0x010d:
            com.google.android.gms.internal.ads.zzand r10 = r9.mo27416c1()
            r12.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24342a((android.os.Parcel) r12, (android.os.IInterface) r10)
            goto L_0x02dc
        L_0x0119:
            com.google.android.gms.internal.ads.zzana r10 = r9.mo27423n1()
            r12.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24342a((android.os.Parcel) r12, (android.os.IInterface) r10)
            goto L_0x02dc
        L_0x0125:
            android.os.IBinder r10 = r11.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r10)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzxz> r10 = com.google.android.gms.internal.ads.zzxz.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.ads.zzfo.m24341a((android.os.Parcel) r11, r10)
            r3 = r10
            com.google.android.gms.internal.ads.zzxz r3 = (com.google.android.gms.internal.ads.zzxz) r3
            java.lang.String r4 = r11.readString()
            java.lang.String r5 = r11.readString()
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 != 0) goto L_0x0146
        L_0x0144:
            r6 = r13
            goto L_0x0157
        L_0x0146:
            android.os.IInterface r13 = r10.queryLocalInterface(r0)
            boolean r0 = r13 instanceof com.google.android.gms.internal.ads.zzamv
            if (r0 == 0) goto L_0x0151
            com.google.android.gms.internal.ads.zzamv r13 = (com.google.android.gms.internal.ads.zzamv) r13
            goto L_0x0144
        L_0x0151:
            com.google.android.gms.internal.ads.zzamx r13 = new com.google.android.gms.internal.ads.zzamx
            r13.<init>(r10)
            goto L_0x0144
        L_0x0157:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzady> r10 = com.google.android.gms.internal.ads.zzady.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.ads.zzfo.m24341a((android.os.Parcel) r11, r10)
            r7 = r10
            com.google.android.gms.internal.ads.zzady r7 = (com.google.android.gms.internal.ads.zzady) r7
            java.util.ArrayList r8 = r11.createStringArrayList()
            r1 = r9
            r1.mo27410a(r2, r3, r4, r5, r6, r7, r8)
            r12.writeNoException()
            goto L_0x02dc
        L_0x016d:
            boolean r10 = r9.isInitialized()
            r12.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24344a((android.os.Parcel) r12, (boolean) r10)
            goto L_0x02dc
        L_0x0179:
            r9.showVideo()
            r12.writeNoException()
            goto L_0x02dc
        L_0x0181:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzxz> r10 = com.google.android.gms.internal.ads.zzxz.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.ads.zzfo.m24341a((android.os.Parcel) r11, r10)
            com.google.android.gms.internal.ads.zzxz r10 = (com.google.android.gms.internal.ads.zzxz) r10
            java.lang.String r11 = r11.readString()
            r9.mo27413a(r10, r11)
            r12.writeNoException()
            goto L_0x02dc
        L_0x0195:
            android.os.IBinder r10 = r11.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r10)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzxz> r10 = com.google.android.gms.internal.ads.zzxz.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.ads.zzfo.m24341a((android.os.Parcel) r11, r10)
            r2 = r10
            com.google.android.gms.internal.ads.zzxz r2 = (com.google.android.gms.internal.ads.zzxz) r2
            java.lang.String r3 = r11.readString()
            android.os.IBinder r10 = r11.readStrongBinder()
            com.google.android.gms.internal.ads.zzatk r4 = com.google.android.gms.internal.ads.zzatl.m19969a(r10)
            java.lang.String r5 = r11.readString()
            r0 = r9
            r0.mo27408a((com.google.android.gms.dynamic.IObjectWrapper) r1, (com.google.android.gms.internal.ads.zzxz) r2, (java.lang.String) r3, (com.google.android.gms.internal.ads.zzatk) r4, (java.lang.String) r5)
            r12.writeNoException()
            goto L_0x02dc
        L_0x01bf:
            r9.resume()
            r12.writeNoException()
            goto L_0x02dc
        L_0x01c7:
            r9.pause()
            r12.writeNoException()
            goto L_0x02dc
        L_0x01cf:
            android.os.IBinder r10 = r11.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r10)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzxz> r10 = com.google.android.gms.internal.ads.zzxz.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.ads.zzfo.m24341a((android.os.Parcel) r11, r10)
            r3 = r10
            com.google.android.gms.internal.ads.zzxz r3 = (com.google.android.gms.internal.ads.zzxz) r3
            java.lang.String r4 = r11.readString()
            java.lang.String r5 = r11.readString()
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 != 0) goto L_0x01f0
        L_0x01ee:
            r6 = r13
            goto L_0x0202
        L_0x01f0:
            android.os.IInterface r11 = r10.queryLocalInterface(r0)
            boolean r13 = r11 instanceof com.google.android.gms.internal.ads.zzamv
            if (r13 == 0) goto L_0x01fc
            r13 = r11
            com.google.android.gms.internal.ads.zzamv r13 = (com.google.android.gms.internal.ads.zzamv) r13
            goto L_0x01ee
        L_0x01fc:
            com.google.android.gms.internal.ads.zzamx r13 = new com.google.android.gms.internal.ads.zzamx
            r13.<init>(r10)
            goto L_0x01ee
        L_0x0202:
            r1 = r9
            r1.mo27409a((com.google.android.gms.dynamic.IObjectWrapper) r2, (com.google.android.gms.internal.ads.zzxz) r3, (java.lang.String) r4, (java.lang.String) r5, (com.google.android.gms.internal.ads.zzamv) r6)
            r12.writeNoException()
            goto L_0x02dc
        L_0x020b:
            android.os.IBinder r10 = r11.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r10)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzyd> r10 = com.google.android.gms.internal.ads.zzyd.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.ads.zzfo.m24341a((android.os.Parcel) r11, r10)
            r3 = r10
            com.google.android.gms.internal.ads.zzyd r3 = (com.google.android.gms.internal.ads.zzyd) r3
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzxz> r10 = com.google.android.gms.internal.ads.zzxz.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.ads.zzfo.m24341a((android.os.Parcel) r11, r10)
            r4 = r10
            com.google.android.gms.internal.ads.zzxz r4 = (com.google.android.gms.internal.ads.zzxz) r4
            java.lang.String r5 = r11.readString()
            java.lang.String r6 = r11.readString()
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 != 0) goto L_0x0235
        L_0x0233:
            r7 = r13
            goto L_0x0247
        L_0x0235:
            android.os.IInterface r11 = r10.queryLocalInterface(r0)
            boolean r13 = r11 instanceof com.google.android.gms.internal.ads.zzamv
            if (r13 == 0) goto L_0x0241
            r13 = r11
            com.google.android.gms.internal.ads.zzamv r13 = (com.google.android.gms.internal.ads.zzamv) r13
            goto L_0x0233
        L_0x0241:
            com.google.android.gms.internal.ads.zzamx r13 = new com.google.android.gms.internal.ads.zzamx
            r13.<init>(r10)
            goto L_0x0233
        L_0x0247:
            r1 = r9
            r1.mo27412a(r2, r3, r4, r5, r6, r7)
            r12.writeNoException()
            goto L_0x02dc
        L_0x0250:
            r9.destroy()
            r12.writeNoException()
            goto L_0x02dc
        L_0x0258:
            r9.showInterstitial()
            r12.writeNoException()
            goto L_0x02dc
        L_0x0260:
            android.os.IBinder r10 = r11.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r10)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzxz> r1 = com.google.android.gms.internal.ads.zzxz.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzfo.m24341a((android.os.Parcel) r11, r1)
            com.google.android.gms.internal.ads.zzxz r1 = (com.google.android.gms.internal.ads.zzxz) r1
            java.lang.String r2 = r11.readString()
            android.os.IBinder r11 = r11.readStrongBinder()
            if (r11 != 0) goto L_0x027b
            goto L_0x028b
        L_0x027b:
            android.os.IInterface r13 = r11.queryLocalInterface(r0)
            boolean r0 = r13 instanceof com.google.android.gms.internal.ads.zzamv
            if (r0 == 0) goto L_0x0286
            com.google.android.gms.internal.ads.zzamv r13 = (com.google.android.gms.internal.ads.zzamv) r13
            goto L_0x028b
        L_0x0286:
            com.google.android.gms.internal.ads.zzamx r13 = new com.google.android.gms.internal.ads.zzamx
            r13.<init>(r11)
        L_0x028b:
            r9.mo27415b(r10, r1, r2, r13)
            r12.writeNoException()
            goto L_0x02dc
        L_0x0292:
            com.google.android.gms.dynamic.IObjectWrapper r10 = r9.mo27403Q()
            r12.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24342a((android.os.Parcel) r12, (android.os.IInterface) r10)
            goto L_0x02dc
        L_0x029d:
            android.os.IBinder r10 = r11.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r10)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzyd> r10 = com.google.android.gms.internal.ads.zzyd.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.ads.zzfo.m24341a((android.os.Parcel) r11, r10)
            r3 = r10
            com.google.android.gms.internal.ads.zzyd r3 = (com.google.android.gms.internal.ads.zzyd) r3
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzxz> r10 = com.google.android.gms.internal.ads.zzxz.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.ads.zzfo.m24341a((android.os.Parcel) r11, r10)
            r4 = r10
            com.google.android.gms.internal.ads.zzxz r4 = (com.google.android.gms.internal.ads.zzxz) r4
            java.lang.String r5 = r11.readString()
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 != 0) goto L_0x02c3
        L_0x02c1:
            r6 = r13
            goto L_0x02d5
        L_0x02c3:
            android.os.IInterface r11 = r10.queryLocalInterface(r0)
            boolean r13 = r11 instanceof com.google.android.gms.internal.ads.zzamv
            if (r13 == 0) goto L_0x02cf
            r13 = r11
            com.google.android.gms.internal.ads.zzamv r13 = (com.google.android.gms.internal.ads.zzamv) r13
            goto L_0x02c1
        L_0x02cf:
            com.google.android.gms.internal.ads.zzamx r13 = new com.google.android.gms.internal.ads.zzamx
            r13.<init>(r10)
            goto L_0x02c1
        L_0x02d5:
            r1 = r9
            r1.mo27411a((com.google.android.gms.dynamic.IObjectWrapper) r2, (com.google.android.gms.internal.ads.zzyd) r3, (com.google.android.gms.internal.ads.zzxz) r4, (java.lang.String) r5, (com.google.android.gms.internal.ads.zzamv) r6)
            r12.writeNoException()
        L_0x02dc:
            r10 = 1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamt.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
