package p368r.p369a.p370g.p375u;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: r.a.g.u.a */
/* compiled from: NamedThreadFactory */
public class C11686a implements ThreadFactory {

    /* renamed from: f */
    private final ThreadFactory f31249f = Executors.defaultThreadFactory();

    /* renamed from: g */
    private final String f31250g;

    public C11686a(String str) {
        this.f31250g = str;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f31249f.newThread(runnable);
        newThread.setName(this.f31250g + ' ' + newThread.getName());
        return newThread;
    }
}
