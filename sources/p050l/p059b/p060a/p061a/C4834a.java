package p050l.p059b.p060a.p061a;

import java.util.concurrent.Executor;

/* renamed from: l.b.a.a.a */
/* compiled from: ArchTaskExecutor */
public class C4834a extends C4839c {

    /* renamed from: c */
    private static volatile C4834a f8283c;

    /* renamed from: d */
    private static final Executor f8284d = new C4836b();

    /* renamed from: a */
    private C4839c f8285a;

    /* renamed from: b */
    private C4839c f8286b;

    /* renamed from: l.b.a.a.a$a */
    /* compiled from: ArchTaskExecutor */
    static class C4835a implements Executor {
        C4835a() {
        }

        public void execute(Runnable runnable) {
            C4834a.m8101c().mo16842b(runnable);
        }
    }

    /* renamed from: l.b.a.a.a$b */
    /* compiled from: ArchTaskExecutor */
    static class C4836b implements Executor {
        C4836b() {
        }

        public void execute(Runnable runnable) {
            C4834a.m8101c().mo16840a(runnable);
        }
    }

    static {
        new C4835a();
    }

    private C4834a() {
        C4837b bVar = new C4837b();
        this.f8286b = bVar;
        this.f8285a = bVar;
    }

    /* renamed from: c */
    public static C4834a m8101c() {
        if (f8283c != null) {
            return f8283c;
        }
        synchronized (C4834a.class) {
            if (f8283c == null) {
                f8283c = new C4834a();
            }
        }
        return f8283c;
    }

    /* renamed from: a */
    public void mo16840a(Runnable runnable) {
        this.f8285a.mo16840a(runnable);
    }

    /* renamed from: b */
    public void mo16842b(Runnable runnable) {
        this.f8285a.mo16842b(runnable);
    }

    /* renamed from: b */
    public static Executor m8100b() {
        return f8284d;
    }

    /* renamed from: a */
    public boolean mo16841a() {
        return this.f8285a.mo16841a();
    }
}
