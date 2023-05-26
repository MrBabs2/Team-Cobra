package p112n.p312h.p313a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.List;
import p112n.p312h.p313a.C10722a;
import p112n.p312h.p313a.p318f0.C10767d;
import p112n.p312h.p313a.p318f0.C10771f;

/* renamed from: n.h.a.a0 */
/* compiled from: QueuesHandler */
class C10727a0 implements C10800v {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final SparseArray<Handler> f28752a = new SparseArray<>();

    /* renamed from: n.h.a.a0$b */
    /* compiled from: QueuesHandler */
    private static class C10729b implements C10722a.C10723a {

        /* renamed from: a */
        private final WeakReference<C10730c> f28753a;

        /* renamed from: b */
        private int f28754b;

        /* renamed from: a */
        public C10722a.C10723a mo36442a(int i) {
            this.f28754b = i;
            return this;
        }

        private C10729b(WeakReference<C10730c> weakReference) {
            this.f28753a = weakReference;
        }

        /* renamed from: a */
        public void mo36417a(C10722a aVar) {
            WeakReference<C10730c> weakReference = this.f28753a;
            if (weakReference != null && weakReference.get() != null) {
                ((C10730c) this.f28753a.get()).m36311a(this.f28754b);
            }
        }
    }

    /* renamed from: n.h.a.a0$c */
    /* compiled from: QueuesHandler */
    private class C10730c implements Handler.Callback {

        /* renamed from: f */
        private Handler f28755f;

        /* renamed from: g */
        private List<C10722a.C10724b> f28756g;

        /* renamed from: h */
        private int f28757h = 0;

        /* renamed from: i */
        private C10729b f28758i = new C10729b(new WeakReference(this));

        C10730c() {
        }

        /* renamed from: b */
        public void mo36446b() {
            m36311a(this.f28757h);
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                if (message.arg1 >= this.f28756g.size()) {
                    synchronized (C10727a0.this.f28752a) {
                        C10727a0.this.f28752a.remove(this.f28756g.get(0).mo36427t());
                    }
                    Handler handler = this.f28755f;
                    C10776i iVar = null;
                    if (!(handler == null || handler.getLooper() == null)) {
                        this.f28755f.getLooper().quit();
                        this.f28755f = null;
                        this.f28756g = null;
                        this.f28758i = null;
                    }
                    if (C10767d.f28826a) {
                        Class<C10730c> cls = C10730c.class;
                        Object[] objArr = new Object[2];
                        List<C10722a.C10724b> list = this.f28756g;
                        if (!(list == null || list.get(0) == null)) {
                            iVar = this.f28756g.get(0).mo36425r().mo36415w();
                        }
                        objArr[0] = iVar;
                        objArr[1] = Integer.valueOf(message.arg1);
                        C10767d.m36490a(cls, "final serial %s %d", objArr);
                    }
                    return true;
                }
                int i2 = message.arg1;
                this.f28757h = i2;
                C10722a.C10724b bVar = this.f28756g.get(i2);
                synchronized (bVar.mo36431y()) {
                    if (bVar.mo36425r().getStatus() == 0) {
                        if (!C10773h.m36524b().mo36520c(bVar)) {
                            C10722a r = bVar.mo36425r();
                            C10729b bVar2 = this.f28758i;
                            bVar2.mo36442a(this.f28757h + 1);
                            r.mo36390a(bVar2);
                            bVar.mo36418A();
                        }
                    }
                    if (C10767d.f28826a) {
                        C10767d.m36490a(C10730c.class, "direct go next by not contains %s %d", bVar, Integer.valueOf(message.arg1));
                    }
                    m36311a(message.arg1 + 1);
                    return true;
                }
            } else if (i == 2) {
                mo36443a();
            } else if (i == 3) {
                mo36446b();
            }
            return true;
        }

        /* renamed from: a */
        public void mo36444a(Handler handler) {
            this.f28755f = handler;
        }

        /* renamed from: a */
        public void mo36445a(List<C10722a.C10724b> list) {
            this.f28756g = list;
        }

