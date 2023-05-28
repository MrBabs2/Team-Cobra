package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import p050l.p059b.p060a.p062b.C4841b;
import p050l.p103q.p104a.C5164a;
import p050l.p103q.p104a.C5165b;
import p050l.p103q.p104a.C5173f;

/* renamed from: androidx.room.g */
/* compiled from: InvalidationTracker */
public class C0739g {

    /* renamed from: l */
    private static final String[] f2746l = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a */
    final HashMap<String, Integer> f2747a;

    /* renamed from: b */
    final String[] f2748b;

    /* renamed from: c */
    private Map<String, Set<String>> f2749c;

    /* renamed from: d */
    final C0753j f2750d;

    /* renamed from: e */
    AtomicBoolean f2751e = new AtomicBoolean(false);

    /* renamed from: f */
    private volatile boolean f2752f = false;

    /* renamed from: g */
    volatile C5173f f2753g;

    /* renamed from: h */
    private C0741b f2754h;
    @SuppressLint({"RestrictedApi"})

    /* renamed from: i */
    final C4841b<C0742c, C0743d> f2755i = new C4841b<>();

    /* renamed from: j */
    private C0744h f2756j;

    /* renamed from: k */
    Runnable f2757k = new C0740a();

    /* renamed from: androidx.room.g$a */
    /* compiled from: InvalidationTracker */
    class C0740a implements Runnable {
        C0740a() {
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private Set<Integer> m3468a() {
            HashSet hashSet = new HashSet();
            Cursor query = C0739g.this.f2750d.query(new C5164a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (query.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(query.getInt(0)));
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            query.close();
            if (!hashSet.isEmpty()) {
                C0739g.this.f2753g.executeUpdateDelete();
            }
            return hashSet;
        }

        public void run() {
            C5165b a;
            Lock closeLock = C0739g.this.f2750d.getCloseLock();
            Set<Integer> set = null;
            try {
                closeLock.lock();
                if (!C0739g.this.mo4354a()) {
                    closeLock.unlock();
                } else if (!C0739g.this.f2751e.compareAndSet(true, false)) {
                    closeLock.unlock();
                } else if (C0739g.this.f2750d.inTransaction()) {
                    closeLock.unlock();
                } else {
                    if (C0739g.this.f2750d.mWriteAheadLoggingEnabled) {
                        a = C0739g.this.f2750d.getOpenHelper().mo4442a();
                        a.beginTransaction();
                        set = m3468a();
                        a.setTransactionSuccessful();
                        a.endTransaction();
                    } else {
                        set = m3468a();
                    }
                    closeLock.unlock();
                    if (set != null && !set.isEmpty()) {
                        synchronized (C0739g.this.f2755i) {
                            Iterator<Map.Entry<C0742c, C0743d>> it = C0739g.this.f2755i.iterator();
                            while (it.hasNext()) {
                                ((C0743d) it.next().getValue()).mo4367a(set);
                            }
                        }
                    }
                }
            } catch (SQLiteException | IllegalStateException e) {
                try {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                } catch (Throwable th) {
                    closeLock.unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                a.endTransaction();
                throw th2;
            }
        }
    }

    /* renamed from: androidx.room.g$c */
    /* compiled from: InvalidationTracker */
    public static abstract class C0742c {

        /* renamed from: a */
        final String[] f2764a;

        public C0742c(String[] strArr) {
            this.f2764a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        /* renamed from: a */
        public abstract void mo4365a(Set<String> set);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4366a() {
            return false;
        }
    }

    public C0739g(C0753j jVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f2750d = jVar;
        this.f2754h = new C0741b(strArr.length);
        this.f2747a = new HashMap<>();
        this.f2749c = map2;
        new C0738f(this.f2750d);
        int length = strArr.length;
        this.f2748b = new String[length];
        for (int i = 0; i < length; i++) {
            String lowerCase = strArr[i].toLowerCase(Locale.US);
            this.f2747a.put(lowerCase, Integer.valueOf(i));
            String str = map.get(strArr[i]);
            if (str != null) {
                this.f2748b[i] = str.toLowerCase(Locale.US);
            } else {
                this.f2748b[i] = lowerCase;
            }
        }
        for (Map.Entry next : map.entrySet()) {
            String lowerCase2 = ((String) next.getValue()).toLowerCase(Locale.US);
            if (this.f2747a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) next.getKey()).toLowerCase(Locale.US);
                HashMap<String, Integer> hashMap = this.f2747a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    /* renamed from: b */
    private void m3456b(C5165b bVar, int i) {
        String str = this.f2748b[i];
        StringBuilder sb = new StringBuilder();
        for (String a : f2746l) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            m3454a(sb, str, a);
            bVar.execSQL(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4352a(C5165b bVar) {
        synchronized (this) {
            if (this.f2752f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            bVar.execSQL("PRAGMA temp_store = MEMORY;");
            bVar.execSQL("PRAGMA recursive_triggers='ON';");
            bVar.execSQL("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            mo4357b(bVar);
            this.f2753g = bVar.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f2752f = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4358c() {
        C0744h hVar = this.f2756j;
        if (hVar != null) {
            hVar.mo4369a();
            this.f2756j = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4359d() {
        if (this.f2750d.isOpen()) {
            mo4357b(this.f2750d.getOpenHelper().mo4442a());
        }
    }

    /* renamed from: androidx.room.g$b */
    /* compiled from: InvalidationTracker */
    static class C0741b {

        /* renamed from: a */
        final long[] f2759a;

        /* renamed from: b */
        final boolean[] f2760b;

        /* renamed from: c */
        final int[] f2761c;

        /* renamed from: d */
        boolean f2762d;

        /* renamed from: e */
        boolean f2763e;

        C0741b(int i) {
            long[] jArr = new long[i];
            this.f2759a = jArr;
            this.f2760b = new boolean[i];
            this.f2761c = new int[i];
            Arrays.fill(jArr, 0);
            Arrays.fill(this.f2760b, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4361a(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long j = this.f2759a[i];
                    this.f2759a[i] = 1 + j;
                    if (j == 0) {
                        this.f2762d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo4364b(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long j = this.f2759a[i];
                    this.f2759a[i] = j - 1;
                    if (j == 1) {
                        this.f2762d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int[] mo4362a() {
            synchronized (this) {
                if (this.f2762d) {
                    if (!this.f2763e) {
                        int length = this.f2759a.length;
                        int i = 0;
                        while (true) {
                            int i2 = 1;
                            if (i < length) {
                                boolean z = this.f2759a[i] > 0;
                                if (z != this.f2760b[i]) {
                                    int[] iArr = this.f2761c;
                                    if (!z) {
                                        i2 = 2;
                                    }
                                    iArr[i] = i2;
                                } else {
                                    this.f2761c[i] = 0;
                                }
                                this.f2760b[i] = z;
                                i++;
                            } else {
                                this.f2763e = true;
                                this.f2762d = false;
                                int[] iArr2 = this.f2761c;
                                return iArr2;
                            }
                        }
                    }
                }
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4363b() {
            synchronized (this) {
                this.f2763e = false;
            }
        }
    }

    /* renamed from: androidx.room.g$d */
    /* compiled from: InvalidationTracker */
    static class C0743d {

        /* renamed from: a */
        final int[] f2765a;

        /* renamed from: b */
        private final String[] f2766b;

        /* renamed from: c */
        final C0742c f2767c;

        /* renamed from: d */
        private final Set<String> f2768d;

        C0743d(C0742c cVar, int[] iArr, String[] strArr) {
            this.f2767c = cVar;
            this.f2765a = iArr;
            this.f2766b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(this.f2766b[0]);
                this.f2768d = Collections.unmodifiableSet(hashSet);
                return;
            }
            this.f2768d = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4367a(Set<Integer> set) {
            int length = this.f2765a.length;
            Set set2 = null;
            for (int i = 0; i < length; i++) {
                if (set.contains(Integer.valueOf(this.f2765a[i]))) {
                    if (length == 1) {
                        set2 = this.f2768d;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet(length);
                        }
                        set2.add(this.f2766b[i]);
                    }
                }
            }
            if (set2 != null) {
                this.f2767c.mo4365a(set2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4368a(String[] strArr) {
            Set<String> set = null;
            if (this.f2766b.length == 1) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (strArr[i].equalsIgnoreCase(this.f2766b[0])) {
                        set = this.f2768d;
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f2766b;
                    int length2 = strArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        }
                        String str2 = strArr2[i2];
                        if (str2.equalsIgnoreCase(str)) {
                            hashSet.add(str2);
                            break;
                        }
                        i2++;
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f2767c.mo4365a(set);
            }
        }
    }

    /* renamed from: b */
    private String[] m3457b(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f2749c.containsKey(lowerCase)) {
                hashSet.addAll(this.f2749c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4350a(Context context, String str) {
        this.f2756j = new C0744h(context, str, this, this.f2750d.getQueryExecutor());
    }

    /* renamed from: a */
    private static void m3454a(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: b */
    public void mo4356b(C0742c cVar) {
        C0743d remove;
        synchronized (this.f2755i) {
            remove = this.f2755i.remove(cVar);
        }
        if (remove != null && this.f2754h.mo4364b(remove.f2765a)) {
            mo4359d();
        }
    }

    /* renamed from: a */
    private void m3455a(C5165b bVar, int i) {
        bVar.execSQL("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f2748b[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f2746l) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            m3454a(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            bVar.execSQL(sb.toString());
        }
    }

    /* renamed from: b */
    public void mo4355b() {
        if (this.f2751e.compareAndSet(false, true)) {
            this.f2750d.getQueryExecutor().execute(this.f2757k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4357b(C5165b bVar) {
        if (!bVar.inTransaction()) {
            while (true) {
                try {
                    Lock closeLock = this.f2750d.getCloseLock();
                    closeLock.lock();
                    try {
                        int[] a = this.f2754h.mo4362a();
                        if (a == null) {
                            closeLock.unlock();
                            return;
                        }
                        int length = a.length;
                        bVar.beginTransaction();
                        for (int i = 0; i < length; i++) {
                            int i2 = a[i];
                            if (i2 == 1) {
                                m3455a(bVar, i);
                            } else if (i2 == 2) {
                                m3456b(bVar, i);
                            }
                        }
                        bVar.setTransactionSuccessful();
                        bVar.endTransaction();
                        this.f2754h.mo4363b();
                        closeLock.unlock();
                    } catch (Throwable th) {
                        closeLock.unlock();
                        throw th;
                    }
                } catch (SQLiteException | IllegalStateException e) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                    return;
                }
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: a */
    public void mo4351a(C0742c cVar) {
        C0743d b;
        String[] b2 = m3457b(cVar.f2764a);
        int[] iArr = new int[b2.length];
        int length = b2.length;
        int i = 0;
        while (i < length) {
            Integer num = this.f2747a.get(b2[i].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i] = num.intValue();
                i++;
            } else {
                throw new IllegalArgumentException("There is no table with name " + b2[i]);
            }
        }
        C0743d dVar = new C0743d(cVar, iArr, b2);
        synchronized (this.f2755i) {
            b = this.f2755i.mo16847b(cVar, dVar);
        }
        if (b == null && this.f2754h.mo4361a(iArr)) {
            mo4359d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4354a() {
        if (!this.f2750d.isOpen()) {
            return false;
        }
        if (!this.f2752f) {
            this.f2750d.getOpenHelper().mo4442a();
        }
        if (this.f2752f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    /* renamed from: a */
    public void mo4353a(String... strArr) {
        synchronized (this.f2755i) {
            Iterator<Map.Entry<C0742c, C0743d>> it = this.f2755i.iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                if (!((C0742c) next.getKey()).mo4366a()) {
                    ((C0743d) next.getValue()).mo4368a(strArr);
                }
            }
        }
    }
}
