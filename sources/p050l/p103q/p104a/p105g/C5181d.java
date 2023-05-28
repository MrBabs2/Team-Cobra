package p050l.p103q.p104a.p105g;

import android.database.sqlite.SQLiteProgram;
import p050l.p103q.p104a.C5171d;

/* renamed from: l.q.a.g.d */
/* compiled from: FrameworkSQLiteProgram */
class C5181d implements C5171d {

    /* renamed from: f */
    private final SQLiteProgram f9168f;

    C5181d(SQLiteProgram sQLiteProgram) {
        this.f9168f = sQLiteProgram;
    }

    public void bindBlob(int i, byte[] bArr) {
        this.f9168f.bindBlob(i, bArr);
    }

    public void bindDouble(int i, double d) {
        this.f9168f.bindDouble(i, d);
    }

    public void bindLong(int i, long j) {
        this.f9168f.bindLong(i, j);
    }

    public void bindNull(int i) {
        this.f9168f.bindNull(i);
    }

    public void bindString(int i, String str) {
        this.f9168f.bindString(i, str);
    }

    public void close() {
        this.f9168f.close();
    }
}
