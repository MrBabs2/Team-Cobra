package p120q.p326a.p329d0.p334e.p339e;

import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.p329d0.p333d.C10920b;

/* renamed from: q.a.d0.e.e.j2 */
/* compiled from: ObservableRange */
public final class C11114j2 extends C11482n<Integer> {

    /* renamed from: f */
    private final int f29597f;

    /* renamed from: g */
    private final long f29598g;

    /* renamed from: q.a.d0.e.e.j2$a */
    /* compiled from: ObservableRange */
    static final class C11115a extends C10920b<Integer> {

        /* renamed from: f */
        final C11490u<? super Integer> f29599f;

        /* renamed from: g */
        final long f29600g;

        /* renamed from: h */
        long f29601h;

        /* renamed from: i */
        boolean f29602i;

        C11115a(C11490u<? super Integer> uVar, long j, long j2) {
            this.f29599f = uVar;
            this.f29601h = j;
            this.f29600g = j2;
        }

        /* renamed from: a */
        public int mo36665a(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f29602i = true;
            return 1;
        }

        public void clear() {
            this.f29601h = this.f29600g;
            lazySet(1);
        }

        public void dispose() {
            set(1);
        }

        public boolean isDisposed() {
            return get() != 0;
        }

        public boolean isEmpty() {
            return this.f29601h == this.f29600g;
        }

        /* access modifiers changed from: package-private */
        public void run() {
            if (!this.f29602i) {
                C11490u<? super Integer> uVar = this.f29599f;
                long j = this.f29600g;
                for (long j2 = this.f29601h; j2 != j && get() == 0; j2++) {
                    uVar.onNext(Integer.valueOf((int) j2));
                }
                if (get() == 0) {
                    lazySet(1);
                    uVar.onComplete();
                }
            }
        }

        public Integer poll() throws Exception {
            long j = this.f29601h;
            if (j != this.f29600g) {
                this.f29601h = 1 + j;
                return Integer.valueOf((int) j);
            }
            lazySet(1);
            return null;
        }
    }

    public C11114j2(int i, int i2) {
        this.f29597f = i;
        this.f29598g = ((long) i) + ((long) i2);
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super Integer> uVar) {
        C11115a aVar = new C11115a(uVar, (long) this.f29597f, this.f29598g);
        uVar.onSubscribe(aVar);
        aVar.run();
    }
}
