package p120q.p326a.p329d0.p334e.p339e;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p329d0.p331b.C10910b;

/* renamed from: q.a.d0.e.e.l */
/* compiled from: ObservableBuffer */
public final class C11138l<T, U extends Collection<? super T>> extends C10980a<T, U> {

    /* renamed from: g */
    final int f29682g;

    /* renamed from: h */
    final int f29683h;

    /* renamed from: i */
    final Callable<U> f29684i;

    /* renamed from: q.a.d0.e.e.l$a */
    /* compiled from: ObservableBuffer */
    static final class C11139a<T, U extends Collection<? super T>> implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super U> f29685f;

        /* renamed from: g */
        final int f29686g;

        /* renamed from: h */
        final Callable<U> f29687h;

        /* renamed from: i */
        U f29688i;

        /* renamed from: j */
        int f29689j;

        /* renamed from: k */
        C10842c f29690k;

        C11139a(C11490u<? super U> uVar, int i, Callable<U> callable) {
            this.f29685f = uVar;
            this.f29686g = i;
            this.f29687h = callable;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo36902a() {
            try {
                U call = this.f29687h.call();
                C10910b.m36861a(call, "Empty buffer supplied");
                this.f29688i = (Collection) call;
                return true;
            } catch (Throwable th) {
                C9034a.m29708a(th);
                this.f29688i = null;
                C10842c cVar = this.f29690k;
                if (cVar == null) {
                    C10868e.m36781a(th, (C11490u<?>) this.f29685f);
                    return false;
                }
                cVar.dispose();
                this.f29685f.onError(th);
                return false;
            }
        }

        public void dispose() {
            this.f29690k.dispose();
        }

        public boolean isDisposed() {
            return this.f29690k.isDisposed();
        }

        public void onComplete() {
            U u = this.f29688i;
            if (u != null) {
                this.f29688i = null;
                if (!u.isEmpty()) {
                    this.f29685f.onNext(u);
                }
                this.f29685f.onComplete();
            }
        }

        public void onError(Throwable th) {
            this.f29688i = null;
            this.f29685f.onError(th);
        }

        public void onNext(T t) {
            U u = this.f29688i;
            if (u != null) {
                u.add(t);
                int i = this.f29689j + 1;
                this.f29689j = i;
                if (i >= this.f29686g) {
                    this.f29685f.onNext(u);
                    this.f29689j = 0;
                    mo36902a();
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29690k, cVar)) {
                this.f29690k = cVar;
                this.f29685f.onSubscribe(this);
            }
        }
    }

    /* renamed from: q.a.d0.e.e.l$b */
    /* compiled from: ObservableBuffer */
    static final class C11140b<T, U extends Collection<? super T>> extends AtomicBoolean implements C11490u<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super U> f29691f;

        /* renamed from: g */
        final int f29692g;

        /* renamed from: h */
        final int f29693h;

        /* renamed from: i */
        final Callable<U> f29694i;

        /* renamed from: j */
        C10842c f29695j;

        /* renamed from: k */
        final ArrayDeque<U> f29696k = new ArrayDeque<>();

        /* renamed from: l */
        long f29697l;

        C11140b(C11490u<? super U> uVar, int i, int i2, Callable<U> callable) {
            this.f29691f = uVar;
            this.f29692g = i;
            this.f29693h = i2;
            this.f29694i = callable;
        }

        public void dispose() {
            this.f29695j.dispose();
        }

        public boolean isDisposed() {
            return this.f29695j.isDisposed();
        }

        public void onComplete() {
            while (!this.f29696k.isEmpty()) {
                this.f29691f.onNext(this.f29696k.poll());
            }
            this.f29691f.onComplete();
        }

        public void onError(Throwable th) {
            this.f29696k.clear();
            this.f29691f.onError(th);
        }

        public void onNext(T t) {
            long j = this.f29697l;
            this.f29697l = 1 + j;
            if (j % ((long) this.f29693h) == 0) {
                try {
                    U call = this.f29694i.call();
                    C10910b.m36861a(call, "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
                    this.f29696k.offer((Collection) call);
                } catch (Throwable th) {
                    this.f29696k.clear();
                    this.f29695j.dispose();
                    this.f29691f.onError(th);
                    return;
                }
            }
            Iterator<U> it = this.f29696k.iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) it.next();
                collection.add(t);
                if (this.f29692g <= collection.size()) {
                    it.remove();
                    this.f29691f.onNext(collection);
                }
            }
        }

        public void onSubscribe(C10842c cVar) {
            if (C10867d.m36776a(this.f29695j, cVar)) {
                this.f29695j = cVar;
                this.f29691f.onSubscribe(this);
            }
        }
    }

    public C11138l(C11488s<T> sVar, int i, int i2, Callable<U> callable) {
        super(sVar);
        this.f29682g = i;
        this.f29683h = i2;
        this.f29684i = callable;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super U> uVar) {
        int i = this.f29683h;
        int i2 = this.f29682g;
        if (i == i2) {
            C11139a aVar = new C11139a(uVar, i2, this.f29684i);
            if (aVar.mo36902a()) {
                this.f29150f.subscribe(aVar);
                return;
            }
            return;
        }
        this.f29150f.subscribe(new C11140b(uVar, this.f29682g, this.f29683h, this.f29684i));
    }
}
