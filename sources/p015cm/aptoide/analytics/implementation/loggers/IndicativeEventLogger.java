package p015cm.aptoide.analytics.implementation.loggers;

import java.util.Map;
import p015cm.aptoide.analytics.AnalyticsLogger;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.EventLogger;
import p112n.p115f.p116a.p117a.C5299a;

/* renamed from: cm.aptoide.analytics.implementation.loggers.IndicativeEventLogger */
public class IndicativeEventLogger implements EventLogger {
    private static final String TAG = "IndicativeEventLogger";
    private final AnalyticsLogger logger;

    public IndicativeEventLogger(AnalyticsLogger analyticsLogger) {
        this.logger = analyticsLogger;
    }

    public void log(String str, Map<String, Object> map, AnalyticsManager.Action action, String str2) {
        if (map != null) {
            C5299a.m10022a(str, map);
        } else {
            C5299a.m10031c(str);
        }
        AnalyticsLogger analyticsLogger = this.logger;
        analyticsLogger.logDebug(TAG, "log() called with: eventName = [" + str + "], data = [" + map + "], action = [" + action + "], context = [" + str2 + "]");
    }

    public void setup() {
    }
}
