package p120q.p326a.p329d0.p334e.p339e;

import p120q.p326a.C11478j;
import p120q.p326a.C11479k;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;

/* renamed from: q.a.d0.e.e.s1 */
/* compiled from: ObservableLastMaybe */
public final class C11246s1<T> extends C11478j<T> {

    /* renamed from: f */
    final C11488s<T> f30069f;

    /* renamed from: q.a.d0.e.e.s1$a */
    /* compiled from: ObservableLastMaybe */
    static final class C11247a<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11479k<? super T> f30070f;

        /* renamed from: g */
        C10842c f30071g;

        /* renamed from: h */
        T f30072h;

        C11247a(C11479k<? super T> kVar) {
            this.f30070f = kVar;
        }

        public void dispose() {
            this.f30071g.dispose();
            this.f30071g = C10867d.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f30071g == C10867d.DISPOSED;
        }

        public void onComplete() {
            this.f30071g = C10867d.DISPOSED;
            T t = this.f30072h;
            if (t != null) {
                this.f30072h = null;
                this.f30070f.onSuccess(t);
                return;
            }
            this.f30070f.onComplete();
        }

        public void onError(Throwable th) {
            this.f30071g = C10867d.DISPOSED;
            this.f30072h = null;
            this.f30070f.onError(th);
        }

        public void onNext(T t) {
            this.f30072h = t;
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f30071g, cVar)) {
                this.f30071g = cVar;
                this.f30070f.onSubscribe(this);
            }
        }
    }

    public C11246s1(C11488s<T> sVar) {
        this.f30069f = sVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36748b(C11479k<? super T> kVar) {
        this.f30069f.subscribe(new C11247a(kVar));
    }
}
