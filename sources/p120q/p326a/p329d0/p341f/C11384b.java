package p120q.p326a.p329d0.p341f;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p120q.p326a.p329d0.p332c.C10917f;
import p120q.p326a.p329d0.p345j.C11444p;

/* renamed from: q.a.d0.f.b */
/* compiled from: SpscArrayQueue */
public final class C11384b<E> extends AtomicReferenceArray<E> implements C10917f<E> {

    /* renamed from: k */
    private static final Integer f30484k = Integer.getInteger("jctools.spsc.max.lookahead.step", RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT);

    /* renamed from: f */
    final int f30485f = (length() - 1);

    /* renamed from: g */
    final AtomicLong f30486g = new AtomicLong();

    /* renamed from: h */
    long f30487h;

    /* renamed from: i */
    final AtomicLong f30488i = new AtomicLong();

    /* renamed from: j */
    final int f30489j;

    public C11384b(int i) {
        super(C11444p.m37496a(i));
        this.f30489j = Math.min(i / 4, f30484k.intValue());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo37102a(long j) {
        return this.f30485f & ((int) j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo37103a(long j, int i) {
        return ((int) j) & i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo37106b(long j) {
        this.f30488i.lazySet(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo37107c(long j) {
        this.f30486g.lazySet(j);
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public boolean isEmpty() {
        return this.f30486g.get() == this.f30488i.get();
    }

    public boolean offer(E e) {
        if (e != null) {
            int i = this.f30485f;
            long j = this.f30486g.get();
            int a = mo37103a(j, i);
            if (j >= this.f30487h) {
                long j2 = ((long) this.f30489j) + j;
                if (mo37105b(mo37103a(j2, i)) == null) {
                    this.f30487h = j2;
                } else if (mo37105b(a) != null) {
                    return false;
                }
            }
            mo37104a(a, e);
            mo37107c(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public E poll() {
        long j = this.f30488i.get();
        int a = mo37102a(j);
        E b = mo37105b(a);
        if (b == null) {
            return null;
        }
        mo37106b(j + 1);
        mo37104a(a, (Object) null);
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo37104a(int i, E e) {
        lazySet(i, e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public E mo37105b(int i) {
        return get(i);
    }
}
