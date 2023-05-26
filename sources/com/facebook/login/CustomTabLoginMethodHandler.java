package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.C4716f;
import com.facebook.C6359c;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.internal.C6425e;
import com.facebook.internal.C6426f;
import com.facebook.internal.C6476x;
import com.facebook.internal.C6481y;
import com.facebook.login.LoginClient;
import okhttp3.internal.cache.DiskLruCache;
import org.json.JSONException;
import org.json.JSONObject;

public class CustomTabLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new C6495a();

    /* renamed from: l */
    public static boolean f11984l = false;

    /* renamed from: i */
    private String f11985i;

    /* renamed from: j */
    private String f11986j;

    /* renamed from: k */
    private String f11987k;

    /* renamed from: com.facebook.login.CustomTabLoginMethodHandler$a */
    static class C6495a implements Parcelable.Creator {
        C6495a() {
        }

        public CustomTabLoginMethodHandler createFromParcel(Parcel parcel) {
            return new CustomTabLoginMethodHandler(parcel);
        }

        public CustomTabLoginMethodHandler[] newArray(int i) {
            return new CustomTabLoginMethodHandler[i];
        }
    }

    CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.f11987k = "";
        this.f11986j = C6476x.m13484a(20);
        f11984l = false;
        if (C6481y.m13559a(C4716f.m7696e(), m13613h())) {
            this.f11987k = m13613h();
        } else if (C6481y.m13559a(C4716f.m7696e(), C6426f.m13317b())) {
            this.f11987k = C6426f.m13317b();
        }
    }

    /* renamed from: g */
    private String m13612g() {
        String str = this.f11985i;
        if (str != null) {
            return str;
        }
        String a = C6426f.m13316a();
        this.f11985i = a;
        return a;
    }

    /* renamed from: h */
    private String m13613h() {
        return super.mo21076d();
    }

    /* renamed from: j */
    private boolean m13614j() {
        return m13612g() != null && !mo21076d().isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo21074a(LoginClient.Request request) {
        if (!m13614j()) {
            return false;
        }
        Bundle b = mo21183b(request);
        mo21181a(b, request);
        if (f11984l) {
            b.putString("cct_over_app_switch", DiskLruCache.VERSION_1);
        }
        if (C4716f.f8009p) {
            C6519a.m13767a(C6425e.m13314a("oauth", b));
        }
        Intent intent = new Intent(this.f12059g.mo21136c(), CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f11597h, "oauth");
        intent.putExtra(CustomTabMainActivity.f11598i, b);
        intent.putExtra(CustomTabMainActivity.f11599j, m13612g());
        this.f12059g.mo21141e().startActivityForResult(intent, 1);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo21075b() {
        return "custom_tab";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo21076d() {
        return this.f11987k;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo21078e() {
        return "chrome_custom_tab";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C6359c mo21079f() {
        return C6359c.CHROME_CUSTOM_TAB;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f11986j);
    }

    CustomTabLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f11987k = "";
        this.f11986j = parcel.readString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo21073a(int i, int i2, Intent intent) {
        if (i != 1) {
            return super.mo21073a(i, i2, intent);
        }
        LoginClient.Request g = this.f12059g.mo21143g();
        if (i2 == -1) {
            m13610a(intent.getStringExtra(CustomTabMainActivity.f11600k), g);
            return true;
        }
        super.mo21182a(g, (Bundle) null, new FacebookOperationCanceledException());
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13610a(java.lang.String r7, com.facebook.login.LoginClient.Request r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x00bb
            java.lang.String r0 = "fbconnect://cct."
            boolean r0 = r7.startsWith(r0)
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = super.mo21076d()
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L_0x00bb
        L_0x0014:
            android.net.Uri r7 = android.net.Uri.parse(r7)
            java.lang.String r0 = r7.getQuery()
            android.os.Bundle r0 = com.facebook.internal.C6476x.m13537f((java.lang.String) r0)
            java.lang.String r7 = r7.getFragment()
            android.os.Bundle r7 = com.facebook.internal.C6476x.m13537f((java.lang.String) r7)
            r0.putAll(r7)
            boolean r7 = r6.m13611a((android.os.Bundle) r0)
            r1 = 0
            if (r7 != 0) goto L_0x003d
            com.facebook.FacebookException r7 = new com.facebook.FacebookException
            java.lang.String r0 = "Invalid state parameter"
            r7.<init>((java.lang.String) r0)
            super.mo21182a(r8, r1, r7)
            return
        L_0x003d:
            java.lang.String r7 = "error"
            java.lang.String r7 = r0.getString(r7)
            if (r7 != 0) goto L_0x004b
            java.lang.String r7 = "error_type"
            java.lang.String r7 = r0.getString(r7)
        L_0x004b:
            java.lang.String r2 = "error_msg"
            java.lang.String r2 = r0.getString(r2)
            if (r2 != 0) goto L_0x0059
            java.lang.String r2 = "error_message"
            java.lang.String r2 = r0.getString(r2)
        L_0x0059:
            if (r2 != 0) goto L_0x0061
            java.lang.String r2 = "error_description"
            java.lang.String r2 = r0.getString(r2)
        L_0x0061:
            java.lang.String r3 = "error_code"
            java.lang.String r3 = r0.getString(r3)
            boolean r4 = com.facebook.internal.C6476x.m13533d((java.lang.String) r3)
            r5 = -1
            if (r4 != 0) goto L_0x0073
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0073 }
            goto L_0x0074
        L_0x0073:
            r3 = -1
        L_0x0074:
            boolean r4 = com.facebook.internal.C6476x.m13533d((java.lang.String) r7)
            if (r4 == 0) goto L_0x0086
            boolean r4 = com.facebook.internal.C6476x.m13533d((java.lang.String) r2)
            if (r4 == 0) goto L_0x0086
            if (r3 != r5) goto L_0x0086
            super.mo21182a(r8, r0, r1)
            goto L_0x00bb
        L_0x0086:
            if (r7 == 0) goto L_0x00a1
            java.lang.String r0 = "access_denied"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0098
            java.lang.String r0 = "OAuthAccessDeniedException"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00a1
        L_0x0098:
            com.facebook.FacebookOperationCanceledException r7 = new com.facebook.FacebookOperationCanceledException
            r7.<init>()
            super.mo21182a(r8, r1, r7)
            goto L_0x00bb
        L_0x00a1:
            r0 = 4201(0x1069, float:5.887E-42)
            if (r3 != r0) goto L_0x00ae
            com.facebook.FacebookOperationCanceledException r7 = new com.facebook.FacebookOperationCanceledException
            r7.<init>()
            super.mo21182a(r8, r1, r7)
            goto L_0x00bb
        L_0x00ae:
            com.facebook.FacebookRequestError r0 = new com.facebook.FacebookRequestError
            r0.<init>(r3, r7, r2)
            com.facebook.FacebookServiceException r7 = new com.facebook.FacebookServiceException
            r7.<init>(r0, r2)
            super.mo21182a(r8, r1, r7)
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.CustomTabLoginMethodHandler.m13610a(java.lang.String, com.facebook.login.LoginClient$Request):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21072a(JSONObject jSONObject) throws JSONException {
        jSONObject.put("7_challenge", this.f11986j);
    }

    /* renamed from: a */
    private boolean m13611a(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return new JSONObject(string).getString("7_challenge").equals(this.f11986j);
        } catch (JSONException unused) {
            return false;
        }
    }
}
