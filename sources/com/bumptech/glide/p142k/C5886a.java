package com.bumptech.glide.p142k;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.cache.DiskLruCache;

/* renamed from: com.bumptech.glide.k.a */
/* compiled from: DiskLruCache */
public final class C5886a implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final File f10685f;

    /* renamed from: g */
    private final File f10686g;

    /* renamed from: h */
    private final File f10687h;

    /* renamed from: i */
    private final File f10688i;

    /* renamed from: j */
    private final int f10689j;

    /* renamed from: k */
    private long f10690k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final int f10691l;

    /* renamed from: m */
    private long f10692m = 0;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Writer f10693n;

    /* renamed from: o */
    private final LinkedHashMap<String, C5890d> f10694o = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f10695p;

    /* renamed from: q */
    private long f10696q = 0;

    /* renamed from: r */
    final ThreadPoolExecutor f10697r = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C5888b((C5887a) null));

    /* renamed from: s */
    private final Callable<Void> f10698s = new C5887a();

    /* renamed from: com.bumptech.glide.k.a$a */
    /* compiled from: DiskLruCache */
    class C5887a implements Callable<Void> {
        C5887a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() throws java.lang.Exception {
            /*
                r4 = this;
                com.bumptech.glide.k.a r0 = com.bumptech.glide.p142k.C5886a.this
                monitor-enter(r0)
                com.bumptech.glide.k.a r1 = com.bumptech.glide.p142k.C5886a.this     // Catch:{ all -> 0x0028 }
                java.io.Writer r1 = r1.f10693n     // Catch:{ all -> 0x0028 }
                r2 = 0
                if (r1 != 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x000e:
                com.bumptech.glide.k.a r1 = com.bumptech.glide.p142k.C5886a.this     // Catch:{ all -> 0x0028 }
                r1.m11581o()     // Catch:{ all -> 0x0028 }
                com.bumptech.glide.k.a r1 = com.bumptech.glide.p142k.C5886a.this     // Catch:{ all -> 0x0028 }
                boolean r1 = r1.m11574d()     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0026
                com.bumptech.glide.k.a r1 = com.bumptech.glide.p142k.C5886a.this     // Catch:{ all -> 0x0028 }
                r1.m11580m()     // Catch:{ all -> 0x0028 }
                com.bumptech.glide.k.a r1 = com.bumptech.glide.p142k.C5886a.this     // Catch:{ all -> 0x0028 }
                r3 = 0
                int unused = r1.f10695p = r3     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p142k.C5886a.C5887a.call():java.lang.Void");
        }
    }

    /* renamed from: com.bumptech.glide.k.a$b */
    /* compiled from: DiskLruCache */
    private static final class C5888b implements ThreadFactory {
        private C5888b() {
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ C5888b(C5887a aVar) {
            this();
        }
    }

    /* renamed from: com.bumptech.glide.k.a$c */
    /* compiled from: DiskLruCache */
    public final class C5889c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C5890d f10700a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean[] f10701b;

        /* renamed from: c */
        private boolean f10702c;

        /* synthetic */ C5889c(C5886a aVar, C5890d dVar, C5887a aVar2) {
            this(dVar);
        }

        /* renamed from: c */
        public void mo20030c() throws IOException {
            C5886a.this.m11566a(this, true);
            this.f10702c = true;
        }

        private C5889c(C5890d dVar) {
            this.f10700a = dVar;
            this.f10701b = dVar.f10708e ? null : new boolean[C5886a.this.f10691l];
        }

        /* renamed from: a */
        public File mo20027a(int i) throws IOException {
            File b;
            synchronized (C5886a.this) {
                if (this.f10700a.f10709f == this) {
                    if (!this.f10700a.f10708e) {
                        this.f10701b[i] = true;
                    }
                    b = this.f10700a.mo20033b(i);
                    if (!C5886a.this.f10685f.exists()) {
                        C5886a.this.f10685f.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return b;
        }

        /* renamed from: b */
        public void mo20029b() {
            if (!this.f10702c) {
                try {
                    mo20028a();
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: a */
        public void mo20028a() throws IOException {
            C5886a.this.m11566a(this, false);
        }
    }

    /* renamed from: com.bumptech.glide.k.a$d */
    /* compiled from: DiskLruCache */
    private final class C5890d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f10704a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long[] f10705b;

        /* renamed from: c */
        File[] f10706c;

        /* renamed from: d */
        File[] f10707d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f10708e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C5889c f10709f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public long f10710g;

        /* synthetic */ C5890d(C5886a aVar, String str, C5887a aVar2) {
            this(str);
        }

        private C5890d(String str) {
            this.f10704a = str;
            this.f10705b = new long[C5886a.this.f10691l];
            this.f10706c = new File[C5886a.this.f10691l];
            this.f10707d = new File[C5886a.this.f10691l];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < C5886a.this.f10691l; i++) {
                sb.append(i);
                this.f10706c[i] = new File(C5886a.this.f10685f, sb.toString());
                sb.append(".tmp");
                this.f10707d[i] = new File(C5886a.this.f10685f, sb.toString());
                sb.setLength(length);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m11599b(String[] strArr) throws IOException {
            if (strArr.length == C5886a.this.f10691l) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f10705b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        m11594a(strArr);
                        throw null;
                    }
                }
                return;
            }
            m11594a(strArr);
            throw null;
        }

        /* renamed from: a */
        public String mo20032a() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f10705b) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }

        /* renamed from: b */
        public File mo20033b(int i) {
            return this.f10707d[i];
        }

        /* renamed from: a */
        private IOException m11594a(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: a */
        public File mo20031a(int i) {
            return this.f10706c[i];
        }
    }

    /* renamed from: com.bumptech.glide.k.a$e */
    /* compiled from: DiskLruCache */
    public final class C5891e {

        /* renamed from: a */
        private final File[] f10712a;

        /* synthetic */ C5891e(C5886a aVar, String str, long j, File[] fileArr, long[] jArr, C5887a aVar2) {
            this(str, j, fileArr, jArr);
        }

        /* renamed from: a */
        public File mo20034a(int i) {
            return this.f10712a[i];
        }

        private C5891e(String str, long j, File[] fileArr, long[] jArr) {
            this.f10712a = fileArr;
        }
    }

    private C5886a(File file, int i, int i2, long j) {
        File file2 = file;
        this.f10685f = file2;
        this.f10689j = i;
        this.f10686g = new File(file2, DiskLruCache.JOURNAL_FILE);
        this.f10687h = new File(file2, DiskLruCache.JOURNAL_FILE_TEMP);
        this.f10688i = new File(file2, DiskLruCache.JOURNAL_FILE_BACKUP);
        this.f10691l = i2;
        this.f10690k = j;
    }

    /* renamed from: i */
    private void m11578i() throws IOException {
        m11568a(this.f10687h);
        Iterator<C5890d> it = this.f10694o.values().iterator();
        while (it.hasNext()) {
            C5890d next = it.next();
            int i = 0;
            if (next.f10709f == null) {
                while (i < this.f10691l) {
                    this.f10692m += next.f10705b[i];
                    i++;
                }
            } else {
                C5889c unused = next.f10709f = null;
                while (i < this.f10691l) {
                    m11568a(next.mo20031a(i));
                    m11568a(next.mo20033b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f10695p = r0 - r9.f10694o.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r1.mo20035a() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        m11580m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r9.f10693n = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f10686g, true), com.bumptech.glide.p142k.C5894c.f10720a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x008c=Splitter:B:23:0x008c, B:16:0x005f=Splitter:B:16:0x005f} */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11579l() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            com.bumptech.glide.k.b r1 = new com.bumptech.glide.k.b
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f10686g
            r2.<init>(r3)
            java.nio.charset.Charset r3 = com.bumptech.glide.p142k.C5894c.f10720a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.mo20036b()     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = r1.mo20036b()     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r1.mo20036b()     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r1.mo20036b()     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r1.mo20036b()     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            int r7 = r9.f10689j     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00ba }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            int r4 = r9.f10691l     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00ba }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.mo20036b()     // Catch:{ EOFException -> 0x005f }
            r9.m11577f((java.lang.String) r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.k.a$d> r2 = r9.f10694o     // Catch:{ all -> 0x00ba }
            int r2 = r2.size()     // Catch:{ all -> 0x00ba }
            int r0 = r0 - r2
            r9.f10695p = r0     // Catch:{ all -> 0x00ba }
            boolean r0 = r1.mo20035a()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0072
            r9.m11580m()     // Catch:{ all -> 0x00ba }
            goto L_0x0088
        L_0x0072:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ba }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ba }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ba }
            java.io.File r4 = r9.f10686g     // Catch:{ all -> 0x00ba }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00ba }
            java.nio.charset.Charset r4 = com.bumptech.glide.p142k.C5894c.f10720a     // Catch:{ all -> 0x00ba }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00ba }
            r0.<init>(r2)     // Catch:{ all -> 0x00ba }
            r9.f10693n = r0     // Catch:{ all -> 0x00ba }
        L_0x0088:
            com.bumptech.glide.p142k.C5894c.m11611a((java.io.Closeable) r1)
            return
        L_0x008c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00ba }
            r7.append(r2)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r3)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r5)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00ba }
            r4.<init>(r0)     // Catch:{ all -> 0x00ba }
            throw r4     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            com.bumptech.glide.p142k.C5894c.m11611a((java.io.Closeable) r1)
            goto L_0x00c0
        L_0x00bf:
            throw r0
        L_0x00c0:
            goto L_0x00bf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p142k.C5886a.m11579l():void");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: m */
    public synchronized void m11580m() throws IOException {
        if (this.f10693n != null) {
            this.f10693n.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f10687h), C5894c.f10720a));
        try {
            bufferedWriter.write(DiskLruCache.MAGIC);
            bufferedWriter.write("\n");
            bufferedWriter.write(DiskLruCache.VERSION_1);
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f10689j));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f10691l));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C5890d next : this.f10694o.values()) {
                if (next.f10709f != null) {
                    bufferedWriter.write("DIRTY " + next.f10704a + 10);
                } else {
                    bufferedWriter.write("CLEAN " + next.f10704a + next.mo20032a() + 10);
                }
            }
            bufferedWriter.close();
            if (this.f10686g.exists()) {
                m11569a(this.f10686g, this.f10688i, true);
            }
            m11569a(this.f10687h, this.f10686g, false);
            this.f10688i.delete();
            this.f10693n = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f10686g, true), C5894c.f10720a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m11581o() throws IOException {
        while (this.f10692m > this.f10690k) {
            mo20024e((String) this.f10694o.entrySet().iterator().next().getKey());
        }
    }

    public synchronized void close() throws IOException {
        if (this.f10693n != null) {
            Iterator it = new ArrayList(this.f10694o.values()).iterator();
            while (it.hasNext()) {
                C5890d dVar = (C5890d) it.next();
                if (dVar.f10709f != null) {
                    dVar.f10709f.mo20028a();
                }
            }
            m11581o();
            this.f10693n.close();
            this.f10693n = null;
        }
    }

    /* renamed from: b */
    private void m11571b() {
        if (this.f10693n == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: f */
    private void m11577f(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith(DiskLruCache.REMOVE)) {
                    this.f10694o.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C5890d dVar = this.f10694o.get(str2);
            if (dVar == null) {
                dVar = new C5890d(this, str2, (C5887a) null);
                this.f10694o.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith(DiskLruCache.CLEAN)) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                boolean unused = dVar.f10708e = true;
                C5889c unused2 = dVar.f10709f = null;
                dVar.m11599b(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith(DiskLruCache.DIRTY)) {
                C5889c unused3 = dVar.f10709f = new C5889c(this, dVar, (C5887a) null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith(DiskLruCache.READ)) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* renamed from: d */
    public synchronized C5891e mo20023d(String str) throws IOException {
        m11571b();
        C5890d dVar = this.f10694o.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f10708e) {
            return null;
        }
        for (File exists : dVar.f10706c) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.f10695p++;
        this.f10693n.append(DiskLruCache.READ);
        this.f10693n.append(' ');
        this.f10693n.append(str);
        this.f10693n.append(10);
        if (m11574d()) {
            this.f10697r.submit(this.f10698s);
        }
        return new C5891e(this, str, dVar.f10710g, dVar.f10706c, dVar.f10705b, (C5887a) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        return false;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo20024e(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.m11571b()     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.k.a$d> r0 = r7.f10694o     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008f }
            com.bumptech.glide.k.a$d r0 = (com.bumptech.glide.p142k.C5886a.C5890d) r0     // Catch:{ all -> 0x008f }
            r1 = 0
            if (r0 == 0) goto L_0x008d
            com.bumptech.glide.k.a$c r2 = r0.f10709f     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x0017
            goto L_0x008d
        L_0x0017:
            int r2 = r7.f10691l     // Catch:{ all -> 0x008f }
            if (r1 >= r2) goto L_0x0059
            java.io.File r2 = r0.mo20031a((int) r1)     // Catch:{ all -> 0x008f }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002c
            goto L_0x0043
        L_0x002c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r0.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x008f }
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008f }
            r8.<init>(r0)     // Catch:{ all -> 0x008f }
            throw r8     // Catch:{ all -> 0x008f }
        L_0x0043:
            long r2 = r7.f10692m     // Catch:{ all -> 0x008f }
            long[] r4 = r0.f10705b     // Catch:{ all -> 0x008f }
            r5 = r4[r1]     // Catch:{ all -> 0x008f }
            long r2 = r2 - r5
            r7.f10692m = r2     // Catch:{ all -> 0x008f }
            long[] r2 = r0.f10705b     // Catch:{ all -> 0x008f }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x008f }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0059:
            int r0 = r7.f10695p     // Catch:{ all -> 0x008f }
            r1 = 1
            int r0 = r0 + r1
            r7.f10695p = r0     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f10693n     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "REMOVE"
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f10693n     // Catch:{ all -> 0x008f }
            r2 = 32
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f10693n     // Catch:{ all -> 0x008f }
            r0.append(r8)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f10693n     // Catch:{ all -> 0x008f }
            r2 = 10
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.k.a$d> r0 = r7.f10694o     // Catch:{ all -> 0x008f }
            r0.remove(r8)     // Catch:{ all -> 0x008f }
            boolean r8 = r7.m11574d()     // Catch:{ all -> 0x008f }
            if (r8 == 0) goto L_0x008b
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f10697r     // Catch:{ all -> 0x008f }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f10698s     // Catch:{ all -> 0x008f }
            r8.submit(r0)     // Catch:{ all -> 0x008f }
        L_0x008b:
            monitor-exit(r7)
            return r1
        L_0x008d:
            monitor-exit(r7)
            return r1
        L_0x008f:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x0093
        L_0x0092:
            throw r8
        L_0x0093:
            goto L_0x0092
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p142k.C5886a.mo20024e(java.lang.String):boolean");
    }

    /* renamed from: a */
    public static C5886a m11564a(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, DiskLruCache.JOURNAL_FILE_BACKUP);
            if (file2.exists()) {
                File file3 = new File(file, DiskLruCache.JOURNAL_FILE);
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m11569a(file2, file3, false);
                }
            }
            C5886a aVar = new C5886a(file, i, i2, j);
            if (aVar.f10686g.exists()) {
                try {
                    aVar.m11579l();
                    aVar.m11578i();
                    return aVar;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    aVar.mo20021a();
                }
            }
            file.mkdirs();
            C5886a aVar2 = new C5886a(file, i, i2, j);
            aVar2.m11580m();
            return aVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m11574d() {
        int i = this.f10695p;
        return i >= 2000 && i >= this.f10694o.size();
    }

    /* renamed from: a */
    private static void m11568a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    private static void m11569a(File file, File file2, boolean z) throws IOException {
        if (z) {
            m11568a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    public C5889c mo20020a(String str) throws IOException {
        return m11563a(str, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.bumptech.glide.p142k.C5886a.C5889c m11563a(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.m11571b()     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.k.a$d> r0 = r5.f10694o     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x005d }
            com.bumptech.glide.k.a$d r0 = (com.bumptech.glide.p142k.C5886a.C5890d) r0     // Catch:{ all -> 0x005d }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
            if (r0 == 0) goto L_0x001d
            long r1 = r0.f10710g     // Catch:{ all -> 0x005d }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
        L_0x001d:
            monitor-exit(r5)
            return r3
        L_0x001f:
            if (r0 != 0) goto L_0x002c
            com.bumptech.glide.k.a$d r0 = new com.bumptech.glide.k.a$d     // Catch:{ all -> 0x005d }
            r0.<init>(r5, r6, r3)     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.k.a$d> r7 = r5.f10694o     // Catch:{ all -> 0x005d }
            r7.put(r6, r0)     // Catch:{ all -> 0x005d }
            goto L_0x0034
        L_0x002c:
            com.bumptech.glide.k.a$c r7 = r0.f10709f     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x0034
            monitor-exit(r5)
            return r3
        L_0x0034:
            com.bumptech.glide.k.a$c r7 = new com.bumptech.glide.k.a$c     // Catch:{ all -> 0x005d }
            r7.<init>(r5, r0, r3)     // Catch:{ all -> 0x005d }
            com.bumptech.glide.p142k.C5886a.C5889c unused = r0.f10709f = r7     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f10693n     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "DIRTY"
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f10693n     // Catch:{ all -> 0x005d }
            r0 = 32
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f10693n     // Catch:{ all -> 0x005d }
            r8.append(r6)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f10693n     // Catch:{ all -> 0x005d }
            r8 = 10
            r6.append(r8)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f10693n     // Catch:{ all -> 0x005d }
            r6.flush()     // Catch:{ all -> 0x005d }
            monitor-exit(r5)
            return r7
        L_0x005d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p142k.C5886a.m11563a(java.lang.String, long):com.bumptech.glide.k.a$c");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0107, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m11566a(com.bumptech.glide.p142k.C5886a.C5889c r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            com.bumptech.glide.k.a$d r0 = r10.f10700a     // Catch:{ all -> 0x010e }
            com.bumptech.glide.k.a$c r1 = r0.f10709f     // Catch:{ all -> 0x010e }
            if (r1 != r10) goto L_0x0108
            r1 = 0
            if (r11 == 0) goto L_0x004d
            boolean r2 = r0.f10708e     // Catch:{ all -> 0x010e }
            if (r2 != 0) goto L_0x004d
            r2 = 0
        L_0x0015:
            int r3 = r9.f10691l     // Catch:{ all -> 0x010e }
            if (r2 >= r3) goto L_0x004d
            boolean[] r3 = r10.f10701b     // Catch:{ all -> 0x010e }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x010e }
            if (r3 == 0) goto L_0x0033
            java.io.File r3 = r0.mo20033b((int) r2)     // Catch:{ all -> 0x010e }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x010e }
            if (r3 != 0) goto L_0x0030
            r10.mo20028a()     // Catch:{ all -> 0x010e }
            monitor-exit(r9)
            return
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0033:
            r10.mo20028a()     // Catch:{ all -> 0x010e }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x010e }
            r11.<init>()     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x010e }
            r11.append(r2)     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x010e }
            r10.<init>(r11)     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x004d:
            int r10 = r9.f10691l     // Catch:{ all -> 0x010e }
            if (r1 >= r10) goto L_0x0081
            java.io.File r10 = r0.mo20033b((int) r1)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x007b
            boolean r2 = r10.exists()     // Catch:{ all -> 0x010e }
            if (r2 == 0) goto L_0x007e
            java.io.File r2 = r0.mo20031a((int) r1)     // Catch:{ all -> 0x010e }
            r10.renameTo(r2)     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f10705b     // Catch:{ all -> 0x010e }
            r3 = r10[r1]     // Catch:{ all -> 0x010e }
            long r5 = r2.length()     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f10705b     // Catch:{ all -> 0x010e }
            r10[r1] = r5     // Catch:{ all -> 0x010e }
            long r7 = r9.f10692m     // Catch:{ all -> 0x010e }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f10692m = r7     // Catch:{ all -> 0x010e }
            goto L_0x007e
        L_0x007b:
            m11568a((java.io.File) r10)     // Catch:{ all -> 0x010e }
        L_0x007e:
            int r1 = r1 + 1
            goto L_0x004d
        L_0x0081:
            int r10 = r9.f10695p     // Catch:{ all -> 0x010e }
            r1 = 1
            int r10 = r10 + r1
            r9.f10695p = r10     // Catch:{ all -> 0x010e }
            r10 = 0
            com.bumptech.glide.p142k.C5886a.C5889c unused = r0.f10709f = r10     // Catch:{ all -> 0x010e }
            boolean r10 = r0.f10708e     // Catch:{ all -> 0x010e }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00c9
            boolean unused = r0.f10708e = r1     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f10693n     // Catch:{ all -> 0x010e }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f10693n     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f10693n     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.f10704a     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f10693n     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.mo20032a()     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f10693n     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x00ec
            long r10 = r9.f10696q     // Catch:{ all -> 0x010e }
            r1 = 1
            long r1 = r1 + r10
            r9.f10696q = r1     // Catch:{ all -> 0x010e }
            long unused = r0.f10710g = r10     // Catch:{ all -> 0x010e }
            goto L_0x00ec
        L_0x00c9:
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.k.a$d> r10 = r9.f10694o     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f10704a     // Catch:{ all -> 0x010e }
            r10.remove(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f10693n     // Catch:{ all -> 0x010e }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f10693n     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f10693n     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f10704a     // Catch:{ all -> 0x010e }
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f10693n     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
        L_0x00ec:
            java.io.Writer r10 = r9.f10693n     // Catch:{ all -> 0x010e }
            r10.flush()     // Catch:{ all -> 0x010e }
            long r10 = r9.f10692m     // Catch:{ all -> 0x010e }
            long r0 = r9.f10690k     // Catch:{ all -> 0x010e }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ff
            boolean r10 = r9.m11574d()     // Catch:{ all -> 0x010e }
            if (r10 == 0) goto L_0x0106
        L_0x00ff:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f10697r     // Catch:{ all -> 0x010e }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f10698s     // Catch:{ all -> 0x010e }
            r10.submit(r11)     // Catch:{ all -> 0x010e }
        L_0x0106:
            monitor-exit(r9)
            return
        L_0x0108:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            r10.<init>()     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x010e:
            r10 = move-exception
            monitor-exit(r9)
            goto L_0x0112
        L_0x0111:
            throw r10
        L_0x0112:
            goto L_0x0111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p142k.C5886a.m11566a(com.bumptech.glide.k.a$c, boolean):void");
    }

    /* renamed from: a */
    public void mo20021a() throws IOException {
        close();
        C5894c.m11612a(this.f10685f);
    }
}
