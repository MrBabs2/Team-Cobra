package p050l.p103q.p104a.p105g;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.IOException;
import java.util.List;
import p050l.p103q.p104a.C5164a;
import p050l.p103q.p104a.C5165b;
import p050l.p103q.p104a.C5172e;
import p050l.p103q.p104a.C5173f;

/* renamed from: l.q.a.g.a */
/* compiled from: FrameworkSQLiteDatabase */
class C5174a implements C5165b {

    /* renamed from: g */
    private static final String[] f9158g = new String[0];

    /* renamed from: f */
    private final SQLiteDatabase f9159f;

    /* renamed from: l.q.a.g.a$a */
    /* compiled from: FrameworkSQLiteDatabase */
    class C5175a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        final /* synthetic */ C5172e f9160a;

        C5175a(C5174a aVar, C5172e eVar) {
            this.f9160a = eVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f9160a.mo4430a(new C5181d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* renamed from: l.q.a.g.a$b */
    /* compiled from: FrameworkSQLiteDatabase */
    class C5176b implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        final /* synthetic */ C5172e f9161a;

        C5176b(C5174a aVar, C5172e eVar) {
            this.f9161a = eVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f9161a.mo4430a(new C5181d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    C5174a(SQLiteDatabase sQLiteDatabase) {
        this.f9159f = sQLiteDatabase;
    }

    /* renamed from: a */
    public Cursor mo17849a(C5172e eVar) {
        return this.f9159f.rawQueryWithFactory(new C5175a(this, eVar), eVar.mo4428a(), f9158g, (String) null);
    }

    public void beginTransaction() {
        this.f9159f.beginTransaction();
    }

    /* renamed from: c */
    public Cursor mo17852c(String str) {
        return mo17849a((C5172e) new C5164a(str));
    }

    public void close() throws IOException {
        this.f9159f.close();
    }

    public C5173f compileStatement(String str) {
        return new C5182e(this.f9159f.compileStatement(str));
    }

    public void endTransaction() {
        this.f9159f.endTransaction();
    }

    public void execSQL(String str) throws SQLException {
        this.f9159f.execSQL(str);
    }

    public List<Pair<String, String>> getAttachedDbs() {
        return this.f9159f.getAttachedDbs();
    }

    public String getPath() {
        return this.f9159f.getPath();
    }

    public boolean inTransaction() {
        return this.f9159f.inTransaction();
    }

    public boolean isOpen() {
        return this.f9159f.isOpen();
    }

    public void setTransactionSuccessful() {
        this.f9159f.setTransactionSuccessful();
    }

    /* renamed from: a */
    public Cursor mo17850a(C5172e eVar, CancellationSignal cancellationSignal) {
        return this.f9159f.rawQueryWithFactory(new C5176b(this, eVar), eVar.mo4428a(), f9158g, (String) null, cancellationSignal);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo17867a(SQLiteDatabase sQLiteDatabase) {
        return this.f9159f == sQLiteDatabase;
    }
}
