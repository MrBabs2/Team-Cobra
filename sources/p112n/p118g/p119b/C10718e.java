package p112n.p118g.p119b;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5372f;
import p123rx.p126m.C12492l;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;
import p123rx.p128t.C12889e;

/* renamed from: n.g.b.e */
/* compiled from: RelaySubscriptionManager */
final class C10718e<T> extends AtomicReference<C10721c<T>> implements C5368e.C5370a<T> {

    /* renamed from: f */
    volatile Object f28739f;

    /* renamed from: g */
    boolean f28740g = true;

    /* renamed from: h */
    C5378b<C10720b<T>> f28741h = C12492l.m40956a();

    /* renamed from: i */
    C5378b<C10720b<T>> f28742i = C12492l.m40956a();

    /* renamed from: n.g.b.e$a */
    /* compiled from: RelaySubscriptionManager */
    class C10719a implements C5377a {

        /* renamed from: f */
        final /* synthetic */ C10720b f28743f;

        C10719a(C10720b bVar) {
            this.f28743f = bVar;
        }

        public void call() {
            C10718e.this.mo36375a(this.f28743f);
        }
    }

    /* renamed from: n.g.b.e$c */
    /* compiled from: RelaySubscriptionManager */
    static final class C10721c<T> {

        /* renamed from: b */
        static final C10721c f28750b = new C10721c(new C10720b[0]);

        /* renamed from: a */
        final C10720b[] f28751a;

