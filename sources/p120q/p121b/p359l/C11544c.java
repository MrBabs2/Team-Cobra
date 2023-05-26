package p120q.p121b.p359l;

import java.net.InetAddress;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p120q.p121b.p359l.C11542b;
import p120q.p121b.p359l.p361g.C11565h;
import p120q.p121b.p366p.C11587a;
import p120q.p121b.p366p.C11588b;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: q.b.l.c */
/* compiled from: EventBuilder */
public class C11544c {

    /* renamed from: d */
    public static final long f30833d = TimeUnit.HOURS.toMillis(5);

    /* renamed from: e */
    static final C11546b f30834e = new C11546b(f30833d);

    /* renamed from: a */
    private final C11542b f30835a;

    /* renamed from: b */
    private boolean f30836b;

    /* renamed from: c */
    private Set<String> f30837c;

    /* renamed from: q.b.l.c$b */
    /* compiled from: EventBuilder */
    static final class C11546b {

        /* renamed from: g */
        static final long f30838g = TimeUnit.SECONDS.toMillis(1);

        /* renamed from: h */
        private static final C12938b f30839h = C12939c.m41777a((Class<?>) C11546b.class);

        /* renamed from: a */
        final long f30840a;

        /* renamed from: b */
        volatile String f30841b;

        /* renamed from: c */
        volatile long f30842c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public AtomicBoolean f30843d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final C11587a f30844e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final Callable<InetAddress> f30845f;

        /* renamed from: q.b.l.c$b$a */
        /* compiled from: EventBuilder */
        class C11547a implements Callable<InetAddress> {
            C11547a() {
            }

            public InetAddress call() throws Exception {
                return InetAddress.getLocalHost();
            }
        }

        /* renamed from: q.b.l.c$b$b */
        /* compiled from: EventBuilder */
        class C11548b implements Callable<Void> {
            C11548b() {
            }

            /* JADX INFO: finally extract failed */
            public Void call() throws Exception {
                try {
                    C11546b.this.f30841b = ((InetAddress) C11546b.this.f30845f.call()).getCanonicalHostName();
                    C11546b.this.f30842c = C11546b.this.f30844e.mo37825a() + C11546b.this.f30840a;
                    C11546b.this.f30843d.set(false);
                    return null;
                } catch (Throwable th) {
                    C11546b.this.f30843d.set(false);
                    throw th;
                }
            }
        }

