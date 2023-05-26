package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.C11491v;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p347f0.C11455e;

/* renamed from: q.a.d0.e.e.w2 */
/* compiled from: ObservableSampleTimed */
public final class C11309w2<T> extends C10980a<T, T> {

    /* renamed from: g */
    final long f30284g;

    /* renamed from: h */
    final TimeUnit f30285h;

    /* renamed from: i */
    final C11491v f30286i;

    /* renamed from: j */
    final boolean f30287j;

    /* renamed from: q.a.d0.e.e.w2$a */
    /* compiled from: ObservableSampleTimed */
    static final class C11310a<T> extends C11312c<T> {

        /* renamed from: l */
        final AtomicInteger f30288l = new AtomicInteger(1);

        C11310a(C11490u<? super T> uVar, long j, TimeUnit timeUnit, C11491v vVar) {
            super(uVar, j, timeUnit, vVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo37036b() {
            mo37040c();
            if (this.f30288l.decrementAndGet() == 0) {
                this.f30289f.onComplete();
            }
        }

        public void run() {
            if (this.f30288l.incrementAndGet() == 2) {
                mo37040c();
                if (this.f30288l.decrementAndGet() == 0) {
                    this.f30289f.onComplete();
                }
            }
        }
    }

    /* renamed from: q.a.d0.e.e.w2$b */
    /* compiled from: ObservableSampleTimed */
    static final class C11311b<T> extends C11312c<T> {
        C11311b(C11490u<? super T> uVar, long j, TimeUnit timeUnit, C11491v vVar) {
            super(uVar, j, timeUnit, vVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo37036b() {
            this.f30289f.onComplete();
        }

        public void run() {
            mo37040c();
        }
    }

    /* renamed from: q.a.d0.e.e.w2$c */
    /* compiled from: ObservableSampleTimed */
    static abstract class C11312c<T> extends AtomicReference<T> implements C11490u<T>, C10842c, Runnable {

        /* renamed from: f */
        final C11490u<? super T> f30289f;

        /* renamed from: g */
        final long f30290g;

        /* renamed from: h */
        final TimeUnit f30291h;

        /* renamed from: i */
        final C11491v f30292i;

        /* renamed from: j */
        final AtomicReference<C10842c> f30293j = new AtomicReference<>();

        /* renamed from: k */
        C10842c f30294k;

        C11312c(C11490u<? super T> uVar, long j, TimeUnit timeUnit, C11491v vVar) {
            this.f30289f = uVar;
            this.f30290g = j;
            this.f30291h = timeUnit;
            this.f30292i = vVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37039a() {
            C10867d.m36773a(this.f30293j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract void mo37036b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo37040c() {
            Object andSet = getAndSet((Object) null);
            if (andSet != null) {
                this.f30289f.onNext(andSet);
            }
        }

        public void dispose() {
            mo37039a();
            this.f30294k.dispose();
        }

        public boolean isDisposed() {
            return this.f30294k.isDisposed();
        }

        public void onComplete() {
            mo37039a();
            mo37036b();
        }

        public void onError(Throwable th) {
            mo37039a();
            this.f30289f.onError(th);
        }

        public void onNext(T t) {
            lazySet(t);
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f30294k, cVar)) {
                this.f30294k = cVar;
                this.f30289f.onSubscribe(this);
                C11491v vVar = this.f30292i;
                long j = this.f30290g;
                C10867d.m36774a(this.f30293j, vVar.mo37112a(this, j, j, this.f30291h));
            }
        }
    }

    public C11309w2(C11488s<T> sVar, long j, TimeUnit timeUnit, C11491v vVar, boolean z) {
        super(sVar);
        this.f30284g = j;
        this.f30285h = timeUnit;
        this.f30286i = vVar;
        this.f30287j = z;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        C11455e eVar = new C11455e(uVar);
        if (this.f30287j) {
            this.f29150f.subscribe(new C11310a(eVar, this.f30284g, this.f30285h, this.f30286i));
        } else {
            this.f29150f.subscribe(new C11311b(eVar, this.f30284g, this.f30285h, this.f30286i));
        }
    }
}
