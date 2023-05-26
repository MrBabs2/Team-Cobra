package androidx.lifecycle;

import androidx.lifecycle.C0514f;
import java.util.Map;
import p050l.p059b.p060a.p061a.C4834a;
import p050l.p059b.p060a.p062b.C4841b;

public abstract class LiveData<T> {

    /* renamed from: j */
    static final Object f2139j = new Object();

    /* renamed from: a */
    final Object f2140a = new Object();

    /* renamed from: b */
    private C4841b<C0530q<? super T>, LiveData<T>.C0980b> f2141b = new C4841b<>();

    /* renamed from: c */
    int f2142c = 0;

    /* renamed from: d */
    private volatile Object f2143d = f2139j;

    /* renamed from: e */
    volatile Object f2144e = f2139j;

    /* renamed from: f */
    private int f2145f = -1;

    /* renamed from: g */
    private boolean f2146g;

    /* renamed from: h */
    private boolean f2147h;

    /* renamed from: i */
    private final Runnable f2148i = new C0505a();

    /* renamed from: androidx.lifecycle.LiveData$a */
    class C0505a implements Runnable {
        C0505a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.f2140a) {
                obj = LiveData.this.f2144e;
                LiveData.this.f2144e = LiveData.f2139j;
            }
            LiveData.this.mo3003b(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    private abstract class C0506b {

        /* renamed from: a */
        final C0530q<? super T> f2152a;

        /* renamed from: b */
        boolean f2153b;

        /* renamed from: c */
        int f2154c = -1;

        C0506b(C0530q<? super T> qVar) {
            this.f2152a = qVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3007a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3011a(boolean z) {
            if (z != this.f2153b) {
                this.f2153b = z;
                int i = 1;
                boolean z2 = LiveData.this.f2142c == 0;
                LiveData liveData = LiveData.this;
                int i2 = liveData.f2142c;
                if (!this.f2153b) {
                    i = -1;
                }
                liveData.f2142c = i2 + i;
                if (z2 && this.f2153b) {
                    LiveData.this.mo3005c();
                }
                LiveData liveData2 = LiveData.this;
                if (liveData2.f2142c == 0 && !this.f2153b) {
                    liveData2.mo3006d();
                }
                if (this.f2153b) {
                    LiveData.this.mo2999a((LiveData<T>.C0980b) this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract boolean mo3008b();

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public boolean mo3009g(C0521j jVar) {
            return false;
        }
    }

    /* renamed from: b */
    private void m2535b(LiveData<T>.C0980b bVar) {
        if (bVar.f2153b) {
            if (!bVar.mo3008b()) {
                bVar.mo3011a(false);
                return;
            }
            int i = bVar.f2154c;
            int i2 = this.f2145f;
            if (i < i2) {
                bVar.f2154c = i2;
                bVar.f2152a.mo3051a(this.f2143d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2999a(LiveData<T>.C0980b bVar) {
        if (this.f2146g) {
            this.f2147h = true;
            return;
        }
        this.f2146g = true;
        do {
            this.f2147h = false;
            if (bVar == null) {
                C4841b<K, V>.C4753d b = this.f2141b.mo16853b();
                while (b.hasNext()) {
                    m2535b((LiveData<T>.C0980b) (C0506b) ((Map.Entry) b.next()).getValue());
                    if (this.f2147h) {
                        break;
                    }
                }
            } else {
                m2535b(bVar);
                bVar = null;
            }
        } while (this.f2147h);
        this.f2146g = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo3005c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo3006d() {
    }

    class LifecycleBoundObserver extends LiveData<T>.C0980b implements C0513e {

        /* renamed from: e */
        final C0521j f2149e;

        LifecycleBoundObserver(C0521j jVar, C0530q<? super T> qVar) {
            super(qVar);
            this.f2149e = jVar;
        }

        /* renamed from: a */
        public void mo136a(C0521j jVar, C0514f.C0515a aVar) {
            if (this.f2149e.getLifecycle().mo3038a() == C0514f.C0516b.DESTROYED) {
                LiveData.this.mo3001a(this.f2152a);
            } else {
                mo3011a(mo3008b());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo3008b() {
            return this.f2149e.getLifecycle().mo3038a().mo3041a(C0514f.C0516b.STARTED);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public boolean mo3009g(C0521j jVar) {
            return this.f2149e == jVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3007a() {
            this.f2149e.getLifecycle().mo3040b(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3003b(T t) {
        m2534a("setValue");
        this.f2145f++;
        this.f2143d = t;
        mo2999a((LiveData<T>.C0980b) null);
    }

    /* renamed from: b */
    public boolean mo3004b() {
        return this.f2142c > 0;
    }

    /* renamed from: a */
    public void mo3000a(C0521j jVar, C0530q<? super T> qVar) {
        m2534a("observe");
        if (jVar.getLifecycle().mo3038a() != C0514f.C0516b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(jVar, qVar);
            C0506b b = this.f2141b.mo16847b(qVar, lifecycleBoundObserver);
            if (b != null && !b.mo3009g(jVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (b == null) {
                jVar.getLifecycle().mo3039a(lifecycleBoundObserver);
            }
        }
    }

    /* renamed from: a */
    public void mo3001a(C0530q<? super T> qVar) {
        m2534a("removeObserver");
        C0506b remove = this.f2141b.remove(qVar);
        if (remove != null) {
            remove.mo3007a();
            remove.mo3011a(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3002a(T t) {
        boolean z;
        synchronized (this.f2140a) {
            z = this.f2144e == f2139j;
            this.f2144e = t;
        }
        if (z) {
            C4834a.m8101c().mo16842b(this.f2148i);
        }
    }

    /* renamed from: a */
    public T mo2998a() {
        T t = this.f2143d;
        if (t != f2139j) {
            return t;
        }
        return null;
    }

    /* renamed from: a */
    private static void m2534a(String str) {
        if (!C4834a.m8101c().mo16841a()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background" + " thread");
        }
    }
}
