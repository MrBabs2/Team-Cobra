package com.google.android.gms.internal.ads;

@zzard
public final class zzvk {

    /* renamed from: a */
    private final zzva f22844a;

    /* renamed from: b */
    private final int f22845b;

    /* renamed from: c */
    private final int f22846c;

    /* renamed from: d */
    private final int f22847d;

    public zzvk(int i, int i2, int i3) {
        this.f22845b = i;
        if (i2 > 64 || i2 < 0) {
            this.f22846c = 64;
        } else {
            this.f22846c = i2;
        }
        if (i3 <= 0) {
            this.f22847d = 1;
        } else {
            this.f22847d = i3;
        }
        this.f22844a = new zzvj(this.f22846c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0101, code lost:
        if (r2.size() < r1.f22845b) goto L_0x0105;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo29840a(java.util.ArrayList<java.lang.String> r17, java.util.ArrayList<com.google.android.gms.internal.ads.zzuz> r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            com.google.android.gms.internal.ads.zzvl r2 = new com.google.android.gms.internal.ads.zzvl
            r2.<init>(r1)
            java.util.Collections.sort(r0, r2)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r4 = 0
        L_0x0012:
            int r5 = r18.size()
            if (r4 >= r5) goto L_0x010f
            java.lang.Object r5 = r0.get(r4)
            com.google.android.gms.internal.ads.zzuz r5 = (com.google.android.gms.internal.ads.zzuz) r5
            int r5 = r5.mo29827e()
            r6 = r17
            java.lang.Object r5 = r6.get(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.text.Normalizer$Form r7 = java.text.Normalizer.Form.NFKC
            java.lang.String r5 = java.text.Normalizer.normalize(r5, r7)
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r5 = r5.toLowerCase(r7)
            java.lang.String r7 = "\n"
            java.lang.String[] r5 = r5.split(r7)
            int r7 = r5.length
            r8 = 1
            if (r7 == 0) goto L_0x0109
            r7 = 0
        L_0x0041:
            int r9 = r5.length
            if (r7 >= r9) goto L_0x0109
            r9 = r5[r7]
            java.lang.String r10 = "'"
            int r10 = r9.indexOf(r10)
            r11 = -1
            if (r10 == r11) goto L_0x00a4
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r9)
            r11 = 1
            r12 = 0
        L_0x0056:
            int r13 = r11 + 2
            int r14 = r10.length()
            if (r13 > r14) goto L_0x0099
            char r14 = r10.charAt(r11)
            r15 = 39
            if (r14 != r15) goto L_0x0097
            int r12 = r11 + -1
            char r12 = r10.charAt(r12)
            r14 = 32
            if (r12 == r14) goto L_0x0093
            int r12 = r11 + 1
            char r15 = r10.charAt(r12)
            r3 = 115(0x73, float:1.61E-43)
            if (r15 == r3) goto L_0x0082
            char r3 = r10.charAt(r12)
            r12 = 83
            if (r3 != r12) goto L_0x0093
        L_0x0082:
            int r3 = r10.length()
            if (r13 == r3) goto L_0x008e
            char r3 = r10.charAt(r13)
            if (r3 != r14) goto L_0x0093
        L_0x008e:
            r10.insert(r11, r14)
            r11 = r13
            goto L_0x0096
        L_0x0093:
            r10.setCharAt(r11, r14)
        L_0x0096:
            r12 = 1
        L_0x0097:
            int r11 = r11 + r8
            goto L_0x0056
        L_0x0099:
            if (r12 == 0) goto L_0x00a0
            java.lang.String r3 = r10.toString()
            goto L_0x00a1
        L_0x00a0:
            r3 = 0
        L_0x00a1:
            if (r3 == 0) goto L_0x00a4
            r9 = r3
        L_0x00a4:
            java.lang.String[] r3 = com.google.android.gms.internal.ads.zzve.m25424a(r9, r8)
            int r9 = r3.length
            int r10 = r1.f22847d
            if (r9 < r10) goto L_0x0105
            r9 = 0
        L_0x00ae:
            int r10 = r3.length
            if (r9 >= r10) goto L_0x00fb
            java.lang.String r10 = ""
            r11 = 0
        L_0x00b4:
            int r12 = r1.f22847d
            if (r11 >= r12) goto L_0x00e9
            int r12 = r9 + r11
            int r13 = r3.length
            if (r12 < r13) goto L_0x00bf
            r11 = 0
            goto L_0x00ea
        L_0x00bf:
            if (r11 <= 0) goto L_0x00cb
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r13 = " "
            java.lang.String r10 = r10.concat(r13)
        L_0x00cb:
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r12 = r3[r12]
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r13 = r12.length()
            if (r13 == 0) goto L_0x00e0
            java.lang.String r10 = r10.concat(r12)
            goto L_0x00e6
        L_0x00e0:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r10)
            r10 = r12
        L_0x00e6:
            int r11 = r11 + 1
            goto L_0x00b4
        L_0x00e9:
            r11 = 1
        L_0x00ea:
            if (r11 == 0) goto L_0x00fb
            r2.add(r10)
            int r10 = r2.size()
            int r11 = r1.f22845b
            if (r10 < r11) goto L_0x00f8
            goto L_0x0103
        L_0x00f8:
            int r9 = r9 + 1
            goto L_0x00ae
        L_0x00fb:
            int r3 = r2.size()
            int r9 = r1.f22845b
            if (r3 < r9) goto L_0x0105
        L_0x0103:
            r8 = 0
            goto L_0x0109
        L_0x0105:
            int r7 = r7 + 1
            goto L_0x0041
        L_0x0109:
            if (r8 == 0) goto L_0x010f
            int r4 = r4 + 1
            goto L_0x0012
        L_0x010f:
            com.google.android.gms.internal.ads.v40 r3 = new com.google.android.gms.internal.ads.v40
            r3.<init>()
            java.util.Iterator r0 = r2.iterator()
        L_0x0118:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0134
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.internal.ads.zzva r4 = r1.f22844a     // Catch:{ IOException -> 0x012e }
            byte[] r2 = r4.mo29833a(r2)     // Catch:{ IOException -> 0x012e }
            r3.mo26685a(r2)     // Catch:{ IOException -> 0x012e }
            goto L_0x0118
        L_0x012e:
            r0 = move-exception
            java.lang.String r2 = "Error while writing hash to byteStream"
            com.google.android.gms.internal.ads.zzbad.m20520b(r2, r0)
        L_0x0134:
            java.lang.String r0 = r3.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvk.mo29840a(java.util.ArrayList, java.util.ArrayList):java.lang.String");
    }
}
