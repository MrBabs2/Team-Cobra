package p123rx.p401n.p402a;

import java.util.concurrent.TimeUnit;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.p126m.C5377a;
import p123rx.p128t.C12888d;
import p123rx.p410p.C12838e;

/* renamed from: rx.n.a.k0 */
/* compiled from: OperatorDebounceWithTime */
public final class C12585k0<T> implements C5368e.C5371b<T, T> {

    /* renamed from: f */
    final long f32464f;

    /* renamed from: g */
    final TimeUnit f32465g;

    /* renamed from: h */
    final C5373h f32466h;

    /* renamed from: rx.n.a.k0$a */
    /* compiled from: OperatorDebounceWithTime */
    class C12586a extends C12475j<T> {

        /* renamed from: f */
        final C12588b<T> f32467f = new C12588b<>();

        /* renamed from: g */
        final C12475j<?> f32468g = this;

        /* renamed from: h */
        final /* synthetic */ C12888d f32469h;

        /* renamed from: i */
        final /* synthetic */ C5373h.C5374a f32470i;

        /* renamed from: j */
        final /* synthetic */ C12838e f32471j;

        /* renamed from: rx.n.a.k0$a$a */
        /* compiled from: OperatorDebounceWithTime */
        class C12587a implements C5377a {

            /* renamed from: f */
            final /* synthetic */ int f32473f;

            C12587a(int i) {
                this.f32473f = i;
            }

