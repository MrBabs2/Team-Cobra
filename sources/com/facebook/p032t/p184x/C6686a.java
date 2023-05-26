package com.facebook.p032t.p184x;

import android.util.Patterns;
import com.facebook.internal.p168a0.p170f.C6391a;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import okhttp3.internal.cache.DiskLruCache;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.root.execution.Command;

/* renamed from: com.facebook.t.x.a */
/* compiled from: FeatureExtractor */
final class C6686a {

    /* renamed from: a */
    private static Map<String, String> f12468a = null;

    /* renamed from: b */
    private static Map<String, String> f12469b = null;

    /* renamed from: c */
    private static Map<String, String> f12470c = null;

    /* renamed from: d */
    private static JSONObject f12471d = null;

    /* renamed from: e */
    private static boolean f12472e = false;

    C6686a() {
    }

    /* renamed from: a */
    static void m14305a(File file) {
        Class<C6686a> cls = C6686a.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                f12471d = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f12471d = new JSONObject(new String(bArr, "UTF-8"));
                try {
                    HashMap hashMap = new HashMap();
                    f12468a = hashMap;
                    hashMap.put("ENGLISH", DiskLruCache.VERSION_1);
                    f12468a.put("GERMAN", "2");
                    f12468a.put("SPANISH", "3");
                    f12468a.put("JAPANESE", "4");
                    HashMap hashMap2 = new HashMap();
                    f12469b = hashMap2;
                    hashMap2.put("VIEW_CONTENT", "0");
                    f12469b.put("SEARCH", DiskLruCache.VERSION_1);
                    f12469b.put("ADD_TO_CART", "2");
                    f12469b.put("ADD_TO_WISHLIST", "3");
                    f12469b.put("INITIATE_CHECKOUT", "4");
                    f12469b.put("ADD_PAYMENT_INFO", "5");
                    f12469b.put("PURCHASE", "6");
                    f12469b.put("LEAD", "7");
                    f12469b.put("COMPLETE_REGISTRATION", "8");
                    HashMap hashMap3 = new HashMap();
                    f12470c = hashMap3;
                    hashMap3.put("BUTTON_TEXT", DiskLruCache.VERSION_1);
                    f12470c.put("PAGE_TITLE", "2");
                    f12470c.put("RESOLVED_DOCUMENT_LINK", "3");
                    f12470c.put("BUTTON_ID", "4");
                    f12472e = true;
                } catch (Throwable th) {
                    C6391a.m13259a(th, cls);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    private static boolean m14315b(JSONObject jSONObject) {
        Class<C6686a> cls = C6686a.class;
        if (C6391a.m13260a((Object) cls)) {
            return false;
        }
        try {
            return (jSONObject.optInt("classtypebitmask") & 32) > 0;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return false;
        }
    }

    /* renamed from: c */
    private static float[] m14316c(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        Class<C6686a> cls = C6686a.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            Arrays.fill(fArr, 0.0f);
            String lowerCase = jSONObject2.optString(Command.CommandHandler.TEXT).toLowerCase();
            String lowerCase2 = jSONObject2.optString("hint").toLowerCase();
            String lowerCase3 = jSONObject2.optString("classname").toLowerCase();
            int optInt = jSONObject2.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (m14312a(new String[]{"$", "amount", "price", "total"}, strArr)) {
                double d = (double) fArr[0];
                Double.isNaN(d);
                fArr[0] = (float) (d + 1.0d);
            }
            if (m14312a(new String[]{"password", "pwd"}, strArr)) {
                double d2 = (double) fArr[1];
                Double.isNaN(d2);
                fArr[1] = (float) (d2 + 1.0d);
            }
            if (m14312a(new String[]{"tel", "phone"}, strArr)) {
                double d3 = (double) fArr[2];
                Double.isNaN(d3);
                fArr[2] = (float) (d3 + 1.0d);
            }
            if (m14312a(new String[]{"search"}, strArr)) {
                double d4 = (double) fArr[4];
                Double.isNaN(d4);
                fArr[4] = (float) (d4 + 1.0d);
            }
            if (optInt >= 0) {
                double d5 = (double) fArr[5];
                Double.isNaN(d5);
                fArr[5] = (float) (d5 + 1.0d);
            }
            if (optInt == 3 || optInt == 2) {
                double d6 = (double) fArr[6];
                Double.isNaN(d6);
                fArr[6] = (float) (d6 + 1.0d);
            }
            if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                double d7 = (double) fArr[7];
                Double.isNaN(d7);
                fArr[7] = (float) (d7 + 1.0d);
            }
            if (lowerCase3.contains("checkbox")) {
                double d8 = (double) fArr[8];
                Double.isNaN(d8);
                fArr[8] = (float) (d8 + 1.0d);
            }
            if (m14312a(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                double d9 = (double) fArr[10];
                Double.isNaN(d9);
                fArr[10] = (float) (d9 + 1.0d);
            }
            if (lowerCase3.contains("radio") && lowerCase3.contains("button")) {
                double d10 = (double) fArr[12];
                Double.isNaN(d10);
                fArr[12] = (float) (d10 + 1.0d);
            }
            try {
                JSONArray optJSONArray = jSONObject2.optJSONArray("childviews");
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    m14307a(fArr, m14316c(optJSONArray.getJSONObject(i)));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: a */
    static boolean m14308a() {
        Class<C6686a> cls = C6686a.class;
        if (C6391a.m13260a((Object) cls)) {
            return false;
        }
        try {
            return f12472e;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return false;
        }
    }

    /* renamed from: a */
    static String m14303a(String str, String str2, String str3) {
        Class<C6686a> cls = C6686a.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            return (str3 + " | " + str2 + ", " + str).toLowerCase();
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: a */
    static float[] m14313a(JSONObject jSONObject, String str) {
        Class<C6686a> cls = C6686a.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            if (!f12472e) {
                return null;
            }
            float[] fArr = new float[30];
            Arrays.fill(fArr, 0.0f);
            try {
                String lowerCase = str.toLowerCase();
                JSONObject jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
                String optString = jSONObject.optString("screenname");
                JSONArray jSONArray = new JSONArray();
                m14311a(jSONObject2, jSONArray);
                m14307a(fArr, m14316c(jSONObject2));
                JSONObject a = m14304a(jSONObject2);
                if (a == null) {
                    return null;
                }
                m14307a(fArr, m14314a(a, jSONArray, optString, jSONObject2.toString(), lowerCase));
                return fArr;
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: a */
    private static float[] m14314a(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        String str4 = str2;
        Class<C6686a> cls = C6686a.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            Arrays.fill(fArr, 0.0f);
            int length = jSONArray.length();
            int i = 0;
            fArr[3] = (float) (length > 1 ? length - 1 : 0);
            while (i < jSONArray.length()) {
                try {
                    if (m14315b(jSONArray.getJSONObject(i))) {
                        fArr[9] = fArr[9] + 1.0f;
                    }
                    i++;
                } catch (JSONException unused) {
                }
            }
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str5 = str + '|' + str3;
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            m14306a(jSONObject, sb2, sb);
            String sb3 = sb.toString();
            String sb4 = sb2.toString();
            fArr[15] = m14310a("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr[16] = m14310a("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", str5) ? 1.0f : 0.0f;
            fArr[17] = m14310a("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", sb3) ? 1.0f : 0.0f;
            fArr[18] = str4.contains("password") ? 1.0f : 0.0f;
            fArr[19] = m14309a("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str4) ? 1.0f : 0.0f;
            fArr[20] = m14309a("(?i)(sign in)|login|signIn", str4) ? 1.0f : 0.0f;
            fArr[21] = m14309a("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str4) ? 1.0f : 0.0f;
            fArr[22] = m14310a("ENGLISH", "PURCHASE", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr[24] = m14310a("ENGLISH", "PURCHASE", "PAGE_TITLE", str5) ? 1.0f : 0.0f;
            fArr[25] = m14309a("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", sb4) ? 1.0f : 0.0f;
            fArr[27] = m14309a("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str5) ? 1.0f : 0.0f;
            fArr[28] = m14310a("ENGLISH", "LEAD", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr[29] = m14310a("ENGLISH", "LEAD", "PAGE_TITLE", str5) ? 1.0f : 0.0f;
            return fArr;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m14310a(String str, String str2, String str3, String str4) {
        Class<C6686a> cls = C6686a.class;
        if (C6391a.m13260a((Object) cls)) {
            return false;
        }
        try {
            return m14309a(f12471d.optJSONObject("rulesForLanguage").optJSONObject(f12468a.get(str)).optJSONObject("rulesForEvent").optJSONObject(f12469b.get(str2)).optJSONObject("positiveRules").optString(f12470c.get(str3)), str4);
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m14309a(String str, String str2) {
        Class<C6686a> cls = C6686a.class;
        if (C6391a.m13260a((Object) cls)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m14312a(String[] strArr, String[] strArr2) {
        Class<C6686a> cls = C6686a.class;
        if (C6391a.m13260a((Object) cls)) {
            return false;
        }
        try {
            for (String str : strArr) {
                for (String contains : strArr2) {
                    if (contains.contains(str)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m14311a(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z;
        boolean z2;
        Class<C6686a> cls = C6686a.class;
        if (C6391a.m13260a((Object) cls)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            int i = 0;
            while (true) {
                if (i >= optJSONArray.length()) {
                    z = false;
                    z2 = false;
                    break;
                } else if (optJSONArray.getJSONObject(i).optBoolean("is_interacted")) {
                    z = true;
                    z2 = true;
                    break;
                } else {
                    i++;
                }
            }
            JSONArray jSONArray2 = new JSONArray();
            if (z) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    jSONArray.put(optJSONArray.getJSONObject(i2));
                }
            } else {
                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i3);
                    if (m14311a(jSONObject2, jSONArray)) {
                        jSONArray2.put(jSONObject2);
                        z2 = true;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
            }
            return z2;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return false;
        }
    }

    /* renamed from: a */
    private static void m14307a(float[] fArr, float[] fArr2) {
        Class<C6686a> cls = C6686a.class;
        if (!C6391a.m13260a((Object) cls)) {
            int i = 0;
            while (i < fArr.length) {
                try {
                    fArr[i] = fArr[i] + fArr2[i];
                    i++;
                } catch (Throwable th) {
                    C6391a.m13259a(th, cls);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private static void m14306a(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        Class<C6686a> cls = C6686a.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                String lowerCase = jSONObject.optString(Command.CommandHandler.TEXT, "").toLowerCase();
                String lowerCase2 = jSONObject.optString("hint", "").toLowerCase();
                if (!lowerCase.isEmpty()) {
                    sb.append(lowerCase);
                    sb.append(" ");
                }
                if (!lowerCase2.isEmpty()) {
                    sb2.append(lowerCase2);
                    sb2.append(" ");
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        try {
                            m14306a(optJSONArray.getJSONObject(i), sb, sb2);
                        } catch (JSONException unused) {
                        }
                    }
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: a */
    private static JSONObject m14304a(JSONObject jSONObject) {
        Class<C6686a> cls = C6686a.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return jSONObject;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            if (optJSONArray == null) {
                return null;
            }
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject a = m14304a(optJSONArray.getJSONObject(i));
                if (a != null) {
                    return a;
                }
            }
            return null;
        } catch (JSONException unused) {
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
        }
    }
}
