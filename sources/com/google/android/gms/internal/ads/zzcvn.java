package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcvn implements zzcuz<JSONObject> {

    /* renamed from: a */
    private final AdvertisingIdClient.Info f21031a;

    /* renamed from: b */
    private final String f21032b;

    public zzcvn(AdvertisingIdClient.Info info, Context context, String str) {
        this.f21031a = info;
        this.f21032b = str;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25833a(Object obj) {
        try {
            JSONObject a = zzazc.m20430a((JSONObject) obj, "pii");
            String str = null;
            boolean z = false;
            if (this.f21031a != null) {
                str = this.f21031a.getId();
                z = this.f21031a.isLimitAdTrackingEnabled();
            }
            if (!TextUtils.isEmpty(str)) {
                a.put("rdid", str);
                a.put("is_lat", z);
                a.put("idtype", "adid");
                return;
            }
            a.put("pdid", this.f21032b);
            a.put("pdidtype", "ssaid");
        } catch (JSONException e) {
            zzawz.m20168e("Failed putting Ad ID.", e);
        }
    }
}
