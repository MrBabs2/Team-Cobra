package p123rx.p401n.p402a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p123rx.C12473g;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5375k;
import p123rx.exceptions.CompositeException;
import p123rx.p126m.C12498q;
import p123rx.p401n.p406e.C12772h;
import p123rx.p401n.p406e.p407n.C12801g;
import p123rx.p411q.C12844c;

/* renamed from: rx.n.a.j */
/* compiled from: OnSubscribeCombineLatest */
public final class C12574j<T, R> implements C5368e.C5370a<R> {

    /* renamed from: f */
    final C5368e<? extends T>[] f32416f;

    /* renamed from: g */
    final Iterable<? extends C5368e<? extends T>> f32417g;

    /* renamed from: h */
    final C12498q<? extends R> f32418h;

    /* renamed from: i */
    final int f32419i;

    /* renamed from: j */
    final boolean f32420j;

    /* renamed from: rx.n.a.j$a */
    /* compiled from: OnSubscribeCombineLatest */
    static final class C12575a<T, R> extends C12475j<T> {

        /* renamed from: f */
        final C12576b<T, R> f32421f;

        /* renamed from: g */
        final int f32422g;

        /* renamed from: h */
        boolean f32423h;

        public C12575a(C12576b<T, R> bVar, int i) {
            this.f32421f = bVar;
            this.f32422g = i;
            request((long) bVar.f32428i);
        }

        /* renamed from: a */
        public void mo40717a(long j) {
            request(j);
        }

        public void onCompleted() {
            if (!this.f32423h) {
                this.f32423h = true;
                this.f32421f.mo40719a((Object) null, this.f32422g);
            }
        }

        public void onError(Throwable th) {
            if (this.f32423h) {
                C12844c.m41417b(th);
                return;
            }
            this.f32421f.mo40720a(th);
            this.f32423h = true;
            this.f32421f.mo40719a((Object) null, this.f32422g);
        }

        public void onNext(T t) {
            if (!this.f32423h) {
                this.f32421f.mo40719a(C12558h.m41020d(t), this.f32422g);
            }
        }
    }

