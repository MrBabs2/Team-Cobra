package p120q.p326a.p329d0.p334e.p339e;

import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p328c0.C10847a;
import p120q.p326a.p328c0.C10853g;
import p120q.p326a.p329d0.p333d.C10928j;

/* renamed from: q.a.d0.e.e.o0 */
/* compiled from: ObservableDoOnLifecycle */
public final class C11199o0<T> extends C10980a<T, T> {

    /* renamed from: g */
    private final C10853g<? super C10842c> f29867g;

    /* renamed from: h */
    private final C10847a f29868h;

    public C11199o0(C11482n<T> nVar, C10853g<? super C10842c> gVar, C10847a aVar) {
        super(nVar);
        this.f29867g = gVar;
        this.f29868h = aVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29150f.subscribe(new C10928j(uVar, this.f29867g, this.f29868h));
    }
}
