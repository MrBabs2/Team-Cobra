package com.facebook.p032t.p181u;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.C4716f;
import com.facebook.internal.C6442l;
import com.facebook.internal.C6446m;
import com.facebook.internal.C6448n;
import com.facebook.internal.C6481y;
import com.facebook.p032t.C4728g;
import com.facebook.p032t.C6596m;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.t.u.d */
/* compiled from: AutomaticAnalyticsLogger */
public class C6654d {

    /* renamed from: a */
    private static final String f12397a = "com.facebook.t.u.d";

    /* renamed from: b */
    private static final C6596m f12398b = new C6596m(C4716f.m7696e());

    /* renamed from: com.facebook.t.u.d$a */
    /* compiled from: AutomaticAnalyticsLogger */
    private static class C6655a {

        /* renamed from: a */
        BigDecimal f12399a;

        /* renamed from: b */
        Currency f12400b;

        /* renamed from: c */
        Bundle f12401c;

        C6655a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
            this.f12399a = bigDecimal;
            this.f12400b = currency;
            this.f12401c = bundle;
        }
    }

    /* renamed from: a */
    public static void m14191a(String str, long j) {
        Context e = C4716f.m7696e();
        String f = C4716f.m7697f();
        C6481y.m13556a((Object) e, "context");
        C6446m a = C6448n.m13378a(f, false);
        if (a != null && a.mo20988a() && j > 0) {
            C6596m mVar = new C6596m(e);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_aa_time_spent_view_name", str);
            mVar.mo21336a("fb_aa_time_spent_on_view", (double) j, bundle);
        }
    }

    /* renamed from: b */
    public static void m14194b() {
        Context e = C4716f.m7696e();
        String f = C4716f.m7697f();
        boolean i = C4716f.m7700i();
        C6481y.m13556a((Object) e, "context");
        if (!i) {
            return;
        }
        if (e instanceof Application) {
            C4728g.m7725a((Application) e, f);
        } else {
            Log.w(f12397a, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
        }
    }

    /* renamed from: a */
    static void m14192a(String str, String str2, boolean z) {
        C6655a a;
        if (m14193a() && (a = m14189a(str, str2)) != null) {
            boolean z2 = false;
            if (z && C6442l.m13353a("app_events_if_auto_log_subs", C4716f.m7697f(), false)) {
                z2 = true;
            }
            if (z2) {
                f12398b.mo21340a(C6665i.m14219a(str2) ? "StartTrial" : "Subscribe", a.f12399a, a.f12400b, a.f12401c);
            } else {
                f12398b.mo21341a(a.f12399a, a.f12400b, a.f12401c);
            }
        }
    }

    /* renamed from: a */
    public static boolean m14193a() {
        C6446m c = C6448n.m13386c(C4716f.m7697f());
        return c != null && C4716f.m7700i() && c.mo20992e();
    }

    /* renamed from: a */
    private static C6655a m14189a(String str, String str2) {
        return m14190a(str, str2, (Map<String, String>) new HashMap());
    }

    /* renamed from: a */
    private static C6655a m14190a(String str, String str2, Map<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
            bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
            bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
            bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
            bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
            bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString("description"));
            String optString = jSONObject2.optString("type");
            bundle.putCharSequence("fb_iap_product_type", optString);
            if (optString.equals("subs")) {
                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                String optString2 = jSONObject2.optString("introductoryPriceCycles");
                if (!optString2.isEmpty()) {
                    bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence("fb_intro_price_cycles", optString2);
                }
            }
            for (String next : map.keySet()) {
                bundle.putCharSequence(next, map.get(next));
            }
            double d = (double) jSONObject2.getLong("price_amount_micros");
            Double.isNaN(d);
            return new C6655a(new BigDecimal(d / 1000000.0d), Currency.getInstance(jSONObject2.getString("price_currency_code")), bundle);
        } catch (JSONException e) {
            Log.e(f12397a, "Error parsing in-app subscription data.", e);
            return null;
        }
    }
}