    public C12574j(Iterable<? extends C5368e<? extends T>> iterable, C12498q<? extends R> qVar) {
        this((C5368e<? extends T>[]) null, iterable, qVar, C12772h.f32957h, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void call(p123rx.C12475j<? super R> r9) {
        /*
            r8 = this;
            rx.e<? extends T>[] r0 = r8.f32416f
            if (r0 != 0) goto L_0x0045
            java.lang.Iterable<? extends rx.e<? extends T>> r0 = r8.f32417g
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L_0x001a
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            rx.e[] r1 = new p123rx.C5368e[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            rx.e[] r0 = (p123rx.C5368e[]) r0
            int r1 = r0.length
            goto L_0x0046
        L_0x001a:
            r1 = 8
            rx.e[] r1 = new p123rx.C5368e[r1]
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = 0
        L_0x0024:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0042
            java.lang.Object r4 = r0.next()
            rx.e r4 = (p123rx.C5368e) r4
            int r5 = r1.length
            if (r3 != r5) goto L_0x003c
            int r5 = r3 >> 2
            int r5 = r5 + r3
            rx.e[] r5 = new p123rx.C5368e[r5]
            java.lang.System.arraycopy(r1, r2, r5, r2, r3)
            r1 = r5
        L_0x003c:
            int r5 = r3 + 1
            r1[r3] = r4
            r3 = r5
            goto L_0x0024
        L_0x0042:
            r0 = r1
            r4 = r3
            goto L_0x0047
        L_0x0045:
            int r1 = r0.length
        L_0x0046:
            r4 = r1
        L_0x0047:
            if (r4 != 0) goto L_0x004d
            r9.onCompleted()
            return
        L_0x004d:
            rx.n.a.j$b r7 = new rx.n.a.j$b
            rx.m.q<? extends R> r3 = r8.f32418h
            int r5 = r8.f32419i
            boolean r6 = r8.f32420j
            r1 = r7
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r7.mo40722a((p123rx.C5368e<? extends T>[]) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p123rx.p401n.p402a.C12574j.call(rx.j):void");
    }

    public C12574j(C5368e<? extends T>[] eVarArr, Iterable<? extends C5368e<? extends T>> iterable, C12498q<? extends R> qVar, int i, boolean z) {
        this.f32416f = eVarArr;
        this.f32417g = iterable;
        this.f32418h = qVar;
        this.f32419i = i;
        this.f32420j = z;
    }

    /* renamed from: rx.n.a.j$b */
    /* compiled from: OnSubscribeCombineLatest */
    static final class C12576b<T, R> extends AtomicInteger implements C12473g, C5375k {

        /* renamed from: s */
        static final Object f32424s = new Object();

        /* renamed from: f */
        final C12475j<? super R> f32425f;

        /* renamed from: g */
        final C12498q<? extends R> f32426g;

        /* renamed from: h */
        final C12575a<T, R>[] f32427h;

        /* renamed from: i */
        final int f32428i;

        /* renamed from: j */
        final Object[] f32429j;

        /* renamed from: k */
        final C12801g<Object> f32430k;

        /* renamed from: l */
        final boolean f32431l;

        /* renamed from: m */
        volatile boolean f32432m;

        /* renamed from: n */
        volatile boolean f32433n;

        /* renamed from: o */
        final AtomicLong f32434o = new AtomicLong();

        /* renamed from: p */
        final AtomicReference<Throwable> f32435p = new AtomicReference<>();

        /* renamed from: q */
        int f32436q;

        /* renamed from: r */
        int f32437r;

        public C12576b(C12475j<? super R> jVar, C12498q<? extends R> qVar, int i, int i2, boolean z) {
            this.f32425f = jVar;
            this.f32426g = qVar;
            this.f32428i = i2;
            this.f32431l = z;
            Object[] objArr = new Object[i];
            this.f32429j = objArr;
            Arrays.fill(objArr, f32424s);
            this.f32427h = new C12575a[i];
            this.f32430k = new C12801g<>(i2);
        }

        /* renamed from: a */
        public void mo40722a(C5368e<? extends T>[] eVarArr) {
            C12575a<T, R>[] aVarArr = this.f32427h;
            int length = aVarArr.length;
            for (int i = 0; i < length; i++) {
                aVarArr[i] = new C12575a<>(this, i);
            }
            lazySet(0);
            this.f32425f.add(this);
            this.f32425f.setProducer(this);
            for (int i2 = 0; i2 < length && !this.f32432m; i2++) {
                eVarArr[i2].mo18654a(aVarArr[i2]);
            }
        }

        public boolean isUnsubscribed() {
            return this.f32432m;
        }

        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= required but it was " + j);
            } else if (j != 0) {
                C12502a.m40960a(this.f32434o, j);
                mo40718a();
            }
        }

        public void unsubscribe() {
            if (!this.f32432m) {
                this.f32432m = true;
                if (getAndIncrement() == 0) {
                    mo40721a((Queue<?>) this.f32430k);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40721a(Queue<?> queue) {
            queue.clear();
            for (C12575a<T, R> unsubscribe : this.f32427h) {
                unsubscribe.unsubscribe();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40719a(Object obj, int i) {
            boolean z;
            C12575a<T, R> aVar = this.f32427h[i];
            synchronized (this) {
                int length = this.f32429j.length;
                Object obj2 = this.f32429j[i];
                int i2 = this.f32436q;
                if (obj2 == f32424s) {
                    i2++;
                    this.f32436q = i2;
                }
                int i3 = this.f32437r;
                if (obj == null) {
                    i3++;
                    this.f32437r = i3;
                } else {
                    this.f32429j[i] = C12558h.m41018b(obj);
                }
                boolean z2 = false;
                z = i2 == length;
                if (i3 == length || (obj == null && obj2 == f32424s)) {
                    z2 = true;
                }
                if (z2) {
                    this.f32433n = true;
                } else if (obj != null && z) {
                    this.f32430k.mo40962a(aVar, this.f32429j.clone());
                } else if (obj == null && this.f32435p.get() != null && (obj2 == f32424s || !this.f32431l)) {
                    this.f32433n = true;
                }
            }
            if (z || obj == null) {
                mo40718a();
            } else {
                aVar.mo40717a(1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40718a() {
            long j;
            if (getAndIncrement() == 0) {
                C12801g<Object> gVar = this.f32430k;
                C12475j<? super R> jVar = this.f32425f;
                boolean z = this.f32431l;
                AtomicLong atomicLong = this.f32434o;
                int i = 1;
                do {
                    if (!mo40723a(this.f32433n, gVar.isEmpty(), jVar, gVar, z)) {
                        long j2 = atomicLong.get();
                        long j3 = 0;
                        while (true) {
                            if (j3 == j2) {
                                j = j3;
                                break;
                            }
                            boolean z2 = this.f32433n;
                            C12575a aVar = (C12575a) gVar.peek();
                            boolean z3 = aVar == null;
                            C12575a aVar2 = aVar;
                            long j4 = j3;
                            if (!mo40723a(z2, z3, jVar, gVar, z)) {
                                if (z3) {
                                    j = j4;
                                    break;
                                }
                                gVar.poll();
                                Object[] objArr = (Object[]) gVar.poll();
                                if (objArr == null) {
                                    this.f32432m = true;
                                    mo40721a((Queue<?>) gVar);
                                    jVar.onError(new IllegalStateException("Broken queue?! Sender received but not the array."));
                                    return;
                                }
                                try {
                                    jVar.onNext(this.f32426g.call(objArr));
                                    aVar2.mo40717a(1);
                                    j3 = j4 + 1;
                                } catch (Throwable th) {
                                    this.f32432m = true;
                                    mo40721a((Queue<?>) gVar);
                                    jVar.onError(th);
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        if (!(j == 0 || j2 == Long.MAX_VALUE)) {
                            C12502a.m40962b(atomicLong, j);
                        }
                        i = addAndGet(-i);
                    } else {
                        return;
                    }
                } while (i != 0);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo40723a(boolean z, boolean z2, C12475j<?> jVar, Queue<?> queue, boolean z3) {
            if (this.f32432m) {
                mo40721a(queue);
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!z3) {
                    Throwable th = this.f32435p.get();
                    if (th != null) {
                        mo40721a(queue);
                        jVar.onError(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        jVar.onCompleted();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = this.f32435p.get();
                    if (th2 != null) {
                        jVar.onError(th2);
                    } else {
                        jVar.onCompleted();
                    }
                    return true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40720a(Throwable th) {
            Throwable th2;
            Throwable th3;
            AtomicReference<Throwable> atomicReference = this.f32435p;
            do {
                th2 = atomicReference.get();
                if (th2 == null) {
                    th3 = th;
                } else if (th2 instanceof CompositeException) {
                    ArrayList arrayList = new ArrayList(((CompositeException) th2).mo40644a());
                    arrayList.add(th);
                    th3 = new CompositeException((Collection<? extends Throwable>) arrayList);
                } else {
                    th3 = new CompositeException((Collection<? extends Throwable>) Arrays.asList(new Throwable[]{th2, th}));
                }
            } while (!atomicReference.compareAndSet(th2, th3));
        }
    }
}
