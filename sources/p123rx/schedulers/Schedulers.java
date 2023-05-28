package p123rx.schedulers;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p123rx.C5373h;
import p123rx.p401n.p404c.C12721c;
import p123rx.p401n.p404c.C12725d;
import p123rx.p401n.p404c.C12727f;
import p123rx.p401n.p404c.C12739k;
import p123rx.p401n.p404c.C12750n;
import p123rx.p411q.C12844c;
import p123rx.p411q.C12863f;
import p123rx.p411q.C12866g;

/* renamed from: rx.schedulers.Schedulers */
public final class Schedulers {

    /* renamed from: d */
    private static final AtomicReference<Schedulers> f9642d = new AtomicReference<>();

    /* renamed from: a */
    private final C5373h f9643a;

    /* renamed from: b */
    private final C5373h f9644b;

    /* renamed from: c */
    private final C5373h f9645c;

    private Schedulers() {
        C12866g d = C12863f.m41441f().mo41071d();
        C5373h a = d.mo41073a();
        if (a != null) {
            this.f9643a = a;
        } else {
            this.f9643a = C12866g.m41451d();
        }
        C5373h b = d.mo41075b();
        if (b != null) {
            this.f9644b = b;
        } else {
            this.f9644b = C12866g.m41452e();
        }
        C5373h c = d.mo41076c();
        if (c != null) {
            this.f9645c = c;
        } else {
            this.f9645c = C12866g.m41453f();
        }
    }

    /* renamed from: c */
    private static Schedulers m10351c() {
        while (true) {
            Schedulers schedulers = f9642d.get();
            if (schedulers != null) {
                return schedulers;
            }
            Schedulers schedulers2 = new Schedulers();
            if (f9642d.compareAndSet((Object) null, schedulers2)) {
                return schedulers2;
            }
            schedulers2.mo18718a();
        }
    }

    public static C5373h computation() {
        return C12844c.m41410a(m10351c().f9643a);
    }

    public static C5373h from(Executor executor) {
        return new C12721c(executor);
    }

    public static C5373h immediate() {
        return C12727f.f32876a;
    }

    /* renamed from: io */
    public static C5373h m10352io() {
        return C12844c.m41414b(m10351c().f9644b);
    }

    public static C5373h newThread() {
        return C12844c.m41419c(m10351c().f9645c);
    }

    public static void reset() {
        Schedulers andSet = f9642d.getAndSet((Object) null);
        if (andSet != null) {
            andSet.mo18718a();
        }
    }

    public static void shutdown() {
        Schedulers c = m10351c();
        c.mo18718a();
        synchronized (c) {
            C12725d.f32871i.shutdown();
        }
    }

    public static void start() {
        Schedulers c = m10351c();
        c.mo18719b();
        synchronized (c) {
            C12725d.f32871i.start();
        }
    }

    public static TestScheduler test() {
        return new TestScheduler();
    }

    public static C5373h trampoline() {
        return C12750n.f32927a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo18718a() {
        if (this.f9643a instanceof C12739k) {
            ((C12739k) this.f9643a).shutdown();
        }
        if (this.f9644b instanceof C12739k) {
            ((C12739k) this.f9644b).shutdown();
        }
        if (this.f9645c instanceof C12739k) {
            ((C12739k) this.f9645c).shutdown();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo18719b() {
        if (this.f9643a instanceof C12739k) {
            ((C12739k) this.f9643a).start();
        }
        if (this.f9644b instanceof C12739k) {
            ((C12739k) this.f9644b).start();
        }
        if (this.f9645c instanceof C12739k) {
            ((C12739k) this.f9645c).start();
        }
    }
}
