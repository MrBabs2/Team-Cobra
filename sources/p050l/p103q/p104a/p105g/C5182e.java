package p050l.p103q.p104a.p105g;

import android.database.sqlite.SQLiteStatement;
import p050l.p103q.p104a.C5173f;

/* renamed from: l.q.a.g.e */
/* compiled from: FrameworkSQLiteStatement */
class C5182e extends C5181d implements C5173f {

    /* renamed from: g */
    private final SQLiteStatement f9169g;

    C5182e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f9169g = sQLiteStatement;
    }

    public long executeInsert() {
        return this.f9169g.executeInsert();
    }

    public int executeUpdateDelete() {
        return this.f9169g.executeUpdateDelete();
    }
}
