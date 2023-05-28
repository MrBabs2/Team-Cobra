package p123rx.p401n.p402a;

import java.util.concurrent.atomic.AtomicLong;
import p123rx.C12473g;
import p123rx.C12475j;
import p123rx.C5368e;

/* renamed from: rx.n.a.x */
/* compiled from: OnSubscribeRange */
public final class C12679x implements C5368e.C5370a<Integer> {

    /* renamed from: f */
    private final int f32741f;

    /* renamed from: g */
    private final int f32742g;

    public C12679x(int i, int i2) {
        this.f32741f = i;
        this.f32742g = i2;
    }

    /* renamed from: a */
    public void call(C12475j<? super Integer> jVar) {
        jVar.setProducer(new C12680a(jVar, this.f32741f, this.f32742g));
    }

    /* renamed from: rx.n.a.x$a */
    /* compiled from: OnSubscribeRange */
    static final class C12680a extends AtomicLong implements C12473g {

        /* renamed from: f */
        private final C12475j<? super Integer> f32743f;

        /* renamed from: g */
        private final int f32744g;

        /* renamed from: h */
        private long f32745h;

        C12680a(C12475j<? super Integer> jVar, int i, int i2) {
            this.f32743f = jVar;
            this.f32745h = (long) i;
            this.f32744g = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40829a(long j) {
            long j2 = ((long) this.f32744g) + 1;
            long j3 = this.f32745h;
            C12475j<? super Integer> jVar = this.f32743f;
            do {
                long j4 = 0;
                while (true) {
                    if (j4 == j || j3 == j2) {
                        if (!jVar.isUnsubscribed()) {
                            if (j3 == j2) {
                                jVar.onCompleted();
                                return;
                            }
                            j = get();
                            if (j == j4) {
                                this.f32745h = j3;
                                j = addAndGet(-j4);
                            }
                        } else {
                            return;
                        }
                    } else if (!jVar.isUnsubscribed()) {
                        jVar.onNext(Integer.valueOf((int) j3));
                        j3++;
                        j4++;
                    } else {
                        return;
                    }
                }
            } while (j != 0);
        }

        public void request(long j) {
            if (get() != Long.MAX_VALUE) {
                if (j == Long.MAX_VALUE && compareAndSet(0, Long.MAX_VALUE)) {
                    mo40828a();
                } else if (j > 0 && C12502a.m40960a((AtomicLong) this, j) == 0) {
                    mo40829a(j);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40828a() {
            long j = ((long) this.f32744g) + 1;
            C12475j<? super Integer> jVar = this.f32743f;
            long j2 = this.f32745h;
            while (j2 != j) {
                if (!jVar.isUnsubscribed()) {
                    jVar.onNext(Integer.valueOf((int) j2));
                    j2++;
                } else {
                    return;
                }
            }
            if (!jVar.isUnsubscribed()) {
                jVar.onCompleted();
            }
        }
    }
}
