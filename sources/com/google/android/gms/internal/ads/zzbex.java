package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;

@zzard
public final class zzbex implements zzrv {

    /* renamed from: a */
    private InputStream f18894a;

    /* renamed from: b */
    private boolean f18895b;

    /* renamed from: c */
    private final Context f18896c;

    /* renamed from: d */
    private final zzrv f18897d;

    /* renamed from: e */
    private final zzsj<zzrv> f18898e;

    /* renamed from: f */
    private final zzbey f18899f;

    /* renamed from: g */
    private Uri f18900g;

    public zzbex(Context context, zzrv zzrv, zzsj<zzrv> zzsj, zzbey zzbey) {
        this.f18896c = context;
        this.f18897d = zzrv;
        this.f18898e = zzsj;
        this.f18899f = zzbey;
    }

    /* renamed from: F */
    public final Uri mo26231F() {
        return this.f18900g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r6.cancel(true);
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r6.cancel(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d0, code lost:
        r6 = com.google.android.gms.ads.internal.zzk.zzln().mo25499c() - r11;
        r1.f18899f.mo26657a(false, r6);
        r4 = new java.lang.StringBuilder(44);
        r4.append("Cache connection took ");
        r4.append(r6);
        r4.append("ms");
        com.google.android.gms.internal.ads.zzawz.m20167e(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f4, code lost:
        r4 = com.google.android.gms.ads.internal.zzk.zzln().mo25499c() - r11;
        r1.f18899f.mo26657a(false, r4);
        r6 = new java.lang.StringBuilder(44);
        r6.append("Cache connection took ");
        r6.append(r4);
        r6.append("ms");
        com.google.android.gms.internal.ads.zzawz.m20167e(r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0117, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:18:0x009f, B:21:0x00cd] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x009f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x00cd */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:21:0x00cd=Splitter:B:21:0x00cd, B:18:0x009f=Splitter:B:18:0x009f} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo26232a(com.google.android.gms.internal.ads.zzry r21) throws java.io.IOException {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            java.lang.String r2 = "ms"
            java.lang.String r3 = "Cache connection took "
            boolean r4 = r1.f18895b
            if (r4 != 0) goto L_0x015e
            r4 = 1
            r1.f18895b = r4
            android.net.Uri r5 = r0.f22610a
            r1.f18900g = r5
            com.google.android.gms.internal.ads.zzsj<com.google.android.gms.internal.ads.zzrv> r5 = r1.f18898e
            if (r5 == 0) goto L_0x001a
            r5.mo28050a(r1, (com.google.android.gms.internal.ads.zzry) r0)
        L_0x001a:
            android.net.Uri r5 = r0.f22610a
            com.google.android.gms.internal.ads.zzvv r5 = com.google.android.gms.internal.ads.zzvv.m25450a((android.net.Uri) r5)
            com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.zzacu.f17863W1
            com.google.android.gms.internal.ads.zzacr r7 = com.google.android.gms.internal.ads.zzyt.m25670e()
            java.lang.Object r6 = r7.mo27163a(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r7 = -1
            if (r6 == 0) goto L_0x0118
            if (r5 == 0) goto L_0x0136
            long r9 = r0.f22613d
            r5.f22861m = r9
            boolean r6 = r5.f22860l
            if (r6 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.zzacj<java.lang.Long> r6 = com.google.android.gms.internal.ads.zzacu.f17871Y1
            com.google.android.gms.internal.ads.zzacr r9 = com.google.android.gms.internal.ads.zzyt.m25670e()
            java.lang.Object r6 = r9.mo27163a(r6)
            java.lang.Long r6 = (java.lang.Long) r6
            goto L_0x0057
        L_0x004b:
            com.google.android.gms.internal.ads.zzacj<java.lang.Long> r6 = com.google.android.gms.internal.ads.zzacu.f17867X1
            com.google.android.gms.internal.ads.zzacr r9 = com.google.android.gms.internal.ads.zzyt.m25670e()
            java.lang.Object r6 = r9.mo27163a(r6)
            java.lang.Long r6 = (java.lang.Long) r6
        L_0x0057:
            long r9 = r6.longValue()
            com.google.android.gms.common.util.Clock r6 = com.google.android.gms.ads.internal.zzk.zzln()
            long r11 = r6.mo25499c()
            com.google.android.gms.ads.internal.zzk.zzma()
            android.content.Context r6 = r1.f18896c
            java.util.concurrent.Future r6 = com.google.android.gms.internal.ads.zzwi.m25464a(r6, r5)
            r13 = 0
            r14 = 44
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException | TimeoutException -> 0x00cd, InterruptedException -> 0x009f }
            java.lang.Object r9 = r6.get(r9, r15)     // Catch:{ ExecutionException | TimeoutException -> 0x00cd, InterruptedException -> 0x009f }
            java.io.InputStream r9 = (java.io.InputStream) r9     // Catch:{ ExecutionException | TimeoutException -> 0x00cd, InterruptedException -> 0x009f }
            r1.f18894a = r9     // Catch:{ ExecutionException | TimeoutException -> 0x00cd, InterruptedException -> 0x009f }
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzk.zzln()
            long r5 = r0.mo25499c()
            long r5 = r5 - r11
            com.google.android.gms.internal.ads.zzbey r0 = r1.f18899f
            r0.mo26657a(r4, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            r0.append(r3)
            r0.append(r5)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzawz.m20167e(r0)
            return r7
        L_0x009d:
            r0 = move-exception
            goto L_0x00f4
        L_0x009f:
            r6.cancel(r4)     // Catch:{ all -> 0x009d }
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x009d }
            r4.interrupt()     // Catch:{ all -> 0x009d }
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzk.zzln()
            long r6 = r4.mo25499c()
            long r6 = r6 - r11
            com.google.android.gms.internal.ads.zzbey r4 = r1.f18899f
            r4.mo26657a(r13, r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r14)
            r4.append(r3)
            r4.append(r6)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.google.android.gms.internal.ads.zzawz.m20167e(r2)
            goto L_0x0136
        L_0x00cd:
            r6.cancel(r4)     // Catch:{ all -> 0x009d }
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzk.zzln()
            long r6 = r4.mo25499c()
            long r6 = r6 - r11
            com.google.android.gms.internal.ads.zzbey r4 = r1.f18899f
            r4.mo26657a(r13, r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r14)
            r4.append(r3)
            r4.append(r6)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.google.android.gms.internal.ads.zzawz.m20167e(r2)
            goto L_0x0136
        L_0x00f4:
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzk.zzln()
            long r4 = r4.mo25499c()
            long r4 = r4 - r11
            com.google.android.gms.internal.ads.zzbey r6 = r1.f18899f
            r6.mo26657a(r13, r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r14)
            r6.append(r3)
            r6.append(r4)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            com.google.android.gms.internal.ads.zzawz.m20167e(r2)
            throw r0
        L_0x0118:
            r2 = 0
            if (r5 == 0) goto L_0x0127
            long r2 = r0.f22613d
            r5.f22861m = r2
            com.google.android.gms.internal.ads.zzvn r2 = com.google.android.gms.ads.internal.zzk.zzlm()
            com.google.android.gms.internal.ads.zzvs r2 = r2.mo29842a((com.google.android.gms.internal.ads.zzvv) r5)
        L_0x0127:
            if (r2 == 0) goto L_0x0136
            boolean r3 = r2.mo29845d()
            if (r3 == 0) goto L_0x0136
            java.io.InputStream r0 = r2.mo29846o()
            r1.f18894a = r0
            return r7
        L_0x0136:
            if (r5 == 0) goto L_0x0157
            com.google.android.gms.internal.ads.zzry r2 = new com.google.android.gms.internal.ads.zzry
            java.lang.String r3 = r5.f22854f
            android.net.Uri r10 = android.net.Uri.parse(r3)
            byte[] r11 = r0.f22611b
            long r12 = r0.f22612c
            long r14 = r0.f22613d
            long r3 = r0.f22614e
            java.lang.String r5 = r0.f22615f
            int r0 = r0.f22616g
            r9 = r2
            r16 = r3
            r18 = r5
            r19 = r0
            r9.<init>(r10, r11, r12, r14, r16, r18, r19)
            r0 = r2
        L_0x0157:
            com.google.android.gms.internal.ads.zzrv r2 = r1.f18897d
            long r2 = r2.mo26232a(r0)
            return r2
        L_0x015e:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Attempt to open an already open CacheDataSource."
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbex.mo26232a(com.google.android.gms.internal.ads.zzry):long");
    }

    public final void close() throws IOException {
        if (this.f18895b) {
            this.f18895b = false;
            this.f18900g = null;
            InputStream inputStream = this.f18894a;
            if (inputStream != null) {
                IOUtils.m16280a(inputStream);
                this.f18894a = null;
            } else {
                this.f18897d.close();
            }
            zzsj<zzrv> zzsj = this.f18898e;
            if (zzsj != null) {
                zzsj.mo28048a(this);
                return;
            }
            return;
        }
        throw new IOException("Attempt to close an already closed CacheDataSource.");
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (this.f18895b) {
            InputStream inputStream = this.f18894a;
            if (inputStream != null) {
                i3 = inputStream.read(bArr, i, i2);
            } else {
                i3 = this.f18897d.read(bArr, i, i2);
            }
            zzsj<zzrv> zzsj = this.f18898e;
            if (zzsj != null) {
                zzsj.mo28049a(this, i3);
            }
            return i3;
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }
}
