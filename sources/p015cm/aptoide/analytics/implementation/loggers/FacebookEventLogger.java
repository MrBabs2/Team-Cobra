package p015cm.aptoide.analytics.implementation.loggers;

import android.os.Bundle;
import com.facebook.p032t.C4728g;
import java.util.Map;
import p015cm.aptoide.analytics.AnalyticsLogger;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.EventLogger;

/* renamed from: cm.aptoide.analytics.implementation.loggers.FacebookEventLogger */
public class FacebookEventLogger implements EventLogger {
    private static final String TAG = "FacebookEventLogger";
    private final C4728g facebook;
    private final AnalyticsLogger logger;

    public FacebookEventLogger(C4728g gVar, AnalyticsLogger analyticsLogger) {
        this.facebook = gVar;
        this.logger = analyticsLogger;
    }

    private Bundle mapToBundle(Map<String, Object> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry next : map.entrySet()) {
            bundle.putString((String) next.getKey(), next.getValue().toString());
        }
        return bundle;
    }

    public void log(String str, Map<String, Object> map, AnalyticsManager.Action action, String str2) {
        if (map != null) {
            this.facebook.mo15779a(str, mapToBundle(map));
        } else {
            this.facebook.mo15778a(str);
        }
        AnalyticsLogger analyticsLogger = this.logger;
        String str3 = TAG;
        analyticsLogger.logDebug(str3, "log() called with: eventName = [" + str + "], data = [" + map + "], action = [" + action + "], context = [" + str2 + "]");
    }

    public void setup() {
    }
}
