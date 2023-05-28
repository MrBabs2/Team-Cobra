package p123rx.p401n.p402a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicLong;
import p123rx.C12473g;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5375k;
import p123rx.exceptions.CompositeException;
import p123rx.p126m.C5377a;
import p123rx.p128t.C12888d;
import p123rx.p128t.C12889e;
import p123rx.p401n.p406e.C12772h;
import p123rx.p401n.p406e.p407n.C12801g;
import p123rx.p411q.C12844c;

/* renamed from: rx.n.a.a1 */
/* compiled from: OperatorSwitch */
public final class C12505a1<T> implements C5368e.C5371b<T, C5368e<? extends T>> {

    /* renamed from: f */
    final boolean f32253f;

    /* renamed from: rx.n.a.a1$a */
    /* compiled from: OperatorSwitch */
    static final class C12506a {

        /* renamed from: a */
        static final C12505a1<Object> f32254a = new C12505a1<>(false);
    }

    /* renamed from: rx.n.a.a1$b */
    /* compiled from: OperatorSwitch */
    static final class C12507b {

        /* renamed from: a */
        static final C12505a1<Object> f32255a = new C12505a1<>(true);
    }

    /* renamed from: rx.n.a.a1$c */
    /* compiled from: OperatorSwitch */
    static final class C12508c<T> extends C12475j<T> {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final long f32256f;

        /* renamed from: g */
        private final C12509d<T> f32257g;

        C12508c(long j, C12509d<T> dVar) {
            this.f32256f = j;
            this.f32257g = dVar;
        }

        public void onCompleted() {
            this.f32257g.mo40673b(this.f32256f);
        }

        public void onError(Throwable th) {
            this.f32257g.mo40668a(th, this.f32256f);
        }

        public void onNext(T t) {
            this.f32257g.mo40667a(t, this);
        }

        public void setProducer(C12473g gVar) {
            this.f32257g.mo40670a(gVar, this.f32256f);
        }
    }

    C12505a1(boolean z) {
        this.f32253f = z;
    }

    /* renamed from: a */
    public static <T> C12505a1<T> m40965a(boolean z) {
        if (z) {
            return C12507b.f32255a;
        }
        return C12506a.f32254a;
    }

    /* renamed from: rx.n.a.a1$d */
    /* compiled from: OperatorSwitch */
    static final class C12509d<T> extends C12475j<C5368e<? extends T>> {

        /* renamed from: r */
        static final Throwable f32258r = new Throwable("Terminal error");

        /* renamed from: f */
        final C12475j<? super T> f32259f;

        /* renamed from: g */
        final C12888d f32260g = new C12888d();

        /* renamed from: h */
        final boolean f32261h;

        /* renamed from: i */
        final AtomicLong f32262i;

        /* renamed from: j */
        final C12801g<Object> f32263j;

        /* renamed from: k */
        boolean f32264k;

        /* renamed from: l */
        boolean f32265l;

        /* renamed from: m */
        long f32266m;

        /* renamed from: n */
        C12473g f32267n;

        /* renamed from: o */
        volatile boolean f32268o;

        /* renamed from: p */
        Throwable f32269p;

        /* renamed from: q */
        boolean f32270q;

        /* renamed from: rx.n.a.a1$d$a */
        /* compiled from: OperatorSwitch */
        class C12510a implements C5377a {
            C12510a() {
            }

            public void call() {
                C12509d.this.mo40665a();
            }
        }

        /* renamed from: rx.n.a.a1$d$b */
        /* compiled from: OperatorSwitch */
        class C12511b implements C12473g {
            C12511b() {
            }

            public void request(long j) {
                if (j > 0) {
                    C12509d.this.mo40666a(j);
                } else if (j < 0) {
                    throw new IllegalArgumentException("n >= 0 expected but it was " + j);
                }
            }
        }

