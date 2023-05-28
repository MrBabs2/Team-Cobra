package p123rx.p401n.p402a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import p123rx.C12473g;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5375k;
import p123rx.exceptions.CompositeException;
import p123rx.exceptions.MissingBackpressureException;
import p123rx.exceptions.OnErrorThrowable;
import p123rx.p128t.C5383b;
import p123rx.p401n.p406e.C12772h;
import p123rx.p401n.p406e.C12775j;
import p123rx.p401n.p406e.p407n.C12799e;
import p123rx.p401n.p406e.p407n.C12800f;
import p123rx.p401n.p406e.p407n.C12802h;
import p123rx.p401n.p406e.p408o.C12812j;
import p123rx.p401n.p406e.p408o.C12821s;
import p123rx.p401n.p406e.p408o.C12828z;

/* renamed from: rx.n.a.q0 */
/* compiled from: OperatorMerge */
public final class C12629q0<T> implements C5368e.C5371b<T, C5368e<? extends T>> {

    /* renamed from: f */
    final boolean f32589f;

    /* renamed from: g */
    final int f32590g;

    /* renamed from: rx.n.a.q0$a */
    /* compiled from: OperatorMerge */
    static final class C12630a {

        /* renamed from: a */
        static final C12629q0<Object> f32591a = new C12629q0<>(true, Integer.MAX_VALUE);
    }

    /* renamed from: rx.n.a.q0$b */
    /* compiled from: OperatorMerge */
    static final class C12631b {

        /* renamed from: a */
        static final C12629q0<Object> f32592a = new C12629q0<>(false, Integer.MAX_VALUE);
    }

    /* renamed from: rx.n.a.q0$c */
    /* compiled from: OperatorMerge */
    static final class C12632c<T> extends C12475j<T> {

        /* renamed from: k */
        static final int f32593k = (C12772h.f32957h / 4);

        /* renamed from: f */
        final C12634e<T> f32594f;

        /* renamed from: g */
        final long f32595g;

        /* renamed from: h */
        volatile boolean f32596h;

        /* renamed from: i */
        volatile C12772h f32597i;

        /* renamed from: j */
        int f32598j;

        public C12632c(C12634e<T> eVar, long j) {
            this.f32594f = eVar;
            this.f32595g = j;
        }

        /* renamed from: a */
        public void mo40767a(long j) {
            int i = this.f32598j - ((int) j);
            if (i > f32593k) {
                this.f32598j = i;
                return;
            }
            int i2 = C12772h.f32957h;
            this.f32598j = i2;
            int i3 = i2 - i;
            if (i3 > 0) {
                request((long) i3);
            }
        }

        public void onCompleted() {
            this.f32596h = true;
            this.f32594f.mo40776b();
        }

        public void onError(Throwable th) {
            this.f32594f.mo40784f().offer(th);
            this.f32596h = true;
            this.f32594f.mo40776b();
        }

        public void onNext(T t) {
            this.f32594f.mo40779b(this, t);
        }

        public void onStart() {
            int i = C12772h.f32957h;
            this.f32598j = i;
            request((long) i);
        }
    }

    /* renamed from: rx.n.a.q0$d */
    /* compiled from: OperatorMerge */
    static final class C12633d<T> extends AtomicLong implements C12473g {

        /* renamed from: f */
        final C12634e<T> f32599f;

        public C12633d(C12634e<T> eVar) {
            this.f32599f = eVar;
        }

        /* renamed from: a */
        public long mo40768a(int i) {
            return addAndGet((long) (-i));
        }

