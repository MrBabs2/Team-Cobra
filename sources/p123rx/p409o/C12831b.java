package p123rx.p409o;

import p123rx.C5368e;
import p123rx.C5375k;
import p123rx.p126m.C12492l;
import p123rx.p126m.C5378b;
import p123rx.p401n.p402a.C12569i;
import p123rx.p401n.p402a.C12696z;

/* renamed from: rx.o.b */
/* compiled from: ConnectableObservable */
public abstract class C12831b<T> extends C5368e<T> {
    protected C12831b(C5368e.C5370a<T> aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public C5368e<T> mo41035a(int i, C5378b<? super C5375k> bVar) {
        if (i > 0) {
            return C5368e.m10253b(new C12569i(this, i, bVar));
        }
        mo40814d(bVar);
        return this;
    }

    /* renamed from: c */
    public C5368e<T> mo41036c(int i) {
        return mo41035a(i, C12492l.m40956a());
    }

    /* renamed from: d */
    public abstract void mo40814d(C5378b<? super C5375k> bVar);

    /* renamed from: o */
    public C5368e<T> mo41037o() {
        return mo41036c(1);
    }

    /* renamed from: p */
    public C5368e<T> mo41038p() {
        return C5368e.m10253b(new C12696z(this));
    }
}
