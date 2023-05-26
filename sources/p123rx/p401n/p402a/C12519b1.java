package p123rx.p401n.p402a;

import java.util.concurrent.atomic.AtomicLong;
import p123rx.C12473g;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.p411q.C12844c;

/* renamed from: rx.n.a.b1 */
/* compiled from: OperatorTake */
public final class C12519b1<T> implements C5368e.C5371b<T, T> {

    /* renamed from: f */
    final int f32287f;

    /* renamed from: rx.n.a.b1$a */
    /* compiled from: OperatorTake */
    class C12520a extends C12475j<T> {

        /* renamed from: f */
        int f32288f;

        /* renamed from: g */
        boolean f32289g;

        /* renamed from: h */
        final /* synthetic */ C12475j f32290h;

        /* renamed from: rx.n.a.b1$a$a */
        /* compiled from: OperatorTake */
        class C12521a implements C12473g {

            /* renamed from: f */
            final AtomicLong f32292f = new AtomicLong(0);

            /* renamed from: g */
            final /* synthetic */ C12473g f32293g;

            C12521a(C12473g gVar) {
                this.f32293g = gVar;
            }

            public void request(long j) {
                long j2;
                long min;
                if (j > 0 && !C12520a.this.f32289g) {
                    do {
                        j2 = this.f32292f.get();
                        min = Math.min(j, ((long) C12519b1.this.f32287f) - j2);
                        if (min == 0) {
                            return;
                        }
                    } while (!this.f32292f.compareAndSet(j2, j2 + min));
                    this.f32293g.request(min);
                }
            }
        }

        C12520a(C12475j jVar) {
            this.f32290h = jVar;
        }

        public void onCompleted() {
            if (!this.f32289g) {
                this.f32289g = true;
                this.f32290h.onCompleted();
            }
        }

        public void onError(Throwable th) {
            if (!this.f32289g) {
                this.f32289g = true;
                try {
                    this.f32290h.onError(th);
                } finally {
                    unsubscribe();
                }
            } else {
                C12844c.m41417b(th);
            }
        }

        public void onNext(T t) {
            if (!isUnsubscribed()) {
                int i = this.f32288f;
                int i2 = i + 1;
                this.f32288f = i2;
                int i3 = C12519b1.this.f32287f;
                if (i < i3) {
                    boolean z = i2 == i3;
                    this.f32290h.onNext(t);
                    if (z && !this.f32289g) {
                        this.f32289g = true;
                        try {
                            this.f32290h.onCompleted();
                        } finally {
                            unsubscribe();
                        }
                    }
                }
            }
        }

        public void setProducer(C12473g gVar) {
            this.f32290h.setProducer(new C12521a(gVar));
        }
    }

    public C12519b1(int i) {
        if (i >= 0) {
            this.f32287f = i;
            return;
        }
        throw new IllegalArgumentException("limit >= 0 required but it was " + i);
    }

    /* renamed from: a */
    public C12475j<? super T> call(C12475j<? super T> jVar) {
        C12520a aVar = new C12520a(jVar);
        if (this.f32287f == 0) {
            jVar.onCompleted();
            aVar.unsubscribe();
        }
        jVar.add(aVar);
        return aVar;
    }
}
