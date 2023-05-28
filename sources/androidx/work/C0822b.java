package androidx.work;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: androidx.work.b */
/* compiled from: Configuration */
public final class C0822b {

    /* renamed from: a */
    private final Executor f2947a;

    /* renamed from: b */
    private final Executor f2948b;

    /* renamed from: c */
    private final C0978s f2949c;

    /* renamed from: d */
    private final int f2950d;

    /* renamed from: e */
    private final int f2951e;

    /* renamed from: f */
    private final int f2952f;

    /* renamed from: g */
    private final int f2953g;

    /* renamed from: androidx.work.b$a */
    /* compiled from: Configuration */
    public static final class C0823a {

        /* renamed from: a */
        Executor f2954a;

        /* renamed from: b */
        C0978s f2955b;

        /* renamed from: c */
        Executor f2956c;

        /* renamed from: d */
        int f2957d = 4;

        /* renamed from: e */
        int f2958e = 0;

        /* renamed from: f */
        int f2959f = Integer.MAX_VALUE;

        /* renamed from: g */
        int f2960g = 20;

        /* renamed from: a */
        public C0823a mo4681a(C0978s sVar) {
            this.f2955b = sVar;
            return this;
        }

        /* renamed from: a */
        public C0823a mo4680a(int i) {
            this.f2957d = i;
            return this;
        }

        /* renamed from: a */
        public C0822b mo4682a() {
            return new C0822b(this);
        }
    }

    /* renamed from: androidx.work.b$b */
    /* compiled from: Configuration */
    public interface C0824b {
        /* renamed from: a */
        C0822b mo4683a();
    }

    C0822b(C0823a aVar) {
        Executor executor = aVar.f2954a;
        if (executor == null) {
            this.f2947a = m3664h();
        } else {
            this.f2947a = executor;
        }
        Executor executor2 = aVar.f2956c;
        if (executor2 == null) {
            this.f2948b = m3664h();
        } else {
            this.f2948b = executor2;
        }
        C0978s sVar = aVar.f2955b;
        if (sVar == null) {
            this.f2949c = C0978s.getDefaultWorkerFactory();
        } else {
            this.f2949c = sVar;
        }
        this.f2950d = aVar.f2957d;
        this.f2951e = aVar.f2958e;
        this.f2952f = aVar.f2959f;
        this.f2953g = aVar.f2960g;
    }

    /* renamed from: h */
    private Executor m3664h() {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
    }

    /* renamed from: a */
    public Executor mo4673a() {
        return this.f2947a;
    }

    /* renamed from: b */
    public int mo4674b() {
        return this.f2952f;
    }

    /* renamed from: c */
    public int mo4675c() {
        if (Build.VERSION.SDK_INT == 23) {
            return this.f2953g / 2;
        }
        return this.f2953g;
    }

    /* renamed from: d */
    public int mo4676d() {
        return this.f2951e;
    }

    /* renamed from: e */
    public int mo4677e() {
        return this.f2950d;
    }

    /* renamed from: f */
    public Executor mo4678f() {
        return this.f2948b;
    }

    /* renamed from: g */
    public C0978s mo4679g() {
        return this.f2949c;
    }
}
