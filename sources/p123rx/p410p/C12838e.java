package p123rx.p410p;

import p123rx.C12475j;
import p123rx.C5372f;

/* renamed from: rx.p.e */
/* compiled from: SerializedSubscriber */
public class C12838e<T> extends C12475j<T> {

    /* renamed from: f */
    private final C5372f<T> f33061f;

    public C12838e(C12475j<? super T> jVar) {
        this(jVar, true);
    }

    public void onCompleted() {
        this.f33061f.onCompleted();
    }

    public void onError(Throwable th) {
        this.f33061f.onError(th);
    }

    public void onNext(T t) {
        this.f33061f.onNext(t);
    }

    public C12838e(C12475j<? super T> jVar, boolean z) {
        super(jVar, z);
        this.f33061f = new C12836d(jVar);
    }
}
