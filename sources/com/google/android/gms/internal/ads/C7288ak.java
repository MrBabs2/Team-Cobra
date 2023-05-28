package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.internal.ads.zzwt;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.ak */
final /* synthetic */ class C7288ak implements zzczc {

    /* renamed from: a */
    private final C8215zj f14484a;

    /* renamed from: b */
    private final boolean f14485b;

    /* renamed from: c */
    private final ArrayList f14486c;

    /* renamed from: d */
    private final zzwt.zzg f14487d;

    /* renamed from: e */
    private final zzwt.zzi.zzc f14488e;

    C7288ak(C8215zj zjVar, boolean z, ArrayList arrayList, zzwt.zzg zzg, zzwt.zzi.zzc zzc) {
        this.f14484a = zjVar;
        this.f14485b = z;
        this.f14486c = arrayList;
        this.f14487d = zzg;
        this.f14488e = zzc;
    }

    public final Object apply(Object obj) {
        C8215zj zjVar = this.f14484a;
        boolean z = this.f14485b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        byte[] a = zjVar.f17651b.m22605a(z, this.f14486c, this.f14487d, this.f14488e);
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzk.zzln().mo25498b()));
        contentValues.put("serialized_proto_data", a);
        sQLiteDatabase.insert("offline_signal_contents", (String) null, contentValues);
        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET total = total+1 WHERE statistic_name = '%s'", new Object[]{"total_requests"}));
        if (!z) {
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET total = total+1 WHERE statistic_name = '%s'", new Object[]{"failed_requests"}));
        }
        return null;
    }
}
