package p120q.p121b;

import java.io.File;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;
import p036io.sentry.connection.C9036b;
import p036io.sentry.connection.C9040c;
import p036io.sentry.connection.C9045d;
import p036io.sentry.connection.C9048g;
import p036io.sentry.connection.C9051i;
import p036io.sentry.connection.C9052j;
import p036io.sentry.connection.C9053k;
import p036io.sentry.connection.C9054l;
import p036io.sentry.dsn.C9055a;
import p120q.p121b.p353h.C11509a;
import p120q.p121b.p353h.C11510b;
import p120q.p121b.p354i.C11515d;
import p120q.p121b.p357j.C11533b;
import p120q.p121b.p357j.C11535d;
import p120q.p121b.p359l.p361g.C11557a;
import p120q.p121b.p359l.p361g.C11559b;
import p120q.p121b.p359l.p361g.C11562e;
import p120q.p121b.p359l.p361g.C11563f;
import p120q.p121b.p359l.p361g.C11567j;
import p120q.p121b.p359l.p361g.C11568k;
import p120q.p121b.p362m.C11571b;
import p120q.p121b.p363n.C11573a;
import p120q.p121b.p363n.p364b.C11575a;
import p120q.p121b.p363n.p364b.C11576b;
import p120q.p121b.p363n.p364b.C11577c;
import p120q.p121b.p363n.p364b.C11579e;
import p120q.p121b.p363n.p364b.C11582f;
import p120q.p121b.p363n.p364b.C11584h;
import p120q.p121b.p363n.p364b.C11585i;
import p120q.p121b.p367q.C11591b;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: q.b.a */
/* compiled from: DefaultSentryClientFactory */
public class C5307a extends C5312d {

    /* renamed from: c */
    public static final int f9515c = ((int) TimeUnit.SECONDS.toMillis(1));

    /* renamed from: d */
    public static final int f9516d = ((int) TimeUnit.SECONDS.toMillis(5));

    /* renamed from: e */
    public static final long f9517e = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: f */
    public static final long f9518f = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: g */
    private static final C12938b f9519g = C12939c.m41777a((Class<?>) C5307a.class);

    /* renamed from: h */
    private static final String f9520h = Boolean.FALSE.toString();

    /* renamed from: i */
    private static final Map<String, RejectedExecutionHandler> f9521i;

    /* renamed from: q.b.a$b */
    /* compiled from: DefaultSentryClientFactory */
    protected static final class C5309b implements ThreadFactory {

        /* renamed from: j */
        private static final AtomicInteger f9522j = new AtomicInteger(1);

        /* renamed from: f */
        private final ThreadGroup f9523f;

        /* renamed from: g */
        private final AtomicInteger f9524g;

        /* renamed from: h */
        private final String f9525h;

        /* renamed from: i */
        private final int f9526i;

        public Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.f9523f;
            Thread thread = new Thread(threadGroup, runnable, this.f9525h + this.f9524g.getAndIncrement(), 0);
            if (!thread.isDaemon()) {
                thread.setDaemon(true);
            }
            int priority = thread.getPriority();
            int i = this.f9526i;
            if (priority != i) {
                thread.setPriority(i);
            }
            return thread;
        }

        private C5309b(int i) {
            this.f9524g = new AtomicInteger(1);
            SecurityManager securityManager = System.getSecurityManager();
            this.f9523f = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            this.f9525h = "sentry-pool-" + f9522j.getAndIncrement() + "-thread-";
            this.f9526i = i;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f9521i = hashMap;
        hashMap.put("sync", new ThreadPoolExecutor.CallerRunsPolicy());
        f9521i.put("discardnew", new ThreadPoolExecutor.DiscardPolicy());
        f9521i.put("discardold", new ThreadPoolExecutor.DiscardOldestPolicy());
    }