        C10721c(C10720b[] bVarArr) {
            this.f28751a = bVarArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C10721c mo36382a(C10720b bVar) {
            C10720b[] bVarArr = this.f28751a;
            int length = bVarArr.length;
            C10720b[] bVarArr2 = new C10720b[(length + 1)];
            System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
            bVarArr2[length] = bVar;
            return new C10721c(bVarArr2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C10721c mo36383b(C10720b bVar) {
            C10720b[] bVarArr = this.f28751a;
            if (r1 == 1 && bVarArr[0] == bVar) {
                return f28750b;
            }
            if (r1 == 0) {
                return this;
            }
            int i = r1 - 1;
            C10720b[] bVarArr2 = new C10720b[i];
            int i2 = 0;
            for (C10720b bVar2 : bVarArr) {
                if (bVar2 != bVar) {
                    if (i2 == i) {
                        return this;
                    }
                    bVarArr2[i2] = bVar2;
                    i2++;
                }
            }
            if (i2 == 0) {
                return f28750b;
            }
            if (i2 < i) {
                C10720b[] bVarArr3 = new C10720b[i2];
                System.arraycopy(bVarArr2, 0, bVarArr3, 0, i2);
                bVarArr2 = bVarArr3;
            }
            return new C10721c(bVarArr2);
        }
    }

    C10718e() {
        super(C10721c.f28750b);
    }

    /* renamed from: a */
    public void call(C12475j<? super T> jVar) {
        C10720b bVar = new C10720b(jVar);
        m36238a(jVar, bVar);
        this.f28741h.call(bVar);
        if (!jVar.isUnsubscribed()) {
            m36239b(bVar);
            if (jVar.isUnsubscribed()) {
                mo36375a(bVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo36378b(Object obj) {
        this.f28739f = obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C10720b<T>[] mo36379b() {
        return ((C10721c) get()).f28751a;
    }

    /* renamed from: b */
    private void m36239b(C10720b<T> bVar) {
        C10721c cVar;
        do {
            cVar = (C10721c) get();
        } while (!compareAndSet(cVar, cVar.mo36382a(bVar)));
        this.f28742i.call(bVar);
    }

    /* renamed from: n.g.b.e$b */
    /* compiled from: RelaySubscriptionManager */
    static final class C10720b<T> implements C5372f<T> {

        /* renamed from: f */
        final C5372f<? super T> f28745f;

        /* renamed from: g */
        boolean f28746g = true;

        /* renamed from: h */
        boolean f28747h;

        /* renamed from: i */
        List<Object> f28748i;

        /* renamed from: j */
        boolean f28749j;

        C10720b(C5372f<? super T> fVar) {
            this.f28745f = fVar;
        }

        /* renamed from: c */
        private void m36247c(Object obj) {
            if (obj != null) {
                C10716b.m36237a(this.f28745f, obj);
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            if (r2 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0015, code lost:
            m36246a((java.util.List<java.lang.Object>) null, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo36380a(java.lang.Object r2) {
            /*
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.f28746g     // Catch:{ all -> 0x001c }
                if (r0 == 0) goto L_0x001a
                boolean r0 = r1.f28747h     // Catch:{ all -> 0x001c }
                if (r0 == 0) goto L_0x000a
                goto L_0x001a
            L_0x000a:
                r0 = 0
                r1.f28746g = r0     // Catch:{ all -> 0x001c }
                if (r2 == 0) goto L_0x0010
                r0 = 1
            L_0x0010:
                r1.f28747h = r0     // Catch:{ all -> 0x001c }
                monitor-exit(r1)     // Catch:{ all -> 0x001c }
                if (r2 == 0) goto L_0x0019
                r0 = 0
                r1.m36246a(r0, r2)
            L_0x0019:
                return
            L_0x001a:
                monitor-exit(r1)     // Catch:{ all -> 0x001c }
                return
            L_0x001c:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x001c }
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p112n.p118g.p119b.C10718e.C10720b.mo36380a(java.lang.Object):void");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
            r1.f28749j = true;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo36381b(java.lang.Object r2) {
            /*
                r1 = this;
                boolean r0 = r1.f28749j
                if (r0 != 0) goto L_0x0026
                monitor-enter(r1)
                r0 = 0
                r1.f28746g = r0     // Catch:{ all -> 0x0023 }
                boolean r0 = r1.f28747h     // Catch:{ all -> 0x0023 }
                if (r0 == 0) goto L_0x001e
                java.util.List<java.lang.Object> r0 = r1.f28748i     // Catch:{ all -> 0x0023 }
                if (r0 != 0) goto L_0x0017
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0023 }
                r0.<init>()     // Catch:{ all -> 0x0023 }
                r1.f28748i = r0     // Catch:{ all -> 0x0023 }
            L_0x0017:
                java.util.List<java.lang.Object> r0 = r1.f28748i     // Catch:{ all -> 0x0023 }
                r0.add(r2)     // Catch:{ all -> 0x0023 }
                monitor-exit(r1)     // Catch:{ all -> 0x0023 }
                return
            L_0x001e:
                monitor-exit(r1)     // Catch:{ all -> 0x0023 }
                r0 = 1
                r1.f28749j = r0
                goto L_0x0026
            L_0x0023:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0023 }
                throw r2
            L_0x0026:
                rx.f<? super T> r0 = r1.f28745f
                p112n.p118g.p119b.C10716b.m36237a(r0, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p112n.p118g.p119b.C10718e.C10720b.mo36381b(java.lang.Object):void");
        }

        public void onCompleted() {
            throw new AssertionError();
        }

        public void onError(Throwable th) {
            throw new AssertionError();
        }

        public void onNext(T t) {
            this.f28745f.onNext(t);
        }

        /* renamed from: a */
        private void m36246a(List<Object> list, Object obj) {
            boolean z = true;
            boolean z2 = true;
            while (true) {
                if (list != null) {
                    try {
                        for (Object c : list) {
                            m36247c(c);
                        }
                    } catch (Throwable th) {
                        th = th;
                        z = false;
                        if (!z) {
                            synchronized (this) {
                                this.f28747h = false;
                            }
                        }
                        throw th;
                    }
                }
                if (z2) {
                    m36247c(obj);
                    z2 = false;
                }
                synchronized (this) {
                    try {
                        list = this.f28748i;
                        this.f28748i = null;
                        if (list == null) {
                            this.f28747h = false;
                            try {
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        z = false;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m36238a(C12475j<? super T> jVar, C10720b<T> bVar) {
        jVar.add(C12889e.m41501a(new C10719a(bVar)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Object mo36374a() {
        return this.f28739f;
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: a */
    void mo36375a(p112n.p118g.p119b.C10718e.C10720b<T> r3) {
        /*
            r2 = this;
        L_0x0000:
            java.lang.Object r0 = r2.get()
            n.g.b.e$c r0 = (p112n.p118g.p119b.C10718e.C10721c) r0
            n.g.b.e$c r1 = r0.mo36383b(r3)
            if (r1 == r0) goto L_0x0012
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L_0x0000
        L_0x0012:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p112n.p118g.p119b.C10718e.mo36375a(n.g.b.e$b):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C10720b<T>[] mo36377a(Object obj) {
        mo36378b(obj);
        return ((C10721c) get()).f28751a;
    }
}
