package p120q.p326a.p329d0.p334e.p339e;

import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11478j;
import p120q.p326a.C11479k;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10849c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.l2 */
/* compiled from: ObservableReduceMaybe */
public final class C11145l2<T> extends C11478j<T> {

    /* renamed from: f */
    final C11488s<T> f29702f;

    /* renamed from: g */
    final C10849c<T, T, T> f29703g;

    /* renamed from: q.a.d0.e.e.l2$a */
    /* compiled from: ObservableReduceMaybe */
    static final class C11146a<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11479k<? super T> f29704f;

        /* renamed from: g */
        final C10849c<T, T, T> f29705g;

        /* renamed from: h */
        boolean f29706h;

        /* renamed from: i */
        T f29707i;

        /* renamed from: j */
        C10842c f29708j;

        C11146a(C11479k<? super T> kVar, C10849c<T, T, T> cVar) {
            this.f29704f = kVar;
            this.f29705g = cVar;
        }

        public void dispose() {
            this.f29708j.dispose();
        }

        public boolean isDisposed() {
            return this.f29708j.isDisposed();
        }

        public void onComplete() {
            if (!this.f29706h) {
                this.f29706h = true;
                T t = this.f29707i;
                this.f29707i = null;
                if (t != null) {
                    this.f29704f.onSuccess(t);
                } else {
                    this.f29704f.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f29706h) {
                C11459a.m37531b(th);
                return;
            }
            this.f29706h = true;
            this.f29707i = null;
            this.f29704f.onError(th);
        }

        public void onNext(T t) {
            if (!this.f29706h) {
                T t2 = this.f29707i;
                if (t2 == null) {
                    this.f29707i = t;
                    return;
                }
                try {
                    T a = this.f29705g.mo7653a(t2, t);
                    C10910b.m36861a(a, "The reducer returned a null value");
                    this.f29707i = a;
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    this.f29708j.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29708j, cVar)) {
                this.f29708j = cVar;
                this.f29704f.onSubscribe(this);
            }
        }
    }

    public C11145l2(C11488s<T> sVar, C10849c<T, T, T> cVar) {
        this.f29702f = sVar;
        this.f29703g = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36748b(C11479k<? super T> kVar) {
        this.f29702f.subscribe(new C11146a(kVar, this.f29703g));
    }
}
