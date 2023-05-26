package p120q.p326a.p329d0.p330a;

import p120q.p326a.C10863d;
import p120q.p326a.C11479k;
import p120q.p326a.C11490u;
import p120q.p326a.C11498y;
import p120q.p326a.p329d0.p332c.C10913b;

/* renamed from: q.a.d0.a.e */
/* compiled from: EmptyDisposable */
public enum C10868e implements C10913b<Object> {
    INSTANCE,
    NEVER;

    /* renamed from: a */
    public static void m36785a(C11490u<?> uVar) {
        uVar.onSubscribe(INSTANCE);
        uVar.onComplete();
    }

    /* renamed from: a */
    public int mo36665a(int i) {
        return i & 2;
    }

    public void clear() {
    }

    public void dispose() {
    }

    public boolean isDisposed() {
        return this == INSTANCE;
    }

    public boolean isEmpty() {
        return true;
    }

    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public Object poll() throws Exception {
        return null;
    }

    /* renamed from: a */
    public static void m36784a(C11479k<?> kVar) {
        kVar.onSubscribe(INSTANCE);
        kVar.onComplete();
    }

    /* renamed from: a */
    public static void m36781a(Throwable th, C11490u<?> uVar) {
        uVar.onSubscribe(INSTANCE);
        uVar.onError(th);
    }

    /* renamed from: a */
    public static void m36783a(C10863d dVar) {
        dVar.onSubscribe(INSTANCE);
        dVar.onComplete();
    }

    /* renamed from: a */
    public static void m36780a(Throwable th, C10863d dVar) {
        dVar.onSubscribe(INSTANCE);
        dVar.onError(th);
    }

    /* renamed from: a */
    public static void m36782a(Throwable th, C11498y<?> yVar) {
        yVar.onSubscribe(INSTANCE);
        yVar.onError(th);
    }
}
