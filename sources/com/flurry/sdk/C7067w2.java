package com.flurry.sdk;

import com.flurry.sdk.C6767c3;
import com.flurry.sdk.C6972p3;
import com.flurry.sdk.C7079x2;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/* renamed from: com.flurry.sdk.w2 */
public final class C7067w2 extends C6767c3 {

    /* renamed from: r */
    protected C6972p3 f13314r;

    /* renamed from: com.flurry.sdk.w2$a */
    class C7068a extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ C7044u6 f13315h;

        /* renamed from: com.flurry.sdk.w2$a$a */
        class C7069a implements C6972p3.C6973a {
            C7069a() {
            }

            /* renamed from: a */
            public final void mo23685a() {
                C7067w2.this.f12599o = C6767c3.C6772c.f12608h;
                C7067w2.this.f13314r.mo23653b();
                C7067w2.this.f12599o = C6767c3.C6772c.f12609i;
                C7067w2.this.mo23559e();
            }
        }

        C7068a(C7044u6 u6Var) {
            this.f13315h = u6Var;
        }

        /* renamed from: a */
        public final void mo23531a() {
            if (!C7067w2.this.f13314r.mo23654c()) {
                if (C7067w2.this.m15005a("currentFile")) {
                    C6792d1.m14476a(4, "FileWriterModule", "File created. Adding counter");
                    C7067w2.this.f13314r.mo23651a((C7044u6) C7030t5.m14908h(), (C6972p3.C6973a) null);
                } else {
                    C6792d1.m14476a(4, "FileWriterModule", "File creation failed.");
                }
            }
            if (this.f13315h.mo23538a().equals(C7023s6.FLUSH_FRAME)) {
                C7067w2.this.f12599o = C6767c3.C6772c.f12608h;
                C6792d1.m14476a(4, "FileWriterModule", "Adding flush frame:" + this.f13315h.mo23712d());
                C7067w2.this.f13314r.mo23651a(this.f13315h, (C6972p3.C6973a) new C7069a());
                return;
            }
            C6792d1.m14476a(4, "FileWriterModule", "Adding frame " + this.f13315h.mo23538a() + ": " + this.f13315h.mo23712d());
            C7067w2.this.f13314r.mo23651a(this.f13315h, (C6972p3.C6973a) null);
        }
    }

    C7067w2() {
        super("FileWriterModule", (C7079x2) null);
        this.f13314r = null;
        this.f13314r = new C6926m3();
        new C7084x6();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01a8  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.flurry.sdk.C7028t3 m15006f() {
        /*
            java.lang.String r0 = "FileWriterModule"
            r1 = 4
            java.lang.String r2 = "Start getting native crash entity."
            com.flurry.sdk.C6792d1.m14476a((int) r1, (java.lang.String) r0, (java.lang.String) r2)
            android.content.Context r2 = com.flurry.sdk.C6747b0.m14386a()
            java.lang.String r3 = ".yflurrynativecrash"
            java.io.File r2 = r2.getFileStreamPath(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = ".*"
            r3.<init>(r4)
            java.lang.String r5 = ".dmp"
            java.lang.String r5 = java.util.regex.Pattern.quote(r5)
            r3.append(r5)
            java.lang.String r5 = "$"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            boolean r5 = r2.exists()
            r6 = 0
            if (r5 != 0) goto L_0x0039
            java.lang.String[] r3 = new java.lang.String[r6]
            goto L_0x0046
        L_0x0039:
            com.flurry.sdk.q2$a r5 = new com.flurry.sdk.q2$a
            r5.<init>(r3)
            java.lang.String[] r3 = r2.list(r5)
            if (r3 != 0) goto L_0x0046
            java.lang.String[] r3 = new java.lang.String[r6]
        L_0x0046:
            r5 = 0
            if (r3 == 0) goto L_0x01b8
            int r7 = r3.length
            if (r7 != 0) goto L_0x004e
            goto L_0x01b8
        L_0x004e:
            int r7 = r3.length
            r9 = r5
            r8 = 0
        L_0x0051:
            if (r8 >= r7) goto L_0x01b2
            r10 = r3[r8]
            java.lang.String r11 = java.lang.String.valueOf(r10)
            java.lang.String r12 = "Native crash occurred in previous session! Found minidump file - "
            java.lang.String r11 = r12.concat(r11)
            com.flurry.sdk.C6792d1.m14485c(r0, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            java.lang.String r12 = ".fcb"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r4)
            java.lang.String r11 = java.util.regex.Pattern.quote(r11)
            r12.append(r11)
            r12.append(r4)
            java.lang.String r11 = r12.toString()
            java.util.regex.Pattern r11 = java.util.regex.Pattern.compile(r11)
            java.lang.String[] r11 = com.flurry.sdk.C6749b2.m14391a(r2, r11)
            int r12 = r11.length
            if (r12 <= 0) goto L_0x0094
            r11 = r11[r6]
            goto L_0x0095
        L_0x0094:
            r11 = r5
        L_0x0095:
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 == 0) goto L_0x00a2
            java.lang.String r12 = "There was no breadcrumbs file associated with the minidump file."
            com.flurry.sdk.C6792d1.m14476a((int) r1, (java.lang.String) r0, (java.lang.String) r12)
            r12 = 1
            goto L_0x00a3
        L_0x00a2:
            r12 = 0
        L_0x00a3:
            java.lang.String r14 = java.lang.String.valueOf(r11)
            java.lang.String r15 = "Breadcrumbs file associated with minidump file - "
            java.lang.String r14 = r15.concat(r14)
            com.flurry.sdk.C6792d1.m14476a((int) r1, (java.lang.String) r0, (java.lang.String) r14)
            boolean r14 = android.text.TextUtils.isEmpty(r11)
            r15 = 5
            java.lang.String r6 = "\\."
            if (r14 == 0) goto L_0x00bb
        L_0x00b9:
            r13 = r5
            goto L_0x00c6
        L_0x00bb:
            java.lang.String[] r14 = r11.split(r6)
            int r13 = r14.length
            if (r13 == r15) goto L_0x00c3
            goto L_0x00b9
        L_0x00c3:
            r13 = 3
            r13 = r14[r13]
        L_0x00c6:
            boolean r14 = android.text.TextUtils.isEmpty(r11)
            if (r14 == 0) goto L_0x00ce
        L_0x00cc:
            r6 = r5
            goto L_0x00d8
        L_0x00ce:
            java.lang.String[] r6 = r11.split(r6)
            int r14 = r6.length
            if (r14 == r15) goto L_0x00d6
            goto L_0x00cc
        L_0x00d6:
            r6 = r6[r1]
        L_0x00d8:
            boolean r14 = android.text.TextUtils.isEmpty(r13)
            if (r14 == 0) goto L_0x00ec
            java.lang.String r12 = java.lang.String.valueOf(r11)
            java.lang.String r14 = "There is no session id specified with crash breadcrumbs file: "
            java.lang.String r12 = r14.concat(r12)
            com.flurry.sdk.C6792d1.m14476a((int) r1, (java.lang.String) r0, (java.lang.String) r12)
            r12 = 1
        L_0x00ec:
            long r14 = java.lang.System.currentTimeMillis()
            java.lang.Long.parseLong(r13)     // Catch:{ NumberFormatException -> 0x00fa }
            long r14 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x00fa }
            r19 = r14
            goto L_0x010a
        L_0x00fa:
            java.lang.String r6 = java.lang.String.valueOf(r13)
            java.lang.String r12 = "Issue parsing session id into start time: "
            java.lang.String r6 = r12.concat(r6)
            com.flurry.sdk.C6792d1.m14476a((int) r1, (java.lang.String) r0, (java.lang.String) r6)
            r19 = r14
            r12 = 1
        L_0x010a:
            java.io.File r6 = new java.io.File
            r6.<init>(r2, r11)
            boolean r11 = r6.exists()
            if (r11 == 0) goto L_0x013a
            com.flurry.sdk.n7 r11 = new com.flurry.sdk.n7
            r11.<init>(r6)
            java.util.List r11 = r11.mo23665a()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Number of crash breadcrumbs - "
            r13.<init>(r14)
            int r14 = r11.size()
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            com.flurry.sdk.C6792d1.m14476a((int) r1, (java.lang.String) r0, (java.lang.String) r13)
            r6.delete()
            r29 = r11
            r13 = r12
            goto L_0x0142
        L_0x013a:
            java.lang.String r6 = "Breadcrumbs file does not exist."
            com.flurry.sdk.C6792d1.m14476a((int) r1, (java.lang.String) r0, (java.lang.String) r6)
            r29 = r5
            r13 = 1
        L_0x0142:
            com.flurry.sdk.p7 r6 = com.flurry.sdk.C6978p7.NATIVE_CRASH
            java.lang.String r6 = r6.f13116f
            java.io.File r11 = new java.io.File
            r11.<init>(r2, r10)
            boolean r10 = r11.exists()
            if (r10 == 0) goto L_0x01a8
            if (r13 == 0) goto L_0x015c
            java.lang.String r6 = "Some error occurred with minidump file. Deleting it."
            com.flurry.sdk.C6792d1.m14476a((int) r1, (java.lang.String) r0, (java.lang.String) r6)
            r11.delete()
            goto L_0x01ad
        L_0x015c:
            java.lang.String r30 = com.flurry.sdk.C6749b2.m14394c(r11)
            r11.delete()
            java.lang.String r31 = m15007g()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Logcat size: "
            r9.<init>(r10)
            int r10 = r31.length()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.flurry.sdk.C6792d1.m14476a((int) r1, (java.lang.String) r0, (java.lang.String) r9)
            java.util.concurrent.atomic.AtomicInteger r9 = com.flurry.sdk.C7018s3.m14896h()
            int r17 = r9.incrementAndGet()
            com.flurry.sdk.t3 r9 = new com.flurry.sdk.t3
            com.flurry.sdk.s3$a r10 = com.flurry.sdk.C7018s3.C7019a.UNRECOVERABLE_CRASH
            int r10 = r10.f13162f
            com.flurry.sdk.s3$b r11 = com.flurry.sdk.C7018s3.C7020b.NATIVE_CRASH_ATTACHED
            int r11 = r11.f13167f
            r26 = 0
            r27 = 0
            int r28 = com.flurry.sdk.C6945n7.m14745b()
            java.lang.String r21 = ""
            java.lang.String r22 = ""
            java.lang.String r23 = ""
            r16 = r9
            r18 = r6
            r24 = r10
            r25 = r11
            r16.<init>(r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x01ad
        L_0x01a8:
            java.lang.String r6 = "Minidump file doesn't exist."
            com.flurry.sdk.C6792d1.m14476a((int) r1, (java.lang.String) r0, (java.lang.String) r6)
        L_0x01ad:
            int r8 = r8 + 1
            r6 = 0
            goto L_0x0051
        L_0x01b2:
            java.lang.String r2 = "Finished getting native crash entity."
            com.flurry.sdk.C6792d1.m14476a((int) r1, (java.lang.String) r0, (java.lang.String) r2)
            return r9
        L_0x01b8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C7067w2.m15006f():com.flurry.sdk.t3");
    }

    /* renamed from: g */
    private static String m15007g() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("logcat -d").getInputStream()));
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null || i >= 1000 || sb.length() + readLine.length() > 524288) {
                    C6792d1.m14476a(4, "FileWriterModule", "Get Logcat lines: ".concat(String.valueOf(i)));
                } else {
                    sb.append(readLine);
                    sb.append("\n");
                    i++;
                }
            }
            C6792d1.m14476a(4, "FileWriterModule", "Get Logcat lines: ".concat(String.valueOf(i)));
            return sb.toString();
        } catch (IOException unused) {
            return "";
        }
    }

    /* renamed from: b */
    public final C7079x2.C7080a mo23534b(C7044u6 u6Var) {
        C6926m3 m3Var = new C6926m3();
        if (m3Var.mo23652a(C6988q2.m14844c(), "crashFile")) {
            m3Var.mo23650a(u6Var);
            m3Var.mo23570a();
        } else {
            C6792d1.m14476a(4, "FileWriterModule", "Can't create crash file. Cannot write crash frame to disc");
        }
        return C7079x2.C7080a.QUEUED;
    }

    /* renamed from: d */
    public final void mo23557d() {
        C6988q2.m14840a();
        File file = new File(C6988q2.m14844c());
        if (!file.exists()) {
            file.mkdirs();
        }
        C6988q2.m14840a();
        File file2 = new File(C6988q2.m14842b());
        if (!file2.exists()) {
            file2.mkdirs();
        }
        C7028t3 f = m15006f();
        C7018s3 a = f != null ? C7018s3.m14893a(f) : null;
        if (C6988q2.m14843b(C6988q2.m14844c() + File.separator + "currentFile")) {
            if (C6988q2.m14843b(C6988q2.m14844c() + File.separator + "crashFile")) {
                C7073w6 w6Var = new C7073w6(C6988q2.m14844c(), "currentFile");
                C7073w6 w6Var2 = new C7073w6(C6988q2.m14844c(), "crashFile");
                if (C7004r2.m14872a(w6Var, w6Var2)) {
                    if (C7004r2.m14873a(w6Var.f13336a, w6Var.f13337b, w6Var2.f13336a, w6Var2.f13337b) && C7084x6.m15028b(w6Var, w6Var2)) {
                        C7084x6.m15025a(w6Var2);
                    }
                }
                C7084x6.m15025a(w6Var2);
            }
            this.f13314r.mo23653b();
        }
        if (m15005a("currentFile")) {
            this.f13314r.mo23651a((C7044u6) C7030t5.m14908h(), (C6972p3.C6973a) null);
            if (a != null) {
                this.f13314r.mo23650a(a);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m15005a(String str) {
        if (this.f13314r.mo23654c()) {
            C6792d1.m14476a(6, "FileWriterModule", "File was open, closing now.");
            this.f13314r.mo23570a();
        }
        return this.f13314r.mo23652a(C6988q2.m14844c(), str);
    }

    /* renamed from: a */
    public final void mo23533a(C7044u6 u6Var) {
        if (this.f12599o == C6767c3.C6772c.f12608h) {
            this.f12600p.add(u6Var);
            C6792d1.m14476a(4, "FileWriterModule", "In paused state, cannot process message now. " + u6Var.mo23538a());
            return;
        }
        mo23563c(new C7068a(u6Var));
    }
}
