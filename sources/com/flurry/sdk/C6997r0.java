package com.flurry.sdk;

import com.flurry.sdk.C7012s0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.flurry.sdk.r0 */
public final class C6997r0 {

    /* renamed from: c */
    public static final Integer f13145c = 50;

    /* renamed from: a */
    String f13146a;

    /* renamed from: b */
    LinkedHashMap<String, List<String>> f13147b = new LinkedHashMap<>();

    /* renamed from: com.flurry.sdk.r0$a */
    class C6998a implements C7089y1<List<C7012s0>> {
        C6998a(C6997r0 r0Var) {
        }

        /* renamed from: a */
        public final C7048v1<List<C7012s0>> mo23619a(int i) {
            return new C7036u1(new C7012s0.C7013a());
        }
    }

    /* renamed from: com.flurry.sdk.r0$b */
    class C6999b implements C7089y1<List<C7012s0>> {
        C6999b(C6997r0 r0Var) {
        }

        /* renamed from: a */
        public final C7048v1<List<C7012s0>> mo23619a(int i) {
            return new C7036u1(new C7012s0.C7013a());
        }
    }

    /* renamed from: com.flurry.sdk.r0$c */
    class C7000c implements C7089y1<List<C7012s0>> {
        C7000c(C6997r0 r0Var) {
        }

        /* renamed from: a */
        public final C7048v1<List<C7012s0>> mo23619a(int i) {
            return new C7036u1(new C7012s0.C7013a());
        }
    }

    /* renamed from: com.flurry.sdk.r0$d */
    class C7001d implements C7089y1<List<C7012s0>> {
        C7001d(C6997r0 r0Var) {
        }

        /* renamed from: a */
        public final C7048v1<List<C7012s0>> mo23619a(int i) {
            return new C7036u1(new C7012s0.C7013a());
        }
    }

    /* renamed from: com.flurry.sdk.r0$e */
    class C7002e implements C7089y1<List<C7012s0>> {
        C7002e(C6997r0 r0Var) {
        }

        /* renamed from: a */
        public final C7048v1<List<C7012s0>> mo23619a(int i) {
            return new C7036u1(new C7012s0.C7013a());
        }
    }

    public C6997r0(String str) {
        this.f13146a = str + "Main";
    }

    /* renamed from: e */
    static void m14854e(String str) {
        C6766c2.m14418a();
        C6792d1.m14476a(5, "FlurryDataSenderIndex", "Deleting Index File for " + str + " file name:" + C6747b0.m14386a().getFileStreamPath(".FlurrySenderIndex.info.".concat(String.valueOf(str))));
        File fileStreamPath = C6747b0.m14386a().getFileStreamPath(".FlurrySenderIndex.info.".concat(String.valueOf(str)));
        if (fileStreamPath.exists()) {
            boolean delete = fileStreamPath.delete();
            C6792d1.m14476a(5, "FlurryDataSenderIndex", "Found file for " + str + ". Deleted - " + delete);
        }
    }

