package p123rx.p411q;

import java.util.concurrent.ThreadFactory;
import p123rx.C5373h;
import p123rx.p126m.C5377a;
import p123rx.p401n.p404c.C12708a;
import p123rx.p401n.p404c.C12715b;
import p123rx.p401n.p404c.C12729g;
import p123rx.p401n.p406e.C12773i;

/* renamed from: rx.q.g */
/* compiled from: RxJavaSchedulersHook */
public class C12866g {

    /* renamed from: a */
    private static final C12866g f33090a = new C12866g();

    /* renamed from: a */
    public static C5373h m41448a(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new C12715b(threadFactory);
        }
        throw new NullPointerException("threadFactory == null");
    }

    /* renamed from: b */
    public static C5373h m41449b(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new C12708a(threadFactory);
        }
        throw new NullPointerException("threadFactory == null");
    }

    /* renamed from: c */
    public static C5373h m41450c(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new C12729g(threadFactory);
        }
        throw new NullPointerException("threadFactory == null");
    }

    /* renamed from: d */
    public static C5373h m41451d() {
        return m41448a((ThreadFactory) new C12773i("RxComputationScheduler-"));
    }

    /* renamed from: e */
    public static C5373h m41452e() {
        return m41449b(new C12773i("RxIoScheduler-"));
    }

    /* renamed from: f */
    public static C5373h m41453f() {
        return m41450c(new C12773i("RxNewThreadScheduler-"));
    }

    /* renamed from: g */
    public static C12866g m41454g() {
        return f33090a;
    }

    /* renamed from: a */
    public C5373h mo41073a() {
        return null;
    }

    @Deprecated
    /* renamed from: a */
    public C5377a mo41074a(C5377a aVar) {
        return aVar;
    }

    /* renamed from: b */
    public C5373h mo41075b() {
        return null;
    }

    /* renamed from: c */
    public C5373h mo41076c() {
        return null;
    }
}