            public void call() {
                C12586a aVar = C12586a.this;
                aVar.f32467f.mo40737a(this.f32473f, aVar.f32471j, aVar.f32468g);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12586a(C12475j jVar, C12888d dVar, C5373h.C5374a aVar, C12838e eVar) {
            super(jVar);
            this.f32469h = dVar;
            this.f32470i = aVar;
            this.f32471j = eVar;
        }

        public void onCompleted() {
            this.f32467f.mo40738a(this.f32471j, this);
        }

        public void onError(Throwable th) {
            this.f32471j.onError(th);
            unsubscribe();
            this.f32467f.mo40736a();
        }

        public void onNext(T t) {
            int a = this.f32467f.mo40735a(t);
            C12888d dVar = this.f32469h;
            C5373h.C5374a aVar = this.f32470i;
            C12587a aVar2 = new C12587a(a);
            C12585k0 k0Var = C12585k0.this;
            dVar.mo41109a(aVar.mo18712a(aVar2, k0Var.f32464f, k0Var.f32465g));
        }

        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public C12585k0(long j, TimeUnit timeUnit, C5373h hVar) {
        this.f32464f = j;
        this.f32465g = timeUnit;
        this.f32466h = hVar;
    }

    /* renamed from: a */
    public C12475j<? super T> call(C12475j<? super T> jVar) {
        C5373h.C5374a createWorker = this.f32466h.createWorker();
        C12838e eVar = new C12838e(jVar);
        C12888d dVar = new C12888d();
        eVar.add(createWorker);
        eVar.add(dVar);
        return new C12586a(jVar, dVar, createWorker, eVar);
    }

    /* renamed from: rx.n.a.k0$b */
    /* compiled from: OperatorDebounceWithTime */
    static final class C12588b<T> {

        /* renamed from: a */
        int f32475a;

        /* renamed from: b */
        T f32476b;

        /* renamed from: c */
        boolean f32477c;

        /* renamed from: d */
        boolean f32478d;

        /* renamed from: e */
        boolean f32479e;

        C12588b() {
        }

        /* renamed from: a */
        public synchronized int mo40735a(T t) {
            int i;
            this.f32476b = t;
            this.f32477c = true;
            i = this.f32475a + 1;
            this.f32475a = i;
            return i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            r4.onNext(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
            if (r2.f32478d != false) goto L_0x0026;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
            r2.f32479e = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0025, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0026, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0027, code lost:
            r4.onCompleted();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x002a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x002e, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x002f, code lost:
            p123rx.exceptions.C12472a.m40940a(r4, (p123rx.C5372f<?>) r5, (java.lang.Object) r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0032, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo40737a(int r3, p123rx.C12475j<T> r4, p123rx.C12475j<?> r5) {
            /*
                r2 = this;
                monitor-enter(r2)
                boolean r0 = r2.f32479e     // Catch:{ all -> 0x0035 }
                if (r0 != 0) goto L_0x0033
                boolean r0 = r2.f32477c     // Catch:{ all -> 0x0035 }
                if (r0 == 0) goto L_0x0033
                int r0 = r2.f32475a     // Catch:{ all -> 0x0035 }
                if (r3 == r0) goto L_0x000e
                goto L_0x0033
            L_0x000e:
                T r3 = r2.f32476b     // Catch:{ all -> 0x0035 }
                r0 = 0
                r2.f32476b = r0     // Catch:{ all -> 0x0035 }
                r0 = 0
                r2.f32477c = r0     // Catch:{ all -> 0x0035 }
                r1 = 1
                r2.f32479e = r1     // Catch:{ all -> 0x0035 }
                monitor-exit(r2)     // Catch:{ all -> 0x0035 }
                r4.onNext(r3)     // Catch:{ all -> 0x002e }
                monitor-enter(r2)
                boolean r3 = r2.f32478d     // Catch:{ all -> 0x002b }
                if (r3 != 0) goto L_0x0026
                r2.f32479e = r0     // Catch:{ all -> 0x002b }
                monitor-exit(r2)     // Catch:{ all -> 0x002b }
                return
            L_0x0026:
                monitor-exit(r2)     // Catch:{ all -> 0x002b }
                r4.onCompleted()
                return
            L_0x002b:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x002b }
                throw r3
            L_0x002e:
                r4 = move-exception
                p123rx.exceptions.C12472a.m40940a((java.lang.Throwable) r4, (p123rx.C5372f<?>) r5, (java.lang.Object) r3)
                return
            L_0x0033:
                monitor-exit(r2)     // Catch:{ all -> 0x0035 }
                return
            L_0x0035:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0035 }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p123rx.p401n.p402a.C12585k0.C12588b.mo40737a(int, rx.j, rx.j):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r5.onNext(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
            r5 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
            p123rx.exceptions.C12472a.m40940a(r5, (p123rx.C5372f<?>) r6, (java.lang.Object) r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
            r5.onCompleted();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0025, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (r2 == false) goto L_0x0022;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo40738a(p123rx.C12475j<T> r5, p123rx.C12475j<?> r6) {
            /*
                r4 = this;
                monitor-enter(r4)
                boolean r0 = r4.f32479e     // Catch:{ all -> 0x0026 }
                r1 = 1
                if (r0 == 0) goto L_0x000a
                r4.f32478d = r1     // Catch:{ all -> 0x0026 }
                monitor-exit(r4)     // Catch:{ all -> 0x0026 }
                return
            L_0x000a:
                T r0 = r4.f32476b     // Catch:{ all -> 0x0026 }
                boolean r2 = r4.f32477c     // Catch:{ all -> 0x0026 }
                r3 = 0
                r4.f32476b = r3     // Catch:{ all -> 0x0026 }
                r3 = 0
                r4.f32477c = r3     // Catch:{ all -> 0x0026 }
                r4.f32479e = r1     // Catch:{ all -> 0x0026 }
                monitor-exit(r4)     // Catch:{ all -> 0x0026 }
                if (r2 == 0) goto L_0x0022
                r5.onNext(r0)     // Catch:{ all -> 0x001d }
                goto L_0x0022
            L_0x001d:
                r5 = move-exception
                p123rx.exceptions.C12472a.m40940a((java.lang.Throwable) r5, (p123rx.C5372f<?>) r6, (java.lang.Object) r0)
                return
            L_0x0022:
                r5.onCompleted()
                return
            L_0x0026:
                r5 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0026 }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p123rx.p401n.p402a.C12585k0.C12588b.mo40738a(rx.j, rx.j):void");
        }

        /* renamed from: a */
        public synchronized void mo40736a() {
            this.f32475a++;
            this.f32476b = null;
            this.f32477c = false;
        }
    }
}