    /* renamed from: f */
    static String m14855f(String str) {
        return ".YFlurrySenderIndex.info.".concat(String.valueOf(str));
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.io.DataInputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m14856g(java.lang.String r7) {
        /*
            com.flurry.sdk.C6766c2.m14418a()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Reading block File for "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r1 = " file name:"
            r0.append(r1)
            android.content.Context r1 = com.flurry.sdk.C6747b0.m14386a()
            java.lang.String r2 = java.lang.String.valueOf(r7)
            java.lang.String r3 = ".flurrydatasenderblock."
            java.lang.String r2 = r3.concat(r2)
            java.io.File r1 = r1.getFileStreamPath(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 5
            java.lang.String r2 = "FlurryDataSenderIndex"
            com.flurry.sdk.C6792d1.m14476a((int) r1, (java.lang.String) r2, (java.lang.String) r0)
            android.content.Context r0 = com.flurry.sdk.C6747b0.m14386a()
            java.lang.String r4 = java.lang.String.valueOf(r7)
            java.lang.String r3 = r3.concat(r4)
            java.io.File r0 = r0.getFileStreamPath(r3)
            boolean r3 = r0.exists()
            r4 = 0
            if (r3 == 0) goto L_0x0095
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Reading Index File for "
            r3.<init>(r5)
            r3.append(r7)
            java.lang.String r7 = " Found file."
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            com.flurry.sdk.C6792d1.m14476a((int) r1, (java.lang.String) r2, (java.lang.String) r7)
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ all -> 0x0083 }
            r7.<init>(r0)     // Catch:{ all -> 0x0083 }
            java.io.DataInputStream r0 = new java.io.DataInputStream     // Catch:{ all -> 0x0083 }
            r0.<init>(r7)     // Catch:{ all -> 0x0083 }
            int r7 = r0.readUnsignedShort()     // Catch:{ all -> 0x007e }
            if (r7 != 0) goto L_0x0072
            com.flurry.sdk.C6766c2.m14420a((java.io.Closeable) r0)
            return r4
        L_0x0072:
            byte[] r4 = new byte[r7]     // Catch:{ all -> 0x007e }
            r0.readFully(r4)     // Catch:{ all -> 0x007e }
            r0.readUnsignedShort()     // Catch:{ all -> 0x007e }
            com.flurry.sdk.C6766c2.m14420a((java.io.Closeable) r0)
            goto L_0x009b
        L_0x007e:
            r7 = move-exception
            r6 = r4
            r4 = r0
            r0 = r6
            goto L_0x0085
        L_0x0083:
            r7 = move-exception
            r0 = r4
        L_0x0085:
            r1 = 6
            java.lang.String r3 = "Error when loading persistent file"
            com.flurry.sdk.C6792d1.m14477a(r1, r2, r3, r7)     // Catch:{ all -> 0x0090 }
            com.flurry.sdk.C6766c2.m14420a((java.io.Closeable) r4)
            r4 = r0
            goto L_0x009b
        L_0x0090:
            r7 = move-exception
            com.flurry.sdk.C6766c2.m14420a((java.io.Closeable) r4)
            throw r7
        L_0x0095:
            r7 = 4
            java.lang.String r0 = "Agent cache file doesn't exist."
            com.flurry.sdk.C6792d1.m14476a((int) r7, (java.lang.String) r2, (java.lang.String) r0)
        L_0x009b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C6997r0.m14856g(java.lang.String):byte[]");
    }

    /* renamed from: h */
    private synchronized boolean m14857h(String str) {
        boolean b;
        C6766c2.m14418a();
        C6777c7 c7Var = new C6777c7(C6747b0.m14386a().getFileStreamPath(m14855f(str)), ".YFlurrySenderIndex.info.", 1, new C7002e(this));
        List<String> d = mo23709d(str);
        if (d != null && !d.isEmpty()) {
            C6792d1.m14476a(4, "FlurryDataSenderIndex", "discardOutdatedBlocksForDataKey: notSentBlocks = " + d.size());
            for (String next : d) {
                C6980q0.m14829b(next).mo23569b();
                C6792d1.m14476a(4, "FlurryDataSenderIndex", "discardOutdatedBlocksForDataKey: removed block = ".concat(String.valueOf(next)));
            }
        }
        this.f13147b.remove(str);
        b = c7Var.mo23569b();
        m14853b();
        return b;
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List<java.lang.String>] */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.util.List<java.lang.String>] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<java.lang.String> mo23704a(java.lang.String r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            com.flurry.sdk.C6766c2.m14418a()     // Catch:{ all -> 0x00da }
            java.lang.String r0 = "FlurryDataSenderIndex"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00da }
            java.lang.String r2 = "Reading Index File for "
            r1.<init>(r2)     // Catch:{ all -> 0x00da }
            r1.append(r9)     // Catch:{ all -> 0x00da }
            java.lang.String r2 = " file name:"
            r1.append(r2)     // Catch:{ all -> 0x00da }
            android.content.Context r2 = com.flurry.sdk.C6747b0.m14386a()     // Catch:{ all -> 0x00da }
            java.lang.String r3 = ".FlurrySenderIndex.info."
            java.lang.String r4 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00da }
            java.lang.String r3 = r3.concat(r4)     // Catch:{ all -> 0x00da }
            java.io.File r2 = r2.getFileStreamPath(r3)     // Catch:{ all -> 0x00da }
            r1.append(r2)     // Catch:{ all -> 0x00da }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00da }
            r2 = 5
            com.flurry.sdk.C6792d1.m14476a((int) r2, (java.lang.String) r0, (java.lang.String) r1)     // Catch:{ all -> 0x00da }
            android.content.Context r0 = com.flurry.sdk.C6747b0.m14386a()     // Catch:{ all -> 0x00da }
            java.lang.String r1 = ".FlurrySenderIndex.info."
            java.lang.String r3 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00da }
            java.lang.String r1 = r1.concat(r3)     // Catch:{ all -> 0x00da }
            java.io.File r0 = r0.getFileStreamPath(r1)     // Catch:{ all -> 0x00da }
            boolean r1 = r0.exists()     // Catch:{ all -> 0x00da }
            r3 = 0
            if (r1 == 0) goto L_0x00d1
            java.lang.String r1 = "FlurryDataSenderIndex"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00da }
            java.lang.String r5 = "Reading Index File for "
            r4.<init>(r5)     // Catch:{ all -> 0x00da }
            r4.append(r9)     // Catch:{ all -> 0x00da }
            java.lang.String r9 = " Found file."
            r4.append(r9)     // Catch:{ all -> 0x00da }
            java.lang.String r9 = r4.toString()     // Catch:{ all -> 0x00da }
            com.flurry.sdk.C6792d1.m14476a((int) r2, (java.lang.String) r1, (java.lang.String) r9)     // Catch:{ all -> 0x00da }
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ all -> 0x00bd }
            r9.<init>(r0)     // Catch:{ all -> 0x00bd }
            java.io.DataInputStream r0 = new java.io.DataInputStream     // Catch:{ all -> 0x00bd }
            r0.<init>(r9)     // Catch:{ all -> 0x00bd }
            int r9 = r0.readUnsignedShort()     // Catch:{ all -> 0x00b9 }
            if (r9 != 0) goto L_0x0078
            com.flurry.sdk.C6766c2.m14420a((java.io.Closeable) r0)     // Catch:{ all -> 0x00da }
            monitor-exit(r8)
            return r3
        L_0x0078:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00b9 }
            r1.<init>(r9)     // Catch:{ all -> 0x00b9 }
            r2 = 0
        L_0x007e:
            if (r2 >= r9) goto L_0x00b0
            int r3 = r0.readUnsignedShort()     // Catch:{ all -> 0x00b7 }
            r4 = 4
            java.lang.String r5 = "FlurryDataSenderIndex"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b7 }
            java.lang.String r7 = "read iter "
            r6.<init>(r7)     // Catch:{ all -> 0x00b7 }
            r6.append(r2)     // Catch:{ all -> 0x00b7 }
            java.lang.String r7 = " dataLength = "
            r6.append(r7)     // Catch:{ all -> 0x00b7 }
            r6.append(r3)     // Catch:{ all -> 0x00b7 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00b7 }
            com.flurry.sdk.C6792d1.m14476a((int) r4, (java.lang.String) r5, (java.lang.String) r6)     // Catch:{ all -> 0x00b7 }
            byte[] r3 = new byte[r3]     // Catch:{ all -> 0x00b7 }
            r0.readFully(r3)     // Catch:{ all -> 0x00b7 }
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x00b7 }
            r4.<init>(r3)     // Catch:{ all -> 0x00b7 }
            r1.add(r4)     // Catch:{ all -> 0x00b7 }
            int r2 = r2 + 1
            goto L_0x007e
        L_0x00b0:
            r0.readUnsignedShort()     // Catch:{ all -> 0x00b7 }
            com.flurry.sdk.C6766c2.m14420a((java.io.Closeable) r0)     // Catch:{ all -> 0x00da }
            goto L_0x00ca
        L_0x00b7:
            r9 = move-exception
            goto L_0x00bb
        L_0x00b9:
            r9 = move-exception
            r1 = r3
        L_0x00bb:
            r3 = r0
            goto L_0x00bf
        L_0x00bd:
            r9 = move-exception
            r1 = r3
        L_0x00bf:
            r0 = 6
            java.lang.String r2 = "FlurryDataSenderIndex"
            java.lang.String r4 = "Error when loading persistent file"
            com.flurry.sdk.C6792d1.m14477a(r0, r2, r4, r9)     // Catch:{ all -> 0x00cc }
            com.flurry.sdk.C6766c2.m14420a((java.io.Closeable) r3)     // Catch:{ all -> 0x00da }
        L_0x00ca:
            r3 = r1
            goto L_0x00d8
        L_0x00cc:
            r9 = move-exception
            com.flurry.sdk.C6766c2.m14420a((java.io.Closeable) r3)     // Catch:{ all -> 0x00da }
            throw r9     // Catch:{ all -> 0x00da }
        L_0x00d1:
            java.lang.String r9 = "FlurryDataSenderIndex"
            java.lang.String r0 = "Agent cache file doesn't exist."
            com.flurry.sdk.C6792d1.m14476a((int) r2, (java.lang.String) r9, (java.lang.String) r0)     // Catch:{ all -> 0x00da }
        L_0x00d8:
            monitor-exit(r8)
            return r3
        L_0x00da:
            r9 = move-exception
            monitor-exit(r8)
            goto L_0x00de
        L_0x00dd:
            throw r9
        L_0x00de:
            goto L_0x00dd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C6997r0.mo23704a(java.lang.String):java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo23707b(String str) {
        List<String> a = mo23704a(str);
        if (a == null) {
            C6792d1.m14485c("FlurryDataSenderIndex", "No old file to replace");
            return;
        }
        for (String next : a) {
            byte[] g = m14856g(next);
            if (g == null) {
                C6792d1.m14476a(6, "FlurryDataSenderIndex", "File does not exist");
            } else {
                C6766c2.m14418a();
                C6792d1.m14476a(5, "FlurryDataSenderIndex", "Saving Block File for " + next + " file name:" + C6747b0.m14386a().getFileStreamPath(C6980q0.m14828a(next)));
                C6980q0.m14829b(next).mo23568a(new C6980q0(g));
                C6766c2.m14418a();
                C6792d1.m14476a(5, "FlurryDataSenderIndex", "Deleting  block File for " + next + " file name:" + C6747b0.m14386a().getFileStreamPath(".flurrydatasenderblock.".concat(String.valueOf(next))));
                File fileStreamPath = C6747b0.m14386a().getFileStreamPath(".flurrydatasenderblock.".concat(String.valueOf(next)));
                if (fileStreamPath.exists()) {
                    boolean delete = fileStreamPath.delete();
                    C6792d1.m14476a(5, "FlurryDataSenderIndex", "Found file for " + next + ". Deleted - " + delete);
                }
            }
        }
        m14852a(str, a, ".YFlurrySenderIndex.info.");
        m14854e(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized List<String> mo23708c(String str) {
        C6766c2.m14418a();
        C6792d1.m14476a(5, "FlurryDataSenderIndex", "Reading Index File for " + str + " file name:" + C6747b0.m14386a().getFileStreamPath(m14855f(str)));
        List<C7012s0> list = (List) new C6777c7(C6747b0.m14386a().getFileStreamPath(m14855f(str)), ".YFlurrySenderIndex.info.", 1, new C6999b(this)).mo23567a();
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (C7012s0 s0Var : list) {
            arrayList.add(s0Var.f13155a);
        }
        return arrayList;
    }

    /* renamed from: d */
    public final List<String> mo23709d(String str) {
        List list = this.f13147b.get(str);
        if (list == null) {
            return Collections.emptyList();
        }
        return new ArrayList(list);
    }

    /* renamed from: b */
    private synchronized void m14853b() {
        LinkedList linkedList = new LinkedList(this.f13147b.keySet());
        new C6777c7(C6747b0.m14386a().getFileStreamPath(m14855f(this.f13146a)), ".YFlurrySenderIndex.info.", 1, new C7001d(this)).mo23569b();
        if (!linkedList.isEmpty()) {
            m14852a(this.f13146a, linkedList, this.f13146a);
        }
    }

    /* renamed from: a */
    private synchronized void m14852a(String str, List<String> list, String str2) {
        C6766c2.m14418a();
        C6792d1.m14476a(5, "FlurryDataSenderIndex", "Saving Index File for " + str + " file name:" + C6747b0.m14386a().getFileStreamPath(m14855f(str)));
        C6777c7 c7Var = new C6777c7(C6747b0.m14386a().getFileStreamPath(m14855f(str)), str2, 1, new C7000c(this));
        ArrayList arrayList = new ArrayList();
        for (String s0Var : list) {
            arrayList.add(new C7012s0(s0Var));
        }
        c7Var.mo23568a(arrayList);
    }

    /* renamed from: a */
    public final synchronized void mo23705a(C6980q0 q0Var, String str) {
        boolean z;
        C6792d1.m14476a(4, "FlurryDataSenderIndex", "addBlockInfo".concat(String.valueOf(str)));
        String str2 = q0Var.f13120a;
        List list = this.f13147b.get(str);
        if (list == null) {
            C6792d1.m14476a(4, "FlurryDataSenderIndex", "New Data Key");
            list = new LinkedList();
            z = true;
        } else {
            z = false;
        }
        list.add(str2);
        if (list.size() > f13145c.intValue()) {
            C6980q0.m14829b((String) list.get(0)).mo23569b();
            list.remove(0);
        }
        this.f13147b.put(str, list);
        m14852a(str, list, ".YFlurrySenderIndex.info.");
        if (z) {
            m14853b();
        }
    }

    /* renamed from: a */
    public final boolean mo23706a(String str, String str2) {
        boolean z;
        List list = this.f13147b.get(str2);
        if (list != null) {
            C6980q0.m14829b(str).mo23569b();
            z = list.remove(str);
        } else {
            z = false;
        }
        if (list == null || list.isEmpty()) {
            m14857h(str2);
        } else {
            this.f13147b.put(str2, list);
            m14852a(str2, list, ".YFlurrySenderIndex.info.");
        }
        return z;
    }

    /* renamed from: a */
    public final List<String> mo23703a() {
        return new ArrayList(this.f13147b.keySet());
    }
}
