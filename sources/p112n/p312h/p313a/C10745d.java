package p112n.p312h.p313a;

import com.liulishuo.filedownloader.message.C8890c;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.model.C8896b;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import java.io.File;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import p112n.p312h.p313a.C10722a;
import p112n.p312h.p313a.C10801w;
import p112n.p312h.p313a.p318f0.C10767d;
import p112n.p312h.p313a.p318f0.C10771f;

/* renamed from: n.h.a.d */
/* compiled from: DownloadTaskHunter */
public class C10745d implements C10801w, C10801w.C10803b, C10801w.C10802a, C10722a.C10726d {

    /* renamed from: a */
    private C10797s f28807a;

    /* renamed from: b */
    private final Object f28808b;

    /* renamed from: c */
    private final C10746a f28809c;

    /* renamed from: d */
    private volatile byte f28810d = 0;

    /* renamed from: e */
    private Throwable f28811e = null;

    /* renamed from: f */
    private final C10796r f28812f;

    /* renamed from: g */
    private long f28813g;

    /* renamed from: h */
    private long f28814h;

    /* renamed from: i */
    private int f28815i;

    /* renamed from: j */
    private boolean f28816j;

    /* renamed from: n.h.a.d$a */
    /* compiled from: DownloadTaskHunter */
    interface C10746a {
        /* renamed from: C */
        FileDownloadHeader mo36452C();

        /* renamed from: a */
        void mo36456a(String str);

        /* renamed from: m */
        C10722a.C10724b mo36457m();

        /* renamed from: p */
        ArrayList<C10722a.C10723a> mo36458p();
    }

    C10745d(C10746a aVar, Object obj) {
        this.f28808b = obj;
        this.f28809c = aVar;
        this.f28812f = new C10731b();
        this.f28807a = new C10781k(aVar.mo36457m(), this);
    }

    /* renamed from: l */
    private int m36401l() {
        return this.f28809c.mo36457m().mo36425r().getId();
    }

