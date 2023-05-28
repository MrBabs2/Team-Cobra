package p120q.p326a.p329d0.p334e.p340f;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C10838a0;
import p120q.p326a.C11496w;
import p120q.p326a.C11498y;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p334e.p340f.C11370f;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.f.j */
/* compiled from: SingleZipArray */
public final class C11378j<T, R> extends C11496w<R> {

    /* renamed from: f */
    final C10838a0<? extends T>[] f30472f;

    /* renamed from: g */
    final C10861o<? super Object[], ? extends R> f30473g;

    /* renamed from: q.a.d0.e.f.j$a */
    /* compiled from: SingleZipArray */
    final class C11379a implements C10861o<T, R> {
        C11379a() {
        }

        public R apply(T t) throws Exception {
            R apply = C11378j.this.f30473g.apply(new Object[]{t});
            C10910b.m36861a(apply, "The zipper returned a null value");
            return apply;
        }
    }

    /* renamed from: q.a.d0.e.f.j$c */
    /* compiled from: SingleZipArray */
    static final class C11381c<T> extends AtomicReference<C10842c> implements C11498y<T> {

        /* renamed from: f */
        final C11380b<T, ?> f30479f;

        /* renamed from: g */
        final int f30480g;

        C11381c(C11380b<T, ?> bVar, int i) {
            this.f30479f = bVar;
            this.f30480g = i;
        }

        /* renamed from: a */
        public void mo37091a() {
            C10867d.m36773a((AtomicReference<C10842c>) this);
        }

        public void onError(Throwable th) {
            this.f30479f.mo37090a(th, this.f30480g);
        }

        public void onSubscribe(C10842c cVar) {
            C10867d.m36778c(this, cVar);
        }

        public void onSuccess(T t) {
            this.f30479f.mo37089a(t, this.f30480g);
        }
    }

    public C11378j(C10838a0<? extends T>[] a0VarArr, C10861o<? super Object[], ? extends R> oVar) {
        this.f30472f = a0VarArr;
        this.f30473g = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36633b(C11498y<? super R> yVar) {
        C10838a0<? extends T>[] a0VarArr = this.f30472f;
        int length = a0VarArr.length;
        int i = 0;
        if (length == 1) {
            a0VarArr[0].mo36638a(new C11370f.C11371a(yVar, new C11379a()));
            return;
        }
        C11380b bVar = new C11380b(yVar, length, this.f30473g);
        yVar.onSubscribe(bVar);
        while (i < length && !bVar.isDisposed()) {
            C10838a0<? extends T> a0Var = a0VarArr[i];
            if (a0Var == null) {
                bVar.mo37090a((Throwable) new NullPointerException("One of the sources is null"), i);
                return;
            } else {
                a0Var.mo36638a(bVar.f30477h[i]);
                i++;
            }
        }
    }

    /* renamed from: q.a.d0.e.f.j$b */
    /* compiled from: SingleZipArray */
    static final class C11380b<T, R> extends AtomicInteger implements C10842c {

        /* renamed from: f */
        final C11498y<? super R> f30475f;

        /* renamed from: g */
        final C10861o<? super Object[], ? extends R> f30476g;

        /* renamed from: h */
        final C11381c<T>[] f30477h;

        /* renamed from: i */
        final Object[] f30478i;

        C11380b(C11498y<? super R> yVar, int i, C10861o<? super Object[], ? extends R> oVar) {
            super(i);
            this.f30475f = yVar;
            this.f30476g = oVar;
            C11381c<T>[] cVarArr = new C11381c[i];
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2] = new C11381c<>(this, i2);
            }
            this.f30477h = cVarArr;
            this.f30478i = new Object[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37089a(T t, int i) {
            this.f30478i[i] = t;
            if (decrementAndGet() == 0) {
                try {
                    Object apply = this.f30476g.apply(this.f30478i);
                    C10910b.m36861a(apply, "The zipper returned a null value");
                    this.f30475f.onSuccess(apply);
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    this.f30475f.onError(th);
                }
            }
        }

        public void dispose() {
            if (getAndSet(0) > 0) {
                for (C11381c<T> a : this.f30477h) {
                    a.mo37091a();
                }
            }
        }

        public boolean isDisposed() {
            return get() <= 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37088a(int i) {
            C11381c<T>[] cVarArr = this.f30477h;
            int length = cVarArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2].mo37091a();
            }
            while (true) {
                i++;
                if (i < length) {
                    cVarArr[i].mo37091a();
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37090a(Throwable th, int i) {
            if (getAndSet(0) > 0) {
                mo37088a(i);
                this.f30475f.onError(th);
                return;
            }
            C11459a.m37531b(th);
        }
    }
}
