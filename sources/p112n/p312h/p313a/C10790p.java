package p112n.p312h.p313a;

import com.liulishuo.filedownloader.message.C8887b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import p112n.p312h.p313a.C10801w;
import p112n.p312h.p313a.p318f0.C10761b;
import p112n.p312h.p313a.p318f0.C10767d;

/* renamed from: n.h.a.p */
/* compiled from: FileDownloadTaskLauncher */
class C10790p {

    /* renamed from: a */
    private final C10792b f28861a = new C10792b();

    /* renamed from: n.h.a.p$a */
    /* compiled from: FileDownloadTaskLauncher */
    private static class C10791a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C10790p f28862a = new C10790p();

        static {
            C8887b.m29133a().mo32714a((C8887b.C8889b) new C10806z());
        }
    }

    /* renamed from: n.h.a.p$b */
    /* compiled from: FileDownloadTaskLauncher */
    private static class C10792b {

        /* renamed from: a */
        private ThreadPoolExecutor f28863a;

        /* renamed from: b */
        private LinkedBlockingQueue<Runnable> f28864b;

        public C10792b() {
            m36608a();
        }

        /* renamed from: a */
        public void mo36562a(C10801w.C10803b bVar) {
            this.f28863a.execute(new C10793c(bVar));
        }

        /* renamed from: b */
        public void mo36563b(C10801w.C10803b bVar) {
            this.f28864b.remove(bVar);
        }

        /* renamed from: a */
        public void mo36561a(C10776i iVar) {
            if (iVar == null) {
                C10767d.m36495e(this, "want to expire by listener, but the listener provided is null", new Object[0]);
                return;
            }
            ArrayList<Runnable> arrayList = new ArrayList<>();
            Iterator<Runnable> it = this.f28864b.iterator();
            while (it.hasNext()) {
                Runnable next = it.next();
                C10793c cVar = (C10793c) next;
                if (cVar.mo36565a(iVar)) {
                    cVar.mo36564a();
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                if (C10767d.f28826a) {
                    C10767d.m36490a(this, "expire %d tasks with listener[%s]", Integer.valueOf(arrayList.size()), iVar);
                }
                for (Runnable remove : arrayList) {
                    this.f28863a.remove(remove);
                }
            }
        }

        /* renamed from: a */
        private void m36608a() {
            LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<>();
            this.f28864b = linkedBlockingQueue;
            this.f28863a = C10761b.m36478a(3, linkedBlockingQueue, "LauncherTask");
        }
    }

    /* renamed from: n.h.a.p$c */
    /* compiled from: FileDownloadTaskLauncher */
    private static class C10793c implements Runnable {

        /* renamed from: f */
        private final C10801w.C10803b f28865f;

        /* renamed from: g */
        private boolean f28866g = false;

        C10793c(C10801w.C10803b bVar) {
            this.f28865f = bVar;
        }

        /* renamed from: a */
        public boolean mo36565a(C10776i iVar) {
            C10801w.C10803b bVar = this.f28865f;
            return bVar != null && bVar.mo36470a(iVar);
        }

        public boolean equals(Object obj) {
            return super.equals(obj) || obj == this.f28865f;
        }

        public void run() {
            if (!this.f28866g) {
                this.f28865f.start();
            }
        }

        /* renamed from: a */
        public void mo36564a() {
            this.f28866g = true;
        }
    }

    C10790p() {
    }

    /* renamed from: a */
    public static C10790p m36603a() {
        return C10791a.f28862a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo36560b(C10801w.C10803b bVar) {
        this.f28861a.mo36562a(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo36559a(C10801w.C10803b bVar) {
        this.f28861a.mo36563b(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo36558a(C10776i iVar) {
        this.f28861a.mo36561a(iVar);
    }
}
