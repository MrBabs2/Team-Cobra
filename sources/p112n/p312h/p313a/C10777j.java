package p112n.p312h.p313a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import p112n.p312h.p313a.p318f0.C10761b;

/* renamed from: n.h.a.j */
/* compiled from: FileDownloadMessageStation */
public class C10777j {

    /* renamed from: f */
    static int f28841f = 10;

    /* renamed from: g */
    static int f28842g = 5;

    /* renamed from: a */
    private final Executor f28843a;

    /* renamed from: b */
    private final Handler f28844b;

    /* renamed from: c */
    private final LinkedBlockingQueue<C10797s> f28845c;

    /* renamed from: d */
    private final Object f28846d;

    /* renamed from: e */
    private final ArrayList<C10797s> f28847e;

    /* renamed from: n.h.a.j$a */
    /* compiled from: FileDownloadMessageStation */
    class C10778a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C10797s f28848f;

        C10778a(C10777j jVar, C10797s sVar) {
            this.f28848f = sVar;
        }

        public void run() {
            this.f28848f.mo36535d();
        }
    }

    /* renamed from: n.h.a.j$b */
    /* compiled from: FileDownloadMessageStation */
    private static final class C10779b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C10777j f28849a = new C10777j((C10778a) null);
    }

    /* renamed from: n.h.a.j$c */
    /* compiled from: FileDownloadMessageStation */
    private static class C10780c implements Handler.Callback {
        private C10780c() {
        }

        /* renamed from: a */
        private void m36547a(ArrayList<C10797s> arrayList) {
            Iterator<C10797s> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo36535d();
            }
            arrayList.clear();
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                ((C10797s) message.obj).mo36535d();
            } else if (i == 2) {
                m36547a((ArrayList) message.obj);
                C10777j.m36538a().m36542c();
            }
            return true;
        }

        /* synthetic */ C10780c(C10778a aVar) {
            this();
        }
    }

    /* synthetic */ C10777j(C10778a aVar) {
        this();
    }

    /* renamed from: b */
    private void m36540b(C10797s sVar) {
        synchronized (this.f28846d) {
            this.f28845c.offer(sVar);
        }
        m36542c();
    }

    /* renamed from: c */
    private void m36543c(C10797s sVar) {
        Handler handler = this.f28844b;
        handler.sendMessage(handler.obtainMessage(1, sVar));
    }

    private C10777j() {
        this.f28843a = C10761b.m36477a(5, "BlockCompleted");
        this.f28846d = new Object();
        this.f28847e = new ArrayList<>();
        this.f28844b = new Handler(Looper.getMainLooper(), new C10780c((C10778a) null));
        this.f28845c = new LinkedBlockingQueue<>();
    }

    /* renamed from: a */
    public static C10777j m36538a() {
        return C10779b.f28849a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        r0 = r6.f28844b;
        r0.sendMessageDelayed(r0.obtainMessage(2, r6.f28847e), (long) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m36542c() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f28846d
            monitor-enter(r0)
            java.util.ArrayList<n.h.a.s> r1 = r6.f28847e     // Catch:{ all -> 0x0054 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0054 }
            if (r1 != 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            return
        L_0x000d:
            java.util.concurrent.LinkedBlockingQueue<n.h.a.s> r1 = r6.f28845c     // Catch:{ all -> 0x0054 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0054 }
            if (r1 == 0) goto L_0x0017
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            return
        L_0x0017:
            boolean r1 = m36541b()     // Catch:{ all -> 0x0054 }
            r2 = 0
            if (r1 != 0) goto L_0x0026
            java.util.concurrent.LinkedBlockingQueue<n.h.a.s> r1 = r6.f28845c     // Catch:{ all -> 0x0054 }
            java.util.ArrayList<n.h.a.s> r3 = r6.f28847e     // Catch:{ all -> 0x0054 }
            r1.drainTo(r3)     // Catch:{ all -> 0x0054 }
            goto L_0x0045
        L_0x0026:
            int r1 = f28841f     // Catch:{ all -> 0x0054 }
            java.util.concurrent.LinkedBlockingQueue<n.h.a.s> r3 = r6.f28845c     // Catch:{ all -> 0x0054 }
            int r3 = r3.size()     // Catch:{ all -> 0x0054 }
            int r4 = f28842g     // Catch:{ all -> 0x0054 }
            int r3 = java.lang.Math.min(r3, r4)     // Catch:{ all -> 0x0054 }
        L_0x0034:
            if (r2 >= r3) goto L_0x0044
            java.util.ArrayList<n.h.a.s> r4 = r6.f28847e     // Catch:{ all -> 0x0054 }
            java.util.concurrent.LinkedBlockingQueue<n.h.a.s> r5 = r6.f28845c     // Catch:{ all -> 0x0054 }
            java.lang.Object r5 = r5.remove()     // Catch:{ all -> 0x0054 }
            r4.add(r5)     // Catch:{ all -> 0x0054 }
            int r2 = r2 + 1
            goto L_0x0034
        L_0x0044:
            r2 = r1
        L_0x0045:
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            android.os.Handler r0 = r6.f28844b
            r1 = 2
            java.util.ArrayList<n.h.a.s> r3 = r6.f28847e
            android.os.Message r1 = r0.obtainMessage(r1, r3)
            long r2 = (long) r2
            r0.sendMessageDelayed(r1, r2)
            return
        L_0x0054:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            goto L_0x0058
        L_0x0057:
            throw r1
        L_0x0058:
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: p112n.p312h.p313a.C10777j.m36542c():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36525a(C10797s sVar) {
        mo36526a(sVar, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36526a(C10797s sVar, boolean z) {
        if (sVar.mo36530a()) {
            sVar.mo36535d();
        } else if (sVar.mo36534c()) {
            this.f28843a.execute(new C10778a(this, sVar));
        } else {
            if (!m36541b() && !this.f28845c.isEmpty()) {
                synchronized (this.f28846d) {
                    if (!this.f28845c.isEmpty()) {
                        Iterator<C10797s> it = this.f28845c.iterator();
                        while (it.hasNext()) {
                            m36543c(it.next());
                        }
                    }
                    this.f28845c.clear();
                }
            }
            if (!m36541b() || z) {
                m36543c(sVar);
            } else {
                m36540b(sVar);
            }
        }
    }

    /* renamed from: b */
    public static boolean m36541b() {
        return f28841f > 0;
    }
}
