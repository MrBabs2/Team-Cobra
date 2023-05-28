package p123rx.p401n.p403b;

import java.util.concurrent.atomic.AtomicInteger;
import p123rx.C12473g;
import p123rx.C12475j;
import p123rx.C5372f;
import p123rx.exceptions.C12472a;

/* renamed from: rx.n.b.b */
/* compiled from: SingleDelayedProducer */
public final class C12706b<T> extends AtomicInteger implements C12473g {

    /* renamed from: f */
    final C12475j<? super T> f32816f;

    /* renamed from: g */
    T f32817g;

    public C12706b(C12475j<? super T> jVar) {
        this.f32816f = jVar;
    }

    /* renamed from: a */
    public void mo40846a(T t) {
        do {
            int i = get();
            if (i == 0) {
                this.f32817g = t;
            } else if (i == 2 && compareAndSet(2, 3)) {
                m41191a(this.f32816f, t);
                return;
            } else {
                return;
            }
        } while (!compareAndSet(0, 1));
    }

    public void request(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        } else if (j != 0) {
            do {
                int i = get();
                if (i != 0) {
                    if (i == 1 && compareAndSet(1, 3)) {
                        m41191a(this.f32816f, this.f32817g);
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    /* renamed from: a */
    private static <T> void m41191a(C12475j<? super T> jVar, T t) {
        if (!jVar.isUnsubscribed()) {
            try {
                jVar.onNext(t);
                if (!jVar.isUnsubscribed()) {
                    jVar.onCompleted();
                }
            } catch (Throwable th) {
                C12472a.m40940a(th, (C5372f<?>) jVar, (Object) t);
            }
        }
    }
}
