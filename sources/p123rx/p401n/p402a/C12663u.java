package p123rx.p401n.p402a;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import p123rx.C12473g;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5372f;
import p123rx.exceptions.C12472a;

/* renamed from: rx.n.a.u */
/* compiled from: OnSubscribeFromIterable */
public final class C12663u<T> implements C5368e.C5370a<T> {

    /* renamed from: f */
    final Iterable<? extends T> f32700f;

    public C12663u(Iterable<? extends T> iterable) {
        if (iterable != null) {
            this.f32700f = iterable;
            return;
        }
        throw new NullPointerException("iterable must not be null");
    }

    /* renamed from: a */
    public void call(C12475j<? super T> jVar) {
        try {
            Iterator<? extends T> it = this.f32700f.iterator();
            boolean hasNext = it.hasNext();
            if (jVar.isUnsubscribed()) {
                return;
            }
            if (!hasNext) {
                jVar.onCompleted();
            } else {
                jVar.setProducer(new C12664a(jVar, it));
            }
        } catch (Throwable th) {
            C12472a.m40939a(th, (C5372f<?>) jVar);
        }
    }

    /* renamed from: rx.n.a.u$a */
    /* compiled from: OnSubscribeFromIterable */
    static final class C12664a<T> extends AtomicLong implements C12473g {

        /* renamed from: f */
        private final C12475j<? super T> f32701f;

        /* renamed from: g */
        private final Iterator<? extends T> f32702g;

        C12664a(C12475j<? super T> jVar, Iterator<? extends T> it) {
            this.f32701f = jVar;
            this.f32702g = it;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40813a(long j) {
            C12475j<? super T> jVar = this.f32701f;
            Iterator<? extends T> it = this.f32702g;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        j = get();
                        if (j2 == j) {
                            j = C12502a.m40962b(this, j2);
                        }
                    } else if (!jVar.isUnsubscribed()) {
                        try {
                            jVar.onNext(it.next());
                            if (!jVar.isUnsubscribed()) {
                                try {
                                    if (it.hasNext()) {
                                        j2++;
                                    } else if (!jVar.isUnsubscribed()) {
                                        jVar.onCompleted();
                                        return;
                                    } else {
                                        return;
                                    }
                                } catch (Throwable th) {
                                    C12472a.m40939a(th, (C5372f<?>) jVar);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            C12472a.m40939a(th2, (C5372f<?>) jVar);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } while (j != 0);
        }

        public void request(long j) {
            if (get() != Long.MAX_VALUE) {
                if (j == Long.MAX_VALUE && compareAndSet(0, Long.MAX_VALUE)) {
                    mo40812a();
                } else if (j > 0 && C12502a.m40960a((AtomicLong) this, j) == 0) {
                    mo40813a(j);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40812a() {
            C12475j<? super T> jVar = this.f32701f;
            Iterator<? extends T> it = this.f32702g;
            while (!jVar.isUnsubscribed()) {
                try {
                    jVar.onNext(it.next());
                    if (!jVar.isUnsubscribed()) {
                        try {
                            if (!it.hasNext()) {
                                if (!jVar.isUnsubscribed()) {
                                    jVar.onCompleted();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            C12472a.m40939a(th, (C5372f<?>) jVar);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    C12472a.m40939a(th2, (C5372f<?>) jVar);
                    return;
                }
            }
        }
    }
}
