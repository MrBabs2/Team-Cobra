package p120q.p326a.p329d0.p334e.p339e;

import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.p329d0.p333d.C10920b;

/* renamed from: q.a.d0.e.e.k2 */
/* compiled from: ObservableRangeLong */
public final class C11131k2 extends C11482n<Long> {

    /* renamed from: f */
    private final long f29664f;

    /* renamed from: g */
    private final long f29665g;

    /* renamed from: q.a.d0.e.e.k2$a */
    /* compiled from: ObservableRangeLong */
    static final class C11132a extends C10920b<Long> {

        /* renamed from: f */
        final C11490u<? super Long> f29666f;

        /* renamed from: g */
        final long f29667g;

        /* renamed from: h */
        long f29668h;

        /* renamed from: i */
        boolean f29669i;

        C11132a(C11490u<? super Long> uVar, long j, long j2) {
            this.f29666f = uVar;
            this.f29668h = j;
            this.f29667g = j2;
        }

        /* renamed from: a */
        public int mo36665a(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f29669i = true;
            return 1;
        }

        public void clear() {
            this.f29668h = this.f29667g;
            lazySet(1);
        }

        public void dispose() {
            set(1);
        }

        public boolean isDisposed() {
            return get() != 0;
        }

        public boolean isEmpty() {
            return this.f29668h == this.f29667g;
        }

        /* access modifiers changed from: package-private */
        public void run() {
            if (!this.f29669i) {
                C11490u<? super Long> uVar = this.f29666f;
                long j = this.f29667g;
                for (long j2 = this.f29668h; j2 != j && get() == 0; j2++) {
                    uVar.onNext(Long.valueOf(j2));
                }
                if (get() == 0) {
                    lazySet(1);
                    uVar.onComplete();
                }
            }
        }

        public Long poll() throws Exception {
            long j = this.f29668h;
            if (j != this.f29667g) {
                this.f29668h = 1 + j;
                return Long.valueOf(j);
            }
            lazySet(1);
            return null;
        }
    }

    public C11131k2(long j, long j2) {
        this.f29664f = j;
        this.f29665g = j2;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super Long> uVar) {
        long j = this.f29664f;
        C11132a aVar = new C11132a(uVar, j, j + this.f29665g);
        uVar.onSubscribe(aVar);
        aVar.run();
    }
}
