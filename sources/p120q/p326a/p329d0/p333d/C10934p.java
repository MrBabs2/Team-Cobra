package p120q.p326a.p329d0.p333d;

import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p332c.C10917f;
import p120q.p326a.p329d0.p345j.C11442n;
import p120q.p326a.p329d0.p345j.C11445q;

/* renamed from: q.a.d0.d.p */
/* compiled from: QueueDrainObserver */
public abstract class C10934p<T, U, V> extends C10936r implements C11490u<T>, C11442n<U, V> {

    /* renamed from: g */
    protected final C11490u<? super V> f29009g;

    /* renamed from: h */
    protected final C10917f<U> f29010h;

    /* renamed from: i */
    protected volatile boolean f29011i;

    /* renamed from: j */
    protected volatile boolean f29012j;

    /* renamed from: k */
    protected Throwable f29013k;

    public C10934p(C11490u<? super V> uVar, C10917f<U> fVar) {
        this.f29009g = uVar;
        this.f29010h = fVar;
    }

    /* renamed from: a */
    public void mo36731a(C11490u<? super V> uVar, U u) {
    }

    /* renamed from: a */
    public final boolean mo36732a() {
        return this.f29012j;
    }

    /* renamed from: b */
    public final boolean mo36734b() {
        return this.f29011i;
    }

    /* renamed from: c */
    public final Throwable mo36735c() {
        return this.f29013k;
    }

    /* renamed from: d */
    public final boolean mo36736d() {
        return this.f29014f.getAndIncrement() == 0;
    }

    /* renamed from: e */
    public final boolean mo36737e() {
        return this.f29014f.get() == 0 && this.f29014f.compareAndSet(0, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36730a(U u, boolean z, C10842c cVar) {
        C11490u<? super V> uVar = this.f29009g;
        C10917f<U> fVar = this.f29010h;
        if (this.f29014f.get() != 0 || !this.f29014f.compareAndSet(0, 1)) {
            fVar.offer(u);
            if (!mo36736d()) {
                return;
            }
        } else {
            mo36731a(uVar, u);
            if (mo36729a(-1) == 0) {
                return;
            }
        }
        C11445q.m37498a(fVar, uVar, z, cVar, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo36733b(U u, boolean z, C10842c cVar) {
        C11490u<? super V> uVar = this.f29009g;
        C10917f<U> fVar = this.f29010h;
        if (this.f29014f.get() != 0 || !this.f29014f.compareAndSet(0, 1)) {
            fVar.offer(u);
            if (!mo36736d()) {
                return;
            }
        } else if (fVar.isEmpty()) {
            mo36731a(uVar, u);
            if (mo36729a(-1) == 0) {
                return;
            }
        } else {
            fVar.offer(u);
        }
        C11445q.m37498a(fVar, uVar, z, cVar, this);
    }

    /* renamed from: a */
    public final int mo36729a(int i) {
        return this.f29014f.addAndGet(i);
    }
}
