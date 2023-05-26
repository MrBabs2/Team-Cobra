package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.v2 */
final class C8050v2 {

    /* renamed from: a */
    long f16992a;

    /* renamed from: b */
    final String f16993b;

    /* renamed from: c */
    final String f16994c;

    /* renamed from: d */
    final long f16995d;

    /* renamed from: e */
    final long f16996e;

    /* renamed from: f */
    final long f16997f;

    /* renamed from: g */
    final long f16998g;

    /* renamed from: h */
    final List<zzl> f16999h;

    private C8050v2(String str, String str2, long j, long j2, long j3, long j4, List<zzl> list) {
        this.f16993b = str;
        this.f16994c = "".equals(str2) ? null : str2;
        this.f16995d = j;
        this.f16996e = j2;
        this.f16997f = j3;
        this.f16998g = j4;
        this.f16999h = list;
    }

    /* renamed from: a */
    static C8050v2 m18308a(C8161y2 y2Var) throws IOException {
        if (zzan.m19503b((InputStream) y2Var) == 538247942) {
            return new C8050v2(zzan.m19496a(y2Var), zzan.m19496a(y2Var), zzan.m19505c((InputStream) y2Var), zzan.m19505c((InputStream) y2Var), zzan.m19505c((InputStream) y2Var), zzan.m19505c((InputStream) y2Var), zzan.m19504b(y2Var));
        }
        throw new IOException();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C8050v2(java.lang.String r14, com.google.android.gms.internal.ads.zzc r15) {
        /*
            r13 = this;
            java.lang.String r2 = r15.f19816b
            long r3 = r15.f19817c
            long r5 = r15.f19818d
            long r7 = r15.f19819e
            long r9 = r15.f19820f
            java.util.List<com.google.android.gms.internal.ads.zzl> r0 = r15.f19822h
            if (r0 == 0) goto L_0x0010
        L_0x000e:
            r11 = r0
            goto L_0x0044
        L_0x0010:
            java.util.Map<java.lang.String, java.lang.String> r15 = r15.f19821g
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.size()
            r0.<init>(r1)
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L_0x0023:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x000e
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.google.android.gms.internal.ads.zzl r11 = new com.google.android.gms.internal.ads.zzl
            java.lang.Object r12 = r1.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r11.<init>(r12, r1)
            r0.add(r11)
            goto L_0x0023
        L_0x0044:
            r0 = r13
            r1 = r14
            r0.<init>(r1, r2, r3, r5, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8050v2.<init>(java.lang.String, com.google.android.gms.internal.ads.zzc):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo26679a(OutputStream outputStream) {
        try {
            zzan.m19497a(outputStream, 538247942);
            zzan.m19499a(outputStream, this.f16993b);
            zzan.m19499a(outputStream, this.f16994c == null ? "" : this.f16994c);
            zzan.m19498a(outputStream, this.f16995d);
            zzan.m19498a(outputStream, this.f16996e);
            zzan.m19498a(outputStream, this.f16997f);
            zzan.m19498a(outputStream, this.f16998g);
            List<zzl> list = this.f16999h;
            if (list != null) {
                zzan.m19497a(outputStream, list.size());
                for (zzl next : list) {
                    zzan.m19499a(outputStream, next.mo29461a());
                    zzan.m19499a(outputStream, next.mo29462b());
                }
            } else {
                zzan.m19497a(outputStream, 0);
            }
            outputStream.flush();
            return true;
        } catch (IOException e) {
            zzag.m19159a("%s", e.toString());
            return false;
        }
    }
}
