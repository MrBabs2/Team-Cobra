package p120q.p326a.p350i0;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p332c.C10918g;
import p120q.p326a.p329d0.p333d.C10920b;
import p120q.p326a.p329d0.p341f.C11385c;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.i0.d */
/* compiled from: UnicastSubject */
public final class C11476d<T> extends C11475c<T> {

    /* renamed from: f */
    final C11385c<T> f30702f;

    /* renamed from: g */
    final AtomicReference<C11490u<? super T>> f30703g;

    /* renamed from: h */
    final AtomicReference<Runnable> f30704h;

    /* renamed from: i */
    final boolean f30705i;

    /* renamed from: j */
    volatile boolean f30706j;

    /* renamed from: k */
    volatile boolean f30707k;

    /* renamed from: l */
    Throwable f30708l;

    /* renamed from: m */
    final AtomicBoolean f30709m;

    /* renamed from: n */
    final C10920b<T> f30710n;

    /* renamed from: o */
    boolean f30711o;

    /* renamed from: q.a.i0.d$a */
    /* compiled from: UnicastSubject */
    final class C11477a extends C10920b<T> {
        C11477a() {
        }

        /* renamed from: a */
        public int mo36665a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            C11476d.this.f30711o = true;
            return 2;
        }

        public void clear() {
            C11476d.this.f30702f.clear();
        }

        public void dispose() {
            if (!C11476d.this.f30706j) {
                C11476d.this.f30706j = true;
                C11476d.this.mo37241c();
                C11476d.this.f30703g.lazySet((Object) null);
                if (C11476d.this.f30710n.getAndIncrement() == 0) {
                    C11476d.this.f30703g.lazySet((Object) null);
                    C11476d dVar = C11476d.this;
                    if (!dVar.f30711o) {
                        dVar.f30702f.clear();
                    }
                }
            }
        }

        public boolean isDisposed() {
            return C11476d.this.f30706j;
        }

        public boolean isEmpty() {
            return C11476d.this.f30702f.isEmpty();
        }

        public T poll() throws Exception {
            return C11476d.this.f30702f.poll();
        }
    }

    C11476d(int i, boolean z) {
        C10910b.m36858a(i, "capacityHint");
        this.f30702f = new C11385c<>(i);
        this.f30704h = new AtomicReference<>();
        this.f30705i = z;
        this.f30703g = new AtomicReference<>();
        this.f30709m = new AtomicBoolean();
        this.f30710n = new C11477a();
    }

    /* renamed from: a */
    public static <T> C11476d<T> m37562a(int i) {
        return new C11476d<>(i, true);
    }

    /* renamed from: e */
    public static <T> C11476d<T> m37564e() {
        return new C11476d<>(C11482n.bufferSize(), true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo37240b(C11490u<? super T> uVar) {
        C11385c<T> cVar = this.f30702f;
        boolean z = !this.f30705i;
        boolean z2 = true;
        int i = 1;
        while (!this.f30706j) {
            boolean z3 = this.f30707k;
            T poll = this.f30702f.poll();
            boolean z4 = poll == null;
            if (z3) {
                if (z && z2) {
                    if (!mo37239a(cVar, uVar)) {
                        z2 = false;
                    } else {
                        return;
                    }
                }
                if (z4) {
                    mo37242c(uVar);
                    return;
                }
            }
            if (z4) {
                i = this.f30710n.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                uVar.onNext(poll);
            }
        }
        this.f30703g.lazySet((Object) null);
        cVar.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo37241c() {
        Runnable runnable = this.f30704h.get();
        if (runnable != null && this.f30704h.compareAndSet(runnable, (Object) null)) {
            runnable.run();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo37243d() {
        if (this.f30710n.getAndIncrement() == 0) {
            C11490u uVar = this.f30703g.get();
            int i = 1;
            while (uVar == null) {
                i = this.f30710n.addAndGet(-i);
                if (i != 0) {
                    uVar = this.f30703g.get();
                } else {
                    return;
                }
            }
            if (this.f30711o) {
                mo37238a(uVar);
            } else {
                mo37240b(uVar);
            }
        }
    }

    public void onComplete() {
        if (!this.f30707k && !this.f30706j) {
            this.f30707k = true;
            mo37241c();
            mo37243d();
        }
    }

    public void onError(Throwable th) {
        C10910b.m36861a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f30707k || this.f30706j) {
            C11459a.m37531b(th);
            return;
        }
        this.f30708l = th;
        this.f30707k = true;
        mo37241c();
        mo37243d();
    }

    public void onNext(T t) {
        C10910b.m36861a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f30707k && !this.f30706j) {
            this.f30702f.offer(t);
            mo37243d();
        }
    }

    public void onSubscribe(C10842c cVar) {
        if (this.f30707k || this.f30706j) {
            cVar.dispose();
        }
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        if (this.f30709m.get() || !this.f30709m.compareAndSet(false, true)) {
            C10868e.m36781a((Throwable) new IllegalStateException("Only a single observer allowed."), (C11490u<?>) uVar);
            return;
        }
        uVar.onSubscribe(this.f30710n);
        this.f30703g.lazySet(uVar);
        if (this.f30706j) {
            this.f30703g.lazySet((Object) null);
        } else {
            mo37243d();
        }
    }

    /* renamed from: a */
    public static <T> C11476d<T> m37563a(int i, Runnable runnable) {
        return new C11476d<>(i, runnable, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo37238a(C11490u<? super T> uVar) {
        C11385c<T> cVar = this.f30702f;
        int i = 1;
        boolean z = !this.f30705i;
        while (!this.f30706j) {
            boolean z2 = this.f30707k;
            if (!z || !z2 || !mo37239a(cVar, uVar)) {
                uVar.onNext(null);
                if (z2) {
                    mo37242c(uVar);
                    return;
                }
                i = this.f30710n.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f30703g.lazySet((Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo37242c(C11490u<? super T> uVar) {
        this.f30703g.lazySet((Object) null);
        Throwable th = this.f30708l;
        if (th != null) {
            uVar.onError(th);
        } else {
            uVar.onComplete();
        }
    }

    C11476d(int i, Runnable runnable, boolean z) {
        C10910b.m36858a(i, "capacityHint");
        this.f30702f = new C11385c<>(i);
        C10910b.m36861a(runnable, "onTerminate");
        this.f30704h = new AtomicReference<>(runnable);
        this.f30705i = z;
        this.f30703g = new AtomicReference<>();
        this.f30709m = new AtomicBoolean();
        this.f30710n = new C11477a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo37239a(C10918g<T> gVar, C11490u<? super T> uVar) {
        Throwable th = this.f30708l;
        if (th == null) {
            return false;
        }
        this.f30703g.lazySet((Object) null);
        gVar.clear();
        uVar.onError(th);
        return true;
    }
}
