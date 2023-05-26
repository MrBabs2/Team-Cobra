package p120q.p326a.p329d0.p342g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: q.a.d0.g.j */
/* compiled from: RxThreadFactory */
public final class C11407j extends AtomicLong implements ThreadFactory {

    /* renamed from: f */
    final String f30568f;

    /* renamed from: g */
    final int f30569g;

    /* renamed from: h */
    final boolean f30570h;

    /* renamed from: q.a.d0.g.j$a */
    /* compiled from: RxThreadFactory */
    static final class C11408a extends Thread implements C11406i {
        C11408a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public C11407j(String str) {
        this(str, 5, false);
    }

    public Thread newThread(Runnable runnable) {
        String str = this.f30568f + '-' + incrementAndGet();
        Thread aVar = this.f30570h ? new C11408a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f30569g);
        aVar.setDaemon(true);
        return aVar;
    }

    public String toString() {
        return "RxThreadFactory[" + this.f30568f + "]";
    }

    public C11407j(String str, int i) {
        this(str, i, false);
    }

    public C11407j(String str, int i, boolean z) {
        this.f30568f = str;
        this.f30569g = i;
        this.f30570h = z;
    }
}
