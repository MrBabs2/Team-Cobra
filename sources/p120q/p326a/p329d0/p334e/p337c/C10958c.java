package p120q.p326a.p329d0.p334e.p337c;

import p120q.p326a.C11478j;
import p120q.p326a.C11479k;
import p120q.p326a.p327b0.C10843d;
import p120q.p326a.p329d0.p332c.C10916e;

/* renamed from: q.a.d0.e.c.c */
/* compiled from: MaybeJust */
public final class C10958c<T> extends C11478j<T> implements C10916e<T> {

    /* renamed from: f */
    final T f29060f;

    public C10958c(T t) {
        this.f29060f = t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36748b(C11479k<? super T> kVar) {
        kVar.onSubscribe(C10843d.m36748a());
        kVar.onSuccess(this.f29060f);
    }

    public T call() {
        return this.f29060f;
    }
}
