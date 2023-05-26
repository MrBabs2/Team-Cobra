package p050l.p103q.p104a.p105g;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import p050l.p103q.p104a.C5165b;
import p050l.p103q.p104a.C5166c;

/* renamed from: l.q.a.g.b */
/* compiled from: FrameworkSQLiteOpenHelper */
class C5177b implements C5166c {

    /* renamed from: a */
    private final C5178a f9162a;

    C5177b(Context context, String str, C5166c.C5167a aVar) {
        this.f9162a = m9618a(context, str, aVar);
    }

    /* renamed from: a */
    private C5178a m9618a(Context context, String str, C5166c.C5167a aVar) {
        return new C5178a(context, str, new C5174a[1], aVar);
    }

    /* renamed from: b */
    public String mo4445b() {
        return this.f9162a.getDatabaseName();
    }

    public void close() {
        this.f9162a.close();
    }

    /* renamed from: a */
    public void mo4444a(boolean z) {
        this.f9162a.setWriteAheadLoggingEnabled(z);
    }

    /* renamed from: a */
    public C5165b mo4442a() {
        return this.f9162a.mo17871a();
    }

    /* renamed from: l.q.a.g.b$a */
    /* compiled from: FrameworkSQLiteOpenHelper */
    static class C5178a extends SQLiteOpenHelper {

        /* renamed from: a */
        final C5174a[] f9163a;

        /* renamed from: b */
        final C5166c.C5167a f9164b;

        /* renamed from: c */
        private boolean f9165c;

        /* renamed from: l.q.a.g.b$a$a */
        /* compiled from: FrameworkSQLiteOpenHelper */
        class C5179a implements DatabaseErrorHandler {

            /* renamed from: a */
            final /* synthetic */ C5166c.C5167a f9166a;

            /* renamed from: b */
            final /* synthetic */ C5174a[] f9167b;

            C5179a(C5166c.C5167a aVar, C5174a[] aVarArr) {
                this.f9166a = aVar;
                this.f9167b = aVarArr;
            }

            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f9166a.mo17861b(C5178a.m9622a(this.f9167b, sQLiteDatabase));
            }
        }

        C5178a(Context context, String str, C5174a[] aVarArr, C5166c.C5167a aVar) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar.f9151a, new C5179a(aVar, aVarArr));
            this.f9164b = aVar;
            this.f9163a = aVarArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized C5165b mo17871a() {
            this.f9165c = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.f9165c) {
                close();
                return mo17871a();
            }
            return mo17872a(writableDatabase);
        }

        public synchronized void close() {
            super.close();
            this.f9163a[0] = null;
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f9164b.mo4415a((C5165b) mo17872a(sQLiteDatabase));
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f9164b.mo4418c(mo17872a(sQLiteDatabase));
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f9165c = true;
            this.f9164b.mo4416a(mo17872a(sQLiteDatabase), i, i2);
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f9165c) {
                this.f9164b.mo4419d(mo17872a(sQLiteDatabase));
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f9165c = true;
            this.f9164b.mo4417b(mo17872a(sQLiteDatabase), i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C5174a mo17872a(SQLiteDatabase sQLiteDatabase) {
            return m9622a(this.f9163a, sQLiteDatabase);
        }

        /* renamed from: a */
        static C5174a m9622a(C5174a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            C5174a aVar = aVarArr[0];
            if (aVar == null || !aVar.mo17867a(sQLiteDatabase)) {
                aVarArr[0] = new C5174a(sQLiteDatabase);
            }
            return aVarArr[0];
        }
    }
}
