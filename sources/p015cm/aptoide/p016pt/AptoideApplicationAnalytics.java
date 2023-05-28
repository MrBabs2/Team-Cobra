package p015cm.aptoide.p016pt;

import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.p032t.C4728g;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.analytics.AnalyticsManager;
import p036io.rakam.api.C4759f;
import p112n.p113d.p114a.C10562b;
import p112n.p115f.p116a.p117a.C5299a;

/* renamed from: cm.aptoide.pt.AptoideApplicationAnalytics */
public class AptoideApplicationAnalytics {
    private static final String APTOIDE_PACKAGE = "aptoide_package";
    private static final String CONTEXT = "APPLICATION";
    public static final String IS_ANDROID_TV = "Is_Android_Tv";
    private static final String IS_ANDROID_TV_FIELD = "is_android_tv";
    private final AnalyticsManager analyticsManager;

    public AptoideApplicationAnalytics(AnalyticsManager analyticsManager2) {
        this.analyticsManager = analyticsManager2;
    }

    private JSONObject addJsonLoginSuperProperty(boolean z, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("logged_in", z);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public void sendIsTvEvent(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(IS_ANDROID_TV_FIELD, Boolean.valueOf(z));
        this.analyticsManager.logEvent(hashMap, IS_ANDROID_TV, AnalyticsManager.Action.AUTO, CONTEXT);
    }

    public void setPackageDimension(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(APTOIDE_PACKAGE, str);
        C4728g.m7727a(bundle, (GraphRequest.C6344f) C1951b0.f4560a);
        C10562b.C10563b.m35860a(APTOIDE_PACKAGE, str);
    }

    public void setVersionCodeDimension(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("version code", str);
        C4728g.m7727a(bundle, (GraphRequest.C6344f) C1091a0.f3484a);
        C10562b.C10563b.m35860a("version code", str);
    }

    public void updateDimension(boolean z) {
        Bundle bundle = new Bundle();
        String str = "Not Logged In";
        bundle.putString("Logged In", z ? "Logged In" : str);
        C4728g.m7727a(bundle, (GraphRequest.C6344f) C4715z.f7990a);
        if (z) {
            str = "Logged In";
        }
        C10562b.C10563b.m35860a("Logged In", str);
        C4759f.m7803a().mo16567a(addJsonLoginSuperProperty(z, C4759f.m7803a().mo16579b()));
        C5299a.m10023a("logged_in", z);
    }
}