    public C5307a() {
        this(C11515d.m37672a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public Set<String> mo18465A(C9055a aVar) {
        String a = this.f9545a.mo37634a("mdctags", aVar);
        if (C11591b.m37917a(a)) {
            a = this.f9545a.mo37634a("extratags", aVar);
            if (!C11591b.m37917a(a)) {
                f9519g.mo41315c("The 'extratags' option is deprecated, please use the 'mdctags' option instead.");
            }
        }
        return C11591b.m37920c(a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public String mo18466B(C9055a aVar) {
        return this.f9545a.mo37634a("http.proxy.host", aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public String mo18467C(C9055a aVar) {
        return this.f9545a.mo37634a("http.proxy.password", aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public int mo18468D(C9055a aVar) {
        return C11591b.m37912a(this.f9545a.mo37634a("http.proxy.port", aVar), (Integer) 80).intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public String mo18469E(C9055a aVar) {
        return this.f9545a.mo37634a("http.proxy.user", aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public int mo18470F(C9055a aVar) {
        return C11591b.m37912a(this.f9545a.mo37634a("readtimeout", aVar), Integer.valueOf(f9516d)).intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public RejectedExecutionHandler mo18471G(C9055a aVar) {
        String a = this.f9545a.mo37634a("async.queue.overflow", aVar);
        String lowerCase = !C11591b.m37917a(a) ? a.toLowerCase() : "discardold";
        RejectedExecutionHandler rejectedExecutionHandler = f9521i.get(lowerCase);
        if (rejectedExecutionHandler != null) {
            return rejectedExecutionHandler;
        }
        String arrays = Arrays.toString(f9521i.keySet().toArray());
        throw new RuntimeException("RejectedExecutionHandler not found: '" + lowerCase + "', valid choices are: " + arrays);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public String mo18472H(C9055a aVar) {
        return this.f9545a.mo37634a("release", aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public Double mo18473I(C9055a aVar) {
        return C11591b.m37911a(this.f9545a.mo37634a("sample.rate", aVar), (Double) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public String mo18474J(C9055a aVar) {
        return this.f9545a.mo37634a("servername", aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public Map<String, String> mo18475K(C9055a aVar) {
        return C11591b.m37921d(this.f9545a.mo37634a("tags", aVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public int mo18476L(C9055a aVar) {
        return C11591b.m37912a(this.f9545a.mo37634a("timeout", aVar), Integer.valueOf(f9515c)).intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public boolean mo18477M(C9055a aVar) {
        return !f9520h.equalsIgnoreCase(this.f9545a.mo37634a("uncaught.handler.enabled", aVar));
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0024 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p120q.p121b.C5311c mo18479a(p036io.sentry.dsn.C9055a r5) {
        /*
            r4 = this;
            q.b.c r0 = new q.b.c     // Catch:{ RuntimeException -> 0x0037 }
            io.sentry.connection.d r1 = r4.mo18482b(r5)     // Catch:{ RuntimeException -> 0x0037 }
            q.b.j.b r2 = r4.mo18500t(r5)     // Catch:{ RuntimeException -> 0x0037 }
            r0.<init>(r1, r2)     // Catch:{ RuntimeException -> 0x0037 }
            java.lang.String r1 = "javax.servlet.ServletRequestListener"
            r2 = 0
            java.lang.Class r3 = r4.getClass()     // Catch:{ ClassNotFoundException -> 0x0024 }
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0024 }
            java.lang.Class.forName(r1, r2, r3)     // Catch:{ ClassNotFoundException -> 0x0024 }
            q.b.l.f.d r1 = new q.b.l.f.d     // Catch:{ ClassNotFoundException -> 0x0024 }
            r1.<init>()     // Catch:{ ClassNotFoundException -> 0x0024 }
            r0.mo18514a((p120q.p121b.p359l.p360f.C11553c) r1)     // Catch:{ ClassNotFoundException -> 0x0024 }
            goto L_0x002b
        L_0x0024:
            t.b.b r1 = f9519g     // Catch:{ RuntimeException -> 0x0037 }
            java.lang.String r2 = "The current environment doesn't provide access to servlets, or provides an unsupported version."
            r1.mo41310b(r2)     // Catch:{ RuntimeException -> 0x0037 }
        L_0x002b:
            q.b.l.f.b r1 = new q.b.l.f.b     // Catch:{ RuntimeException -> 0x0037 }
            r1.<init>(r0)     // Catch:{ RuntimeException -> 0x0037 }
            r0.mo18514a((p120q.p121b.p359l.p360f.C11553c) r1)     // Catch:{ RuntimeException -> 0x0037 }
            r4.mo18480a((p120q.p121b.C5311c) r0, (p036io.sentry.dsn.C9055a) r5)     // Catch:{ RuntimeException -> 0x0037 }
            return r0
        L_0x0037:
            r5 = move-exception
            t.b.b r0 = f9519g
            java.lang.String r1 = "Failed to initialize sentry, falling back to no-op client"
            r0.mo41308a((java.lang.String) r1, (java.lang.Throwable) r5)
            q.b.c r5 = new q.b.c
            io.sentry.connection.i r0 = new io.sentry.connection.i
            r0.<init>()
            q.b.j.d r1 = new q.b.j.d
            r1.<init>()
            r5.<init>(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q.p121b.C5307a.mo18479a(io.sentry.dsn.a):q.b.c");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C9045d mo18482b(C9055a aVar) {
        C9045d dVar;
        C11509a l;
        String c = aVar.mo33432c();
        if (c.equalsIgnoreCase("http") || c.equalsIgnoreCase(BuildConfig.APTOIDE_WEB_SERVICES_SCHEME)) {
            f9519g.mo41316c("Using an {} connection to Sentry.", (Object) c.toUpperCase());
            dVar = mo18483c(aVar);
        } else if (c.equalsIgnoreCase("out")) {
            f9519g.mo41310b("Using StdOut to send events.");
            dVar = mo18485e(aVar);
        } else if (c.equalsIgnoreCase("noop")) {
            f9519g.mo41310b("Using noop to send events.");
            dVar = new C9051i();
        } else {
            throw new IllegalStateException("Couldn't create a connection for the protocol '" + c + "'");
        }
        C9045d dVar2 = dVar;
        C9040c cVar = null;
        if (mo18493m(aVar) && (l = mo18492l(aVar)) != null) {
            cVar = new C9040c(dVar2, l, mo18494n(aVar), mo18496p(aVar), Long.valueOf(mo18497q(aVar)).longValue());
            dVar2 = cVar;
        }
        if (mo18486f(aVar)) {
            dVar2 = mo18478a(aVar, dVar2);
        }
        return cVar != null ? cVar.mo33407a(dVar2) : dVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C9045d mo18483c(C9055a aVar) {
        Proxy proxy;
        URL a = C9048g.m29733a(aVar.mo33437g(), aVar.mo33431b());
        String B = mo18466B(aVar);
        String E = mo18469E(aVar);
        String C = mo18467C(aVar);
        int D = mo18468D(aVar);
        if (B != null) {
            Proxy proxy2 = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(B, D));
            if (!(E == null || C == null)) {
                Authenticator.setDefault(new C9053k(E, C));
            }
            proxy = proxy2;
        } else {
            proxy = null;
        }
        Double I = mo18473I(aVar);
        C9048g gVar = new C9048g(a, aVar.mo33434e(), aVar.mo33436f(), proxy, I != null ? new C9054l(I.doubleValue()) : null);
        gVar.mo33417a(mo18484d(aVar));
        gVar.mo33416a(mo18476L(aVar));
        gVar.mo33420b(mo18470F(aVar));
        gVar.mo33418a(mo18498r(aVar));
        return gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C11573a mo18484d(C9055a aVar) {
        int z = mo18506z(aVar);
        C11579e a = mo18481a(z);
        C11584h hVar = new C11584h();
        hVar.mo37823a(mo18504x(aVar));
        hVar.mo37822a(mo18505y(aVar));
        a.mo37816a(C11567j.class, hVar);
        a.mo37816a(C11559b.class, new C11576b(hVar));
        a.mo37816a(C11563f.class, new C11582f(z));
        a.mo37816a(C11568k.class, new C11585i());
        a.mo37816a(C11557a.class, new C11575a());
        a.mo37816a(C11562e.class, new C11577c());
        a.mo37817a(mo18499s(aVar));
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C9045d mo18485e(C9055a aVar) {
        C9052j jVar = new C9052j(System.out);
        jVar.mo33427a(mo18484d(aVar));
        return jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo18486f(C9055a aVar) {
        return !f9520h.equalsIgnoreCase(this.f9545a.mo37634a("async", aVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo18487g(C9055a aVar) {
        return !f9520h.equalsIgnoreCase(this.f9545a.mo37634a("async.gracefulshutdown", aVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo18488h(C9055a aVar) {
        return C11591b.m37912a(this.f9545a.mo37634a("async.priority", aVar), (Integer) 1).intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo18489i(C9055a aVar) {
        return C11591b.m37912a(this.f9545a.mo37634a("async.queuesize", aVar), (Integer) 50).intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public long mo18490j(C9055a aVar) {
        return C11591b.m37913a(this.f9545a.mo37634a("async.shutdowntimeout", aVar), Long.valueOf(f9518f)).longValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public int mo18491k(C9055a aVar) {
        return C11591b.m37912a(this.f9545a.mo37634a("async.threads", aVar), Integer.valueOf(Runtime.getRuntime().availableProcessors())).intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C11509a mo18492l(C9055a aVar) {
        String a = this.f9545a.mo37634a("buffer.dir", aVar);
        if (a != null) {
            return new C11510b(new File(a), mo18495o(aVar));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo18493m(C9055a aVar) {
        String a = this.f9545a.mo37634a("buffer.enabled", aVar);
        if (a != null) {
            return Boolean.parseBoolean(a);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public long mo18494n(C9055a aVar) {
        return C11591b.m37913a(this.f9545a.mo37634a("buffer.flushtime", aVar), (Long) 60000L).longValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public int mo18495o(C9055a aVar) {
        return C11591b.m37912a(this.f9545a.mo37634a("buffer.size", aVar), (Integer) 10).intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo18496p(C9055a aVar) {
        return !f9520h.equalsIgnoreCase(this.f9545a.mo37634a("buffer.gracefulshutdown", aVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public long mo18497q(C9055a aVar) {
        return C11591b.m37913a(this.f9545a.mo37634a("buffer.shutdowntimeout", aVar), Long.valueOf(f9517e)).longValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo18498r(C9055a aVar) {
        return aVar.mo33433d().contains("naive");
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo18499s(C9055a aVar) {
        return !f9520h.equalsIgnoreCase(this.f9545a.mo37634a("compression", aVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public C11533b mo18500t(C9055a aVar) {
        return new C11535d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public String mo18501u(C9055a aVar) {
        return this.f9545a.mo37634a("dist", aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public String mo18502v(C9055a aVar) {
        return this.f9545a.mo37634a("environment", aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public Map<String, String> mo18503w(C9055a aVar) {
        return C11591b.m37919b(this.f9545a.mo37634a("extra", aVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public boolean mo18504x(C9055a aVar) {
        return !f9520h.equalsIgnoreCase(this.f9545a.mo37634a("stacktrace.hidecommon", aVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public Collection<String> mo18505y(C9055a aVar) {
        String a = this.f9545a.mo37634a("stacktrace.app.packages", aVar);
        if (C11591b.m37917a(a)) {
            if (a == null) {
                f9519g.mo41315c("No 'stacktrace.app.packages' was configured, this option is highly recommended as it affects stacktrace grouping and display on Sentry. See documentation: https://docs.sentry.io/clients/java/config/#in-application-stack-frames");
            }
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : a.split(",")) {
            if (!str.trim().equals("")) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int mo18506z(C9055a aVar) {
        return C11591b.m37912a(this.f9545a.mo37634a("maxmessagelength", aVar), (Integer) 1000).intValue();
    }

    public C5307a(C11515d dVar) {
        super(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C5311c mo18480a(C5311c cVar, C9055a aVar) {
        String H = mo18472H(aVar);
        if (H != null) {
            cVar.mo18520d(H);
        }
        String u = mo18501u(aVar);
        if (u != null) {
            cVar.mo18516b(u);
        }
        String v = mo18502v(aVar);
        if (v != null) {
            cVar.mo18518c(v);
        }
        String J = mo18474J(aVar);
        if (J != null) {
            cVar.mo18521e(J);
        }
        Map<String, String> K = mo18475K(aVar);
        if (!K.isEmpty()) {
            for (Map.Entry next : K.entrySet()) {
                cVar.mo18512a((String) next.getKey(), (String) next.getValue());
            }
        }
        Set<String> A = mo18465A(aVar);
        if (!A.isEmpty()) {
            for (String a : A) {
                cVar.mo18510a(a);
            }
        }
        Map<String, String> w = mo18503w(aVar);
        if (!w.isEmpty()) {
            for (Map.Entry next2 : w.entrySet()) {
                cVar.mo18511a((String) next2.getKey(), next2.getValue());
            }
        }
        if (mo18477M(aVar)) {
            cVar.mo18515b();
        }
        for (String a2 : mo18505y(aVar)) {
            C11571b.m37844a(a2);
        }
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9045d mo18478a(C9055a aVar, C9045d dVar) {
        LinkedBlockingDeque linkedBlockingDeque;
        int k = mo18491k(aVar);
        int h = mo18488h(aVar);
        int i = mo18489i(aVar);
        if (i == -1) {
            linkedBlockingDeque = new LinkedBlockingDeque();
        } else {
            linkedBlockingDeque = new LinkedBlockingDeque(i);
        }
        return new C9036b(dVar, new ThreadPoolExecutor(k, k, 0, TimeUnit.MILLISECONDS, linkedBlockingDeque, new C5309b(h), mo18471G(aVar)), mo18487g(aVar), mo18490j(aVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C11579e mo18481a(int i) {
        return new C11579e(i);
    }
}
