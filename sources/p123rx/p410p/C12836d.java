package p123rx.p410p;

import p123rx.C5372f;
import p123rx.exceptions.C12472a;
import p123rx.p401n.p402a.C12558h;

/* renamed from: rx.p.d */
/* compiled from: SerializedObserver */
public class C12836d<T> implements C5372f<T> {

    /* renamed from: f */
    private final C5372f<? super T> f33055f;

    /* renamed from: g */
    private boolean f33056g;

    /* renamed from: h */
    private volatile boolean f33057h;

    /* renamed from: i */
    private C12837a f33058i;

    /* renamed from: rx.p.d$a */
    /* compiled from: SerializedObserver */
    static final class C12837a {

        /* renamed from: a */
        Object[] f33059a;

        /* renamed from: b */
        int f33060b;

        C12837a() {
        }

        /* renamed from: a */
        public void mo41040a(Object obj) {
            int i = this.f33060b;
            Object[] objArr = this.f33059a;
            if (objArr == null) {
                objArr = new Object[16];
                this.f33059a = objArr;
            } else if (i == objArr.length) {
                Object[] objArr2 = new Object[((i >> 2) + i)];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                this.f33059a = objArr2;
                objArr = objArr2;
            }
            objArr[i] = obj;
            this.f33060b = i + 1;
        }
    }

    public C12836d(C5372f<? super T> fVar) {
        this.f33055f = fVar;
    }

    public void onCompleted() {
        if (!this.f33057h) {
            synchronized (this) {
                if (!this.f33057h) {
                    this.f33057h = true;
                    if (this.f33056g) {
                        C12837a aVar = this.f33058i;
                        if (aVar == null) {
                            aVar = new C12837a();
                            this.f33058i = aVar;
                        }
                        aVar.mo41040a(C12558h.m41014a());
                        return;
                    }
                    this.f33056g = true;
                    this.f33055f.onCompleted();
                }
            }
        }
    }

    public void onError(Throwable th) {
        C12472a.m40945c(th);
        if (!this.f33057h) {
            synchronized (this) {
                if (!this.f33057h) {
                    this.f33057h = true;
                    if (this.f33056g) {
                        C12837a aVar = this.f33058i;
                        if (aVar == null) {
                            aVar = new C12837a();
                            this.f33058i = aVar;
                        }
                        aVar.mo41040a(C12558h.m41015a(th));
                        return;
                    }
                    this.f33056g = true;
                    this.f33055f.onError(th);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r6.f33055f.onNext(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002d, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r1 = r6.f33058i;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0031, code lost:
        if (r1 != null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0033, code lost:
        r6.f33056g = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0035, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0036, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0037, code lost:
        r6.f33058i = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003a, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003b, code lost:
        r1 = r1.f33059a;
        r3 = r1.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x003e, code lost:
        if (r2 >= r3) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0040, code lost:
        r4 = r1[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0042, code lost:
        if (r4 != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x004b, code lost:
        if (p123rx.p401n.p402a.C12558h.m41017a(r6.f33055f, r4) == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x004d, code lost:
        r6.f33057h = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x004f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0050, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0053, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0054, code lost:
        r6.f33057h = true;
        p123rx.exceptions.C12472a.m40945c(r1);
        r6.f33055f.onError(p123rx.exceptions.OnErrorThrowable.m40933a(r1, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0062, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0066, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0067, code lost:
        r6.f33057h = true;
        p123rx.exceptions.C12472a.m40940a(r1, (p123rx.C5372f<?>) r6.f33055f, (java.lang.Object) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x006e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNext(T r7) {
        /*
            r6 = this;
            boolean r0 = r6.f33057h
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r6)
            boolean r0 = r6.f33057h     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r6)     // Catch:{ all -> 0x006f }
            return
        L_0x000c:
            boolean r0 = r6.f33056g     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x0024
            rx.p.d$a r0 = r6.f33058i     // Catch:{ all -> 0x006f }
            if (r0 != 0) goto L_0x001b
            rx.p.d$a r0 = new rx.p.d$a     // Catch:{ all -> 0x006f }
            r0.<init>()     // Catch:{ all -> 0x006f }
            r6.f33058i = r0     // Catch:{ all -> 0x006f }
        L_0x001b:
            java.lang.Object r7 = p123rx.p401n.p402a.C12558h.m41020d(r7)     // Catch:{ all -> 0x006f }
            r0.mo41040a(r7)     // Catch:{ all -> 0x006f }
            monitor-exit(r6)     // Catch:{ all -> 0x006f }
            return
        L_0x0024:
            r0 = 1
            r6.f33056g = r0     // Catch:{ all -> 0x006f }
            monitor-exit(r6)     // Catch:{ all -> 0x006f }
            rx.f<? super T> r1 = r6.f33055f     // Catch:{ all -> 0x0066 }
            r1.onNext(r7)     // Catch:{ all -> 0x0066 }
        L_0x002d:
            monitor-enter(r6)
            rx.p.d$a r1 = r6.f33058i     // Catch:{ all -> 0x0063 }
            r2 = 0
            if (r1 != 0) goto L_0x0037
            r6.f33056g = r2     // Catch:{ all -> 0x0063 }
            monitor-exit(r6)     // Catch:{ all -> 0x0063 }
            return
        L_0x0037:
            r3 = 0
            r6.f33058i = r3     // Catch:{ all -> 0x0063 }
            monitor-exit(r6)     // Catch:{ all -> 0x0063 }
            java.lang.Object[] r1 = r1.f33059a
            int r3 = r1.length
        L_0x003e:
            if (r2 >= r3) goto L_0x002d
            r4 = r1[r2]
            if (r4 != 0) goto L_0x0045
            goto L_0x002d
        L_0x0045:
            rx.f<? super T> r5 = r6.f33055f     // Catch:{ all -> 0x0053 }
            boolean r4 = p123rx.p401n.p402a.C12558h.m41017a(r5, r4)     // Catch:{ all -> 0x0053 }
            if (r4 == 0) goto L_0x0050
            r6.f33057h = r0     // Catch:{ all -> 0x0053 }
            return
        L_0x0050:
            int r2 = r2 + 1
            goto L_0x003e
        L_0x0053:
            r1 = move-exception
            r6.f33057h = r0
            p123rx.exceptions.C12472a.m40945c(r1)
            rx.f<? super T> r0 = r6.f33055f
            java.lang.Throwable r7 = p123rx.exceptions.OnErrorThrowable.m40933a(r1, r7)
            r0.onError(r7)
            return
        L_0x0063:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0063 }
            throw r7
        L_0x0066:
            r1 = move-exception
            r6.f33057h = r0
            rx.f<? super T> r0 = r6.f33055f
            p123rx.exceptions.C12472a.m40940a((java.lang.Throwable) r1, (p123rx.C5372f<?>) r0, (java.lang.Object) r7)
            return
        L_0x006f:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x006f }
            goto L_0x0073
        L_0x0072:
            throw r7
        L_0x0073:
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: p123rx.p410p.C12836d.onNext(java.lang.Object):void");
    }
}
