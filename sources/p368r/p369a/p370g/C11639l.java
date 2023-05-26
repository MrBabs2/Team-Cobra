package p368r.p369a.p370g;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.Serializable;
import java.net.DatagramPacket;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import p368r.p369a.C11592a;
import p368r.p369a.C11597c;
import p368r.p369a.C11598d;
import p368r.p369a.C11600e;
import p368r.p369a.p370g.C11620h;
import p368r.p369a.p370g.C11631j;
import p368r.p369a.p370g.C11651m;
import p368r.p369a.p370g.p371s.C11666a;
import p368r.p369a.p370g.p371s.C11669d;
import p368r.p369a.p370g.p371s.C11670e;
import p368r.p369a.p370g.p371s.C11672g;
import p368r.p369a.p370g.p372t.C11675a;
import p368r.p369a.p370g.p375u.C11686a;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: r.a.g.l */
/* compiled from: JmDNSImpl */
public class C11639l extends C11592a implements C11628i, C11631j {

    /* renamed from: A */
    private static final Random f31021A = new Random();

    /* renamed from: z */
    private static C12938b f31022z = C12939c.m41778a(C11639l.class.getName());

    /* renamed from: f */
    private volatile InetAddress f31023f;

    /* renamed from: g */
    private volatile MulticastSocket f31024g;

    /* renamed from: h */
    private final List<C11607d> f31025h;

    /* renamed from: i */
    final ConcurrentMap<String, List<C11651m.C11652a>> f31026i;

    /* renamed from: j */
    private final Set<C11651m.C11653b> f31027j;

    /* renamed from: k */
    private final C11602a f31028k;

    /* renamed from: l */
    private final ConcurrentMap<String, C11598d> f31029l;

    /* renamed from: m */
    private final ConcurrentMap<String, C11649j> f31030m;

    /* renamed from: n */
    private volatile C11592a.C11593a f31031n;

    /* renamed from: o */
    protected Thread f31032o;

    /* renamed from: p */
    private C11636k f31033p;

    /* renamed from: q */
    private Thread f31034q;

    /* renamed from: r */
    private int f31035r;

    /* renamed from: s */
    private long f31036s;

    /* renamed from: t */
    private final ExecutorService f31037t = Executors.newSingleThreadExecutor(new C11686a("JmDNS"));

    /* renamed from: u */
    private final ReentrantLock f31038u = new ReentrantLock();

    /* renamed from: v */
    private C11604c f31039v;

    /* renamed from: w */
    private final ConcurrentMap<String, C11648i> f31040w;

    /* renamed from: x */
    private final String f31041x;

    /* renamed from: y */
    private final Object f31042y = new Object();

    /* renamed from: r.a.g.l$a */
    /* compiled from: JmDNSImpl */
    class C11640a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C11651m.C11652a f31043f;

        /* renamed from: g */
        final /* synthetic */ C11597c f31044g;

        C11640a(C11651m.C11652a aVar, C11597c cVar) {
            this.f31043f = aVar;
            this.f31044g = cVar;
        }

