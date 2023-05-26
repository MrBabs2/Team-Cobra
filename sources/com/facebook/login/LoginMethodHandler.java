package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.C6359c;
import com.facebook.FacebookException;
import com.facebook.internal.C6476x;
import com.facebook.login.LoginClient;
import com.facebook.p032t.C6596m;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.reviews.RateAndReviewsFragment;
import p015cm.aptoide.p016pt.timeline.view.follow.TimeLineFollowFragment;

abstract class LoginMethodHandler implements Parcelable {

    /* renamed from: f */
    Map<String, String> f12058f;

    /* renamed from: g */
    protected LoginClient f12059g;

    LoginMethodHandler(LoginClient loginClient) {
        this.f12059g = loginClient;
    }

    /* renamed from: c */
    static String m13729c(String str) throws FacebookException {
        if (str == null || str.isEmpty()) {
            throw new FacebookException("Authorization response does not contain the signed_request");
        }
        try {
            String[] split = str.split("\\.");
            if (split.length == 2) {
                return new JSONObject(new String(Base64.decode(split[1], 0), "UTF-8")).getString(TimeLineFollowFragment.BundleKeys.USER_ID);
            }
        } catch (UnsupportedEncodingException | JSONException unused) {
        }
        throw new FacebookException("Failed to retrieve user_id from signed_request");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21115a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21176a(LoginClient loginClient) {
        if (this.f12059g == null) {
            this.f12059g = loginClient;
            return;
        }
        throw new FacebookException("Can't set LoginClient if it is already set.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21072a(JSONObject jSONObject) throws JSONException {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo21073a(int i, int i2, Intent intent) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo21074a(LoginClient.Request request);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract String mo21075b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo21178b(String str) {
        String a = this.f12059g.mo21143g().mo21149a();
        C6596m mVar = new C6596m(this.f12059g.mo21136c(), a);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString(RateAndReviewsFragment.BundleCons.APP_ID, a);
        mVar.mo21338a("fb_dialogs_web_login_dialog_complete", (Double) null, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo21179c() {
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C6476x.m13503a(parcel, this.f12058f);
    }

    LoginMethodHandler(Parcel parcel) {
        this.f12058f = C6476x.m13496a(parcel);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo21175a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", mo21075b());
            mo21072a(jSONObject);
        } catch (JSONException e) {
            Log.w("LoginMethodHandler", "Error creating client state json: " + e.getMessage());
        }
        return jSONObject.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21177a(String str, Object obj) {
        if (this.f12058f == null) {
            this.f12058f = new HashMap();
        }
        this.f12058f.put(str, obj == null ? null : obj.toString());
    }

    /* renamed from: a */
    static AccessToken m13727a(Bundle bundle, C6359c cVar, String str) {
        Bundle bundle2 = bundle;
        Date a = C6476x.m13493a(bundle2, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0));
        ArrayList<String> stringArrayList = bundle2.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string = bundle2.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date a2 = C6476x.m13493a(bundle2, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0));
        if (C6476x.m13533d(string)) {
            return null;
        }
        return new AccessToken(string, str, bundle2.getString("com.facebook.platform.extra.USER_ID"), stringArrayList, (Collection<String>) null, (Collection<String>) null, cVar, a, new Date(), a2, bundle2.getString("graph_domain"));
    }

    /* renamed from: a */
    public static AccessToken m13728a(Collection<String> collection, Bundle bundle, C6359c cVar, String str) throws FacebookException {
        Bundle bundle2 = bundle;
        Date a = C6476x.m13493a(bundle2, "expires_in", new Date());
        String string = bundle2.getString("access_token");
        Date a2 = C6476x.m13493a(bundle2, "data_access_expiration_time", new Date(0));
        String string2 = bundle2.getString("granted_scopes");
        ArrayList arrayList = !C6476x.m13533d(string2) ? new ArrayList(Arrays.asList(string2.split(","))) : collection;
        String string3 = bundle2.getString("denied_scopes");
        ArrayList arrayList2 = !C6476x.m13533d(string3) ? new ArrayList(Arrays.asList(string3.split(","))) : null;
        String string4 = bundle2.getString("expired_scopes");
        ArrayList arrayList3 = !C6476x.m13533d(string4) ? new ArrayList(Arrays.asList(string4.split(","))) : null;
        if (C6476x.m13533d(string)) {
            return null;
        }
        return new AccessToken(string, str, m13729c(bundle2.getString("signed_request")), arrayList, arrayList2, arrayList3, cVar, a, new Date(), a2, bundle2.getString("graph_domain"));
    }
}
