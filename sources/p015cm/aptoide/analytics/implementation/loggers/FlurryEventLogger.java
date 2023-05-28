package p015cm.aptoide.analytics.implementation.loggers;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import p015cm.aptoide.analytics.AnalyticsLogger;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.EventLogger;
import p015cm.aptoide.analytics.SessionLogger;
import p112n.p113d.p114a.C10562b;

/* renamed from: cm.aptoide.analytics.implementation.loggers.FlurryEventLogger */
public class FlurryEventLogger implements EventLogger, SessionLogger {
    private static final String TAG = "FlurryEventLogger";
    private Context context;
    private final AnalyticsLogger logger;

    public FlurryEventLogger(Context context2, AnalyticsLogger analyticsLogger) {
        this.context = context2;
        this.logger = analyticsLogger;
    }

    private Map<String, String> map(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            if (next.getValue() != null) {
                hashMap.put((String) next.getKey(), next.getValue().toString());
            }
        }
        return hashMap;
    }

    public void endSession() {
        C10562b.m35855a(this.context);
    }

    public void log(String str, Map<String, Object> map, AnalyticsManager.Action action, String str2) {
        if (map != null) {
            C10562b.m35854a(str, map(map));
        } else {
            C10562b.m35853a(str);
        }
        AnalyticsLogger analyticsLogger = this.logger;
        String str3 = TAG;
        analyticsLogger.logDebug(str3, "log() called with: eventName = [" + str + "], data = [" + map + "], action = [" + action + "], context = [" + str2 + "]");
    }

    public void setup() {
    }

    public void startSession() {
        C10562b.m35858b(this.context);
    }
}
