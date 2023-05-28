package com.google.android.gms.internal.ads;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.zzwt;
import java.util.ArrayList;

public final class zzcjq {
    /* renamed from: a */
    public static ArrayList<zzwt.zzi.zza> m22614a(SQLiteDatabase sQLiteDatabase) {
        ArrayList<zzwt.zzi.zza> arrayList = new ArrayList<>();
        Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        while (query.moveToNext()) {
            try {
                arrayList.add(zzwt.zzi.zza.m25528a(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (zzdok e) {
                zzbad.m20519b("Unable to deserialize proto from offline signals database:");
                zzbad.m20519b(e.getMessage());
            }
        }
        query.close();
        return arrayList;
    }

    /* renamed from: a */
    public static int m22613a(SQLiteDatabase sQLiteDatabase, int i) {
        int i2 = 0;
        String[] strArr = {"total"};
        String[] strArr2 = new String[1];
        if (i == 1) {
            strArr2[0] = "failed_requests";
        } else if (i == 2) {
            strArr2[0] = "total_requests";
        }
        Cursor query = sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, (String) null, (String) null, (String) null);
        if (query.getCount() > 0) {
            query.moveToNext();
            i2 = 0 + query.getInt(query.getColumnIndexOrThrow("total"));
        }
        query.close();
        return i2;
    }
}
