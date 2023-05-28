package p123rx.p401n.p402a;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p123rx.C12473g;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5375k;
import p123rx.exceptions.MissingBackpressureException;
import p123rx.p126m.C5377a;
import p123rx.p128t.C12889e;
import p123rx.p401n.p406e.C12772h;
import p123rx.p401n.p406e.p407n.C12799e;
import p123rx.p401n.p406e.p408o.C12821s;
import p123rx.p401n.p406e.p408o.C12828z;
import p123rx.p409o.C12831b;

/* renamed from: rx.n.a.u0 */
/* compiled from: OperatorPublish */
public final class C12665u0<T> extends C12831b<T> {

    /* renamed from: g */
    final C5368e<? extends T> f32703g;

    /* renamed from: h */
    final AtomicReference<C12668c<T>> f32704h;

    /* renamed from: rx.n.a.u0$a */
    /* compiled from: OperatorPublish */
    static class C12666a implements C5368e.C5370a<T> {

        /* renamed from: f */
        final /* synthetic */ AtomicReference f32705f;

        C12666a(AtomicReference atomicReference) {
            this.f32705f = atomicReference;
        }

        /* renamed from: a */
        public void call(C12475j<? super T> jVar) {
            while (true) {
                C12668c cVar = (C12668c) this.f32705f.get();
                if (cVar == null || cVar.isUnsubscribed()) {
                    C12668c cVar2 = new C12668c(this.f32705f);
                    cVar2.mo40820b();
                    if (!this.f32705f.compareAndSet(cVar, cVar2)) {
                        continue;
                    } else {
                        cVar = cVar2;
                    }
                }
                C12667b bVar = new C12667b(cVar, jVar);
                if (cVar.mo40819a(bVar)) {
                    jVar.add(bVar);
                    jVar.setProducer(bVar);
                    return;
                }
            }
        }
    }

    /* renamed from: rx.n.a.u0$b */
    /* compiled from: OperatorPublish */
    static final class C12667b<T> extends AtomicLong implements C12473g, C5375k {

        /* renamed from: f */
        final C12668c<T> f32706f;

        /* renamed from: g */
        final C12475j<? super T> f32707g;

        public C12667b(C12668c<T> cVar, C12475j<? super T> jVar) {
            this.f32706f = cVar;
            this.f32707g = jVar;
            lazySet(-4611686018427387904L);
        }

        /* renamed from: a */
        public long mo40816a(long j) {
            long j2;
            long j3;
            if (j > 0) {
                do {
                    j2 = get();
                    if (j2 == -4611686018427387904L) {
                        throw new IllegalStateException("Produced without request");
                    } else if (j2 == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    } else {
                        j3 = j2 - j;
                        if (j3 < 0) {
                            throw new IllegalStateException("More produced (" + j + ") than requested (" + j2 + ")");
                        }
                    }
                } while (!compareAndSet(j2, j3));
                return j3;
            }
            throw new IllegalArgumentException("Cant produce zero or less");
        }

        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        public void request(long j) {
            long j2;
            long j3;
            if (j >= 0) {
                do {
                    j2 = get();
                    if (j2 != Long.MIN_VALUE) {
                        if (j2 >= 0 && j == 0) {
                            return;
                        }
                        if (j2 == -4611686018427387904L) {
                            j3 = j;
                        } else {
                            j3 = j2 + j;
                            if (j3 < 0) {
                                j3 = Long.MAX_VALUE;
                            }
                        }
                    } else {
                        return;
                    }
                } while (!compareAndSet(j2, j3));
                this.f32706f.mo40817a();
            }
        }

        public void unsubscribe() {
            if (get() != Long.MIN_VALUE && getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f32706f.mo40821b(this);
                this.f32706f.mo40817a();
            }
        }
    }

    /* renamed from: rx.n.a.u0$c */
    /* compiled from: OperatorPublish */
    static final class C12668c<T> extends C12475j<T> implements C5375k {

        /* renamed from: m */
        static final C12667b[] f32708m = new C12667b[0];

        /* renamed from: n */
        static final C12667b[] f32709n = new C12667b[0];

        /* renamed from: f */
        final Queue<Object> f32710f;

        /* renamed from: g */
        final AtomicReference<C12668c<T>> f32711g;

