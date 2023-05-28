package p112n.p312h.p313a;

import com.liulishuo.filedownloader.message.BlockCompleteMessage;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.model.C8896b;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import junit.framework.Assert;
import p112n.p312h.p313a.C10722a;
import p112n.p312h.p313a.C10801w;
import p112n.p312h.p313a.p318f0.C10767d;
import p112n.p312h.p313a.p318f0.C10771f;

/* renamed from: n.h.a.k */
/* compiled from: FileDownloadMessenger */
class C10781k implements C10797s {

    /* renamed from: a */
    private C10722a.C10724b f28850a;

    /* renamed from: b */
    private C10722a.C10726d f28851b;

    /* renamed from: c */
    private Queue<MessageSnapshot> f28852c;

    /* renamed from: d */
    private boolean f28853d = false;

    C10781k(C10722a.C10724b bVar, C10722a.C10726d dVar) {
        m36549a(bVar, dVar);
    }

    /* renamed from: a */
    private void m36549a(C10722a.C10724b bVar, C10722a.C10726d dVar) {
        this.f28850a = bVar;
        this.f28851b = dVar;
        this.f28852c = new LinkedBlockingQueue();
    }

    /* renamed from: k */
    private void m36550k(MessageSnapshot messageSnapshot) {
        C10722a.C10724b bVar = this.f28850a;
        if (bVar == null) {
            if (C10767d.f28826a) {
                C10767d.m36490a(this, "occur this case, it would be the host task of this messenger has been over(paused/warn/completed/error) on the other thread before receiving the snapshot(id[%d], status[%d])", Integer.valueOf(messageSnapshot.mo32709e()), Byte.valueOf(messageSnapshot.mo32695n()));
            }
        } else if (this.f28853d || bVar.mo36425r().mo36415w() == null) {
            if (C10782l.m36566b() && messageSnapshot.mo32695n() == 4) {
                this.f28851b.mo36433f();
            }
            m36548a((int) messageSnapshot.mo32695n());
        } else {
            this.f28852c.offer(messageSnapshot);
            C10777j.m36538a().mo36525a((C10797s) this);
        }
    }

    /* renamed from: b */
    public boolean mo36532b() {
        if (C10767d.f28826a) {
            C10767d.m36490a(this, "notify begin %s", this.f28850a);
        }
        if (this.f28850a == null) {
            C10767d.m36495e(this, "can't begin the task, the holder fo the messenger is nil, %d", Integer.valueOf(this.f28852c.size()));
            return false;
        }
        this.f28851b.mo36435k();
        return true;
    }

    /* renamed from: c */
    public void mo36533c(MessageSnapshot messageSnapshot) {
        if (C10767d.f28826a) {
            C10722a.C10724b bVar = this.f28850a;
            C10767d.m36490a(this, "notify error %s %s", bVar, bVar.mo36425r().mo36395c());
        }
        this.f28851b.mo36433f();
        m36550k(messageSnapshot);
    }

    /* renamed from: d */
    public void mo36536d(MessageSnapshot messageSnapshot) {
        if (C10767d.f28826a) {
            C10722a r = this.f28850a.mo36425r();
            C10767d.m36490a(this, "notify retry %s %d %d %s", this.f28850a, Integer.valueOf(r.mo36411n()), Integer.valueOf(r.mo36391b()), r.mo36395c());
        }
        this.f28851b.mo36434j();
        m36550k(messageSnapshot);
    }

    /* renamed from: e */
    public void mo36537e(MessageSnapshot messageSnapshot) {
        C10722a r = this.f28850a.mo36425r();
        if (C10767d.f28826a) {
            C10767d.m36490a(this, "notify progress %s %d %d", r, Long.valueOf(r.mo36407i()), Long.valueOf(r.mo36414q()));
        }
        if (r.mo36416z() > 0) {
            this.f28851b.mo36434j();
            m36550k(messageSnapshot);
        } else if (C10767d.f28826a) {
            C10767d.m36490a(this, "notify progress but client not request notify %s", this.f28850a);
        }
    }

    /* renamed from: f */
    public void mo36538f(MessageSnapshot messageSnapshot) {
        if (C10767d.f28826a) {
            C10767d.m36490a(this, "notify warn %s", this.f28850a);
        }
        this.f28851b.mo36433f();
        m36550k(messageSnapshot);
    }

    /* renamed from: g */
    public void mo36539g(MessageSnapshot messageSnapshot) {
        if (C10767d.f28826a) {
            C10767d.m36490a(this, "notify connected %s", this.f28850a);
        }
        this.f28851b.mo36434j();
        m36550k(messageSnapshot);
    }

    /* renamed from: h */
    public void mo36540h(MessageSnapshot messageSnapshot) {
        if (C10767d.f28826a) {
            C10767d.m36490a(this, "notify block completed %s %s", this.f28850a, Thread.currentThread().getName());
        }
        this.f28851b.mo36434j();
        m36550k(messageSnapshot);
    }

