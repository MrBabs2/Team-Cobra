package p112n.p312h.p313a.p315c0;

/* renamed from: n.h.a.c0.b */
/* compiled from: DownloadServiceConnectChangedEvent */
public class C10741b extends C10743c {

    /* renamed from: c */
    private final C10742a f28800c;

    /* renamed from: n.h.a.c0.b$a */
    /* compiled from: DownloadServiceConnectChangedEvent */
    public enum C10742a {
        connected,
        disconnected,
        lost
    }

    public C10741b(C10742a aVar, Class<?> cls) {
        super("event.service.connect.changed");
        this.f28800c = aVar;
    }

    /* renamed from: b */
    public C10742a mo36464b() {
        return this.f28800c;
    }
}