        /* renamed from: h */
        volatile Object f32712h;

        /* renamed from: i */
        final AtomicReference<C12667b[]> f32713i;

        /* renamed from: j */
        final AtomicBoolean f32714j;

        /* renamed from: k */
        boolean f32715k;

        /* renamed from: l */
        boolean f32716l;

        /* renamed from: rx.n.a.u0$c$a */
        /* compiled from: OperatorPublish */
        class C12669a implements C5377a {
            C12669a() {
            }

            public void call() {
                C12668c.this.f32713i.getAndSet(C12668c.f32709n);
                C12668c cVar = C12668c.this;
                cVar.f32711g.compareAndSet(cVar, (Object) null);
            }
        }

        public C12668c(AtomicReference<C12668c<T>> atomicReference) {
            this.f32710f = C12828z.m41379a() ? new C12821s<>(C12772h.f32957h) : new C12799e<>(C12772h.f32957h);
            this.f32713i = new AtomicReference<>(f32708m);
            this.f32711g = atomicReference;
            this.f32714j = new AtomicBoolean();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo40819a(C12667b<T> bVar) {
            C12667b[] bVarArr;
            C12667b[] bVarArr2;
            if (bVar != null) {
                do {
                    bVarArr = this.f32713i.get();
                    if (bVarArr == f32709n) {
                        return false;
                    }
                    int length = bVarArr.length;
                    bVarArr2 = new C12667b[(length + 1)];
                    System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                    bVarArr2[length] = bVar;
                } while (!this.f32713i.compareAndSet(bVarArr, bVarArr2));
                return true;
            }
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo40820b() {
            add(C12889e.m41501a(new C12669a()));
        }

        public void onCompleted() {
            if (this.f32712h == null) {
                this.f32712h = C12558h.m41014a();
                mo40817a();
            }
        }

        public void onError(Throwable th) {
            if (this.f32712h == null) {
                this.f32712h = C12558h.m41015a(th);
                mo40817a();
            }
        }

        public void onNext(T t) {
            if (!this.f32710f.offer(C12558h.m41020d(t))) {
                onError(new MissingBackpressureException());
            } else {
                mo40817a();
            }
        }

        public void onStart() {
            request((long) C12772h.f32957h);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo40821b(C12667b<T> bVar) {
            C12667b[] bVarArr;
            C12667b[] bVarArr2;
            do {
                bVarArr = this.f32713i.get();
                if (bVarArr != f32708m && bVarArr != f32709n) {
                    int i = -1;
                    int length = bVarArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (bVarArr[i2].equals(bVar)) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            bVarArr2 = f32708m;
                        } else {
                            C12667b[] bVarArr3 = new C12667b[(length - 1)];
                            System.arraycopy(bVarArr, 0, bVarArr3, 0, i);
                            System.arraycopy(bVarArr, i + 1, bVarArr3, i, (length - i) - 1);
                            bVarArr2 = bVarArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.f32713i.compareAndSet(bVarArr, bVarArr2));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo40818a(Object obj, boolean z) {
            int i = 0;
            if (obj != null) {
                if (!C12558h.m41019c(obj)) {
                    Throwable a = C12558h.m41016a(obj);
                    this.f32711g.compareAndSet(this, (Object) null);
                    try {
                        C12667b[] andSet = this.f32713i.getAndSet(f32709n);
                        int length = andSet.length;
                        while (i < length) {
                            andSet[i].f32707g.onError(a);
                            i++;
                        }
                        return true;
                    } finally {
                        unsubscribe();
                    }
                } else if (z) {
                    this.f32711g.compareAndSet(this, (Object) null);
                    try {
                        C12667b[] andSet2 = this.f32713i.getAndSet(f32709n);
                        int length2 = andSet2.length;
                        while (i < length2) {
                            andSet2[i].f32707g.onCompleted();
                            i++;
                        }
                        return true;
                    } finally {
                        unsubscribe();
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r0 = r1.f32712h;
            r4 = r1.f32710f.isEmpty();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
            if (mo40818a(r0, r4) == false) goto L_0x0021;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
            if (r4 != false) goto L_0x00c6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
            r5 = r1.f32713i.get();
            r0 = r5.length;
            r6 = Long.MAX_VALUE;
            r8 = r5.length;
            r9 = 0;
            r10 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
            if (r9 >= r8) goto L_0x0053;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
            r13 = r5[r9].get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
            if (r13 < 0) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
            r6 = java.lang.Math.min(r6, r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
            if (r13 != Long.MIN_VALUE) goto L_0x0050;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
            r10 = r10 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
            r9 = r9 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0055, code lost:
            if (r0 != r10) goto L_0x006f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
            r0 = r1.f32712h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
            if (r1.f32710f.poll() != null) goto L_0x0063;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0061, code lost:
            r4 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0063, code lost:
            r4 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0068, code lost:
            if (mo40818a(r0, r4) == false) goto L_0x006b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x006a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x006b, code lost:
            request(1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x006f, code lost:
            r10 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0070, code lost:
            r13 = (long) r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0073, code lost:
            if (r13 >= r6) goto L_0x00ba;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0075, code lost:
            r0 = r1.f32712h;
            r4 = r1.f32710f.poll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x007d, code lost:
            if (r4 != null) goto L_0x0081;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x007f, code lost:
            r15 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0081, code lost:
            r15 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0086, code lost:
            if (mo40818a(r0, r15) == false) goto L_0x0089;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0088, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0089, code lost:
            if (r15 == false) goto L_0x008d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x008b, code lost:
            r4 = r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x008d, code lost:
            r4 = p123rx.p401n.p402a.C12558h.m41018b(r4);
            r13 = r5.length;
            r14 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0093, code lost:
            if (r14 >= r13) goto L_0x00b5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0095, code lost:
            r2 = r5[r14];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x009d, code lost:
            if (r2.get() <= 0) goto L_0x00b1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
            r2.f32707g.onNext(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
            r2.mo40816a(1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a8, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a9, code lost:
            r2.unsubscribe();
            p123rx.exceptions.C12472a.m40940a(r0, (p123rx.C5372f<?>) r2.f32707g, r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00b5, code lost:
            r10 = r10 + 1;
            r4 = r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ba, code lost:
            if (r10 <= 0) goto L_0x00bf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x00bc, code lost:
            request(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c1, code lost:
            if (r6 == 0) goto L_0x00c6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x00c3, code lost:
            if (r4 != false) goto L_0x00c6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c6, code lost:
            monitor-enter(r18);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x00c9, code lost:
            if (r1.f32716l != false) goto L_0x00d2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x00cb, code lost:
            r1.f32715k = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
            monitor-exit(r18);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x00ce, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x00cf, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x00d0, code lost:
            r2 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
            r1.f32716l = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x00d4, code lost:
            monitor-exit(r18);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x00d8, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x00d9, code lost:
            r2 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
            monitor-exit(r18);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x00dc, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x00de, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x00e0, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x00e1, code lost:
            r2 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x00e2, code lost:
            if (r2 == false) goto L_0x00e4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x00e4, code lost:
            monitor-enter(r18);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
            r1.f32715k = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x00ec, code lost:
            throw r0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo40817a() {
            /*
                r18 = this;
                r1 = r18
                monitor-enter(r18)
                boolean r0 = r1.f32715k     // Catch:{ all -> 0x00ed }
                r2 = 1
                if (r0 == 0) goto L_0x000c
                r1.f32716l = r2     // Catch:{ all -> 0x00ed }
                monitor-exit(r18)     // Catch:{ all -> 0x00ed }
                return
            L_0x000c:
                r1.f32715k = r2     // Catch:{ all -> 0x00ed }
                r3 = 0
                r1.f32716l = r3     // Catch:{ all -> 0x00ed }
                monitor-exit(r18)     // Catch:{ all -> 0x00ed }
            L_0x0012:
                java.lang.Object r0 = r1.f32712h     // Catch:{ all -> 0x00e0 }
                java.util.Queue<java.lang.Object> r4 = r1.f32710f     // Catch:{ all -> 0x00e0 }
                boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x00e0 }
                boolean r0 = r1.mo40818a(r0, r4)     // Catch:{ all -> 0x00e0 }
                if (r0 == 0) goto L_0x0021
                return
            L_0x0021:
                if (r4 != 0) goto L_0x00c6
                java.util.concurrent.atomic.AtomicReference<rx.n.a.u0$b[]> r0 = r1.f32713i     // Catch:{ all -> 0x00e0 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00e0 }
                r5 = r0
                rx.n.a.u0$b[] r5 = (p123rx.p401n.p402a.C12665u0.C12667b[]) r5     // Catch:{ all -> 0x00e0 }
                int r0 = r5.length     // Catch:{ all -> 0x00e0 }
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r8 = r5.length     // Catch:{ all -> 0x00e0 }
                r9 = 0
                r10 = 0
            L_0x0035:
                r11 = 0
                if (r9 >= r8) goto L_0x0053
                r13 = r5[r9]     // Catch:{ all -> 0x00e0 }
                long r13 = r13.get()     // Catch:{ all -> 0x00e0 }
                int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r15 < 0) goto L_0x0048
                long r6 = java.lang.Math.min(r6, r13)     // Catch:{ all -> 0x00e0 }
                goto L_0x0050
            L_0x0048:
                r11 = -9223372036854775808
                int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r15 != 0) goto L_0x0050
                int r10 = r10 + 1
            L_0x0050:
                int r9 = r9 + 1
                goto L_0x0035
            L_0x0053:
                r8 = 1
                if (r0 != r10) goto L_0x006f
                java.lang.Object r0 = r1.f32712h     // Catch:{ all -> 0x00e0 }
                java.util.Queue<java.lang.Object> r4 = r1.f32710f     // Catch:{ all -> 0x00e0 }
                java.lang.Object r4 = r4.poll()     // Catch:{ all -> 0x00e0 }
                if (r4 != 0) goto L_0x0063
                r4 = 1
                goto L_0x0064
            L_0x0063:
                r4 = 0
            L_0x0064:
                boolean r0 = r1.mo40818a(r0, r4)     // Catch:{ all -> 0x00e0 }
                if (r0 == 0) goto L_0x006b
                return
            L_0x006b:
                r1.request(r8)     // Catch:{ all -> 0x00e0 }
                goto L_0x0012
            L_0x006f:
                r10 = 0
            L_0x0070:
                long r13 = (long) r10     // Catch:{ all -> 0x00e0 }
                int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
                if (r0 >= 0) goto L_0x00ba
                java.lang.Object r0 = r1.f32712h     // Catch:{ all -> 0x00e0 }
                java.util.Queue<java.lang.Object> r4 = r1.f32710f     // Catch:{ all -> 0x00e0 }
                java.lang.Object r4 = r4.poll()     // Catch:{ all -> 0x00e0 }
                if (r4 != 0) goto L_0x0081
                r15 = 1
                goto L_0x0082
            L_0x0081:
                r15 = 0
            L_0x0082:
                boolean r0 = r1.mo40818a(r0, r15)     // Catch:{ all -> 0x00e0 }
                if (r0 == 0) goto L_0x0089
                return
            L_0x0089:
                if (r15 == 0) goto L_0x008d
                r4 = r15
                goto L_0x00ba
            L_0x008d:
                java.lang.Object r4 = p123rx.p401n.p402a.C12558h.m41018b(r4)     // Catch:{ all -> 0x00e0 }
                int r13 = r5.length     // Catch:{ all -> 0x00e0 }
                r14 = 0
            L_0x0093:
                if (r14 >= r13) goto L_0x00b5
                r2 = r5[r14]     // Catch:{ all -> 0x00e0 }
                long r16 = r2.get()     // Catch:{ all -> 0x00e0 }
                int r0 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
                if (r0 <= 0) goto L_0x00b1
                rx.j<? super T> r0 = r2.f32707g     // Catch:{ all -> 0x00a8 }
                r0.onNext(r4)     // Catch:{ all -> 0x00a8 }
                r2.mo40816a(r8)     // Catch:{ all -> 0x00e0 }
                goto L_0x00b1
            L_0x00a8:
                r0 = move-exception
                r2.unsubscribe()     // Catch:{ all -> 0x00e0 }
                rx.j<? super T> r2 = r2.f32707g     // Catch:{ all -> 0x00e0 }
                p123rx.exceptions.C12472a.m40940a((java.lang.Throwable) r0, (p123rx.C5372f<?>) r2, (java.lang.Object) r4)     // Catch:{ all -> 0x00e0 }
            L_0x00b1:
                int r14 = r14 + 1
                r2 = 1
                goto L_0x0093
            L_0x00b5:
                int r10 = r10 + 1
                r4 = r15
                r2 = 1
                goto L_0x0070
            L_0x00ba:
                if (r10 <= 0) goto L_0x00bf
                r1.request(r13)     // Catch:{ all -> 0x00e0 }
            L_0x00bf:
                int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r0 == 0) goto L_0x00c6
                if (r4 != 0) goto L_0x00c6
                goto L_0x00d5
            L_0x00c6:
                monitor-enter(r18)     // Catch:{ all -> 0x00e0 }
                boolean r0 = r1.f32716l     // Catch:{ all -> 0x00d8 }
                if (r0 != 0) goto L_0x00d2
                r1.f32715k = r3     // Catch:{ all -> 0x00d8 }
                monitor-exit(r18)     // Catch:{ all -> 0x00cf }
                return
            L_0x00cf:
                r0 = move-exception
                r2 = 1
                goto L_0x00da
            L_0x00d2:
                r1.f32716l = r3     // Catch:{ all -> 0x00d8 }
                monitor-exit(r18)     // Catch:{ all -> 0x00d8 }
            L_0x00d5:
                r2 = 1
                goto L_0x0012
            L_0x00d8:
                r0 = move-exception
                r2 = 0
            L_0x00da:
                monitor-exit(r18)     // Catch:{ all -> 0x00de }
                throw r0     // Catch:{ all -> 0x00dc }
            L_0x00dc:
                r0 = move-exception
                goto L_0x00e2
            L_0x00de:
                r0 = move-exception
                goto L_0x00da
            L_0x00e0:
                r0 = move-exception
                r2 = 0
            L_0x00e2:
                if (r2 != 0) goto L_0x00ec
                monitor-enter(r18)
                r1.f32715k = r3     // Catch:{ all -> 0x00e9 }
                monitor-exit(r18)     // Catch:{ all -> 0x00e9 }
                goto L_0x00ec
            L_0x00e9:
                r0 = move-exception
                monitor-exit(r18)     // Catch:{ all -> 0x00e9 }
                throw r0
            L_0x00ec:
                throw r0
            L_0x00ed:
                r0 = move-exception
                monitor-exit(r18)     // Catch:{ all -> 0x00ed }
                goto L_0x00f1
            L_0x00f0:
                throw r0
            L_0x00f1:
                goto L_0x00f0
            */
            throw new UnsupportedOperationException("Method not decompiled: p123rx.p401n.p402a.C12665u0.C12668c.mo40817a():void");
        }
    }

    private C12665u0(C5368e.C5370a<T> aVar, C5368e<? extends T> eVar, AtomicReference<C12668c<T>> atomicReference) {
        super(aVar);
        this.f32703g = eVar;
        this.f32704h = atomicReference;
    }

    /* renamed from: j */
    public static <T> C12831b<T> m41149j(C5368e<? extends T> eVar) {
        AtomicReference atomicReference = new AtomicReference();
        return new C12665u0(new C12666a(atomicReference), eVar, atomicReference);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo40814d(p123rx.p126m.C5378b<? super p123rx.C5375k> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<rx.n.a.u0$c<T>> r0 = r4.f32704h
            java.lang.Object r0 = r0.get()
            rx.n.a.u0$c r0 = (p123rx.p401n.p402a.C12665u0.C12668c) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.isUnsubscribed()
            if (r1 == 0) goto L_0x0024
        L_0x0010:
            rx.n.a.u0$c r1 = new rx.n.a.u0$c
            java.util.concurrent.atomic.AtomicReference<rx.n.a.u0$c<T>> r2 = r4.f32704h
            r1.<init>(r2)
            r1.mo40820b()
            java.util.concurrent.atomic.AtomicReference<rx.n.a.u0$c<T>> r2 = r4.f32704h
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 != 0) goto L_0x0023
            goto L_0x0000
        L_0x0023:
            r0 = r1
        L_0x0024:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f32714j
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0037
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f32714j
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r2 = 0
        L_0x0038:
            r5.call(r0)
            if (r2 == 0) goto L_0x0042
            rx.e<? extends T> r5 = r4.f32703g
            r5.mo18668b(r0)
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p123rx.p401n.p402a.C12665u0.mo40814d(rx.m.b):void");
    }
}
