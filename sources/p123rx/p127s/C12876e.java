package p123rx.p127s;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5372f;
import p123rx.p126m.C12492l;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;
import p123rx.p128t.C12889e;
import p123rx.p401n.p402a.C12558h;

/* renamed from: rx.s.e */
/* compiled from: SubjectSubscriptionManager */
final class C12876e<T> extends AtomicReference<C12878b<T>> implements C5368e.C5370a<T> {

    /* renamed from: f */
    volatile Object f33105f;

    /* renamed from: g */
    boolean f33106g = true;

    /* renamed from: h */
    C5378b<C12879c<T>> f33107h = C12492l.m40956a();

    /* renamed from: i */
    C5378b<C12879c<T>> f33108i = C12492l.m40956a();

    /* renamed from: j */
    C5378b<C12879c<T>> f33109j = C12492l.m40956a();

    /* renamed from: rx.s.e$a */
    /* compiled from: SubjectSubscriptionManager */
    class C12877a implements C5377a {

        /* renamed from: f */
        final /* synthetic */ C12879c f33110f;

        C12877a(C12879c cVar) {
            this.f33110f = cVar;
        }

        public void call() {
            C12876e.this.mo41093b(this.f33110f);
        }
    }

    /* renamed from: rx.s.e$b */
    /* compiled from: SubjectSubscriptionManager */
    protected static final class C12878b<T> {

        /* renamed from: c */
        static final C12879c[] f33112c;

        /* renamed from: d */
        static final C12878b f33113d;

        /* renamed from: e */
        static final C12878b f33114e = new C12878b(false, f33112c);

        /* renamed from: a */
        final boolean f33115a;

        /* renamed from: b */
        final C12879c[] f33116b;

        static {
            C12879c[] cVarArr = new C12879c[0];
            f33112c = cVarArr;
            f33113d = new C12878b(true, cVarArr);
        }

        public C12878b(boolean z, C12879c[] cVarArr) {
            this.f33115a = z;
            this.f33116b = cVarArr;
        }

        /* renamed from: a */
        public C12878b mo41095a(C12879c cVar) {
            C12879c[] cVarArr = this.f33116b;
            int length = cVarArr.length;
            C12879c[] cVarArr2 = new C12879c[(length + 1)];
            System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
            cVarArr2[length] = cVar;
            return new C12878b(this.f33115a, cVarArr2);
        }

        /* renamed from: b */
        public C12878b mo41096b(C12879c cVar) {
            C12879c[] cVarArr = this.f33116b;
            if (r1 == 1 && cVarArr[0] == cVar) {
                return f33114e;
            }
            if (r1 == 0) {
                return this;
            }
            int i = r1 - 1;
            C12879c[] cVarArr2 = new C12879c[i];
            int i2 = 0;
            for (C12879c cVar2 : cVarArr) {
                if (cVar2 != cVar) {
                    if (i2 == i) {
                        return this;
                    }
                    cVarArr2[i2] = cVar2;
                    i2++;
                }
            }
            if (i2 == 0) {
                return f33114e;
            }
            if (i2 < i) {
                C12879c[] cVarArr3 = new C12879c[i2];
                System.arraycopy(cVarArr2, 0, cVarArr3, 0, i2);
                cVarArr2 = cVarArr3;
            }
            return new C12878b(this.f33115a, cVarArr2);
        }
    }

    public C12876e() {
        super(C12878b.f33114e);
    }

