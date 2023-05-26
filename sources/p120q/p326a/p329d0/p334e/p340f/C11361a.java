package p120q.p326a.p329d0.p334e.p340f;

import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11496w;
import p120q.p326a.C11497x;
import p120q.p326a.C11498y;
import p120q.p326a.C11499z;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10852f;
import p120q.p326a.p329d0.p330a.C10865b;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.f.a */
/* compiled from: SingleCreate */
public final class C11361a<T> extends C11496w<T> {

    /* renamed from: f */
    final C11499z<T> f30441f;

    public C11361a(C11499z<T> zVar) {
        this.f30441f = zVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36633b(C11498y<? super T> yVar) {
        C11362a aVar = new C11362a(yVar);
        yVar.onSubscribe(aVar);
        try {
            this.f30441f.mo4441a(aVar);
        } catch (Throwable th) {
            C9034a.m29708a(th);
            aVar.mo37083b(th);
        }
    }

    /* renamed from: q.a.d0.e.f.a$a */
    /* compiled from: SingleCreate */
    static final class C11362a<T> extends AtomicReference<C10842c> implements C11497x<T>, C10842c {

        /* renamed from: f */
        final C11498y<? super T> f30442f;

        C11362a(C11498y<? super T> yVar) {
            this.f30442f = yVar;
        }

        /* renamed from: a */
        public boolean mo37082a(Throwable th) {
            C10842c cVar;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            Object obj = get();
            C10867d dVar = C10867d.DISPOSED;
            if (obj == dVar || (cVar = (C10842c) getAndSet(dVar)) == C10867d.DISPOSED) {
                return false;
            }
            try {
                this.f30442f.onError(th);
            } finally {
                if (cVar != null) {
                    cVar.dispose();
                }
            }
        }

        /* renamed from: b */
        public void mo37083b(Throwable th) {
            if (!mo37082a(th)) {
                C11459a.m37531b(th);
            }
        }

        public void dispose() {
            C10867d.m36773a((AtomicReference<C10842c>) this);
        }

        public boolean isDisposed() {
            return C10867d.m36775a((C10842c) get());
        }

        public void onSuccess(T t) {
            C10842c cVar;
            Object obj = get();
            C10867d dVar = C10867d.DISPOSED;
            if (obj != dVar && (cVar = (C10842c) getAndSet(dVar)) != C10867d.DISPOSED) {
                if (t == null) {
                    try {
                        this.f30442f.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                    } catch (Throwable th) {
                        if (cVar != null) {
                            cVar.dispose();
                        }
                        throw th;
                    }
                } else {
                    this.f30442f.onSuccess(t);
                }
                if (cVar != null) {
                    cVar.dispose();
                }
            }
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{C11362a.class.getSimpleName(), super.toString()});
        }

        /* renamed from: a */
        public void mo37080a(C10842c cVar) {
            C10867d.m36777b(this, cVar);
        }

        /* renamed from: a */
        public void mo37081a(C10852f fVar) {
            mo37080a((C10842c) new C10865b(fVar));
        }
    }
}
