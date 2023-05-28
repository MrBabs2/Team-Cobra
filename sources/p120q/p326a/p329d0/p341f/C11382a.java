package p120q.p326a.p329d0.p341f;

import java.util.concurrent.atomic.AtomicReference;
import p120q.p326a.p329d0.p332c.C10917f;

/* renamed from: q.a.d0.f.a */
/* compiled from: MpscLinkedQueue */
public final class C11382a<T> implements C10917f<T> {

    /* renamed from: f */
    private final AtomicReference<C11383a<T>> f30481f = new AtomicReference<>();

    /* renamed from: g */
    private final AtomicReference<C11383a<T>> f30482g = new AtomicReference<>();

    /* renamed from: q.a.d0.f.a$a */
    /* compiled from: MpscLinkedQueue */
    static final class C11383a<E> extends AtomicReference<C11383a<E>> {

        /* renamed from: f */
        private E f30483f;

        C11383a() {
        }

        /* renamed from: a */
        public E mo37097a() {
            E b = mo37100b();
            mo37098a((Object) null);
            return b;
        }

        /* renamed from: b */
        public E mo37100b() {
            return this.f30483f;
        }

        /* renamed from: c */
        public C11383a<E> mo37101c() {
            return (C11383a) get();
        }

        C11383a(E e) {
            mo37098a(e);
        }

        /* renamed from: a */
        public void mo37098a(E e) {
            this.f30483f = e;
        }

        /* renamed from: a */
        public void mo37099a(C11383a<E> aVar) {
            lazySet(aVar);
        }
    }

    public C11382a() {
        C11383a aVar = new C11383a();
        mo37093a(aVar);
        mo37095b(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C11383a<T> mo37092a() {
        return this.f30482g.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C11383a<T> mo37095b(C11383a<T> aVar) {
        return this.f30481f.getAndSet(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C11383a<T> mo37096c() {
        return this.f30481f.get();
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r1 = this;
        L_0x0000:
            java.lang.Object r0 = r1.poll()
            if (r0 == 0) goto L_0x000d
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q.p326a.p329d0.p341f.C11382a.clear():void");
    }

    public boolean isEmpty() {
        return mo37094b() == mo37096c();
    }

    public boolean offer(T t) {
        if (t != null) {
            C11383a aVar = new C11383a(t);
            mo37095b(aVar).mo37099a(aVar);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public T poll() {
        C11383a c;
        C11383a a = mo37092a();
        C11383a c2 = a.mo37101c();
        if (c2 != null) {
            T a2 = c2.mo37097a();
            mo37093a(c2);
            return a2;
        } else if (a == mo37096c()) {
            return null;
        } else {
            do {
                c = a.mo37101c();
            } while (c == null);
            T a3 = c.mo37097a();
            mo37093a(c);
            return a3;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo37093a(C11383a<T> aVar) {
        this.f30482g.lazySet(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C11383a<T> mo37094b() {
        return this.f30482g.get();
    }
}