    /* renamed from: m */
    private void m36402m() {
        File file;
        C10722a r = this.f28809c.mo36457m().mo36425r();
        if (r.getPath() == null) {
            r.mo36392b(C10771f.m36515d(r.mo36406h()));
            if (C10767d.f28826a) {
                C10767d.m36490a(this, "save Path is null to %s", r.getPath());
            }
        }
        if (r.mo36385E()) {
            file = new File(r.getPath());
        } else {
            String f = C10771f.m36518f(r.getPath());
            if (f != null) {
                file = new File(f);
            } else {
                throw new InvalidParameterException(C10771f.m36504a("the provided mPath[%s] is invalid, can't find its directory", r.getPath()));
            }
        }
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /* renamed from: a */
    public boolean mo36469a(MessageSnapshot messageSnapshot) {
        if (!this.f28809c.mo36457m().mo36425r().mo36385E() || messageSnapshot.mo32695n() != -4 || getStatus() != 2) {
            return false;
        }
        m36400e(messageSnapshot);
        return true;
    }

    /* renamed from: b */
    public boolean mo36472b(MessageSnapshot messageSnapshot) {
        if (!C8896b.m29175a(getStatus(), messageSnapshot.mo32695n())) {
            if (C10767d.f28826a) {
                C10767d.m36490a(this, "can't update mStatus change by keep ahead, %d, but the current mStatus is %d, %d", Byte.valueOf(this.f28810d), Byte.valueOf(getStatus()), Integer.valueOf(m36401l()));
            }
            return false;
        }
        m36400e(messageSnapshot);
        return true;
    }

    /* renamed from: c */
    public boolean mo36474c(MessageSnapshot messageSnapshot) {
        if (!C8896b.m29176a(this.f28809c.mo36457m().mo36425r())) {
            return false;
        }
        m36400e(messageSnapshot);
        return true;
    }

    /* renamed from: d */
    public boolean mo36476d(MessageSnapshot messageSnapshot) {
        byte status = getStatus();
        byte n = messageSnapshot.mo32695n();
        if (-2 == status && C8896b.m29174a((int) n)) {
            if (C10767d.f28826a) {
                C10767d.m36490a(this, "High concurrent cause, callback pending, but has already be paused %d", Integer.valueOf(m36401l()));
            }
            return true;
        } else if (!C8896b.m29178b(status, n)) {
            if (C10767d.f28826a) {
                C10767d.m36490a(this, "can't update mStatus change by keep flow, %d, but the current mStatus is %d, %d", Byte.valueOf(this.f28810d), Byte.valueOf(getStatus()), Integer.valueOf(m36401l()));
            }
            return false;
        } else {
            m36400e(messageSnapshot);
            return true;
        }
    }

    /* renamed from: e */
    public C10797s mo36477e() {
        return this.f28807a;
    }

    /* renamed from: f */
    public void mo36433f() {
        C10722a r = this.f28809c.mo36457m().mo36425r();
        if (C10782l.m36566b()) {
            C10782l.m36565a().mo36546b(r);
        }
        if (C10767d.f28826a) {
            C10767d.m36494d(this, "filedownloader:lifecycle:over %s by %d ", toString(), Byte.valueOf(getStatus()));
        }
        if (this.f28809c.mo36458p() != null) {
            ArrayList arrayList = (ArrayList) this.f28809c.mo36458p().clone();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C10722a.C10723a) arrayList.get(i)).mo36417a(r);
            }
        }
        C10794q.m36615e().mo36576b().mo36581c(this.f28809c.mo36457m());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        r0 = r7.f28809c.mo36457m();
        r1 = r0.mo36425r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (p112n.p312h.p313a.C10782l.m36566b() == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        p112n.p312h.p313a.C10782l.m36565a().mo36545a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (p112n.p312h.p313a.p318f0.C10767d.f28826a == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        p112n.p312h.p313a.p318f0.C10767d.m36494d(r7, "call start Url[%s], Path[%s] Listener[%s], Tag[%s]", r1.mo36406h(), r1.getPath(), r1.mo36415w(), r1.getTag());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        m36402m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        p112n.p312h.p313a.C10773h.m36524b().mo36515a(r0);
        p112n.p312h.p313a.C10773h.m36524b().mo36516a(r0, mo36467a(r1));
        r0 = false;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36478g() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f28808b
            monitor-enter(r0)
            byte r1 = r7.f28810d     // Catch:{ all -> 0x009e }
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0025
            java.lang.String r1 = "High concurrent cause, this task %d will not input to launch pool, because of the status isn't idle : %d"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x009e }
            int r5 = r7.m36401l()     // Catch:{ all -> 0x009e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x009e }
            r2[r4] = r5     // Catch:{ all -> 0x009e }
            byte r4 = r7.f28810d     // Catch:{ all -> 0x009e }
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)     // Catch:{ all -> 0x009e }
            r2[r3] = r4     // Catch:{ all -> 0x009e }
            p112n.p312h.p313a.p318f0.C10767d.m36495e(r7, r1, r2)     // Catch:{ all -> 0x009e }
            monitor-exit(r0)     // Catch:{ all -> 0x009e }
            return
        L_0x0025:
            r1 = 10
            r7.f28810d = r1     // Catch:{ all -> 0x009e }
            monitor-exit(r0)     // Catch:{ all -> 0x009e }
            n.h.a.d$a r0 = r7.f28809c
            n.h.a.a$b r0 = r0.mo36457m()
            n.h.a.a r1 = r0.mo36425r()
            boolean r5 = p112n.p312h.p313a.C10782l.m36566b()
            if (r5 == 0) goto L_0x0041
            n.h.a.l$a r5 = p112n.p312h.p313a.C10782l.m36565a()
            r5.mo36545a(r1)
        L_0x0041:
            boolean r5 = p112n.p312h.p313a.p318f0.C10767d.f28826a
            if (r5 == 0) goto L_0x0066
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = r1.mo36406h()
            r5[r4] = r6
            java.lang.String r6 = r1.getPath()
            r5[r3] = r6
            n.h.a.i r6 = r1.mo36415w()
            r5[r2] = r6
            r2 = 3
            java.lang.Object r1 = r1.getTag()
            r5[r2] = r1
            java.lang.String r1 = "call start Url[%s], Path[%s] Listener[%s], Tag[%s]"
            p112n.p312h.p313a.p318f0.C10767d.m36494d(r7, r1, r5)
        L_0x0066:
            r7.m36402m()     // Catch:{ all -> 0x006b }
            r0 = 1
            goto L_0x007f
        L_0x006b:
            r1 = move-exception
            n.h.a.h r2 = p112n.p312h.p313a.C10773h.m36524b()
            r2.mo36515a((p112n.p312h.p313a.C10722a.C10724b) r0)
            n.h.a.h r2 = p112n.p312h.p313a.C10773h.m36524b()
            com.liulishuo.filedownloader.message.MessageSnapshot r1 = r7.mo36467a((java.lang.Throwable) r1)
            r2.mo36516a((p112n.p312h.p313a.C10722a.C10724b) r0, (com.liulishuo.filedownloader.message.MessageSnapshot) r1)
            r0 = 0
        L_0x007f:
            if (r0 == 0) goto L_0x0088
            n.h.a.p r0 = p112n.p312h.p313a.C10790p.m36603a()
            r0.mo36560b(r7)
        L_0x0088:
            boolean r0 = p112n.p312h.p313a.p318f0.C10767d.f28826a
            if (r0 == 0) goto L_0x009d
            java.lang.Object[] r0 = new java.lang.Object[r3]
            int r1 = r7.m36401l()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r4] = r1
            java.lang.String r1 = "the task[%d] has been into the launch pool."
            p112n.p312h.p313a.p318f0.C10767d.m36494d(r7, r1, r0)
        L_0x009d:
            return
        L_0x009e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p112n.p312h.p313a.C10745d.mo36478g():void");
    }

    public byte getStatus() {
        return this.f28810d;
    }

    /* renamed from: h */
    public long mo36480h() {
        return this.f28813g;
    }

    /* renamed from: i */
    public long mo36481i() {
        return this.f28814h;
    }

    /* renamed from: j */
    public void mo36434j() {
        if (C10782l.m36566b() && getStatus() == 6) {
            C10782l.m36565a().mo36548d(this.f28809c.mo36457m().mo36425r());
        }
    }

    /* renamed from: k */
    public void mo36435k() {
        if (C10782l.m36566b()) {
            C10782l.m36565a().mo36547c(this.f28809c.mo36457m().mo36425r());
        }
        if (C10767d.f28826a) {
            C10767d.m36494d(this, "filedownloader:lifecycle:start %s by %d ", toString(), Byte.valueOf(getStatus()));
        }
    }

    public boolean pause() {
        if (C8896b.m29177b(getStatus())) {
            if (C10767d.f28826a) {
                C10767d.m36490a(this, "High concurrent cause, Already is over, can't pause again, %d %d", Byte.valueOf(getStatus()), Integer.valueOf(this.f28809c.mo36457m().mo36425r().getId()));
            }
            return false;
        }
        this.f28810d = -2;
        C10722a.C10724b m = this.f28809c.mo36457m();
        C10722a r = m.mo36425r();
        C10790p.m36603a().mo36559a((C10801w.C10803b) this);
        if (C10767d.f28826a) {
            C10767d.m36494d(this, "the task[%d] has been expired from the launch pool.", Integer.valueOf(m36401l()));
        }
        if (C10794q.m36615e().mo36578d()) {
            C10784m.m36573c().mo36553d(r.getId());
        } else if (C10767d.f28826a) {
            C10767d.m36490a(this, "request pause the task[%d] to the download service, but the download service isn't connected yet.", Integer.valueOf(r.getId()));
        }
        this.f28812f.mo36449a(this.f28813g);
        C10773h.m36524b().mo36515a(m);
        C10773h.m36524b().mo36516a(m, C8890c.m29143b(r));
        C10794q.m36615e().mo36576b().mo36581c(m);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        p112n.p312h.p313a.C10773h.m36524b().mo36515a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007c, code lost:
        if (p112n.p312h.p313a.p318f0.C10763c.m36482a(r0.getId(), r0.mo36400f(), r0.mo36384B(), true) == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        r0 = p112n.p312h.p313a.C10784m.m36573c().mo36551a(r0.mo36406h(), r0.getPath(), r0.mo36385E(), r0.mo36416z(), r0.mo36409k(), r0.mo36411n(), r0.mo36384B(), r1.f28809c.mo36452C(), r0.mo36410l());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b0, code lost:
        if (r1.f28810d != -2) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b2, code lost:
        p112n.p312h.p313a.p318f0.C10767d.m36495e(r1, "High concurrent cause, this task %d will be paused,because of the status is paused, so the pause action must be applied", java.lang.Integer.valueOf(m36401l()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c3, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c5, code lost:
        p112n.p312h.p313a.C10784m.m36573c().mo36553d(m36401l());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d1, code lost:
        if (r0 != false) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d7, code lost:
        if (r7.mo36580b(r6) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d9, code lost:
        r0 = mo36467a((java.lang.Throwable) new java.lang.RuntimeException("Occur Unknow Error, when request to start maybe some problem in binder, maybe the process was killed in unexpected."));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ec, code lost:
        if (p112n.p312h.p313a.C10773h.m36524b().mo36520c(r6) == false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ee, code lost:
        r7.mo36581c(r6);
        p112n.p312h.p313a.C10773h.m36524b().mo36515a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f8, code lost:
        p112n.p312h.p313a.C10773h.m36524b().mo36516a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0100, code lost:
        r7.mo36581c(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void start() {
        /*
            r18 = this;
            r1 = r18
            byte r0 = r1.f28810d
            r2 = 2
            r3 = 10
            r4 = 0
            r5 = 1
            if (r0 == r3) goto L_0x0025
            java.lang.Object[] r0 = new java.lang.Object[r2]
            int r2 = r18.m36401l()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r4] = r2
            byte r2 = r1.f28810d
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r0[r5] = r2
            java.lang.String r2 = "High concurrent cause, this task %d will not start, because the of status isn't toLaunchPool: %d"
            p112n.p312h.p313a.p318f0.C10767d.m36495e(r1, r2, r0)
            return
        L_0x0025:
            n.h.a.d$a r0 = r1.f28809c
            n.h.a.a$b r6 = r0.mo36457m()
            n.h.a.a r0 = r6.mo36425r()
            n.h.a.q r7 = p112n.p312h.p313a.C10794q.m36615e()
            n.h.a.u r7 = r7.mo36576b()
            boolean r8 = r7.mo36580b(r6)     // Catch:{ all -> 0x0107 }
            if (r8 == 0) goto L_0x003e
            return
        L_0x003e:
            java.lang.Object r8 = r1.f28808b     // Catch:{ all -> 0x0107 }
            monitor-enter(r8)     // Catch:{ all -> 0x0107 }
            byte r9 = r1.f28810d     // Catch:{ all -> 0x0104 }
            if (r9 == r3) goto L_0x0060
            java.lang.String r0 = "High concurrent cause, this task %d will not start, the status can't assign to toFileDownloadService, because the status isn't toLaunchPool: %d"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0104 }
            int r3 = r18.m36401l()     // Catch:{ all -> 0x0104 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0104 }
            r2[r4] = r3     // Catch:{ all -> 0x0104 }
            byte r3 = r1.f28810d     // Catch:{ all -> 0x0104 }
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)     // Catch:{ all -> 0x0104 }
            r2[r5] = r3     // Catch:{ all -> 0x0104 }
            p112n.p312h.p313a.p318f0.C10767d.m36495e(r1, r0, r2)     // Catch:{ all -> 0x0104 }
            monitor-exit(r8)     // Catch:{ all -> 0x0104 }
            return
        L_0x0060:
            r2 = 11
            r1.f28810d = r2     // Catch:{ all -> 0x0104 }
            monitor-exit(r8)     // Catch:{ all -> 0x0104 }
            n.h.a.h r2 = p112n.p312h.p313a.C10773h.m36524b()     // Catch:{ all -> 0x0107 }
            r2.mo36515a((p112n.p312h.p313a.C10722a.C10724b) r6)     // Catch:{ all -> 0x0107 }
            int r2 = r0.getId()     // Catch:{ all -> 0x0107 }
            java.lang.String r3 = r0.mo36400f()     // Catch:{ all -> 0x0107 }
            boolean r8 = r0.mo36384B()     // Catch:{ all -> 0x0107 }
            boolean r2 = p112n.p312h.p313a.p318f0.C10763c.m36482a((int) r2, (java.lang.String) r3, (boolean) r8, (boolean) r5)     // Catch:{ all -> 0x0107 }
            if (r2 == 0) goto L_0x007f
            return
        L_0x007f:
            n.h.a.m r8 = p112n.p312h.p313a.C10784m.m36573c()     // Catch:{ all -> 0x0107 }
            java.lang.String r9 = r0.mo36406h()     // Catch:{ all -> 0x0107 }
            java.lang.String r10 = r0.getPath()     // Catch:{ all -> 0x0107 }
            boolean r11 = r0.mo36385E()     // Catch:{ all -> 0x0107 }
            int r12 = r0.mo36416z()     // Catch:{ all -> 0x0107 }
            int r13 = r0.mo36409k()     // Catch:{ all -> 0x0107 }
            int r14 = r0.mo36411n()     // Catch:{ all -> 0x0107 }
            boolean r15 = r0.mo36384B()     // Catch:{ all -> 0x0107 }
            n.h.a.d$a r2 = r1.f28809c     // Catch:{ all -> 0x0107 }
            com.liulishuo.filedownloader.model.FileDownloadHeader r16 = r2.mo36452C()     // Catch:{ all -> 0x0107 }
            boolean r17 = r0.mo36410l()     // Catch:{ all -> 0x0107 }
            boolean r0 = r8.mo36551a(r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0107 }
            byte r2 = r1.f28810d     // Catch:{ all -> 0x0107 }
            r3 = -2
            if (r2 != r3) goto L_0x00d1
            java.lang.String r2 = "High concurrent cause, this task %d will be paused,because of the status is paused, so the pause action must be applied"
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x0107 }
            int r5 = r18.m36401l()     // Catch:{ all -> 0x0107 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0107 }
            r3[r4] = r5     // Catch:{ all -> 0x0107 }
            p112n.p312h.p313a.p318f0.C10767d.m36495e(r1, r2, r3)     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x00d0
            n.h.a.m r0 = p112n.p312h.p313a.C10784m.m36573c()     // Catch:{ all -> 0x0107 }
            int r2 = r18.m36401l()     // Catch:{ all -> 0x0107 }
            r0.mo36553d(r2)     // Catch:{ all -> 0x0107 }
        L_0x00d0:
            return
        L_0x00d1:
            if (r0 != 0) goto L_0x0100
            boolean r0 = r7.mo36580b(r6)     // Catch:{ all -> 0x0107 }
            if (r0 != 0) goto L_0x0116
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0107 }
            java.lang.String r2 = "Occur Unknow Error, when request to start maybe some problem in binder, maybe the process was killed in unexpected."
            r0.<init>(r2)     // Catch:{ all -> 0x0107 }
            com.liulishuo.filedownloader.message.MessageSnapshot r0 = r1.mo36467a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0107 }
            n.h.a.h r2 = p112n.p312h.p313a.C10773h.m36524b()     // Catch:{ all -> 0x0107 }
            boolean r2 = r2.mo36520c((p112n.p312h.p313a.C10722a.C10724b) r6)     // Catch:{ all -> 0x0107 }
            if (r2 == 0) goto L_0x00f8
            r7.mo36581c(r6)     // Catch:{ all -> 0x0107 }
            n.h.a.h r2 = p112n.p312h.p313a.C10773h.m36524b()     // Catch:{ all -> 0x0107 }
            r2.mo36515a((p112n.p312h.p313a.C10722a.C10724b) r6)     // Catch:{ all -> 0x0107 }
        L_0x00f8:
            n.h.a.h r2 = p112n.p312h.p313a.C10773h.m36524b()     // Catch:{ all -> 0x0107 }
            r2.mo36516a((p112n.p312h.p313a.C10722a.C10724b) r6, (com.liulishuo.filedownloader.message.MessageSnapshot) r0)     // Catch:{ all -> 0x0107 }
            goto L_0x0116
        L_0x0100:
            r7.mo36581c(r6)     // Catch:{ all -> 0x0107 }
            goto L_0x0116
        L_0x0104:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0104 }
            throw r0     // Catch:{ all -> 0x0107 }
        L_0x0107:
            r0 = move-exception
            r0.printStackTrace()
            n.h.a.h r2 = p112n.p312h.p313a.C10773h.m36524b()
            com.liulishuo.filedownloader.message.MessageSnapshot r0 = r1.mo36467a((java.lang.Throwable) r0)
            r2.mo36516a((p112n.p312h.p313a.C10722a.C10724b) r6, (com.liulishuo.filedownloader.message.MessageSnapshot) r0)
        L_0x0116:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p112n.p312h.p313a.C10745d.start():void");
    }

    /* renamed from: e */
    private void m36400e(MessageSnapshot messageSnapshot) {
        C10722a r = this.f28809c.mo36457m().mo36425r();
        byte n = messageSnapshot.mo32695n();
        this.f28810d = n;
        this.f28816j = messageSnapshot.mo32710p();
        if (n == -4) {
            this.f28812f.mo36448a();
            int a = C10773h.m36524b().mo36511a(r.getId());
            if (a + ((a > 1 || !r.mo36385E()) ? 0 : C10773h.m36524b().mo36511a(C10771f.m36509b(r.mo36406h(), r.mo36400f()))) <= 1) {
                byte b = C10784m.m36573c().mo36552b(r.getId());
                C10767d.m36495e(this, "warn, but no mListener to receive, switch to pending %d %d", Integer.valueOf(r.getId()), Integer.valueOf(b));
                if (C8896b.m29174a((int) b)) {
                    this.f28810d = 1;
                    this.f28814h = messageSnapshot.mo32699g();
                    this.f28813g = messageSnapshot.mo32705f();
                    this.f28812f.start();
                    this.f28807a.mo36529a(((MessageSnapshot.C8885b) messageSnapshot).mo32708a());
                    return;
                }
            }
            C10773h.m36524b().mo36516a(this.f28809c.mo36457m(), messageSnapshot);
        } else if (n == -3) {
            messageSnapshot.mo32700r();
            this.f28813g = messageSnapshot.mo32699g();
            this.f28814h = messageSnapshot.mo32699g();
            this.f28812f.mo36449a(this.f28813g);
            C10773h.m36524b().mo36516a(this.f28809c.mo36457m(), messageSnapshot);
        } else if (n == -1) {
            this.f28811e = messageSnapshot.mo32706o();
            long f = messageSnapshot.mo32705f();
            this.f28813g = f;
            this.f28812f.mo36449a(f);
            C10773h.m36524b().mo36516a(this.f28809c.mo36457m(), messageSnapshot);
        } else if (n == 1) {
            this.f28813g = messageSnapshot.mo32705f();
            this.f28814h = messageSnapshot.mo32699g();
            this.f28807a.mo36529a(messageSnapshot);
        } else if (n == 2) {
            this.f28814h = messageSnapshot.mo32699g();
            messageSnapshot.mo32704q();
            messageSnapshot.mo32702c();
            String d = messageSnapshot.mo32703d();
            if (d != null) {
                if (r.mo36387H() != null) {
                    C10767d.m36495e(this, "already has mFilename[%s], but assign mFilename[%s] again", r.mo36387H(), d);
                }
                this.f28809c.mo36456a(d);
            }
            this.f28812f.start();
            this.f28807a.mo36539g(messageSnapshot);
        } else if (n == 3) {
            this.f28813g = messageSnapshot.mo32705f();
            this.f28812f.mo36450b(messageSnapshot.mo32705f());
            this.f28807a.mo36537e(messageSnapshot);
        } else if (n == 5) {
            this.f28813g = messageSnapshot.mo32705f();
            this.f28811e = messageSnapshot.mo32706o();
            this.f28815i = messageSnapshot.mo32707h();
            this.f28812f.mo36448a();
            this.f28807a.mo36536d(messageSnapshot);
        } else if (n == 6) {
            this.f28807a.mo36541i(messageSnapshot);
        }
    }

    /* renamed from: c */
    public Throwable mo36473c() {
        return this.f28811e;
    }

    /* renamed from: a */
    public MessageSnapshot mo36467a(Throwable th) {
        this.f28810d = -1;
        this.f28811e = th;
        return C8890c.m29142a(this.f28809c.mo36457m().mo36425r());
    }

    /* renamed from: b */
    public int mo36471b() {
        return this.f28815i;
    }

    /* renamed from: a */
    public void mo36468a() {
        if (C10767d.f28826a) {
            C10767d.m36490a(this, "free the task %d, when the status is %d", Integer.valueOf(m36401l()), Byte.valueOf(this.f28810d));
        }
        this.f28810d = 0;
    }

    /* renamed from: a */
    public boolean mo36470a(C10776i iVar) {
        return this.f28809c.mo36457m().mo36425r().mo36415w() == iVar;
    }

    /* renamed from: d */
    public boolean mo36475d() {
        return this.f28816j;
    }
}
