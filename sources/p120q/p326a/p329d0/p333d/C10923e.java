package p120q.p326a.p329d0.p333d;

/* renamed from: q.a.d0.d.e */
/* compiled from: BlockingFirstObserver */
public final class C10923e<T> extends C10922d<T> {
    public void onError(Throwable th) {
        if (this.f28977f == null) {
            this.f28978g = th;
        }
        countDown();
    }

    public void onNext(T t) {
        if (this.f28977f == null) {
            this.f28977f = t;
            this.f28979h.dispose();
            countDown();
        }
    }
}
