package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.C4716f;
import com.facebook.C6359c;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.internal.C6476x;
import com.facebook.login.LoginClient;
import java.util.Locale;
import okhttp3.internal.cache.DiskLruCache;
import p015cm.aptoide.p016pt.account.view.LoginActivity;

abstract class WebLoginMethodHandler extends LoginMethodHandler {

    /* renamed from: h */
    private String f12060h;

    WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* renamed from: g */
    private String m13747g() {
        return this.f12059g.mo21136c().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bundle mo21181a(Bundle bundle, LoginClient.Request request) {
        bundle.putString("redirect_uri", mo21076d());
        bundle.putString("client_id", request.mo21149a());
        bundle.putString("e2e", LoginClient.m13682p());
        bundle.putString("response_type", "token,signed_request,graph_domain");
        bundle.putString("return_scopes", "true");
        bundle.putString(LoginActivity.AUTH_TYPE, request.mo21153c());
        bundle.putString("login_behavior", request.mo21158g().name());
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", new Object[]{C4716f.m7710s()}));
        if (mo21078e() != null) {
            bundle.putString("sso", mo21078e());
        }
        bundle.putString("cct_prefetching", C4716f.f8009p ? DiskLruCache.VERSION_1 : "0");
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Bundle mo21183b(LoginClient.Request request) {
        Bundle bundle = new Bundle();
        if (!C6476x.m13516a(request.mo21159h())) {
            String join = TextUtils.join(",", request.mo21159h());
            bundle.putString("scope", join);
            mo21177a("scope", join);
        }
        bundle.putString("default_audience", request.mo21154d().mo21193a());
        bundle.putString("state", mo21175a(request.mo21152b()));
        AccessToken r = AccessToken.m13036r();
        String k = r != null ? r.mo20788k() : null;
        String str = DiskLruCache.VERSION_1;
        if (k == null || !k.equals(m13747g())) {
            C6476x.m13499a((Context) this.f12059g.mo21136c());
            mo21177a("access_token", "0");
        } else {
            bundle.putString("access_token", k);
            mo21177a("access_token", str);
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        if (!C4716f.m7700i()) {
            str = "0";
        }
        bundle.putString("ies", str);
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo21076d() {
        return "fb" + C4716f.m7697f() + "://authorize";
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo21078e() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract C6359c mo21079f();

    WebLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: d */
    private void m13746d(String str) {
        this.f12059g.mo21136c().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str).apply();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21182a(LoginClient.Request request, Bundle bundle, FacebookException facebookException) {
        LoginClient.Result result;
        String str;
        this.f12060h = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f12060h = bundle.getString("e2e");
            }
            try {
                AccessToken a = LoginMethodHandler.m13728a(request.mo21159h(), bundle, mo21079f(), request.mo21149a());
                result = LoginClient.Result.m13719a(this.f12059g.mo21143g(), a);
                CookieSyncManager.createInstance(this.f12059g.mo21136c()).sync();
                m13746d(a.mo20788k());
            } catch (FacebookException e) {
                result = LoginClient.Result.m13721a(this.f12059g.mo21143g(), (String) null, e.getMessage());
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            result = LoginClient.Result.m13720a(this.f12059g.mo21143g(), "User canceled log in.");
        } else {
            this.f12060h = null;
            String message = facebookException.getMessage();
            if (facebookException instanceof FacebookServiceException) {
                FacebookRequestError a2 = ((FacebookServiceException) facebookException).mo20824a();
                str = String.format(Locale.ROOT, "%d", new Object[]{Integer.valueOf(a2.mo20812a())});
                message = a2.toString();
            } else {
                str = null;
            }
            result = LoginClient.Result.m13722a(this.f12059g.mo21143g(), (String) null, message, str);
        }
        if (!C6476x.m13533d(this.f12060h)) {
            mo21178b(this.f12060h);
        }
        this.f12059g.mo21133b(result);
    }
}
