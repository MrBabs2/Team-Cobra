package p368r.p369a.p370g;

import java.io.IOException;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import p368r.p369a.p370g.p371s.C11672g;
import p368r.p369a.p370g.p372t.C11675a;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: r.a.g.i */
/* compiled from: DNSStatefulObject */
public interface C11628i {

    /* renamed from: r.a.g.i$b */
    /* compiled from: DNSStatefulObject */
    public static class C11630b extends ReentrantLock implements C11628i {

        /* renamed from: k */
        private static C12938b f31002k = C12939c.m41778a(C11630b.class.getName());

        /* renamed from: f */
        private volatile C11639l f31003f = null;

        /* renamed from: g */
        protected volatile C11675a f31004g = null;

        /* renamed from: h */
        protected volatile C11672g f31005h = C11672g.PROBING_1;

        /* renamed from: i */
        private final C11629a f31006i = new C11629a("Announce");

        /* renamed from: j */
        private final C11629a f31007j = new C11629a("Cancel");

        /* renamed from: m */
        private boolean m38138m() {
            return this.f31005h.mo38203i() || this.f31005h.mo38204l();
        }

        /* renamed from: n */
        private boolean m38139n() {
            return this.f31005h.mo38205m() || this.f31005h.mo38206o();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo38002a(C11639l lVar) {
            this.f31003f = lVar;
        }

        /* renamed from: b */
        public void mo38007b(C11675a aVar) {
            if (this.f31004g == aVar) {
                lock();
                try {
                    if (this.f31004g == aVar) {
                        mo38012c((C11675a) null);
                    }
                } finally {
                    unlock();
                }
            }
        }

        /* renamed from: c */
        public C11639l mo38011c() {
            return this.f31003f;
        }

        /* renamed from: d */
        public boolean mo38013d() {
            return this.f31005h.mo38201d();
        }

        /* renamed from: e */
        public boolean mo38014e() {
            return this.f31005h.mo38202e();
        }

        /* renamed from: f */
        public boolean mo38015f() {
            return this.f31005h.mo38203i();
        }

        /* renamed from: g */
        public boolean mo38016g() {
            return this.f31005h.mo38204l();
        }

        /* renamed from: h */
        public boolean mo38017h() {
            return this.f31005h.mo38205m();
        }

        /* renamed from: i */
        public boolean mo38018i() {
            return this.f31005h.mo38206o();
        }

        /* renamed from: j */
        public boolean mo38019j() {
            return this.f31005h.mo38207p();
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: k */
        public boolean mo38020k() {
            lock();
            try {
                mo38003a(C11672g.PROBING_1);
                mo38012c((C11675a) null);
                unlock();
                return false;
            } catch (Throwable th) {
                unlock();
                throw th;
            }
        }

        /* renamed from: l */
        public boolean mo38021l() {
            if (m38138m()) {
                return true;
            }
            lock();
            try {
                if (!m38138m()) {
                    mo38003a(this.f31005h.mo38208q());
                    mo38012c((C11675a) null);
                }
                return true;
            } finally {
                unlock();
            }
        }

        public String toString() {
            String str;
            String str2 = "NO DNS";
            try {
                StringBuilder sb = new StringBuilder();
                if (this.f31003f != null) {
                    str = "DNS: " + this.f31003f.mo38077F() + " [" + this.f31003f.mo38074C() + "]";
                } else {
                    str = str2;
                }
                sb.append(str);
                sb.append(" state: ");
                sb.append(this.f31005h);
                sb.append(" task: ");
                sb.append(this.f31004g);
                return sb.toString();
            } catch (IOException unused) {
                StringBuilder sb2 = new StringBuilder();
                if (this.f31003f != null) {
                    str2 = "DNS: " + this.f31003f.mo38077F();
                }
                sb2.append(str2);
                sb2.append(" state: ");
                sb2.append(this.f31005h);
                sb2.append(" task: ");
                sb2.append(this.f31004g);
                return sb2.toString();
            }
        }

        /* renamed from: a */
        public void mo38004a(C11675a aVar, C11672g gVar) {
            if (this.f31004g == null && this.f31005h == gVar) {
                lock();
                try {
                    if (this.f31004g == null && this.f31005h == gVar) {
                        mo38012c(aVar);
                    }
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo38012c(C11675a aVar) {
            this.f31004g = aVar;
        }

        /* renamed from: b */
        public boolean mo38010b(C11675a aVar, C11672g gVar) {
            lock();
            try {
                return this.f31004g == aVar && this.f31005h == gVar;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo38003a(C11672g gVar) {
            lock();
            try {
                this.f31005h = gVar;
                if (mo38013d()) {
                    this.f31006i.mo37999a();
                }
                if (mo38015f()) {
                    this.f31007j.mo37999a();
                    this.f31006i.mo37999a();
                }
            } finally {
                unlock();
            }
        }

        /* renamed from: b */
        public boolean mo38008b() {
            boolean z = false;
            if (!m38139n()) {
                lock();
                try {
                    if (!m38139n()) {
                        mo38003a(C11672g.CLOSING);
                        mo38012c((C11675a) null);
                        z = true;
                    }
                } finally {
                    unlock();
                }
            }
            return z;
        }

        /* renamed from: a */
        public boolean mo37998a(C11675a aVar) {
            if (this.f31004g != aVar) {
                return true;
            }
            lock();
            try {
                if (this.f31004g == aVar) {
                    mo38003a(this.f31005h.mo38200a());
                } else {
                    C12938b bVar = f31002k;
                    bVar.mo41315c("Trying to advance state whhen not the owner. owner: " + this.f31004g + " perpetrator: " + aVar);
                }
                return true;
            } finally {
                unlock();
            }
        }

        /* renamed from: b */
        public boolean mo38009b(long j) {
            if (!mo38015f()) {
                this.f31007j.mo38000a(j);
            }
            if (!mo38015f()) {
                this.f31007j.mo38000a(10);
                if (!mo38015f() && !m38139n()) {
                    C12938b bVar = f31002k;
                    bVar.mo41315c("Wait for canceled timed out: " + this);
                }
            }
            return mo38015f();
        }

        /* renamed from: a */
        public boolean mo38005a() {
            boolean z = false;
            if (!m38138m()) {
                lock();
                try {
                    if (!m38138m()) {
                        mo38003a(C11672g.CANCELING_1);
                        mo38012c((C11675a) null);
                        z = true;
                    }
                } finally {
                    unlock();
                }
            }
            return z;
        }

        /* renamed from: a */
        public boolean mo38006a(long j) {
            if (!mo38013d() && !m38138m()) {
                this.f31006i.mo38000a(j + 10);
            }
            if (!mo38013d()) {
                this.f31006i.mo38000a(10);
                if (!mo38013d()) {
                    if (m38138m() || m38139n()) {
                        C12938b bVar = f31002k;
                        bVar.mo41310b("Wait for announced cancelled: " + this);
                    } else {
                        C12938b bVar2 = f31002k;
                        bVar2.mo41315c("Wait for announced timed out: " + this);
                    }
                }
            }
            return mo38013d();
        }
    }

    /* renamed from: a */
    boolean mo37998a(C11675a aVar);

    /* renamed from: r.a.g.i$a */
    /* compiled from: DNSStatefulObject */
    public static final class C11629a {

        /* renamed from: c */
        private static C12938b f30999c = C12939c.m41778a(C11629a.class.getName());

        /* renamed from: a */
        private final String f31000a;

        /* renamed from: b */
        private final ConcurrentMap<Thread, Semaphore> f31001b = new ConcurrentHashMap(50);

        public C11629a(String str) {
            this.f31000a = str;
        }

        /* renamed from: a */
        public void mo38000a(long j) {
            Thread currentThread = Thread.currentThread();
            if (((Semaphore) this.f31001b.get(currentThread)) == null) {
                Semaphore semaphore = new Semaphore(1, true);
                semaphore.drainPermits();
                this.f31001b.putIfAbsent(currentThread, semaphore);
            }
            try {
                ((Semaphore) this.f31001b.get(currentThread)).tryAcquire(j, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                f30999c.mo41321d("Exception ", (Throwable) e);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(1000);
            sb.append("Semaphore: ");
            sb.append(this.f31000a);
            if (this.f31001b.size() == 0) {
                sb.append(" no semaphores.");
            } else {
                sb.append(" semaphores:\n");
                for (Thread thread : this.f31001b.keySet()) {
                    sb.append("\tThread: ");
                    sb.append(thread.getName());
                    sb.append(' ');
                    sb.append(this.f31001b.get(thread));
                    sb.append(10);
                }
            }
            return sb.toString();
        }

        /* renamed from: a */
        public void mo37999a() {
            Collection<Semaphore> values = this.f31001b.values();
            for (Semaphore semaphore : values) {
                semaphore.release();
                values.remove(semaphore);
            }
        }
    }
}
