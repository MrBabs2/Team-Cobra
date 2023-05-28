package p120q.p326a.p329d0.p334e.p339e;

import java.util.NoSuchElementException;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.C11496w;
import p120q.p326a.C11498y;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p332c.C10912a;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.r0 */
/* compiled from: ObservableElementAtSingle */
public final class C11235r0<T> extends C11496w<T> implements C10912a<T> {

    /* renamed from: f */
    final C11488s<T> f30024f;

    /* renamed from: g */
    final long f30025g;

    /* renamed from: h */
    final T f30026h;

    /* renamed from: q.a.d0.e.e.r0$a */
    /* compiled from: ObservableElementAtSingle */
    static final class C11236a<T> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11498y<? super T> f30027f;

        /* renamed from: g */
        final long f30028g;

        /* renamed from: h */
        final T f30029h;

        /* renamed from: i */
        C10842c f30030i;

        /* renamed from: j */
        long f30031j;

        /* renamed from: k */
        boolean f30032k;

        C11236a(C11498y<? super T> yVar, long j, T t) {
            this.f30027f = yVar;
            this.f30028g = j;
            this.f30029h = t;
        }

        public void dispose() {
            this.f30030i.dispose();
        }

        public boolean isDisposed() {
            return this.f30030i.isDisposed();
        }

        public void onComplete() {
            if (!this.f30032k) {
                this.f30032k = true;
                T t = this.f30029h;
                if (t != null) {
                    this.f30027f.onSuccess(t);
                } else {
                    this.f30027f.onError(new NoSuchElementException());
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f30032k) {
                C11459a.m37531b(th);
                return;
            }
            this.f30032k = true;
            this.f30027f.onError(th);
        }

        public void onNext(T t) {
            if (!this.f30032k) {
                long j = this.f30031j;
                if (j == this.f30028g) {
                    this.f30032k = true;
                    this.f30030i.dispose();
                    this.f30027f.onSuccess(t);
                    return;
                }
                this.f30031j = j + 1;
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f30030i, cVar)) {
                this.f30030i = cVar;
                this.f30027f.onSubscribe(this);
            }
        }
    }

    public C11235r0(C11488s<T> sVar, long j, T t) {
        this.f30024f = sVar;
        this.f30025g = j;
        this.f30026h = t;
    }

    /* renamed from: a */
    public C11482n<T> mo36701a() {
        return C11459a.m37519a(new C11214p0(this.f30024f, this.f30025g, this.f30026h, true));
    }

    /* renamed from: b */
    public void mo36633b(C11498y<? super T> yVar) {
        this.f30024f.subscribe(new C11236a(yVar, this.f30025g, this.f30026h));
    }
}
