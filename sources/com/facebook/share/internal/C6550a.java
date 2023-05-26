package com.facebook.share.internal;

import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.SharePhoto;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.a */
/* compiled from: OpenGraphJSONUtility */
public final class C6550a {

    /* renamed from: com.facebook.share.internal.a$a */
    /* compiled from: OpenGraphJSONUtility */
    public interface C6551a {
        /* renamed from: a */
        JSONObject mo21258a(SharePhoto sharePhoto);
    }

    /* renamed from: a */
    public static JSONObject m13884a(ShareOpenGraphAction shareOpenGraphAction, C6551a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String next : shareOpenGraphAction.mo21291b()) {
            jSONObject.put(next, m13882a(shareOpenGraphAction.mo21289a(next), aVar));
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m13885a(ShareOpenGraphObject shareOpenGraphObject, C6551a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String next : shareOpenGraphObject.mo21291b()) {
            jSONObject.put(next, m13882a(shareOpenGraphObject.mo21289a(next), aVar));
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONArray m13883a(List list, C6551a aVar) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object a : list) {
            jSONArray.put(m13882a(a, aVar));
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static Object m13882a(Object obj, C6551a aVar) throws JSONException {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long)) {
            return obj;
        }
        if (obj instanceof SharePhoto) {
            if (aVar != null) {
                return aVar.mo21258a((SharePhoto) obj);
            }
            return null;
        } else if (obj instanceof ShareOpenGraphObject) {
            return m13885a((ShareOpenGraphObject) obj, aVar);
        } else {
            if (obj instanceof List) {
                return m13883a((List) obj, aVar);
            }
            throw new IllegalArgumentException("Invalid object found for JSON serialization: " + obj.toString());
        }
    }
}
