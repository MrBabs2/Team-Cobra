package p368r.p369a.p370g;

import java.net.InetAddress;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import p368r.p369a.p370g.p372t.C11676b;
import p368r.p369a.p370g.p372t.C11677c;
import p368r.p369a.p370g.p372t.p373d.C11679b;
import p368r.p369a.p370g.p372t.p373d.C11680c;
import p368r.p369a.p370g.p372t.p374e.C11681a;
import p368r.p369a.p370g.p372t.p374e.C11682b;
import p368r.p369a.p370g.p372t.p374e.C11684d;
import p368r.p369a.p370g.p372t.p374e.C11685e;

/* renamed from: r.a.g.j */
/* compiled from: DNSTaskStarter */
public interface C11631j {

    /* renamed from: r.a.g.j$a */
    /* compiled from: DNSTaskStarter */
    public static final class C11632a implements C11631j {

        /* renamed from: f */
        private final C11639l f31008f;

        /* renamed from: g */
        private final Timer f31009g = new C11633a("JmDNS(" + this.f31008f.mo38077F() + ").Timer", true);

        /* renamed from: h */
        private final Timer f31010h = new C11633a("JmDNS(" + this.f31008f.mo38077F() + ").State.Timer", true);

        public C11632a(C11639l lVar) {
            this.f31008f = lVar;
        }

        /* renamed from: a */
        public void mo38023a() {
            this.f31009g.purge();
        }

        /* renamed from: b */
        public void mo38027b() {
            this.f31010h.cancel();
        }

        /* renamed from: d */
        public void mo38028d() {
            this.f31009g.cancel();
        }

        /* renamed from: i */
        public void mo38029i() {
            new C11682b(this.f31008f).mo38236a(this.f31010h);
        }

        /* renamed from: l */
        public void mo38030l() {
            new C11676b(this.f31008f).mo38217a(this.f31009g);
        }

        /* renamed from: m */
        public void mo38031m() {
            new C11684d(this.f31008f).mo38245a(this.f31010h);
        }

        /* renamed from: o */
        public void mo38032o() {
            new C11681a(this.f31008f).mo38230a(this.f31010h);
        }

        /* renamed from: p */
        public void mo38033p() {
            this.f31010h.purge();
        }

        /* renamed from: q */
        public void mo38034q() {
            new C11685e(this.f31008f).mo38247a(this.f31010h);
        }

        /* renamed from: a */
        public void mo38026a(C11662q qVar) {
            new C11679b(this.f31008f, qVar).mo38222a(this.f31009g);
        }

        /* renamed from: r.a.g.j$a$a */
        /* compiled from: DNSTaskStarter */
        public static class C11633a extends Timer {

            /* renamed from: a */
            private volatile boolean f31011a = false;

            public C11633a(String str, boolean z) {
                super(str, z);
            }

            public synchronized void cancel() {
                if (!this.f31011a) {
                    this.f31011a = true;
                    super.cancel();
                }
            }

            public synchronized void schedule(TimerTask timerTask, long j) {
                if (!this.f31011a) {
                    super.schedule(timerTask, j);
                }
            }

            public synchronized void scheduleAtFixedRate(TimerTask timerTask, long j, long j2) {
                if (!this.f31011a) {
                    super.scheduleAtFixedRate(timerTask, j, j2);
                }
            }

            public synchronized void schedule(TimerTask timerTask, Date date) {
                if (!this.f31011a) {
                    super.schedule(timerTask, date);
                }
            }

            public synchronized void scheduleAtFixedRate(TimerTask timerTask, Date date, long j) {
                if (!this.f31011a) {
                    super.scheduleAtFixedRate(timerTask, date, j);
                }
            }

            public synchronized void schedule(TimerTask timerTask, long j, long j2) {
                if (!this.f31011a) {
                    super.schedule(timerTask, j, j2);
                }
            }

            public synchronized void schedule(TimerTask timerTask, Date date, long j) {
                if (!this.f31011a) {
                    super.schedule(timerTask, date, j);
                }
            }
        }

        /* renamed from: a */
        public void mo38024a(String str) {
            new C11680c(this.f31008f, str).mo38222a(this.f31009g);
        }

        /* renamed from: a */
        public void mo38025a(C11604c cVar, InetAddress inetAddress, int i) {
            new C11677c(this.f31008f, cVar, inetAddress, i).mo38219a(this.f31009g);
        }
    }

    /* renamed from: a */
    void mo38023a();

    /* renamed from: a */
    void mo38024a(String str);

    /* renamed from: a */
    void mo38025a(C11604c cVar, InetAddress inetAddress, int i);

    /* renamed from: a */
    void mo38026a(C11662q qVar);

    /* renamed from: b */
    void mo38027b();

    /* renamed from: d */
    void mo38028d();

    /* renamed from: i */
    void mo38029i();

    /* renamed from: l */
    void mo38030l();

    /* renamed from: m */
    void mo38031m();

    /* renamed from: o */
    void mo38032o();

    /* renamed from: p */
    void mo38033p();

    /* renamed from: q */
    void mo38034q();

    /* renamed from: r.a.g.j$b */
    /* compiled from: DNSTaskStarter */
    public static final class C11634b {

        /* renamed from: b */
        private static volatile C11634b f31012b;

        /* renamed from: c */
        private static final AtomicReference<C11635a> f31013c = new AtomicReference<>();

        /* renamed from: a */
        private final ConcurrentMap<C11639l, C11631j> f31014a = new ConcurrentHashMap(20);

        /* renamed from: r.a.g.j$b$a */
        /* compiled from: DNSTaskStarter */
        public interface C11635a {
            /* renamed from: a */
            C11631j mo38044a(C11639l lVar);
        }

        private C11634b() {
        }

        /* renamed from: a */
        public static C11634b m38185a() {
            if (f31012b == null) {
                synchronized (C11634b.class) {
                    if (f31012b == null) {
                        f31012b = new C11634b();
                    }
                }
            }
            return f31012b;
        }

        /* renamed from: c */
        protected static C11631j m38186c(C11639l lVar) {
            C11635a aVar = f31013c.get();
            C11631j a = aVar != null ? aVar.mo38044a(lVar) : null;
            return a != null ? a : new C11632a(lVar);
        }

        /* renamed from: b */
        public C11631j mo38043b(C11639l lVar) {
            C11631j jVar = (C11631j) this.f31014a.get(lVar);
            if (jVar != null) {
                return jVar;
            }
            this.f31014a.putIfAbsent(lVar, m38186c(lVar));
            return (C11631j) this.f31014a.get(lVar);
        }

        /* renamed from: a */
        public void mo38042a(C11639l lVar) {
            this.f31014a.remove(lVar);
        }
    }
}
