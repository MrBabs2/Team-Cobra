package kotlin.p045h0.p046u.p047e.p048k0.p379j;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: kotlin.h0.u.e.k0.j.e */
/* compiled from: NoLock */
class C11813e implements Lock {

    /* renamed from: f */
    public static final Lock f31519f = new C11813e();

    private C11813e() {
    }

    /* renamed from: a */
    private static /* synthetic */ void m38874a(int i) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"unit", "kotlin/reflect/jvm/internal/impl/storage/NoLock", "tryLock"}));
    }

    public void lock() {
    }

    public void lockInterruptibly() throws InterruptedException {
        throw new UnsupportedOperationException("Should not be called");
    }

    public Condition newCondition() {
        throw new UnsupportedOperationException("Should not be called");
    }

    public boolean tryLock() {
        throw new UnsupportedOperationException("Should not be called");
    }

    public void unlock() {
    }

    public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
        if (timeUnit == null) {
            m38874a(0);
            throw null;
        }
        throw new UnsupportedOperationException("Should not be called");
    }
}
