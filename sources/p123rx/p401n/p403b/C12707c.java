package p123rx.p401n.p403b;

import java.util.concurrent.atomic.AtomicBoolean;
import p123rx.C12473g;
import p123rx.C12475j;
import p123rx.C5372f;
import p123rx.exceptions.C12472a;

/* renamed from: rx.n.b.c */
/* compiled from: SingleProducer */
public final class C12707c<T> extends AtomicBoolean implements C12473g {

    /* renamed from: f */
    final C12475j<? super T> f32818f;

    /* renamed from: g */
    final T f32819g;

    public C12707c(C12475j<? super T> jVar, T t) {
        this.f32818f = jVar;
        this.f32819g = t;
    }

    public void request(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        } else if (j != 0 && compareAndSet(false, true)) {
            C12475j<? super T> jVar = this.f32818f;
            if (!jVar.isUnsubscribed()) {
                T t = this.f32819g;
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
}
