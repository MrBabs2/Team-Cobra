package p036io.rakam.api;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;
import p015cm.aptoide.p016pt.database.room.RoomNotification;

/* renamed from: io.rakam.api.b */
/* compiled from: DatabaseHelper */
class C9017b extends SQLiteOpenHelper {

    /* renamed from: d */
    static final Map<String, C9017b> f25519d = new HashMap();

    /* renamed from: e */
    private static final C9026i f25520e = C9026i.m29670a();

    /* renamed from: a */
    File f25521a;

    /* renamed from: b */
    private boolean f25522b = true;

    /* renamed from: c */
    private C9018c f25523c;

    protected C9017b(Context context, String str) {
        super(context, m29584e(str), (SQLiteDatabase.CursorFactory) null, 3);
        this.f25521a = context.getDatabasePath(m29584e(str));
        C9028k.m29696b(str);
    }

    @Deprecated
    /* renamed from: a */
    static C9017b m29576a(Context context) {
        return m29577a(context, (String) null);
    }

    /* renamed from: d */
    private synchronized long m29582d(String str, String str2) {
        long j;
        SQLiteException e;
        StackOverflowError e2;
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("event", str2);
            j = mo33311a(writableDatabase, str, contentValues);
            if (j == -1) {
                try {
                    f25520e.mo33375d("io.rakam.api.DatabaseHelper", String.format("Insert into %s failed", new Object[]{str}));
                } catch (SQLiteException e3) {
                    e = e3;
                } catch (StackOverflowError e4) {
                    e2 = e4;
                    try {
                        f25520e.mo33370a("io.rakam.api.DatabaseHelper", String.format("addEvent to %s failed", new Object[]{str}), e2);
                        C9022e.m29662c().mo33355a(String.format("DB: Failed to addEvent: %s", new Object[]{str2}), e2);
                        m29583d();
                        close();
                        return j;
                    } catch (Throwable th) {
                        close();
                        throw th;
                    }
                }
            }
        } catch (SQLiteException e5) {
            e = e5;
            j = -1;
            f25520e.mo33370a("io.rakam.api.DatabaseHelper", String.format("addEvent to %s failed", new Object[]{str}), e);
            C9022e.m29662c().mo33355a(String.format("DB: Failed to addEvent: %s", new Object[]{str2}), e);
            m29583d();
            close();
            return j;
        } catch (StackOverflowError e6) {
            e2 = e6;
            j = -1;
            f25520e.mo33370a("io.rakam.api.DatabaseHelper", String.format("addEvent to %s failed", new Object[]{str}), e2);
            C9022e.m29662c().mo33355a(String.format("DB: Failed to addEvent: %s", new Object[]{str2}), e2);
            m29583d();
            close();
            return j;
        }
        close();
        return j;
    }

    /* renamed from: e */
    private static String m29584e(String str) {
        if (C9028k.m29695a(str) || str.equals("$default_instance")) {
            return "io.rakam.api";
        }
        return "io.rakam.api_" + str;
    }

    /* renamed from: f */
    private synchronized long m29585f(String str) {
        long j;
        SQLiteStatement sQLiteStatement = null;
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            SQLiteStatement compileStatement = readableDatabase.compileStatement("SELECT COUNT(*) FROM " + str);
            j = compileStatement.simpleQueryForLong();
            if (compileStatement != null) {
                compileStatement.close();
            }
            close();
        } catch (SQLiteException e) {
            f25520e.mo33370a("io.rakam.api.DatabaseHelper", String.format("getNumberRows for %s failed", new Object[]{str}), e);
            C9022e.m29662c().mo33355a(String.format("DB: Failed to getNumberRows for table %s", new Object[]{str}), e);
            m29583d();
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
            close();
            j = 0;
            return j;
        } catch (StackOverflowError e2) {
            try {
                f25520e.mo33370a("io.rakam.api.DatabaseHelper", String.format("getNumberRows for %s failed", new Object[]{str}), e2);
                C9022e.m29662c().mo33355a(String.format("DB: Failed to getNumberRows for table %s", new Object[]{str}), e2);
                m29583d();
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                close();
                j = 0;
                return j;
            } catch (Throwable th) {
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                close();
                throw th;
            }
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized long mo33323b(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) throws SQLiteException, StackOverflowError {
        return sQLiteDatabase.insertWithOnConflict(str, (String) null, contentValues, 5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized long mo33328c(String str, String str2) {
        long j;
        if (str2 == null) {
            j = mo33315a(AccountAnalytics.STORE, str);
        } else {
            j = mo33316a(AccountAnalytics.STORE, str, (Object) str2);
        }
        return j;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS store (key TEXT PRIMARY KEY NOT NULL, value TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS long_store (key TEXT PRIMARY KEY NOT NULL, value INTEGER);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS identifys (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
        C9018c cVar = this.f25523c;
        if (cVar != null && this.f25522b) {
            try {
                this.f25522b = false;
                cVar.mo16605a(sQLiteDatabase);
            } catch (SQLiteException e) {
                f25520e.mo33370a("io.rakam.api.DatabaseHelper", String.format("databaseReset callback failed during onCreate", new Object[0]), e);
                C9022e.m29662c().mo33355a(String.format("DB: Failed to run databaseReset callback during onCreate", new Object[0]), e);
            } catch (Throwable th) {
                this.f25522b = true;
                throw th;
            }
            this.f25522b = true;
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i > i2) {
            f25520e.mo33373b("io.rakam.api.DatabaseHelper", "onUpgrade() with invalid oldVersion and newVersion");
            m29578a(sQLiteDatabase);
        } else if (i2 > 1) {
            if (i == 1) {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS store (key TEXT PRIMARY KEY NOT NULL, value TEXT);");
                if (i2 <= 2) {
                    return;
                }
            } else if (i != 2) {
                if (i != 3) {
                    C9026i iVar = f25520e;
                    iVar.mo33373b("io.rakam.api.DatabaseHelper", "onUpgrade() with unknown oldVersion " + i);
                    m29578a(sQLiteDatabase);
                    return;
                }
                return;
            }
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS identifys (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS long_store (key TEXT PRIMARY KEY NOT NULL, value INTEGER);");
        }
    }

    /* renamed from: a */
    static synchronized C9017b m29577a(Context context, String str) {
        C9017b bVar;
        synchronized (C9017b.class) {
            String b = C9028k.m29696b(str);
            bVar = f25519d.get(b);
            if (bVar == null) {
                bVar = new C9017b(context.getApplicationContext(), b);
                f25519d.put(b, bVar);
            }
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized long mo33324b(String str) {
        return m29582d("identifys", str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void mo33333e(long j) {
        m29580b("identifys", j);
    }

    /* JADX WARNING: type inference failed for: r14v13, types: [java.lang.Long] */
    /* JADX WARNING: type inference failed for: r14v14, types: [java.lang.String] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0092 A[SYNTHETIC, Splitter:B:30:0x0092] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bf A[SYNTHETIC, Splitter:B:37:0x00bf] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c9 A[SYNTHETIC, Splitter:B:44:0x00c9] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:22:0x0054=Splitter:B:22:0x0054, B:34:0x0098=Splitter:B:34:0x0098, B:27:0x006b=Splitter:B:27:0x006b} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Object mo33325b(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            monitor-enter(r13)
            r0 = 0
            r1 = 0
            r2 = 1
            android.database.sqlite.SQLiteDatabase r4 = r13.getReadableDatabase()     // Catch:{ SQLiteException -> 0x0096, StackOverflowError -> 0x0069, RuntimeException -> 0x0052, all -> 0x004f }
            r3 = 2
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0096, StackOverflowError -> 0x0069, RuntimeException -> 0x0052, all -> 0x004f }
            java.lang.String r3 = "key"
            r6[r1] = r3     // Catch:{ SQLiteException -> 0x0096, StackOverflowError -> 0x0069, RuntimeException -> 0x0052, all -> 0x004f }
            java.lang.String r3 = "value"
            r6[r2] = r3     // Catch:{ SQLiteException -> 0x0096, StackOverflowError -> 0x0069, RuntimeException -> 0x0052, all -> 0x004f }
            java.lang.String r7 = "key = ?"
            java.lang.String[] r8 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0096, StackOverflowError -> 0x0069, RuntimeException -> 0x0052, all -> 0x004f }
            r8[r1] = r15     // Catch:{ SQLiteException -> 0x0096, StackOverflowError -> 0x0069, RuntimeException -> 0x0052, all -> 0x004f }
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r3 = r13
            r5 = r14
            android.database.Cursor r3 = r3.mo33317a(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x0096, StackOverflowError -> 0x0069, RuntimeException -> 0x0052, all -> 0x004f }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x004d, StackOverflowError -> 0x004b, RuntimeException -> 0x0049 }
            if (r4 == 0) goto L_0x003f
            java.lang.String r4 = "store"
            boolean r4 = r14.equals(r4)     // Catch:{ SQLiteException -> 0x004d, StackOverflowError -> 0x004b, RuntimeException -> 0x0049 }
            if (r4 == 0) goto L_0x0036
            java.lang.String r14 = r3.getString(r2)     // Catch:{ SQLiteException -> 0x004d, StackOverflowError -> 0x004b, RuntimeException -> 0x0049 }
            goto L_0x003e
        L_0x0036:
            long r4 = r3.getLong(r2)     // Catch:{ SQLiteException -> 0x004d, StackOverflowError -> 0x004b, RuntimeException -> 0x0049 }
            java.lang.Long r14 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x004d, StackOverflowError -> 0x004b, RuntimeException -> 0x0049 }
        L_0x003e:
            r0 = r14
        L_0x003f:
            if (r3 == 0) goto L_0x0044
            r3.close()     // Catch:{ all -> 0x00d0 }
        L_0x0044:
            r13.close()     // Catch:{ all -> 0x00d0 }
            goto L_0x00c3
        L_0x0049:
            r14 = move-exception
            goto L_0x0054
        L_0x004b:
            r4 = move-exception
            goto L_0x006b
        L_0x004d:
            r4 = move-exception
            goto L_0x0098
        L_0x004f:
            r14 = move-exception
            goto L_0x00c7
        L_0x0052:
            r14 = move-exception
            r3 = r0
        L_0x0054:
            io.rakam.api.e r4 = p036io.rakam.api.C9022e.m29662c()     // Catch:{ all -> 0x00c5 }
            java.lang.String r5 = "DB: Failed to getValue: %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00c5 }
            r2[r1] = r15     // Catch:{ all -> 0x00c5 }
            java.lang.String r15 = java.lang.String.format(r5, r2)     // Catch:{ all -> 0x00c5 }
            r4.mo33355a(r15, r14)     // Catch:{ all -> 0x00c5 }
            m29579a((java.lang.RuntimeException) r14)     // Catch:{ all -> 0x00c5 }
            throw r0
        L_0x0069:
            r4 = move-exception
            r3 = r0
        L_0x006b:
            io.rakam.api.i r5 = f25520e     // Catch:{ all -> 0x00c5 }
            java.lang.String r6 = "io.rakam.api.DatabaseHelper"
            java.lang.String r7 = "getValue from %s failed"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x00c5 }
            r8[r1] = r14     // Catch:{ all -> 0x00c5 }
            java.lang.String r14 = java.lang.String.format(r7, r8)     // Catch:{ all -> 0x00c5 }
            r5.mo33370a(r6, r14, r4)     // Catch:{ all -> 0x00c5 }
            io.rakam.api.e r14 = p036io.rakam.api.C9022e.m29662c()     // Catch:{ all -> 0x00c5 }
            java.lang.String r5 = "DB: Failed to getValue: %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00c5 }
            r2[r1] = r15     // Catch:{ all -> 0x00c5 }
            java.lang.String r15 = java.lang.String.format(r5, r2)     // Catch:{ all -> 0x00c5 }
            r14.mo33355a(r15, r4)     // Catch:{ all -> 0x00c5 }
            r13.m29583d()     // Catch:{ all -> 0x00c5 }
            if (r3 == 0) goto L_0x0044
            r3.close()     // Catch:{ all -> 0x00d0 }
            goto L_0x0044
        L_0x0096:
            r4 = move-exception
            r3 = r0
        L_0x0098:
            io.rakam.api.i r5 = f25520e     // Catch:{ all -> 0x00c5 }
            java.lang.String r6 = "io.rakam.api.DatabaseHelper"
            java.lang.String r7 = "getValue from %s failed"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x00c5 }
            r8[r1] = r14     // Catch:{ all -> 0x00c5 }
            java.lang.String r14 = java.lang.String.format(r7, r8)     // Catch:{ all -> 0x00c5 }
            r5.mo33370a(r6, r14, r4)     // Catch:{ all -> 0x00c5 }
            io.rakam.api.e r14 = p036io.rakam.api.C9022e.m29662c()     // Catch:{ all -> 0x00c5 }
            java.lang.String r5 = "DB: Failed to getValue: %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00c5 }
            r2[r1] = r15     // Catch:{ all -> 0x00c5 }
            java.lang.String r15 = java.lang.String.format(r5, r2)     // Catch:{ all -> 0x00c5 }
            r14.mo33355a(r15, r4)     // Catch:{ all -> 0x00c5 }
            r13.m29583d()     // Catch:{ all -> 0x00c5 }
            if (r3 == 0) goto L_0x0044
            r3.close()     // Catch:{ all -> 0x00d0 }
            goto L_0x0044
        L_0x00c3:
            monitor-exit(r13)
            return r0
        L_0x00c5:
            r14 = move-exception
            r0 = r3
        L_0x00c7:
            if (r0 == 0) goto L_0x00cc
            r0.close()     // Catch:{ all -> 0x00d0 }
        L_0x00cc:
            r13.close()     // Catch:{ all -> 0x00d0 }
            throw r14     // Catch:{ all -> 0x00d0 }
        L_0x00d0:
            r14 = move-exception
            monitor-exit(r13)
            goto L_0x00d4
        L_0x00d3:
            throw r14
        L_0x00d4:
            goto L_0x00d3
        */
        throw new UnsupportedOperationException("Method not decompiled: p036io.rakam.api.C9017b.mo33325b(java.lang.String, java.lang.String):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized Long mo33329c(String str) {
        return (Long) mo33325b("long_store", str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized long mo33327c() {
        return mo33309a() + mo33321b();
    }

    /* renamed from: c */
    private synchronized void m29581c(String str, long j) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.delete(str, "id <= " + j, (String[]) null);
        } catch (SQLiteException e) {
            f25520e.mo33370a("io.rakam.api.DatabaseHelper", String.format("removeEvents from %s failed", new Object[]{str}), e);
            C9022e.m29662c().mo33355a(String.format("DB: Failed to removeEvents from table %s", new Object[]{str}), e);
            m29583d();
        } catch (StackOverflowError e2) {
            try {
                f25520e.mo33370a("io.rakam.api.DatabaseHelper", String.format("removeEvents from %s failed", new Object[]{str}), e2);
                C9022e.m29662c().mo33355a(String.format("DB: Failed to removeEvents from table %s", new Object[]{str}), e2);
                m29583d();
            } catch (Throwable th) {
                close();
                throw th;
            }
        }
        close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33320a(C9018c cVar) {
        this.f25523c = cVar;
    }

    /* renamed from: a */
    private void m29578a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS long_store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS identifys");
        onCreate(sQLiteDatabase);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized long mo33314a(String str, Long l) {
        long j;
        if (l == null) {
            j = mo33315a("long_store", str);
        } else {
            j = mo33316a("long_store", str, (Object) l);
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r2.isOpen() != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0078, code lost:
        if (r2.isOpen() != false) goto L_0x0048;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized long mo33316a(java.lang.String r8, java.lang.String r9, java.lang.Object r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            r1 = 1
            r2 = 0
            android.database.sqlite.SQLiteDatabase r2 = r7.getWritableDatabase()     // Catch:{ SQLiteException -> 0x004c, StackOverflowError -> 0x001a }
            long r8 = r7.mo33312a(r2, r8, r9, r10)     // Catch:{ SQLiteException -> 0x004c, StackOverflowError -> 0x001a }
            if (r2 == 0) goto L_0x007d
            boolean r10 = r2.isOpen()     // Catch:{ all -> 0x008b }
            if (r10 == 0) goto L_0x007d
            r7.close()     // Catch:{ all -> 0x008b }
            goto L_0x007d
        L_0x0018:
            r8 = move-exception
            goto L_0x007f
        L_0x001a:
            r10 = move-exception
            io.rakam.api.i r3 = f25520e     // Catch:{ all -> 0x0018 }
            java.lang.String r4 = "io.rakam.api.DatabaseHelper"
            java.lang.String r5 = "insertOrReplaceKeyValue in %s failed"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x0018 }
            r6[r0] = r8     // Catch:{ all -> 0x0018 }
            java.lang.String r8 = java.lang.String.format(r5, r6)     // Catch:{ all -> 0x0018 }
            r3.mo33370a(r4, r8, r10)     // Catch:{ all -> 0x0018 }
            io.rakam.api.e r8 = p036io.rakam.api.C9022e.m29662c()     // Catch:{ all -> 0x0018 }
            java.lang.String r3 = "DB: Failed to insertOrReplaceKeyValue %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0018 }
            r1[r0] = r9     // Catch:{ all -> 0x0018 }
            java.lang.String r9 = java.lang.String.format(r3, r1)     // Catch:{ all -> 0x0018 }
            r8.mo33355a(r9, r10)     // Catch:{ all -> 0x0018 }
            r7.m29583d()     // Catch:{ all -> 0x0018 }
            if (r2 == 0) goto L_0x007b
            boolean r8 = r2.isOpen()     // Catch:{ all -> 0x008b }
            if (r8 == 0) goto L_0x007b
        L_0x0048:
            r7.close()     // Catch:{ all -> 0x008b }
            goto L_0x007b
        L_0x004c:
            r10 = move-exception
            io.rakam.api.i r3 = f25520e     // Catch:{ all -> 0x0018 }
            java.lang.String r4 = "io.rakam.api.DatabaseHelper"
            java.lang.String r5 = "insertOrReplaceKeyValue in %s failed"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x0018 }
            r6[r0] = r8     // Catch:{ all -> 0x0018 }
            java.lang.String r8 = java.lang.String.format(r5, r6)     // Catch:{ all -> 0x0018 }
            r3.mo33370a(r4, r8, r10)     // Catch:{ all -> 0x0018 }
            io.rakam.api.e r8 = p036io.rakam.api.C9022e.m29662c()     // Catch:{ all -> 0x0018 }
            java.lang.String r3 = "DB: Failed to insertOrReplaceKeyValue %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0018 }
            r1[r0] = r9     // Catch:{ all -> 0x0018 }
            java.lang.String r9 = java.lang.String.format(r3, r1)     // Catch:{ all -> 0x0018 }
            r8.mo33355a(r9, r10)     // Catch:{ all -> 0x0018 }
            r7.m29583d()     // Catch:{ all -> 0x0018 }
            if (r2 == 0) goto L_0x007b
            boolean r8 = r2.isOpen()     // Catch:{ all -> 0x008b }
            if (r8 == 0) goto L_0x007b
            goto L_0x0048
        L_0x007b:
            r8 = -1
        L_0x007d:
            monitor-exit(r7)
            return r8
        L_0x007f:
            if (r2 == 0) goto L_0x008a
            boolean r9 = r2.isOpen()     // Catch:{ all -> 0x008b }
            if (r9 == 0) goto L_0x008a
            r7.close()     // Catch:{ all -> 0x008b }
        L_0x008a:
            throw r8     // Catch:{ all -> 0x008b }
        L_0x008b:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x008f
        L_0x008e:
            throw r8
        L_0x008f:
            goto L_0x008e
        */
        throw new UnsupportedOperationException("Method not decompiled: p036io.rakam.api.C9017b.mo33316a(java.lang.String, java.lang.String, java.lang.Object):long");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized String mo33331d(String str) {
        return (String) mo33325b(AccountAnalytics.STORE, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo33332d(long j) {
        m29581c("events", j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized void mo33330c(long j) {
        m29580b("events", j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e9, code lost:
        if (r3.isOpen() != false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00eb, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0112, code lost:
        if (r3.isOpen() != false) goto L_0x00eb;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m29583d() {
        /*
            r10 = this;
            java.lang.String r0 = "DB: Failed to run databaseReset callback in delete"
            java.lang.String r1 = "databaseReset callback failed during delete"
            java.lang.String r2 = "io.rakam.api.DatabaseHelper"
            r3 = 0
            r4 = 1
            r5 = 0
            r10.close()     // Catch:{ SecurityException -> 0x0069 }
            java.io.File r6 = r10.f25521a     // Catch:{ SecurityException -> 0x0069 }
            r6.delete()     // Catch:{ SecurityException -> 0x0069 }
            io.rakam.api.c r6 = r10.f25523c
            if (r6 == 0) goto L_0x00cd
            boolean r6 = r10.f25522b
            if (r6 == 0) goto L_0x00cd
            r10.f25522b = r5
            android.database.sqlite.SQLiteDatabase r3 = r10.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0035 }
            io.rakam.api.c r6 = r10.f25523c     // Catch:{ SQLiteException -> 0x0035 }
            r6.mo16605a(r3)     // Catch:{ SQLiteException -> 0x0035 }
            r10.f25522b = r4
            if (r3 == 0) goto L_0x00cd
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x00cd
        L_0x002e:
            r10.close()
            goto L_0x00cd
        L_0x0033:
            r0 = move-exception
            goto L_0x0059
        L_0x0035:
            r6 = move-exception
            io.rakam.api.i r7 = f25520e     // Catch:{ all -> 0x0033 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = java.lang.String.format(r1, r8)     // Catch:{ all -> 0x0033 }
            r7.mo33370a(r2, r1, r6)     // Catch:{ all -> 0x0033 }
            io.rakam.api.e r1 = p036io.rakam.api.C9022e.m29662c()     // Catch:{ all -> 0x0033 }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x0033 }
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x0033 }
            r1.mo33355a(r0, r6)     // Catch:{ all -> 0x0033 }
            r10.f25522b = r4
            if (r3 == 0) goto L_0x00cd
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x00cd
            goto L_0x002e
        L_0x0059:
            r10.f25522b = r4
            if (r3 == 0) goto L_0x0066
            boolean r1 = r3.isOpen()
            if (r1 == 0) goto L_0x0066
            r10.close()
        L_0x0066:
            throw r0
        L_0x0067:
            r6 = move-exception
            goto L_0x00ce
        L_0x0069:
            r6 = move-exception
            io.rakam.api.i r7 = f25520e     // Catch:{ all -> 0x0067 }
            java.lang.String r8 = "delete failed"
            r7.mo33370a(r2, r8, r6)     // Catch:{ all -> 0x0067 }
            io.rakam.api.e r6 = p036io.rakam.api.C9022e.m29662c()     // Catch:{ all -> 0x0067 }
            java.lang.String r7 = "DB: Failed to delete database"
            r6.mo33354a((java.lang.String) r7)     // Catch:{ all -> 0x0067 }
            io.rakam.api.c r6 = r10.f25523c
            if (r6 == 0) goto L_0x00cd
            boolean r6 = r10.f25522b
            if (r6 == 0) goto L_0x00cd
            r10.f25522b = r5
            android.database.sqlite.SQLiteDatabase r3 = r10.getWritableDatabase()     // Catch:{ SQLiteException -> 0x009a }
            io.rakam.api.c r6 = r10.f25523c     // Catch:{ SQLiteException -> 0x009a }
            r6.mo16605a(r3)     // Catch:{ SQLiteException -> 0x009a }
            r10.f25522b = r4
            if (r3 == 0) goto L_0x00cd
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x00cd
            goto L_0x002e
        L_0x0098:
            r0 = move-exception
            goto L_0x00bf
        L_0x009a:
            r6 = move-exception
            io.rakam.api.i r7 = f25520e     // Catch:{ all -> 0x0098 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = java.lang.String.format(r1, r8)     // Catch:{ all -> 0x0098 }
            r7.mo33370a(r2, r1, r6)     // Catch:{ all -> 0x0098 }
            io.rakam.api.e r1 = p036io.rakam.api.C9022e.m29662c()     // Catch:{ all -> 0x0098 }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x0098 }
            r1.mo33355a(r0, r6)     // Catch:{ all -> 0x0098 }
            r10.f25522b = r4
            if (r3 == 0) goto L_0x00cd
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x00cd
            goto L_0x002e
        L_0x00bf:
            r10.f25522b = r4
            if (r3 == 0) goto L_0x00cc
            boolean r1 = r3.isOpen()
            if (r1 == 0) goto L_0x00cc
            r10.close()
        L_0x00cc:
            throw r0
        L_0x00cd:
            return
        L_0x00ce:
            io.rakam.api.c r7 = r10.f25523c
            if (r7 == 0) goto L_0x0123
            boolean r7 = r10.f25522b
            if (r7 == 0) goto L_0x0123
            r10.f25522b = r5
            android.database.sqlite.SQLiteDatabase r3 = r10.getWritableDatabase()     // Catch:{ SQLiteException -> 0x00f1 }
            io.rakam.api.c r7 = r10.f25523c     // Catch:{ SQLiteException -> 0x00f1 }
            r7.mo16605a(r3)     // Catch:{ SQLiteException -> 0x00f1 }
            r10.f25522b = r4
            if (r3 == 0) goto L_0x0123
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x0123
        L_0x00eb:
            r10.close()
            goto L_0x0123
        L_0x00ef:
            r0 = move-exception
            goto L_0x0115
        L_0x00f1:
            r7 = move-exception
            io.rakam.api.i r8 = f25520e     // Catch:{ all -> 0x00ef }
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x00ef }
            java.lang.String r1 = java.lang.String.format(r1, r9)     // Catch:{ all -> 0x00ef }
            r8.mo33370a(r2, r1, r7)     // Catch:{ all -> 0x00ef }
            io.rakam.api.e r1 = p036io.rakam.api.C9022e.m29662c()     // Catch:{ all -> 0x00ef }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x00ef }
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x00ef }
            r1.mo33355a(r0, r7)     // Catch:{ all -> 0x00ef }
            r10.f25522b = r4
            if (r3 == 0) goto L_0x0123
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x0123
            goto L_0x00eb
        L_0x0115:
            r10.f25522b = r4
            if (r3 == 0) goto L_0x0122
            boolean r1 = r3.isOpen()
            if (r1 == 0) goto L_0x0122
            r10.close()
        L_0x0122:
            throw r0
        L_0x0123:
            goto L_0x0125
        L_0x0124:
            throw r6
        L_0x0125:
            goto L_0x0124
        */
        throw new UnsupportedOperationException("Method not decompiled: p036io.rakam.api.C9017b.m29583d():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized void mo33334f(long j) {
        m29581c("identifys", j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized List<JSONObject> mo33326b(long j, long j2) throws JSONException {
        return mo33319a("identifys", j, j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized long mo33321b() {
        return m29585f("identifys");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized long mo33322b(long j) {
        return m29575a("identifys", j);
    }

    /* renamed from: b */
    private synchronized void m29580b(String str, long j) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.delete(str, "id = " + j, (String[]) null);
        } catch (SQLiteException e) {
            f25520e.mo33370a("io.rakam.api.DatabaseHelper", String.format("removeEvent from %s failed", new Object[]{str}), e);
            C9022e.m29662c().mo33355a(String.format("DB: Failed to removeEvent from table %s", new Object[]{str}), e);
            m29583d();
        } catch (StackOverflowError e2) {
            try {
                f25520e.mo33370a("io.rakam.api.DatabaseHelper", String.format("removeEvent from %s failed", new Object[]{str}), e2);
                C9022e.m29662c().mo33355a(String.format("DB: Failed to removeEvent from table %s", new Object[]{str}), e2);
                m29583d();
            } catch (Throwable th) {
                close();
                throw th;
            }
        }
        close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized long mo33312a(SQLiteDatabase sQLiteDatabase, String str, String str2, Object obj) throws SQLiteException, StackOverflowError {
        long b;
        ContentValues contentValues = new ContentValues();
        contentValues.put(RoomNotification.KEY, str2);
        if (obj instanceof Long) {
            contentValues.put(DonationsAnalytics.VALUE, (Long) obj);
        } else {
            contentValues.put(DonationsAnalytics.VALUE, (String) obj);
        }
        b = mo33323b(sQLiteDatabase, str, contentValues);
        if (b == -1) {
            f25520e.mo33375d("io.rakam.api.DatabaseHelper", "Insert failed");
        }
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized long mo33315a(String str, String str2) {
        long j;
        try {
            j = (long) getWritableDatabase().delete(str, "key=?", new String[]{str2});
            close();
        } catch (SQLiteException e) {
            f25520e.mo33370a("io.rakam.api.DatabaseHelper", String.format("deleteKey from %s failed", new Object[]{str}), e);
            C9022e.m29662c().mo33355a(String.format("DB: Failed to deleteKey: %s", new Object[]{str2}), e);
            m29583d();
            close();
            j = -1;
            return j;
        } catch (StackOverflowError e2) {
            try {
                f25520e.mo33370a("io.rakam.api.DatabaseHelper", String.format("deleteKey from %s failed", new Object[]{str}), e2);
                C9022e.m29662c().mo33355a(String.format("DB: Failed to deleteKey: %s", new Object[]{str2}), e2);
                m29583d();
                close();
                j = -1;
                return j;
            } catch (Throwable th) {
                close();
                throw th;
            }
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized long mo33313a(String str) {
        return m29582d("events", str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized long mo33311a(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) throws SQLiteException, StackOverflowError {
        return sQLiteDatabase.insert(str, (String) null, contentValues);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized List<JSONObject> mo33318a(long j, long j2) throws JSONException {
        return mo33319a("events", j, j2);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00df A[SYNTHETIC, Splitter:B:43:0x00df] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010b A[SYNTHETIC, Splitter:B:49:0x010b] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0114 A[SYNTHETIC, Splitter:B:54:0x0114] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:46:0x00e4=Splitter:B:46:0x00e4, B:40:0x00b8=Splitter:B:40:0x00b8} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List<org.json.JSONObject> mo33319a(java.lang.String r18, long r19, long r21) throws org.json.JSONException {
        /*
            r17 = this;
            r0 = r19
            r2 = r21
            monitor-enter(r17)
            java.util.LinkedList r11 = new java.util.LinkedList     // Catch:{ all -> 0x011b }
            r11.<init>()     // Catch:{ all -> 0x011b }
            r12 = 0
            r13 = 1
            r14 = 0
            android.database.sqlite.SQLiteDatabase r4 = r17.getReadableDatabase()     // Catch:{ SQLiteException -> 0x00e3, StackOverflowError -> 0x00b7, RuntimeException -> 0x009d }
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x00e3, StackOverflowError -> 0x00b7, RuntimeException -> 0x009d }
            java.lang.String r6 = "id"
            r5[r14] = r6     // Catch:{ SQLiteException -> 0x00e3, StackOverflowError -> 0x00b7, RuntimeException -> 0x009d }
            java.lang.String r6 = "event"
            r5[r13] = r6     // Catch:{ SQLiteException -> 0x00e3, StackOverflowError -> 0x00b7, RuntimeException -> 0x009d }
            r6 = 0
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x0034
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00e3, StackOverflowError -> 0x00b7, RuntimeException -> 0x009d }
            r8.<init>()     // Catch:{ SQLiteException -> 0x00e3, StackOverflowError -> 0x00b7, RuntimeException -> 0x009d }
            java.lang.String r9 = "id <= "
            r8.append(r9)     // Catch:{ SQLiteException -> 0x00e3, StackOverflowError -> 0x00b7, RuntimeException -> 0x009d }
            r8.append(r0)     // Catch:{ SQLiteException -> 0x00e3, StackOverflowError -> 0x00b7, RuntimeException -> 0x009d }
            java.lang.String r0 = r8.toString()     // Catch:{ SQLiteException -> 0x00e3, StackOverflowError -> 0x00b7, RuntimeException -> 0x009d }
            goto L_0x0035
        L_0x0034:
            r0 = r12
        L_0x0035:
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r15 = "id ASC"
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x0052
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00e3, StackOverflowError -> 0x00b7, RuntimeException -> 0x009d }
            r1.<init>()     // Catch:{ SQLiteException -> 0x00e3, StackOverflowError -> 0x00b7, RuntimeException -> 0x009d }
            java.lang.String r6 = ""
            r1.append(r6)     // Catch:{ SQLiteException -> 0x00e3, StackOverflowError -> 0x00b7, RuntimeException -> 0x009d }
            r1.append(r2)     // Catch:{ SQLiteException -> 0x00e3, StackOverflowError -> 0x00b7, RuntimeException -> 0x009d }
            java.lang.String r1 = r1.toString()     // Catch:{ SQLiteException -> 0x00e3, StackOverflowError -> 0x00b7, RuntimeException -> 0x009d }
            r16 = r1
            goto L_0x0054
        L_0x0052:
            r16 = r12
        L_0x0054:
            r1 = r17
            r2 = r4
            r3 = r18
            r4 = r5
            r5 = r0
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r15
            r10 = r16
            android.database.Cursor r1 = r1.mo33317a(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x00e3, StackOverflowError -> 0x00b7, RuntimeException -> 0x009d }
        L_0x0065:
            boolean r0 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0097, StackOverflowError -> 0x0094, RuntimeException -> 0x0092 }
            if (r0 == 0) goto L_0x0088
            long r2 = r1.getLong(r14)     // Catch:{ SQLiteException -> 0x0097, StackOverflowError -> 0x0094, RuntimeException -> 0x0092 }
            java.lang.String r0 = r1.getString(r13)     // Catch:{ SQLiteException -> 0x0097, StackOverflowError -> 0x0094, RuntimeException -> 0x0092 }
            boolean r4 = p036io.rakam.api.C9028k.m29695a((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x0097, StackOverflowError -> 0x0094, RuntimeException -> 0x0092 }
            if (r4 == 0) goto L_0x007a
            goto L_0x0065
        L_0x007a:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ SQLiteException -> 0x0097, StackOverflowError -> 0x0094, RuntimeException -> 0x0092 }
            r4.<init>(r0)     // Catch:{ SQLiteException -> 0x0097, StackOverflowError -> 0x0094, RuntimeException -> 0x0092 }
            java.lang.String r0 = "event_id"
            r4.put(r0, r2)     // Catch:{ SQLiteException -> 0x0097, StackOverflowError -> 0x0094, RuntimeException -> 0x0092 }
            r11.add(r4)     // Catch:{ SQLiteException -> 0x0097, StackOverflowError -> 0x0094, RuntimeException -> 0x0092 }
            goto L_0x0065
        L_0x0088:
            if (r1 == 0) goto L_0x008d
            r1.close()     // Catch:{ all -> 0x011b }
        L_0x008d:
            r17.close()     // Catch:{ all -> 0x011b }
            goto L_0x0110
        L_0x0092:
            r0 = move-exception
            goto L_0x009f
        L_0x0094:
            r0 = move-exception
            r12 = r1
            goto L_0x00b8
        L_0x0097:
            r0 = move-exception
            r12 = r1
            goto L_0x00e4
        L_0x009a:
            r0 = move-exception
            goto L_0x0112
        L_0x009d:
            r0 = move-exception
            r1 = r12
        L_0x009f:
            io.rakam.api.e r2 = p036io.rakam.api.C9022e.m29662c()     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = "DB: Failed to getEventsFromTable %s"
            java.lang.Object[] r4 = new java.lang.Object[r13]     // Catch:{ all -> 0x00b4 }
            r4[r14] = r18     // Catch:{ all -> 0x00b4 }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x00b4 }
            r2.mo33355a(r3, r0)     // Catch:{ all -> 0x00b4 }
            m29579a((java.lang.RuntimeException) r0)     // Catch:{ all -> 0x00b4 }
            throw r12
        L_0x00b4:
            r0 = move-exception
            r12 = r1
            goto L_0x0112
        L_0x00b7:
            r0 = move-exception
        L_0x00b8:
            io.rakam.api.i r1 = f25520e     // Catch:{ all -> 0x009a }
            java.lang.String r2 = "io.rakam.api.DatabaseHelper"
            java.lang.String r3 = "getEvents from %s failed"
            java.lang.Object[] r4 = new java.lang.Object[r13]     // Catch:{ all -> 0x009a }
            r4[r14] = r18     // Catch:{ all -> 0x009a }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x009a }
            r1.mo33370a(r2, r3, r0)     // Catch:{ all -> 0x009a }
            io.rakam.api.e r1 = p036io.rakam.api.C9022e.m29662c()     // Catch:{ all -> 0x009a }
            java.lang.String r2 = "DB: Failed to getEventsFromTable %s"
            java.lang.Object[] r3 = new java.lang.Object[r13]     // Catch:{ all -> 0x009a }
            r3[r14] = r18     // Catch:{ all -> 0x009a }
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x009a }
            r1.mo33355a(r2, r0)     // Catch:{ all -> 0x009a }
            r17.m29583d()     // Catch:{ all -> 0x009a }
            if (r12 == 0) goto L_0x008d
            r12.close()     // Catch:{ all -> 0x011b }
            goto L_0x008d
        L_0x00e3:
            r0 = move-exception
        L_0x00e4:
            io.rakam.api.i r1 = f25520e     // Catch:{ all -> 0x009a }
            java.lang.String r2 = "io.rakam.api.DatabaseHelper"
            java.lang.String r3 = "getEvents from %s failed"
            java.lang.Object[] r4 = new java.lang.Object[r13]     // Catch:{ all -> 0x009a }
            r4[r14] = r18     // Catch:{ all -> 0x009a }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x009a }
            r1.mo33370a(r2, r3, r0)     // Catch:{ all -> 0x009a }
            io.rakam.api.e r1 = p036io.rakam.api.C9022e.m29662c()     // Catch:{ all -> 0x009a }
            java.lang.String r2 = "DB: Failed to getEventsFromTable %s"
            java.lang.Object[] r3 = new java.lang.Object[r13]     // Catch:{ all -> 0x009a }
            r3[r14] = r18     // Catch:{ all -> 0x009a }
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x009a }
            r1.mo33355a(r2, r0)     // Catch:{ all -> 0x009a }
            r17.m29583d()     // Catch:{ all -> 0x009a }
            if (r12 == 0) goto L_0x008d
            r12.close()     // Catch:{ all -> 0x011b }
            goto L_0x008d
        L_0x0110:
            monitor-exit(r17)
            return r11
        L_0x0112:
            if (r12 == 0) goto L_0x0117
            r12.close()     // Catch:{ all -> 0x011b }
        L_0x0117:
            r17.close()     // Catch:{ all -> 0x011b }
            throw r0     // Catch:{ all -> 0x011b }
        L_0x011b:
            r0 = move-exception
            monitor-exit(r17)
            goto L_0x011f
        L_0x011e:
            throw r0
        L_0x011f:
            goto L_0x011e
        */
        throw new UnsupportedOperationException("Method not decompiled: p036io.rakam.api.C9017b.mo33319a(java.lang.String, long, long):java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized long mo33309a() {
        return m29585f("events");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized long mo33310a(long j) {
        return m29575a("events", j);
    }

    /* renamed from: a */
    private synchronized long m29575a(String str, long j) {
        long j2;
        j2 = -1;
        SQLiteStatement sQLiteStatement = null;
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            sQLiteStatement = readableDatabase.compileStatement("SELECT id FROM " + str + " LIMIT 1 OFFSET " + (j - 1));
            try {
                j2 = sQLiteStatement.simpleQueryForLong();
            } catch (SQLiteDoneException e) {
                f25520e.mo33371a("io.rakam.api.DatabaseHelper", (Throwable) e);
            }
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
        } catch (SQLiteException e2) {
            f25520e.mo33370a("io.rakam.api.DatabaseHelper", String.format("getNthEventId from %s failed", new Object[]{str}), e2);
            C9022e.m29662c().mo33355a(String.format("DB: Failed to getNthEventId from table %s", new Object[]{str}), e2);
            m29583d();
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
        } catch (StackOverflowError e3) {
            try {
                f25520e.mo33370a("io.rakam.api.DatabaseHelper", String.format("getNthEventId from %s failed", new Object[]{str}), e3);
                C9022e.m29662c().mo33355a(String.format("DB: Failed to getNthEventId from table %s", new Object[]{str}), e3);
                m29583d();
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
            } catch (Throwable th) {
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                close();
                throw th;
            }
        }
        close();
        return j2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Cursor mo33317a(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        return sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
    }

    /* renamed from: a */
    private static void m29579a(RuntimeException runtimeException) {
        String message = runtimeException.getMessage();
        if (C9028k.m29695a(message) || !message.startsWith("Cursor window allocation of")) {
            throw runtimeException;
        }
        throw new CursorWindowAllocationException(message);
    }
}
