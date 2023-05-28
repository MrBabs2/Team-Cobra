package p120q.p326a.p329d0.p334e.p339e;

import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.C11491v;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p332c.C10913b;
import p120q.p326a.p329d0.p332c.C10918g;
import p120q.p326a.p329d0.p333d.C10920b;
import p120q.p326a.p329d0.p341f.C11385c;
import p120q.p326a.p329d0.p342g.C11417p;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.c2 */
/* compiled from: ObservableObserveOn */
public final class C11010c2<T> extends C10980a<T, T> {

    /* renamed from: g */
    final C11491v f29236g;

    /* renamed from: h */
    final boolean f29237h;

    /* renamed from: i */
    final int f29238i;

    public C11010c2(C11488s<T> sVar, C11491v vVar, boolean z, int i) {
        super(sVar);
        this.f29236g = vVar;
        this.f29237h = z;
        this.f29238i = i;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        C11491v vVar = this.f29236g;
        if (vVar instanceof C11417p) {
            this.f29150f.subscribe(uVar);
            return;
        }
        this.f29150f.subscribe(new C11011a(uVar, vVar.mo37114a(), this.f29237h, this.f29238i));
    }

    /* renamed from: q.a.d0.e.e.c2$a */
    /* compiled from: ObservableObserveOn */
    static final class C11011a<T> extends C10920b<T> implements C11490u<T>, Runnable {

        /* renamed from: f */
        final C11490u<? super T> f29239f;

        /* renamed from: g */
        final C11491v.C11494c f29240g;

        /* renamed from: h */
        final boolean f29241h;

        /* renamed from: i */
        final int f29242i;

        /* renamed from: j */
        C10918g<T> f29243j;

        /* renamed from: k */
        C10842c f29244k;

        /* renamed from: l */
        Throwable f29245l;

        /* renamed from: m */
        volatile boolean f29246m;

        /* renamed from: n */
        volatile boolean f29247n;

        /* renamed from: o */
        int f29248o;

        /* renamed from: p */
        boolean f29249p;

        C11011a(C11490u<? super T> uVar, C11491v.C11494c cVar, boolean z, int i) {
            this.f29239f = uVar;
            this.f29240g = cVar;
            this.f29241h = z;
            this.f29242i = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36807a() {
            int i = 1;
            while (!this.f29247n) {
                boolean z = this.f29246m;
                Throwable th = this.f29245l;
                if (this.f29241h || !z || th == null) {
                    this.f29239f.onNext(null);
                    if (z) {
                        this.f29247n = true;
                        Throwable th2 = this.f29245l;
                        if (th2 != null) {
                            this.f29239f.onError(th2);
                        } else {
                            this.f29239f.onComplete();
                        }
                        this.f29240g.dispose();
                        return;
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    this.f29247n = true;
                    this.f29239f.onError(this.f29245l);
                    this.f29240g.dispose();
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo36809b() {
            C10918g<T> gVar = this.f29243j;
            C11490u<? super T> uVar = this.f29239f;
            int i = 1;
            while (!mo36808a(this.f29246m, gVar.isEmpty(), uVar)) {
                while (true) {
                    boolean z = this.f29246m;
                    try {
                        T poll = gVar.poll();
                        boolean z2 = poll == null;
                        if (!mo36808a(z, z2, uVar)) {
                            if (z2) {
                                i = addAndGet(-i);
                                if (i == 0) {
                                    return;
                                }
                            } else {
                                uVar.onNext(poll);
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C9034a.m29708a(th);
                        this.f29247n = true;
                        this.f29244k.dispose();
                        gVar.clear();
                        uVar.onError(th);
                        this.f29240g.dispose();
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo36810c() {
            if (getAndIncrement() == 0) {
                this.f29240g.mo37116a((Runnable) this);
            }
        }

        public void clear() {
            this.f29243j.clear();
        }

        public void dispose() {
            if (!this.f29247n) {
                this.f29247n = true;
                this.f29244k.dispose();
                this.f29240g.dispose();
                if (!this.f29249p && getAndIncrement() == 0) {
                    this.f29243j.clear();
                }
            }
        }

        public boolean isDisposed() {
            return this.f29247n;
        }

        public boolean isEmpty() {
            return this.f29243j.isEmpty();
        }

        public void onComplete() {
            if (!this.f29246m) {
                this.f29246m = true;
                mo36810c();
            }
        }

        public void onError(Throwable th) {
            if (this.f29246m) {
                C11459a.m37531b(th);
                return;
            }
            this.f29245l = th;
            this.f29246m = true;
            mo36810c();
        }

        public void onNext(T t) {
            if (!this.f29246m) {
                if (this.f29248o != 2) {
                    this.f29243j.offer(t);
                }
                mo36810c();
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29244k, cVar)) {
                this.f29244k = cVar;
                if (cVar instanceof C10913b) {
                    C10913b bVar = (C10913b) cVar;
                    int a = bVar.mo36665a(7);
                    if (a == 1) {
                        this.f29248o = a;
                        this.f29243j = bVar;
                        this.f29246m = true;
                        this.f29239f.onSubscribe(this);
                        mo36810c();
                        return;
                    } else if (a == 2) {
                        this.f29248o = a;
                        this.f29243j = bVar;
                        this.f29239f.onSubscribe(this);
                        return;
                    }
                }
                this.f29243j = new C11385c(this.f29242i);
                this.f29239f.onSubscribe(this);
            }
        }

        public T poll() throws Exception {
            return this.f29243j.poll();
        }

        public void run() {
            if (this.f29249p) {
                mo36807a();
            } else {
                mo36809b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo36808a(boolean z, boolean z2, C11490u<? super T> uVar) {
            if (this.f29247n) {
                this.f29243j.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.f29245l;
                if (this.f29241h) {
                    if (!z2) {
                        return false;
                    }
                    this.f29247n = true;
                    if (th != null) {
                        uVar.onError(th);
                    } else {
                        uVar.onComplete();
                    }
                    this.f29240g.dispose();
                    return true;
                } else if (th != null) {
                    this.f29247n = true;
                    this.f29243j.clear();
                    uVar.onError(th);
                    this.f29240g.dispose();
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    this.f29247n = true;
                    uVar.onComplete();
                    this.f29240g.dispose();
                    return true;
                }
            }
        }

        /* renamed from: a */
        public int mo36665a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f29249p = true;
            return 2;
        }
    }
}
