package kotlin.p045h0.p046u.p047e.p389l0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: kotlin.h0.u.e.l0.a */
/* compiled from: ConsPStack */
final class C12021a<E> implements Iterable<E> {

    /* renamed from: i */
    private static final C12021a<Object> f31764i = new C12021a<>();

    /* renamed from: f */
    final E f31765f;

    /* renamed from: g */
    final C12021a<E> f31766g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final int f31767h;

    /* renamed from: kotlin.h0.u.e.l0.a$a */
    /* compiled from: ConsPStack */
    private static class C12022a<E> implements Iterator<E> {

        /* renamed from: f */
        private C12021a<E> f31768f;

        public C12022a(C12021a<E> aVar) {
            this.f31768f = aVar;
        }

        public boolean hasNext() {
            return this.f31768f.f31767h > 0;
        }

        public E next() {
            C12021a<E> aVar = this.f31768f;
            E e = aVar.f31765f;
            this.f31768f = aVar.f31766g;
            return e;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private C12021a() {
        this.f31767h = 0;
        this.f31765f = null;
        this.f31766g = null;
    }

    /* renamed from: b */
    private C12021a<E> m39722b(Object obj) {
        if (this.f31767h == 0) {
            return this;
        }
        if (this.f31765f.equals(obj)) {
            return this.f31766g;
        }
        C12021a<E> b = this.f31766g.m39722b(obj);
        if (b == this.f31766g) {
            return this;
        }
        return new C12021a<>(this.f31765f, b);
    }

    /* renamed from: i */
    private Iterator<E> m39723i(int i) {
        return new C12022a(m39724j(i));
    }

    /* renamed from: j */
    private C12021a<E> m39724j(int i) {
        if (i < 0 || i > this.f31767h) {
            throw new IndexOutOfBoundsException();
        } else if (i == 0) {
            return this;
        } else {
            return this.f31766g.m39724j(i - 1);
        }
    }

    public E get(int i) {
        if (i < 0 || i > this.f31767h) {
            throw new IndexOutOfBoundsException();
        }
        try {
            return m39723i(i).next();
        } catch (NoSuchElementException unused) {
            throw new IndexOutOfBoundsException("Index: " + i);
        }
    }

    /* renamed from: h */
    public C12021a<E> mo38645h(int i) {
        return m39722b(get(i));
    }

    public Iterator<E> iterator() {
        return m39723i(0);
    }

    public int size() {
        return this.f31767h;
    }

    /* renamed from: a */
    public static <E> C12021a<E> m39721a() {
        return f31764i;
    }

    /* renamed from: a */
    public C12021a<E> mo38643a(E e) {
        return new C12021a<>(e, this);
    }

    private C12021a(E e, C12021a<E> aVar) {
        this.f31765f = e;
        this.f31766g = aVar;
        this.f31767h = aVar.f31767h + 1;
    }
}
