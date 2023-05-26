package p015cm.aptoide.analytics.implementation.utils;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cm.aptoide.analytics.implementation.utils.MapToJsonMapper */
public class MapToJsonMapper {
    public JSONObject mapToJsonObject(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : map.entrySet()) {
            if (next.getValue() != null) {
                try {
                    jSONObject.put((String) next.getKey(), next.getValue().toString());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return jSONObject;
    }
}
