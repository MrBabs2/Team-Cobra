package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.zzk;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;
import okhttp3.internal.cache.DiskLruCache;

@zzard
public final class zzacx {

    /* renamed from: a */
    private String f17993a;

    /* renamed from: b */
    private Map<String, String> f17994b;

    /* renamed from: c */
    private Context f17995c = null;

    /* renamed from: d */
    private String f17996d = null;

    public zzacx(Context context, String str) {
        String str2;
        this.f17995c = context;
        this.f17996d = str;
        this.f17993a = (String) zzyt.m25670e().mo27163a(zzacu.f17829O);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f17994b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        this.f17994b.put("v", "3");
        this.f17994b.put("os", Build.VERSION.RELEASE);
        this.f17994b.put("sdk", Build.VERSION.SDK);
        Map<String, String> map = this.f17994b;
        zzk.zzlg();
        map.put("device", zzaxi.m20290c());
        Map<String, String> map2 = this.f17994b;
        if (context.getApplicationContext() != null) {
            str2 = context.getApplicationContext().getPackageName();
        } else {
            str2 = context.getPackageName();
        }
        map2.put("app", str2);
        Map<String, String> map3 = this.f17994b;
        zzk.zzlg();
        map3.put("is_lite_sdk", zzaxi.m20308k(context) ? DiskLruCache.VERSION_1 : "0");
        Future<zzase> a = zzk.zzlr().mo27611a(this.f17995c);
        try {
            this.f17994b.put("network_coarse", Integer.toString(a.get().f18462j));
            this.f17994b.put("network_fine", Integer.toString(a.get().f18463k));
        } catch (Exception e) {
            zzk.zzlk().mo27734a((Throwable) e, "CsiConfiguration.CsiConfiguration");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo27167a() {
        return this.f17995c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo27168b() {
        return this.f17996d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo27169c() {
        return this.f17993a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Map<String, String> mo27170d() {
        return this.f17994b;
    }
}
