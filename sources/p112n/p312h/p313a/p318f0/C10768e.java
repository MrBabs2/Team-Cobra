package p112n.p312h.p313a.p318f0;

/* renamed from: n.h.a.f0.e */
/* compiled from: FileDownloadProperties */
public class C10768e {

    /* renamed from: a */
    public final int f28827a;

    /* renamed from: b */
    public final long f28828b;

    /* renamed from: c */
    public final boolean f28829c;

    /* renamed from: d */
    public final boolean f28830d;

    /* renamed from: e */
    public final int f28831e;

    /* renamed from: f */
    public final boolean f28832f;

    /* renamed from: n.h.a.f0.e$b */
    /* compiled from: FileDownloadProperties */
    public static class C10770b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C10768e f28833a = new C10768e();
    }

    /* renamed from: a */
    public static C10768e m36497a() {
        return C10770b.f28833a;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0085 A[Catch:{ all -> 0x01d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0091 A[Catch:{ all -> 0x01d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0096 A[SYNTHETIC, Splitter:B:48:0x0096] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01dd A[SYNTHETIC, Splitter:B:96:0x01dd] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C10768e() {
        /*
            r21 = this;
            r1 = r21
            java.lang.String r2 = "file.non-pre-allocation"
            java.lang.String r3 = "download.max-network-thread-count"
            java.lang.String r4 = "download.min-progress-time"
            java.lang.String r5 = "download.min-progress-step"
            java.lang.Class<n.h.a.f0.e> r6 = p112n.p312h.p313a.p318f0.C10768e.class
            java.lang.String r7 = "process.non-separate"
            java.lang.String r8 = "http.lenient"
            r21.<init>()
            android.content.Context r0 = p112n.p312h.p313a.p318f0.C10763c.m36479a()
            if (r0 == 0) goto L_0x01e7
            long r9 = java.lang.System.currentTimeMillis()
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            r12 = 0
            android.content.Context r13 = p112n.p312h.p313a.p318f0.C10763c.m36479a()     // Catch:{ IOException -> 0x0077, all -> 0x0072 }
            android.content.res.AssetManager r13 = r13.getAssets()     // Catch:{ IOException -> 0x0077, all -> 0x0072 }
            java.lang.String r14 = "filedownloader.properties"
            java.io.InputStream r13 = r13.open(r14)     // Catch:{ IOException -> 0x0077, all -> 0x0072 }
            if (r13 == 0) goto L_0x005d
            r0.load(r13)     // Catch:{ IOException -> 0x005b }
            java.lang.String r14 = r0.getProperty(r8)     // Catch:{ IOException -> 0x005b }
            java.lang.String r15 = r0.getProperty(r7)     // Catch:{ IOException -> 0x0059 }
            java.lang.String r16 = r0.getProperty(r5)     // Catch:{ IOException -> 0x0057 }
            java.lang.String r17 = r0.getProperty(r4)     // Catch:{ IOException -> 0x0055 }
            java.lang.String r18 = r0.getProperty(r3)     // Catch:{ IOException -> 0x0053 }
            java.lang.String r0 = r0.getProperty(r2)     // Catch:{ IOException -> 0x0051 }
            r11 = r14
            r14 = r0
            goto L_0x0066
        L_0x0051:
            r0 = move-exception
            goto L_0x0081
        L_0x0053:
            r0 = move-exception
            goto L_0x007f
        L_0x0055:
            r0 = move-exception
            goto L_0x007d
        L_0x0057:
            r0 = move-exception
            goto L_0x007b
        L_0x0059:
            r0 = move-exception
            goto L_0x007a
        L_0x005b:
            r0 = move-exception
            goto L_0x0079
        L_0x005d:
            r11 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
        L_0x0066:
            if (r13 == 0) goto L_0x00a1
            r13.close()     // Catch:{ IOException -> 0x006c }
            goto L_0x00a1
        L_0x006c:
            r0 = move-exception
            r13 = r0
            r13.printStackTrace()
            goto L_0x00a1
        L_0x0072:
            r0 = move-exception
            r2 = r0
            r11 = 0
            goto L_0x01db
        L_0x0077:
            r0 = move-exception
            r13 = 0
        L_0x0079:
            r14 = 0
        L_0x007a:
            r15 = 0
        L_0x007b:
            r16 = 0
        L_0x007d:
            r17 = 0
        L_0x007f:
            r18 = 0
        L_0x0081:
            boolean r11 = r0 instanceof java.io.FileNotFoundException     // Catch:{ all -> 0x01d8 }
            if (r11 == 0) goto L_0x0091
            boolean r0 = p112n.p312h.p313a.p318f0.C10767d.f28826a     // Catch:{ all -> 0x01d8 }
            if (r0 == 0) goto L_0x0094
            java.lang.String r0 = "not found filedownloader.properties"
            java.lang.Object[] r11 = new java.lang.Object[r12]     // Catch:{ all -> 0x01d8 }
            p112n.p312h.p313a.p318f0.C10767d.m36490a(r6, r0, r11)     // Catch:{ all -> 0x01d8 }
            goto L_0x0094
        L_0x0091:
            r0.printStackTrace()     // Catch:{ all -> 0x01d8 }
        L_0x0094:
            if (r13 == 0) goto L_0x009f
            r13.close()     // Catch:{ IOException -> 0x009a }
            goto L_0x009f
        L_0x009a:
            r0 = move-exception
            r11 = r0
            r11.printStackTrace()
        L_0x009f:
            r11 = r14
            r14 = 0
        L_0x00a1:
            java.lang.String r0 = "the value of '%s' must be '%s' or '%s'"
            r19 = 1
            java.lang.String r12 = "false"
            java.lang.String r13 = "true"
            if (r11 == 0) goto L_0x00d7
            boolean r20 = r11.equals(r13)
            if (r20 != 0) goto L_0x00cd
            boolean r20 = r11.equals(r12)
            if (r20 == 0) goto L_0x00b8
            goto L_0x00cd
        L_0x00b8:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r8
            r3[r19] = r13
            r4 = 2
            r3[r4] = r12
            java.lang.String r0 = p112n.p312h.p313a.p318f0.C10771f.m36504a((java.lang.String) r0, (java.lang.Object[]) r3)
            r2.<init>(r0)
            throw r2
        L_0x00cd:
            r20 = r6
            r6 = 0
            boolean r11 = r11.equals(r13)
            r1.f28829c = r11
            goto L_0x00dc
        L_0x00d7:
            r20 = r6
            r6 = 0
            r1.f28829c = r6
        L_0x00dc:
            if (r15 == 0) goto L_0x0106
            boolean r11 = r15.equals(r13)
            if (r11 != 0) goto L_0x00ff
            boolean r11 = r15.equals(r12)
            if (r11 == 0) goto L_0x00eb
            goto L_0x00ff
        L_0x00eb:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r6] = r7
            r3[r19] = r13
            r4 = 2
            r3[r4] = r12
            java.lang.String r0 = p112n.p312h.p313a.p318f0.C10771f.m36504a((java.lang.String) r0, (java.lang.Object[]) r3)
            r2.<init>(r0)
            throw r2
        L_0x00ff:
            boolean r11 = r15.equals(r13)
            r1.f28830d = r11
            goto L_0x0108
        L_0x0106:
            r1.f28830d = r6
        L_0x0108:
            if (r16 == 0) goto L_0x0119
            java.lang.Integer r11 = java.lang.Integer.valueOf(r16)
            int r11 = r11.intValue()
            int r11 = java.lang.Math.max(r6, r11)
            r1.f28827a = r11
            goto L_0x011d
        L_0x0119:
            r6 = 65536(0x10000, float:9.18355E-41)
            r1.f28827a = r6
        L_0x011d:
            if (r17 == 0) goto L_0x0134
            java.lang.Long r6 = java.lang.Long.valueOf(r17)
            r11 = r3
            r15 = r4
            long r3 = r6.longValue()
            r16 = r5
            r5 = 0
            long r3 = java.lang.Math.max(r5, r3)
            r1.f28828b = r3
            goto L_0x013c
        L_0x0134:
            r11 = r3
            r15 = r4
            r16 = r5
            r3 = 2000(0x7d0, double:9.88E-321)
            r1.f28828b = r3
        L_0x013c:
            if (r18 == 0) goto L_0x014e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r18)
            int r3 = r3.intValue()
            int r3 = m36496a(r3)
            r1.f28831e = r3
            r3 = 3
            goto L_0x0151
        L_0x014e:
            r3 = 3
            r1.f28831e = r3
        L_0x0151:
            if (r14 == 0) goto L_0x017c
            boolean r4 = r14.equals(r13)
            if (r4 != 0) goto L_0x0174
            boolean r4 = r14.equals(r12)
            if (r4 == 0) goto L_0x0160
            goto L_0x0174
        L_0x0160:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r5 = 0
            r3[r5] = r2
            r3[r19] = r13
            r2 = 2
            r3[r2] = r12
            java.lang.String r0 = p112n.p312h.p313a.p318f0.C10771f.m36504a((java.lang.String) r0, (java.lang.Object[]) r3)
            r4.<init>(r0)
            throw r4
        L_0x0174:
            r5 = 0
            boolean r0 = r14.equals(r13)
            r1.f28832f = r0
            goto L_0x017f
        L_0x017c:
            r5 = 0
            r1.f28832f = r5
        L_0x017f:
            boolean r0 = p112n.p312h.p313a.p318f0.C10767d.f28826a
            if (r0 == 0) goto L_0x01d7
            r0 = 11
            java.lang.Object[] r0 = new java.lang.Object[r0]
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r9
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0[r5] = r2
            r0[r19] = r8
            boolean r2 = r1.f28829c
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3 = 2
            r0[r3] = r2
            r2 = 3
            r0[r2] = r7
            r2 = 4
            boolean r3 = r1.f28830d
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0[r2] = r3
            r2 = 5
            r0[r2] = r16
            r2 = 6
            int r3 = r1.f28827a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            r2 = 7
            r0[r2] = r15
            r2 = 8
            long r3 = r1.f28828b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0[r2] = r3
            r2 = 9
            r0[r2] = r11
            r2 = 10
            int r3 = r1.f28831e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            java.lang.String r2 = "init properties %d\n load properties: %s=%B; %s=%B; %s=%d; %s=%d; %s=%d"
            r3 = r20
            p112n.p312h.p313a.p318f0.C10767d.m36493c(r3, r2, r0)
        L_0x01d7:
            return
        L_0x01d8:
            r0 = move-exception
            r2 = r0
            r11 = r13
        L_0x01db:
            if (r11 == 0) goto L_0x01e6
            r11.close()     // Catch:{ IOException -> 0x01e1 }
            goto L_0x01e6
        L_0x01e1:
            r0 = move-exception
            r3 = r0
            r3.printStackTrace()
        L_0x01e6:
            throw r2
        L_0x01e7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Please invoke the FileDownloader#init in Application#onCreate first."
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p112n.p312h.p313a.p318f0.C10768e.<init>():void");
    }

    /* renamed from: a */
    public static int m36496a(int i) {
        Class<C10768e> cls = C10768e.class;
        if (i > 12) {
            C10767d.m36495e(cls, "require the count of network thread  is %d, what is more than the max valid count(%d), so adjust to %d auto", Integer.valueOf(i), 12, 12);
            return 12;
        } else if (i >= 1) {
            return i;
        } else {
            C10767d.m36495e(cls, "require the count of network thread  is %d, what is less than the min valid count(%d), so adjust to %d auto", Integer.valueOf(i), 1, 1);
            return 1;
        }
    }
}
