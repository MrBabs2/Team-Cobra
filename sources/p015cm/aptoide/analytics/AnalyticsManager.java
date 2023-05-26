package p015cm.aptoide.analytics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: cm.aptoide.analytics.AnalyticsManager */
public class AnalyticsManager {
    private static final String TAG = "AnalyticsManager";
    private final AnalyticsLogger analyticsLogger;
    private final KeyValueNormalizer analyticsNormalizer;
    private Map<EventLogger, Collection<String>> eventLoggers;
    private final KnockEventLogger knockEventLogger;
    private List<SessionLogger> sessionLoggers;

    /* renamed from: cm.aptoide.analytics.AnalyticsManager$Action */
    public enum Action {
        CLICK,
        SCROLL,
        INPUT,
        AUTO,
        ROOT,
        VIEW,
        INSTALL,
        OPEN,
        IMPRESSION,
        PULL_REFRESH,
        DISMISS,
        ENDLESS_SCROLL
    }

    /* renamed from: cm.aptoide.analytics.AnalyticsManager$Builder */
    public static class Builder {
        private AnalyticsLogger analyticsLogger;
        private KeyValueNormalizer analyticsNormalizer;
        private final Map<EventLogger, Collection<String>> eventLoggers = new HashMap();
        private KnockEventLogger knockEventLogger;
        private List<SessionLogger> sessionLoggers = new ArrayList();

        public Builder addLogger(EventLogger eventLogger, Collection<String> collection) {
            this.eventLoggers.put(eventLogger, collection);
            return this;
        }

        public Builder addSessionLogger(SessionLogger sessionLogger) {
            this.sessionLoggers.add(sessionLogger);
            return this;
        }

        public AnalyticsManager build() {
            if (this.knockEventLogger == null) {
                throw new IllegalArgumentException("Analytics manager need an okhttp client");
            } else if (this.eventLoggers.size() < 1) {
                throw new IllegalArgumentException("Analytics manager need at least one logger");
            } else if (this.analyticsLogger != null) {
                return new AnalyticsManager(this.knockEventLogger, this.eventLoggers, this.sessionLoggers, this.analyticsNormalizer, this.analyticsLogger);
            } else {
                throw new IllegalArgumentException("Analytics manager need a Debug Logger");
            }
        }

        public Builder setAnalyticsNormalizer(KeyValueNormalizer keyValueNormalizer) {
            this.analyticsNormalizer = keyValueNormalizer;
            return this;
        }

        public Builder setDebugLogger(AnalyticsLogger analyticsLogger2) {
            this.analyticsLogger = analyticsLogger2;
            return this;
        }

        public Builder setKnockLogger(KnockEventLogger knockEventLogger2) {
            this.knockEventLogger = knockEventLogger2;
            return this;
        }
    }

    public void endSession() {
        for (SessionLogger endSession : this.sessionLoggers) {
            endSession.endSession();
        }
    }

    public void logEvent(Map<String, Object> map, String str, Action action, String str2) {
        AnalyticsLogger analyticsLogger2 = this.analyticsLogger;
        String str3 = TAG;
        analyticsLogger2.logDebug(str3, "logEvent() called with: eventName = [" + str + "], data = [" + map + "],  action = [" + action + "], context = [" + str2 + "]");
        Map<String, Object> normalize = this.analyticsNormalizer.normalize(map);
        int i = 0;
        for (Map.Entry next : this.eventLoggers.entrySet()) {
            if (((Collection) next.getValue()).contains(str)) {
                ((EventLogger) next.getKey()).log(str, normalize, action, str2);
                i++;
            }
        }
        if (i <= 0) {
            AnalyticsLogger analyticsLogger3 = this.analyticsLogger;
            String str4 = TAG;
            analyticsLogger3.logWarningDebug(str4, str + " event not sent ");
        }
    }

    public void setup() {
        for (Map.Entry<EventLogger, Collection<String>> key : this.eventLoggers.entrySet()) {
            ((EventLogger) key.getKey()).setup();
        }
    }

    public void startSession() {
        for (SessionLogger startSession : this.sessionLoggers) {
            startSession.startSession();
        }
    }

    private AnalyticsManager(KnockEventLogger knockEventLogger2, Map<EventLogger, Collection<String>> map, List<SessionLogger> list, KeyValueNormalizer keyValueNormalizer, AnalyticsLogger analyticsLogger2) {
        this.knockEventLogger = knockEventLogger2;
        this.eventLoggers = map;
        this.sessionLoggers = list;
        this.analyticsNormalizer = keyValueNormalizer;
        this.analyticsLogger = analyticsLogger2;
    }

    public void logEvent(String str) {
        this.knockEventLogger.log(str);
    }
}
