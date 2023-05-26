package com.facebook.login;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0456c;
import com.facebook.C6359c;
import com.facebook.FacebookException;
import com.facebook.internal.C6427g;
import com.facebook.internal.C6476x;
import com.facebook.internal.C6482z;
import com.facebook.login.LoginClient;
import p015cm.aptoide.p016pt.account.view.LoginActivity;

class WebViewLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new C6517b();

    /* renamed from: i */
    private C6482z f12061i;

    /* renamed from: j */
    private String f12062j;

    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$a */
    class C6516a implements C6482z.C6489g {

        /* renamed from: a */
        final /* synthetic */ LoginClient.Request f12063a;

        C6516a(LoginClient.Request request) {
            this.f12063a = request;
        }

        /* renamed from: a */
        public void mo20976a(Bundle bundle, FacebookException facebookException) {
            WebViewLoginMethodHandler.this.mo21184b(this.f12063a, bundle, facebookException);
        }
    }

    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$b */
    static class C6517b implements Parcelable.Creator<WebViewLoginMethodHandler> {
        C6517b() {
        }

        public WebViewLoginMethodHandler createFromParcel(Parcel parcel) {
            return new WebViewLoginMethodHandler(parcel);
        }

        public WebViewLoginMethodHandler[] newArray(int i) {
            return new WebViewLoginMethodHandler[i];
        }
    }

    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$c */
    static class C6518c extends C6482z.C6487e {

        /* renamed from: h */
        private String f12065h;

        /* renamed from: i */
        private String f12066i;

        /* renamed from: j */
        private String f12067j = "fbconnect://success";

        /* renamed from: k */
        private C6522d f12068k = C6522d.NATIVE_WITH_FALLBACK;

        public C6518c(Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
        }

        /* renamed from: a */
        public C6518c mo21190a(boolean z) {
            this.f12067j = z ? "fbconnect://chrome_os_success" : "fbconnect://success";
            return this;
        }

        /* renamed from: b */
        public C6518c mo21191b(String str) {
            this.f12065h = str;
            return this;
        }

        /* renamed from: a */
        public C6518c mo21189a(String str) {
            this.f12066i = str;
            return this;
        }

        /* renamed from: a */
        public C6518c mo21188a(C6522d dVar) {
            this.f12068k = dVar;
            return this;
        }

        /* renamed from: a */
        public C6482z mo21055a() {
            Bundle e = mo21059e();
            e.putString("redirect_uri", this.f12067j);
            e.putString("client_id", mo21056b());
            e.putString("e2e", this.f12065h);
            e.putString("response_type", "token,signed_request,graph_domain");
            e.putString("return_scopes", "true");
            e.putString(LoginActivity.AUTH_TYPE, this.f12066i);
            e.putString("login_behavior", this.f12068k.name());
            return C6482z.m13566a(mo21057c(), "oauth", e, mo21060f(), mo21058d());
        }
    }

    WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21115a() {
        C6482z zVar = this.f12061i;
        if (zVar != null) {
            zVar.cancel();
            this.f12061i = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo21075b() {
        return "web_view";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo21184b(LoginClient.Request request, Bundle bundle, FacebookException facebookException) {
        super.mo21182a(request, bundle, facebookException);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo21179c() {
        return true;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C6359c mo21079f() {
        return C6359c.WEB_VIEW;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f12062j);
    }

    WebViewLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f12062j = parcel.readString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo21074a(LoginClient.Request request) {
        Bundle b = mo21183b(request);
        C6516a aVar = new C6516a(request);
        String p = LoginClient.m13682p();
        this.f12062j = p;
        mo21177a("e2e", p);
        C0456c c = this.f12059g.mo21136c();
        boolean f = C6476x.m13539f((Context) c);
        C6518c cVar = new C6518c(c, request.mo21149a(), b);
        cVar.mo21191b(this.f12062j);
        cVar.mo21190a(f);
        cVar.mo21189a(request.mo21153c());
        cVar.mo21188a(request.mo21158g());
        cVar.mo21054a(aVar);
        this.f12061i = cVar.mo21055a();
        C6427g gVar = new C6427g();
        gVar.setRetainInstance(true);
        gVar.mo20975a((Dialog) this.f12061i);
        gVar.show(c.getSupportFragmentManager(), "FacebookDialogFragment");
        return true;
    }
}
