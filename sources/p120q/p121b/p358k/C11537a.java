package p120q.p121b.p358k;

import java.util.concurrent.atomic.AtomicInteger;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: q.b.k.a */
/* compiled from: SentryEnvironment */
public final class C11537a {

    /* renamed from: a */
    static final ThreadLocal<AtomicInteger> f30785a = new C11538a();

    /* renamed from: b */
    private static final C12938b f30786b = C12939c.m41777a((Class<?>) C11537a.class);

    /* renamed from: q.b.k.a$a */
    /* compiled from: SentryEnvironment */
    static class C11538a extends ThreadLocal<AtomicInteger> {
        C11538a() {
        }

        /* access modifiers changed from: protected */
        public AtomicInteger initialValue() {
            return new AtomicInteger();
        }
    }

    private C11537a() {
    }

    /* renamed from: a */
    public static String m37698a() {
        return "sentry-java/1.7.29-4a3e2";
    }

    /* renamed from: b */
    public static boolean m37699b() {
        return f30785a.get().get() > 0;
    }

    /* renamed from: c */
    public static void m37700c() {
        try {
            if (m37699b()) {
                f30786b.mo41315c("Thread already managed by Sentry");
            }
        } finally {
            f30785a.get().incrementAndGet();
        }
    }

    /* renamed from: d */
    public static void m37701d() {
        try {
            if (!m37699b()) {
                m37700c();
                f30786b.mo41315c("Thread not yet managed by Sentry");
            }
        } finally {
            if (f30785a.get().decrementAndGet() == 0) {
                f30785a.remove();
            }
        }
    }
}
