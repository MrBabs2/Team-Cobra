package p015cm.aptoide.analytics;

import java.util.Map;
import p015cm.aptoide.analytics.AnalyticsManager;

/* renamed from: cm.aptoide.analytics.EventLogger */
public interface EventLogger {
    void log(String str, Map<String, Object> map, AnalyticsManager.Action action, String str2);

    void setup();
}
