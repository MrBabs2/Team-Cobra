package p123rx.p412r;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p123rx.C12474i;
import p123rx.Single;
import p123rx.exceptions.C12472a;
import p123rx.p401n.p406e.C12760d;

/* renamed from: rx.r.a */
/* compiled from: BlockingSingle */
public final class C12869a<T> {

    /* renamed from: a */
    private final Single<? extends T> f33092a;

    /* renamed from: rx.r.a$a */
    /* compiled from: BlockingSingle */
    class C12870a extends C12474i<T> {

        /* renamed from: g */
        final /* synthetic */ AtomicReference f33093g;

        /* renamed from: h */
        final /* synthetic */ CountDownLatch f33094h;

        /* renamed from: i */
        final /* synthetic */ AtomicReference f33095i;

        C12870a(C12869a aVar, AtomicReference atomicReference, CountDownLatch countDownLatch, AtomicReference atomicReference2) {
            this.f33093g = atomicReference;
            this.f33094h = countDownLatch;
            this.f33095i = atomicReference2;
        }

        /* renamed from: a */
        public void mo18573a(T t) {
            this.f33093g.set(t);
            this.f33094h.countDown();
        }

        public void onError(Throwable th) {
            this.f33095i.set(th);
            this.f33094h.countDown();
        }
    }

    private C12869a(Single<? extends T> single) {
        this.f33092a = single;
    }

    /* renamed from: a */
    public static <T> C12869a<T> m41465a(Single<? extends T> single) {
        return new C12869a<>(single);
    }

    /* renamed from: a */
    public T mo41082a() {
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C12760d.m41253a(countDownLatch, this.f33092a.mo18560a(new C12870a(this, atomicReference, countDownLatch, atomicReference2)));
        Throwable th = (Throwable) atomicReference2.get();
        if (th == null) {
            return atomicReference.get();
        }
        C12472a.m40944b(th);
        throw null;
    }
}
