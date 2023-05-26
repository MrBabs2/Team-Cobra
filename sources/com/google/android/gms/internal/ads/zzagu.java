package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
public final class zzagu implements zzaho<Object> {

    /* renamed from: a */
    private final zzagv f18092a;

    public zzagu(zzagv zzagv) {
        this.f18092a = zzagv;
    }

    /* renamed from: a */
    public final void mo25559a(Object obj, Map<String, String> map) {
        if (this.f18092a != null) {
            String str = map.get("name");
            if (str == null) {
                zzbad.m20521c("Ad metadata with no name parameter.");
                str = "";
            }
            Bundle bundle = null;
            if (map.containsKey("info")) {
                try {
                    bundle = m19227a(new JSONObject(map.get("info")));
                } catch (JSONException e) {
                    zzbad.m20520b("Failed to convert ad metadata to JSON.", e);
                }
            }
            if (bundle == null) {
                zzbad.m20519b("Failed to convert ad metadata to Bundle.");
            } else {
                this.f18092a.mo26408a(str, bundle);
            }
        }
    }

    /* renamed from: a */
    private static Bundle m19227a(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj != null) {
                if (obj instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Double) {
                    bundle.putDouble(next, ((Double) obj).doubleValue());
                } else if (obj instanceof Integer) {
                    bundle.putInt(next, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    bundle.putLong(next, ((Long) obj).longValue());
                } else if (obj instanceof String) {
                    bundle.putString(next, (String) obj);
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    if (!(jSONArray == null || jSONArray.length() == 0)) {
                        int length = jSONArray.length();
                        int i = 0;
                        Object obj2 = null;
                        int i2 = 0;
                        while (obj2 == null && i2 < length) {
                            obj2 = !jSONArray.isNull(i2) ? jSONArray.get(i2) : null;
                            i2++;
                        }
                        if (obj2 == null) {
                            String valueOf = String.valueOf(next);
                            zzbad.m20523d(valueOf.length() != 0 ? "Expected JSONArray with at least 1 non-null element for key:".concat(valueOf) : new String("Expected JSONArray with at least 1 non-null element for key:"));
                        } else if (obj2 instanceof JSONObject) {
                            Bundle[] bundleArr = new Bundle[length];
                            while (i < length) {
                                bundleArr[i] = !jSONArray.isNull(i) ? m19227a(jSONArray.optJSONObject(i)) : null;
                                i++;
                            }
                            bundle.putParcelableArray(next, bundleArr);
                        } else if (obj2 instanceof Number) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i < length) {
                                dArr[i] = jSONArray.optDouble(i);
                                i++;
                            }
                            bundle.putDoubleArray(next, dArr);
                        } else if (obj2 instanceof CharSequence) {
                            String[] strArr = new String[length];
                            while (i < length) {
                                strArr[i] = !jSONArray.isNull(i) ? jSONArray.optString(i) : null;
                                i++;
                            }
                            bundle.putStringArray(next, strArr);
                        } else if (obj2 instanceof Boolean) {
                            boolean[] zArr = new boolean[length];
                            while (i < length) {
                                zArr[i] = jSONArray.optBoolean(i);
                                i++;
                            }
                            bundle.putBooleanArray(next, zArr);
                        } else {
                            zzbad.m20523d(String.format("JSONArray with unsupported type %s for key:%s", new Object[]{obj2.getClass().getCanonicalName(), next}));
                        }
                    }
                } else if (obj instanceof JSONObject) {
                    bundle.putBundle(next, m19227a((JSONObject) obj));
                } else {
                    String valueOf2 = String.valueOf(next);
                    zzbad.m20523d(valueOf2.length() != 0 ? "Unsupported type for key:".concat(valueOf2) : new String("Unsupported type for key:"));
                }
            }
        }
        return bundle;
    }
}
