package com.google.android.gms.internal.ads;

import org.json.JSONObject;
import p015cm.aptoide.p016pt.install.installer.RootCommandOnSubscribe;
import p015cm.aptoide.p016pt.networking.BodyInterceptorV3;

/* renamed from: com.google.android.gms.internal.ads.il */
final /* synthetic */ class C7584il implements zzbal {

    /* renamed from: a */
    static final zzbal f15672a = new C7584il();

    private C7584il() {
    }

    public final zzbbh zzf(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION)) {
            return zzbar.m20539a(jSONObject.getJSONObject(BodyInterceptorV3.RESPONSE_MODE_JSON).getJSONArray("ads"));
        }
        throw new zzali("process json failed");
    }
}
