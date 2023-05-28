package p120q.p326a.p329d0.p333d;

/* renamed from: q.a.d0.d.f */
/* compiled from: BlockingLastObserver */
public final class C10924f<T> extends C10922d<T> {
    public void onError(Throwable th) {
        this.f28977f = null;
        this.f28978g = th;
        countDown();
    }

    public void onNext(T t) {
        this.f28977f = t;
    }
}
