package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class zzan implements zzb {

    /* renamed from: a */
    private final Map<String, C8050v2> f18202a;

    /* renamed from: b */
    private long f18203b;

    /* renamed from: c */
    private final File f18204c;

    /* renamed from: d */
    private final int f18205d;

    public zzan(File file, int i) {
        this.f18202a = new LinkedHashMap(16, 0.75f, true);
        this.f18203b = 0;
        this.f18204c = file;
        this.f18205d = i;
    }

    /* renamed from: c */
    private final void m19506c(String str) {
        C8050v2 remove = this.f18202a.remove(str);
        if (remove != null) {
            this.f18203b -= remove.f16992a;
        }
    }

    /* renamed from: d */
    private static String m19507d(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: e */
    private final File m19508e(String str) {
        return new File(this.f18204c, m19507d(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0059 */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo27452B() {
        /*
            r9 = this;
            monitor-enter(r9)
            java.io.File r0 = r9.f18204c     // Catch:{ all -> 0x0061 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0061 }
            r1 = 0
            if (r0 != 0) goto L_0x0024
            java.io.File r0 = r9.f18204c     // Catch:{ all -> 0x0061 }
            boolean r0 = r0.mkdirs()     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "Unable to create cache dir %s"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0061 }
            java.io.File r3 = r9.f18204c     // Catch:{ all -> 0x0061 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x0061 }
            r2[r1] = r3     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.zzag.m19161b(r0, r2)     // Catch:{ all -> 0x0061 }
        L_0x0022:
            monitor-exit(r9)
            return
        L_0x0024:
            java.io.File r0 = r9.f18204c     // Catch:{ all -> 0x0061 }
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x002e
            monitor-exit(r9)
            return
        L_0x002e:
            int r2 = r0.length     // Catch:{ all -> 0x0061 }
        L_0x002f:
            if (r1 >= r2) goto L_0x005f
            r3 = r0[r1]     // Catch:{ all -> 0x0061 }
            long r4 = r3.length()     // Catch:{ IOException -> 0x0059 }
            com.google.android.gms.internal.ads.y2 r6 = new com.google.android.gms.internal.ads.y2     // Catch:{ IOException -> 0x0059 }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0059 }
            java.io.InputStream r8 = m19495a((java.io.File) r3)     // Catch:{ IOException -> 0x0059 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0059 }
            r6.<init>(r7, r4)     // Catch:{ IOException -> 0x0059 }
            com.google.android.gms.internal.ads.v2 r7 = com.google.android.gms.internal.ads.C8050v2.m18308a((com.google.android.gms.internal.ads.C8161y2) r6)     // Catch:{ all -> 0x0054 }
            r7.f16992a = r4     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = r7.f16993b     // Catch:{ all -> 0x0054 }
            r9.m19501a((java.lang.String) r4, (com.google.android.gms.internal.ads.C8050v2) r7)     // Catch:{ all -> 0x0054 }
            r6.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x005c
        L_0x0054:
            r4 = move-exception
            r6.close()     // Catch:{ IOException -> 0x0059 }
            throw r4     // Catch:{ IOException -> 0x0059 }
        L_0x0059:
            r3.delete()     // Catch:{ all -> 0x0061 }
        L_0x005c:
            int r1 = r1 + 1
            goto L_0x002f
        L_0x005f:
            monitor-exit(r9)
            return
        L_0x0061:
            r0 = move-exception
            monitor-exit(r9)
            goto L_0x0065
        L_0x0064:
            throw r0
        L_0x0065:
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzan.mo27452B():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00fa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0115, code lost:
        if (r3.delete() == false) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0117, code lost:
        com.google.android.gms.internal.ads.zzag.m19159a("Could not clean up file %s", r3.getAbsolutePath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0125, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0111 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo27453a(java.lang.String r16, com.google.android.gms.internal.ads.zzc r17) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r2 = r17
            monitor-enter(r15)
            long r3 = r1.f18203b     // Catch:{ all -> 0x0126 }
            byte[] r5 = r2.f19815a     // Catch:{ all -> 0x0126 }
            int r5 = r5.length     // Catch:{ all -> 0x0126 }
            long r5 = (long) r5     // Catch:{ all -> 0x0126 }
            long r3 = r3 + r5
            int r5 = r1.f18205d     // Catch:{ all -> 0x0126 }
            long r5 = (long) r5     // Catch:{ all -> 0x0126 }
            r7 = 1063675494(0x3f666666, float:0.9)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x0026
            byte[] r3 = r2.f19815a     // Catch:{ all -> 0x0126 }
            int r3 = r3.length     // Catch:{ all -> 0x0126 }
            float r3 = (float) r3     // Catch:{ all -> 0x0126 }
            int r4 = r1.f18205d     // Catch:{ all -> 0x0126 }
            float r4 = (float) r4
            float r4 = r4 * r7
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0026
            monitor-exit(r15)
            return
        L_0x0026:
            java.io.File r3 = r15.m19508e(r16)     // Catch:{ all -> 0x0126 }
            r4 = 1
            r5 = 0
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0111 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0111 }
            r8.<init>(r3)     // Catch:{ IOException -> 0x0111 }
            r6.<init>(r8)     // Catch:{ IOException -> 0x0111 }
            com.google.android.gms.internal.ads.v2 r8 = new com.google.android.gms.internal.ads.v2     // Catch:{ IOException -> 0x0111 }
            r8.<init>(r0, r2)     // Catch:{ IOException -> 0x0111 }
            boolean r9 = r8.mo26679a((java.io.OutputStream) r6)     // Catch:{ IOException -> 0x0111 }
            if (r9 == 0) goto L_0x00fb
            byte[] r2 = r2.f19815a     // Catch:{ IOException -> 0x0111 }
            r6.write(r2)     // Catch:{ IOException -> 0x0111 }
            r6.close()     // Catch:{ IOException -> 0x0111 }
            long r9 = r3.length()     // Catch:{ IOException -> 0x0111 }
            r8.f16992a = r9     // Catch:{ IOException -> 0x0111 }
            r15.m19501a((java.lang.String) r0, (com.google.android.gms.internal.ads.C8050v2) r8)     // Catch:{ IOException -> 0x0111 }
            long r8 = r1.f18203b     // Catch:{ IOException -> 0x0111 }
            int r0 = r1.f18205d     // Catch:{ IOException -> 0x0111 }
            long r10 = (long) r0     // Catch:{ IOException -> 0x0111 }
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x00f9
            boolean r0 = com.google.android.gms.internal.ads.zzag.f18074b     // Catch:{ IOException -> 0x0111 }
            if (r0 == 0) goto L_0x0066
            java.lang.String r0 = "Pruning old cache entries."
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x0111 }
            com.google.android.gms.internal.ads.zzag.m19162c(r0, r2)     // Catch:{ IOException -> 0x0111 }
        L_0x0066:
            long r8 = r1.f18203b     // Catch:{ IOException -> 0x0111 }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0111 }
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.v2> r0 = r1.f18202a     // Catch:{ IOException -> 0x0111 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ IOException -> 0x0111 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x0111 }
            r2 = 0
        L_0x0077:
            boolean r6 = r0.hasNext()     // Catch:{ IOException -> 0x0111 }
            r12 = 2
            if (r6 == 0) goto L_0x00d0
            java.lang.Object r6 = r0.next()     // Catch:{ IOException -> 0x0111 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ IOException -> 0x0111 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ IOException -> 0x0111 }
            com.google.android.gms.internal.ads.v2 r6 = (com.google.android.gms.internal.ads.C8050v2) r6     // Catch:{ IOException -> 0x0111 }
            java.lang.String r13 = r6.f16993b     // Catch:{ IOException -> 0x0111 }
            java.io.File r13 = r15.m19508e(r13)     // Catch:{ IOException -> 0x0111 }
            boolean r13 = r13.delete()     // Catch:{ IOException -> 0x0111 }
            if (r13 == 0) goto L_0x00a0
            long r13 = r1.f18203b     // Catch:{ IOException -> 0x0111 }
            r16 = r8
            long r7 = r6.f16992a     // Catch:{ IOException -> 0x0111 }
            long r13 = r13 - r7
            r1.f18203b = r13     // Catch:{ IOException -> 0x0111 }
            goto L_0x00b5
        L_0x00a0:
            r16 = r8
            java.lang.String r7 = "Could not delete cache entry for key=%s, filename=%s"
            java.lang.Object[] r8 = new java.lang.Object[r12]     // Catch:{ IOException -> 0x0111 }
            java.lang.String r9 = r6.f16993b     // Catch:{ IOException -> 0x0111 }
            r8[r5] = r9     // Catch:{ IOException -> 0x0111 }
            java.lang.String r6 = r6.f16993b     // Catch:{ IOException -> 0x0111 }
            java.lang.String r6 = m19507d(r6)     // Catch:{ IOException -> 0x0111 }
            r8[r4] = r6     // Catch:{ IOException -> 0x0111 }
            com.google.android.gms.internal.ads.zzag.m19159a(r7, r8)     // Catch:{ IOException -> 0x0111 }
        L_0x00b5:
            r0.remove()     // Catch:{ IOException -> 0x0111 }
            int r2 = r2 + 1
            long r6 = r1.f18203b     // Catch:{ IOException -> 0x0111 }
            float r6 = (float) r6     // Catch:{ IOException -> 0x0111 }
            int r7 = r1.f18205d     // Catch:{ IOException -> 0x0111 }
            float r7 = (float) r7     // Catch:{ IOException -> 0x0111 }
            r8 = 1063675494(0x3f666666, float:0.9)
            float r7 = r7 * r8
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x00ca
            goto L_0x00d2
        L_0x00ca:
            r8 = r16
            r7 = 1063675494(0x3f666666, float:0.9)
            goto L_0x0077
        L_0x00d0:
            r16 = r8
        L_0x00d2:
            boolean r0 = com.google.android.gms.internal.ads.zzag.f18074b     // Catch:{ IOException -> 0x0111 }
            if (r0 == 0) goto L_0x00f9
            java.lang.String r0 = "pruned %d files, %d bytes, %d ms"
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x0111 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x0111 }
            r6[r5] = r2     // Catch:{ IOException -> 0x0111 }
            long r7 = r1.f18203b     // Catch:{ IOException -> 0x0111 }
            long r7 = r7 - r16
            java.lang.Long r2 = java.lang.Long.valueOf(r7)     // Catch:{ IOException -> 0x0111 }
            r6[r4] = r2     // Catch:{ IOException -> 0x0111 }
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0111 }
            long r7 = r7 - r10
            java.lang.Long r2 = java.lang.Long.valueOf(r7)     // Catch:{ IOException -> 0x0111 }
            r6[r12] = r2     // Catch:{ IOException -> 0x0111 }
            com.google.android.gms.internal.ads.zzag.m19162c(r0, r6)     // Catch:{ IOException -> 0x0111 }
        L_0x00f9:
            monitor-exit(r15)
            return
        L_0x00fb:
            r6.close()     // Catch:{ IOException -> 0x0111 }
            java.lang.String r0 = "Failed to write header for %s"
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0111 }
            java.lang.String r6 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x0111 }
            r2[r5] = r6     // Catch:{ IOException -> 0x0111 }
            com.google.android.gms.internal.ads.zzag.m19159a(r0, r2)     // Catch:{ IOException -> 0x0111 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0111 }
            r0.<init>()     // Catch:{ IOException -> 0x0111 }
            throw r0     // Catch:{ IOException -> 0x0111 }
        L_0x0111:
            boolean r0 = r3.delete()     // Catch:{ all -> 0x0126 }
            if (r0 != 0) goto L_0x0124
            java.lang.String r0 = "Could not clean up file %s"
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ all -> 0x0126 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x0126 }
            r2[r5] = r3     // Catch:{ all -> 0x0126 }
            com.google.android.gms.internal.ads.zzag.m19159a(r0, r2)     // Catch:{ all -> 0x0126 }
        L_0x0124:
            monitor-exit(r15)
            return
        L_0x0126:
            r0 = move-exception
            monitor-exit(r15)
            goto L_0x012a
        L_0x0129:
            throw r0
        L_0x012a:
            goto L_0x0129
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzan.mo27453a(java.lang.String, com.google.android.gms.internal.ads.zzc):void");
    }

    /* renamed from: b */
    public final synchronized zzc mo27454b(String str) {
        C8161y2 y2Var;
        C8050v2 v2Var = this.f18202a.get(str);
        if (v2Var == null) {
            return null;
        }
        File e = m19508e(str);
        try {
            y2Var = new C8161y2(new BufferedInputStream(m19495a(e)), e.length());
            C8050v2 a = C8050v2.m18308a(y2Var);
            if (!TextUtils.equals(str, a.f16993b)) {
                zzag.m19159a("%s: key=%s, found=%s", e.getAbsolutePath(), str, a.f16993b);
                m19506c(str);
                y2Var.close();
                return null;
            }
            byte[] a2 = m19502a(y2Var, y2Var.mo26794a());
            zzc zzc = new zzc();
            zzc.f19815a = a2;
            zzc.f19816b = v2Var.f16994c;
            zzc.f19817c = v2Var.f16995d;
            zzc.f19818d = v2Var.f16996e;
            zzc.f19819e = v2Var.f16997f;
            zzc.f19820f = v2Var.f16998g;
            List<zzl> list = v2Var.f16999h;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (zzl next : list) {
                treeMap.put(next.mo29461a(), next.mo29462b());
            }
            zzc.f19821g = treeMap;
            zzc.f19822h = Collections.unmodifiableList(v2Var.f16999h);
            y2Var.close();
            return zzc;
        } catch (IOException e2) {
            zzag.m19159a("%s: %s", e.getAbsolutePath(), e2.toString());
            m19500a(str);
            return null;
        } catch (Throwable th) {
            y2Var.close();
            throw th;
        }
    }

    /* renamed from: c */
    static long m19505c(InputStream inputStream) throws IOException {
        return (((long) m19494a(inputStream)) & 255) | 0 | ((((long) m19494a(inputStream)) & 255) << 8) | ((((long) m19494a(inputStream)) & 255) << 16) | ((((long) m19494a(inputStream)) & 255) << 24) | ((((long) m19494a(inputStream)) & 255) << 32) | ((((long) m19494a(inputStream)) & 255) << 40) | ((((long) m19494a(inputStream)) & 255) << 48) | ((255 & ((long) m19494a(inputStream))) << 56);
    }

    public zzan(File file) {
        this(file, 5242880);
    }

    /* renamed from: b */
    static int m19503b(InputStream inputStream) throws IOException {
        return (m19494a(inputStream) << 24) | m19494a(inputStream) | 0 | (m19494a(inputStream) << 8) | (m19494a(inputStream) << 16);
    }

    /* renamed from: b */
    static List<zzl> m19504b(C8161y2 y2Var) throws IOException {
        int b = m19503b((InputStream) y2Var);
        if (b >= 0) {
            List<zzl> emptyList = b == 0 ? Collections.emptyList() : new ArrayList<>();
            for (int i = 0; i < b; i++) {
                emptyList.add(new zzl(m19496a(y2Var).intern(), m19496a(y2Var).intern()));
            }
            return emptyList;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("readHeaderList size=");
        sb.append(b);
        throw new IOException(sb.toString());
    }

    /* renamed from: a */
    private final synchronized void m19500a(String str) {
        boolean delete = m19508e(str).delete();
        m19506c(str);
        if (!delete) {
            zzag.m19159a("Could not delete cache entry for key=%s, filename=%s", str, m19507d(str));
        }
    }

    /* renamed from: a */
    private final void m19501a(String str, C8050v2 v2Var) {
        if (!this.f18202a.containsKey(str)) {
            this.f18203b += v2Var.f16992a;
        } else {
            this.f18203b += v2Var.f16992a - this.f18202a.get(str).f16992a;
        }
        this.f18202a.put(str, v2Var);
    }

    /* renamed from: a */
    private static byte[] m19502a(C8161y2 y2Var, long j) throws IOException {
        long a = y2Var.mo26794a();
        if (j >= 0 && j <= a) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(y2Var).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(a);
        throw new IOException(sb.toString());
    }

    /* renamed from: a */
    private static InputStream m19495a(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    /* renamed from: a */
    private static int m19494a(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* renamed from: a */
    static void m19497a(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write(i >>> 24);
    }

    /* renamed from: a */
    static void m19498a(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    /* renamed from: a */
    static void m19499a(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        m19498a(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    /* renamed from: a */
    static String m19496a(C8161y2 y2Var) throws IOException {
        return new String(m19502a(y2Var, m19505c((InputStream) y2Var)), "UTF-8");
    }
}
