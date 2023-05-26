package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.account.AccountAnalytics;

/* renamed from: com.google.android.gms.internal.ads.lg */
final /* synthetic */ class C7694lg implements Callable {

    /* renamed from: f */
    private final zzcxu f16170f;

    /* renamed from: g */
    private final zzcxm f16171g;

    /* renamed from: h */
    private final JSONObject f16172h;

    C7694lg(zzcaq zzcaq, zzcxu zzcxu, zzcxm zzcxm, JSONObject jSONObject) {
        this.f16170f = zzcxu;
        this.f16171g = zzcxm;
        this.f16172h = jSONObject;
    }

    public final Object call() {
        zzcxu zzcxu = this.f16170f;
        zzcxm zzcxm = this.f16171g;
        JSONObject jSONObject = this.f16172h;
        zzbyt zzbyt = new zzbyt();
        zzbyt.mo28520a(jSONObject.optInt("template_id", -1));
        zzbyt.mo28528a(jSONObject.optString("custom_template_id"));
        zzcxv zzcxv = zzcxu.f21162a.f21156a;
        if (zzcxv.f21170g.contains(Integer.toString(zzbyt.mo28547n()))) {
            if (zzbyt.mo28547n() == 3) {
                if (zzbyt.mo28538e() == null) {
                    throw new zzcmw("No custom template id for custom template ad response.", 0);
                } else if (!zzcxv.f21171h.contains(zzbyt.mo28538e())) {
                    throw new zzcmw("Unexpected custom template id in the response.", 0);
                }
            }
            zzbyt.mo28519a(jSONObject.optDouble("rating", -1.0d));
            String optString = jSONObject.optString("headline", (String) null);
            if (zzcxm.f21106E) {
                zzk.zzlg();
                String e = zzaxi.m20299e();
                StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 3 + String.valueOf(optString).length());
                sb.append(e);
                sb.append(" : ");
                sb.append(optString);
                optString = sb.toString();
            }
            zzbyt.mo28530a("headline", optString);
            zzbyt.mo28530a("body", jSONObject.optString("body", (String) null));
            zzbyt.mo28530a("call_to_action", jSONObject.optString("call_to_action", (String) null));
            zzbyt.mo28530a(AccountAnalytics.STORE, jSONObject.optString(AccountAnalytics.STORE, (String) null));
            zzbyt.mo28530a("price", jSONObject.optString("price", (String) null));
            zzbyt.mo28530a("advertiser", jSONObject.optString("advertiser", (String) null));
            return zzbyt;
        }
        int n = zzbyt.mo28547n();
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Invalid template ID: ");
        sb2.append(n);
        throw new zzcmw(sb2.toString(), 0);
    }
}
