package com.google.android.gms.internal.ads;

import android.location.Location;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcwp implements zzcuz<JSONObject> {

    /* renamed from: a */
    private final Location f21074a;

    public zzcwp(Location location) {
        this.f21074a = location;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25833a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (this.f21074a != null) {
                JSONObject jSONObject2 = new JSONObject();
                Float valueOf = Float.valueOf(this.f21074a.getAccuracy() * 1000.0f);
                Long valueOf2 = Long.valueOf(this.f21074a.getTime() * 1000);
                Long valueOf3 = Long.valueOf((long) (this.f21074a.getLatitude() * 1.0E7d));
                Long valueOf4 = Long.valueOf((long) (this.f21074a.getLongitude() * 1.0E7d));
                jSONObject2.put("radius", valueOf);
                jSONObject2.put("lat", valueOf3);
                jSONObject2.put("long", valueOf4);
                jSONObject2.put("time", valueOf2);
                jSONObject.put("uule", jSONObject2);
            }
        } catch (JSONException e) {
            zzawz.m20168e("Failed adding location to the request JSON.", e);
        }
    }
}
