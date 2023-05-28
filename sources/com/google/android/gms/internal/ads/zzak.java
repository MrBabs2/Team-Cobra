package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.InputStream;

public class zzak implements zzm {

    /* renamed from: c */
    private static final boolean f18150c = zzag.f18074b;

    /* renamed from: a */
    private final zzaj f18151a;

    /* renamed from: b */
    private final zzal f18152b;

    @Deprecated
    public zzak(zzas zzas) {
        this(zzas, new zzal(RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0209, code lost:
        throw new com.google.android.gms.internal.ads.zzq(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x020a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x020b, code lost:
        r2 = java.lang.String.valueOf(r22.mo29658e());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x021b, code lost:
        if (r2.length() != 0) goto L_0x021d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x021d, code lost:
        r2 = "Bad URL ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0222, code lost:
        r2 = new java.lang.String("Bad URL ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x022a, code lost:
        throw new java.lang.RuntimeException(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x022b, code lost:
        m19342a("socket", r2, new com.google.android.gms.internal.ads.zzae());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x018d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x018e, code lost:
        r17 = r5;
        r8 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0192, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0193, code lost:
        r17 = r5;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0196, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0199, code lost:
        r0 = r8.mo27575c();
        com.google.android.gms.internal.ads.zzag.m19161b("Unexpected response code %d for %s", java.lang.Integer.valueOf(r0), r22.mo29658e());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b0, code lost:
        if (r13 != null) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01b2, code lost:
        r11 = new com.google.android.gms.internal.ads.zzp(r0, r13, false, android.os.SystemClock.elapsedRealtime() - r3, r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c2, code lost:
        if (r0 == 401) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01cb, code lost:
        if (r0 < 400) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01d7, code lost:
        throw new com.google.android.gms.internal.ads.zzg(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01da, code lost:
        if (r0 < 500) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e5, code lost:
        throw new com.google.android.gms.internal.ads.zzad(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01eb, code lost:
        throw new com.google.android.gms.internal.ads.zzad(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ec, code lost:
        m19342a("auth", r2, new com.google.android.gms.internal.ads.zza(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01f8, code lost:
        m19342a("network", r2, new com.google.android.gms.internal.ads.zzo());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x020a A[ExcHandler: MalformedURLException (r0v1 'e' java.net.MalformedURLException A[CUSTOM_DECLARE]), Splitter:B:2:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:110:? A[ExcHandler: SocketTimeoutException (unused java.net.SocketTimeoutException), SYNTHETIC, Splitter:B:2:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0204 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0199  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.ads.zzp mo27317a(com.google.android.gms.internal.ads.zzr<?> r22) throws com.google.android.gms.internal.ads.zzaf {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            long r3 = android.os.SystemClock.elapsedRealtime()
        L_0x0008:
            java.util.List r5 = java.util.Collections.emptyList()
            r6 = 1
            r7 = 2
            r9 = 0
            com.google.android.gms.internal.ads.zzc r0 = r22.mo29662o()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0192 }
            if (r0 != 0) goto L_0x001a
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0192 }
            goto L_0x003e
        L_0x001a:
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0192 }
            r10.<init>()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0192 }
            java.lang.String r11 = r0.f19816b     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0192 }
            if (r11 == 0) goto L_0x002a
            java.lang.String r11 = "If-None-Match"
            java.lang.String r12 = r0.f19816b     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0192 }
            r10.put(r11, r12)     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0192 }
        L_0x002a:
            long r11 = r0.f19818d     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0192 }
            r13 = 0
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x003d
            java.lang.String r11 = "If-Modified-Since"
            long r12 = r0.f19818d     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0192 }
            java.lang.String r0 = com.google.android.gms.internal.ads.zzaq.m19829a((long) r12)     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0192 }
            r10.put(r11, r0)     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0192 }
        L_0x003d:
            r0 = r10
        L_0x003e:
            com.google.android.gms.internal.ads.zzaj r10 = r1.f18151a     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0192 }
            com.google.android.gms.internal.ads.zzar r10 = r10.mo26332b(r2, r0)     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0192 }
            int r12 = r10.mo27575c()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            java.util.List r5 = r10.mo27576d()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            r0 = 304(0x130, float:4.26E-43)
            if (r12 != r0) goto L_0x0116
            com.google.android.gms.internal.ads.zzc r0 = r22.mo29662o()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            if (r0 != 0) goto L_0x006a
            com.google.android.gms.internal.ads.zzp r0 = new com.google.android.gms.internal.ads.zzp     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            r14 = 304(0x130, float:4.26E-43)
            r15 = 0
            r16 = 1
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            long r17 = r11 - r3
            r13 = r0
            r19 = r5
            r13.<init>((int) r14, (byte[]) r15, (boolean) r16, (long) r17, (java.util.List<com.google.android.gms.internal.ads.zzl>) r19)     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            return r0
        L_0x006a:
            java.util.TreeSet r11 = new java.util.TreeSet     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            java.util.Comparator r12 = java.lang.String.CASE_INSENSITIVE_ORDER     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            r11.<init>(r12)     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            boolean r12 = r5.isEmpty()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            if (r12 != 0) goto L_0x008f
            java.util.Iterator r12 = r5.iterator()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
        L_0x007b:
            boolean r13 = r12.hasNext()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            if (r13 == 0) goto L_0x008f
            java.lang.Object r13 = r12.next()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            com.google.android.gms.internal.ads.zzl r13 = (com.google.android.gms.internal.ads.zzl) r13     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            java.lang.String r13 = r13.mo29461a()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            r11.add(r13)     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            goto L_0x007b
        L_0x008f:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            r12.<init>(r5)     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            java.util.List<com.google.android.gms.internal.ads.zzl> r13 = r0.f19822h     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            if (r13 == 0) goto L_0x00c0
            java.util.List<com.google.android.gms.internal.ads.zzl> r13 = r0.f19822h     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            boolean r13 = r13.isEmpty()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            if (r13 != 0) goto L_0x00ff
            java.util.List<com.google.android.gms.internal.ads.zzl> r13 = r0.f19822h     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
        L_0x00a6:
            boolean r14 = r13.hasNext()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            if (r14 == 0) goto L_0x00ff
            java.lang.Object r14 = r13.next()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            com.google.android.gms.internal.ads.zzl r14 = (com.google.android.gms.internal.ads.zzl) r14     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            java.lang.String r15 = r14.mo29461a()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            boolean r15 = r11.contains(r15)     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            if (r15 != 0) goto L_0x00a6
            r12.add(r14)     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            goto L_0x00a6
        L_0x00c0:
            java.util.Map<java.lang.String, java.lang.String> r13 = r0.f19821g     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            boolean r13 = r13.isEmpty()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            if (r13 != 0) goto L_0x00ff
            java.util.Map<java.lang.String, java.lang.String> r13 = r0.f19821g     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            java.util.Set r13 = r13.entrySet()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
        L_0x00d2:
            boolean r14 = r13.hasNext()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            if (r14 == 0) goto L_0x00ff
            java.lang.Object r14 = r13.next()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            java.lang.Object r15 = r14.getKey()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            boolean r15 = r11.contains(r15)     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            if (r15 != 0) goto L_0x00d2
            com.google.android.gms.internal.ads.zzl r15 = new com.google.android.gms.internal.ads.zzl     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            java.lang.Object r16 = r14.getKey()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            r8 = r16
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            java.lang.Object r14 = r14.getValue()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            r15.<init>(r8, r14)     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            r12.add(r15)     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            goto L_0x00d2
        L_0x00ff:
            com.google.android.gms.internal.ads.zzp r8 = new com.google.android.gms.internal.ads.zzp     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            r15 = 304(0x130, float:4.26E-43)
            byte[] r0 = r0.f19815a     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            r17 = 1
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            long r18 = r13 - r3
            r14 = r8
            r16 = r0
            r20 = r12
            r14.<init>((int) r15, (byte[]) r16, (boolean) r17, (long) r18, (java.util.List<com.google.android.gms.internal.ads.zzl>) r20)     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            return r8
        L_0x0116:
            java.io.InputStream r0 = r10.mo27573a()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            if (r0 == 0) goto L_0x0125
            int r8 = r10.mo27574b()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            byte[] r0 = r1.m19343a(r0, r8)     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
            goto L_0x0127
        L_0x0125:
            byte[] r0 = new byte[r9]     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x018d }
        L_0x0127:
            r8 = r0
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0187 }
            long r13 = r13 - r3
            boolean r0 = f18150c     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0187 }
            if (r0 != 0) goto L_0x0137
            r15 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x0169
        L_0x0137:
            java.lang.String r0 = "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]"
            r11 = 5
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0187 }
            r11[r9] = r2     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0187 }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0187 }
            r11[r6] = r13     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0187 }
            if (r8 == 0) goto L_0x014c
            int r13 = r8.length     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0187 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0187 }
            goto L_0x014e
        L_0x014c:
            java.lang.String r13 = "null"
        L_0x014e:
            r11[r7] = r13     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0187 }
            r13 = 3
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0187 }
            r11[r13] = r14     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0187 }
            r13 = 4
            com.google.android.gms.internal.ads.zzac r14 = r22.mo29665s()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0187 }
            int r14 = r14.mo27142g()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0187 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0187 }
            r11[r13] = r14     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0187 }
            com.google.android.gms.internal.ads.zzag.m19159a(r0, r11)     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0187 }
        L_0x0169:
            r0 = 200(0xc8, float:2.8E-43)
            if (r12 < r0) goto L_0x0181
            r0 = 299(0x12b, float:4.19E-43)
            if (r12 > r0) goto L_0x0181
            com.google.android.gms.internal.ads.zzp r0 = new com.google.android.gms.internal.ads.zzp     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0187 }
            r14 = 0
            long r15 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0187 }
            long r15 = r15 - r3
            r11 = r0
            r13 = r8
            r17 = r5
            r11.<init>((int) r12, (byte[]) r13, (boolean) r14, (long) r15, (java.util.List<com.google.android.gms.internal.ads.zzl>) r17)     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0187 }
            return r0
        L_0x0181:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0187 }
            r0.<init>()     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0187 }
            throw r0     // Catch:{ SocketTimeoutException -> 0x022b, MalformedURLException -> 0x020a, IOException -> 0x0187 }
        L_0x0187:
            r0 = move-exception
            r17 = r5
            r13 = r8
            r8 = r10
            goto L_0x0197
        L_0x018d:
            r0 = move-exception
            r17 = r5
            r8 = r10
            goto L_0x0196
        L_0x0192:
            r0 = move-exception
            r17 = r5
            r8 = 0
        L_0x0196:
            r13 = 0
        L_0x0197:
            if (r8 == 0) goto L_0x0204
            int r0 = r8.mo27575c()
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r5[r9] = r7
            java.lang.String r7 = r22.mo29658e()
            r5[r6] = r7
            java.lang.String r6 = "Unexpected response code %d for %s"
            com.google.android.gms.internal.ads.zzag.m19161b(r6, r5)
            if (r13 == 0) goto L_0x01f8
            com.google.android.gms.internal.ads.zzp r5 = new com.google.android.gms.internal.ads.zzp
            r14 = 0
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r15 = r6 - r3
            r11 = r5
            r12 = r0
            r11.<init>((int) r12, (byte[]) r13, (boolean) r14, (long) r15, (java.util.List<com.google.android.gms.internal.ads.zzl>) r17)
            r6 = 401(0x191, float:5.62E-43)
            if (r0 == r6) goto L_0x01ec
            r6 = 403(0x193, float:5.65E-43)
            if (r0 != r6) goto L_0x01c9
            goto L_0x01ec
        L_0x01c9:
            r2 = 400(0x190, float:5.6E-43)
            if (r0 < r2) goto L_0x01d8
            r2 = 499(0x1f3, float:6.99E-43)
            if (r0 <= r2) goto L_0x01d2
            goto L_0x01d8
        L_0x01d2:
            com.google.android.gms.internal.ads.zzg r0 = new com.google.android.gms.internal.ads.zzg
            r0.<init>(r5)
            throw r0
        L_0x01d8:
            r2 = 500(0x1f4, float:7.0E-43)
            if (r0 < r2) goto L_0x01e6
            r2 = 599(0x257, float:8.4E-43)
            if (r0 > r2) goto L_0x01e6
            com.google.android.gms.internal.ads.zzad r0 = new com.google.android.gms.internal.ads.zzad
            r0.<init>(r5)
            throw r0
        L_0x01e6:
            com.google.android.gms.internal.ads.zzad r0 = new com.google.android.gms.internal.ads.zzad
            r0.<init>(r5)
            throw r0
        L_0x01ec:
            com.google.android.gms.internal.ads.zza r0 = new com.google.android.gms.internal.ads.zza
            r0.<init>(r5)
            java.lang.String r5 = "auth"
            m19342a(r5, r2, r0)
            goto L_0x0008
        L_0x01f8:
            com.google.android.gms.internal.ads.zzo r0 = new com.google.android.gms.internal.ads.zzo
            r0.<init>()
            java.lang.String r5 = "network"
            m19342a(r5, r2, r0)
            goto L_0x0008
        L_0x0204:
            com.google.android.gms.internal.ads.zzq r2 = new com.google.android.gms.internal.ads.zzq
            r2.<init>(r0)
            throw r2
        L_0x020a:
            r0 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "Bad URL "
            java.lang.String r2 = r22.mo29658e()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r5 = r2.length()
            if (r5 == 0) goto L_0x0222
            java.lang.String r2 = r4.concat(r2)
            goto L_0x0227
        L_0x0222:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r4)
        L_0x0227:
            r3.<init>(r2, r0)
            throw r3
        L_0x022b:
            com.google.android.gms.internal.ads.zzae r0 = new com.google.android.gms.internal.ads.zzae
            r0.<init>()
            java.lang.String r5 = "socket"
            m19342a(r5, r2, r0)
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzak.mo27317a(com.google.android.gms.internal.ads.zzr):com.google.android.gms.internal.ads.zzp");
    }

    @Deprecated
    private zzak(zzas zzas, zzal zzal) {
        this.f18151a = new C7789o0(zzas);
        this.f18152b = zzal;
    }

    public zzak(zzaj zzaj) {
        this(zzaj, new zzal(RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT));
    }

    private zzak(zzaj zzaj, zzal zzal) {
        this.f18151a = zzaj;
        this.f18152b = zzal;
    }

    /* renamed from: a */
    private static void m19342a(String str, zzr<?> zzr, zzaf zzaf) throws zzaf {
        zzac s = zzr.mo29665s();
        int r = zzr.mo29664r();
        try {
            s.mo27141a(zzaf);
            zzr.mo29653a(String.format("%s-retry [timeout=%s]", new Object[]{str, Integer.valueOf(r)}));
        } catch (zzaf e) {
            zzr.mo29653a(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{str, Integer.valueOf(r)}));
            throw e;
        }
    }

    /* renamed from: a */
    private final byte[] m19343a(InputStream inputStream, int i) throws IOException, zzad {
        zzaw zzaw = new zzaw(this.f18152b, i);
        byte[] bArr = null;
        if (inputStream != null) {
            try {
                bArr = this.f18152b.mo27365a(1024);
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    zzaw.write(bArr, 0, read);
                }
                return zzaw.toByteArray();
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        zzag.m19162c("Error occurred when closing InputStream", new Object[0]);
                    }
                }
                this.f18152b.mo27364a(bArr);
                zzaw.close();
            }
        } else {
            throw new zzad();
        }
    }
}
