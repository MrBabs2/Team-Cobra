package p015cm.aptoide.analytics.implementation.loggers;

import java.util.Map;
import p015cm.aptoide.analytics.AnalyticsLogger;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.EventLogger;
import p015cm.aptoide.analytics.implementation.utils.MapToJsonMapper;
import p036io.rakam.api.C4759f;

/* renamed from: cm.aptoide.analytics.implementation.loggers.RakamEventLogger */
public class RakamEventLogger implements EventLogger {
    private static final String TAG = "RakamEventLogger";
    private final MapToJsonMapper jsonMapper;
    private final AnalyticsLogger logger;

    public RakamEventLogger(AnalyticsLogger analyticsLogger, MapToJsonMapper mapToJsonMapper) {
        this.logger = analyticsLogger;
        this.jsonMapper = mapToJsonMapper;
    }

    public void log(String str, Map<String, Object> map, AnalyticsManager.Action action, String str2) {
        if (map != null) {
            C4759f.m7803a().mo16572a(str, this.jsonMapper.mapToJsonObject(map));
        } else {
            C4759f.m7803a().mo16582b(str);
        }
        AnalyticsLogger analyticsLogger = this.logger;
        analyticsLogger.logDebug(TAG, "log() called with: eventName = [" + str + "], data = [" + map + "], action = [" + action + "], context = [" + str2 + "]");
    }

    public void setup() {
    }
}