    /* renamed from: a */
    public void call(C12475j<? super T> jVar) {
        C12879c cVar = new C12879c(jVar);
        mo41089a(jVar, cVar);
        this.f33107h.call(cVar);
        if (!jVar.isUnsubscribed() && mo41090a(cVar) && jVar.isUnsubscribed()) {
            mo41093b(cVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo41092b(Object obj) {
        this.f33105f = obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C12879c<T>[] mo41094c(Object obj) {
        mo41092b(obj);
        this.f33106g = false;
        if (((C12878b) get()).f33115a) {
            return C12878b.f33112c;
        }
        return ((C12878b) getAndSet(C12878b.f33113d)).f33116b;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo41093b(p123rx.p127s.C12876e.C12879c<T> r3) {
        /*
            r2 = this;
        L_0x0000:
            java.lang.Object r0 = r2.get()
            rx.s.e$b r0 = (p123rx.p127s.C12876e.C12878b) r0
            boolean r1 = r0.f33115a
            if (r1 == 0) goto L_0x000b
            return
        L_0x000b:
            rx.s.e$b r1 = r0.mo41096b(r3)
            if (r1 == r0) goto L_0x0017
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L_0x0000
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p123rx.p127s.C12876e.mo41093b(rx.s.e$c):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41089a(C12475j<? super T> jVar, C12879c<T> cVar) {
        jVar.add(C12889e.m41501a(new C12877a(cVar)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Object mo41087a() {
        return this.f33105f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo41090a(C12879c<T> cVar) {
        C12878b bVar;
        do {
            bVar = (C12878b) get();
            if (bVar.f33115a) {
                this.f33109j.call(cVar);
                return false;
            }
        } while (!compareAndSet(bVar, bVar.mo41095a(cVar)));
        this.f33108i.call(cVar);
        return true;
    }

    /* renamed from: rx.s.e$c */
    /* compiled from: SubjectSubscriptionManager */
    protected static final class C12879c<T> implements C5372f<T> {

        /* renamed from: f */
        final C12475j<? super T> f33117f;

        /* renamed from: g */
        boolean f33118g = true;

        /* renamed from: h */
        boolean f33119h;

        /* renamed from: i */
        List<Object> f33120i;

        /* renamed from: j */
        boolean f33121j;

        public C12879c(C12475j<? super T> jVar) {
            this.f33117f = jVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo41098a(List<Object> list, Object obj) {
            boolean z = true;
            boolean z2 = true;
            while (true) {
                if (list != null) {
                    try {
                        for (Object a : list) {
                            mo41097a(a);
                        }
                    } catch (Throwable th) {
                        th = th;
                        z = false;
                        if (!z) {
                            synchronized (this) {
                                this.f33119h = false;
                            }
                        }
                        throw th;
                    }
                }
                if (z2) {
                    mo41097a(obj);
                    z2 = false;
                }
                synchronized (this) {
                    try {
                        list = this.f33120i;
                        this.f33120i = null;
                        if (list == null) {
                            this.f33119h = false;
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

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            if (r2 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0015, code lost:
            mo41098a((java.util.List<java.lang.Object>) null, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo41099b(java.lang.Object r2) {
            /*
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.f33118g     // Catch:{ all -> 0x001c }
                if (r0 == 0) goto L_0x001a
                boolean r0 = r1.f33119h     // Catch:{ all -> 0x001c }
                if (r0 == 0) goto L_0x000a
                goto L_0x001a
            L_0x000a:
                r0 = 0
                r1.f33118g = r0     // Catch:{ all -> 0x001c }
                if (r2 == 0) goto L_0x0010
                r0 = 1
            L_0x0010:
                r1.f33119h = r0     // Catch:{ all -> 0x001c }
                monitor-exit(r1)     // Catch:{ all -> 0x001c }
                if (r2 == 0) goto L_0x0019
                r0 = 0
                r1.mo41098a(r0, r2)
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
            throw new UnsupportedOperationException("Method not decompiled: p123rx.p127s.C12876e.C12879c.mo41099b(java.lang.Object):void");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
            r1.f33121j = true;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo41100c(java.lang.Object r2) {
            /*
                r1 = this;
                boolean r0 = r1.f33121j
                if (r0 != 0) goto L_0x0026
                monitor-enter(r1)
                r0 = 0
                r1.f33118g = r0     // Catch:{ all -> 0x0023 }
                boolean r0 = r1.f33119h     // Catch:{ all -> 0x0023 }
                if (r0 == 0) goto L_0x001e
                java.util.List<java.lang.Object> r0 = r1.f33120i     // Catch:{ all -> 0x0023 }
                if (r0 != 0) goto L_0x0017
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0023 }
                r0.<init>()     // Catch:{ all -> 0x0023 }
                r1.f33120i = r0     // Catch:{ all -> 0x0023 }
            L_0x0017:
                java.util.List<java.lang.Object> r0 = r1.f33120i     // Catch:{ all -> 0x0023 }
                r0.add(r2)     // Catch:{ all -> 0x0023 }
                monitor-exit(r1)     // Catch:{ all -> 0x0023 }
                return
            L_0x001e:
                monitor-exit(r1)     // Catch:{ all -> 0x0023 }
                r0 = 1
                r1.f33121j = r0
                goto L_0x0026
            L_0x0023:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0023 }
                throw r2
            L_0x0026:
                rx.j<? super T> r0 = r1.f33117f
                p123rx.p401n.p402a.C12558h.m41017a(r0, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p123rx.p127s.C12876e.C12879c.mo41100c(java.lang.Object):void");
        }

        public void onCompleted() {
            this.f33117f.onCompleted();
        }

        public void onError(Throwable th) {
            this.f33117f.onError(th);
        }

        public void onNext(T t) {
            this.f33117f.onNext(t);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo41097a(Object obj) {
            if (obj != null) {
                C12558h.m41017a(this.f33117f, obj);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C12879c<T>[] mo41091a(Object obj) {
        mo41092b(obj);
        return ((C12878b) get()).f33116b;
    }
}
