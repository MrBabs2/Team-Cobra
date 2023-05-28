package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.google.android.gms.internal.ads.yj */
final class C8178yj implements zzban<SQLiteDatabase> {

    /* renamed from: a */
    private final /* synthetic */ zzczc f17473a;

    C8178yj(zzcjc zzcjc, zzczc zzczc) {
        this.f17473a = zzczc;
    }

    /* renamed from: a */
    public final void mo25566a(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        zzbad.m20519b(valueOf.length() != 0 ? "Failed to get offline signal database: ".concat(valueOf) : new String("Failed to get offline signal database: "));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25565a(Object obj) {
        try {
            this.f17473a.apply((SQLiteDatabase) obj);
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            zzbad.m20519b(valueOf.length() != 0 ? "Error executing function on offline signal database: ".concat(valueOf) : new String("Error executing function on offline signal database: "));
        }
    }
}
