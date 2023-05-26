package p123rx.p401n.p402a;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p123rx.C12473g;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5372f;
import p123rx.C5375k;
import p123rx.exceptions.C12472a;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5379n;
import p123rx.p128t.C12889e;
import p123rx.p401n.p406e.p407n.C12799e;
import p123rx.p401n.p406e.p408o.C12821s;
import p123rx.p401n.p406e.p408o.C12828z;

/* renamed from: rx.n.a.p0 */
/* compiled from: OperatorEagerConcatMap */
public final class C12617p0<T, R> implements C5368e.C5371b<R, T> {

    /* renamed from: f */
    final C5379n<? super T, ? extends C5368e<? extends R>> f32546f;

    /* renamed from: g */
    final int f32547g;

    /* renamed from: h */
    private final int f32548h;

    /* renamed from: rx.n.a.p0$a */
    /* compiled from: OperatorEagerConcatMap */
    static final class C12618a<T> extends C12475j<T> {

        /* renamed from: f */
        final C12620c<?, T> f32549f;

        /* renamed from: g */
        final Queue<Object> f32550g;

        /* renamed from: h */
        volatile boolean f32551h;

        /* renamed from: i */
        Throwable f32552i;

        public C12618a(C12620c<?, T> cVar, int i) {
            Queue<Object> queue;
            this.f32549f = cVar;
            if (C12828z.m41379a()) {
                queue = new C12821s<>(i);
            } else {
                queue = new C12799e<>(i);
            }
            this.f32550g = queue;
            request((long) i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40756a(long j) {
            request(j);
        }

        public void onCompleted() {
            this.f32551h = true;
            this.f32549f.mo40758b();
        }

        public void onError(Throwable th) {
            this.f32552i = th;
            this.f32551h = true;
            this.f32549f.mo40758b();
        }

        public void onNext(T t) {
            this.f32550g.offer(C12558h.m41020d(t));
            this.f32549f.mo40758b();
        }
    }

    /* renamed from: rx.n.a.p0$b */
    /* compiled from: OperatorEagerConcatMap */
    static final class C12619b extends AtomicLong implements C12473g {

        /* renamed from: f */
        final C12620c<?, ?> f32553f;

        public C12619b(C12620c<?, ?> cVar) {
            this.f32553f = cVar;
        }

        public void request(long j) {
            if (j < 0) {
                throw new IllegalStateException("n >= 0 required but it was " + j);
            } else if (j > 0) {
                C12502a.m40960a((AtomicLong) this, j);
                this.f32553f.mo40758b();
            }
        }
    }

    /* renamed from: rx.n.a.p0$c */
    /* compiled from: OperatorEagerConcatMap */
    static final class C12620c<T, R> extends C12475j<T> {

        /* renamed from: f */
        final C5379n<? super T, ? extends C5368e<? extends R>> f32554f;

        /* renamed from: g */
        final int f32555g;

        /* renamed from: h */
        final C12475j<? super R> f32556h;

        /* renamed from: i */
        final Queue<C12618a<R>> f32557i = new LinkedList();

        /* renamed from: j */
        volatile boolean f32558j;

        /* renamed from: k */
        Throwable f32559k;

        /* renamed from: l */
        volatile boolean f32560l;

        /* renamed from: m */
        final AtomicInteger f32561m = new AtomicInteger();

        /* renamed from: n */
        private C12619b f32562n;

        /* renamed from: rx.n.a.p0$c$a */
        /* compiled from: OperatorEagerConcatMap */
        class C12621a implements C5377a {
            C12621a() {
            }

            public void call() {
                C12620c.this.f32560l = true;
                if (C12620c.this.f32561m.getAndIncrement() == 0) {
                    C12620c.this.mo40757a();
                }
            }
        }

        public C12620c(C5379n<? super T, ? extends C5368e<? extends R>> nVar, int i, int i2, C12475j<? super R> jVar) {
            this.f32554f = nVar;
            this.f32555g = i;
            this.f32556h = jVar;
            request(i2 == Integer.MAX_VALUE ? Long.MAX_VALUE : (long) i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40757a() {
            ArrayList<C5375k> arrayList;
            synchronized (this.f32557i) {
                arrayList = new ArrayList<>(this.f32557i);
                this.f32557i.clear();
            }
            for (C5375k unsubscribe : arrayList) {
                unsubscribe.unsubscribe();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo40758b() {
            C12618a peek;
            int i;
            if (this.f32561m.getAndIncrement() == 0) {
                C12619b bVar = this.f32562n;
                C12475j<? super R> jVar = this.f32556h;
                int i2 = 1;
                while (!this.f32560l) {
                    boolean z = this.f32558j;
                    synchronized (this.f32557i) {
                        peek = this.f32557i.peek();
                    }
                    boolean z2 = false;
                    boolean z3 = peek == null;
                    if (z) {
                        Throwable th = this.f32559k;
                        if (th != null) {
                            mo40757a();
                            jVar.onError(th);
                            return;
                        } else if (z3) {
                            jVar.onCompleted();
                            return;
                        }
                    }
                    if (!z3) {
                        long j = bVar.get();
                        Queue<Object> queue = peek.f32550g;
                        long j2 = 0;
                        while (true) {
                            boolean z4 = peek.f32551h;
                            Object peek2 = queue.peek();
                            i = i2;
                            boolean z5 = peek2 == null;
                            if (z4) {
                                Throwable th2 = peek.f32552i;
                                if (th2 == null) {
                                    if (z5) {
                                        synchronized (this.f32557i) {
                                            this.f32557i.poll();
                                        }
                                        peek.unsubscribe();
                                        request(1);
                                        z2 = true;
                                        break;
                                    }
                                } else {
                                    mo40757a();
                                    jVar.onError(th2);
                                    return;
                                }
                            }
                            if (z5 || j == j2) {
                                break;
                            }
                            queue.poll();
                            try {
                                jVar.onNext(C12558h.m41018b(peek2));
                                j2++;
                                i2 = i;
                            } catch (Throwable th3) {
                                C12472a.m40940a(th3, (C5372f<?>) jVar, peek2);
                                return;
                            }
                        }
                        if (j2 != 0) {
                            if (j != Long.MAX_VALUE) {
                                C12502a.m40962b(bVar, j2);
                            }
                            if (!z2) {
                                peek.mo40756a(j2);
                            }
                        }
                        if (z2) {
                            i2 = i;
                        }
                    } else {
                        i = i2;
                    }
                    i2 = this.f32561m.addAndGet(-i);
                    if (i2 == 0) {
                        return;
                    }
                }
                mo40757a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo40759c() {
            this.f32562n = new C12619b(this);
            add(C12889e.m41501a(new C12621a()));
            this.f32556h.add(this);
            this.f32556h.setProducer(this.f32562n);
        }

        public void onCompleted() {
            this.f32558j = true;
            mo40758b();
        }

        public void onError(Throwable th) {
            this.f32559k = th;
            this.f32558j = true;
            mo40758b();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
            if (r3.f32560l == false) goto L_0x0028;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
            r0.mo18668b(r4);
            mo40758b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onNext(T r4) {
            /*
                r3 = this;
                rx.m.n<? super T, ? extends rx.e<? extends R>> r0 = r3.f32554f     // Catch:{ all -> 0x0032 }
                java.lang.Object r0 = r0.call(r4)     // Catch:{ all -> 0x0032 }
                rx.e r0 = (p123rx.C5368e) r0     // Catch:{ all -> 0x0032 }
                boolean r4 = r3.f32560l
                if (r4 == 0) goto L_0x000d
                return
            L_0x000d:
                rx.n.a.p0$a r4 = new rx.n.a.p0$a
                int r1 = r3.f32555g
                r4.<init>(r3, r1)
                java.util.Queue<rx.n.a.p0$a<R>> r1 = r3.f32557i
                monitor-enter(r1)
                boolean r2 = r3.f32560l     // Catch:{ all -> 0x002f }
                if (r2 == 0) goto L_0x001d
                monitor-exit(r1)     // Catch:{ all -> 0x002f }
                return
            L_0x001d:
                java.util.Queue<rx.n.a.p0$a<R>> r2 = r3.f32557i     // Catch:{ all -> 0x002f }
                r2.add(r4)     // Catch:{ all -> 0x002f }
                monitor-exit(r1)     // Catch:{ all -> 0x002f }
                boolean r1 = r3.f32560l
                if (r1 == 0) goto L_0x0028
                return
            L_0x0028:
                r0.mo18668b(r4)
                r3.mo40758b()
                return
            L_0x002f:
                r4 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x002f }
                throw r4
            L_0x0032:
                r0 = move-exception
                rx.j<? super R> r1 = r3.f32556h
                p123rx.exceptions.C12472a.m40940a((java.lang.Throwable) r0, (p123rx.C5372f<?>) r1, (java.lang.Object) r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p123rx.p401n.p402a.C12617p0.C12620c.onNext(java.lang.Object):void");
        }
    }

    public C12617p0(C5379n<? super T, ? extends C5368e<? extends R>> nVar, int i, int i2) {
        this.f32546f = nVar;
        this.f32547g = i;
        this.f32548h = i2;
    }

    /* renamed from: a */
    public C12475j<? super T> call(C12475j<? super R> jVar) {
        C12620c cVar = new C12620c(this.f32546f, this.f32547g, this.f32548h, jVar);
        cVar.mo40759c();
        return cVar;
    }
}
