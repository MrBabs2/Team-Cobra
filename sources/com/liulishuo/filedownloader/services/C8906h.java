package com.liulishuo.filedownloader.services;

import com.liulishuo.filedownloader.model.C8895a;
import com.liulishuo.filedownloader.model.C8896b;
import java.io.File;
import java.util.List;
import p112n.p312h.p313a.C10804x;
import p112n.p312h.p313a.p318f0.C10763c;
import p112n.p312h.p313a.p318f0.C10767d;
import p112n.p312h.p313a.p318f0.C10771f;

/* renamed from: com.liulishuo.filedownloader.services.h */
/* compiled from: FileDownloadMgr */
class C8906h implements C10804x {

    /* renamed from: a */
    private final C8905g f25287a;

    /* renamed from: b */
    private final C8908j f25288b;

    /* renamed from: c */
    private final C10763c.C10766c f25289c;

    /* renamed from: d */
    private final C10763c.C10764a f25290d;

    public C8906h(C8900d dVar) {
        this.f25287a = dVar.mo32780b();
        this.f25288b = new C8908j(dVar.mo32782d());
        this.f25289c = dVar.mo32781c();
        this.f25290d = dVar.mo32779a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0079, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a0, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo32805a(java.lang.String r16, java.lang.String r17, boolean r18, int r19, int r20, int r21, boolean r22, com.liulishuo.filedownloader.model.FileDownloadHeader r23, boolean r24) {
        /*
            r15 = this;
            r13 = r15
            r0 = r16
            r1 = r17
            r2 = r18
            monitor-enter(r15)
            boolean r3 = p112n.p312h.p313a.p318f0.C10767d.f28826a     // Catch:{ all -> 0x010b }
            r4 = 2
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x0021
            java.lang.String r3 = "request start the task with url(%s) path(%s) isDirectory(%B)"
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x010b }
            r7[r5] = r0     // Catch:{ all -> 0x010b }
            r7[r6] = r1     // Catch:{ all -> 0x010b }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r18)     // Catch:{ all -> 0x010b }
            r7[r4] = r8     // Catch:{ all -> 0x010b }
            p112n.p312h.p313a.p318f0.C10767d.m36490a(r15, r3, r7)     // Catch:{ all -> 0x010b }
        L_0x0021:
            int r3 = p112n.p312h.p313a.p318f0.C10771f.m36499a((java.lang.String) r16, (java.lang.String) r17, (boolean) r18)     // Catch:{ all -> 0x010b }
            com.liulishuo.filedownloader.services.g r7 = r13.f25287a     // Catch:{ all -> 0x010b }
            com.liulishuo.filedownloader.model.a r7 = r7.mo32765a((int) r3)     // Catch:{ all -> 0x010b }
            if (r2 != 0) goto L_0x0061
            if (r7 != 0) goto L_0x0061
            java.lang.String r7 = p112n.p312h.p313a.p318f0.C10771f.m36518f(r17)     // Catch:{ all -> 0x010b }
            int r7 = p112n.p312h.p313a.p318f0.C10771f.m36499a((java.lang.String) r0, (java.lang.String) r7, (boolean) r6)     // Catch:{ all -> 0x010b }
            com.liulishuo.filedownloader.services.g r8 = r13.f25287a     // Catch:{ all -> 0x010b }
            com.liulishuo.filedownloader.model.a r8 = r8.mo32765a((int) r7)     // Catch:{ all -> 0x010b }
            if (r8 == 0) goto L_0x0060
            java.lang.String r9 = r8.mo32743h()     // Catch:{ all -> 0x010b }
            boolean r9 = r1.equals(r9)     // Catch:{ all -> 0x010b }
            if (r9 == 0) goto L_0x0060
            boolean r9 = p112n.p312h.p313a.p318f0.C10767d.f28826a     // Catch:{ all -> 0x010b }
            if (r9 == 0) goto L_0x0060
            java.lang.String r9 = "task[%d] find model by dirCaseId[%d]"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x010b }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x010b }
            r4[r5] = r10     // Catch:{ all -> 0x010b }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x010b }
            r4[r6] = r7     // Catch:{ all -> 0x010b }
            p112n.p312h.p313a.p318f0.C10767d.m36490a(r15, r9, r4)     // Catch:{ all -> 0x010b }
        L_0x0060:
            r7 = r8
        L_0x0061:
            boolean r4 = p112n.p312h.p313a.p318f0.C10763c.m36481a((int) r3, (com.liulishuo.filedownloader.model.C8895a) r7, (p112n.p312h.p313a.C10804x) r15, (boolean) r6)     // Catch:{ all -> 0x010b }
            if (r4 == 0) goto L_0x007a
            boolean r0 = p112n.p312h.p313a.p318f0.C10767d.f28826a     // Catch:{ all -> 0x010b }
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = "has already started download %d"
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ all -> 0x010b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x010b }
            r1[r5] = r2     // Catch:{ all -> 0x010b }
            p112n.p312h.p313a.p318f0.C10767d.m36490a(r15, r0, r1)     // Catch:{ all -> 0x010b }
        L_0x0078:
            monitor-exit(r15)
            return
        L_0x007a:
            if (r7 == 0) goto L_0x0081
            java.lang.String r4 = r7.mo32743h()     // Catch:{ all -> 0x010b }
            goto L_0x0086
        L_0x0081:
            r4 = 0
            java.lang.String r4 = p112n.p312h.p313a.p318f0.C10771f.m36503a((java.lang.String) r1, (boolean) r2, (java.lang.String) r4)     // Catch:{ all -> 0x010b }
        L_0x0086:
            r11 = r22
            boolean r4 = p112n.p312h.p313a.p318f0.C10763c.m36482a((int) r3, (java.lang.String) r4, (boolean) r11, (boolean) r6)     // Catch:{ all -> 0x010b }
            if (r4 == 0) goto L_0x00a1
            boolean r0 = p112n.p312h.p313a.p318f0.C10767d.f28826a     // Catch:{ all -> 0x010b }
            if (r0 == 0) goto L_0x009f
            java.lang.String r0 = "has already completed downloading %d"
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ all -> 0x010b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x010b }
            r1[r5] = r2     // Catch:{ all -> 0x010b }
            p112n.p312h.p313a.p318f0.C10767d.m36490a(r15, r0, r1)     // Catch:{ all -> 0x010b }
        L_0x009f:
            monitor-exit(r15)
            return
        L_0x00a1:
            if (r7 == 0) goto L_0x00c7
            byte r4 = r7.mo32742g()     // Catch:{ all -> 0x010b }
            r8 = -2
            if (r4 == r8) goto L_0x00b1
            byte r4 = r7.mo32742g()     // Catch:{ all -> 0x010b }
            r8 = -1
            if (r4 != r8) goto L_0x00c7
        L_0x00b1:
            int r0 = r7.mo32738d()     // Catch:{ all -> 0x010b }
            if (r0 == r3) goto L_0x00e3
            com.liulishuo.filedownloader.services.g r0 = r13.f25287a     // Catch:{ all -> 0x010b }
            int r4 = r7.mo32738d()     // Catch:{ all -> 0x010b }
            r0.remove(r4)     // Catch:{ all -> 0x010b }
            r7.mo32729a((int) r3)     // Catch:{ all -> 0x010b }
            r7.mo32732a(r1, r2)     // Catch:{ all -> 0x010b }
            goto L_0x00e2
        L_0x00c7:
            if (r7 != 0) goto L_0x00ce
            com.liulishuo.filedownloader.model.a r7 = new com.liulishuo.filedownloader.model.a     // Catch:{ all -> 0x010b }
            r7.<init>()     // Catch:{ all -> 0x010b }
        L_0x00ce:
            r7.mo32739d(r0)     // Catch:{ all -> 0x010b }
            r7.mo32732a(r1, r2)     // Catch:{ all -> 0x010b }
            r7.mo32729a((int) r3)     // Catch:{ all -> 0x010b }
            r0 = 0
            r7.mo32730a((long) r0)     // Catch:{ all -> 0x010b }
            r7.mo32734b((long) r0)     // Catch:{ all -> 0x010b }
            r7.mo32728a((byte) r6)     // Catch:{ all -> 0x010b }
        L_0x00e2:
            r5 = 1
        L_0x00e3:
            if (r5 == 0) goto L_0x00ea
            com.liulishuo.filedownloader.services.g r0 = r13.f25287a     // Catch:{ all -> 0x010b }
            r0.mo32766a((com.liulishuo.filedownloader.model.C8895a) r7)     // Catch:{ all -> 0x010b }
        L_0x00ea:
            com.liulishuo.filedownloader.services.j r0 = r13.f25288b     // Catch:{ all -> 0x010b }
            com.liulishuo.filedownloader.services.i r14 = new com.liulishuo.filedownloader.services.i     // Catch:{ all -> 0x010b }
            n.h.a.f0.c$c r3 = r13.f25289c     // Catch:{ all -> 0x010b }
            n.h.a.f0.c$a r4 = r13.f25290d     // Catch:{ all -> 0x010b }
            com.liulishuo.filedownloader.services.g r6 = r13.f25287a     // Catch:{ all -> 0x010b }
            r1 = r14
            r2 = r15
            r5 = r7
            r7 = r21
            r8 = r23
            r9 = r20
            r10 = r19
            r11 = r22
            r12 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x010b }
            r0.mo32827a((com.liulishuo.filedownloader.services.C8907i) r14)     // Catch:{ all -> 0x010b }
            monitor-exit(r15)
            return
        L_0x010b:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.services.C8906h.mo32805a(java.lang.String, java.lang.String, boolean, int, int, int, boolean, com.liulishuo.filedownloader.model.FileDownloadHeader, boolean):void");
    }

    /* renamed from: b */
    public long mo32809b(int i) {
        C8895a a = this.f25287a.mo32765a(i);
        if (a == null) {
            return 0;
        }
        return a.mo32741f();
    }

    /* renamed from: c */
    public void mo32812c() {
        List<Integer> b = this.f25288b.mo32828b();
        if (C10767d.f28826a) {
            C10767d.m36490a(this, "pause all tasks %d", Integer.valueOf(b.size()));
        }
        for (Integer intValue : b) {
            mo32815f(intValue.intValue());
        }
    }

    /* renamed from: d */
    public long mo32813d(int i) {
        C8895a a = this.f25287a.mo32765a(i);
        if (a == null) {
            return 0;
        }
        return a.mo32745j();
    }

    /* renamed from: e */
    public boolean mo32814e(int i) {
        return mo32807a(this.f25287a.mo32765a(i));
    }

    /* renamed from: f */
    public boolean mo32815f(int i) {
        if (C10767d.f28826a) {
            C10767d.m36490a(this, "request pause the task %d", Integer.valueOf(i));
        }
        if (this.f25287a.mo32765a(i) == null) {
            return false;
        }
        this.f25288b.mo32826a(i);
        return true;
    }

    /* renamed from: g */
    public synchronized boolean mo32816g(int i) {
        return this.f25288b.mo32830c(i);
    }

    /* renamed from: b */
    public boolean mo32810b() {
        return this.f25288b.mo32825a() <= 0;
    }

    /* renamed from: c */
    public byte mo32811c(int i) {
        C8895a a = this.f25287a.mo32765a(i);
        if (a == null) {
            return 0;
        }
        return a.mo32742g();
    }

    /* renamed from: a */
    public boolean mo32808a(String str, String str2) {
        return mo32814e(C10771f.m36509b(str, str2));
    }

    /* renamed from: a */
    public static boolean m29257a(int i, C8895a aVar) {
        return m29258a(i, aVar, (Boolean) null);
    }

    /* renamed from: a */
    public static boolean m29258a(int i, C8895a aVar, Boolean bool) {
        Class<C8906h> cls = C8906h.class;
        if (aVar == null) {
            if (C10767d.f28826a) {
                C10767d.m36490a(cls, "can't continue %d model == null", Integer.valueOf(i));
            }
            return false;
        } else if (aVar.mo32744i() != null) {
            return m29259a(i, aVar, aVar.mo32744i(), bool);
        } else {
            if (C10767d.f28826a) {
                C10767d.m36490a(cls, "can't continue %d temp path == null", Integer.valueOf(i));
            }
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m29259a(int i, C8895a aVar, String str, Boolean bool) {
        Class<C8906h> cls = C8906h.class;
        if (str != null) {
            File file = new File(str);
            boolean exists = file.exists();
            boolean isDirectory = file.isDirectory();
            if (exists && !isDirectory) {
                long length = file.length();
                if (aVar.mo32741f() == 0) {
                    if (C10767d.f28826a) {
                        C10767d.m36490a(cls, "can't continue %d the downloaded-record is zero.", Integer.valueOf(i));
                    }
                } else if (length < aVar.mo32741f() || (aVar.mo32745j() != -1 && (length > aVar.mo32745j() || aVar.mo32741f() >= aVar.mo32745j()))) {
                    if (C10767d.f28826a) {
                        C10767d.m36490a(cls, "can't continue %d dirty data fileLength[%d] sofar[%d] total[%d]", Integer.valueOf(i), Long.valueOf(length), Long.valueOf(aVar.mo32741f()), Long.valueOf(aVar.mo32745j()));
                    }
                } else if (bool == null || bool.booleanValue() || aVar.mo32745j() != length) {
                    return true;
                } else {
                    if (C10767d.f28826a) {
                        C10767d.m36490a(cls, "can't continue %d, because of the output stream doesn't support seek, but the task has already pre-allocated, so we only can download it from the very beginning.", Integer.valueOf(i));
                    }
                }
            } else if (C10767d.f28826a) {
                C10767d.m36490a(cls, "can't continue %d file not suit, exists[%B], directory[%B]", Integer.valueOf(i), Boolean.valueOf(exists), Boolean.valueOf(isDirectory));
            }
        } else if (C10767d.f28826a) {
            C10767d.m36490a(cls, "can't continue %d path = null", Integer.valueOf(i));
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo32807a(C8895a aVar) {
        if (aVar == null) {
            return false;
        }
        boolean b = this.f25288b.mo32829b(aVar.mo32738d());
        if (C8896b.m29177b(aVar.mo32742g())) {
            if (b) {
                return true;
            }
            return false;
        } else if (!b) {
            C10767d.m36492b(this, "%d status is[%s](not finish) & but not in the pool", Integer.valueOf(aVar.mo32738d()), Byte.valueOf(aVar.mo32742g()));
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo32806a(int i) {
        if (i == 0) {
            C10767d.m36495e(this, "The task[%d] id is invalid, can't clear it.", Integer.valueOf(i));
            return false;
        } else if (mo32814e(i)) {
            C10767d.m36495e(this, "The task[%d] is downloading, can't clear it.", Integer.valueOf(i));
            return false;
        } else {
            this.f25287a.remove(i);
            return true;
        }
    }

    /* renamed from: a */
    public void mo32804a() {
        this.f25287a.clear();
    }
}
