package p120q.p121b.p362m;

import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: q.b.m.b */
/* compiled from: FrameCache */
public final class C11571b {

    /* renamed from: a */
    private static Set<String> f30903a = new HashSet();

    /* renamed from: b */
    private static ThreadLocal<WeakHashMap<Throwable, C11569a[]>> f30904b = new C11572a();

    /* renamed from: q.b.m.b$a */
    /* compiled from: FrameCache */
    static class C11572a extends ThreadLocal<WeakHashMap<Throwable, C11569a[]>> {
        C11572a() {
        }

        /* access modifiers changed from: protected */
        public WeakHashMap<Throwable, C11569a[]> initialValue() {
            return new WeakHashMap<>();
        }
    }

    /* renamed from: a */
    public static C11569a[] m37845a(Throwable th) {
        return (C11569a[]) f30904b.get().get(th);
    }

    /* renamed from: a */
    public static void m37844a(String str) {
        f30903a.add(str);
    }
}
