package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C5901a;
import com.bumptech.glide.load.C6022f;
import com.bumptech.glide.load.engine.C5952h;
import com.bumptech.glide.load.engine.p145b0.C5936a;
import com.bumptech.glide.p162p.C6274i;
import com.bumptech.glide.p166r.C6308e;
import com.bumptech.glide.p166r.C6315j;
import com.bumptech.glide.p166r.p167l.C6318a;
import com.bumptech.glide.p166r.p167l.C6327c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p050l.p075h.p083k.C5005e;

/* renamed from: com.bumptech.glide.load.engine.l */
/* compiled from: EngineJob */
class C5976l<R> implements C5952h.C5954b<R>, C6318a.C6324f {

    /* renamed from: C */
    private static final C5979c f10967C = new C5979c();

    /* renamed from: A */
    private C5952h<R> f10968A;

    /* renamed from: B */
    private volatile boolean f10969B;

    /* renamed from: f */
    final C5981e f10970f;

    /* renamed from: g */
    private final C6327c f10971g;

    /* renamed from: h */
    private final C5005e<C5976l<?>> f10972h;

    /* renamed from: i */
    private final C5979c f10973i;

    /* renamed from: j */
    private final C5982m f10974j;

    /* renamed from: k */
    private final C5936a f10975k;

    /* renamed from: l */
    private final C5936a f10976l;

    /* renamed from: m */
    private final C5936a f10977m;

    /* renamed from: n */
    private final C5936a f10978n;

    /* renamed from: o */
    private final AtomicInteger f10979o;

    /* renamed from: p */
    private C6022f f10980p;

    /* renamed from: q */
    private boolean f10981q;

    /* renamed from: r */
    private boolean f10982r;

    /* renamed from: s */
    private boolean f10983s;

    /* renamed from: t */
    private boolean f10984t;

    /* renamed from: u */
    private C5992u<?> f10985u;

    /* renamed from: v */
    C5901a f10986v;

    /* renamed from: w */
    private boolean f10987w;

    /* renamed from: x */
    GlideException f10988x;

    /* renamed from: y */
    private boolean f10989y;

    /* renamed from: z */
    C5985p<?> f10990z;

    /* renamed from: com.bumptech.glide.load.engine.l$a */
    /* compiled from: EngineJob */
    private class C5977a implements Runnable {

        /* renamed from: f */
        private final C6274i f10991f;

        C5977a(C6274i iVar) {
            this.f10991f = iVar;
        }

