package p120q.p326a.p329d0.p334e.p339e;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p120q.p326a.C11488s;
import p120q.p326a.p329d0.p345j.C11435j;
import p120q.p326a.p329d0.p345j.C11439m;
import p120q.p326a.p347f0.C11452b;

/* renamed from: q.a.d0.e.e.d */
/* compiled from: BlockingObservableMostRecent */
public final class C11017d<T> implements Iterable<T> {

    /* renamed from: f */
    final C11488s<T> f29273f;

    /* renamed from: g */
    final T f29274g;

    /* renamed from: q.a.d0.e.e.d$a */
    /* compiled from: BlockingObservableMostRecent */
    static final class C11018a<T> extends C11452b<T> {

        /* renamed from: g */
        volatile Object f29275g;

        /* renamed from: q.a.d0.e.e.d$a$a */
        /* compiled from: BlockingObservableMostRecent */
        final class C11019a implements Iterator<T> {

            /* renamed from: f */
            private Object f29276f;

            C11019a() {
            }

            public boolean hasNext() {
                Object obj = C11018a.this.f29275g;
                this.f29276f = obj;
                return !C11439m.m37481c(obj);
            }

            public T next() {
                Object obj = null;
                try {
                    if (this.f29276f == null) {
                        obj = C11018a.this.f29275g;
                    }
                    if (C11439m.m37481c(this.f29276f)) {
                        throw new NoSuchElementException();
                    } else if (!C11439m.m37482d(this.f29276f)) {
                        T t = this.f29276f;
                        C11439m.m37479b(t);
                        this.f29276f = obj;
                        return t;
                    } else {
                        throw C11435j.m37463a(C11439m.m37477a(this.f29276f));
                    }
                } finally {
                    this.f29276f = obj;
                }
            }

            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        C11018a(T t) {
            C11439m.m37483e(t);
            this.f29275g = t;
        }

        /* renamed from: b */
        public C11018a<T>.C0000a mo36817b() {
            return new C11019a();
        }

        public void onComplete() {
            this.f29275g = C11439m.m37474a();
        }

        public void onError(Throwable th) {
            this.f29275g = C11439m.m37475a(th);
        }

        public void onNext(T t) {
            C11439m.m37483e(t);
            this.f29275g = t;
        }
    }

    public C11017d(C11488s<T> sVar, T t) {
        this.f29273f = sVar;
        this.f29274g = t;
    }

    public Iterator<T> iterator() {
        C11018a aVar = new C11018a(this.f29274g);
        this.f29273f.subscribe(aVar);
        return aVar.mo36817b();
    }
}
