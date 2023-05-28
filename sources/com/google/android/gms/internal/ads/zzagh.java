package com.google.android.gms.internal.ads;

public abstract class zzagh extends zzfn implements zzagg {
    public zzagh() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            switch(r1) {
                case 2: goto L_0x0160;
                case 3: goto L_0x0155;
                case 4: goto L_0x014a;
                case 5: goto L_0x013f;
                case 6: goto L_0x0134;
                case 7: goto L_0x0129;
                case 8: goto L_0x011e;
                case 9: goto L_0x0113;
                case 10: goto L_0x0108;
                case 11: goto L_0x00fd;
                case 12: goto L_0x00f1;
                case 13: goto L_0x00e9;
                case 14: goto L_0x00dd;
                case 15: goto L_0x00cd;
                case 16: goto L_0x00b9;
                case 17: goto L_0x00a9;
                case 18: goto L_0x009d;
                case 19: goto L_0x0091;
                case 20: goto L_0x0085;
                case 21: goto L_0x0061;
                case 22: goto L_0x0059;
                case 23: goto L_0x004d;
                case 24: goto L_0x0041;
                case 25: goto L_0x0031;
                case 26: goto L_0x0021;
                case 27: goto L_0x0019;
                case 28: goto L_0x0011;
                case 29: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            com.google.android.gms.internal.ads.zzaee r1 = r0.mo27284d0()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24342a((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x016a
        L_0x0011:
            r0.mo27294h1()
            r3.writeNoException()
            goto L_0x016a
        L_0x0019:
            r0.mo27300w()
            r3.writeNoException()
            goto L_0x016a
        L_0x0021:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzaag r1 = com.google.android.gms.internal.ads.zzaah.m18708a(r1)
            r0.mo27276a((com.google.android.gms.internal.ads.zzaag) r1)
            r3.writeNoException()
            goto L_0x016a
        L_0x0031:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzaak r1 = com.google.android.gms.internal.ads.zzaal.m18710a(r1)
            r0.mo27277a((com.google.android.gms.internal.ads.zzaak) r1)
            r3.writeNoException()
            goto L_0x016a
        L_0x0041:
            boolean r1 = r0.mo27287e0()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24344a((android.os.Parcel) r3, (boolean) r1)
            goto L_0x016a
        L_0x004d:
            java.util.List r1 = r0.mo27273E0()
            r3.writeNoException()
            r3.writeList(r1)
            goto L_0x016a
        L_0x0059:
            r0.mo27299u()
            r3.writeNoException()
            goto L_0x016a
        L_0x0061:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0069
            r1 = 0
            goto L_0x007d
        L_0x0069:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzagd
            if (r4 == 0) goto L_0x0077
            r1 = r2
            com.google.android.gms.internal.ads.zzagd r1 = (com.google.android.gms.internal.ads.zzagd) r1
            goto L_0x007d
        L_0x0077:
            com.google.android.gms.internal.ads.zzagf r2 = new com.google.android.gms.internal.ads.zzagf
            r2.<init>(r1)
            r1 = r2
        L_0x007d:
            r0.mo27278a((com.google.android.gms.internal.ads.zzagd) r1)
            r3.writeNoException()
            goto L_0x016a
        L_0x0085:
            android.os.Bundle r1 = r0.getExtras()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24347b(r3, r1)
            goto L_0x016a
        L_0x0091:
            com.google.android.gms.dynamic.IObjectWrapper r1 = r0.mo27286e()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24342a((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x016a
        L_0x009d:
            com.google.android.gms.dynamic.IObjectWrapper r1 = r0.mo27296j()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24342a((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x016a
        L_0x00a9:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzfo.m24341a((android.os.Parcel) r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.mo27282c(r1)
            r3.writeNoException()
            goto L_0x016a
        L_0x00b9:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzfo.m24341a((android.os.Parcel) r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            boolean r1 = r0.mo27280b(r1)
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24344a((android.os.Parcel) r3, (boolean) r1)
            goto L_0x016a
        L_0x00cd:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzfo.m24341a((android.os.Parcel) r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.mo27275a((android.os.Bundle) r1)
            r3.writeNoException()
            goto L_0x016a
        L_0x00dd:
            com.google.android.gms.internal.ads.zzaea r1 = r0.mo27274a()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24342a((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x016a
        L_0x00e9:
            r0.destroy()
            r3.writeNoException()
            goto L_0x016a
        L_0x00f1:
            java.lang.String r1 = r0.getMediationAdapterClassName()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x016a
        L_0x00fd:
            com.google.android.gms.internal.ads.zzaar r1 = r0.getVideoController()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24342a((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x016a
        L_0x0108:
            java.lang.String r1 = r0.mo27295i()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x016a
        L_0x0113:
            java.lang.String r1 = r0.getStore()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x016a
        L_0x011e:
            double r1 = r0.mo27297k()
            r3.writeNoException()
            r3.writeDouble(r1)
            goto L_0x016a
        L_0x0129:
            java.lang.String r1 = r0.mo27298l()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x016a
        L_0x0134:
            java.lang.String r1 = r0.mo27281c()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x016a
        L_0x013f:
            com.google.android.gms.internal.ads.zzaei r1 = r0.mo27293h()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzfo.m24342a((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x016a
        L_0x014a:
            java.lang.String r1 = r0.mo27283d()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x016a
        L_0x0155:
            java.util.List r1 = r0.mo27288f()
            r3.writeNoException()
            r3.writeList(r1)
            goto L_0x016a
        L_0x0160:
            java.lang.String r1 = r0.mo27279b()
            r3.writeNoException()
            r3.writeString(r1)
        L_0x016a:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagh.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
