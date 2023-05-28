package p015cm.aptoide.analytics.implementation.network;

import java.util.Map;

/* renamed from: cm.aptoide.analytics.implementation.network.AnalyticsEventRequestBody */
public class AnalyticsEventRequestBody extends AnalyticsBaseBody {
    private final Map<String, Object> data;
    private final String timestamp;

    public AnalyticsEventRequestBody(Map<String, Object> map, String str) {
        this.data = map;
        this.timestamp = str;
    }

    public Map<String, Object> getData() {
        return this.data;
    }

    public String getTimestamp() {
        return this.timestamp;
    }
}
