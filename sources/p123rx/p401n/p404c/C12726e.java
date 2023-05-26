package p123rx.p401n.p404c;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import p123rx.p126m.C12495m;
import p123rx.p401n.p406e.C12773i;
import p123rx.p411q.C12844c;

/* renamed from: rx.n.c.e */
/* compiled from: GenericScheduledExecutorServiceFactory */
enum C12726e {
    ;
    

    /* renamed from: f */
    static final C12773i f32874f = null;

    static {
        f32874f = new C12773i("RxScheduledExecutorPool-");
    }

    /* renamed from: a */
    public static ScheduledExecutorService m41210a() {
        C12495m<? extends ScheduledExecutorService> a = C12844c.m41413a();
        if (a == null) {
            return m41211d();
        }
        return (ScheduledExecutorService) a.call();
    }

    /* renamed from: d */
    static ScheduledExecutorService m41211d() {
        return Executors.newScheduledThreadPool(1, m41212e());
    }

    /* renamed from: e */
    static ThreadFactory m41212e() {
        return f32874f;
    }
}
