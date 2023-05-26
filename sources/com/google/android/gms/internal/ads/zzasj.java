package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
public final class zzasj extends zzasl {

    /* renamed from: a */
    private final Object f18497a = new Object();

    /* renamed from: b */
    private final Context f18498b;

    /* renamed from: c */
    private SharedPreferences f18499c;

    /* renamed from: d */
    private final zzalj<JSONObject, JSONObject> f18500d;

    public zzasj(Context context, zzalj<JSONObject, JSONObject> zzalj) {
        this.f18498b = context.getApplicationContext();
        this.f18500d = zzalj;
    }

    /* renamed from: a */
    public final zzbbh<Void> mo27612a() {
        synchronized (this.f18497a) {
            if (this.f18499c == null) {
                this.f18499c = this.f18498b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (zzk.zzln().mo25498b() - this.f18499c.getLong("js_last_update", 0) < ((Long) zzyt.m25670e().mo27163a(zzacu.f17775A1)).longValue()) {
            return zzbar.m20539a(null);
        }
        return zzbar.m20543a(this.f18500d.mo27370a(m19906a(this.f18498b)), new C8014u3(this), zzbbm.f18749b);
    }

    /* renamed from: a */
    public static JSONObject m19906a(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzbai.m20531d().f18742f);
            jSONObject.put("mf", zzyt.m25670e().mo27163a(zzacu.f17779B1));
            jSONObject.put("cl", "248613007");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 11140);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.m16423b(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451009);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Void mo27613a(JSONObject jSONObject) {
        zzacu.m18984a(this.f18498b, 1, jSONObject);
        this.f18499c.edit().putLong("js_last_update", zzk.zzln().mo25498b()).apply();
        return null;
    }
}
