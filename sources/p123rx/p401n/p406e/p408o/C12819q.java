package p123rx.p401n.p406e.p408o;

/* renamed from: rx.n.e.o.q */
/* compiled from: SpmcArrayQueue */
abstract class C12819q<E> extends C12815m<E> {

    /* renamed from: k */
    protected static final long f33038k = C12828z.m41378a(C12819q.class, "producerIndex");
    private volatile long producerIndex;

    public C12819q(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo41026a() {
        return this.producerIndex;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo41027c(long j) {
        C12828z.f33043a.putOrderedLong(this, f33038k, j);
    }
}
