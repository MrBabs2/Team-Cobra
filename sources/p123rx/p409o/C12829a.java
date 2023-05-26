package p123rx.p409o;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.exceptions.C12472a;
import p123rx.p401n.p406e.C12760d;

/* renamed from: rx.o.a */
/* compiled from: BlockingObservable */
public final class C12829a<T> {

    /* renamed from: a */
    private final C5368e<? extends T> f33045a;

    /* renamed from: rx.o.a$a */
    /* compiled from: BlockingObservable */
    class C12830a extends C12475j<T> {

        /* renamed from: f */
        final /* synthetic */ CountDownLatch f33046f;

        /* renamed from: g */
        final /* synthetic */ AtomicReference f33047g;

        /* renamed from: h */
        final /* synthetic */ AtomicReference f33048h;

        C12830a(C12829a aVar, CountDownLatch countDownLatch, AtomicReference atomicReference, AtomicReference atomicReference2) {
            this.f33046f = countDownLatch;
            this.f33047g = atomicReference;
            this.f33048h = atomicReference2;
        }

        public void onCompleted() {
            this.f33046f.countDown();
        }

        public void onError(Throwable th) {
            this.f33047g.set(th);
            this.f33046f.countDown();
        }

        public void onNext(T t) {
            this.f33048h.set(t);
        }
    }

    private C12829a(C5368e<? extends T> eVar) {
        this.f33045a = eVar;
    }

    /* renamed from: b */
    public static <T> C12829a<T> m41381b(C5368e<? extends T> eVar) {
        return new C12829a<>(eVar);
    }

    /* renamed from: a */
    public T mo41034a() {
        return m41380a(this.f33045a.mo18669c());
    }

    /* renamed from: a */
    private T m41380a(C5368e<? extends T> eVar) {
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C12760d.m41253a(countDownLatch, eVar.mo18654a((C12475j<? super Object>) new C12830a(this, countDownLatch, atomicReference2, atomicReference)));
        if (atomicReference2.get() == null) {
            return atomicReference.get();
        }
        C12472a.m40944b((Throwable) atomicReference2.get());
        throw null;
    }
}
