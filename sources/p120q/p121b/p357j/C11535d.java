package p120q.p121b.p357j;

/* renamed from: q.b.j.d */
/* compiled from: ThreadLocalContextManager */
public class C11535d implements C11533b {

    /* renamed from: a */
    private final ThreadLocal<C11532a> f30784a = new C11536a(this);

    /* renamed from: q.b.j.d$a */
    /* compiled from: ThreadLocalContextManager */
    class C11536a extends ThreadLocal<C11532a> {
        C11536a(C11535d dVar) {
        }

        /* access modifiers changed from: protected */
        public C11532a initialValue() {
            return new C11532a();
        }
    }

    public C11532a getContext() {
        return this.f30784a.get();
    }
}