        private C11546b(long j) {
            this(j, new C11588b(), new C11547a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo37710a() {
            if (this.f30842c < this.f30844e.mo37825a() && this.f30843d.compareAndSet(false, true)) {
                mo37711b();
            }
            return this.f30841b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo37711b() {
            C11548b bVar = new C11548b();
            try {
                f30839h.mo41310b("Updating the hostname cache");
                FutureTask futureTask = new FutureTask(bVar);
                new Thread(futureTask).start();
                futureTask.get(f30838g, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                m37763a((Exception) e);
            } catch (RuntimeException | ExecutionException | TimeoutException e2) {
                m37763a(e2);
            }
        }

        C11546b(long j, C11587a aVar, Callable<InetAddress> callable) {
            this.f30841b = "unavailable";
            this.f30843d = new AtomicBoolean(false);
            this.f30840a = j;
            this.f30844e = aVar;
            this.f30845f = callable;
        }

        /* renamed from: a */
        private void m37763a(Exception exc) {
            this.f30842c = this.f30844e.mo37825a() + TimeUnit.SECONDS.toMillis(1);
            f30839h.mo41307a("Localhost hostname lookup failed, keeping the value '{}'. If this persists it may mean your DNS is incorrectly configured and you may want to hardcode your server name: https://docs.sentry.io/clients/java/config/", this.f30841b, exc);
        }
    }

    public C11544c() {
        this(UUID.randomUUID());
    }

    /* renamed from: c */
    private void m37745c() {
        if (this.f30835a.mo37691s() == null) {
            this.f30835a.mo37659a(new Date());
        }
        if (this.f30835a.mo37685m() == null) {
            this.f30835a.mo37671d("java");
        }
        if (this.f30835a.mo37687o() == null) {
            this.f30835a.mo37663a(new C11549d("sentry-java", "1.7.29-4a3e2", this.f30837c));
        }
        if (this.f30835a.mo37689q() == null) {
            this.f30835a.mo37677f(f30834e.mo37710a());
        }
    }

    /* renamed from: d */
    private void m37746d() {
        C11542b bVar = this.f30835a;
        bVar.mo37672d(Collections.unmodifiableMap(bVar.mo37690r()));
        C11542b bVar2 = this.f30835a;
        bVar2.mo37660a((List<C11539a>) Collections.unmodifiableList(bVar2.mo37657a()));
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f30835a.mo37667c().entrySet()) {
            hashMap.put(next.getKey(), Collections.unmodifiableMap((Map) next.getValue()));
        }
        this.f30835a.mo37661a((Map<String, Map<String, Object>>) Collections.unmodifiableMap(hashMap));
        C11542b bVar3 = this.f30835a;
        bVar3.mo37666b(Collections.unmodifiableMap(bVar3.mo37678g()));
        C11542b bVar4 = this.f30835a;
        bVar4.mo37669c(Collections.unmodifiableMap(bVar4.mo37688p()));
    }

    /* renamed from: a */
    public C11544c mo37700a(C11542b.C11543a aVar) {
        this.f30835a.mo37662a(aVar);
        return this;
    }

    /* renamed from: b */
    public C11544c mo37704b(String str) {
        this.f30835a.mo37665b(str);
        return this;
    }

    /* renamed from: e */
    public C11544c mo37707e(String str) {
        this.f30837c.add(str);
        return this;
    }

    /* renamed from: f */
    public C11544c mo37708f(String str) {
        this.f30835a.mo37677f(str);
        return this;
    }

    public String toString() {
        return "EventBuilder{event=" + this.f30835a + ", alreadyBuilt=" + this.f30836b + '}';
    }

    public C11544c(UUID uuid) {
        this.f30836b = false;
        this.f30837c = new HashSet();
        this.f30835a = new C11542b(uuid);
    }

    /* renamed from: a */
    public C11544c mo37695a(String str) {
        this.f30835a.mo37658a(str);
        return this;
    }

    /* renamed from: b */
    public C11542b mo37703b() {
        return this.f30835a;
    }

    /* renamed from: a */
    public C11544c mo37697a(String str, String str2) {
        this.f30835a.mo37690r().put(str, str2);
        return this;
    }

    /* renamed from: a */
    public C11544c mo37698a(List<C11539a> list) {
        this.f30835a.mo37660a(list);
        return this;
    }

    /* renamed from: a */
    public C11544c mo37699a(Map<String, Map<String, Object>> map) {
        this.f30835a.mo37661a(map);
        return this;
    }

    /* renamed from: a */
    public C11544c mo37696a(String str, Object obj) {
        this.f30835a.mo37678g().put(str, obj);
        return this;
    }

    /* renamed from: a */
    public C11544c mo37701a(C11565h hVar) {
        mo37702a(hVar, true);
        return this;
    }

    /* renamed from: a */
    public C11544c mo37702a(C11565h hVar, boolean z) {
        if (z || !this.f30835a.mo37688p().containsKey(hVar.mo37724y())) {
            this.f30835a.mo37688p().put(hVar.mo37724y(), hVar);
        }
        return this;
    }

    /* renamed from: c */
    public C11544c mo37705c(String str) {
        this.f30835a.mo37668c(str);
        return this;
    }

    /* renamed from: d */
    public C11544c mo37706d(String str) {
        this.f30835a.mo37674e(str);
        return this;
    }

    /* renamed from: a */
    public synchronized C11542b mo37694a() {
        if (!this.f30836b) {
            m37745c();
            m37746d();
            this.f30836b = true;
        } else {
            throw new IllegalStateException("A message can't be built twice");
        }
        return this.f30835a;
    }
}
