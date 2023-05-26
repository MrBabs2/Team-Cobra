package com.facebook.login;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.C6359c;
import com.facebook.FacebookException;
import com.facebook.internal.C6474v;
import com.facebook.internal.C6476x;
import com.facebook.login.LoginClient;

abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {
    NativeAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* renamed from: b */
    private LoginClient.Result m13742b(LoginClient.Request request, Intent intent) {
        Bundle extras = intent.getExtras();
        String a = m13741a(extras);
        String obj = extras.get("error_code") != null ? extras.get("error_code").toString() : null;
        String b = m13743b(extras);
        String string = extras.getString("e2e");
        if (!C6476x.m13533d(string)) {
            mo21178b(string);
        }
        if (a == null && obj == null && b == null) {
            try {
                return LoginClient.Result.m13719a(request, LoginMethodHandler.m13728a(request.mo21159h(), extras, C6359c.FACEBOOK_APPLICATION_WEB, request.mo21149a()));
            } catch (FacebookException e) {
                return LoginClient.Result.m13721a(request, (String) null, e.getMessage());
            }
        } else if (a.equals("logged_out")) {
            CustomTabLoginMethodHandler.f11984l = true;
            return null;
        } else if (C6474v.f11913a.contains(a)) {
            return null;
        } else {
            if (C6474v.f11914b.contains(a)) {
                return LoginClient.Result.m13720a(request, (String) null);
            }
            return LoginClient.Result.m13722a(request, a, b, obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo21073a(int i, int i2, Intent intent) {
        LoginClient.Result result;
        LoginClient.Request g = this.f12059g.mo21143g();
        if (intent == null) {
            result = LoginClient.Result.m13720a(g, "Operation canceled");
        } else if (i2 == 0) {
            result = m13740a(g, intent);
        } else if (i2 != -1) {
            result = LoginClient.Result.m13721a(g, "Unexpected resultCode from authorization.", (String) null);
        } else {
            result = m13742b(g, intent);
        }
        if (result != null) {
            this.f12059g.mo21133b(result);
            return true;
        }
        this.f12059g.mo21147n();
        return true;
    }

    NativeAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: a */
    private LoginClient.Result m13740a(LoginClient.Request request, Intent intent) {
        Bundle extras = intent.getExtras();
        String a = m13741a(extras);
        String obj = extras.get("error_code") != null ? extras.get("error_code").toString() : null;
        if ("CONNECTION_FAILURE".equals(obj)) {
            return LoginClient.Result.m13722a(request, a, m13743b(extras), obj);
        }
        return LoginClient.Result.m13720a(request, a);
    }

    /* renamed from: a */
    private String m13741a(Bundle bundle) {
        String string = bundle.getString("error");
        return string == null ? bundle.getString("error_type") : string;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo21180a(Intent intent, int i) {
        if (intent == null) {
            return false;
        }
        try {
            this.f12059g.mo21141e().startActivityForResult(intent, i);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: b */
    private String m13743b(Bundle bundle) {
        String string = bundle.getString("error_message");
        return string == null ? bundle.getString("error_description") : string;
    }
}
