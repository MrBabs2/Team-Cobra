package p123rx.p401n.p406e.p408o;

/* renamed from: rx.n.e.o.l */
/* compiled from: SpmcArrayQueue */
abstract class C12814l<E> extends C12816n<E> {

    /* renamed from: l */
    protected static final long f33037l = C12828z.m41378a(C12814l.class, "consumerIndex");
    private volatile long consumerIndex;

    public C12814l(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final long mo41024b() {
        return this.consumerIndex;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo41025b(long j, long j2) {
        return C12828z.f33043a.compareAndSwapLong(this, f33037l, j, j2);
    }
}
