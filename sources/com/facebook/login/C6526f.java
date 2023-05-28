package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.login.LoginClient;
import com.facebook.p032t.C6596m;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.login.f */
/* compiled from: LoginLogger */
class C6526f {

    /* renamed from: a */
    private final C6596m f12096a;

    /* renamed from: b */
    private String f12097b;

    /* renamed from: c */
    private String f12098c;

    C6526f(Context context, String str) {
        PackageInfo packageInfo;
        this.f12097b = str;
        this.f12096a = new C6596m(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) != null) {
                this.f12098c = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: a */
    public String mo21203a() {
        return this.f12097b;
    }

    /* renamed from: b */
    public void mo21209b(String str, String str2) {
        Bundle a = m13787a(str);
        a.putString("3_method", str2);
        this.f12096a.mo21342b("fb_mobile_login_method_start", a);
    }

    /* renamed from: c */
    public void mo21210c(String str, String str2) {
        mo21206a(str, str2, "");
    }

    /* renamed from: a */
    static Bundle m13787a(String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("0_auth_logger_id", str);
        bundle.putString("3_method", "");
        bundle.putString("2_result", "");
        bundle.putString("5_error_message", "");
        bundle.putString("4_error_code", "");
        bundle.putString("6_extras", "");
        return bundle;
    }

    /* renamed from: a */
    public void mo21204a(LoginClient.Request request) {
        Bundle a = m13787a(request.mo21152b());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("login_behavior", request.mo21158g().toString());
            jSONObject.put("request_code", LoginClient.m13684r());
            jSONObject.put("permissions", TextUtils.join(",", request.mo21159h()));
            jSONObject.put("default_audience", request.mo21154d().toString());
            jSONObject.put("isReauthorize", request.mo21161k());
            if (this.f12098c != null) {
                jSONObject.put("facebookVersion", this.f12098c);
            }
            a.putString("6_extras", jSONObject.toString());
        } catch (JSONException unused) {
        }
        this.f12096a.mo21338a("fb_mobile_login_start", (Double) null, a);
    }

    /* renamed from: a */
    public void mo21208a(String str, Map<String, String> map, LoginClient.Result.C6512b bVar, Map<String, String> map2, Exception exc) {
        Bundle a = m13787a(str);
        if (bVar != null) {
            a.putString("2_result", bVar.mo21169a());
        }
        if (!(exc == null || exc.getMessage() == null)) {
            a.putString("5_error_message", exc.getMessage());
        }
        JSONObject jSONObject = null;
        if (!map.isEmpty()) {
            jSONObject = new JSONObject(map);
        }
        if (map2 != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                for (Map.Entry next : map2.entrySet()) {
                    jSONObject.put((String) next.getKey(), next.getValue());
                }
            } catch (JSONException unused) {
            }
        }
        if (jSONObject != null) {
            a.putString("6_extras", jSONObject.toString());
        }
        this.f12096a.mo21342b("fb_mobile_login_complete", a);
    }

    /* renamed from: a */
    public void mo21207a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        Bundle a = m13787a(str);
        if (str3 != null) {
            a.putString("2_result", str3);
        }
        if (str4 != null) {
            a.putString("5_error_message", str4);
        }
        if (str5 != null) {
            a.putString("4_error_code", str5);
        }
        if (map != null && !map.isEmpty()) {
            a.putString("6_extras", new JSONObject(map).toString());
        }
        a.putString("3_method", str2);
        this.f12096a.mo21342b("fb_mobile_login_method_complete", a);
    }

    /* renamed from: a */
    public void mo21205a(String str, String str2) {
        Bundle a = m13787a(str);
        a.putString("3_method", str2);
        this.f12096a.mo21342b("fb_mobile_login_method_not_tried", a);
    }

    /* renamed from: a */
    public void mo21206a(String str, String str2, String str3) {
        Bundle a = m13787a("");
        a.putString("2_result", LoginClient.Result.C6512b.ERROR.mo21169a());
        a.putString("5_error_message", str2);
        a.putString("3_method", str3);
        this.f12096a.mo21342b(str, a);
    }
}
