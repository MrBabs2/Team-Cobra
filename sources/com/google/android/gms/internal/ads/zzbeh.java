package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;

@zzard
public final class zzbeh implements zzjp {

    /* renamed from: a */
    private InputStream f18869a;

    /* renamed from: b */
    private boolean f18870b;

    /* renamed from: c */
    private final Context f18871c;

    /* renamed from: d */
    private final zzjp f18872d;

    /* renamed from: e */
    private final WeakReference<zzbei> f18873e;

    public zzbeh(Context context, zzjp zzjp, zzbei zzbei) {
        this.f18871c = context;
        this.f18872d = zzjp;
        this.f18873e = new WeakReference<>(zzbei);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r6.cancel(true);
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r6.cancel(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d6, code lost:
        r6 = com.google.android.gms.ads.internal.zzk.zzln().mo25499c() - r11;
        r4 = (com.google.android.gms.internal.ads.zzbei) r1.f18873e.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e7, code lost:
        if (r4 != null) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e9, code lost:
        r4.mo26022a(false, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ec, code lost:
        r4 = new java.lang.StringBuilder(44);
        r4.append("Cache connection took ");
        r4.append(r6);
        r4.append("ms");
        com.google.android.gms.internal.ads.zzawz.m20167e(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0102, code lost:
        r4 = com.google.android.gms.ads.internal.zzk.zzln().mo25499c() - r11;
        r6 = (com.google.android.gms.internal.ads.zzbei) r1.f18873e.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0113, code lost:
        if (r6 != null) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0115, code lost:
        r6.mo26022a(false, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0118, code lost:
        r6 = new java.lang.StringBuilder(44);
        r6.append("Cache connection took ");
        r6.append(r4);
        r6.append("ms");
        com.google.android.gms.internal.ads.zzawz.m20167e(r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x012d, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:18:0x009c, B:24:0x00d3] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x009c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00d3 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x00d3=Splitter:B:24:0x00d3, B:18:0x009c=Splitter:B:18:0x009c} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo25635a(com.google.android.gms.internal.ads.zzjq r20) throws java.io.IOException {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            java.lang.String r2 = "ms"
            java.lang.String r3 = "Cache connection took "
            boolean r4 = r1.f18870b
            if (r4 != 0) goto L_0x0171
            r4 = 1
            r1.f18870b = r4
            android.net.Uri r5 = r0.f22106a
            com.google.android.gms.internal.ads.zzvv r5 = com.google.android.gms.internal.ads.zzvv.m25450a((android.net.Uri) r5)
            com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.zzacu.f17863W1
            com.google.android.gms.internal.ads.zzacr r7 = com.google.android.gms.internal.ads.zzyt.m25670e()
            java.lang.Object r6 = r7.mo27163a(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r7 = -1
            if (r6 == 0) goto L_0x012e
            if (r5 == 0) goto L_0x014c
            long r9 = r0.f22108c
            r5.f22861m = r9
            boolean r6 = r5.f22860l
            if (r6 == 0) goto L_0x0040
            com.google.android.gms.internal.ads.zzacj<java.lang.Long> r6 = com.google.android.gms.internal.ads.zzacu.f17871Y1
            com.google.android.gms.internal.ads.zzacr r9 = com.google.android.gms.internal.ads.zzyt.m25670e()
            java.lang.Object r6 = r9.mo27163a(r6)
            java.lang.Long r6 = (java.lang.Long) r6
            goto L_0x004c
        L_0x0040:
            com.google.android.gms.internal.ads.zzacj<java.lang.Long> r6 = com.google.android.gms.internal.ads.zzacu.f17867X1
            com.google.android.gms.internal.ads.zzacr r9 = com.google.android.gms.internal.ads.zzyt.m25670e()
            java.lang.Object r6 = r9.mo27163a(r6)
            java.lang.Long r6 = (java.lang.Long) r6
        L_0x004c:
            long r9 = r6.longValue()
            com.google.android.gms.common.util.Clock r6 = com.google.android.gms.ads.internal.zzk.zzln()
            long r11 = r6.mo25499c()
            com.google.android.gms.ads.internal.zzk.zzma()
            android.content.Context r6 = r1.f18871c
            java.util.concurrent.Future r6 = com.google.android.gms.internal.ads.zzwi.m25464a(r6, r5)
            r13 = 0
            r14 = 44
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException | TimeoutException -> 0x00d3, InterruptedException -> 0x009c }
            java.lang.Object r9 = r6.get(r9, r15)     // Catch:{ ExecutionException | TimeoutException -> 0x00d3, InterruptedException -> 0x009c }
            java.io.InputStream r9 = (java.io.InputStream) r9     // Catch:{ ExecutionException | TimeoutException -> 0x00d3, InterruptedException -> 0x009c }
            r1.f18869a = r9     // Catch:{ ExecutionException | TimeoutException -> 0x00d3, InterruptedException -> 0x009c }
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzk.zzln()
            long r5 = r0.mo25499c()
            long r5 = r5 - r11
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.zzbei> r0 = r1.f18873e
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.ads.zzbei r0 = (com.google.android.gms.internal.ads.zzbei) r0
            if (r0 == 0) goto L_0x0084
            r0.mo26022a(r4, r5)
        L_0x0084:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            r0.append(r3)
            r0.append(r5)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzawz.m20167e(r0)
            return r7
        L_0x009a:
            r0 = move-exception
            goto L_0x0102
        L_0x009c:
            r6.cancel(r4)     // Catch:{ all -> 0x009a }
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x009a }
            r4.interrupt()     // Catch:{ all -> 0x009a }
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzk.zzln()
            long r6 = r4.mo25499c()
            long r6 = r6 - r11
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.zzbei> r4 = r1.f18873e
            java.lang.Object r4 = r4.get()
            com.google.android.gms.internal.ads.zzbei r4 = (com.google.android.gms.internal.ads.zzbei) r4
            if (r4 == 0) goto L_0x00bc
            r4.mo26022a(r13, r6)
        L_0x00bc:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r14)
            r4.append(r3)
            r4.append(r6)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.google.android.gms.internal.ads.zzawz.m20167e(r2)
            goto L_0x014c
        L_0x00d3:
            r6.cancel(r4)     // Catch:{ all -> 0x009a }
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzk.zzln()
            long r6 = r4.mo25499c()
            long r6 = r6 - r11
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.zzbei> r4 = r1.f18873e
            java.lang.Object r4 = r4.get()
            com.google.android.gms.internal.ads.zzbei r4 = (com.google.android.gms.internal.ads.zzbei) r4
            if (r4 == 0) goto L_0x00ec
            r4.mo26022a(r13, r6)
        L_0x00ec:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r14)
            r4.append(r3)
            r4.append(r6)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.google.android.gms.internal.ads.zzawz.m20167e(r2)
            goto L_0x014c
        L_0x0102:
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzk.zzln()
            long r4 = r4.mo25499c()
            long r4 = r4 - r11
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.zzbei> r6 = r1.f18873e
            java.lang.Object r6 = r6.get()
            com.google.android.gms.internal.ads.zzbei r6 = (com.google.android.gms.internal.ads.zzbei) r6
            if (r6 == 0) goto L_0x0118
            r6.mo26022a(r13, r4)
        L_0x0118:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r14)
            r6.append(r3)
            r6.append(r4)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            com.google.android.gms.internal.ads.zzawz.m20167e(r2)
            throw r0
        L_0x012e:
            r2 = 0
            if (r5 == 0) goto L_0x013d
            long r2 = r0.f22108c
            r5.f22861m = r2
            com.google.android.gms.internal.ads.zzvn r2 = com.google.android.gms.ads.internal.zzk.zzlm()
            com.google.android.gms.internal.ads.zzvs r2 = r2.mo29842a((com.google.android.gms.internal.ads.zzvv) r5)
        L_0x013d:
            if (r2 == 0) goto L_0x014c
            boolean r3 = r2.mo29845d()
            if (r3 == 0) goto L_0x014c
            java.io.InputStream r0 = r2.mo29846o()
            r1.f18869a = r0
            return r7
        L_0x014c:
            if (r5 == 0) goto L_0x016a
            com.google.android.gms.internal.ads.zzjq r2 = new com.google.android.gms.internal.ads.zzjq
            java.lang.String r3 = r5.f22854f
            android.net.Uri r10 = android.net.Uri.parse(r3)
            long r11 = r0.f22107b
            long r13 = r0.f22108c
            long r3 = r0.f22109d
            java.lang.String r5 = r0.f22110e
            int r0 = r0.f22111f
            r9 = r2
            r15 = r3
            r17 = r5
            r18 = r0
            r9.<init>(r10, r11, r13, r15, r17, r18)
            r0 = r2
        L_0x016a:
            com.google.android.gms.internal.ads.zzjp r2 = r1.f18872d
            long r2 = r2.mo25635a(r0)
            return r2
        L_0x0171:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Attempt to open an already open CacheDataSource."
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbeh.mo25635a(com.google.android.gms.internal.ads.zzjq):long");
    }

    public final void close() throws IOException {
        if (this.f18870b) {
            this.f18870b = false;
            InputStream inputStream = this.f18869a;
            if (inputStream != null) {
                IOUtils.m16280a(inputStream);
                this.f18869a = null;
                return;
            }
            this.f18872d.close();
            return;
        }
        throw new IOException("Attempt to close an already closed CacheDataSource.");
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f18870b) {
            InputStream inputStream = this.f18869a;
            if (inputStream != null) {
                return inputStream.read(bArr, i, i2);
            }
            return this.f18872d.read(bArr, i, i2);
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }
}
