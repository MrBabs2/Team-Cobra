package p120q.p326a.p329d0.p334e.p339e;

import p036io.reactivex.exceptions.C9034a;
import p036io.reactivex.exceptions.CompositeException;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p330a.C10871h;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.d2 */
/* compiled from: ObservableOnErrorNext */
public final class C11024d2<T> extends C10980a<T, T> {

    /* renamed from: g */
    final C10861o<? super Throwable, ? extends C11488s<? extends T>> f29296g;

    /* renamed from: h */
    final boolean f29297h;

    /* renamed from: q.a.d0.e.e.d2$a */
    /* compiled from: ObservableOnErrorNext */
    static final class C11025a<T> implements C11490u<T> {

        /* renamed from: f */
        final C11490u<? super T> f29298f;

        /* renamed from: g */
        final C10861o<? super Throwable, ? extends C11488s<? extends T>> f29299g;

        /* renamed from: h */
        final boolean f29300h;

        /* renamed from: i */
        final C10871h f29301i = new C10871h();

        /* renamed from: j */
        boolean f29302j;

        /* renamed from: k */
        boolean f29303k;

        C11025a(C11490u<? super T> uVar, C10861o<? super Throwable, ? extends C11488s<? extends T>> oVar, boolean z) {
            this.f29298f = uVar;
            this.f29299g = oVar;
            this.f29300h = z;
        }

        public void onComplete() {
            if (!this.f29303k) {
                this.f29303k = true;
                this.f29302j = true;
                this.f29298f.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (!this.f29302j) {
                this.f29302j = true;
                if (!this.f29300h || (th instanceof Exception)) {
                    try {
                        C11488s sVar = (C11488s) this.f29299g.apply(th);
                        if (sVar == null) {
                            NullPointerException nullPointerException = new NullPointerException("Observable is null");
                            nullPointerException.initCause(th);
                            this.f29298f.onError(nullPointerException);
                            return;
                        }
                        sVar.subscribe(this);
                    } catch (Throwable th2) {
                        C9034a.m29708a(th2);
                        this.f29298f.onError(new CompositeException(th, th2));
                    }
                } else {
                    this.f29298f.onError(th);
                }
            } else if (this.f29303k) {
                C11459a.m37531b(th);
            } else {
                this.f29298f.onError(th);
            }
        }

        public void onNext(T t) {
            if (!this.f29303k) {
                this.f29298f.onNext(t);
            }
        }

        public void onSubscribe(C10842c cVar) {
            this.f29301i.mo36672a(cVar);
        }
    }

    public C11024d2(C11488s<T> sVar, C10861o<? super Throwable, ? extends C11488s<? extends T>> oVar, boolean z) {
        super(sVar);
        this.f29296g = oVar;
        this.f29297h = z;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        C11025a aVar = new C11025a(uVar, this.f29296g, this.f29297h);
        uVar.onSubscribe(aVar.f29301i);
        this.f29150f.subscribe(aVar);
    }
}
