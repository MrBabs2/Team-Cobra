package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.room.p005s.C0774a;
import androidx.room.p006t.C0779e;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p050l.p059b.p060a.p061a.C4834a;
import p050l.p103q.p104a.C5164a;
import p050l.p103q.p104a.C5165b;
import p050l.p103q.p104a.C5166c;
import p050l.p103q.p104a.C5172e;
import p050l.p103q.p104a.C5173f;
import p050l.p103q.p104a.p105g.C5180c;

/* renamed from: androidx.room.j */
/* compiled from: RoomDatabase */
public abstract class C0753j {
    private static final String DB_IMPL_SUFFIX = "_Impl";
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean mAllowMainThreadQueries;
    private final Map<String, Object> mBackingFieldMap = new ConcurrentHashMap();
    @Deprecated
    protected List<C0755b> mCallbacks;
    private final ReentrantReadWriteLock mCloseLock = new ReentrantReadWriteLock();
    @Deprecated
    protected volatile C5165b mDatabase;
    private final C0739g mInvalidationTracker = createInvalidationTracker();
    private C5166c mOpenHelper;
    private Executor mQueryExecutor;
    private final ThreadLocal<Integer> mSuspendingTransactionId = new ThreadLocal<>();
    private Executor mTransactionExecutor;
    boolean mWriteAheadLoggingEnabled;

    /* renamed from: androidx.room.j$b */
    /* compiled from: RoomDatabase */
    public static abstract class C0755b {
        /* renamed from: a */
        public void mo4409a(C5165b bVar) {
        }

        /* renamed from: b */
        public void mo4410b(C5165b bVar) {
        }

        /* renamed from: c */
        public void mo4411c(C5165b bVar) {
        }
    }

