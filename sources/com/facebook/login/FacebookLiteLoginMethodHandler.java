package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.C6461s;
import com.facebook.login.LoginClient;

class FacebookLiteLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Parcelable.Creator<FacebookLiteLoginMethodHandler> CREATOR = new C6505a();

    /* renamed from: com.facebook.login.FacebookLiteLoginMethodHandler$a */
    static class C6505a implements Parcelable.Creator<FacebookLiteLoginMethodHandler> {
        C6505a() {
        }

        public FacebookLiteLoginMethodHandler createFromParcel(Parcel parcel) {
            return new FacebookLiteLoginMethodHandler(parcel);
        }

        public FacebookLiteLoginMethodHandler[] newArray(int i) {
            return new FacebookLiteLoginMethodHandler[i];
        }
    }

    FacebookLiteLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo21074a(LoginClient.Request request) {
        String p = LoginClient.m13682p();
        Intent a = C6461s.m13422a(this.f12059g.mo21136c(), request.mo21149a(), request.mo21159h(), p, request.mo21161k(), request.mo21160j(), request.mo21154d(), mo21175a(request.mo21152b()), request.mo21153c());
        mo21177a("e2e", p);
        return mo21180a(a, LoginClient.m13684r());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo21075b() {
        return "fb_lite_login";
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    FacebookLiteLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
