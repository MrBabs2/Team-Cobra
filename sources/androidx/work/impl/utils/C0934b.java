package androidx.work.impl.utils;

import android.text.TextUtils;
import androidx.work.C0825c;
import androidx.work.C0829e;
import androidx.work.C0834i;
import androidx.work.C0964l;
import androidx.work.impl.C0839b;
import androidx.work.impl.C0860d;
import androidx.work.impl.C0861e;
import androidx.work.impl.C0862f;
import androidx.work.impl.C0868h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.p012l.C0911j;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.List;

/* renamed from: androidx.work.impl.utils.b */
/* compiled from: EnqueueRunnable */
public class C0934b implements Runnable {

    /* renamed from: h */
    private static final String f3249h = C0834i.m3721a("EnqueueRunnable");

    /* renamed from: f */
    private final C0862f f3250f;

    /* renamed from: g */
    private final C0839b f3251g = new C0839b();

    public C0934b(C0862f fVar) {
        this.f3250f = fVar;
    }

    /* renamed from: a */
    public boolean mo4923a() {
        WorkDatabase f = this.f3250f.mo4790g().mo4808f();
        f.beginTransaction();
        try {
            boolean b = m4065b(this.f3250f);
            f.setTransactionSuccessful();
            return b;
        } finally {
            f.endTransaction();
        }
    }

    /* renamed from: b */
    public C0964l mo4924b() {
        return this.f3251g;
    }

    /* renamed from: c */
    public void mo4925c() {
        C0868h g = this.f3250f.mo4790g();
        C0861e.m3833a(g.mo4801b(), g.mo4808f(), g.mo4807e());
    }