        public void request(long j) {
            if (j > 0) {
                if (get() != Long.MAX_VALUE) {
                    C12502a.m40960a((AtomicLong) this, j);
                    this.f32599f.mo40776b();
                }
            } else if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required");
            }
        }
    }

    C12629q0(boolean z, int i) {
        this.f32589f = z;
        this.f32590g = i;
    }

    /* renamed from: a */
    public static <T> C12629q0<T> m41089a(boolean z) {
        if (z) {
            return C12630a.f32591a;
        }
        return C12631b.f32592a;
    }

    /* renamed from: a */
    public C12475j<C5368e<? extends T>> call(C12475j<? super T> jVar) {
        C12634e eVar = new C12634e(jVar, this.f32589f, this.f32590g);
        C12633d<T> dVar = new C12633d<>(eVar);
        eVar.f32604i = dVar;
        jVar.add(eVar);
        jVar.setProducer(dVar);
        return eVar;
    }

    /* renamed from: rx.n.a.q0$e */
    /* compiled from: OperatorMerge */
    static final class C12634e<T> extends C12475j<C5368e<? extends T>> {

        /* renamed from: w */
        static final C12632c<?>[] f32600w = new C12632c[0];

        /* renamed from: f */
        final C12475j<? super T> f32601f;

        /* renamed from: g */
        final boolean f32602g;

        /* renamed from: h */
        final int f32603h;

        /* renamed from: i */
        C12633d<T> f32604i;

        /* renamed from: j */
        volatile Queue<Object> f32605j;

        /* renamed from: k */
        volatile C5383b f32606k;

        /* renamed from: l */
        volatile ConcurrentLinkedQueue<Throwable> f32607l;

        /* renamed from: m */
        volatile boolean f32608m;

        /* renamed from: n */
        boolean f32609n;

        /* renamed from: o */
        boolean f32610o;

        /* renamed from: p */
        final Object f32611p = new Object();

        /* renamed from: q */
        volatile C12632c<?>[] f32612q = f32600w;

        /* renamed from: r */
        long f32613r;

        /* renamed from: s */
        long f32614s;

        /* renamed from: t */
        int f32615t;

        /* renamed from: u */
        final int f32616u;

        /* renamed from: v */
        int f32617v;

        public C12634e(C12475j<? super T> jVar, boolean z, int i) {
            this.f32601f = jVar;
            this.f32602g = z;
            this.f32603h = i;
            if (i == Integer.MAX_VALUE) {
                this.f32616u = Integer.MAX_VALUE;
                request(Long.MAX_VALUE);
                return;
            }
            this.f32616u = Math.max(1, i >> 1);
            request((long) i);
        }

        /* renamed from: g */
        private void m41093g() {
            ArrayList arrayList = new ArrayList(this.f32607l);
            if (arrayList.size() == 1) {
                this.f32601f.onError((Throwable) arrayList.get(0));
            } else {
                this.f32601f.onError(new CompositeException((Collection<? extends Throwable>) arrayList));
            }
        }

        /* renamed from: a */
        public void onNext(C5368e<? extends T> eVar) {
            if (eVar != null) {
                if (eVar == C5368e.m10265n()) {
                    mo40780c();
                } else if (eVar instanceof C12775j) {
                    mo40781c(((C12775j) eVar).mo40900o());
                } else {
                    long j = this.f32613r;
                    this.f32613r = 1 + j;
                    C12632c cVar = new C12632c(this, j);
                    mo40772a(cVar);
                    eVar.mo18668b((C12475j<? super Object>) cVar);
                    mo40776b();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo40778b(C12632c<T> cVar) {
            C12772h hVar = cVar.f32597i;
            if (hVar != null) {
                hVar.mo40896e();
            }
            this.f32606k.mo18722b(cVar);
            synchronized (this.f32611p) {
                C12632c<?>[] cVarArr = this.f32612q;
                int length = cVarArr.length;
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (cVar.equals(cVarArr[i2])) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        this.f32612q = f32600w;
                        return;
                    }
                    C12632c<?>[] cVarArr2 = new C12632c[(length - 1)];
                    System.arraycopy(cVarArr, 0, cVarArr2, 0, i);
                    System.arraycopy(cVarArr, i + 1, cVarArr2, i, (length - i) - 1);
                    this.f32612q = cVarArr2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo40780c() {
            int i = this.f32617v + 1;
            if (i == this.f32616u) {
                this.f32617v = 0;
                mo40769a((long) i);
                return;
            }
            this.f32617v = i;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x0195, code lost:
            r0 = th;
         */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* JADX WARNING: Removed duplicated region for block: B:168:0x019d  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo40782d() {
            /*
                r22 = this;
                r1 = r22
                r3 = 0
                rx.j<? super T> r4 = r1.f32601f     // Catch:{ all -> 0x0199 }
            L_0x0005:
                boolean r0 = r22.mo40775a()     // Catch:{ all -> 0x0199 }
                if (r0 == 0) goto L_0x000c
                return
            L_0x000c:
                java.util.Queue<java.lang.Object> r5 = r1.f32605j     // Catch:{ all -> 0x0199 }
                rx.n.a.q0$d<T> r0 = r1.f32604i     // Catch:{ all -> 0x0199 }
                long r6 = r0.get()     // Catch:{ all -> 0x0199 }
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r0 != 0) goto L_0x001f
                r10 = 1
                goto L_0x0020
            L_0x001f:
                r10 = 0
            L_0x0020:
                r11 = 1
                r14 = 0
                if (r5 == 0) goto L_0x0089
                r0 = 0
            L_0x0027:
                r16 = r6
                r7 = 0
                r6 = r0
                r0 = 0
            L_0x002c:
                int r18 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
                if (r18 <= 0) goto L_0x0071
                java.lang.Object r18 = r5.poll()     // Catch:{ all -> 0x0199 }
                boolean r0 = r22.mo40775a()     // Catch:{ all -> 0x0199 }
                if (r0 == 0) goto L_0x003b
                return
            L_0x003b:
                if (r18 != 0) goto L_0x0040
                r0 = r18
                goto L_0x0071
            L_0x0040:
                java.lang.Object r0 = p123rx.p401n.p402a.C12558h.m41018b(r18)     // Catch:{ all -> 0x0199 }
                r4.onNext(r0)     // Catch:{ all -> 0x0048 }
                goto L_0x0068
            L_0x0048:
                r0 = move-exception
                r19 = r0
                boolean r0 = r1.f32602g     // Catch:{ all -> 0x0199 }
                if (r0 != 0) goto L_0x005f
                p123rx.exceptions.C12472a.m40945c(r19)     // Catch:{ all -> 0x0199 }
                r22.unsubscribe()     // Catch:{ all -> 0x005b }
                r5 = r19
                r4.onError(r5)     // Catch:{ all -> 0x005b }
                return
            L_0x005b:
                r0 = move-exception
                r2 = 1
                goto L_0x019b
            L_0x005f:
                r2 = r19
                java.util.Queue r0 = r22.mo40784f()     // Catch:{ all -> 0x0199 }
                r0.offer(r2)     // Catch:{ all -> 0x0199 }
            L_0x0068:
                int r6 = r6 + 1
                int r7 = r7 + 1
                long r16 = r16 - r11
                r0 = r18
                goto L_0x002c
            L_0x0071:
                if (r7 <= 0) goto L_0x007e
                if (r10 == 0) goto L_0x0078
                r16 = r8
                goto L_0x007e
            L_0x0078:
                rx.n.a.q0$d<T> r2 = r1.f32604i     // Catch:{ all -> 0x0199 }
                long r16 = r2.mo40768a(r7)     // Catch:{ all -> 0x0199 }
            L_0x007e:
                int r2 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
                if (r2 == 0) goto L_0x008c
                if (r0 != 0) goto L_0x0085
                goto L_0x008c
            L_0x0085:
                r0 = r6
                r6 = r16
                goto L_0x0027
            L_0x0089:
                r16 = r6
                r6 = 0
            L_0x008c:
                boolean r0 = r1.f32608m     // Catch:{ all -> 0x0199 }
                java.util.Queue<java.lang.Object> r2 = r1.f32605j     // Catch:{ all -> 0x0199 }
                rx.n.a.q0$c<?>[] r5 = r1.f32612q     // Catch:{ all -> 0x0199 }
                int r7 = r5.length     // Catch:{ all -> 0x0199 }
                if (r0 == 0) goto L_0x00b2
                if (r2 == 0) goto L_0x009d
                boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0199 }
                if (r0 == 0) goto L_0x00b2
            L_0x009d:
                if (r7 != 0) goto L_0x00b2
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.Throwable> r0 = r1.f32607l     // Catch:{ all -> 0x0199 }
                if (r0 == 0) goto L_0x00ae
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0199 }
                if (r0 == 0) goto L_0x00aa
                goto L_0x00ae
            L_0x00aa:
                r22.m41093g()     // Catch:{ all -> 0x0199 }
                goto L_0x00b1
            L_0x00ae:
                r4.onCompleted()     // Catch:{ all -> 0x0199 }
            L_0x00b1:
                return
            L_0x00b2:
                if (r7 <= 0) goto L_0x0175
                long r8 = r1.f32614s     // Catch:{ all -> 0x0199 }
                int r0 = r1.f32615t     // Catch:{ all -> 0x0199 }
                if (r7 <= r0) goto L_0x00c2
                r2 = r5[r0]     // Catch:{ all -> 0x0199 }
                long r11 = r2.f32595g     // Catch:{ all -> 0x0199 }
                int r2 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                if (r2 == 0) goto L_0x00e1
            L_0x00c2:
                if (r7 > r0) goto L_0x00c5
                r0 = 0
            L_0x00c5:
                r2 = 0
            L_0x00c6:
                if (r2 >= r7) goto L_0x00d9
                r11 = r5[r0]     // Catch:{ all -> 0x0199 }
                long r11 = r11.f32595g     // Catch:{ all -> 0x0199 }
                int r18 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                if (r18 != 0) goto L_0x00d1
                goto L_0x00d9
            L_0x00d1:
                int r0 = r0 + 1
                if (r0 != r7) goto L_0x00d6
                r0 = 0
            L_0x00d6:
                int r2 = r2 + 1
                goto L_0x00c6
            L_0x00d9:
                r1.f32615t = r0     // Catch:{ all -> 0x0199 }
                r2 = r5[r0]     // Catch:{ all -> 0x0199 }
                long r8 = r2.f32595g     // Catch:{ all -> 0x0199 }
                r1.f32614s = r8     // Catch:{ all -> 0x0199 }
            L_0x00e1:
                r2 = 0
                r8 = 0
            L_0x00e3:
                if (r2 >= r7) goto L_0x016c
                boolean r9 = r22.mo40775a()     // Catch:{ all -> 0x0199 }
                if (r9 == 0) goto L_0x00ec
                return
            L_0x00ec:
                r9 = r5[r0]     // Catch:{ all -> 0x0199 }
                r11 = 0
            L_0x00ef:
                r12 = 0
            L_0x00f0:
                int r18 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
                if (r18 <= 0) goto L_0x0106
                boolean r18 = r22.mo40775a()     // Catch:{ all -> 0x0199 }
                if (r18 == 0) goto L_0x00fb
                return
            L_0x00fb:
                rx.n.e.h r13 = r9.f32597i     // Catch:{ all -> 0x0199 }
                if (r13 != 0) goto L_0x0100
                goto L_0x0106
            L_0x0100:
                java.lang.Object r11 = r13.mo40895d()     // Catch:{ all -> 0x0199 }
                if (r11 != 0) goto L_0x0109
            L_0x0106:
                r20 = 1
                goto L_0x0129
            L_0x0109:
                java.lang.Object r13 = p123rx.p401n.p402a.C12558h.m41018b(r11)     // Catch:{ all -> 0x0199 }
                r4.onNext(r13)     // Catch:{ all -> 0x0117 }
                r20 = 1
                long r16 = r16 - r20
                int r12 = r12 + 1
                goto L_0x00f0
            L_0x0117:
                r0 = move-exception
                r2 = r0
                p123rx.exceptions.C12472a.m40945c(r2)     // Catch:{ all -> 0x005b }
                r4.onError(r2)     // Catch:{ all -> 0x0123 }
                r22.unsubscribe()     // Catch:{ all -> 0x005b }
                return
            L_0x0123:
                r0 = move-exception
                r2 = r0
                r22.unsubscribe()     // Catch:{ all -> 0x005b }
                throw r2     // Catch:{ all -> 0x005b }
            L_0x0129:
                if (r12 <= 0) goto L_0x013d
                if (r10 != 0) goto L_0x0134
                rx.n.a.q0$d<T> r13 = r1.f32604i     // Catch:{ all -> 0x0199 }
                long r16 = r13.mo40768a(r12)     // Catch:{ all -> 0x0199 }
                goto L_0x0139
            L_0x0134:
                r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L_0x0139:
                long r12 = (long) r12     // Catch:{ all -> 0x0199 }
                r9.mo40767a(r12)     // Catch:{ all -> 0x0199 }
            L_0x013d:
                int r12 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
                if (r12 == 0) goto L_0x0143
                if (r11 != 0) goto L_0x00ef
            L_0x0143:
                boolean r11 = r9.f32596h     // Catch:{ all -> 0x0199 }
                rx.n.e.h r12 = r9.f32597i     // Catch:{ all -> 0x0199 }
                if (r11 == 0) goto L_0x015e
                if (r12 == 0) goto L_0x0151
                boolean r11 = r12.mo40890a()     // Catch:{ all -> 0x0199 }
                if (r11 == 0) goto L_0x015e
            L_0x0151:
                r1.mo40778b(r9)     // Catch:{ all -> 0x0199 }
                boolean r8 = r22.mo40775a()     // Catch:{ all -> 0x0199 }
                if (r8 == 0) goto L_0x015b
                return
            L_0x015b:
                int r6 = r6 + 1
                r8 = 1
            L_0x015e:
                int r9 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
                if (r9 != 0) goto L_0x0163
                goto L_0x016c
            L_0x0163:
                int r0 = r0 + 1
                if (r0 != r7) goto L_0x0168
                r0 = 0
            L_0x0168:
                int r2 = r2 + 1
                goto L_0x00e3
            L_0x016c:
                r1.f32615t = r0     // Catch:{ all -> 0x0199 }
                r0 = r5[r0]     // Catch:{ all -> 0x0199 }
                long r9 = r0.f32595g     // Catch:{ all -> 0x0199 }
                r1.f32614s = r9     // Catch:{ all -> 0x0199 }
                goto L_0x0176
            L_0x0175:
                r8 = 0
            L_0x0176:
                if (r6 <= 0) goto L_0x017c
                long r5 = (long) r6     // Catch:{ all -> 0x0199 }
                r1.request(r5)     // Catch:{ all -> 0x0199 }
            L_0x017c:
                if (r8 == 0) goto L_0x0180
                goto L_0x0005
            L_0x0180:
                monitor-enter(r22)     // Catch:{ all -> 0x0199 }
                boolean r0 = r1.f32610o     // Catch:{ all -> 0x0191 }
                if (r0 != 0) goto L_0x018c
                r1.f32609n = r3     // Catch:{ all -> 0x0189 }
                monitor-exit(r22)     // Catch:{ all -> 0x0189 }
                return
            L_0x0189:
                r0 = move-exception
                r2 = 1
                goto L_0x0193
            L_0x018c:
                r1.f32610o = r3     // Catch:{ all -> 0x0191 }
                monitor-exit(r22)     // Catch:{ all -> 0x0191 }
                goto L_0x0005
            L_0x0191:
                r0 = move-exception
                r2 = 0
            L_0x0193:
                monitor-exit(r22)     // Catch:{ all -> 0x0197 }
                throw r0     // Catch:{ all -> 0x0195 }
            L_0x0195:
                r0 = move-exception
                goto L_0x019b
            L_0x0197:
                r0 = move-exception
                goto L_0x0193
            L_0x0199:
                r0 = move-exception
                r2 = 0
            L_0x019b:
                if (r2 != 0) goto L_0x01a5
                monitor-enter(r22)
                r1.f32609n = r3     // Catch:{ all -> 0x01a2 }
                monitor-exit(r22)     // Catch:{ all -> 0x01a2 }
                goto L_0x01a5
            L_0x01a2:
                r0 = move-exception
                monitor-exit(r22)     // Catch:{ all -> 0x01a2 }
                throw r0
            L_0x01a5:
                goto L_0x01a7
            L_0x01a6:
                throw r0
            L_0x01a7:
                goto L_0x01a6
            */
            throw new UnsupportedOperationException("Method not decompiled: p123rx.p401n.p402a.C12629q0.C12634e.mo40782d():void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C5383b mo40783e() {
            C5383b bVar;
            C5383b bVar2 = this.f32606k;
            if (bVar2 != null) {
                return bVar2;
            }
            boolean z = false;
            synchronized (this) {
                bVar = this.f32606k;
                if (bVar == null) {
                    C5383b bVar3 = new C5383b();
                    this.f32606k = bVar3;
                    bVar = bVar3;
                    z = true;
                }
            }
            if (z) {
                add(bVar);
            }
            return bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Queue<Throwable> mo40784f() {
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = this.f32607l;
            if (concurrentLinkedQueue == null) {
                synchronized (this) {
                    concurrentLinkedQueue = this.f32607l;
                    if (concurrentLinkedQueue == null) {
                        concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
                        this.f32607l = concurrentLinkedQueue;
                    }
                }
            }
            return concurrentLinkedQueue;
        }

        public void onCompleted() {
            this.f32608m = true;
            mo40776b();
        }

        public void onError(Throwable th) {
            mo40784f().offer(th);
            this.f32608m = true;
            mo40776b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo40781c(T t) {
            long j = this.f32604i.get();
            boolean z = false;
            if (j != 0) {
                synchronized (this) {
                    j = this.f32604i.get();
                    if (!this.f32609n && j != 0) {
                        this.f32609n = true;
                        z = true;
                    }
                }
            }
            if (z) {
                Queue<Object> queue = this.f32605j;
                if (queue == null || queue.isEmpty()) {
                    mo40770a(t, j);
                    return;
                }
                mo40777b(t);
                mo40782d();
                return;
            }
            mo40777b(t);
            mo40776b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40772a(C12632c<T> cVar) {
            mo40783e().mo18721a((C5375k) cVar);
            synchronized (this.f32611p) {
                C12632c<?>[] cVarArr = this.f32612q;
                int length = cVarArr.length;
                C12632c<?>[] cVarArr2 = new C12632c[(length + 1)];
                System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                cVarArr2[length] = cVar;
                this.f32612q = cVarArr2;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo40779b(C12632c<T> cVar, T t) {
            long j = this.f32604i.get();
            boolean z = false;
            if (j != 0) {
                synchronized (this) {
                    j = this.f32604i.get();
                    if (!this.f32609n && j != 0) {
                        this.f32609n = true;
                        z = true;
                    }
                }
            }
            if (z) {
                C12772h hVar = cVar.f32597i;
                if (hVar == null || hVar.mo40890a()) {
                    mo40774a(cVar, t, j);
                    return;
                }
                mo40773a(cVar, t);
                mo40782d();
                return;
            }
            mo40773a(cVar, t);
            mo40776b();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo40773a(C12632c<T> cVar, T t) {
            C12772h hVar = cVar.f32597i;
            if (hVar == null) {
                hVar = C12772h.m41268g();
                cVar.add(hVar);
                cVar.f32597i = hVar;
            }
            try {
                hVar.mo40894c(C12558h.m41020d(t));
            } catch (MissingBackpressureException e) {
                cVar.unsubscribe();
                cVar.onError(e);
            } catch (IllegalStateException e2) {
                if (!cVar.isUnsubscribed()) {
                    cVar.unsubscribe();
                    cVar.onError(e2);
                }
            }
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:458)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
            */
        /* renamed from: a */
        protected void mo40774a(p123rx.p401n.p402a.C12629q0.C12632c<T> r5, T r6, long r7) {
            /*
                r4 = this;
                r0 = 1
                r1 = 0
                rx.j<? super T> r2 = r4.f32601f     // Catch:{ all -> 0x0008 }
                r2.onNext(r6)     // Catch:{ all -> 0x0008 }
                goto L_0x0020
            L_0x0008:
                r6 = move-exception
                boolean r2 = r4.f32602g     // Catch:{ all -> 0x0046 }
                if (r2 != 0) goto L_0x0019
                p123rx.exceptions.C12472a.m40945c(r6)     // Catch:{ all -> 0x0046 }
                r5.unsubscribe()     // Catch:{ all -> 0x0017 }
                r5.onError(r6)     // Catch:{ all -> 0x0017 }
                return
            L_0x0017:
                r5 = move-exception
                goto L_0x0048
            L_0x0019:
                java.util.Queue r2 = r4.mo40784f()     // Catch:{ all -> 0x0046 }
                r2.offer(r6)     // Catch:{ all -> 0x0046 }
            L_0x0020:
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r6 == 0) goto L_0x002e
                rx.n.a.q0$d<T> r6 = r4.f32604i     // Catch:{ all -> 0x0046 }
                r6.mo40768a(r0)     // Catch:{ all -> 0x0046 }
            L_0x002e:
                r6 = 1
                r5.mo40767a(r6)     // Catch:{ all -> 0x0046 }
                monitor-enter(r4)     // Catch:{ all -> 0x0046 }
                boolean r5 = r4.f32610o     // Catch:{ all -> 0x0043 }
                if (r5 != 0) goto L_0x003c
                r4.f32609n = r1     // Catch:{ all -> 0x0043 }
                monitor-exit(r4)     // Catch:{ all -> 0x0043 }
                return
            L_0x003c:
                r4.f32610o = r1     // Catch:{ all -> 0x0043 }
                monitor-exit(r4)     // Catch:{ all -> 0x0043 }
                r4.mo40782d()
                return
            L_0x0043:
                r5 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0043 }
                throw r5     // Catch:{ all -> 0x0017 }
            L_0x0046:
                r5 = move-exception
                r0 = 0
            L_0x0048:
                if (r0 != 0) goto L_0x0052
                monitor-enter(r4)
                r4.f32609n = r1     // Catch:{ all -> 0x004f }
                monitor-exit(r4)     // Catch:{ all -> 0x004f }
                goto L_0x0052
            L_0x004f:
                r5 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x004f }
                throw r5
            L_0x0052:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p123rx.p401n.p402a.C12629q0.C12634e.mo40774a(rx.n.a.q0$c, java.lang.Object, long):void");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo40777b(T t) {
            Queue<Object> queue;
            Queue<Object> queue2 = this.f32605j;
            if (queue2 == null) {
                int i = this.f32603h;
                if (i == Integer.MAX_VALUE) {
                    queue2 = new C12802h<>(C12772h.f32957h);
                } else {
                    if (!C12812j.m41366a(i)) {
                        queue = new C12800f<>(i);
                    } else if (C12828z.m41379a()) {
                        queue = new C12821s<>(i);
                    } else {
                        queue = new C12799e<>(i);
                    }
                    queue2 = queue;
                }
                this.f32605j = queue2;
            }
            if (!queue2.offer(C12558h.m41020d(t))) {
                unsubscribe();
                onError(OnErrorThrowable.m40933a(new MissingBackpressureException(), t));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo40776b() {
            synchronized (this) {
                if (this.f32609n) {
                    this.f32610o = true;
                    return;
                }
                this.f32609n = true;
                mo40782d();
            }
        }

        /* renamed from: a */
        public void mo40769a(long j) {
            request(j);
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:458)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
            */
        /* renamed from: a */
        protected void mo40770a(T r5, long r6) {
            /*
                r4 = this;
                r0 = 1
                r1 = 0
                rx.j<? super T> r2 = r4.f32601f     // Catch:{ all -> 0x0008 }
                r2.onNext(r5)     // Catch:{ all -> 0x0008 }
                goto L_0x0020
            L_0x0008:
                r5 = move-exception
                boolean r2 = r4.f32602g     // Catch:{ all -> 0x0051 }
                if (r2 != 0) goto L_0x0019
                p123rx.exceptions.C12472a.m40945c(r5)     // Catch:{ all -> 0x0051 }
                r4.unsubscribe()     // Catch:{ all -> 0x0017 }
                r4.onError(r5)     // Catch:{ all -> 0x0017 }
                return
            L_0x0017:
                r5 = move-exception
                goto L_0x0053
            L_0x0019:
                java.util.Queue r2 = r4.mo40784f()     // Catch:{ all -> 0x0051 }
                r2.offer(r5)     // Catch:{ all -> 0x0051 }
            L_0x0020:
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r5 == 0) goto L_0x002e
                rx.n.a.q0$d<T> r5 = r4.f32604i     // Catch:{ all -> 0x0051 }
                r5.mo40768a(r0)     // Catch:{ all -> 0x0051 }
            L_0x002e:
                int r5 = r4.f32617v     // Catch:{ all -> 0x0051 }
                int r5 = r5 + r0
                int r6 = r4.f32616u     // Catch:{ all -> 0x0051 }
                if (r5 != r6) goto L_0x003c
                r4.f32617v = r1     // Catch:{ all -> 0x0051 }
                long r5 = (long) r5     // Catch:{ all -> 0x0051 }
                r4.mo40769a((long) r5)     // Catch:{ all -> 0x0051 }
                goto L_0x003e
            L_0x003c:
                r4.f32617v = r5     // Catch:{ all -> 0x0051 }
            L_0x003e:
                monitor-enter(r4)     // Catch:{ all -> 0x0051 }
                boolean r5 = r4.f32610o     // Catch:{ all -> 0x004e }
                if (r5 != 0) goto L_0x0047
                r4.f32609n = r1     // Catch:{ all -> 0x004e }
                monitor-exit(r4)     // Catch:{ all -> 0x004e }
                return
            L_0x0047:
                r4.f32610o = r1     // Catch:{ all -> 0x004e }
                monitor-exit(r4)     // Catch:{ all -> 0x004e }
                r4.mo40782d()
                return
            L_0x004e:
                r5 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x004e }
                throw r5     // Catch:{ all -> 0x0017 }
            L_0x0051:
                r5 = move-exception
                r0 = 0
            L_0x0053:
                if (r0 != 0) goto L_0x005d
                monitor-enter(r4)
                r4.f32609n = r1     // Catch:{ all -> 0x005a }
                monitor-exit(r4)     // Catch:{ all -> 0x005a }
                goto L_0x005d
            L_0x005a:
                r5 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x005a }
                throw r5
            L_0x005d:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p123rx.p401n.p402a.C12629q0.C12634e.mo40770a(java.lang.Object, long):void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo40775a() {
            if (this.f32601f.isUnsubscribed()) {
                return true;
            }
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = this.f32607l;
            if (this.f32602g || concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
                return false;
            }
            try {
                m41093g();
                return true;
            } finally {
                unsubscribe();
            }
        }
    }
}
