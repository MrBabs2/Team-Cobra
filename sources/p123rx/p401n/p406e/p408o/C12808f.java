package p123rx.p401n.p406e.p408o;

import java.util.Iterator;

/* renamed from: rx.n.e.o.f */
/* compiled from: ConcurrentCircularArrayQueue */
public abstract class C12808f<E> extends C12809g<E> {

    /* renamed from: h */
    protected static final int f33032h = Integer.getInteger("sparse.shift", 0).intValue();

    /* renamed from: i */
    private static final long f33033i;

    /* renamed from: j */
    private static final int f33034j;

    /* renamed from: f */
    protected final long f33035f;

    /* renamed from: g */
    protected final E[] f33036g;

    static {
        Class<Object[]> cls = Object[].class;
        int arrayIndexScale = C12828z.f33043a.arrayIndexScale(cls);
        if (4 == arrayIndexScale) {
            f33034j = f33032h + 2;
        } else if (8 == arrayIndexScale) {
            f33034j = f33032h + 3;
        } else {
            throw new IllegalStateException("Unknown pointer size");
        }
        f33033i = (long) (C12828z.f33043a.arrayBaseOffset(cls) + (32 << (f33034j - f33032h)));
    }

    public C12808f(int i) {
        int b = C12812j.m41367b(i);
        this.f33035f = (long) (b - 1);
        this.f33036g = new Object[((b << f33032h) + 64)];
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo41006a(long j) {
        return mo41007a(j, this.f33035f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo41012b(E[] eArr, long j, E e) {
        C12828z.f33043a.putObject(eArr, j, e);
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo41007a(long j, long j2) {
        return f33033i + ((j & j2) << f33034j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final E mo41010b(long j) {
        return mo41011b(this.f33036g, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41009a(E[] eArr, long j, E e) {
        C12828z.f33043a.putOrderedObject(eArr, j, e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final E mo41011b(E[] eArr, long j) {
        return C12828z.f33043a.getObjectVolatile(eArr, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final E mo41008a(E[] eArr, long j) {
        return C12828z.f33043a.getObject(eArr, j);
    }
}
