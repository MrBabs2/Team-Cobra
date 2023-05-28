package p120q.p326a.p329d0.p334e.p339e;

import java.util.ArrayDeque;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;

/* renamed from: q.a.d0.e.e.p3 */
/* compiled from: ObservableTakeLast */
public final class C11220p3<T> extends C10980a<T, T> {

    /* renamed from: g */
    final int f29957g;

    /* renamed from: q.a.d0.e.e.p3$a */
    /* compiled from: ObservableTakeLast */
    static final class C11221a<T> extends ArrayDeque<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f29958f;

        /* renamed from: g */
        final int f29959g;

        /* renamed from: h */
        C10842c f29960h;

        /* renamed from: i */
        volatile boolean f29961i;

        C11221a(C11490u<? super T> uVar, int i) {
            this.f29958f = uVar;
            this.f29959g = i;
        }

        public void dispose() {
            if (!this.f29961i) {
                this.f29961i = true;
                this.f29960h.dispose();
            }
        }

        public boolean isDisposed() {
            return this.f29961i;
        }

        public void onComplete() {
            C11490u<? super T> uVar = this.f29958f;
            while (!this.f29961i) {
                Object poll = poll();
                if (poll != null) {
                    uVar.onNext(poll);
                } else if (!this.f29961i) {
                    uVar.onComplete();
                    return;
                } else {
                    return;
                }
            }
        }

        public void onError(Throwable th) {
            this.f29958f.onError(th);
        }

        public void onNext(T t) {
            if (this.f29959g == size()) {
                poll();
            }
            offer(t);
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29960h, cVar)) {
                this.f29960h = cVar;
                this.f29958f.onSubscribe(this);
            }
        }
    }

    public C11220p3(C11488s<T> sVar, int i) {
        super(sVar);
        this.f29957g = i;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29150f.subscribe(new C11221a(uVar, this.f29957g));
    }
}
