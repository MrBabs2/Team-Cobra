package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.C4716f;
import com.facebook.internal.C6426f;
import com.facebook.internal.C6461s;
import com.facebook.login.LoginClient;
import java.util.Collection;

class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Parcelable.Creator<KatanaProxyLoginMethodHandler> CREATOR = new C6509a();

    /* renamed from: com.facebook.login.KatanaProxyLoginMethodHandler$a */
    static class C6509a implements Parcelable.Creator<KatanaProxyLoginMethodHandler> {
        C6509a() {
        }

        public KatanaProxyLoginMethodHandler createFromParcel(Parcel parcel) {
            return new KatanaProxyLoginMethodHandler(parcel);
        }

        public KatanaProxyLoginMethodHandler[] newArray(int i) {
            return new KatanaProxyLoginMethodHandler[i];
        }
    }

    KatanaProxyLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo21074a(LoginClient.Request request) {
        boolean z = C4716f.f8010q && C6426f.m13316a() != null && request.mo21158g().mo21194a();
        String p = LoginClient.m13682p();
        Intent a = C6461s.m13423a((Context) this.f12059g.mo21136c(), request.mo21149a(), (Collection<String>) request.mo21159h(), p, request.mo21161k(), request.mo21160j(), request.mo21154d(), mo21175a(request.mo21152b()), request.mo21153c(), z);
        mo21177a("e2e", p);
        return mo21180a(a, LoginClient.m13684r());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo21075b() {
        return "katana_proxy_auth";
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    KatanaProxyLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
