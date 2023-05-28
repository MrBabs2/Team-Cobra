package p123rx.p401n.p406e.p408o;

import p123rx.p401n.p406e.p407n.C12797c;

/* renamed from: rx.n.e.o.e */
/* compiled from: BaseLinkedQueue */
abstract class C12807e<E> extends C12805c<E> {

    /* renamed from: f */
    protected static final long f33031f = C12828z.m41378a(C12807e.class, "producerNode");
    protected C12797c<E> producerNode;

    C12807e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C12797c<E> mo41005a() {
        return (C12797c) C12828z.f33043a.getObjectVolatile(this, f33031f);
    }
}
