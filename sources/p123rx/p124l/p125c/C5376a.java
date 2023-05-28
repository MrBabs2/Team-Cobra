package p123rx.p124l.p125c;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;
import p123rx.C5373h;
import p123rx.p124l.p400b.C12478a;

/* renamed from: rx.l.c.a */
/* compiled from: AndroidSchedulers */
public final class C5376a {

    /* renamed from: b */
    private static final AtomicReference<C5376a> f9637b = new AtomicReference<>();

    /* renamed from: a */
    private final C5373h f9638a;

    private C5376a() {
        C5373h a = C12478a.m40948b().mo40659a().mo40660a();
        if (a != null) {
            this.f9638a = a;
        } else {
            this.f9638a = new C12480b(Looper.getMainLooper());
        }
    }

    /* renamed from: a */
    private static C5376a m10345a() {
        C5376a aVar;
        do {
            C5376a aVar2 = f9637b.get();
            if (aVar2 != null) {
                return aVar2;
            }
            aVar = new C5376a();
        } while (!f9637b.compareAndSet((Object) null, aVar));
        return aVar;
    }

    /* renamed from: b */
    public static C5373h m10346b() {
        return m10345a().f9638a;
    }
}
