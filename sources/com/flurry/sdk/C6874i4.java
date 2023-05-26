package com.flurry.sdk;

import java.util.HashMap;
import java.util.Map;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;

/* renamed from: com.flurry.sdk.i4 */
public final class C6874i4 extends C7008r6 {
    public C6874i4(C7031t6 t6Var) {
        super(t6Var);
    }

    /* renamed from: a */
    public final C7023s6 mo23538a() {
        return C7023s6.SESSION_PROPERTIES;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01fa  */
    @android.annotation.TargetApi(18)
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> m14610a(com.flurry.sdk.C6845h0 r11) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            boolean r1 = r11.f12812a
            java.lang.String r2 = "SessionPropertiesFrame"
            r3 = 5
            r4 = 0
            if (r1 == 0) goto L_0x0121
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r7
            java.lang.String r1 = java.lang.Long.toString(r5)
            java.util.Map r1 = m14611a((java.lang.String) r1)
            java.lang.String r5 = "boot.time"
            r0.put(r5, r1)
            android.os.StatFs r1 = new android.os.StatFs
            java.io.File r5 = android.os.Environment.getRootDirectory()
            java.lang.String r5 = r5.getAbsolutePath()
            r1.<init>(r5)
            int r5 = android.os.Build.VERSION.SDK_INT
            java.lang.String r6 = "disk.size.available.internal"
            java.lang.String r7 = "disk.size.total.internal"
            r8 = 18
            if (r5 < r8) goto L_0x005e
            long r9 = r1.getAvailableBlocksLong()
            java.lang.String r5 = java.lang.Long.toString(r9)
            java.util.Map r5 = m14611a((java.lang.String) r5)
            r0.put(r7, r5)
            long r9 = r1.getAvailableBlocksLong()
            java.lang.String r1 = java.lang.Long.toString(r9)
            java.util.Map r1 = m14611a((java.lang.String) r1)
            r0.put(r6, r1)
            goto L_0x007e
        L_0x005e:
            int r5 = r1.getAvailableBlocks()
            long r9 = (long) r5
            java.lang.String r5 = java.lang.Long.toString(r9)
            java.util.Map r5 = m14611a((java.lang.String) r5)
            r0.put(r7, r5)
            int r1 = r1.getAvailableBlocks()
            long r9 = (long) r1
            java.lang.String r1 = java.lang.Long.toString(r9)
            java.util.Map r1 = m14611a((java.lang.String) r1)
            r0.put(r6, r1)
        L_0x007e:
            com.flurry.sdk.n r1 = r11.f12813b
            if (r1 == 0) goto L_0x00e3
            boolean r1 = r1.f13003a
            if (r1 != 0) goto L_0x00e3
            android.os.StatFs r1 = new android.os.StatFs     // Catch:{ Exception -> 0x00db }
            java.io.File r5 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x00db }
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ Exception -> 0x00db }
            r1.<init>(r5)     // Catch:{ Exception -> 0x00db }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00db }
            java.lang.String r6 = "disk.size.available.external"
            java.lang.String r7 = "disk.size.total.external"
            if (r5 < r8) goto L_0x00ba
            long r8 = r1.getAvailableBlocksLong()     // Catch:{ Exception -> 0x00db }
            java.lang.String r5 = java.lang.Long.toString(r8)     // Catch:{ Exception -> 0x00db }
            java.util.Map r5 = m14611a((java.lang.String) r5)     // Catch:{ Exception -> 0x00db }
            r0.put(r7, r5)     // Catch:{ Exception -> 0x00db }
            long r7 = r1.getAvailableBlocksLong()     // Catch:{ Exception -> 0x00db }
            java.lang.String r1 = java.lang.Long.toString(r7)     // Catch:{ Exception -> 0x00db }
            java.util.Map r1 = m14611a((java.lang.String) r1)     // Catch:{ Exception -> 0x00db }
            r0.put(r6, r1)     // Catch:{ Exception -> 0x00db }
            goto L_0x00e3
        L_0x00ba:
            int r5 = r1.getAvailableBlocks()     // Catch:{ Exception -> 0x00db }
            long r8 = (long) r5     // Catch:{ Exception -> 0x00db }
            java.lang.String r5 = java.lang.Long.toString(r8)     // Catch:{ Exception -> 0x00db }
            java.util.Map r5 = m14611a((java.lang.String) r5)     // Catch:{ Exception -> 0x00db }
            r0.put(r7, r5)     // Catch:{ Exception -> 0x00db }
            int r1 = r1.getAvailableBlocks()     // Catch:{ Exception -> 0x00db }
            long r7 = (long) r1     // Catch:{ Exception -> 0x00db }
            java.lang.String r1 = java.lang.Long.toString(r7)     // Catch:{ Exception -> 0x00db }
            java.util.Map r1 = m14611a((java.lang.String) r1)     // Catch:{ Exception -> 0x00db }
            r0.put(r6, r1)     // Catch:{ Exception -> 0x00db }
            goto L_0x00e3
        L_0x00db:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            com.flurry.sdk.C6792d1.m14476a((int) r3, (java.lang.String) r2, (java.lang.String) r1)
        L_0x00e3:
            com.flurry.sdk.C6923m0.m14706a()
            android.content.Context r1 = com.flurry.sdk.C6747b0.m14386a()
            java.lang.String r5 = "phone"
            java.lang.Object r1 = r1.getSystemService(r5)
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1
            if (r1 != 0) goto L_0x00f6
            r1 = r4
            goto L_0x00fa
        L_0x00f6:
            java.lang.String r1 = r1.getNetworkOperatorName()
        L_0x00fa:
            java.util.Map r1 = m14611a((java.lang.String) r1)
            java.lang.String r6 = "carrier.name"
            r0.put(r6, r1)
            com.flurry.sdk.C6923m0.m14706a()
            android.content.Context r1 = com.flurry.sdk.C6747b0.m14386a()
            java.lang.Object r1 = r1.getSystemService(r5)
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1
            if (r1 != 0) goto L_0x0114
            r1 = r4
            goto L_0x0118
        L_0x0114:
            java.lang.String r1 = r1.getNetworkOperator()
        L_0x0118:
            java.util.Map r1 = m14611a((java.lang.String) r1)
            java.lang.String r5 = "carrier.details"
            r0.put(r5, r1)
        L_0x0121:
            android.content.Context r1 = com.flurry.sdk.C6747b0.m14386a()
            java.lang.String r5 = "activity"
            java.lang.Object r1 = r1.getSystemService(r5)
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1
            android.app.ActivityManager$MemoryInfo r5 = new android.app.ActivityManager$MemoryInfo
            r5.<init>()
            r1.getMemoryInfo(r5)
            long r6 = r5.availMem
            java.lang.String r1 = java.lang.Long.toString(r6)
            java.util.Map r1 = m14611a((java.lang.String) r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "memory.available"
            r6.<init>(r7)
            boolean r7 = r11.f12812a
            java.lang.String r8 = ".start"
            java.lang.String r9 = ".end"
            if (r7 == 0) goto L_0x0150
            r7 = r8
            goto L_0x0151
        L_0x0150:
            r7 = r9
        L_0x0151:
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r0.put(r6, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r6 = 16
            if (r1 < r6) goto L_0x0183
            long r5 = r5.availMem
            java.lang.String r1 = java.lang.Long.toString(r5)
            java.util.Map r1 = m14611a((java.lang.String) r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "memory.total"
            r5.<init>(r6)
            boolean r6 = r11.f12812a
            if (r6 == 0) goto L_0x0178
            r6 = r8
            goto L_0x0179
        L_0x0178:
            r6 = r9
        L_0x0179:
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r0.put(r5, r1)
        L_0x0183:
            r1 = 0
            r5 = -1
            android.content.IntentFilter r6 = new android.content.IntentFilter     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r7 = "android.intent.action.BATTERY_CHANGED"
            r6.<init>(r7)     // Catch:{ Exception -> 0x01b2 }
            android.content.Context r7 = com.flurry.sdk.C6747b0.m14386a()     // Catch:{ Exception -> 0x01b2 }
            android.content.Intent r4 = r7.registerReceiver(r4, r6)     // Catch:{ Exception -> 0x01b2 }
            if (r4 == 0) goto L_0x01c2
            java.lang.String r6 = "status"
            int r6 = r4.getIntExtra(r6, r5)     // Catch:{ Exception -> 0x01b2 }
            r7 = 2
            if (r6 == r7) goto L_0x01a1
            if (r6 != r3) goto L_0x01a2
        L_0x01a1:
            r1 = 1
        L_0x01a2:
            java.lang.String r6 = "level"
            int r6 = r4.getIntExtra(r6, r5)     // Catch:{ Exception -> 0x01b2 }
            java.lang.String r7 = "scale"
            int r2 = r4.getIntExtra(r7, r5)     // Catch:{ Exception -> 0x01b0 }
            r5 = r6
            goto L_0x01c3
        L_0x01b0:
            r4 = move-exception
            goto L_0x01b4
        L_0x01b2:
            r4 = move-exception
            r6 = -1
        L_0x01b4:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r7 = "Error getting battery status: "
            java.lang.String r4 = r7.concat(r4)
            com.flurry.sdk.C6792d1.m14476a((int) r3, (java.lang.String) r2, (java.lang.String) r4)
            r5 = r6
        L_0x01c2:
            r2 = -1
        L_0x01c3:
            float r3 = (float) r5
            float r2 = (float) r2
            float r3 = r3 / r2
            java.lang.String r1 = java.lang.Boolean.toString(r1)
            java.util.Map r1 = m14611a((java.lang.String) r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "battery.charging"
            r2.<init>(r4)
            boolean r4 = r11.f12812a
            if (r4 == 0) goto L_0x01db
            r4 = r8
            goto L_0x01dc
        L_0x01db:
            r4 = r9
        L_0x01dc:
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r0.put(r2, r1)
            java.lang.String r1 = java.lang.Float.toString(r3)
            java.util.Map r1 = m14611a((java.lang.String) r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "battery.remaining"
            r2.<init>(r3)
            boolean r3 = r11.f12812a
            if (r3 == 0) goto L_0x01fa
            goto L_0x01fb
        L_0x01fa:
            r8 = r9
        L_0x01fb:
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r0.put(r2, r1)
            com.flurry.sdk.n r11 = r11.f12813b
            if (r11 == 0) goto L_0x0218
            boolean r1 = r11.f13003a
            if (r1 == 0) goto L_0x0218
            java.lang.String r11 = r11.f13004b
            java.util.Map r11 = m14611a((java.lang.String) r11)
            java.lang.String r1 = "instantapp.name"
            r0.put(r1, r11)
        L_0x0218:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C6874i4.m14610a(com.flurry.sdk.h0):java.util.Map");
    }

    /* renamed from: a */
    private static Map<String, String> m14611a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(DonationsAnalytics.VALUE, str);
        return hashMap;
    }
}
