package p123rx.p124l.p400b;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rx.l.b.a */
/* compiled from: RxAndroidPlugins */
public final class C12478a {

    /* renamed from: b */
    private static final C12478a f32234b = new C12478a();

    /* renamed from: a */
    private final AtomicReference<C12479b> f32235a = new AtomicReference<>();

    C12478a() {
    }

    /* renamed from: b */
    public static C12478a m40948b() {
        return f32234b;
    }

    /* renamed from: a */
    public C12479b mo40659a() {
        if (this.f32235a.get() == null) {
            this.f32235a.compareAndSet((Object) null, C12479b.m40950b());
        }
        return this.f32235a.get();
    }
}