    private static boolean isMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void assertNotMainThread() {
        if (!this.mAllowMainThreadQueries && isMainThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.mSuspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void beginTransaction() {
        assertNotMainThread();
        C5165b a = this.mOpenHelper.mo4442a();
        this.mInvalidationTracker.mo4357b(a);
        a.beginTransaction();
    }

    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.mCloseLock.writeLock();
            try {
                writeLock.lock();
                this.mInvalidationTracker.mo4358c();
                this.mOpenHelper.close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public C5173f compileStatement(String str) {
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return this.mOpenHelper.mo4442a().compileStatement(str);
    }

    /* access modifiers changed from: protected */
    public abstract C0739g createInvalidationTracker();

    /* access modifiers changed from: protected */
    public abstract C5166c createOpenHelper(C0729a aVar);

    @Deprecated
    public void endTransaction() {
        this.mOpenHelper.mo4442a().endTransaction();
        if (!inTransaction()) {
            this.mInvalidationTracker.mo4355b();
        }
    }

    /* access modifiers changed from: package-private */
    public Map<String, Object> getBackingFieldMap() {
        return this.mBackingFieldMap;
    }

    /* access modifiers changed from: package-private */
    public Lock getCloseLock() {
        return this.mCloseLock.readLock();
    }

    public C0739g getInvalidationTracker() {
        return this.mInvalidationTracker;
    }

    public C5166c getOpenHelper() {
        return this.mOpenHelper;
    }

    public Executor getQueryExecutor() {
        return this.mQueryExecutor;
    }

    /* access modifiers changed from: package-private */
    public ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.mSuspendingTransactionId;
    }

    public Executor getTransactionExecutor() {
        return this.mTransactionExecutor;
    }

    public boolean inTransaction() {
        return this.mOpenHelper.mo4442a().inTransaction();
    }

    public void init(C0729a aVar) {
        C5166c createOpenHelper = createOpenHelper(aVar);
        this.mOpenHelper = createOpenHelper;
        if (createOpenHelper instanceof C0769o) {
            ((C0769o) createOpenHelper).mo4443a(aVar);
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 16) {
            if (aVar.f2737g == C0756c.WRITE_AHEAD_LOGGING) {
                z = true;
            }
            this.mOpenHelper.mo4444a(z);
        }
        this.mCallbacks = aVar.f2735e;
        this.mQueryExecutor = aVar.f2738h;
        this.mTransactionExecutor = new C0772r(aVar.f2739i);
        this.mAllowMainThreadQueries = aVar.f2736f;
        this.mWriteAheadLoggingEnabled = z;
        if (aVar.f2740j) {
            this.mInvalidationTracker.mo4350a(aVar.f2732b, aVar.f2733c);
        }
    }

    /* access modifiers changed from: protected */
    public void internalInitInvalidationTracker(C5165b bVar) {
        this.mInvalidationTracker.mo4352a(bVar);
    }

    public boolean isOpen() {
        C5165b bVar = this.mDatabase;
        return bVar != null && bVar.isOpen();
    }

    public Cursor query(String str, Object[] objArr) {
        return this.mOpenHelper.mo4442a().mo17849a(new C5164a(str, objArr));
    }

    public void runInTransaction(Runnable runnable) {
        beginTransaction();
        try {
            runnable.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @Deprecated
    public void setTransactionSuccessful() {
        this.mOpenHelper.mo4442a().setTransactionSuccessful();
    }

    /* renamed from: androidx.room.j$d */
    /* compiled from: RoomDatabase */
    public static class C0757d {

        /* renamed from: a */
        private HashMap<Integer, TreeMap<Integer, C0774a>> f2811a = new HashMap<>();

        /* renamed from: a */
        public void mo4414a(C0774a... aVarArr) {
            for (C0774a a : aVarArr) {
                m3497a(a);
            }
        }

        /* renamed from: a */
        private void m3497a(C0774a aVar) {
            int i = aVar.startVersion;
            int i2 = aVar.endVersion;
            TreeMap treeMap = this.f2811a.get(Integer.valueOf(i));
            if (treeMap == null) {
                treeMap = new TreeMap();
                this.f2811a.put(Integer.valueOf(i), treeMap);
            }
            C0774a aVar2 = (C0774a) treeMap.get(Integer.valueOf(i2));
            if (aVar2 != null) {
                Log.w("ROOM", "Overriding migration " + aVar2 + " with " + aVar);
            }
            treeMap.put(Integer.valueOf(i2), aVar);
        }

        /* renamed from: a */
        public List<C0774a> mo4413a(int i, int i2) {
            if (i == i2) {
                return Collections.emptyList();
            }
            return m3496a(new ArrayList(), i2 > i, i, i2);
        }

        /* renamed from: a */
        private List<C0774a> m3496a(List<C0774a> list, boolean z, int i, int i2) {
            Set set;
            boolean z2;
            do {
                if (z) {
                    if (i >= i2) {
                        return list;
                    }
                } else if (i <= i2) {
                    return list;
                }
                TreeMap treeMap = this.f2811a.get(Integer.valueOf(i));
                if (treeMap != null) {
                    if (z) {
                        set = treeMap.descendingKeySet();
                    } else {
                        set = treeMap.keySet();
                    }
                    Iterator it = set.iterator();
                    while (true) {
                        z2 = true;
                        boolean z3 = false;
                        if (!it.hasNext()) {
                            z2 = false;
                            continue;
                            break;
                        }
                        int intValue = ((Integer) it.next()).intValue();
                        if (!z ? !(intValue < i2 || intValue >= i) : !(intValue > i2 || intValue <= i)) {
                            z3 = true;
                            continue;
                        }
                        if (z3) {
                            list.add(treeMap.get(Integer.valueOf(intValue)));
                            i = intValue;
                            continue;
                            break;
                        }
                    }
                } else {
                    return null;
                }
            } while (z2);
            return null;
        }
    }

    public Cursor query(C5172e eVar) {
        return query(eVar, (CancellationSignal) null);
    }

    public Cursor query(C5172e eVar, CancellationSignal cancellationSignal) {
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal == null || Build.VERSION.SDK_INT < 16) {
            return this.mOpenHelper.mo4442a().mo17849a(eVar);
        }
        return this.mOpenHelper.mo4442a().mo17850a(eVar, cancellationSignal);
    }

    /* renamed from: androidx.room.j$a */
    /* compiled from: RoomDatabase */
    public static class C0754a<T extends C0753j> {

        /* renamed from: a */
        private final Class<T> f2790a;

        /* renamed from: b */
        private final String f2791b;

        /* renamed from: c */
        private final Context f2792c;

        /* renamed from: d */
        private ArrayList<C0755b> f2793d;

        /* renamed from: e */
        private Executor f2794e;

        /* renamed from: f */
        private Executor f2795f;

        /* renamed from: g */
        private C5166c.C5170c f2796g;

        /* renamed from: h */
        private boolean f2797h;

        /* renamed from: i */
        private C0756c f2798i = C0756c.AUTOMATIC;

        /* renamed from: j */
        private boolean f2799j;

        /* renamed from: k */
        private boolean f2800k = true;

        /* renamed from: l */
        private boolean f2801l;

        /* renamed from: m */
        private final C0757d f2802m = new C0757d();

        /* renamed from: n */
        private Set<Integer> f2803n;

        /* renamed from: o */
        private Set<Integer> f2804o;

        /* renamed from: p */
        private String f2805p;

        /* renamed from: q */
        private File f2806q;

        C0754a(Context context, Class<T> cls, String str) {
            this.f2792c = context;
            this.f2790a = cls;
            this.f2791b = str;
        }

        /* renamed from: a */
        public C0754a<T> mo4406a(C0774a... aVarArr) {
            if (this.f2804o == null) {
                this.f2804o = new HashSet();
            }
            for (C0774a aVar : aVarArr) {
                this.f2804o.add(Integer.valueOf(aVar.startVersion));
                this.f2804o.add(Integer.valueOf(aVar.endVersion));
            }
            this.f2802m.mo4414a(aVarArr);
            return this;
        }

        @SuppressLint({"RestrictedApi"})
        /* renamed from: b */
        public T mo4407b() {
            Executor executor;
            if (this.f2792c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            } else if (this.f2790a != null) {
                if (this.f2794e == null && this.f2795f == null) {
                    Executor b = C4834a.m8100b();
                    this.f2795f = b;
                    this.f2794e = b;
                } else {
                    Executor executor2 = this.f2794e;
                    if (executor2 != null && this.f2795f == null) {
                        this.f2795f = executor2;
                    } else if (this.f2794e == null && (executor = this.f2795f) != null) {
                        this.f2794e = executor;
                    }
                }
                Set<Integer> set = this.f2804o;
                if (!(set == null || this.f2803n == null)) {
                    for (Integer next : set) {
                        if (this.f2803n.contains(next)) {
                            throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + next);
                        }
                    }
                }
                if (this.f2796g == null) {
                    this.f2796g = new C5180c();
                }
                if (!(this.f2805p == null && this.f2806q == null)) {
                    if (this.f2791b == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    } else if (this.f2805p == null || this.f2806q == null) {
                        this.f2796g = new C0770p(this.f2805p, this.f2806q, this.f2796g);
                    } else {
                        throw new IllegalArgumentException("Both createFromAsset() and createFromFile() was called on this Builder but the database can only be created using one of the two configurations.");
                    }
                }
                Context context = this.f2792c;
                String str = this.f2791b;
                C5166c.C5170c cVar = this.f2796g;
                C0757d dVar = this.f2802m;
                ArrayList<C0755b> arrayList = this.f2793d;
                boolean z = this.f2797h;
                C0756c a = this.f2798i.mo4412a(context);
                Executor executor3 = this.f2794e;
                Executor executor4 = this.f2795f;
                boolean z2 = this.f2799j;
                boolean z3 = this.f2800k;
                boolean z4 = this.f2801l;
                boolean z5 = z3;
                boolean z6 = z4;
                C0729a aVar = new C0729a(context, str, cVar, dVar, arrayList, z, a, executor3, executor4, z2, z5, z6, this.f2803n, this.f2805p, this.f2806q);
                T t = (C0753j) C0752i.m3483a(this.f2790a, C0753j.DB_IMPL_SUFFIX);
                t.init(aVar);
                return t;
            } else {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
        }

        /* renamed from: c */
        public C0754a<T> mo4408c() {
            this.f2800k = false;
            this.f2801l = true;
            return this;
        }

        /* renamed from: a */
        public C0754a<T> mo4402a() {
            this.f2797h = true;
            return this;
        }

        /* renamed from: a */
        public C0754a<T> mo4404a(Executor executor) {
            this.f2794e = executor;
            return this;
        }

        /* renamed from: a */
        public C0754a<T> mo4405a(int... iArr) {
            if (this.f2803n == null) {
                this.f2803n = new HashSet(iArr.length);
            }
            for (int valueOf : iArr) {
                this.f2803n.add(Integer.valueOf(valueOf));
            }
            return this;
        }

        /* renamed from: a */
        public C0754a<T> mo4403a(C0755b bVar) {
            if (this.f2793d == null) {
                this.f2793d = new ArrayList<>();
            }
            this.f2793d.add(bVar);
            return this;
        }
    }

    /* renamed from: androidx.room.j$c */
    /* compiled from: RoomDatabase */
    public enum C0756c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        /* access modifiers changed from: package-private */
        @SuppressLint({"NewApi"})
        /* renamed from: a */
        public C0756c mo4412a(Context context) {
            ActivityManager activityManager;
            if (this != AUTOMATIC) {
                return this;
            }
            if (Build.VERSION.SDK_INT < 16 || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || m3494a(activityManager)) {
                return TRUNCATE;
            }
            return WRITE_AHEAD_LOGGING;
        }

        /* renamed from: a */
        private static boolean m3494a(ActivityManager activityManager) {
            if (Build.VERSION.SDK_INT >= 19) {
                return activityManager.isLowRamDevice();
            }
            return false;
        }
    }

    public <V> V runInTransaction(Callable<V> callable) {
        beginTransaction();
        try {
            V call = callable.call();
            setTransactionSuccessful();
            endTransaction();
            return call;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            C0779e.m3542a(e2);
            throw null;
        } catch (Throwable th) {
            endTransaction();
            throw th;
        }
    }
}
