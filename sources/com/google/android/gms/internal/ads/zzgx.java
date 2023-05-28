package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.text.TextUtils;
import android.util.Pair;
import java.util.HashMap;

@TargetApi(16)
public final class zzgx {

    /* renamed from: a */
    private static final HashMap<C8243a, Pair<String, MediaCodecInfo.CodecCapabilities>> f21923a = new HashMap<>();

    /* renamed from: com.google.android.gms.internal.ads.zzgx$a */
    static final class C8243a {

        /* renamed from: a */
        public final String f21924a;

        /* renamed from: b */
        public final boolean f21925b;

        public C8243a(String str, boolean z) {
            this.f21924a = str;
            this.f21925b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == C8243a.class) {
                C8243a aVar = (C8243a) obj;
                return TextUtils.equals(this.f21924a, aVar.f21924a) && this.f21925b == aVar.f21925b;
            }
        }

        public final int hashCode() {
            String str = this.f21924a;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f21925b ? 1231 : 1237);
        }
    }

    /* renamed from: a */
    public static zzgc m24448a(String str, boolean z) throws zzgz {
        Pair<String, MediaCodecInfo.CodecCapabilities> b = m24449b(str, z);
        if (b == null) {
            return null;
        }
        return new zzgc((String) b.first, zzkq.f22154a >= 19 ? ((MediaCodecInfo.CodecCapabilities) b.second).isFeatureSupported("adaptive-playback") : false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        return r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized android.util.Pair<java.lang.String, android.media.MediaCodecInfo.CodecCapabilities> m24449b(java.lang.String r6, boolean r7) throws com.google.android.gms.internal.ads.zzgz {
        /*
            java.lang.Class<com.google.android.gms.internal.ads.zzgx> r0 = com.google.android.gms.internal.ads.zzgx.class
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzgx$a r1 = new com.google.android.gms.internal.ads.zzgx$a     // Catch:{ all -> 0x007a }
            r1.<init>(r6, r7)     // Catch:{ all -> 0x007a }
            java.util.HashMap<com.google.android.gms.internal.ads.zzgx$a, android.util.Pair<java.lang.String, android.media.MediaCodecInfo$CodecCapabilities>> r2 = f21923a     // Catch:{ all -> 0x007a }
            boolean r2 = r2.containsKey(r1)     // Catch:{ all -> 0x007a }
            if (r2 == 0) goto L_0x001a
            java.util.HashMap<com.google.android.gms.internal.ads.zzgx$a, android.util.Pair<java.lang.String, android.media.MediaCodecInfo$CodecCapabilities>> r6 = f21923a     // Catch:{ all -> 0x007a }
            java.lang.Object r6 = r6.get(r1)     // Catch:{ all -> 0x007a }
            android.util.Pair r6 = (android.util.Pair) r6     // Catch:{ all -> 0x007a }
            monitor-exit(r0)
            return r6
        L_0x001a:
            int r2 = com.google.android.gms.internal.ads.zzkq.f22154a     // Catch:{ all -> 0x007a }
            r3 = 0
            r4 = 21
            if (r2 < r4) goto L_0x0027
            com.google.android.gms.internal.ads.kz r2 = new com.google.android.gms.internal.ads.kz     // Catch:{ all -> 0x007a }
            r2.<init>(r7)     // Catch:{ all -> 0x007a }
            goto L_0x002c
        L_0x0027:
            com.google.android.gms.internal.ads.jz r2 = new com.google.android.gms.internal.ads.jz     // Catch:{ all -> 0x007a }
            r2.<init>()     // Catch:{ all -> 0x007a }
        L_0x002c:
            android.util.Pair r2 = m24447a((com.google.android.gms.internal.ads.zzgx.C8243a) r1, (com.google.android.gms.internal.ads.C7602iz) r2)     // Catch:{ all -> 0x007a }
            if (r7 == 0) goto L_0x0078
            if (r2 != 0) goto L_0x0078
            int r7 = com.google.android.gms.internal.ads.zzkq.f22154a     // Catch:{ all -> 0x007a }
            if (r7 < r4) goto L_0x0078
            com.google.android.gms.internal.ads.jz r7 = new com.google.android.gms.internal.ads.jz     // Catch:{ all -> 0x007a }
            r7.<init>()     // Catch:{ all -> 0x007a }
            android.util.Pair r2 = m24447a((com.google.android.gms.internal.ads.zzgx.C8243a) r1, (com.google.android.gms.internal.ads.C7602iz) r7)     // Catch:{ all -> 0x007a }
            if (r2 == 0) goto L_0x0078
            java.lang.String r7 = "MediaCodecUtil"
            java.lang.Object r1 = r2.first     // Catch:{ all -> 0x007a }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x007a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x007a }
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x007a }
            int r4 = r4.length()     // Catch:{ all -> 0x007a }
            int r4 = r4 + 63
            java.lang.String r5 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x007a }
            int r5 = r5.length()     // Catch:{ all -> 0x007a }
            int r4 = r4 + r5
            r3.<init>(r4)     // Catch:{ all -> 0x007a }
            java.lang.String r4 = "MediaCodecList API didn't list secure decoder for: "
            r3.append(r4)     // Catch:{ all -> 0x007a }
            r3.append(r6)     // Catch:{ all -> 0x007a }
            java.lang.String r6 = ". Assuming: "
            r3.append(r6)     // Catch:{ all -> 0x007a }
            r3.append(r1)     // Catch:{ all -> 0x007a }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x007a }
            android.util.Log.w(r7, r6)     // Catch:{ all -> 0x007a }
        L_0x0078:
            monitor-exit(r0)
            return r2
        L_0x007a:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgx.m24449b(java.lang.String, boolean):android.util.Pair");
    }

    /* renamed from: a */
    private static Pair<String, MediaCodecInfo.CodecCapabilities> m24447a(C8243a aVar, C7602iz izVar) throws zzgz {
        C8243a aVar2 = aVar;
        C7602iz izVar2 = izVar;
        try {
            String str = aVar2.f21924a;
            int b = izVar.mo26108b();
            boolean a = izVar.mo26106a();
            boolean z = false;
            int i = 0;
            while (i < b) {
                MediaCodecInfo a2 = izVar2.mo26105a(i);
                String name = a2.getName();
                if (!a2.isEncoder() && name.startsWith("OMX.")) {
                    if (!a) {
                        if (name.endsWith(".secure")) {
                            continue;
                        }
                    }
                    String[] supportedTypes = a2.getSupportedTypes();
                    int i2 = 0;
                    while (i2 < supportedTypes.length) {
                        String str2 = supportedTypes[i2];
                        if (str2.equalsIgnoreCase(str)) {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = a2.getCapabilitiesForType(str2);
                            boolean a3 = izVar2.mo26107a(aVar2.f21924a, capabilitiesForType);
                            if (!a) {
                                f21923a.put(aVar2.f21925b ? new C8243a(str, z) : aVar2, Pair.create(name, capabilitiesForType));
                                if (a3) {
                                    f21923a.put(aVar2.f21925b ? aVar2 : new C8243a(str, true), Pair.create(String.valueOf(name).concat(".secure"), capabilitiesForType));
                                }
                            } else {
                                f21923a.put(aVar2.f21925b == a3 ? aVar2 : new C8243a(str, a3), Pair.create(name, capabilitiesForType));
                            }
                            if (f21923a.containsKey(aVar2)) {
                                return f21923a.get(aVar2);
                            }
                        }
                        i2++;
                        z = false;
                    }
                    continue;
                }
                i++;
                z = false;
            }
            return null;
        } catch (Exception e) {
            throw new zzgz(e);
        }
    }
}
