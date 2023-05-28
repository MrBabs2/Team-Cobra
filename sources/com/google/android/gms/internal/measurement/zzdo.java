package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzdo extends zzr implements zzdn {
    public zzdo() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    /* renamed from: a */
    public static zzdn m26411a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof zzdn) {
            return (zzdn) queryLocalInterface;
        }
        return new zzdp(iBinder);
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v9, types: [com.google.android.gms.internal.measurement.zzdq] */
    /* JADX WARNING: type inference failed for: r3v14, types: [com.google.android.gms.internal.measurement.zzdq] */
    /* JADX WARNING: type inference failed for: r3v20, types: [com.google.android.gms.internal.measurement.zzdq] */
    /* JADX WARNING: type inference failed for: r3v26, types: [com.google.android.gms.internal.measurement.zzdq] */
    /* JADX WARNING: type inference failed for: r3v30, types: [com.google.android.gms.internal.measurement.zzdq] */
    /* JADX WARNING: type inference failed for: r3v34, types: [com.google.android.gms.internal.measurement.zzdw] */
    /* JADX WARNING: type inference failed for: r3v38, types: [com.google.android.gms.internal.measurement.zzdq] */
    /* JADX WARNING: type inference failed for: r3v42, types: [com.google.android.gms.internal.measurement.zzdq] */
    /* JADX WARNING: type inference failed for: r3v46, types: [com.google.android.gms.internal.measurement.zzdq] */
    /* JADX WARNING: type inference failed for: r3v50, types: [com.google.android.gms.internal.measurement.zzdq] */
    /* JADX WARNING: type inference failed for: r3v55, types: [com.google.android.gms.internal.measurement.zzdq] */
    /* JADX WARNING: type inference failed for: r3v60, types: [com.google.android.gms.internal.measurement.zzdq] */
    /* JADX WARNING: type inference failed for: r3v67, types: [com.google.android.gms.internal.measurement.zzdt] */
    /* JADX WARNING: type inference failed for: r3v71, types: [com.google.android.gms.internal.measurement.zzdt] */
    /* JADX WARNING: type inference failed for: r3v75, types: [com.google.android.gms.internal.measurement.zzdt] */
    /* JADX WARNING: type inference failed for: r3v79, types: [com.google.android.gms.internal.measurement.zzdq] */
    /* JADX WARNING: type inference failed for: r3v84 */
    /* JADX WARNING: type inference failed for: r3v85 */
    /* JADX WARNING: type inference failed for: r3v86 */
    /* JADX WARNING: type inference failed for: r3v87 */
    /* JADX WARNING: type inference failed for: r3v88 */
    /* JADX WARNING: type inference failed for: r3v89 */
    /* JADX WARNING: type inference failed for: r3v90 */
    /* JADX WARNING: type inference failed for: r3v91 */
    /* JADX WARNING: type inference failed for: r3v92 */
    /* JADX WARNING: type inference failed for: r3v93 */
    /* JADX WARNING: type inference failed for: r3v94 */
    /* JADX WARNING: type inference failed for: r3v95 */
    /* JADX WARNING: type inference failed for: r3v96 */
    /* JADX WARNING: type inference failed for: r3v97 */
    /* JADX WARNING: type inference failed for: r3v98 */
    /* JADX WARNING: type inference failed for: r3v99 */
    /* JADX WARNING: type inference failed for: r3v100 */
    /* JADX WARNING: type inference failed for: r3v101 */
    /* JADX WARNING: type inference failed for: r3v102 */
    /* JADX WARNING: type inference failed for: r3v103 */
    /* JADX WARNING: type inference failed for: r3v104 */
    /* JADX WARNING: type inference failed for: r3v105 */
    /* JADX WARNING: type inference failed for: r3v106 */
    /* JADX WARNING: type inference failed for: r3v107 */
    /* JADX WARNING: type inference failed for: r3v108 */
    /* JADX WARNING: type inference failed for: r3v109 */
    /* JADX WARNING: type inference failed for: r3v110 */
    /* JADX WARNING: type inference failed for: r3v111 */
    /* JADX WARNING: type inference failed for: r3v112 */
    /* JADX WARNING: type inference failed for: r3v113 */
    /* JADX WARNING: type inference failed for: r3v114 */
    /* JADX WARNING: type inference failed for: r3v115 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo30323a(int r11, android.os.Parcel r12, android.os.Parcel r13, int r14) throws android.os.RemoteException {
        /*
            r10 = this;
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IEventHandlerProxy"
            java.lang.String r2 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            r3 = 0
            switch(r11) {
                case 1: goto L_0x03b1;
                case 2: goto L_0x0390;
                case 3: goto L_0x035a;
                case 4: goto L_0x033c;
                case 5: goto L_0x0313;
                case 6: goto L_0x02f2;
                case 7: goto L_0x02e5;
                case 8: goto L_0x02d4;
                case 9: goto L_0x02bf;
                case 10: goto L_0x029a;
                case 11: goto L_0x028d;
                case 12: goto L_0x0284;
                case 13: goto L_0x027b;
                case 14: goto L_0x0272;
                case 15: goto L_0x0258;
                case 16: goto L_0x023b;
                case 17: goto L_0x021e;
                case 18: goto L_0x01ff;
                case 19: goto L_0x01e2;
                case 20: goto L_0x01c5;
                case 21: goto L_0x01a8;
                case 22: goto L_0x018b;
                case 23: goto L_0x017e;
                case 24: goto L_0x0171;
                case 25: goto L_0x0160;
                case 26: goto L_0x014f;
                case 27: goto L_0x0136;
                case 28: goto L_0x0125;
                case 29: goto L_0x0114;
                case 30: goto L_0x0103;
                case 31: goto L_0x00da;
                case 32: goto L_0x00b1;
                case 33: goto L_0x008b;
                case 34: goto L_0x006e;
                case 35: goto L_0x0051;
                case 36: goto L_0x0034;
                case 37: goto L_0x002b;
                case 38: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            r0 = 0
            return r0
        L_0x000a:
            android.os.IBinder r1 = r12.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            goto L_0x0022
        L_0x0011:
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzdq
            if (r3 == 0) goto L_0x001d
            r3 = r2
            com.google.android.gms.internal.measurement.zzdq r3 = (com.google.android.gms.internal.measurement.zzdq) r3
            goto L_0x0022
        L_0x001d:
            com.google.android.gms.internal.measurement.zzds r3 = new com.google.android.gms.internal.measurement.zzds
            r3.<init>(r1)
        L_0x0022:
            int r0 = r12.readInt()
            r10.mo30295a((com.google.android.gms.internal.measurement.zzdq) r3, (int) r0)
            goto L_0x03c8
        L_0x002b:
            java.util.HashMap r0 = com.google.android.gms.internal.measurement.zzs.m26510b(r12)
            r10.mo30306a((java.util.Map) r0)
            goto L_0x03c8
        L_0x0034:
            android.os.IBinder r0 = r12.readStrongBinder()
            if (r0 != 0) goto L_0x003b
            goto L_0x004c
        L_0x003b:
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzdt
            if (r2 == 0) goto L_0x0047
            r3 = r1
            com.google.android.gms.internal.measurement.zzdt r3 = (com.google.android.gms.internal.measurement.zzdt) r3
            goto L_0x004c
        L_0x0047:
            com.google.android.gms.internal.measurement.zzdv r3 = new com.google.android.gms.internal.measurement.zzdv
            r3.<init>(r0)
        L_0x004c:
            r10.mo30310b((com.google.android.gms.internal.measurement.zzdt) r3)
            goto L_0x03c8
        L_0x0051:
            android.os.IBinder r0 = r12.readStrongBinder()
            if (r0 != 0) goto L_0x0058
            goto L_0x0069
        L_0x0058:
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzdt
            if (r2 == 0) goto L_0x0064
            r3 = r1
            com.google.android.gms.internal.measurement.zzdt r3 = (com.google.android.gms.internal.measurement.zzdt) r3
            goto L_0x0069
        L_0x0064:
            com.google.android.gms.internal.measurement.zzdv r3 = new com.google.android.gms.internal.measurement.zzdv
            r3.<init>(r0)
        L_0x0069:
            r10.mo30315c((com.google.android.gms.internal.measurement.zzdt) r3)
            goto L_0x03c8
        L_0x006e:
            android.os.IBinder r0 = r12.readStrongBinder()
            if (r0 != 0) goto L_0x0075
            goto L_0x0086
        L_0x0075:
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzdt
            if (r2 == 0) goto L_0x0081
            r3 = r1
            com.google.android.gms.internal.measurement.zzdt r3 = (com.google.android.gms.internal.measurement.zzdt) r3
            goto L_0x0086
        L_0x0081:
            com.google.android.gms.internal.measurement.zzdv r3 = new com.google.android.gms.internal.measurement.zzdv
            r3.<init>(r0)
        L_0x0086:
            r10.mo30296a((com.google.android.gms.internal.measurement.zzdt) r3)
            goto L_0x03c8
        L_0x008b:
            int r1 = r12.readInt()
            java.lang.String r2 = r12.readString()
            android.os.IBinder r3 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r3)
            android.os.IBinder r4 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r4)
            android.os.IBinder r0 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r0)
            r0 = r10
            r0.mo30285a((int) r1, (java.lang.String) r2, (com.google.android.gms.dynamic.IObjectWrapper) r3, (com.google.android.gms.dynamic.IObjectWrapper) r4, (com.google.android.gms.dynamic.IObjectWrapper) r5)
            goto L_0x03c8
        L_0x00b1:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.zzs.m26505a((android.os.Parcel) r12, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            android.os.IBinder r4 = r12.readStrongBinder()
            if (r4 != 0) goto L_0x00c0
            goto L_0x00d1
        L_0x00c0:
            android.os.IInterface r2 = r4.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzdq
            if (r3 == 0) goto L_0x00cc
            r3 = r2
            com.google.android.gms.internal.measurement.zzdq r3 = (com.google.android.gms.internal.measurement.zzdq) r3
            goto L_0x00d1
        L_0x00cc:
            com.google.android.gms.internal.measurement.zzds r3 = new com.google.android.gms.internal.measurement.zzds
            r3.<init>(r4)
        L_0x00d1:
            long r4 = r12.readLong()
            r10.mo30288a((android.os.Bundle) r1, (com.google.android.gms.internal.measurement.zzdq) r3, (long) r4)
            goto L_0x03c8
        L_0x00da:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r1)
            android.os.IBinder r4 = r12.readStrongBinder()
            if (r4 != 0) goto L_0x00e9
            goto L_0x00fa
        L_0x00e9:
            android.os.IInterface r2 = r4.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzdq
            if (r3 == 0) goto L_0x00f5
            r3 = r2
            com.google.android.gms.internal.measurement.zzdq r3 = (com.google.android.gms.internal.measurement.zzdq) r3
            goto L_0x00fa
        L_0x00f5:
            com.google.android.gms.internal.measurement.zzds r3 = new com.google.android.gms.internal.measurement.zzds
            r3.<init>(r4)
        L_0x00fa:
            long r4 = r12.readLong()
            r10.mo30291a((com.google.android.gms.dynamic.IObjectWrapper) r1, (com.google.android.gms.internal.measurement.zzdq) r3, (long) r4)
            goto L_0x03c8
        L_0x0103:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r1)
            long r2 = r12.readLong()
            r10.mo30289a((com.google.android.gms.dynamic.IObjectWrapper) r1, (long) r2)
            goto L_0x03c8
        L_0x0114:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r1)
            long r2 = r12.readLong()
            r10.mo30320e(r1, r2)
            goto L_0x03c8
        L_0x0125:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r1)
            long r2 = r12.readLong()
            r10.mo30313c((com.google.android.gms.dynamic.IObjectWrapper) r1, (long) r2)
            goto L_0x03c8
        L_0x0136:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r1)
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.measurement.zzs.m26505a((android.os.Parcel) r12, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            long r3 = r12.readLong()
            r10.mo30290a((com.google.android.gms.dynamic.IObjectWrapper) r1, (android.os.Bundle) r2, (long) r3)
            goto L_0x03c8
        L_0x014f:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r1)
            long r2 = r12.readLong()
            r10.mo30308b((com.google.android.gms.dynamic.IObjectWrapper) r1, (long) r2)
            goto L_0x03c8
        L_0x0160:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r1)
            long r2 = r12.readLong()
            r10.mo30318d(r1, r2)
            goto L_0x03c8
        L_0x0171:
            java.lang.String r1 = r12.readString()
            long r2 = r12.readLong()
            r10.mo30316c((java.lang.String) r1, (long) r2)
            goto L_0x03c8
        L_0x017e:
            java.lang.String r1 = r12.readString()
            long r2 = r12.readLong()
            r10.mo30311b((java.lang.String) r1, (long) r2)
            goto L_0x03c8
        L_0x018b:
            android.os.IBinder r0 = r12.readStrongBinder()
            if (r0 != 0) goto L_0x0192
            goto L_0x01a3
        L_0x0192:
            android.os.IInterface r1 = r0.queryLocalInterface(r2)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzdq
            if (r2 == 0) goto L_0x019e
            r3 = r1
            com.google.android.gms.internal.measurement.zzdq r3 = (com.google.android.gms.internal.measurement.zzdq) r3
            goto L_0x01a3
        L_0x019e:
            com.google.android.gms.internal.measurement.zzds r3 = new com.google.android.gms.internal.measurement.zzds
            r3.<init>(r0)
        L_0x01a3:
            r10.mo30294a((com.google.android.gms.internal.measurement.zzdq) r3)
            goto L_0x03c8
        L_0x01a8:
            android.os.IBinder r0 = r12.readStrongBinder()
            if (r0 != 0) goto L_0x01af
            goto L_0x01c0
        L_0x01af:
            android.os.IInterface r1 = r0.queryLocalInterface(r2)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzdq
            if (r2 == 0) goto L_0x01bb
            r3 = r1
            com.google.android.gms.internal.measurement.zzdq r3 = (com.google.android.gms.internal.measurement.zzdq) r3
            goto L_0x01c0
        L_0x01bb:
            com.google.android.gms.internal.measurement.zzds r3 = new com.google.android.gms.internal.measurement.zzds
            r3.<init>(r0)
        L_0x01c0:
            r10.mo30319d((com.google.android.gms.internal.measurement.zzdq) r3)
            goto L_0x03c8
        L_0x01c5:
            android.os.IBinder r0 = r12.readStrongBinder()
            if (r0 != 0) goto L_0x01cc
            goto L_0x01dd
        L_0x01cc:
            android.os.IInterface r1 = r0.queryLocalInterface(r2)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzdq
            if (r2 == 0) goto L_0x01d8
            r3 = r1
            com.google.android.gms.internal.measurement.zzdq r3 = (com.google.android.gms.internal.measurement.zzdq) r3
            goto L_0x01dd
        L_0x01d8:
            com.google.android.gms.internal.measurement.zzds r3 = new com.google.android.gms.internal.measurement.zzds
            r3.<init>(r0)
        L_0x01dd:
            r10.mo30309b((com.google.android.gms.internal.measurement.zzdq) r3)
            goto L_0x03c8
        L_0x01e2:
            android.os.IBinder r0 = r12.readStrongBinder()
            if (r0 != 0) goto L_0x01e9
            goto L_0x01fa
        L_0x01e9:
            android.os.IInterface r1 = r0.queryLocalInterface(r2)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzdq
            if (r2 == 0) goto L_0x01f5
            r3 = r1
            com.google.android.gms.internal.measurement.zzdq r3 = (com.google.android.gms.internal.measurement.zzdq) r3
            goto L_0x01fa
        L_0x01f5:
            com.google.android.gms.internal.measurement.zzds r3 = new com.google.android.gms.internal.measurement.zzds
            r3.<init>(r0)
        L_0x01fa:
            r10.mo30321e(r3)
            goto L_0x03c8
        L_0x01ff:
            android.os.IBinder r0 = r12.readStrongBinder()
            if (r0 != 0) goto L_0x0206
            goto L_0x0219
        L_0x0206:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IStringProvider"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzdw
            if (r2 == 0) goto L_0x0214
            r3 = r1
            com.google.android.gms.internal.measurement.zzdw r3 = (com.google.android.gms.internal.measurement.zzdw) r3
            goto L_0x0219
        L_0x0214:
            com.google.android.gms.internal.measurement.zzdx r3 = new com.google.android.gms.internal.measurement.zzdx
            r3.<init>(r0)
        L_0x0219:
            r10.mo30297a((com.google.android.gms.internal.measurement.zzdw) r3)
            goto L_0x03c8
        L_0x021e:
            android.os.IBinder r0 = r12.readStrongBinder()
            if (r0 != 0) goto L_0x0225
            goto L_0x0236
        L_0x0225:
            android.os.IInterface r1 = r0.queryLocalInterface(r2)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzdq
            if (r2 == 0) goto L_0x0231
            r3 = r1
            com.google.android.gms.internal.measurement.zzdq r3 = (com.google.android.gms.internal.measurement.zzdq) r3
            goto L_0x0236
        L_0x0231:
            com.google.android.gms.internal.measurement.zzds r3 = new com.google.android.gms.internal.measurement.zzds
            r3.<init>(r0)
        L_0x0236:
            r10.mo30314c((com.google.android.gms.internal.measurement.zzdq) r3)
            goto L_0x03c8
        L_0x023b:
            android.os.IBinder r0 = r12.readStrongBinder()
            if (r0 != 0) goto L_0x0242
            goto L_0x0253
        L_0x0242:
            android.os.IInterface r1 = r0.queryLocalInterface(r2)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzdq
            if (r2 == 0) goto L_0x024e
            r3 = r1
            com.google.android.gms.internal.measurement.zzdq r3 = (com.google.android.gms.internal.measurement.zzdq) r3
            goto L_0x0253
        L_0x024e:
            com.google.android.gms.internal.measurement.zzds r3 = new com.google.android.gms.internal.measurement.zzds
            r3.<init>(r0)
        L_0x0253:
            r10.mo30322f(r3)
            goto L_0x03c8
        L_0x0258:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r1)
            java.lang.String r2 = r12.readString()
            java.lang.String r3 = r12.readString()
            long r4 = r12.readLong()
            r0 = r10
            r0.mo30293a((com.google.android.gms.dynamic.IObjectWrapper) r1, (java.lang.String) r2, (java.lang.String) r3, (long) r4)
            goto L_0x03c8
        L_0x0272:
            long r0 = r12.readLong()
            r10.mo30312c((long) r0)
            goto L_0x03c8
        L_0x027b:
            long r0 = r12.readLong()
            r10.mo30317d((long) r0)
            goto L_0x03c8
        L_0x0284:
            long r0 = r12.readLong()
            r10.mo30286a((long) r0)
            goto L_0x03c8
        L_0x028d:
            boolean r1 = com.google.android.gms.internal.measurement.zzs.m26509a(r12)
            long r2 = r12.readLong()
            r10.mo30307a((boolean) r1, (long) r2)
            goto L_0x03c8
        L_0x029a:
            java.lang.String r1 = r12.readString()
            java.lang.String r4 = r12.readString()
            android.os.IBinder r0 = r12.readStrongBinder()
            if (r0 != 0) goto L_0x02a9
            goto L_0x02ba
        L_0x02a9:
            android.os.IInterface r2 = r0.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzdq
            if (r3 == 0) goto L_0x02b5
            r3 = r2
            com.google.android.gms.internal.measurement.zzdq r3 = (com.google.android.gms.internal.measurement.zzdq) r3
            goto L_0x02ba
        L_0x02b5:
            com.google.android.gms.internal.measurement.zzds r3 = new com.google.android.gms.internal.measurement.zzds
            r3.<init>(r0)
        L_0x02ba:
            r10.mo30304a((java.lang.String) r1, (java.lang.String) r4, (com.google.android.gms.internal.measurement.zzdq) r3)
            goto L_0x03c8
        L_0x02bf:
            java.lang.String r1 = r12.readString()
            java.lang.String r2 = r12.readString()
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.measurement.zzs.m26505a((android.os.Parcel) r12, r3)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r10.mo30300a((java.lang.String) r1, (java.lang.String) r2, (android.os.Bundle) r0)
            goto L_0x03c8
        L_0x02d4:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.zzs.m26505a((android.os.Parcel) r12, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            long r2 = r12.readLong()
            r10.mo30287a((android.os.Bundle) r1, (long) r2)
            goto L_0x03c8
        L_0x02e5:
            java.lang.String r1 = r12.readString()
            long r2 = r12.readLong()
            r10.mo30298a((java.lang.String) r1, (long) r2)
            goto L_0x03c8
        L_0x02f2:
            java.lang.String r1 = r12.readString()
            android.os.IBinder r0 = r12.readStrongBinder()
            if (r0 != 0) goto L_0x02fd
            goto L_0x030e
        L_0x02fd:
            android.os.IInterface r2 = r0.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzdq
            if (r3 == 0) goto L_0x0309
            r3 = r2
            com.google.android.gms.internal.measurement.zzdq r3 = (com.google.android.gms.internal.measurement.zzdq) r3
            goto L_0x030e
        L_0x0309:
            com.google.android.gms.internal.measurement.zzds r3 = new com.google.android.gms.internal.measurement.zzds
            r3.<init>(r0)
        L_0x030e:
            r10.mo30299a((java.lang.String) r1, (com.google.android.gms.internal.measurement.zzdq) r3)
            goto L_0x03c8
        L_0x0313:
            java.lang.String r1 = r12.readString()
            java.lang.String r4 = r12.readString()
            boolean r5 = com.google.android.gms.internal.measurement.zzs.m26509a(r12)
            android.os.IBinder r0 = r12.readStrongBinder()
            if (r0 != 0) goto L_0x0326
            goto L_0x0337
        L_0x0326:
            android.os.IInterface r2 = r0.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzdq
            if (r3 == 0) goto L_0x0332
            r3 = r2
            com.google.android.gms.internal.measurement.zzdq r3 = (com.google.android.gms.internal.measurement.zzdq) r3
            goto L_0x0337
        L_0x0332:
            com.google.android.gms.internal.measurement.zzds r3 = new com.google.android.gms.internal.measurement.zzds
            r3.<init>(r0)
        L_0x0337:
            r10.mo30305a((java.lang.String) r1, (java.lang.String) r4, (boolean) r5, (com.google.android.gms.internal.measurement.zzdq) r3)
            goto L_0x03c8
        L_0x033c:
            java.lang.String r1 = r12.readString()
            java.lang.String r2 = r12.readString()
            android.os.IBinder r3 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r3)
            boolean r4 = com.google.android.gms.internal.measurement.zzs.m26509a(r12)
            long r5 = r12.readLong()
            r0 = r10
            r0.mo30303a((java.lang.String) r1, (java.lang.String) r2, (com.google.android.gms.dynamic.IObjectWrapper) r3, (boolean) r4, (long) r5)
            goto L_0x03c8
        L_0x035a:
            java.lang.String r1 = r12.readString()
            java.lang.String r4 = r12.readString()
            android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
            android.os.Parcelable r5 = com.google.android.gms.internal.measurement.zzs.m26505a((android.os.Parcel) r12, r5)
            android.os.Bundle r5 = (android.os.Bundle) r5
            android.os.IBinder r6 = r12.readStrongBinder()
            if (r6 != 0) goto L_0x0372
            r6 = r3
            goto L_0x0383
        L_0x0372:
            android.os.IInterface r2 = r6.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzdq
            if (r3 == 0) goto L_0x037d
            com.google.android.gms.internal.measurement.zzdq r2 = (com.google.android.gms.internal.measurement.zzdq) r2
            goto L_0x0382
        L_0x037d:
            com.google.android.gms.internal.measurement.zzds r2 = new com.google.android.gms.internal.measurement.zzds
            r2.<init>(r6)
        L_0x0382:
            r6 = r2
        L_0x0383:
            long r8 = r12.readLong()
            r0 = r10
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r8
            r0.mo30301a((java.lang.String) r1, (java.lang.String) r2, (android.os.Bundle) r3, (com.google.android.gms.internal.measurement.zzdq) r4, (long) r5)
            goto L_0x03c8
        L_0x0390:
            java.lang.String r1 = r12.readString()
            java.lang.String r2 = r12.readString()
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.measurement.zzs.m26505a((android.os.Parcel) r12, r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            boolean r4 = com.google.android.gms.internal.measurement.zzs.m26509a(r12)
            boolean r5 = com.google.android.gms.internal.measurement.zzs.m26509a(r12)
            long r6 = r12.readLong()
            r0 = r10
            r0.mo30302a(r1, r2, r3, r4, r5, r6)
            goto L_0x03c8
        L_0x03b1:
            android.os.IBinder r1 = r12.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.m16389a(r1)
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzdy> r2 = com.google.android.gms.internal.measurement.zzdy.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.measurement.zzs.m26505a((android.os.Parcel) r12, r2)
            com.google.android.gms.internal.measurement.zzdy r2 = (com.google.android.gms.internal.measurement.zzdy) r2
            long r3 = r12.readLong()
            r10.mo30292a((com.google.android.gms.dynamic.IObjectWrapper) r1, (com.google.android.gms.internal.measurement.zzdy) r2, (long) r3)
        L_0x03c8:
            r13.writeNoException()
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzdo.mo30323a(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
