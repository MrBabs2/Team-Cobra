package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public final class zzcja extends SQLiteOpenHelper {
    public zzcja(Context context) {
        super(context, "OfflineUpload.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_signal_contents (timestamp INTEGER PRIMARY_KEY, serialized_proto_data BLOB)");
        sQLiteDatabase.execSQL("CREATE TABLE offline_signal_statistics (statistic_name TEXT PRIMARY_KEY, total INTEGER)");
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", "failed_requests");
        contentValues.put("total", 0);
        sQLiteDatabase.insert("offline_signal_statistics", (String) null, contentValues);
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("statistic_name", "total_requests");
        contentValues2.put("total", 0);
        sQLiteDatabase.insert("offline_signal_statistics", (String) null, contentValues2);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_signal_contents");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_signal_statistics");
    }
}
