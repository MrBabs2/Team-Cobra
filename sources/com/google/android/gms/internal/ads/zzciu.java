package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzciu implements zzczc<zzciv, zzciw> {

    /* renamed from: a */
    private final Context f20247a;

    /* renamed from: b */
    private final String f20248b;

    /* renamed from: c */
    private final zzasm f20249c;

    /* renamed from: d */
    private final String f20250d;

    public zzciu(Context context, String str, zzasm zzasm, String str2) {
        this.f20247a = context;
        this.f20248b = str;
        this.f20249c = zzasm;
        this.f20250d = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r2 = new java.io.InputStreamReader(r6.getInputStream());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        com.google.android.gms.ads.internal.zzk.zzlg();
        r0 = com.google.android.gms.internal.ads.zzaxi.m20270a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        com.google.android.gms.common.util.IOUtils.m16280a(r2);
        r10.mo27882a(r0);
        r5.f20253a = r12;
        r5.f20255c = r0;
        r5.f20254b = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x017f, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0191, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzyt.m25670e().mo27163a(com.google.android.gms.internal.ads.zzacu.f17792E2)).booleanValue() == false) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x019c, code lost:
        throw new com.google.android.gms.internal.ads.zzcif("No Fill", 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x019d, code lost:
        r5.f20256d = com.google.android.gms.ads.internal.zzk.zzln().mo25499c() - r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r6.disconnect();
        r1.f20249c.mo27614a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b0, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b1, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01b2, code lost:
        r12 = r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.zzciw m22575a(java.lang.String r20, com.google.android.gms.internal.ads.zzasd r21, org.json.JSONObject r22, java.lang.String r23) throws com.google.android.gms.internal.ads.zzcif {
        /*
            r19 = this;
            r1 = r19
            java.lang.String r0 = "Received error HTTP response code: "
            java.lang.String r2 = "doritos_v2"
            java.lang.String r3 = "doritos"
            java.lang.String r4 = ""
            com.google.android.gms.internal.ads.zzciw r5 = new com.google.android.gms.internal.ads.zzciw     // Catch:{ IOException -> 0x0244 }
            r5.<init>()     // Catch:{ IOException -> 0x0244 }
            java.lang.String r6 = "SDK version: "
            java.lang.String r7 = r1.f20248b     // Catch:{ IOException -> 0x0244 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ IOException -> 0x0244 }
            int r8 = r7.length()     // Catch:{ IOException -> 0x0244 }
            if (r8 == 0) goto L_0x0022
            java.lang.String r6 = r6.concat(r7)     // Catch:{ IOException -> 0x0244 }
            goto L_0x0028
        L_0x0022:
            java.lang.String r7 = new java.lang.String     // Catch:{ IOException -> 0x0244 }
            r7.<init>(r6)     // Catch:{ IOException -> 0x0244 }
            r6 = r7
        L_0x0028:
            com.google.android.gms.internal.ads.zzbad.m20521c(r6)     // Catch:{ IOException -> 0x0244 }
            java.lang.String r6 = "AdRequestServiceImpl: Sending request: "
            java.lang.String r7 = java.lang.String.valueOf(r20)     // Catch:{ IOException -> 0x0244 }
            int r8 = r7.length()     // Catch:{ IOException -> 0x0244 }
            if (r8 == 0) goto L_0x003c
            java.lang.String r6 = r6.concat(r7)     // Catch:{ IOException -> 0x0244 }
            goto L_0x0042
        L_0x003c:
            java.lang.String r7 = new java.lang.String     // Catch:{ IOException -> 0x0244 }
            r7.<init>(r6)     // Catch:{ IOException -> 0x0244 }
            r6 = r7
        L_0x0042:
            com.google.android.gms.internal.ads.zzbad.m20516a((java.lang.String) r6)     // Catch:{ IOException -> 0x0244 }
            java.net.URL r6 = new java.net.URL     // Catch:{ IOException -> 0x0244 }
            r7 = r20
            r6.<init>(r7)     // Catch:{ IOException -> 0x0244 }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ IOException -> 0x0244 }
            r7.<init>()     // Catch:{ IOException -> 0x0244 }
            com.google.android.gms.common.util.Clock r8 = com.google.android.gms.ads.internal.zzk.zzln()     // Catch:{ IOException -> 0x0244 }
            long r8 = r8.mo25499c()     // Catch:{ IOException -> 0x0244 }
            r10 = 0
            r11 = 0
        L_0x005b:
            com.google.android.gms.internal.ads.zzasm r12 = r1.f20249c     // Catch:{ IOException -> 0x0244 }
            r12.mo27615b()     // Catch:{ IOException -> 0x0244 }
            java.net.URLConnection r6 = r6.openConnection()     // Catch:{ IOException -> 0x0244 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ IOException -> 0x0244 }
            com.google.android.gms.internal.ads.zzaxi r12 = com.google.android.gms.ads.internal.zzk.zzlg()     // Catch:{ all -> 0x023a }
            android.content.Context r13 = r1.f20247a     // Catch:{ all -> 0x023a }
            java.lang.String r14 = r1.f20248b     // Catch:{ all -> 0x023a }
            r12.mo27800a((android.content.Context) r13, (java.lang.String) r14, (boolean) r10, (java.net.HttpURLConnection) r6)     // Catch:{ all -> 0x023a }
            boolean r12 = android.text.TextUtils.isEmpty(r23)     // Catch:{ all -> 0x023a }
            if (r12 != 0) goto L_0x007f
            java.lang.String r12 = "Cookie"
            r13 = r23
            r6.addRequestProperty(r12, r13)     // Catch:{ all -> 0x023a }
            goto L_0x0081
        L_0x007f:
            r13 = r23
        L_0x0081:
            boolean r12 = r21.mo27608d()     // Catch:{ all -> 0x023a }
            if (r12 == 0) goto L_0x00be
            java.lang.String r12 = "pii"
            r14 = r22
            org.json.JSONObject r12 = r14.optJSONObject(r12)     // Catch:{ all -> 0x023a }
            if (r12 == 0) goto L_0x00b8
            java.lang.String r15 = r12.optString(r3, r4)     // Catch:{ all -> 0x023a }
            boolean r15 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x023a }
            if (r15 != 0) goto L_0x00a4
            java.lang.String r15 = "x-afma-drt-cookie"
            java.lang.String r10 = r12.optString(r3, r4)     // Catch:{ all -> 0x023a }
            r6.addRequestProperty(r15, r10)     // Catch:{ all -> 0x023a }
        L_0x00a4:
            java.lang.String r10 = r12.optString(r2, r4)     // Catch:{ all -> 0x023a }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x023a }
            if (r10 != 0) goto L_0x00c0
            java.lang.String r10 = "x-afma-drt-v2-cookie"
            java.lang.String r12 = r12.optString(r2, r4)     // Catch:{ all -> 0x023a }
            r6.addRequestProperty(r10, r12)     // Catch:{ all -> 0x023a }
            goto L_0x00c0
        L_0x00b8:
            java.lang.String r10 = "DSID signal does not exist."
            com.google.android.gms.internal.ads.zzawz.m20167e(r10)     // Catch:{ all -> 0x023a }
            goto L_0x00c0
        L_0x00be:
            r14 = r22
        L_0x00c0:
            r10 = 1
            if (r21 == 0) goto L_0x00f4
            java.lang.String r15 = r21.mo27607c()     // Catch:{ all -> 0x023a }
            boolean r15 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x023a }
            if (r15 != 0) goto L_0x00f4
            r6.setDoOutput(r10)     // Catch:{ all -> 0x023a }
            java.lang.String r15 = r21.mo27607c()     // Catch:{ all -> 0x023a }
            byte[] r15 = r15.getBytes()     // Catch:{ all -> 0x023a }
            int r12 = r15.length     // Catch:{ all -> 0x023a }
            r6.setFixedLengthStreamingMode(r12)     // Catch:{ all -> 0x023a }
            java.io.BufferedOutputStream r12 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00ee }
            java.io.OutputStream r10 = r6.getOutputStream()     // Catch:{ all -> 0x00ee }
            r12.<init>(r10)     // Catch:{ all -> 0x00ee }
            r12.write(r15)     // Catch:{ all -> 0x00ec }
            com.google.android.gms.common.util.IOUtils.m16280a(r12)     // Catch:{ all -> 0x023a }
            goto L_0x00f5
        L_0x00ec:
            r0 = move-exception
            goto L_0x00f0
        L_0x00ee:
            r0 = move-exception
            r12 = 0
        L_0x00f0:
            com.google.android.gms.common.util.IOUtils.m16280a(r12)     // Catch:{ all -> 0x023a }
            throw r0     // Catch:{ all -> 0x023a }
        L_0x00f4:
            r15 = 0
        L_0x00f5:
            com.google.android.gms.internal.ads.zzazx r10 = new com.google.android.gms.internal.ads.zzazx     // Catch:{ all -> 0x023a }
            r10.<init>()     // Catch:{ all -> 0x023a }
            r10.mo27885a((java.net.HttpURLConnection) r6, (byte[]) r15)     // Catch:{ all -> 0x023a }
            int r12 = r6.getResponseCode()     // Catch:{ all -> 0x023a }
            java.util.Map r15 = r6.getHeaderFields()     // Catch:{ all -> 0x023a }
            java.util.Set r15 = r15.entrySet()     // Catch:{ all -> 0x023a }
            java.util.Iterator r15 = r15.iterator()     // Catch:{ all -> 0x023a }
        L_0x010d:
            boolean r16 = r15.hasNext()     // Catch:{ all -> 0x023a }
            if (r16 == 0) goto L_0x014e
            java.lang.Object r16 = r15.next()     // Catch:{ all -> 0x023a }
            java.util.Map$Entry r16 = (java.util.Map.Entry) r16     // Catch:{ all -> 0x023a }
            java.lang.Object r17 = r16.getKey()     // Catch:{ all -> 0x023a }
            r18 = r2
            r2 = r17
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x023a }
            java.lang.Object r16 = r16.getValue()     // Catch:{ all -> 0x023a }
            r17 = r3
            r3 = r16
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x023a }
            boolean r16 = r7.containsKey(r2)     // Catch:{ all -> 0x023a }
            if (r16 == 0) goto L_0x013d
            java.lang.Object r2 = r7.get(r2)     // Catch:{ all -> 0x023a }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x023a }
            r2.addAll(r3)     // Catch:{ all -> 0x023a }
            goto L_0x0149
        L_0x013d:
            r16 = r4
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x023a }
            r4.<init>(r3)     // Catch:{ all -> 0x023a }
            r7.put(r2, r4)     // Catch:{ all -> 0x023a }
            r4 = r16
        L_0x0149:
            r3 = r17
            r2 = r18
            goto L_0x010d
        L_0x014e:
            r18 = r2
            r17 = r3
            r16 = r4
            r10.mo27884a((java.net.HttpURLConnection) r6, (int) r12)     // Catch:{ all -> 0x023a }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 300(0x12c, float:4.2E-43)
            if (r12 < r2) goto L_0x01ba
            if (r12 >= r3) goto L_0x01ba
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x01b4 }
            java.io.InputStream r0 = r6.getInputStream()     // Catch:{ all -> 0x01b4 }
            r2.<init>(r0)     // Catch:{ all -> 0x01b4 }
            com.google.android.gms.ads.internal.zzk.zzlg()     // Catch:{ all -> 0x01b1 }
            java.lang.String r0 = com.google.android.gms.internal.ads.zzaxi.m20270a((java.io.InputStreamReader) r2)     // Catch:{ all -> 0x01b1 }
            com.google.android.gms.common.util.IOUtils.m16280a(r2)     // Catch:{ all -> 0x023a }
            r10.mo27882a((java.lang.String) r0)     // Catch:{ all -> 0x023a }
            r5.f20253a = r12     // Catch:{ all -> 0x023a }
            r5.f20255c = r0     // Catch:{ all -> 0x023a }
            r5.f20254b = r7     // Catch:{ all -> 0x023a }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x023a }
            if (r0 == 0) goto L_0x019d
            com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzacu.f17792E2     // Catch:{ all -> 0x023a }
            com.google.android.gms.internal.ads.zzacr r2 = com.google.android.gms.internal.ads.zzyt.m25670e()     // Catch:{ all -> 0x023a }
            java.lang.Object r0 = r2.mo27163a(r0)     // Catch:{ all -> 0x023a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x023a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x023a }
            if (r0 == 0) goto L_0x0194
            goto L_0x019d
        L_0x0194:
            com.google.android.gms.internal.ads.zzcif r0 = new com.google.android.gms.internal.ads.zzcif     // Catch:{ all -> 0x023a }
            java.lang.String r2 = "No Fill"
            r3 = 3
            r0.<init>(r2, r3)     // Catch:{ all -> 0x023a }
            throw r0     // Catch:{ all -> 0x023a }
        L_0x019d:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzk.zzln()     // Catch:{ all -> 0x023a }
            long r2 = r0.mo25499c()     // Catch:{ all -> 0x023a }
            long r2 = r2 - r8
            r5.f20256d = r2     // Catch:{ all -> 0x023a }
            r6.disconnect()     // Catch:{ IOException -> 0x0244 }
            com.google.android.gms.internal.ads.zzasm r0 = r1.f20249c     // Catch:{ IOException -> 0x0244 }
            r0.mo27614a()     // Catch:{ IOException -> 0x0244 }
            return r5
        L_0x01b1:
            r0 = move-exception
            r12 = r2
            goto L_0x01b6
        L_0x01b4:
            r0 = move-exception
            r12 = 0
        L_0x01b6:
            com.google.android.gms.common.util.IOUtils.m16280a(r12)     // Catch:{ all -> 0x023a }
            throw r0     // Catch:{ all -> 0x023a }
        L_0x01ba:
            if (r12 < r3) goto L_0x0211
            r2 = 400(0x190, float:5.6E-43)
            if (r12 >= r2) goto L_0x0211
            java.lang.String r2 = "Location"
            java.lang.String r2 = r6.getHeaderField(r2)     // Catch:{ all -> 0x023a }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x023a }
            if (r3 != 0) goto L_0x0204
            java.net.URL r3 = new java.net.URL     // Catch:{ all -> 0x023a }
            r3.<init>(r2)     // Catch:{ all -> 0x023a }
            r2 = 1
            int r11 = r11 + r2
            com.google.android.gms.internal.ads.zzacj<java.lang.Integer> r2 = com.google.android.gms.internal.ads.zzacu.f17976v2     // Catch:{ all -> 0x023a }
            com.google.android.gms.internal.ads.zzacr r4 = com.google.android.gms.internal.ads.zzyt.m25670e()     // Catch:{ all -> 0x023a }
            java.lang.Object r2 = r4.mo27163a(r2)     // Catch:{ all -> 0x023a }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x023a }
            int r2 = r2.intValue()     // Catch:{ all -> 0x023a }
            if (r11 > r2) goto L_0x01f7
            r6.disconnect()     // Catch:{ IOException -> 0x0244 }
            com.google.android.gms.internal.ads.zzasm r2 = r1.f20249c     // Catch:{ IOException -> 0x0244 }
            r2.mo27614a()     // Catch:{ IOException -> 0x0244 }
            r6 = r3
            r4 = r16
            r3 = r17
            r2 = r18
            r10 = 0
            goto L_0x005b
        L_0x01f7:
            java.lang.String r0 = "Too many redirects."
            com.google.android.gms.internal.ads.zzbad.m20523d(r0)     // Catch:{ all -> 0x023a }
            com.google.android.gms.internal.ads.zzcif r0 = new com.google.android.gms.internal.ads.zzcif     // Catch:{ all -> 0x023a }
            java.lang.String r2 = "Too many redirects"
            r0.<init>(r2)     // Catch:{ all -> 0x023a }
            throw r0     // Catch:{ all -> 0x023a }
        L_0x0204:
            java.lang.String r0 = "No location header to follow redirect."
            com.google.android.gms.internal.ads.zzbad.m20523d(r0)     // Catch:{ all -> 0x023a }
            com.google.android.gms.internal.ads.zzcif r0 = new com.google.android.gms.internal.ads.zzcif     // Catch:{ all -> 0x023a }
            java.lang.String r2 = "No location header to follow redirect"
            r0.<init>(r2)     // Catch:{ all -> 0x023a }
            throw r0     // Catch:{ all -> 0x023a }
        L_0x0211:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x023a }
            r3 = 46
            r2.<init>(r3)     // Catch:{ all -> 0x023a }
            r2.append(r0)     // Catch:{ all -> 0x023a }
            r2.append(r12)     // Catch:{ all -> 0x023a }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x023a }
            com.google.android.gms.internal.ads.zzbad.m20523d(r2)     // Catch:{ all -> 0x023a }
            com.google.android.gms.internal.ads.zzcif r2 = new com.google.android.gms.internal.ads.zzcif     // Catch:{ all -> 0x023a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x023a }
            r4.<init>(r3)     // Catch:{ all -> 0x023a }
            r4.append(r0)     // Catch:{ all -> 0x023a }
            r4.append(r12)     // Catch:{ all -> 0x023a }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x023a }
            r2.<init>(r0)     // Catch:{ all -> 0x023a }
            throw r2     // Catch:{ all -> 0x023a }
        L_0x023a:
            r0 = move-exception
            r6.disconnect()     // Catch:{ IOException -> 0x0244 }
            com.google.android.gms.internal.ads.zzasm r2 = r1.f20249c     // Catch:{ IOException -> 0x0244 }
            r2.mo27614a()     // Catch:{ IOException -> 0x0244 }
            throw r0     // Catch:{ IOException -> 0x0244 }
        L_0x0244:
            r0 = move-exception
            java.lang.String r2 = "Error while connecting to ad server: "
            java.lang.String r3 = r0.getMessage()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            if (r4 == 0) goto L_0x025a
            java.lang.String r2 = r2.concat(r3)
            goto L_0x0260
        L_0x025a:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r2)
            r2 = r3
        L_0x0260:
            com.google.android.gms.internal.ads.zzbad.m20523d(r2)
            com.google.android.gms.internal.ads.zzcif r2 = new com.google.android.gms.internal.ads.zzcif
            java.lang.String r3 = "Error connecting to ad server:"
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r4 = r0.length()
            if (r4 == 0) goto L_0x027a
            java.lang.String r0 = r3.concat(r0)
            goto L_0x027f
        L_0x027a:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
        L_0x027f:
            r3 = 2
            r2.<init>(r0, r3)
            goto L_0x0285
        L_0x0284:
            throw r2
        L_0x0285:
            goto L_0x0284
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzciu.m22575a(java.lang.String, com.google.android.gms.internal.ads.zzasd, org.json.JSONObject, java.lang.String):com.google.android.gms.internal.ads.zzciw");
    }

    public final /* synthetic */ Object apply(Object obj) throws Exception {
        zzciv zzciv = (zzciv) obj;
        return m22575a(zzciv.f20252b.mo27605a(), zzciv.f20252b, zzciv.f20251a, this.f20250d);
    }
}
