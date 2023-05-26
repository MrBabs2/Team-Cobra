package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@TargetApi(21)
@zzard
/* renamed from: com.google.android.gms.internal.ads.c4 */
final class C7346c4 {

    /* renamed from: d */
    private static final Map<String, String> f14699d;

    /* renamed from: a */
    private final Context f14700a;

    /* renamed from: b */
    private final List<String> f14701b;

    /* renamed from: c */
    private final zzauq f14702c;

    static {
        HashMap hashMap = new HashMap();
        if (PlatformVersion.m16292h()) {
            hashMap.put("android.webkit.resource.AUDIO_CAPTURE", "android.permission.RECORD_AUDIO");
            hashMap.put("android.webkit.resource.VIDEO_CAPTURE", "android.permission.CAMERA");
        }
        f14699d = hashMap;
    }

    C7346c4(Context context, List<String> list, zzauq zzauq) {
        this.f14700a = context;
        this.f14701b = list;
        this.f14702c = zzauq;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        r5 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> mo25762a(java.lang.String[] r11) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r11.length
            r2 = 0
            r3 = 0
        L_0x0008:
            if (r3 >= r1) goto L_0x0078
            r4 = r11[r3]
            java.util.List<java.lang.String> r5 = r10.f14701b
            java.util.Iterator r5 = r5.iterator()
        L_0x0012:
            boolean r6 = r5.hasNext()
            r7 = 1
            if (r6 == 0) goto L_0x0044
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r8 = r6.equals(r4)
            if (r8 == 0) goto L_0x0027
        L_0x0025:
            r5 = 1
            goto L_0x0045
        L_0x0027:
            java.lang.String r8 = "android.webkit.resource."
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r9 = r6.length()
            if (r9 == 0) goto L_0x0038
            java.lang.String r6 = r8.concat(r6)
            goto L_0x003d
        L_0x0038:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r8)
        L_0x003d:
            boolean r6 = r6.equals(r4)
            if (r6 == 0) goto L_0x0012
            goto L_0x0025
        L_0x0044:
            r5 = 0
        L_0x0045:
            if (r5 == 0) goto L_0x0070
            java.util.Map<java.lang.String, java.lang.String> r5 = f14699d
            boolean r5 = r5.containsKey(r4)
            if (r5 == 0) goto L_0x0064
            com.google.android.gms.ads.internal.zzk.zzlg()
            android.content.Context r5 = r10.f14700a
            java.util.Map<java.lang.String, java.lang.String> r6 = f14699d
            java.lang.Object r6 = r6.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            boolean r5 = com.google.android.gms.internal.ads.zzaxi.m20286b((android.content.Context) r5, (java.lang.String) r6)
            if (r5 == 0) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r7 = 0
        L_0x0064:
            if (r7 == 0) goto L_0x006a
            r0.add(r4)
            goto L_0x0075
        L_0x006a:
            com.google.android.gms.internal.ads.zzauq r5 = r10.f14702c
            r5.mo27676c(r4)
            goto L_0x0075
        L_0x0070:
            com.google.android.gms.internal.ads.zzauq r5 = r10.f14702c
            r5.mo27675b((java.lang.String) r4)
        L_0x0075:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x0078:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7346c4.mo25762a(java.lang.String[]):java.util.List");
    }
}