        C12509d(C12475j<? super T> jVar, boolean z) {
            this.f32259f = jVar;
            this.f32261h = z;
            this.f32262i = new AtomicLong();
            this.f32263j = new C12801g<>(C12772h.f32957h);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40665a() {
            synchronized (this) {
                this.f32267n = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo40673b(long j) {
            synchronized (this) {
                if (this.f32262i.get() == j) {
                    this.f32270q = false;
                    this.f32267n = null;
                    mo40672b();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo40675c() {
            this.f32259f.add(this.f32260g);
            this.f32259f.add(C12889e.m41501a(new C12510a()));
            this.f32259f.setProducer(new C12511b());
        }

        public void onCompleted() {
            this.f32268o = true;
            mo40672b();
        }

        public void onError(Throwable th) {
            boolean c;
            synchronized (this) {
                c = mo40676c(th);
            }
            if (c) {
                this.f32268o = true;
                mo40672b();
                return;
            }
            mo40674b(th);
        }

        /* renamed from: a */
        public void onNext(C5368e<? extends T> eVar) {
            C12508c cVar;
            long incrementAndGet = this.f32262i.incrementAndGet();
            C5375k a = this.f32260g.mo41108a();
            if (a != null) {
                a.unsubscribe();
            }
            synchronized (this) {
                cVar = new C12508c(incrementAndGet, this);
                this.f32270q = true;
                this.f32267n = null;
            }
            this.f32260g.mo41109a(cVar);
            eVar.mo18668b((C12475j<? super Object>) cVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo40676c(Throwable th) {
            Throwable th2 = this.f32269p;
            if (th2 == f32258r) {
                return false;
            }
            if (th2 == null) {
                this.f32269p = th;
            } else if (th2 instanceof CompositeException) {
                ArrayList arrayList = new ArrayList(((CompositeException) th2).mo40644a());
                arrayList.add(th);
                this.f32269p = new CompositeException((Collection<? extends Throwable>) arrayList);
            } else {
                this.f32269p = new CompositeException(th2, th);
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo40674b(Throwable th) {
            C12844c.m41417b(th);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
            r9 = r8.f32263j;
            r10 = r8.f32262i;
            r11 = r8.f32259f;
            r12 = r1;
            r14 = r3;
            r15 = r8.f32268o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
            r16 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
            if (r16 == r12) goto L_0x0076;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
            if (r11.isUnsubscribed() == false) goto L_0x003d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003d, code lost:
            r18 = r9.isEmpty();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
            if (mo40671a(r15, r0, r14, r9, r11, r18) == false) goto L_0x0051;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0051, code lost:
            if (r18 == false) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0054, code lost:
            r2 = p123rx.p401n.p402a.C12558h.m41018b(r9.poll());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x006c, code lost:
            if (r10.get() != p123rx.p401n.p402a.C12505a1.C12508c.m40967a((p123rx.p401n.p402a.C12505a1.C12508c) r9.poll())) goto L_0x0032;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x006e, code lost:
            r11.onNext(r2);
            r16 = r16 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0078, code lost:
            if (r16 != r12) goto L_0x0094;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x007e, code lost:
            if (r11.isUnsubscribed() == false) goto L_0x0081;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0091, code lost:
            if (mo40671a(r8.f32268o, r0, r14, r9, r11, r9.isEmpty()) == false) goto L_0x0094;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0093, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0094, code lost:
            monitor-enter(r19);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
            r0 = r8.f32266m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x009e, code lost:
            if (r0 == Long.MAX_VALUE) goto L_0x00a4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a0, code lost:
            r0 = r0 - r16;
            r8.f32266m = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a4, code lost:
            r12 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a8, code lost:
            if (r8.f32265l != false) goto L_0x00ae;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00aa, code lost:
            r8.f32264k = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ac, code lost:
            monitor-exit(r19);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ad, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ae, code lost:
            r8.f32265l = false;
            r15 = r8.f32268o;
            r0 = r8.f32270q;
            r14 = r8.f32269p;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b6, code lost:
            if (r14 == null) goto L_0x00c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ba, code lost:
            if (r14 == f32258r) goto L_0x00c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00be, code lost:
            if (r8.f32261h != false) goto L_0x00c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c0, code lost:
            r8.f32269p = f32258r;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c4, code lost:
            monitor-exit(r19);
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo40672b() {
            /*
                r19 = this;
                r8 = r19
                monitor-enter(r19)
                boolean r0 = r8.f32264k     // Catch:{ all -> 0x00ca }
                r1 = 1
                if (r0 == 0) goto L_0x000c
                r8.f32265l = r1     // Catch:{ all -> 0x00ca }
                monitor-exit(r19)     // Catch:{ all -> 0x00ca }
                return
            L_0x000c:
                r8.f32264k = r1     // Catch:{ all -> 0x00ca }
                boolean r0 = r8.f32270q     // Catch:{ all -> 0x00ca }
                long r1 = r8.f32266m     // Catch:{ all -> 0x00ca }
                java.lang.Throwable r3 = r8.f32269p     // Catch:{ all -> 0x00ca }
                if (r3 == 0) goto L_0x0022
                java.lang.Throwable r4 = f32258r     // Catch:{ all -> 0x00ca }
                if (r3 == r4) goto L_0x0022
                boolean r4 = r8.f32261h     // Catch:{ all -> 0x00ca }
                if (r4 != 0) goto L_0x0022
                java.lang.Throwable r4 = f32258r     // Catch:{ all -> 0x00ca }
                r8.f32269p = r4     // Catch:{ all -> 0x00ca }
            L_0x0022:
                monitor-exit(r19)     // Catch:{ all -> 0x00ca }
                rx.n.e.n.g<java.lang.Object> r9 = r8.f32263j
                java.util.concurrent.atomic.AtomicLong r10 = r8.f32262i
                rx.j<? super T> r11 = r8.f32259f
                boolean r4 = r8.f32268o
                r12 = r1
                r14 = r3
                r15 = r4
            L_0x002e:
                r1 = 0
                r16 = r1
            L_0x0032:
                int r1 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
                if (r1 == 0) goto L_0x0076
                boolean r1 = r11.isUnsubscribed()
                if (r1 == 0) goto L_0x003d
                return
            L_0x003d:
                boolean r18 = r9.isEmpty()
                r1 = r19
                r2 = r15
                r3 = r0
                r4 = r14
                r5 = r9
                r6 = r11
                r7 = r18
                boolean r1 = r1.mo40671a(r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0051
                return
            L_0x0051:
                if (r18 == 0) goto L_0x0054
                goto L_0x0076
            L_0x0054:
                java.lang.Object r1 = r9.poll()
                rx.n.a.a1$c r1 = (p123rx.p401n.p402a.C12505a1.C12508c) r1
                java.lang.Object r2 = r9.poll()
                java.lang.Object r2 = p123rx.p401n.p402a.C12558h.m41018b(r2)
                long r3 = r10.get()
                long r5 = r1.f32256f
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 != 0) goto L_0x0032
                r11.onNext(r2)
                r1 = 1
                long r16 = r16 + r1
                goto L_0x0032
            L_0x0076:
                int r1 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
                if (r1 != 0) goto L_0x0094
                boolean r1 = r11.isUnsubscribed()
                if (r1 == 0) goto L_0x0081
                return
            L_0x0081:
                boolean r2 = r8.f32268o
                boolean r7 = r9.isEmpty()
                r1 = r19
                r3 = r0
                r4 = r14
                r5 = r9
                r6 = r11
                boolean r0 = r1.mo40671a(r2, r3, r4, r5, r6, r7)
                if (r0 == 0) goto L_0x0094
                return
            L_0x0094:
                monitor-enter(r19)
                long r0 = r8.f32266m     // Catch:{ all -> 0x00c7 }
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L_0x00a4
                long r0 = r0 - r16
                r8.f32266m = r0     // Catch:{ all -> 0x00c7 }
            L_0x00a4:
                r12 = r0
                boolean r0 = r8.f32265l     // Catch:{ all -> 0x00c7 }
                r1 = 0
                if (r0 != 0) goto L_0x00ae
                r8.f32264k = r1     // Catch:{ all -> 0x00c7 }
                monitor-exit(r19)     // Catch:{ all -> 0x00c7 }
                return
            L_0x00ae:
                r8.f32265l = r1     // Catch:{ all -> 0x00c7 }
                boolean r15 = r8.f32268o     // Catch:{ all -> 0x00c7 }
                boolean r0 = r8.f32270q     // Catch:{ all -> 0x00c7 }
                java.lang.Throwable r14 = r8.f32269p     // Catch:{ all -> 0x00c7 }
                if (r14 == 0) goto L_0x00c4
                java.lang.Throwable r1 = f32258r     // Catch:{ all -> 0x00c7 }
                if (r14 == r1) goto L_0x00c4
                boolean r1 = r8.f32261h     // Catch:{ all -> 0x00c7 }
                if (r1 != 0) goto L_0x00c4
                java.lang.Throwable r1 = f32258r     // Catch:{ all -> 0x00c7 }
                r8.f32269p = r1     // Catch:{ all -> 0x00c7 }
            L_0x00c4:
                monitor-exit(r19)     // Catch:{ all -> 0x00c7 }
                goto L_0x002e
            L_0x00c7:
                r0 = move-exception
                monitor-exit(r19)     // Catch:{ all -> 0x00c7 }
                throw r0
            L_0x00ca:
                r0 = move-exception
                monitor-exit(r19)     // Catch:{ all -> 0x00ca }
                goto L_0x00ce
            L_0x00cd:
                throw r0
            L_0x00ce:
                goto L_0x00cd
            */
            throw new UnsupportedOperationException("Method not decompiled: p123rx.p401n.p402a.C12505a1.C12509d.mo40672b():void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40667a(T t, C12508c<T> cVar) {
            synchronized (this) {
                if (this.f32262i.get() == cVar.f32256f) {
                    this.f32263j.mo40962a(cVar, C12558h.m41020d(t));
                    mo40672b();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40668a(Throwable th, long j) {
            boolean z;
            synchronized (this) {
                if (this.f32262i.get() == j) {
                    z = mo40676c(th);
                    this.f32270q = false;
                    this.f32267n = null;
                } else {
                    z = true;
                }
            }
            if (z) {
                mo40672b();
            } else {
                mo40674b(th);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40670a(C12473g gVar, long j) {
            synchronized (this) {
                if (this.f32262i.get() == j) {
                    long j2 = this.f32266m;
                    this.f32267n = gVar;
                    gVar.request(j2);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40666a(long j) {
            C12473g gVar;
            synchronized (this) {
                gVar = this.f32267n;
                this.f32266m = C12502a.m40959a(this.f32266m, j);
            }
            if (gVar != null) {
                gVar.request(j);
            }
            mo40672b();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo40671a(boolean z, boolean z2, Throwable th, C12801g<Object> gVar, C12475j<? super T> jVar, boolean z3) {
            if (this.f32261h) {
                if (!z || z2 || !z3) {
                    return false;
                }
                if (th != null) {
                    jVar.onError(th);
                } else {
                    jVar.onCompleted();
                }
                return true;
            } else if (th != null) {
                gVar.clear();
                jVar.onError(th);
                return true;
            } else if (!z || z2 || !z3) {
                return false;
            } else {
                jVar.onCompleted();
                return true;
            }
        }
    }

    /* renamed from: a */
    public C12475j<? super C5368e<? extends T>> call(C12475j<? super T> jVar) {
        C12509d dVar = new C12509d(jVar, this.f32253f);
        jVar.add(dVar);
        dVar.mo40675c();
        return dVar;
    }
}
