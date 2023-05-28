package kotlin.p045h0.p046u.p047e.p048k0.p379j;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C10483v;
import kotlin.p215c0.p216c.C9102a;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.utils.C12149c;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;

/* renamed from: kotlin.h0.u.e.k0.j.b */
/* compiled from: LockBasedStorageManager */
public class C11795b implements C11817i {

    /* renamed from: d */
    private static final String f31496d = C12131w.m40112d(C11795b.class.getCanonicalName(), ".", "");

    /* renamed from: e */
    public static final C11817i f31497e = new C11796a("NO_LOCKS", C11802f.f31504a, C11813e.f31519f);

    /* renamed from: a */
    protected final Lock f31498a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C11802f f31499b;

    /* renamed from: c */
    private final String f31500c;

    /* renamed from: kotlin.h0.u.e.k0.j.b$a */
    /* compiled from: LockBasedStorageManager */
    static class C11796a extends C11795b {
        C11796a(String str, C11802f fVar, Lock lock) {
            super(str, fVar, lock, (C11796a) null);
        }

        /* renamed from: a */
        private static /* synthetic */ void m38845a(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", new Object[]{"kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1", "recursionDetectedDefault"}));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public <T> C11810m<T> mo38405b() {
            C11810m<T> c = C11810m.m38871c();
            if (c != null) {
                return c;
            }
            m38845a(0);
            throw null;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.j.b$b */
    /* compiled from: LockBasedStorageManager */
    class C11797b extends C11806i<T> {

        /* renamed from: i */
        final /* synthetic */ Object f31501i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11797b(C11795b bVar, C11795b bVar2, C9102a aVar, Object obj) {
            super(bVar2, aVar);
            this.f31501i = obj;
        }

        /* renamed from: a */
        private static /* synthetic */ void m38847a(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", new Object[]{"kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$2", "recursionDetected"}));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C11810m<T> mo38410a(boolean z) {
            C11810m<T> a = C11810m.m38870a(this.f31501i);
            if (a != null) {
                return a;
            }
            m38847a(0);
            throw null;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.j.b$d */
    /* compiled from: LockBasedStorageManager */
    private static class C11799d<K, V> extends C11800e<K, V> implements C11794a<K, V> {
        /* synthetic */ C11799d(C11795b bVar, ConcurrentMap concurrentMap, C11796a aVar) {
            this(bVar, concurrentMap);
        }

        /* renamed from: a */
        private static /* synthetic */ void m38852a(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 3 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "computation";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 3 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        /* renamed from: a */
        public V mo38397a(K k, C9102a<? extends V> aVar) {
            if (aVar != null) {
                V a = super.mo38397a(k, aVar);
                if (a != null) {
                    return a;
                }
                m38852a(3);
                throw null;
            }
            m38852a(2);
            throw null;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private C11799d(C11795b bVar, ConcurrentMap<C11804g<K, V>, Object> concurrentMap) {
            super(bVar, concurrentMap, (C11796a) null);
            if (bVar == null) {
                m38852a(0);
                throw null;
            } else if (concurrentMap != null) {
            } else {
                m38852a(1);
                throw null;
            }
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.j.b$e */
    /* compiled from: LockBasedStorageManager */
    private static class C11800e<K, V> extends C11807j<C11804g<K, V>, V> {

        /* renamed from: kotlin.h0.u.e.k0.j.b$e$a */
        /* compiled from: LockBasedStorageManager */
        class C11801a implements C9113l<C11804g<K, V>, V> {
            C11801a() {
            }

            /* renamed from: a */
            public V invoke(C11804g<K, V> gVar) {
                return gVar.f31506b.invoke();
            }
        }

        /* synthetic */ C11800e(C11795b bVar, ConcurrentMap concurrentMap, C11796a aVar) {
            this(bVar, concurrentMap);
        }

        /* renamed from: a */
        private static /* synthetic */ void m38854a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public V mo38397a(K k, C9102a<? extends V> aVar) {
            if (aVar != null) {
                return invoke(new C11804g(k, aVar));
            }
            m38854a(2);
            throw null;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private C11800e(C11795b bVar, ConcurrentMap<C11804g<K, V>, Object> concurrentMap) {
            super(bVar, concurrentMap, new C11801a());
            if (bVar == null) {
                m38854a(0);
                throw null;
            } else if (concurrentMap != null) {
            } else {
                m38854a(1);
                throw null;
            }
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.j.b$f */
    /* compiled from: LockBasedStorageManager */
    public interface C11802f {

        /* renamed from: a */
        public static final C11802f f31504a = new C11803a();

        /* renamed from: kotlin.h0.u.e.k0.j.b$f$a */
        /* compiled from: LockBasedStorageManager */
        static class C11803a implements C11802f {
            C11803a() {
            }

            /* renamed from: a */
            private static /* synthetic */ void m38858a(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"}));
            }

            /* renamed from: a */
            public RuntimeException mo38413a(Throwable th) {
                if (th == null) {
                    m38858a(0);
                    throw null;
                }
                C12149c.m40154b(th);
                throw null;
            }
        }

        /* renamed from: a */
        RuntimeException mo38413a(Throwable th);
    }

    /* renamed from: kotlin.h0.u.e.k0.j.b$g */
    /* compiled from: LockBasedStorageManager */
    private static class C11804g<K, V> {

        /* renamed from: a */
        private final K f31505a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C9102a<? extends V> f31506b;

        public C11804g(K k, C9102a<? extends V> aVar) {
            this.f31505a = k;
            this.f31506b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && C11804g.class == obj.getClass() && this.f31505a.equals(((C11804g) obj).f31505a);
        }

        public int hashCode() {
            return this.f31505a.hashCode();
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.j.b$h */
    /* compiled from: LockBasedStorageManager */
    private static class C11805h<T> implements C11815g<T> {

        /* renamed from: f */
        private final C11795b f31507f;

        /* renamed from: g */
        private final C9102a<? extends T> f31508g;

        /* renamed from: h */
        private volatile Object f31509h;

        public C11805h(C11795b bVar, C9102a<? extends T> aVar) {
            if (bVar == null) {
                m38861a(0);
                throw null;
            } else if (aVar != null) {
                this.f31509h = C11809l.NOT_COMPUTED;
                this.f31507f = bVar;
                this.f31508g = aVar;
            } else {
                m38861a(1);
                throw null;
            }
        }

        /* renamed from: a */
        private static /* synthetic */ void m38861a(int i) {
            String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 2 || i == 3) ? 2 : 3)];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i == 2 || i == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 2) {
                objArr[1] = "recursionDetected";
            } else if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (!(i == 2 || i == 3)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw ((i == 2 || i == 3) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo38411a(T t) {
        }

        /* renamed from: a */
        public boolean mo38416a() {
            return (this.f31509h == C11809l.NOT_COMPUTED || this.f31509h == C11809l.COMPUTING) ? false : true;
        }

        public T invoke() {
            T t = this.f31509h;
            if (!(t instanceof C11809l)) {
                WrappedValues.m40127d(t);
                return t;
            }
            this.f31507f.f31498a.lock();
            try {
                T t2 = this.f31509h;
                if (!(t2 instanceof C11809l)) {
                    WrappedValues.m40127d(t2);
                } else {
                    if (t2 == C11809l.COMPUTING) {
                        this.f31509h = C11809l.RECURSION_WAS_DETECTED;
                        C11810m a = mo38410a(true);
                        if (!a.mo38418b()) {
                            t2 = a.mo38417a();
                        }
                    }
                    if (t2 == C11809l.RECURSION_WAS_DETECTED) {
                        C11810m a2 = mo38410a(false);
                        if (!a2.mo38418b()) {
                            t2 = a2.mo38417a();
                        }
                    }
                    this.f31509h = C11809l.COMPUTING;
                    t2 = this.f31508g.invoke();
                    this.f31509h = t2;
                    mo38411a(t2);
                }
                this.f31507f.f31498a.unlock();
                return t2;
            } catch (Throwable th) {
                this.f31507f.f31498a.unlock();
                throw th;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C11810m<T> mo38410a(boolean z) {
            C11810m<T> b = this.f31507f.mo38405b();
            if (b != null) {
                return b;
            }
            m38861a(2);
            throw null;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.j.b$i */
    /* compiled from: LockBasedStorageManager */
    private static class C11806i<T> extends C11805h<T> implements C11814f<T> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11806i(C11795b bVar, C9102a<? extends T> aVar) {
            super(bVar, aVar);
            if (bVar == null) {
                m38865a(0);
                throw null;
            } else if (aVar != null) {
            } else {
                m38865a(1);
                throw null;
            }
        }

        /* renamed from: a */
        private static /* synthetic */ void m38865a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 2 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public T invoke() {
            T invoke = super.invoke();
            if (invoke != null) {
                return invoke;
            }
            m38865a(2);
            throw null;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.j.b$j */
    /* compiled from: LockBasedStorageManager */
    private static class C11807j<K, V> implements C11812d<K, V> {

        /* renamed from: f */
        private final C11795b f31510f;

        /* renamed from: g */
        private final ConcurrentMap<K, Object> f31511g;

        /* renamed from: h */
        private final C9113l<? super K, ? extends V> f31512h;

        public C11807j(C11795b bVar, ConcurrentMap<K, Object> concurrentMap, C9113l<? super K, ? extends V> lVar) {
            if (bVar == null) {
                m38867a(0);
                throw null;
            } else if (concurrentMap == null) {
                m38867a(1);
                throw null;
            } else if (lVar != null) {
                this.f31510f = bVar;
                this.f31511g = concurrentMap;
                this.f31512h = lVar;
            } else {
                m38867a(2);
                throw null;
            }
        }

        /* renamed from: a */
        private AssertionError m38866a(K k) {
            AssertionError assertionError = new AssertionError("Recursion detected on input: " + k + " under " + this.f31510f);
            Throwable unused = C11795b.m38832b(assertionError);
            return assertionError;
        }

        /* renamed from: a */
        private static /* synthetic */ void m38867a(int i) {
            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 3 || i == 4) ? 2 : 3)];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i == 3 || i == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 3) {
                objArr[1] = "recursionDetected";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (!(i == 3 || i == 4)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw ((i == 3 || i == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* renamed from: b */
        private AssertionError m38868b(K k, Object obj) {
            AssertionError assertionError = new AssertionError("Race condition detected on input " + k + ". Old value is " + obj + " under " + this.f31510f);
            Throwable unused = C11795b.m38832b(assertionError);
            return assertionError;
        }

        public V invoke(K k) {
            AssertionError assertionError;
            Object obj = this.f31511g.get(k);
            if (obj != null && obj != C11809l.COMPUTING) {
                return WrappedValues.m40125b(obj);
            }
            this.f31510f.f31498a.lock();
            try {
                Object obj2 = this.f31511g.get(k);
                if (obj2 == C11809l.COMPUTING) {
                    throw m38866a(k);
                } else if (obj2 != null) {
                    return WrappedValues.m40125b(obj2);
                } else {
                    try {
                        this.f31511g.put(k, C11809l.COMPUTING);
                        V invoke = this.f31512h.invoke(k);
                        Object put = this.f31511g.put(k, WrappedValues.m40122a(invoke));
                        if (put == C11809l.COMPUTING) {
                            this.f31510f.f31498a.unlock();
                            return invoke;
                        }
                        assertionError = m38868b(k, put);
                        try {
                            throw assertionError;
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        assertionError = null;
                        if (C12149c.m40153a(th)) {
                            this.f31511g.remove(k);
                            throw ((RuntimeException) th);
                        } else if (th != assertionError) {
                            Object put2 = this.f31511g.put(k, WrappedValues.m40123a((Throwable) th));
                            if (put2 != C11809l.COMPUTING) {
                                throw m38868b(k, put2);
                            }
                            this.f31510f.f31499b.mo38413a(th);
                            throw null;
                        } else {
                            this.f31510f.f31499b.mo38413a(th);
                            throw null;
                        }
                    }
                }
            } finally {
                this.f31510f.f31498a.unlock();
            }
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.j.b$k */
    /* compiled from: LockBasedStorageManager */
    private static class C11808k<K, V> extends C11807j<K, V> implements C11811c<K, V> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11808k(C11795b bVar, ConcurrentMap<K, Object> concurrentMap, C9113l<? super K, ? extends V> lVar) {
            super(bVar, concurrentMap, lVar);
            if (bVar == null) {
                m38869a(0);
                throw null;
            } else if (concurrentMap == null) {
                m38869a(1);
                throw null;
            } else if (lVar != null) {
            } else {
                m38869a(2);
                throw null;
            }
        }

        /* renamed from: a */
        private static /* synthetic */ void m38869a(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 3 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 3 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public V invoke(K k) {
            V invoke = super.invoke(k);
            if (invoke != null) {
                return invoke;
            }
            m38869a(3);
            throw null;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.j.b$l */
    /* compiled from: LockBasedStorageManager */
    private enum C11809l {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* renamed from: kotlin.h0.u.e.k0.j.b$m */
    /* compiled from: LockBasedStorageManager */
    private static class C11810m<T> {

        /* renamed from: a */
        private final T f31517a;

        /* renamed from: b */
        private final boolean f31518b;

        private C11810m(T t, boolean z) {
            this.f31517a = t;
            this.f31518b = z;
        }

        /* renamed from: a */
        public static <T> C11810m<T> m38870a(T t) {
            return new C11810m<>(t, false);
        }

        /* renamed from: c */
        public static <T> C11810m<T> m38871c() {
            return new C11810m<>((Object) null, true);
        }

        /* renamed from: b */
        public boolean mo38418b() {
            return this.f31518b;
        }

        public String toString() {
            return mo38418b() ? "FALL_THROUGH" : String.valueOf(this.f31517a);
        }

        /* renamed from: a */
        public T mo38417a() {
            return this.f31517a;
        }
    }

    /* synthetic */ C11795b(String str, C11802f fVar, Lock lock, C11796a aVar) {
        this(str, fVar, lock);
    }

    /* renamed from: a */
    private static /* synthetic */ void m38831a(int i) {
        String str = (i == 6 || i == 10 || i == 24) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 6 || i == 10 || i == 24) ? 2 : 3)];
        switch (i) {
            case 1:
            case 3:
                objArr[0] = "exceptionHandlingStrategy";
                break;
            case 4:
                objArr[0] = "lock";
                break;
            case 5:
            case 7:
            case 9:
            case 11:
                objArr[0] = "compute";
                break;
            case 6:
            case 10:
            case 24:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                break;
            case 8:
            case 12:
                objArr[0] = "map";
                break;
            case 13:
            case 14:
            case 16:
            case 18:
            case 19:
            case 20:
            case 22:
                objArr[0] = "computable";
                break;
            case 15:
                objArr[0] = "onRecursiveCall";
                break;
            case 17:
            case 21:
                objArr[0] = "postCompute";
                break;
            case 23:
                objArr[0] = "throwable";
                break;
            default:
                objArr[0] = "debugText";
                break;
        }
        if (i == 6) {
            objArr[1] = "createMemoizedFunction";
        } else if (i == 10) {
            objArr[1] = "createMemoizedFunctionWithNullableValues";
        } else if (i != 24) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
        } else {
            objArr[1] = "sanitizeStackTrace";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
                objArr[2] = "<init>";
                break;
            case 5:
            case 7:
            case 8:
                objArr[2] = "createMemoizedFunction";
                break;
            case 6:
            case 10:
            case 24:
                break;
            case 9:
            case 11:
            case 12:
                objArr[2] = "createMemoizedFunctionWithNullableValues";
                break;
            case 13:
                objArr[2] = "createLazyValue";
                break;
            case 14:
            case 15:
                objArr[2] = "createRecursionTolerantLazyValue";
                break;
            case 16:
            case 17:
                objArr[2] = "createLazyValueWithPostCompute";
                break;
            case 18:
                objArr[2] = "createNullableLazyValue";
                break;
            case 19:
                objArr[2] = "createRecursionTolerantNullableLazyValue";
                break;
            case 20:
            case 21:
                objArr[2] = "createNullableLazyValueWithPostCompute";
                break;
            case 22:
                objArr[2] = "compute";
                break;
            case 23:
                objArr[2] = "sanitizeStackTrace";
                break;
            default:
                objArr[2] = "createWithExceptionHandling";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 6 || i == 10 || i == 24) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public <K, V> C11812d<K, V> mo38406b(C9113l<? super K, ? extends V> lVar) {
        if (lVar != null) {
            C11812d<K, V> b = mo38407b(lVar, m38833c());
            if (b != null) {
                return b;
            }
            m38831a(10);
            throw null;
        }
        m38831a(9);
        throw null;
    }

    /* renamed from: c */
    public <T> C11815g<T> mo38408c(C9102a<? extends T> aVar) {
        if (aVar != null) {
            return new C11805h(this, aVar);
        }
        m38831a(18);
        throw null;
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.f31500c + ")";
    }

    private C11795b(String str, C11802f fVar, Lock lock) {
        if (str == null) {
            m38831a(2);
            throw null;
        } else if (fVar == null) {
            m38831a(3);
            throw null;
        } else if (lock != null) {
            this.f31498a = lock;
            this.f31499b = fVar;
            this.f31500c = str;
        } else {
            m38831a(4);
            throw null;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.j.b$c */
    /* compiled from: LockBasedStorageManager */
    class C11798c extends C11806i<T> {

        /* renamed from: i */
        final /* synthetic */ C9113l f31502i;

        /* renamed from: j */
        final /* synthetic */ C9113l f31503j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11798c(C11795b bVar, C11795b bVar2, C9102a aVar, C9113l lVar, C9113l lVar2) {
            super(bVar2, aVar);
            this.f31502i = lVar;
            this.f31503j = lVar2;
        }

        /* renamed from: a */
        private static /* synthetic */ void m38849a(int i) {
            String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i != 2 ? 2 : 3)];
            if (i != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$3";
            } else {
                objArr[0] = DonationsAnalytics.VALUE;
            }
            if (i != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$3";
            }
            if (i == 2) {
                objArr[2] = "postCompute";
            }
            String format = String.format(str, objArr);
            throw (i != 2 ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C11810m<T> mo38410a(boolean z) {
            C9113l lVar = this.f31502i;
            if (lVar == null) {
                C11810m<T> a = super.mo38410a(z);
                if (a != null) {
                    return a;
                }
                m38849a(0);
                throw null;
            }
            C11810m<T> a2 = C11810m.m38870a(lVar.invoke(Boolean.valueOf(z)));
            if (a2 != null) {
                return a2;
            }
            m38849a(1);
            throw null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo38411a(T t) {
            if (t != null) {
                this.f31503j.invoke(t);
            } else {
                m38849a(2);
                throw null;
            }
        }
    }

    /* renamed from: c */
    private static <K> ConcurrentMap<K, Object> m38833c() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* renamed from: a */
    public <K, V> C11811c<K, V> mo38399a(C9113l<? super K, ? extends V> lVar) {
        if (lVar != null) {
            C11811c<K, V> a = mo38400a(lVar, m38833c());
            if (a != null) {
                return a;
            }
            m38831a(6);
            throw null;
        }
        m38831a(5);
        throw null;
    }

    /* renamed from: b */
    public <K, V> C11812d<K, V> mo38407b(C9113l<? super K, ? extends V> lVar, ConcurrentMap<K, Object> concurrentMap) {
        if (lVar == null) {
            m38831a(11);
            throw null;
        } else if (concurrentMap != null) {
            return new C11807j(this, concurrentMap, lVar);
        } else {
            m38831a(12);
            throw null;
        }
    }

    /* renamed from: a */
    public <K, V> C11811c<K, V> mo38400a(C9113l<? super K, ? extends V> lVar, ConcurrentMap<K, Object> concurrentMap) {
        if (lVar == null) {
            m38831a(7);
            throw null;
        } else if (concurrentMap != null) {
            return new C11808k(this, concurrentMap, lVar);
        } else {
            m38831a(8);
            throw null;
        }
    }

    /* renamed from: b */
    public <T> T mo38404b(C9102a<? extends T> aVar) {
        if (aVar != null) {
            this.f31498a.lock();
            try {
                T invoke = aVar.invoke();
                this.f31498a.unlock();
                return invoke;
            } catch (Throwable th) {
                this.f31498a.unlock();
                throw th;
            }
        } else {
            m38831a(22);
            throw null;
        }
    }

    public C11795b(String str) {
        this(str, C11802f.f31504a, new ReentrantLock());
    }

    /* renamed from: a */
    public <T> C11814f<T> mo38401a(C9102a<? extends T> aVar) {
        if (aVar != null) {
            return new C11806i(this, aVar);
        }
        m38831a(13);
        throw null;
    }

    /* renamed from: a */
    public <T> C11814f<T> mo38402a(C9102a<? extends T> aVar, T t) {
        if (aVar == null) {
            m38831a(14);
            throw null;
        } else if (t != null) {
            return new C11797b(this, this, aVar, t);
        } else {
            m38831a(15);
            throw null;
        }
    }

    /* renamed from: a */
    public <T> C11814f<T> mo38403a(C9102a<? extends T> aVar, C9113l<? super Boolean, ? extends T> lVar, C9113l<? super T, C10483v> lVar2) {
        if (aVar == null) {
            m38831a(16);
            throw null;
        } else if (lVar2 != null) {
            return new C11798c(this, this, aVar, lVar, lVar2);
        } else {
            m38831a(17);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public <T> C11810m<T> mo38405b() {
        IllegalStateException illegalStateException = new IllegalStateException("Recursive call in a lazy value under " + this);
        m38832b(illegalStateException);
        throw illegalStateException;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <T extends Throwable> T m38832b(T t) {
        if (t != null) {
            StackTraceElement[] stackTrace = t.getStackTrace();
            int length = stackTrace.length;
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (!stackTrace[i2].getClassName().startsWith(f31496d)) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            List subList = Arrays.asList(stackTrace).subList(i, length);
            t.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
            if (t != null) {
                return t;
            }
            m38831a(24);
            throw null;
        }
        m38831a(23);
        throw null;
    }

    /* renamed from: a */
    public <K, V> C11794a<K, V> mo38398a() {
        return new C11799d(this, m38833c(), (C11796a) null);
    }
}
