package p015cm.aptoide.analytics.implementation.loggers;

import java.util.Map;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.EventLogger;
import p015cm.aptoide.analytics.SessionLogger;
import p015cm.aptoide.analytics.implementation.AptoideBiAnalytics;

/* renamed from: cm.aptoide.analytics.implementation.loggers.AptoideBiEventLogger */
public class AptoideBiEventLogger implements EventLogger, SessionLogger {
    private final AptoideBiAnalytics service;
    private final long sessionInterval;

    public AptoideBiEventLogger(AptoideBiAnalytics aptoideBiAnalytics, long j) {
        this.service = aptoideBiAnalytics;
        this.sessionInterval = j;
    }

    public void endSession() {
    }

    public void log(String str, Map<String, Object> map, AnalyticsManager.Action action, String str2) {
        this.service.log(str, map, action, str2);
    }

    public void setup() {
        this.service.setup();
    }

    public void startSession() {
        if (System.currentTimeMillis() - this.service.getTimestamp() > this.sessionInterval) {
            this.service.log("SESSION", (Map<String, Object>) null, AnalyticsManager.Action.OPEN, "APPLICATION");
        }
        this.service.saveTimestamp(System.currentTimeMillis());
    }
}
