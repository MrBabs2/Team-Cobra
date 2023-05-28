package p123rx.p401n.p402a;

import java.util.concurrent.atomic.AtomicInteger;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5375k;
import p123rx.p126m.C5378b;
import p123rx.p409o.C12831b;
import p123rx.p410p.C12839f;

/* renamed from: rx.n.a.i */
/* compiled from: OnSubscribeAutoConnect */
public final class C12569i<T> extends AtomicInteger implements C5368e.C5370a<T> {

    /* renamed from: f */
    final C12831b<? extends T> f32406f;

    /* renamed from: g */
    final int f32407g;

    /* renamed from: h */
    final C5378b<? super C5375k> f32408h;

    public C12569i(C12831b<? extends T> bVar, int i, C5378b<? super C5375k> bVar2) {
        if (i > 0) {
            this.f32406f = bVar;
            this.f32407g = i;
            this.f32408h = bVar2;
            return;
        }
        throw new IllegalArgumentException("numberOfSubscribers > 0 required");
    }

    /* renamed from: a */
    public void call(C12475j<? super T> jVar) {
        this.f32406f.mo18668b(C12839f.m41394a(jVar));
        if (incrementAndGet() == this.f32407g) {
            this.f32406f.mo40814d(this.f32408h);
        }
    }
}
