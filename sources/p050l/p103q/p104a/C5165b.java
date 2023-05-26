package p050l.p103q.p104a;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* renamed from: l.q.a.b */
/* compiled from: SupportSQLiteDatabase */
public interface C5165b extends Closeable {
    /* renamed from: a */
    Cursor mo17849a(C5172e eVar);

    /* renamed from: a */
    Cursor mo17850a(C5172e eVar, CancellationSignal cancellationSignal);

    void beginTransaction();

    /* renamed from: c */
    Cursor mo17852c(String str);

    C5173f compileStatement(String str);

    void endTransaction();

    void execSQL(String str) throws SQLException;

    List<Pair<String, String>> getAttachedDbs();

    String getPath();

    boolean inTransaction();

    boolean isOpen();

    void setTransactionSuccessful();
}