    /* renamed from: i */
    public void mo36541i(MessageSnapshot messageSnapshot) {
        if (C10767d.f28826a) {
            C10767d.m36490a(this, "notify started %s", this.f28850a);
        }
        this.f28851b.mo36434j();
        m36550k(messageSnapshot);
    }

    /* renamed from: j */
    public void mo36542j(MessageSnapshot messageSnapshot) {
        if (C10767d.f28826a) {
            C10767d.m36490a(this, "notify completed %s", this.f28850a);
        }
        this.f28851b.mo36433f();
        m36550k(messageSnapshot);
    }

    public String toString() {
        return C10771f.m36504a("%d:%s", Integer.valueOf(this.f28850a.mo36425r().getId()), super.toString());
    }

    /* renamed from: a */
    public void mo36529a(MessageSnapshot messageSnapshot) {
        if (C10767d.f28826a) {
            C10767d.m36490a(this, "notify pending %s", this.f28850a);
        }
        this.f28851b.mo36434j();
        m36550k(messageSnapshot);
    }

    /* renamed from: c */
    public boolean mo36534c() {
        return this.f28852c.peek().mo32695n() == 4;
    }

    /* renamed from: a */
    private void m36548a(int i) {
        if (!C8896b.m29177b(i)) {
            return;
        }
        if (this.f28852c.isEmpty()) {
            this.f28850a = null;
        } else {
            throw new IllegalStateException(C10771f.m36504a("the messenger[%s] has already accomplished all his job, but there still are some messages in parcel queue[%d]", this, Integer.valueOf(this.f28852c.size())));
        }
    }

    /* renamed from: b */
    public void mo36531b(MessageSnapshot messageSnapshot) {
        if (C10767d.f28826a) {
            C10767d.m36490a(this, "notify paused %s", this.f28850a);
        }
        this.f28851b.mo36433f();
        m36550k(messageSnapshot);
    }

    /* renamed from: d */
    public void mo36535d() {
        if (!this.f28853d) {
            MessageSnapshot poll = this.f28852c.poll();
            byte n = poll.mo32695n();
            C10722a.C10724b bVar = this.f28850a;
            boolean z = false;
            String a = C10771f.m36504a("can't handover the message, no master to receive this message(status[%d]) size[%d]", Integer.valueOf(n), Integer.valueOf(this.f28852c.size()));
            if (bVar != null) {
                z = true;
            }
            Assert.assertTrue(a, z);
            C10722a r = bVar.mo36425r();
            C10776i w = r.mo36415w();
            C10801w.C10802a u = bVar.mo36428u();
            m36548a((int) n);
            if (w != null && !w.isInvalid()) {
                if (n == 4) {
                    try {
                        w.blockComplete(r);
                        mo36542j(((BlockCompleteMessage) poll).mo32694b());
                    } catch (Throwable th) {
                        mo36533c(u.mo36467a(th));
                    }
                } else {
                    C10772g gVar = null;
                    if (w instanceof C10772g) {
                        gVar = (C10772g) w;
                    }
                    if (n == -4) {
                        w.warn(r);
                    } else if (n == -3) {
                        w.completed(r);
                    } else if (n != -2) {
                        if (n == -1) {
                            w.error(r, poll.mo32706o());
                        } else if (n != 1) {
                            if (n != 2) {
                                if (n != 3) {
                                    if (n != 5) {
                                        if (n == 6) {
                                            w.started(r);
                                        }
                                    } else if (gVar != null) {
                                        gVar.retry(r, poll.mo32706o(), poll.mo32707h(), poll.mo32705f());
                                    } else {
                                        w.retry(r, poll.mo32706o(), poll.mo32707h(), poll.mo32696j());
                                    }
                                } else if (gVar != null) {
                                    gVar.progress(r, poll.mo32705f(), r.mo36414q());
                                } else {
                                    w.progress(r, poll.mo32696j(), r.mo36399e());
                                }
                            } else if (gVar != null) {
                                gVar.connected(r, poll.mo32702c(), poll.mo32704q(), r.mo36407i(), poll.mo32699g());
                            } else {
                                w.connected(r, poll.mo32702c(), poll.mo32704q(), r.mo36412o(), poll.mo32697k());
                            }
                        } else if (gVar != null) {
                            gVar.pending(r, poll.mo32705f(), poll.mo32699g());
                        } else {
                            w.pending(r, poll.mo32696j(), poll.mo32697k());
                        }
                    } else if (gVar != null) {
                        gVar.paused(r, poll.mo32705f(), poll.mo32699g());
                    } else {
                        w.paused(r, poll.mo32696j(), poll.mo32697k());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo36530a() {
        return this.f28850a.mo36425r().mo36386G();
    }
}
