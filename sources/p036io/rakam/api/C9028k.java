package p036io.rakam.api;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.rakam.api.k */
/* compiled from: Utils */
public class C9028k {

    /* renamed from: a */
    private static C9026i f25561a = C9026i.m29670a();

    /* renamed from: a */
    static JSONObject m29693a(JSONObject jSONObject) {
        JSONArray jSONArray;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.length() == 0) {
            return new JSONObject();
        }
        try {
            jSONArray = jSONObject.names();
        } catch (ArrayIndexOutOfBoundsException e) {
            f25561a.mo33373b("io.rakam.api.Utils", e.toString());
            jSONArray = null;
        }
        int length = jSONArray != null ? jSONArray.length() : 0;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArray.optString(i);
        }
        try {
            return new JSONObject(jSONObject, strArr);
        } catch (JSONException e2) {
            f25561a.mo33373b("io.rakam.api.Utils", e2.toString());
            return null;
        }
    }

    /* renamed from: b */
    static String m29696b(String str) {
        if (m29695a(str)) {
            str = "$default_instance";
        }
        return str.toLowerCase();
    }

    /* renamed from: a */
    public static boolean m29695a(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: a */
    static SharedPreferences m29691a(Context context, String str) {
        return context.getSharedPreferences("io.rakam.api." + str + "." + context.getPackageName(), 4);
    }

    /* renamed from: a */
    static void m29694a(Context context, String str, String str2, String str3) {
        SharedPreferences.Editor edit = m29691a(context, str).edit();
        edit.putString(str2, str3);
        edit.apply();
    }

    /* renamed from: a */
    static String m29692a(Context context, String str, String str2) {
        return m29691a(context, str).getString(str2, (String) null);
    }
}
