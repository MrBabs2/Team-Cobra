package p015cm.aptoide.analytics.implementation.utils;

import java.util.Map;
import p015cm.aptoide.analytics.KeyValueNormalizer;

/* renamed from: cm.aptoide.analytics.implementation.utils.AnalyticsEventParametersNormalizer */
public class AnalyticsEventParametersNormalizer implements KeyValueNormalizer {
    public Map<String, Object> normalize(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry next : map.entrySet()) {
            if (next.getValue() == null) {
                next.setValue("");
            }
        }
        return map;
    }
}