        public void run() {
            this.f31043f.mo38151c(this.f31044g);
        }
    }

    /* renamed from: r.a.g.l$b */
    /* compiled from: JmDNSImpl */
    class C11641b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C11651m.C11653b f31046f;

        /* renamed from: g */
        final /* synthetic */ C11597c f31047g;

        C11641b(C11651m.C11653b bVar, C11597c cVar) {
            this.f31046f = bVar;
            this.f31047g = cVar;
        }

        public void run() {
            this.f31046f.mo38152a(this.f31047g);
        }
    }

    /* renamed from: r.a.g.l$c */
    /* compiled from: JmDNSImpl */
    class C11642c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C11651m.C11653b f31049f;

        /* renamed from: g */
        final /* synthetic */ C11597c f31050g;

        C11642c(C11651m.C11653b bVar, C11597c cVar) {
            this.f31049f = bVar;
            this.f31050g = cVar;
        }

        public void run() {
            this.f31049f.mo38153b(this.f31050g);
        }
    }

    /* renamed from: r.a.g.l$d */
    /* compiled from: JmDNSImpl */
    class C11643d implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C11651m.C11652a f31052f;

        /* renamed from: g */
        final /* synthetic */ C11597c f31053g;

        C11643d(C11651m.C11652a aVar, C11597c cVar) {
            this.f31052f = aVar;
            this.f31053g = cVar;
        }

        public void run() {
            this.f31052f.mo38149a(this.f31053g);
        }
    }

    /* renamed from: r.a.g.l$e */
    /* compiled from: JmDNSImpl */
    class C11644e implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C11651m.C11652a f31055f;

        /* renamed from: g */
        final /* synthetic */ C11597c f31056g;

        C11644e(C11651m.C11652a aVar, C11597c cVar) {
            this.f31055f = aVar;
            this.f31056g = cVar;
        }

        public void run() {
            this.f31055f.mo38150b(this.f31056g);
        }
    }

    /* renamed from: r.a.g.l$f */
    /* compiled from: JmDNSImpl */
    class C11645f extends Thread {
        C11645f(String str) {
            super(str);
        }

        public void run() {
            C11639l.this.mo38117u();
        }
    }

    /* renamed from: r.a.g.l$g */
    /* compiled from: JmDNSImpl */
    static /* synthetic */ class C11646g {

        /* renamed from: a */
        static final /* synthetic */ int[] f31059a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                r.a.g.l$h[] r0 = p368r.p369a.p370g.C11639l.C11647h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31059a = r0
                r.a.g.l$h r1 = p368r.p369a.p370g.C11639l.C11647h.Add     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31059a     // Catch:{ NoSuchFieldError -> 0x001d }
                r.a.g.l$h r1 = p368r.p369a.p370g.C11639l.C11647h.Remove     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p368r.p369a.p370g.C11639l.C11646g.<clinit>():void");
        }
    }

    /* renamed from: r.a.g.l$h */
    /* compiled from: JmDNSImpl */
    public enum C11647h {
        Remove,
        Update,
        Add,
        RegisterServiceType,
        Noop
    }

    /* renamed from: r.a.g.l$i */
    /* compiled from: JmDNSImpl */
    private static class C11648i implements C11600e {

        /* renamed from: a */
        private final ConcurrentMap<String, C11598d> f31066a = new ConcurrentHashMap();

        /* renamed from: b */
        private final ConcurrentMap<String, C11597c> f31067b = new ConcurrentHashMap();

        /* renamed from: c */
        private final String f31068c;

        public C11648i(String str) {
            this.f31068c = str;
        }

        public void serviceAdded(C11597c cVar) {
            synchronized (this) {
                C11598d c = cVar.mo37847c();
                if (c == null || !c.mo37868u()) {
                    C11662q b = ((C11639l) cVar.mo37846b()).mo38103b(cVar.mo37850f(), cVar.mo37849e(), c != null ? c.mo37864n() : "", true);
                    if (b != null) {
                        this.f31066a.put(cVar.mo37849e(), b);
                    } else {
                        this.f31067b.put(cVar.mo37849e(), cVar);
                    }
                } else {
                    this.f31066a.put(cVar.mo37849e(), c);
                }
            }
        }

        public void serviceRemoved(C11597c cVar) {
            synchronized (this) {
                this.f31066a.remove(cVar.mo37849e());
                this.f31067b.remove(cVar.mo37849e());
            }
        }

        public void serviceResolved(C11597c cVar) {
            synchronized (this) {
                this.f31066a.put(cVar.mo37849e(), cVar.mo37847c());
                this.f31067b.remove(cVar.mo37849e());
            }
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("\n\tType: ");
            stringBuffer.append(this.f31068c);
            if (this.f31066a.isEmpty()) {
                stringBuffer.append("\n\tNo services collected.");
            } else {
                stringBuffer.append("\n\tServices");
                for (String str : this.f31066a.keySet()) {
                    stringBuffer.append("\n\t\tService: ");
                    stringBuffer.append(str);
                    stringBuffer.append(": ");
                    stringBuffer.append(this.f31066a.get(str));
                }
            }
            if (this.f31067b.isEmpty()) {
                stringBuffer.append("\n\tNo event queued.");
            } else {
                stringBuffer.append("\n\tEvents");
                for (String str2 : this.f31067b.keySet()) {
                    stringBuffer.append("\n\t\tEvent: ");
                    stringBuffer.append(str2);
                    stringBuffer.append(": ");
                    stringBuffer.append(this.f31067b.get(str2));
                }
            }
            return stringBuffer.toString();
        }
    }

    /* renamed from: r.a.g.l$j */
    /* compiled from: JmDNSImpl */
    public static class C11649j extends AbstractMap<String, String> implements Cloneable {

        /* renamed from: f */
        private final Set<Map.Entry<String, String>> f31069f = new HashSet();

        /* renamed from: g */
        private final String f31070g;

        /* renamed from: r.a.g.l$j$a */
        /* compiled from: JmDNSImpl */
        private static class C11650a implements Map.Entry<String, String>, Serializable, Cloneable {

            /* renamed from: f */
            private final String f31071f;

            /* renamed from: g */
            private final String f31072g;

            public C11650a(String str) {
                str = str == null ? "" : str;
                this.f31072g = str;
                this.f31071f = str.toLowerCase();
            }

            /* renamed from: a */
            public String mo38136a(String str) {
                throw new UnsupportedOperationException();
            }

            public C11650a clone() {
                return this;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!getKey().equals(entry.getKey()) || !getValue().equals(entry.getValue())) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                String str = this.f31071f;
                int i = 0;
                int hashCode = str == null ? 0 : str.hashCode();
                String str2 = this.f31072g;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                return hashCode ^ i;
            }

            public /* bridge */ /* synthetic */ Object setValue(Object obj) {
                mo38136a((String) obj);
                throw null;
            }

            public String toString() {
                return this.f31071f + "=" + this.f31072g;
            }

            public String getKey() {
                return this.f31071f;
            }

            public String getValue() {
                return this.f31072g;
            }
        }

        public C11649j(String str) {
            this.f31070g = str;
        }

        /* renamed from: a */
        public boolean mo38130a(String str) {
            if (str == null || mo38132b(str)) {
                return false;
            }
            this.f31069f.add(new C11650a(str));
            return true;
        }

        /* renamed from: b */
        public String mo38131b() {
            return this.f31070g;
        }

        public Set<Map.Entry<String, String>> entrySet() {
            return this.f31069f;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(200);
            if (isEmpty()) {
                sb.append("empty");
            } else {
                for (String append : values()) {
                    sb.append(append);
                    sb.append(", ");
                }
                sb.setLength(sb.length() - 2);
            }
            return sb.toString();
        }

        /* renamed from: b */
        public boolean mo38132b(String str) {
            return str != null && containsKey(str.toLowerCase());
        }

        public C11649j clone() {
            C11649j jVar = new C11649j(mo38131b());
            for (Map.Entry<String, String> value : entrySet()) {
                jVar.mo38130a((String) value.getValue());
            }
            return jVar;
        }
    }

    public C11639l(InetAddress inetAddress, String str) throws IOException {
        if (f31022z.mo41309a()) {
            f31022z.mo41310b("JmDNS instance created");
        }
        this.f31028k = new C11602a(100);
        this.f31025h = Collections.synchronizedList(new ArrayList());
        this.f31026i = new ConcurrentHashMap();
        this.f31027j = Collections.synchronizedSet(new HashSet());
        this.f31040w = new ConcurrentHashMap();
        this.f31029l = new ConcurrentHashMap(20);
        this.f31030m = new ConcurrentHashMap(20);
        C11636k a = C11636k.m38191a(inetAddress, this, str);
        this.f31033p = a;
        this.f31041x = str == null ? a.mo38061g() : str;
        m38230a(mo38076E());
        m38229a((Collection<? extends C11598d>) mo38079H().values());
        mo38030l();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:5|6|7|9|10|(3:2f|28|11)|32|34|37) */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005a, code lost:
        f31022z.mo41318c("closeMulticastSocket() Close socket exception ", (java.lang.Throwable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0053 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001e */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002f A[Catch:{ Exception -> 0x001c }] */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m38223U() {
        /*
            r4 = this;
            t.b.b r0 = f31022z
            boolean r0 = r0.mo41309a()
            if (r0 == 0) goto L_0x000f
            t.b.b r0 = f31022z
            java.lang.String r1 = "closeMulticastSocket()"
            r0.mo41310b(r1)
        L_0x000f:
            java.net.MulticastSocket r0 = r4.f31024g
            if (r0 == 0) goto L_0x0063
            r0 = 0
            java.net.MulticastSocket r1 = r4.f31024g     // Catch:{ SocketException -> 0x001e }
            java.net.InetAddress r2 = r4.f31023f     // Catch:{ SocketException -> 0x001e }
            r1.leaveGroup(r2)     // Catch:{ SocketException -> 0x001e }
            goto L_0x001e
        L_0x001c:
            r1 = move-exception
            goto L_0x005a
        L_0x001e:
            java.net.MulticastSocket r1 = r4.f31024g     // Catch:{ Exception -> 0x001c }
            r1.close()     // Catch:{ Exception -> 0x001c }
        L_0x0023:
            java.lang.Thread r1 = r4.f31034q     // Catch:{ Exception -> 0x001c }
            if (r1 == 0) goto L_0x0057
            java.lang.Thread r1 = r4.f31034q     // Catch:{ Exception -> 0x001c }
            boolean r1 = r1.isAlive()     // Catch:{ Exception -> 0x001c }
            if (r1 == 0) goto L_0x0057
            monitor-enter(r4)     // Catch:{ Exception -> 0x001c }
            java.lang.Thread r1 = r4.f31034q     // Catch:{ InterruptedException -> 0x0053 }
            if (r1 == 0) goto L_0x0053
            java.lang.Thread r1 = r4.f31034q     // Catch:{ InterruptedException -> 0x0053 }
            boolean r1 = r1.isAlive()     // Catch:{ InterruptedException -> 0x0053 }
            if (r1 == 0) goto L_0x0053
            t.b.b r1 = f31022z     // Catch:{ InterruptedException -> 0x0053 }
            boolean r1 = r1.mo41309a()     // Catch:{ InterruptedException -> 0x0053 }
            if (r1 == 0) goto L_0x004b
            t.b.b r1 = f31022z     // Catch:{ InterruptedException -> 0x0053 }
            java.lang.String r2 = "closeMulticastSocket(): waiting for jmDNS monitor"
            r1.mo41310b(r2)     // Catch:{ InterruptedException -> 0x0053 }
        L_0x004b:
            r1 = 1000(0x3e8, double:4.94E-321)
            r4.wait(r1)     // Catch:{ InterruptedException -> 0x0053 }
            goto L_0x0053
        L_0x0051:
            r1 = move-exception
            goto L_0x0055
        L_0x0053:
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            goto L_0x0023
        L_0x0055:
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            throw r1     // Catch:{ Exception -> 0x001c }
        L_0x0057:
            r4.f31034q = r0     // Catch:{ Exception -> 0x001c }
            goto L_0x0061
        L_0x005a:
            t.b.b r2 = f31022z
            java.lang.String r3 = "closeMulticastSocket() Close socket exception "
            r2.mo41318c((java.lang.String) r3, (java.lang.Throwable) r1)
        L_0x0061:
            r4.f31024g = r0
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p368r.p369a.p370g.C11639l.m38223U():void");
    }

    /* renamed from: V */
    private void m38224V() {
        if (f31022z.mo41309a()) {
            f31022z.mo41310b("disposeServiceCollectors()");
        }
        for (String str : this.f31040w.keySet()) {
            C11648i iVar = (C11648i) this.f31040w.get(str);
            if (iVar != null) {
                mo38104b(str, (C11600e) iVar);
                this.f31040w.remove(str, iVar);
            }
        }
    }

    /* renamed from: W */
    public static Random m38225W() {
        return f31021A;
    }

    /* renamed from: a */
    private void m38229a(Collection<? extends C11598d> collection) {
        if (this.f31034q == null) {
            C11665r rVar = new C11665r(this);
            this.f31034q = rVar;
            rVar.start();
        }
        mo38031m();
        for (C11598d qVar : collection) {
            try {
                mo38096a((C11598d) new C11662q(qVar));
            } catch (Exception e) {
                f31022z.mo41318c("start() Registration exception ", (Throwable) e);
            }
        }
    }

    /* renamed from: A */
    public C11639l mo38072A() {
        return this;
    }

    /* renamed from: B */
    public InetAddress mo38073B() {
        return this.f31023f;
    }

    /* renamed from: C */
    public InetAddress mo38074C() throws IOException {
        return this.f31033p.mo38059e();
    }

    /* renamed from: D */
    public long mo38075D() {
        return this.f31036s;
    }

    /* renamed from: E */
    public C11636k mo38076E() {
        return this.f31033p;
    }

    /* renamed from: F */
    public String mo38077F() {
        return this.f31041x;
    }

    /* renamed from: G */
    public Map<String, C11649j> mo38078G() {
        return this.f31030m;
    }

    /* renamed from: H */
    public Map<String, C11598d> mo38079H() {
        return this.f31029l;
    }

    /* renamed from: I */
    public MulticastSocket mo38080I() {
        return this.f31024g;
    }

    /* renamed from: J */
    public int mo38081J() {
        return this.f31035r;
    }

    /* renamed from: K */
    public void mo38082K() {
        this.f31038u.lock();
    }

    /* renamed from: L */
    public void mo38083L() {
        this.f31038u.unlock();
    }

    /* renamed from: M */
    public boolean mo38084M() {
        return this.f31033p.mo38063i();
    }

    /* renamed from: N */
    public boolean mo38085N() {
        return this.f31033p.mo38064j();
    }

    /* renamed from: O */
    public boolean mo38086O() {
        return this.f31033p.mo38065k();
    }

    /* renamed from: P */
    public boolean mo38087P() {
        return this.f31033p.mo38067m();
    }

    /* renamed from: Q */
    public boolean mo38088Q() {
        return this.f31033p.mo38068n();
    }

    /* renamed from: R */
    public void mo38089R() {
        C12938b bVar = f31022z;
        bVar.mo41310b(mo38077F() + "recover()");
        if (!mo38087P() && !isClosed() && !mo38086O() && !mo38085N()) {
            synchronized (this.f31042y) {
                if (mo38118v()) {
                    C12938b bVar2 = f31022z;
                    bVar2.mo41310b(mo38077F() + "recover() thread " + Thread.currentThread().getName());
                    StringBuilder sb = new StringBuilder();
                    sb.append(mo38077F());
                    sb.append(".recover()");
                    new C11645f(sb.toString()).start();
                }
            }
        }
    }

    /* renamed from: S */
    public boolean mo38090S() {
        return this.f31033p.mo38069o();
    }

    /* renamed from: T */
    public boolean mo38091T() {
        return this.f31033p.mo38070p();
    }

    /* renamed from: b */
    public void mo38107b(C11675a aVar) {
        this.f31033p.mo38053b(aVar);
    }

    public void close() {
        if (!mo38087P()) {
            if (f31022z.mo41309a()) {
                C12938b bVar = f31022z;
                bVar.mo41310b("Cancelling JmDNS: " + this);
            }
            if (mo38120x()) {
                f31022z.mo41310b("Canceling the timer");
                mo38028d();
                mo37842t();
                m38224V();
                if (f31022z.mo41309a()) {
                    C12938b bVar2 = f31022z;
                    bVar2.mo41310b("Wait for JmDNS cancel: " + this);
                }
                mo38115j(5000);
                f31022z.mo41310b("Canceling the state timer");
                mo38027b();
                this.f31037t.shutdown();
                m38223U();
                if (this.f31032o != null) {
                    Runtime.getRuntime().removeShutdownHook(this.f31032o);
                }
                C11631j.C11634b a = C11631j.C11634b.m38185a();
                mo38072A();
                a.mo38042a(this);
                if (f31022z.mo41309a()) {
                    f31022z.mo41310b("JmDNS closed.");
                }
            }
            mo37998a((C11675a) null);
        }
    }

    /* renamed from: d */
    public boolean mo38111d(String str) {
        String str2;
        String str3;
        boolean z;
        C11649j jVar;
        String str4;
        Map<C11598d.C11599a, String> c = C11662q.m38323c(str);
        String str5 = c.get(C11598d.C11599a.Domain);
        String str6 = c.get(C11598d.C11599a.Protocol);
        String str7 = c.get(C11598d.C11599a.Application);
        String str8 = c.get(C11598d.C11599a.Subtype);
        StringBuilder sb = new StringBuilder();
        if (str7.length() > 0) {
            str2 = "_" + str7 + ".";
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (str6.length() > 0) {
            str3 = "_" + str6 + ".";
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(str5);
        sb.append(".");
        String sb2 = sb.toString();
        String lowerCase = sb2.toLowerCase();
        if (f31022z.mo41309a()) {
            C12938b bVar = f31022z;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(mo38077F());
            sb3.append(".registering service type: ");
            sb3.append(str);
            sb3.append(" as: ");
            sb3.append(sb2);
            if (str8.length() > 0) {
                str4 = " subtype: " + str8;
            } else {
                str4 = "";
            }
            sb3.append(str4);
            bVar.mo41310b(sb3.toString());
        }
        boolean z2 = true;
        if (this.f31030m.containsKey(lowerCase) || str7.toLowerCase().equals("dns-sd") || str5.toLowerCase().endsWith("in-addr.arpa") || str5.toLowerCase().endsWith("ip6.arpa")) {
            z = false;
        } else {
            z = this.f31030m.putIfAbsent(lowerCase, new C11649j(sb2)) == null;
            if (z) {
                Set<C11651m.C11653b> set = this.f31027j;
                C11651m.C11653b[] bVarArr = (C11651m.C11653b[]) set.toArray(new C11651m.C11653b[set.size()]);
                C11661p pVar = new C11661p(this, sb2, "", (C11598d) null);
                for (C11651m.C11653b bVar2 : bVarArr) {
                    this.f31037t.submit(new C11641b(bVar2, pVar));
                }
            }
        }
        if (str8.length() <= 0 || (jVar = (C11649j) this.f31030m.get(lowerCase)) == null || jVar.mo38132b(str8)) {
            return z;
        }
        synchronized (jVar) {
            if (!jVar.mo38132b(str8)) {
                jVar.mo38130a(str8);
                C11651m.C11653b[] bVarArr2 = (C11651m.C11653b[]) this.f31027j.toArray(new C11651m.C11653b[this.f31027j.size()]);
                C11661p pVar2 = new C11661p(this, "_" + str8 + "._sub." + sb2, "", (C11598d) null);
                for (C11651m.C11653b cVar : bVarArr2) {
                    this.f31037t.submit(new C11642c(cVar, pVar2));
                }
            } else {
                z2 = z;
            }
        }
        return z2;
    }

    /* renamed from: e */
    public void mo38112e(String str) {
        if (this.f31040w.containsKey(str.toLowerCase())) {
            mo38024a(str);
        }
    }

    /* renamed from: g */
    public boolean mo38113g(long j) {
        return this.f31033p.mo38049a(j);
    }

    /* renamed from: i */
    public void mo38029i() {
        C11631j.C11634b a = C11631j.C11634b.m38185a();
        mo38072A();
        a.mo38043b(this).mo38029i();
    }

    public boolean isClosed() {
        return this.f31033p.mo38066l();
    }

    /* renamed from: j */
    public boolean mo38115j(long j) {
        return this.f31033p.mo38055b(j);
    }

    /* renamed from: l */
    public void mo38030l() {
        C11631j.C11634b a = C11631j.C11634b.m38185a();
        mo38072A();
        a.mo38043b(this).mo38030l();
    }

    /* renamed from: m */
    public void mo38031m() {
        C11631j.C11634b a = C11631j.C11634b.m38185a();
        mo38072A();
        a.mo38043b(this).mo38031m();
    }

    /* renamed from: o */
    public void mo38032o() {
        C11631j.C11634b a = C11631j.C11634b.m38185a();
        mo38072A();
        a.mo38043b(this).mo38032o();
    }

    /* renamed from: p */
    public void mo38033p() {
        C11631j.C11634b a = C11631j.C11634b.m38185a();
        mo38072A();
        a.mo38043b(this).mo38033p();
    }

    /* renamed from: q */
    public void mo38034q() {
        C11631j.C11634b a = C11631j.C11634b.m38185a();
        mo38072A();
        a.mo38043b(this).mo38034q();
    }

    /* renamed from: t */
    public void mo37842t() {
        if (f31022z.mo41309a()) {
            f31022z.mo41310b("unregisterAllServices()");
        }
        for (String str : this.f31029l.keySet()) {
            C11662q qVar = (C11662q) this.f31029l.get(str);
            if (qVar != null) {
                if (f31022z.mo41309a()) {
                    C12938b bVar = f31022z;
                    bVar.mo41310b("Cancelling service info: " + qVar);
                }
                qVar.mo38185x();
            }
        }
        mo38029i();
        for (String str2 : this.f31029l.keySet()) {
            C11662q qVar2 = (C11662q) this.f31029l.get(str2);
            if (qVar2 != null) {
                if (f31022z.mo41309a()) {
                    C12938b bVar2 = f31022z;
                    bVar2.mo41310b("Wait for service info cancel: " + qVar2);
                }
                qVar2.mo38180b(5000);
                this.f31029l.remove(str2, qVar2);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(RecyclerView.C0638l.FLAG_MOVED);
        sb.append("\n");
        sb.append("\t---- Local Host -----");
        sb.append("\n\t");
        sb.append(this.f31033p);
        sb.append("\n\t---- Services -----");
        for (String str : this.f31029l.keySet()) {
            sb.append("\n\t\tService: ");
            sb.append(str);
            sb.append(": ");
            sb.append(this.f31029l.get(str));
        }
        sb.append("\n");
        sb.append("\t---- Types ----");
        for (String str2 : this.f31030m.keySet()) {
            C11649j jVar = (C11649j) this.f31030m.get(str2);
            sb.append("\n\t\tType: ");
            sb.append(jVar.mo38131b());
            sb.append(": ");
            sb.append(jVar.isEmpty() ? "no subtypes" : jVar);
        }
        sb.append("\n");
        sb.append(this.f31028k.toString());
        sb.append("\n");
        sb.append("\t---- Service Collectors ----");
        for (String str3 : this.f31040w.keySet()) {
            sb.append("\n\t\tService Collector: ");
            sb.append(str3);
            sb.append(": ");
            sb.append(this.f31040w.get(str3));
        }
        sb.append("\n");
        sb.append("\t---- Service Listeners ----");
        for (String str4 : this.f31026i.keySet()) {
            sb.append("\n\t\tService Listener: ");
            sb.append(str4);
            sb.append(": ");
            sb.append(this.f31026i.get(str4));
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo38117u() {
        if (f31022z.mo41309a()) {
            C12938b bVar = f31022z;
            bVar.mo41310b(mo38077F() + "recover() Cleanning up");
        }
        f31022z.mo41315c("RECOVERING");
        mo38023a();
        ArrayList<C11598d> arrayList = new ArrayList<>(mo38079H().values());
        mo37842t();
        m38224V();
        mo38115j(5000);
        mo38033p();
        m38223U();
        mo38121y().clear();
        if (f31022z.mo41309a()) {
            C12938b bVar2 = f31022z;
            bVar2.mo41310b(mo38077F() + "recover() All is clean");
        }
        if (mo38085N()) {
            for (C11598d dVar : arrayList) {
                ((C11662q) dVar).mo38166I();
            }
            mo38090S();
            try {
                m38230a(mo38076E());
                m38229a((Collection<? extends C11598d>) arrayList);
            } catch (Exception e) {
                C12938b bVar3 = f31022z;
                bVar3.mo41318c(mo38077F() + "recover() Start services exception ", (Throwable) e);
            }
            C12938b bVar4 = f31022z;
            bVar4.mo41315c(mo38077F() + "recover() We are back!");
            return;
        }
        C12938b bVar5 = f31022z;
        bVar5.mo41315c(mo38077F() + "recover() Could not recover we are Down!");
        if (mo38122z() != null) {
            C11592a.C11593a z = mo38122z();
            mo38072A();
            z.mo37843a(this, arrayList);
        }
    }

    /* renamed from: v */
    public boolean mo38118v() {
        return this.f31033p.mo38048a();
    }

    /* renamed from: w */
    public void mo38119w() {
        long currentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet();
        for (C11603b next : mo38121y().mo37872a()) {
            try {
                C11620h hVar = (C11620h) next;
                if (hVar.mo37886a(currentTimeMillis)) {
                    mo38094a(currentTimeMillis, hVar, C11647h.Remove);
                    mo38121y().mo37879c(hVar);
                } else if (hVar.mo37982d(currentTimeMillis)) {
                    hVar.mo37988r();
                    String lowerCase = hVar.mo37986p().mo37866r().toLowerCase();
                    if (hashSet.add(lowerCase)) {
                        mo38112e(lowerCase);
                    }
                }
            } catch (Exception e) {
                C12938b bVar = f31022z;
                bVar.mo41318c(mo38077F() + ".Error while reaping records: " + next, (Throwable) e);
                f31022z.mo41315c(toString());
            }
        }
    }

    /* renamed from: x */
    public boolean mo38120x() {
        return this.f31033p.mo38054b();
    }

    /* renamed from: y */
    public C11602a mo38121y() {
        return this.f31028k;
    }

    /* renamed from: z */
    public C11592a.C11593a mo38122z() {
        return this.f31031n;
    }

    /* renamed from: b */
    public boolean mo38108b(C11675a aVar, C11672g gVar) {
        return this.f31033p.mo38056b(aVar, gVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C11662q mo38103b(String str, String str2, String str3, boolean z) {
        mo38119w();
        String lowerCase = str.toLowerCase();
        mo38111d(str);
        if (this.f31040w.putIfAbsent(lowerCase, new C11648i(str)) == null) {
            m38228a(lowerCase, (C11600e) this.f31040w.get(lowerCase), true);
        }
        C11662q a = mo38092a(str, str2, str3, z);
        mo38026a(a);
        return a;
    }

    /* renamed from: a */
    private void m38230a(C11636k kVar) throws IOException {
        if (this.f31023f == null) {
            if (kVar.mo38059e() instanceof Inet6Address) {
                this.f31023f = InetAddress.getByName("FF02::FB");
            } else {
                this.f31023f = InetAddress.getByName("224.0.0.251");
            }
        }
        if (this.f31024g != null) {
            m38223U();
        }
        this.f31024g = new MulticastSocket(C11666a.f31110a);
        if (!(kVar == null || kVar.mo38060f() == null)) {
            try {
                this.f31024g.setNetworkInterface(kVar.mo38060f());
            } catch (SocketException e) {
                if (f31022z.mo41309a()) {
                    C12938b bVar = f31022z;
                    bVar.mo41310b("openMulticastSocket() Set network interface exception: " + e.getMessage());
                }
            }
        }
        this.f31024g.setTimeToLive(255);
        this.f31024g.joinGroup(this.f31023f);
    }

    /* renamed from: b */
    public void mo38104b(String str, C11600e eVar) {
        String lowerCase = str.toLowerCase();
        List list = (List) this.f31026i.get(lowerCase);
        if (list != null) {
            synchronized (list) {
                list.remove(new C11651m.C11652a(eVar, false));
                if (list.isEmpty()) {
                    this.f31026i.remove(lowerCase, list);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005b, code lost:
        if (f31022z.mo41309a() == false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005d, code lost:
        r3 = f31022z;
        r3.mo41310b("makeServiceNameUnique() JmDNS.makeServiceNameUnique srv collision:" + r5 + " s.server=" + r7.mo37995v() + " " + r10.f31033p.mo38061g() + " equals:" + r7.mo37995v().equals(r10.f31033p.mo38061g()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a3, code lost:
        r11.mo38170a(p368r.p369a.p370g.C11654n.C11657c.m38310a().mo38154a(r10.f31033p.mo38059e(), r11.mo37858h(), p368r.p369a.p370g.C11654n.C11658d.f31082g));
        r3 = true;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m38231b(p368r.p369a.p370g.C11662q r11) {
        /*
            r10 = this;
            java.lang.String r0 = r11.mo38187z()
            long r1 = java.lang.System.currentTimeMillis()
        L_0x0008:
            r3 = 0
            r.a.g.a r4 = r10.mo38121y()
            java.lang.String r5 = r11.mo38187z()
            java.util.Collection r4 = r4.mo37873a((java.lang.String) r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x0019:
            boolean r5 = r4.hasNext()
            r6 = 1
            if (r5 == 0) goto L_0x00bb
            java.lang.Object r5 = r4.next()
            r.a.g.b r5 = (p368r.p369a.p370g.C11603b) r5
            r.a.g.s.e r7 = p368r.p369a.p370g.p371s.C11670e.TYPE_SRV
            r.a.g.s.e r8 = r5.mo37895e()
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0019
            boolean r7 = r5.mo37886a((long) r1)
            if (r7 != 0) goto L_0x0019
            r7 = r5
            r.a.g.h$f r7 = (p368r.p369a.p370g.C11620h.C11626f) r7
            int r8 = r7.mo37993t()
            int r9 = r11.mo37859i()
            if (r8 != r9) goto L_0x0055
            java.lang.String r8 = r7.mo37995v()
            r.a.g.k r9 = r10.f31033p
            java.lang.String r9 = r9.mo38061g()
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x0019
        L_0x0055:
            t.b.b r3 = f31022z
            boolean r3 = r3.mo41309a()
            if (r3 == 0) goto L_0x00a3
            t.b.b r3 = f31022z
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "makeServiceNameUnique() JmDNS.makeServiceNameUnique srv collision:"
            r4.append(r8)
            r4.append(r5)
            java.lang.String r5 = " s.server="
            r4.append(r5)
            java.lang.String r5 = r7.mo37995v()
            r4.append(r5)
            java.lang.String r5 = " "
            r4.append(r5)
            r.a.g.k r5 = r10.f31033p
            java.lang.String r5 = r5.mo38061g()
            r4.append(r5)
            java.lang.String r5 = " equals:"
            r4.append(r5)
            java.lang.String r5 = r7.mo37995v()
            r.a.g.k r7 = r10.f31033p
            java.lang.String r7 = r7.mo38061g()
            boolean r5 = r5.equals(r7)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.mo41310b(r4)
        L_0x00a3:
            r.a.g.n r3 = p368r.p369a.p370g.C11654n.C11657c.m38310a()
            r.a.g.k r4 = r10.f31033p
            java.net.InetAddress r4 = r4.mo38059e()
            java.lang.String r5 = r11.mo37858h()
            r.a.g.n$d r7 = p368r.p369a.p370g.C11654n.C11658d.SERVICE
            java.lang.String r3 = r3.mo38154a(r4, r5, r7)
            r11.mo38170a((java.lang.String) r3)
            r3 = 1
        L_0x00bb:
            java.util.concurrent.ConcurrentMap<java.lang.String, r.a.d> r4 = r10.f31029l
            java.lang.String r5 = r11.mo38187z()
            java.lang.Object r4 = r4.get(r5)
            r.a.d r4 = (p368r.p369a.C11598d) r4
            if (r4 == 0) goto L_0x00e3
            if (r4 == r11) goto L_0x00e3
            r.a.g.n r3 = p368r.p369a.p370g.C11654n.C11657c.m38310a()
            r.a.g.k r4 = r10.f31033p
            java.net.InetAddress r4 = r4.mo38059e()
            java.lang.String r5 = r11.mo37858h()
            r.a.g.n$d r7 = p368r.p369a.p370g.C11654n.C11658d.SERVICE
            java.lang.String r3 = r3.mo38154a(r4, r5, r7)
            r11.mo38170a((java.lang.String) r3)
            r3 = 1
        L_0x00e3:
            if (r3 != 0) goto L_0x0008
            java.lang.String r11 = r11.mo38187z()
            boolean r11 = r0.equals(r11)
            r11 = r11 ^ r6
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p368r.p369a.p370g.C11639l.m38231b(r.a.g.q):boolean");
    }

    /* renamed from: a */
    public boolean mo37998a(C11675a aVar) {
        return this.f31033p.mo37998a(aVar);
    }

    /* renamed from: a */
    public void mo38102a(C11675a aVar, C11672g gVar) {
        this.f31033p.mo38047a(aVar, gVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C11662q mo38092a(String str, String str2, String str3, boolean z) {
        C11662q qVar;
        String str4;
        C11598d a;
        C11598d a2;
        C11598d a3;
        C11598d a4;
        String str5 = str;
        C11662q qVar2 = new C11662q(str5, str2, str3, 0, 0, 0, z, (byte[]) null);
        C11603b b = mo38121y().mo37878b((C11603b) new C11620h.C11625e(str5, C11669d.CLASS_ANY, false, 0, qVar2.mo37862l()));
        if (!(b instanceof C11620h) || (qVar = (C11662q) ((C11620h) b).mo37971a(z)) == null) {
            return qVar2;
        }
        Map<C11598d.C11599a, String> B = qVar.mo38160B();
        byte[] bArr = null;
        C11603b a5 = mo38121y().mo37874a(qVar2.mo37862l(), C11670e.TYPE_SRV, C11669d.CLASS_ANY);
        if (!(a5 instanceof C11620h) || (a4 = ((C11620h) a5).mo37971a(z)) == null) {
            str4 = "";
        } else {
            qVar = new C11662q(B, a4.mo37859i(), a4.mo37867s(), a4.mo37860j(), z, (byte[]) null);
            bArr = a4.mo37865q();
            str4 = a4.mo37863m();
        }
        Iterator<? extends C11603b> it = mo38121y().mo37877b(str4, C11670e.TYPE_A, C11669d.CLASS_ANY).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C11603b bVar = (C11603b) it.next();
            if ((bVar instanceof C11620h) && (a3 = ((C11620h) bVar).mo37971a(z)) != null) {
                for (Inet4Address a6 : a3.mo37855e()) {
                    qVar.mo38171a(a6);
                }
                qVar.mo38176a(a3.mo37865q());
            }
        }
        for (C11603b bVar2 : mo38121y().mo37877b(str4, C11670e.TYPE_AAAA, C11669d.CLASS_ANY)) {
            if ((bVar2 instanceof C11620h) && (a2 = ((C11620h) bVar2).mo37971a(z)) != null) {
                for (Inet6Address a7 : a2.mo37856f()) {
                    qVar.mo38172a(a7);
                }
                qVar.mo38176a(a2.mo37865q());
            }
        }
        C11603b a8 = mo38121y().mo37874a(qVar.mo37862l(), C11670e.TYPE_TXT, C11669d.CLASS_ANY);
        if ((a8 instanceof C11620h) && (a = ((C11620h) a8).mo37971a(z)) != null) {
            qVar.mo38176a(a.mo37865q());
        }
        if (qVar.mo37865q().length == 0) {
            qVar.mo38176a(bArr);
        }
        return qVar.mo37868u() ? qVar : qVar2;
    }

    /* renamed from: d */
    public void mo38028d() {
        C11631j.C11634b a = C11631j.C11634b.m38185a();
        mo38072A();
        a.mo38043b(this).mo38028d();
    }

    /* renamed from: d */
    public void mo38110d(long j) {
        this.f31036s = j;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo38106b(C11604c cVar, InetAddress inetAddress, int i) throws IOException {
        if (f31022z.mo41309a()) {
            C12938b bVar = f31022z;
            bVar.mo41310b(mo38077F() + ".handle query: " + cVar);
        }
        boolean z = false;
        long currentTimeMillis = System.currentTimeMillis() + 120;
        for (C11620h a : cVar.mo37926b()) {
            z |= a.mo37976a(this, currentTimeMillis);
        }
        mo38082K();
        try {
            if (this.f31039v != null) {
                this.f31039v.mo37910a(cVar);
            } else {
                C11604c clone = cVar.clone();
                if (cVar.mo37943r()) {
                    this.f31039v = clone;
                }
                mo38025a(clone, inetAddress, i);
            }
            mo38083L();
            long currentTimeMillis2 = System.currentTimeMillis();
            for (C11620h a2 : cVar.mo37928c()) {
                mo38101a(a2, currentTimeMillis2);
            }
            if (z) {
                mo38031m();
            }
        } catch (Throwable th) {
            mo38083L();
            throw th;
        }
    }

    /* renamed from: b */
    public void mo38105b(C11604c cVar) {
        mo38082K();
        try {
            if (this.f31039v == cVar) {
                this.f31039v = null;
            }
        } finally {
            mo38083L();
        }
    }

    /* renamed from: b */
    public void mo38027b() {
        C11631j.C11634b a = C11631j.C11634b.m38185a();
        mo38072A();
        a.mo38043b(this).mo38027b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo38095a(C11597c cVar) {
        ArrayList<C11651m.C11652a> arrayList;
        List list = (List) this.f31026i.get(cVar.mo37850f().toLowerCase());
        if (list != null && !list.isEmpty() && cVar.mo37847c() != null && cVar.mo37847c().mo37868u()) {
            synchronized (list) {
                arrayList = new ArrayList<>(list);
            }
            for (C11651m.C11652a aVar : arrayList) {
                this.f31037t.submit(new C11640a(aVar, cVar));
            }
        }
    }

    /* renamed from: a */
    public void mo37841a(String str, C11600e eVar) {
        m38228a(str, eVar, false);
    }

    /* renamed from: a */
    private void m38228a(String str, C11600e eVar, boolean z) {
        C11651m.C11652a aVar = new C11651m.C11652a(eVar, z);
        String lowerCase = str.toLowerCase();
        List list = (List) this.f31026i.get(lowerCase);
        if (list == null) {
            if (this.f31026i.putIfAbsent(lowerCase, new LinkedList()) == null && this.f31040w.putIfAbsent(lowerCase, new C11648i(str)) == null) {
                m38228a(lowerCase, (C11600e) this.f31040w.get(lowerCase), true);
            }
            list = (List) this.f31026i.get(lowerCase);
        }
        if (list != null) {
            synchronized (list) {
                if (!list.contains(aVar)) {
                    list.add(aVar);
                }
            }
        }
        ArrayList<C11597c> arrayList = new ArrayList<>();
        Iterator<C11603b> it = mo38121y().mo37872a().iterator();
        while (it.hasNext()) {
            C11620h hVar = (C11620h) it.next();
            if (hVar.mo37895e() == C11670e.TYPE_SRV && hVar.mo37883a().endsWith(lowerCase)) {
                arrayList.add(new C11661p(this, hVar.mo37899g(), m38226a(hVar.mo37899g(), hVar.mo37889b()), hVar.mo37986p()));
            }
        }
        for (C11597c a : arrayList) {
            aVar.mo38149a(a);
        }
        mo38024a(str);
    }

    /* renamed from: a */
    public void mo38096a(C11598d dVar) throws IOException {
        if (mo38087P() || isClosed()) {
            throw new IllegalStateException("This DNS is closed.");
        }
        C11662q qVar = (C11662q) dVar;
        if (qVar.mo38186y() != null) {
            if (qVar.mo38186y() != this) {
                throw new IllegalStateException("A service information can only be registered with a single instamce of JmDNS.");
            } else if (this.f31029l.get(qVar.mo38187z()) != null) {
                throw new IllegalStateException("A service information can only be registered once.");
            }
        }
        qVar.mo38173a(this);
        mo38111d(qVar.mo38161C());
        qVar.mo38166I();
        qVar.mo38178b(this.f31033p.mo38061g());
        qVar.mo38171a(this.f31033p.mo38057c());
        qVar.mo38172a(this.f31033p.mo38058d());
        mo38113g(6000);
        m38231b(qVar);
        while (this.f31029l.putIfAbsent(qVar.mo38187z(), qVar) != null) {
            m38231b(qVar);
        }
        mo38031m();
        qVar.mo38177a(6000);
        if (f31022z.mo41309a()) {
            C12938b bVar = f31022z;
            bVar.mo41310b("registerService() JmDNS registered service as " + qVar);
        }
    }

    /* renamed from: a */
    public void mo38099a(C11607d dVar, C11611g gVar) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f31025h.add(dVar);
        if (gVar != null) {
            for (C11603b bVar : mo38121y().mo37873a(gVar.mo37889b().toLowerCase())) {
                if (gVar.mo37968f(bVar) && !bVar.mo37886a(currentTimeMillis)) {
                    dVar.mo37922a(mo38121y(), currentTimeMillis, bVar);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo38098a(C11607d dVar) {
        this.f31025h.remove(dVar);
    }

    /* renamed from: a */
    public void mo38094a(long j, C11620h hVar, C11647h hVar2) {
        ArrayList<C11607d> arrayList;
        List<C11651m.C11652a> list;
        synchronized (this.f31025h) {
            arrayList = new ArrayList<>(this.f31025h);
        }
        for (C11607d a : arrayList) {
            a.mo37922a(mo38121y(), j, hVar);
        }
        if (C11670e.TYPE_PTR.equals(hVar.mo37895e())) {
            C11597c a2 = hVar.mo37970a(this);
            if (a2.mo37847c() == null || !a2.mo37847c().mo37868u()) {
                C11662q a3 = mo38092a(a2.mo37850f(), a2.mo37849e(), "", false);
                if (a3.mo37868u()) {
                    a2 = new C11661p(this, a2.mo37850f(), a2.mo37849e(), a3);
                }
            }
            List list2 = (List) this.f31026i.get(a2.mo37850f().toLowerCase());
            if (list2 != null) {
                synchronized (list2) {
                    list = new ArrayList<>(list2);
                }
            } else {
                list = Collections.emptyList();
            }
            if (f31022z.mo41314b()) {
                C12938b bVar = f31022z;
                bVar.mo41319d(mo38077F() + ".updating record for event: " + a2 + " list " + list + " operation: " + hVar2);
            }
            if (!list.isEmpty()) {
                int i = C11646g.f31059a[hVar2.ordinal()];
                if (i == 1) {
                    for (C11651m.C11652a aVar : list) {
                        if (aVar.mo38145b()) {
                            aVar.mo38149a(a2);
                        } else {
                            this.f31037t.submit(new C11643d(aVar, a2));
                        }
                    }
                } else if (i == 2) {
                    for (C11651m.C11652a aVar2 : list) {
                        if (aVar2.mo38145b()) {
                            aVar2.mo38150b(a2);
                        } else {
                            this.f31037t.submit(new C11644e(aVar2, a2));
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo38101a(C11620h hVar, long j) {
        C11647h hVar2 = C11647h.Noop;
        boolean a = hVar.mo37886a(j);
        if (f31022z.mo41309a()) {
            C12938b bVar = f31022z;
            bVar.mo41310b(mo38077F() + " handle response: " + hVar);
        }
        if (!hVar.mo37903j() && !hVar.mo37900h()) {
            boolean k = hVar.mo37904k();
            C11620h hVar3 = (C11620h) mo38121y().mo37878b((C11603b) hVar);
            if (f31022z.mo41309a()) {
                C12938b bVar2 = f31022z;
                bVar2.mo41310b(mo38077F() + " handle response cached record: " + hVar3);
            }
            if (k) {
                for (C11603b bVar3 : mo38121y().mo37873a(hVar.mo37883a())) {
                    if (hVar.mo37895e().equals(bVar3.mo37895e()) && hVar.mo37893d().equals(bVar3.mo37893d()) && bVar3 != hVar3) {
                        ((C11620h) bVar3).mo37984e(j);
                    }
                }
            }
            if (hVar3 != null) {
                if (a) {
                    if (hVar.mo37987q() == 0) {
                        hVar2 = C11647h.Noop;
                        hVar3.mo37984e(j);
                    } else {
                        hVar2 = C11647h.Remove;
                        mo38121y().mo37879c(hVar3);
                    }
                } else if (hVar.mo37981c(hVar3) && (hVar.mo37896e(hVar3) || hVar.mo37898f().length() <= 0)) {
                    hVar3.mo37974a(hVar);
                    hVar = hVar3;
                } else if (hVar.mo37989s()) {
                    hVar2 = C11647h.Update;
                    mo38121y().mo37876a(hVar, hVar3);
                } else {
                    hVar2 = C11647h.Add;
                    mo38121y().mo37875a((C11603b) hVar);
                }
            } else if (!a) {
                hVar2 = C11647h.Add;
                mo38121y().mo37875a((C11603b) hVar);
            }
        }
        if (hVar.mo37895e() == C11670e.TYPE_PTR) {
            if (hVar.mo37903j()) {
                if (!a) {
                    mo38111d(((C11620h.C11625e) hVar).mo37992t());
                    return;
                }
                return;
            } else if ((mo38111d(hVar.mo37889b()) || false) && hVar2 == C11647h.Noop) {
                hVar2 = C11647h.RegisterServiceType;
            }
        }
        if (hVar2 != C11647h.Noop) {
            mo38094a(j, hVar, hVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo38097a(C11604c cVar) throws IOException {
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        boolean z2 = false;
        for (C11620h next : m38227a(cVar.mo37926b())) {
            mo38101a(next, currentTimeMillis);
            if (C11670e.TYPE_A.equals(next.mo37895e()) || C11670e.TYPE_AAAA.equals(next.mo37895e())) {
                z |= next.mo37979b(this);
            } else {
                z2 |= next.mo37979b(this);
            }
        }
        if (z || z2) {
            mo38031m();
        }
    }

    /* renamed from: a */
    private List<C11620h> m38227a(List<C11620h> list) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList();
        for (C11620h next : list) {
            if (next.mo37895e().equals(C11670e.TYPE_A) || next.mo37895e().equals(C11670e.TYPE_AAAA)) {
                arrayList2.add(next);
            } else {
                arrayList.add(next);
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* renamed from: a */
    public void mo38100a(C11609f fVar) throws IOException {
        int i;
        InetAddress inetAddress;
        if (!fVar.mo37939n()) {
            if (fVar.mo37954w() != null) {
                inetAddress = fVar.mo37954w().getAddress();
                i = fVar.mo37954w().getPort();
            } else {
                inetAddress = this.f31023f;
                i = C11666a.f31110a;
            }
            byte[] v = fVar.mo37953v();
            DatagramPacket datagramPacket = new DatagramPacket(v, v.length, inetAddress, i);
            if (f31022z.mo41314b()) {
                try {
                    C11604c cVar = new C11604c(datagramPacket);
                    if (f31022z.mo41314b()) {
                        C12938b bVar = f31022z;
                        bVar.mo41319d("send(" + mo38077F() + ") JmDNS out:" + cVar.mo37909a(true));
                    }
                } catch (IOException e) {
                    C12938b bVar2 = f31022z;
                    String cls = C11639l.class.toString();
                    bVar2.mo41307a(cls, "send(" + mo38077F() + ") - JmDNS can not parse what it sends!!!", e);
                }
            }
            MulticastSocket multicastSocket = this.f31024g;
            if (multicastSocket != null && !multicastSocket.isClosed()) {
                multicastSocket.send(datagramPacket);
            }
        }
    }

    /* renamed from: a */
    public void mo38023a() {
        C11631j.C11634b a = C11631j.C11634b.m38185a();
        mo38072A();
        a.mo38043b(this).mo38023a();
    }

    /* renamed from: a */
    public void mo38026a(C11662q qVar) {
        C11631j.C11634b a = C11631j.C11634b.m38185a();
        mo38072A();
        a.mo38043b(this).mo38026a(qVar);
    }

    /* renamed from: a */
    public void mo38024a(String str) {
        C11631j.C11634b a = C11631j.C11634b.m38185a();
        mo38072A();
        a.mo38043b(this).mo38024a(str);
    }

    /* renamed from: a */
    public void mo38025a(C11604c cVar, InetAddress inetAddress, int i) {
        C11631j.C11634b a = C11631j.C11634b.m38185a();
        mo38072A();
        a.mo38043b(this).mo38025a(cVar, inetAddress, i);
    }

    /* renamed from: a */
    static String m38226a(String str, String str2) {
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        return (!lowerCase2.endsWith(lowerCase) || lowerCase2.equals(lowerCase)) ? str2 : str2.substring(0, (str2.length() - str.length()) - 1);
    }

    /* renamed from: a */
    public void mo38093a(int i) {
        this.f31035r = i;
    }
}
