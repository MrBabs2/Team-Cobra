package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.internal.ads.zzwl;
import com.google.android.gms.internal.ads.zzwt;
import java.util.ArrayList;

public final class zzcjr {

    /* renamed from: a */
    private zzwj f20294a;

    /* renamed from: b */
    private Context f20295b;

    /* renamed from: c */
    private zzcjc f20296c;

    /* renamed from: d */
    private zzbai f20297d;

    public zzcjr(Context context, zzbai zzbai, zzwj zzwj, zzcjc zzcjc) {
        this.f20295b = context;
        this.f20297d = zzbai;
        this.f20294a = zzwj;
        this.f20296c = zzcjc;
    }

    /* renamed from: a */
    public final void mo28715a() {
        try {
            this.f20296c.mo28704a(new C7325bk(this));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            zzbad.m20519b(valueOf.length() != 0 ? "Error in offline signals database startup: ".concat(valueOf) : new String("Error in offline signals database startup: "));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Void mo28714a(SQLiteDatabase sQLiteDatabase) throws Exception {
        ArrayList<zzwt.zzi.zza> a = zzcjq.m22614a(sQLiteDatabase);
        zzwt.zzi.zzb j = zzwt.zzi.m25525j();
        j.mo29881a(this.f20295b.getPackageName());
        j.mo29883b(Build.MODEL);
        j.mo29878a(zzcjq.m22613a(sQLiteDatabase, 1));
        j.mo29880a((Iterable<? extends zzwt.zzi.zza>) a);
        int i = 2;
        j.mo29882b(zzcjq.m22613a(sQLiteDatabase, 2));
        j.mo29879a(zzk.zzln().mo25498b());
        this.f20294a.mo29858a((zzwk) new C7362ck((zzwt.zzi) ((zzdob) j.mo29143t())));
        zzxo zzxo = new zzxo();
        zzxo.f22972c = Integer.valueOf(this.f20297d.f18743g);
        zzxo.f22973d = Integer.valueOf(this.f20297d.f18744h);
        if (this.f20297d.f18745i) {
            i = 0;
        }
        zzxo.f22974e = Integer.valueOf(i);
        this.f20294a.mo29858a((zzwk) new C7399dk(zzxo));
        this.f20294a.mo29859a(zzwl.zza.zzb.OFFLINE_UPLOAD);
        sQLiteDatabase.delete("offline_signal_contents", (String) null, (String[]) null);
        ContentValues contentValues = new ContentValues();
        contentValues.put("total", 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{"failed_requests"});
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("total", 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues2, "statistic_name = ?", new String[]{"total_requests"});
        return null;
    }
}