    public void run() {
        try {
            if (!this.f3250f.mo4791h()) {
                if (mo4923a()) {
                    C0936d.m4074a(this.f3250f.mo4790g().mo4794a(), RescheduleReceiver.class, true);
                    mo4925c();
                }
                this.f3251g.mo4737a(C0964l.f3320a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", new Object[]{this.f3250f}));
        } catch (Throwable th) {
            this.f3251g.mo4737a(new C0964l.C0966b.C0967a(th));
        }
    }

    /* renamed from: b */
    private static boolean m4065b(C0862f fVar) {
        List<C0862f> e = fVar.mo4788e();
        boolean z = false;
        if (e != null) {
            boolean z2 = false;
            for (C0862f next : e) {
                if (!next.mo4792i()) {
                    z2 |= m4065b(next);
                } else {
                    C0834i.m3720a().mo4730e(f3249h, String.format("Already enqueued work ids (%s).", new Object[]{TextUtils.join(", ", next.mo4786c())}), new Throwable[0]);
                }
            }
            z = z2;
        }
        return m4062a(fVar) | z;
    }

    /* renamed from: a */
    private static boolean m4062a(C0862f fVar) {
        boolean a = m4064a(fVar.mo4790g(), fVar.mo4789f(), (String[]) C0862f.m3834a(fVar).toArray(new String[0]), fVar.mo4787d(), fVar.mo4785b());
        fVar.mo4793j();
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01a8 A[LOOP:6: B:107:0x01a2->B:109:0x01a8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01d1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x015f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m4064a(androidx.work.impl.C0868h r19, java.util.List<? extends androidx.work.C0976r> r20, java.lang.String[] r21, java.lang.String r22, androidx.work.C0832g r23) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = r23
            long r4 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r6 = r19.mo4808f()
            r8 = 1
            if (r1 == 0) goto L_0x0018
            int r9 = r1.length
            if (r9 <= 0) goto L_0x0018
            r9 = 1
            goto L_0x0019
        L_0x0018:
            r9 = 0
        L_0x0019:
            if (r9 == 0) goto L_0x005d
            int r10 = r1.length
            r11 = 0
            r12 = 1
            r13 = 0
            r14 = 0
        L_0x0020:
            if (r11 >= r10) goto L_0x0060
            r15 = r1[r11]
            androidx.work.impl.l.k r7 = r6.mo4734d()
            androidx.work.impl.l.j r7 = r7.mo4903d(r15)
            if (r7 != 0) goto L_0x0045
            androidx.work.i r0 = androidx.work.C0834i.m3720a()
            java.lang.String r1 = f3249h
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r3 = 0
            r2[r3] = r15
            java.lang.String r4 = "Prerequisite %s doesn't exist; not enqueuing"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r0.mo4727b(r1, r2, r4)
            return r3
        L_0x0045:
            androidx.work.p r7 = r7.f3205b
            androidx.work.p r15 = androidx.work.C0974p.SUCCEEDED
            if (r7 != r15) goto L_0x004d
            r15 = 1
            goto L_0x004e
        L_0x004d:
            r15 = 0
        L_0x004e:
            r12 = r12 & r15
            androidx.work.p r15 = androidx.work.C0974p.FAILED
            if (r7 != r15) goto L_0x0055
            r13 = 1
            goto L_0x005a
        L_0x0055:
            androidx.work.p r15 = androidx.work.C0974p.CANCELLED
            if (r7 != r15) goto L_0x005a
            r14 = 1
        L_0x005a:
            int r11 = r11 + 1
            goto L_0x0020
        L_0x005d:
            r12 = 1
            r13 = 0
            r14 = 0
        L_0x0060:
            boolean r7 = android.text.TextUtils.isEmpty(r22)
            r7 = r7 ^ r8
            if (r7 == 0) goto L_0x006b
            if (r9 != 0) goto L_0x006b
            r10 = 1
            goto L_0x006c
        L_0x006b:
            r10 = 0
        L_0x006c:
            if (r10 == 0) goto L_0x00cc
            androidx.work.impl.l.k r10 = r6.mo4734d()
            java.util.List r10 = r10.mo4894a((java.lang.String) r2)
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L_0x00cc
            androidx.work.g r11 = androidx.work.C0832g.APPEND
            if (r3 != r11) goto L_0x00ce
            androidx.work.impl.l.b r3 = r6.mo4731a()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x008d:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00c0
            java.lang.Object r11 = r10.next()
            androidx.work.impl.l.j$b r11 = (androidx.work.impl.p012l.C0911j.C0913b) r11
            java.lang.String r15 = r11.f3220a
            boolean r15 = r3.mo4869c(r15)
            if (r15 != 0) goto L_0x00be
            androidx.work.p r15 = r11.f3221b
            androidx.work.p r8 = androidx.work.C0974p.SUCCEEDED
            if (r15 != r8) goto L_0x00a9
            r8 = 1
            goto L_0x00aa
        L_0x00a9:
            r8 = 0
        L_0x00aa:
            r8 = r8 & r12
            androidx.work.p r12 = r11.f3221b
            androidx.work.p r15 = androidx.work.C0974p.FAILED
            if (r12 != r15) goto L_0x00b3
            r13 = 1
            goto L_0x00b8
        L_0x00b3:
            androidx.work.p r15 = androidx.work.C0974p.CANCELLED
            if (r12 != r15) goto L_0x00b8
            r14 = 1
        L_0x00b8:
            java.lang.String r11 = r11.f3220a
            r9.add(r11)
            r12 = r8
        L_0x00be:
            r8 = 1
            goto L_0x008d
        L_0x00c0:
            java.lang.Object[] r1 = r9.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r3 = r1.length
            if (r3 <= 0) goto L_0x00cb
            r9 = 1
            goto L_0x00cc
        L_0x00cb:
            r9 = 0
        L_0x00cc:
            r3 = 0
            goto L_0x0113
        L_0x00ce:
            androidx.work.g r8 = androidx.work.C0832g.KEEP
            if (r3 != r8) goto L_0x00ee
            java.util.Iterator r3 = r10.iterator()
        L_0x00d6:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x00ee
            java.lang.Object r8 = r3.next()
            androidx.work.impl.l.j$b r8 = (androidx.work.impl.p012l.C0911j.C0913b) r8
            androidx.work.p r8 = r8.f3221b
            androidx.work.p r11 = androidx.work.C0974p.ENQUEUED
            if (r8 == r11) goto L_0x00ec
            androidx.work.p r11 = androidx.work.C0974p.RUNNING
            if (r8 != r11) goto L_0x00d6
        L_0x00ec:
            r3 = 0
            return r3
        L_0x00ee:
            r3 = 0
            androidx.work.impl.utils.a r8 = androidx.work.impl.utils.C0931a.m4053a(r2, r0, r3)
            r8.run()
            androidx.work.impl.l.k r8 = r6.mo4734d()
            java.util.Iterator r10 = r10.iterator()
        L_0x00fe:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0110
            java.lang.Object r11 = r10.next()
            androidx.work.impl.l.j$b r11 = (androidx.work.impl.p012l.C0911j.C0913b) r11
            java.lang.String r11 = r11.f3220a
            r8.delete(r11)
            goto L_0x00fe
        L_0x0110:
            r16 = 1
            goto L_0x0115
        L_0x0113:
            r16 = 0
        L_0x0115:
            java.util.Iterator r8 = r20.iterator()
        L_0x0119:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x01d6
            java.lang.Object r10 = r8.next()
            androidx.work.r r10 = (androidx.work.C0976r) r10
            androidx.work.impl.l.j r11 = r10.mo4981c()
            if (r9 == 0) goto L_0x0140
            if (r12 != 0) goto L_0x0140
            if (r13 == 0) goto L_0x0134
            androidx.work.p r15 = androidx.work.C0974p.FAILED
            r11.f3205b = r15
            goto L_0x0148
        L_0x0134:
            if (r14 == 0) goto L_0x013b
            androidx.work.p r15 = androidx.work.C0974p.CANCELLED
            r11.f3205b = r15
            goto L_0x0148
        L_0x013b:
            androidx.work.p r15 = androidx.work.C0974p.BLOCKED
            r11.f3205b = r15
            goto L_0x0148
        L_0x0140:
            boolean r15 = r11.mo4884d()
            if (r15 != 0) goto L_0x014b
            r11.f3217n = r4
        L_0x0148:
            r17 = r4
            goto L_0x0151
        L_0x014b:
            r17 = r4
            r3 = 0
            r11.f3217n = r3
        L_0x0151:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r3 < r4) goto L_0x015f
            r4 = 25
            if (r3 > r4) goto L_0x015f
            m4061a((androidx.work.impl.p012l.C0911j) r11)
            goto L_0x0170
        L_0x015f:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 22
            if (r3 > r4) goto L_0x0170
            java.lang.String r3 = "androidx.work.impl.background.gcm.GcmScheduler"
            boolean r3 = m4063a(r0, r3)
            if (r3 == 0) goto L_0x0170
            m4061a((androidx.work.impl.p012l.C0911j) r11)
        L_0x0170:
            androidx.work.p r3 = r11.f3205b
            androidx.work.p r4 = androidx.work.C0974p.ENQUEUED
            if (r3 != r4) goto L_0x0178
            r16 = 1
        L_0x0178:
            androidx.work.impl.l.k r3 = r6.mo4734d()
            r3.mo4895a((androidx.work.impl.p012l.C0911j) r11)
            if (r9 == 0) goto L_0x019a
            int r3 = r1.length
            r4 = 0
        L_0x0183:
            if (r4 >= r3) goto L_0x019a
            r5 = r1[r4]
            androidx.work.impl.l.a r11 = new androidx.work.impl.l.a
            java.lang.String r15 = r10.mo4979a()
            r11.<init>(r15, r5)
            androidx.work.impl.l.b r5 = r6.mo4731a()
            r5.mo4867a((androidx.work.impl.p012l.C0898a) r11)
            int r4 = r4 + 1
            goto L_0x0183
        L_0x019a:
            java.util.Set r3 = r10.mo4980b()
            java.util.Iterator r3 = r3.iterator()
        L_0x01a2:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01bf
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            androidx.work.impl.l.n r5 = r6.mo4735e()
            androidx.work.impl.l.m r11 = new androidx.work.impl.l.m
            java.lang.String r15 = r10.mo4979a()
            r11.<init>(r4, r15)
            r5.mo4911a((androidx.work.impl.p012l.C0925m) r11)
            goto L_0x01a2
        L_0x01bf:
            if (r7 == 0) goto L_0x01d1
            androidx.work.impl.l.h r3 = r6.mo4733c()
            androidx.work.impl.l.g r4 = new androidx.work.impl.l.g
            java.lang.String r5 = r10.mo4979a()
            r4.<init>(r2, r5)
            r3.mo4877a(r4)
        L_0x01d1:
            r4 = r17
            r3 = 0
            goto L_0x0119
        L_0x01d6:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.C0934b.m4064a(androidx.work.impl.h, java.util.List, java.lang.String[], java.lang.String, androidx.work.g):boolean");
    }

    /* renamed from: a */
    private static void m4061a(C0911j jVar) {
        C0825c cVar = jVar.f3213j;
        if (cVar.mo4698f() || cVar.mo4702i()) {
            String str = jVar.f3206c;
            C0829e.C0830a aVar = new C0829e.C0830a();
            aVar.mo4720a(jVar.f3208e);
            aVar.mo4722a("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            jVar.f3206c = ConstraintTrackingWorker.class.getName();
            jVar.f3208e = aVar.mo4725a();
        }
    }

    /* renamed from: a */
    private static boolean m4063a(C0868h hVar, String str) {
        try {
            Class<?> cls = Class.forName(str);
            for (C0860d dVar : hVar.mo4807e()) {
                if (cls.isAssignableFrom(dVar.getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }
}