        public void run() {
            synchronized (C5976l.this) {
                if (C5976l.this.f10970f.mo20227a(this.f10991f)) {
                    C5976l.this.mo20211a(this.f10991f);
                }
                C5976l.this.mo20213b();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.l$b */
    /* compiled from: EngineJob */
    private class C5978b implements Runnable {

        /* renamed from: f */
        private final C6274i f10993f;

        C5978b(C6274i iVar) {
            this.f10993f = iVar;
        }

        public void run() {
            synchronized (C5976l.this) {
                if (C5976l.this.f10970f.mo20227a(this.f10993f)) {
                    C5976l.this.f10990z.mo20237b();
                    C5976l.this.mo20215b(this.f10993f);
                    C5976l.this.mo20217c(this.f10993f);
                }
                C5976l.this.mo20213b();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.l$c */
    /* compiled from: EngineJob */
    static class C5979c {
        C5979c() {
        }

        /* renamed from: a */
        public <R> C5985p<R> mo20222a(C5992u<R> uVar, boolean z) {
            return new C5985p<>(uVar, z, true);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.l$d */
    /* compiled from: EngineJob */
    static final class C5980d {

        /* renamed from: a */
        final C6274i f10995a;

        /* renamed from: b */
        final Executor f10996b;

        C5980d(C6274i iVar, Executor executor) {
            this.f10995a = iVar;
            this.f10996b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C5980d) {
                return this.f10995a.equals(((C5980d) obj).f10995a);
            }
            return false;
        }

        public int hashCode() {
            return this.f10995a.hashCode();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.l$e */
    /* compiled from: EngineJob */
    static final class C5981e implements Iterable<C5980d> {

        /* renamed from: f */
        private final List<C5980d> f10997f;

        C5981e() {
            this(new ArrayList(2));
        }

        /* renamed from: c */
        private static C5980d m11899c(C6274i iVar) {
            return new C5980d(iVar, C6308e.m12962a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo20226a(C6274i iVar, Executor executor) {
            this.f10997f.add(new C5980d(iVar, executor));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo20228b(C6274i iVar) {
            this.f10997f.remove(m11899c(iVar));
        }

        /* access modifiers changed from: package-private */
        public void clear() {
            this.f10997f.clear();
        }

        /* access modifiers changed from: package-private */
        public boolean isEmpty() {
            return this.f10997f.isEmpty();
        }

        public Iterator<C5980d> iterator() {
            return this.f10997f.iterator();
        }

        /* access modifiers changed from: package-private */
        public int size() {
            return this.f10997f.size();
        }

        C5981e(List<C5980d> list) {
            this.f10997f = list;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo20227a(C6274i iVar) {
            return this.f10997f.contains(m11899c(iVar));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C5981e mo20225a() {
            return new C5981e(new ArrayList(this.f10997f));
        }
    }

    C5976l(C5936a aVar, C5936a aVar2, C5936a aVar3, C5936a aVar4, C5982m mVar, C5005e<C5976l<?>> eVar) {
        this(aVar, aVar2, aVar3, aVar4, mVar, eVar, f10967C);
    }

    /* renamed from: f */
    private C5936a m11879f() {
        if (this.f10982r) {
            return this.f10977m;
        }
        return this.f10983s ? this.f10978n : this.f10976l;
    }

    /* renamed from: g */
    private boolean m11880g() {
        return this.f10989y || this.f10987w || this.f10969B;
    }

    /* renamed from: h */
    private synchronized void m11881h() {
        if (this.f10980p != null) {
            this.f10970f.clear();
            this.f10980p = null;
            this.f10990z = null;
            this.f10985u = null;
            this.f10989y = false;
            this.f10969B = false;
            this.f10987w = false;
            this.f10968A.mo20177a(false);
            this.f10968A = null;
            this.f10988x = null;
            this.f10986v = null;
            this.f10972h.mo17457a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized C5976l<R> mo20208a(C6022f fVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f10980p = fVar;
        this.f10981q = z;
        this.f10982r = z2;
        this.f10983s = z3;
        this.f10984t = z4;
        return this;
    }

    /* renamed from: b */
    public synchronized void mo20214b(C5952h<R> hVar) {
        C5936a aVar;
        this.f10968A = hVar;
        if (hVar.mo20179e()) {
            aVar = this.f10975k;
        } else {
            aVar = m11879f();
        }
        aVar.execute(hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized void mo20217c(C6274i iVar) {
        boolean z;
        this.f10971g.mo20774a();
        this.f10970f.mo20228b(iVar);
        if (this.f10970f.isEmpty()) {
            mo20209a();
            if (!this.f10987w) {
                if (!this.f10989y) {
                    z = false;
                    if (z && this.f10979o.get() == 0) {
                        m11881h();
                    }
                }
            }
            z = true;
            m11881h();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        r4.f10974j.mo20202a(r4, r0, r2);
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (r0.hasNext() == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        r1 = r0.next();
        r1.f10996b.execute(new com.bumptech.glide.load.engine.C5976l.C5978b(r4, r1.f10995a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0064, code lost:
        mo20213b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0067, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo20218d() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.bumptech.glide.r.l.c r0 = r4.f10971g     // Catch:{ all -> 0x0078 }
            r0.mo20774a()     // Catch:{ all -> 0x0078 }
            boolean r0 = r4.f10969B     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x0014
            com.bumptech.glide.load.engine.u<?> r0 = r4.f10985u     // Catch:{ all -> 0x0078 }
            r0.mo20235a()     // Catch:{ all -> 0x0078 }
            r4.m11881h()     // Catch:{ all -> 0x0078 }
            monitor-exit(r4)     // Catch:{ all -> 0x0078 }
            return
        L_0x0014:
            com.bumptech.glide.load.engine.l$e r0 = r4.f10970f     // Catch:{ all -> 0x0078 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0078 }
            if (r0 != 0) goto L_0x0070
            boolean r0 = r4.f10987w     // Catch:{ all -> 0x0078 }
            if (r0 != 0) goto L_0x0068
            com.bumptech.glide.load.engine.l$c r0 = r4.f10973i     // Catch:{ all -> 0x0078 }
            com.bumptech.glide.load.engine.u<?> r1 = r4.f10985u     // Catch:{ all -> 0x0078 }
            boolean r2 = r4.f10981q     // Catch:{ all -> 0x0078 }
            com.bumptech.glide.load.engine.p r0 = r0.mo20222a(r1, r2)     // Catch:{ all -> 0x0078 }
            r4.f10990z = r0     // Catch:{ all -> 0x0078 }
            r0 = 1
            r4.f10987w = r0     // Catch:{ all -> 0x0078 }
            com.bumptech.glide.load.engine.l$e r1 = r4.f10970f     // Catch:{ all -> 0x0078 }
            com.bumptech.glide.load.engine.l$e r1 = r1.mo20225a()     // Catch:{ all -> 0x0078 }
            int r2 = r1.size()     // Catch:{ all -> 0x0078 }
            int r2 = r2 + r0
            r4.mo20210a((int) r2)     // Catch:{ all -> 0x0078 }
            com.bumptech.glide.load.f r0 = r4.f10980p     // Catch:{ all -> 0x0078 }
            com.bumptech.glide.load.engine.p<?> r2 = r4.f10990z     // Catch:{ all -> 0x0078 }
            monitor-exit(r4)     // Catch:{ all -> 0x0078 }
            com.bumptech.glide.load.engine.m r3 = r4.f10974j
            r3.mo20202a(r4, r0, r2)
            java.util.Iterator r0 = r1.iterator()
        L_0x004b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0064
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.engine.l$d r1 = (com.bumptech.glide.load.engine.C5976l.C5980d) r1
            java.util.concurrent.Executor r2 = r1.f10996b
            com.bumptech.glide.load.engine.l$b r3 = new com.bumptech.glide.load.engine.l$b
            com.bumptech.glide.p.i r1 = r1.f10995a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x004b
        L_0x0064:
            r4.mo20213b()
            return
        L_0x0068:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0078 }
            java.lang.String r1 = "Already have resource"
            r0.<init>(r1)     // Catch:{ all -> 0x0078 }
            throw r0     // Catch:{ all -> 0x0078 }
        L_0x0070:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0078 }
            java.lang.String r1 = "Received a resource without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x0078 }
            throw r0     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0078 }
            goto L_0x007c
        L_0x007b:
            throw r0
        L_0x007c:
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C5976l.mo20218d():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo20219e() {
        return this.f10984t;
    }

    /* renamed from: i */
    public C6327c mo20121i() {
        return this.f10971g;
    }

    C5976l(C5936a aVar, C5936a aVar2, C5936a aVar3, C5936a aVar4, C5982m mVar, C5005e<C5976l<?>> eVar, C5979c cVar) {
        this.f10970f = new C5981e();
        this.f10971g = C6327c.m13024b();
        this.f10979o = new AtomicInteger();
        this.f10975k = aVar;
        this.f10976l = aVar2;
        this.f10977m = aVar3;
        this.f10978n = aVar4;
        this.f10974j = mVar;
        this.f10972h = eVar;
        this.f10973i = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo20212a(C6274i iVar, Executor executor) {
        this.f10971g.mo20774a();
        this.f10970f.mo20226a(iVar, executor);
        boolean z = true;
        if (this.f10987w) {
            mo20210a(1);
            executor.execute(new C5978b(iVar));
        } else if (this.f10989y) {
            mo20210a(1);
            executor.execute(new C5977a(iVar));
        } else {
            if (this.f10969B) {
                z = false;
            }
            C6315j.m12982a(z, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo20215b(C6274i iVar) {
        try {
            iVar.mo20709a(this.f10990z, this.f10986v);
        } catch (Throwable th) {
            throw new C5935b(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r4.f10974j.mo20202a(r4, r1, (com.bumptech.glide.load.engine.C5985p<?>) null);
        r0 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r0.hasNext() == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r1 = r0.next();
        r1.f10996b.execute(new com.bumptech.glide.load.engine.C5976l.C5977a(r4, r1.f10995a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        mo20213b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo20216c() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.bumptech.glide.r.l.c r0 = r4.f10971g     // Catch:{ all -> 0x0066 }
            r0.mo20774a()     // Catch:{ all -> 0x0066 }
            boolean r0 = r4.f10969B     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x000f
            r4.m11881h()     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            return
        L_0x000f:
            com.bumptech.glide.load.engine.l$e r0 = r4.f10970f     // Catch:{ all -> 0x0066 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x005e
            boolean r0 = r4.f10989y     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0056
            r0 = 1
            r4.f10989y = r0     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.f r1 = r4.f10980p     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.engine.l$e r2 = r4.f10970f     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.engine.l$e r2 = r2.mo20225a()     // Catch:{ all -> 0x0066 }
            int r3 = r2.size()     // Catch:{ all -> 0x0066 }
            int r3 = r3 + r0
            r4.mo20210a((int) r3)     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.engine.m r0 = r4.f10974j
            r3 = 0
            r0.mo20202a(r4, r1, r3)
            java.util.Iterator r0 = r2.iterator()
        L_0x0039:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0052
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.engine.l$d r1 = (com.bumptech.glide.load.engine.C5976l.C5980d) r1
            java.util.concurrent.Executor r2 = r1.f10996b
            com.bumptech.glide.load.engine.l$a r3 = new com.bumptech.glide.load.engine.l$a
            com.bumptech.glide.p.i r1 = r1.f10995a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x0039
        L_0x0052:
            r4.mo20213b()
            return
        L_0x0056:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Already failed once"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x005e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Received an exception without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            goto L_0x006a
        L_0x0069:
            throw r0
        L_0x006a:
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C5976l.mo20216c():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo20213b() {
        this.f10971g.mo20774a();
        C6315j.m12982a(m11880g(), "Not yet complete!");
        int decrementAndGet = this.f10979o.decrementAndGet();
        C6315j.m12982a(decrementAndGet >= 0, "Can't decrement below 0");
        if (decrementAndGet == 0) {
            if (this.f10990z != null) {
                this.f10990z.mo20242g();
            }
            m11881h();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo20211a(C6274i iVar) {
        try {
            iVar.mo20708a(this.f10988x);
        } catch (Throwable th) {
            throw new C5935b(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20209a() {
        if (!m11880g()) {
            this.f10969B = true;
            this.f10968A.mo20176a();
            this.f10974j.mo20201a(this, this.f10980p);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo20210a(int i) {
        C6315j.m12982a(m11880g(), "Not yet complete!");
        if (this.f10979o.getAndAdd(i) == 0 && this.f10990z != null) {
            this.f10990z.mo20237b();
        }
    }

    /* renamed from: a */
    public void mo20183a(C5992u<R> uVar, C5901a aVar) {
        synchronized (this) {
            this.f10985u = uVar;
            this.f10986v = aVar;
        }
        mo20218d();
    }

    /* renamed from: a */
    public void mo20181a(GlideException glideException) {
        synchronized (this) {
            this.f10988x = glideException;
        }
        mo20216c();
    }

    /* renamed from: a */
    public void mo20182a(C5952h<?> hVar) {
        m11879f().execute(hVar);
    }
}
