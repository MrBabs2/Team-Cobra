package p123rx.p401n.p406e.p408o;

import p123rx.p401n.p406e.p407n.C12797c;

/* renamed from: rx.n.e.o.b */
/* compiled from: BaseLinkedQueue */
abstract class C12804b<E> extends C12806d<E> {

    /* renamed from: g */
    protected static final long f33030g = C12828z.m41378a(C12804b.class, "consumerNode");
    protected C12797c<E> consumerNode;

    C12804b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41002a(C12797c<E> cVar) {
        this.consumerNode = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C12797c<E> mo41003b() {
        return this.consumerNode;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C12797c<E> mo41004c() {
        return (C12797c) C12828z.f33043a.getObjectVolatile(this, f33030g);
    }
}
