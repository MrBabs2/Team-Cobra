package com.google.android.gms.internal.ads;

import android.os.Parcelable;

public final class zzyb implements Parcelable.Creator<zzxz> {
    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v5, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r30) {
        /*
            r29 = this;
            r0 = r30
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m16103b(r30)
            r2 = 0
            r3 = 0
            r4 = 0
            r10 = r3
            r12 = r10
            r16 = r12
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r26 = r24
            r28 = r26
            r8 = r4
            r7 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r25 = 0
            r27 = 0
        L_0x002c:
            int r2 = r30.dataPosition()
            if (r2 >= r1) goto L_0x00c0
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m16098a((android.os.Parcel) r30)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m16097a((int) r2)
            switch(r3) {
                case 1: goto L_0x00ba;
                case 2: goto L_0x00b4;
                case 3: goto L_0x00ae;
                case 4: goto L_0x00a8;
                case 5: goto L_0x00a3;
                case 6: goto L_0x009e;
                case 7: goto L_0x0099;
                case 8: goto L_0x0094;
                case 9: goto L_0x008f;
                case 10: goto L_0x0084;
                case 11: goto L_0x0079;
                case 12: goto L_0x0074;
                case 13: goto L_0x006f;
                case 14: goto L_0x006a;
                case 15: goto L_0x0065;
                case 16: goto L_0x0060;
                case 17: goto L_0x005b;
                case 18: goto L_0x0056;
                case 19: goto L_0x004b;
                case 20: goto L_0x0046;
                case 21: goto L_0x0041;
                default: goto L_0x003d;
            }
        L_0x003d:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m16096C(r0, r2)
            goto L_0x002c
        L_0x0041:
            java.lang.String r28 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m16119o(r0, r2)
            goto L_0x002c
        L_0x0046:
            int r27 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m16127w(r0, r2)
            goto L_0x002c
        L_0x004b:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzxt> r3 = com.google.android.gms.internal.ads.zzxt.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m16099a((android.os.Parcel) r0, (int) r2, r3)
            r26 = r2
            com.google.android.gms.internal.ads.zzxt r26 = (com.google.android.gms.internal.ads.zzxt) r26
            goto L_0x002c
        L_0x0056:
            boolean r25 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m16123s(r0, r2)
            goto L_0x002c
        L_0x005b:
            java.lang.String r24 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m16119o(r0, r2)
            goto L_0x002c
        L_0x0060:
            java.lang.String r23 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m16119o(r0, r2)
            goto L_0x002c
        L_0x0065:
            java.util.ArrayList r22 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m16121q(r0, r2)
            goto L_0x002c
        L_0x006a:
            android.os.Bundle r21 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m16110f(r0, r2)
            goto L_0x002c
        L_0x006f:
            android.os.Bundle r20 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m16110f(r0, r2)
            goto L_0x002c
        L_0x0074:
            java.lang.String r19 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m16119o(r0, r2)
            goto L_0x002c
        L_0x0079:
            android.os.Parcelable$Creator r3 = android.location.Location.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m16099a((android.os.Parcel) r0, (int) r2, r3)
            r18 = r2
            android.location.Location r18 = (android.location.Location) r18
            goto L_0x002c
        L_0x0084:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzaca> r3 = com.google.android.gms.internal.ads.zzaca.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m16099a((android.os.Parcel) r0, (int) r2, r3)
            r17 = r2
            com.google.android.gms.internal.ads.zzaca r17 = (com.google.android.gms.internal.ads.zzaca) r17
            goto L_0x002c
        L_0x008f:
            java.lang.String r16 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m16119o(r0, r2)
            goto L_0x002c
        L_0x0094:
            boolean r15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m16123s(r0, r2)
            goto L_0x002c
        L_0x0099:
            int r14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m16127w(r0, r2)
            goto L_0x002c
        L_0x009e:
            boolean r13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m16123s(r0, r2)
            goto L_0x002c
        L_0x00a3:
            java.util.ArrayList r12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m16121q(r0, r2)
            goto L_0x002c
        L_0x00a8:
            int r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m16127w(r0, r2)
            goto L_0x002c
        L_0x00ae:
            android.os.Bundle r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m16110f(r0, r2)
            goto L_0x002c
        L_0x00b4:
            long r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m16129y(r0, r2)
            goto L_0x002c
        L_0x00ba:
            int r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m16127w(r0, r2)
            goto L_0x002c
        L_0x00c0:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m16122r(r0, r1)
            com.google.android.gms.internal.ads.zzxz r0 = new com.google.android.gms.internal.ads.zzxz
            r6 = r0
            r6.<init>(r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyb.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzxz[i];
    }
}
