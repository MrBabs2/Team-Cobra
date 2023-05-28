package com.facebook.p032t.p180t;

import com.facebook.C4716f;
import com.facebook.internal.C6442l;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.p032t.p182v.C6673c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.facebook.t.t.a */
/* compiled from: IntegrityManager */
public final class C6642a {

    /* renamed from: a */
    private static boolean f12374a = false;

    /* renamed from: b */
    private static boolean f12375b = false;

    /* renamed from: a */
    public static void m14153a() {
        Class<C6642a> cls = C6642a.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                f12374a = true;
                f12375b = C6442l.m13353a("FBSDKFeatureIntegritySample", C4716f.m7697f(), false);
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: b */
    private static boolean m14155b(String str) {
        Class<C6642a> cls = C6642a.class;
        if (C6391a.m13260a((Object) cls)) {
            return false;
        }
        try {
            return !"none".equals(m14152a(str));
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return false;
        }
    }

    /* renamed from: a */
    public static void m14154a(Map<String, String> map) {
        Class<C6642a> cls = C6642a.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                if (f12374a && map.size() != 0) {
                    try {
                        ArrayList<String> arrayList = new ArrayList<>(map.keySet());
                        JSONObject jSONObject = new JSONObject();
                        for (String str : arrayList) {
                            String str2 = map.get(str);
                            if (m14155b(str) || m14155b(str2)) {
                                map.remove(str);
                                if (!f12375b) {
                                    str2 = "";
                                }
                                jSONObject.put(str, str2);
                            }
                        }
                        if (jSONObject.length() != 0) {
                            map.put("_onDeviceParams", jSONObject.toString());
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: a */
    private static String m14152a(String str) {
        Class<C6642a> cls = C6642a.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            Arrays.fill(fArr, 0.0f);
            String[] a = C6673c.m14260a(C6673c.C6678e.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
            if (a == null) {
                return "none";
            }
            return a[0];
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }
}