        /* renamed from: a */
        public void mo36443a() {
            this.f28756g.get(this.f28757h).mo36425r().mo36394b((C10722a.C10723a) this.f28758i);
            this.f28755f.removeCallbacksAndMessages((Object) null);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m36311a(int i) {
            Handler handler = this.f28755f;
            if (handler == null || this.f28756g == null) {
                C10767d.m36495e(this, "need go next %d, but params is not ready %s %s", Integer.valueOf(i), this.f28755f, this.f28756g);
                return;
            }
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.what = 1;
            obtainMessage.arg1 = i;
            if (C10767d.f28826a) {
                Class<C10730c> cls = C10730c.class;
                Object[] objArr = new Object[2];
                List<C10722a.C10724b> list = this.f28756g;
                C10776i iVar = null;
                if (!(list == null || list.get(0) == null)) {
                    iVar = this.f28756g.get(0).mo36425r().mo36415w();
                }
                objArr[0] = iVar;
                objArr[1] = Integer.valueOf(obtainMessage.arg1);
                C10767d.m36490a(cls, "start next %s %s", objArr);
            }
            this.f28755f.sendMessage(obtainMessage);
        }
    }

    /* renamed from: b */
    public boolean mo36441b(C10776i iVar) {
        C10730c cVar = new C10730c();
        int hashCode = cVar.hashCode();
        List<C10722a.C10724b> a = C10773h.m36524b().mo36512a(hashCode, iVar);
        if (m36301a(hashCode, a, iVar, true)) {
            return false;
        }
        HandlerThread handlerThread = new HandlerThread(C10771f.m36504a("filedownloader serial thread %s-%d", iVar, Integer.valueOf(hashCode)));
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), cVar);
        cVar.mo36444a(handler);
        cVar.mo36445a(a);
        cVar.m36311a(0);
        synchronized (this.f28752a) {
            this.f28752a.put(hashCode, handler);
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo36439a(C10776i iVar) {
        int hashCode = iVar.hashCode();
        List<C10722a.C10724b> a = C10773h.m36524b().mo36512a(hashCode, iVar);
        if (m36301a(hashCode, a, iVar, false)) {
            return false;
        }
        for (C10722a.C10724b A : a) {
            A.mo36418A();
        }
        return true;
    }

    /* renamed from: a */
    public void mo36437a(List<Integer> list) {
        for (Integer intValue : list) {
            m36302b(this.f28752a.get(intValue.intValue()));
        }
    }

    /* renamed from: a */
    public int mo36436a() {
        return this.f28752a.size();
    }

    /* renamed from: a */
    public boolean mo36438a(int i) {
        return this.f28752a.get(i) != null;
    }

    /* renamed from: a */
    private boolean m36301a(int i, List<C10722a.C10724b> list, C10776i iVar, boolean z) {
        Class<C10794q> cls = C10794q.class;
        if (C10782l.m36566b()) {
            C10782l.m36565a().mo36544a(list.size(), true, iVar);
        }
        if (C10767d.f28826a) {
            C10767d.m36494d(cls, "start list attachKey[%d] size[%d] listener[%s] isSerial[%B]", Integer.valueOf(i), Integer.valueOf(list.size()), iVar, Boolean.valueOf(z));
        }
        if (list != null && !list.isEmpty()) {
            return false;
        }
        C10767d.m36495e(cls, "Tasks with the listener can't start, because can't find any task with the provided listener, maybe tasks instance has been started in the past, so they are all are inUsing, if in this case, you can use [BaseDownloadTask#reuse] to reuse theme first then start again: [%s, %B]", iVar, Boolean.valueOf(z));
        return true;
    }

    /* renamed from: b */
    public void mo36440b() {
        for (int i = 0; i < this.f28752a.size(); i++) {
            m36300a(this.f28752a.get(this.f28752a.keyAt(i)));
        }
    }

    /* renamed from: a */
    private void m36300a(Handler handler) {
        handler.sendEmptyMessage(2);
    }

    /* renamed from: b */
    private void m36302b(Handler handler) {
        handler.sendEmptyMessage(3);
    }
}
