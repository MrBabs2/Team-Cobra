package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.C6359c;
import com.facebook.FacebookException;
import com.facebook.internal.C6470t;
import com.facebook.internal.C6476x;
import com.facebook.login.LoginClient;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;

class GetTokenLoginMethodHandler extends LoginMethodHandler {
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new C6508c();

    /* renamed from: h */
    private C6521c f12021h;

    /* renamed from: com.facebook.login.GetTokenLoginMethodHandler$a */
    class C6506a implements C6470t.C6472b {

        /* renamed from: a */
        final /* synthetic */ LoginClient.Request f12022a;

        C6506a(LoginClient.Request request) {
            this.f12022a = request;
        }

        /* renamed from: a */
        public void mo21028a(Bundle bundle) {
            GetTokenLoginMethodHandler.this.mo21117b(this.f12022a, bundle);
        }
    }

    /* renamed from: com.facebook.login.GetTokenLoginMethodHandler$c */
    static class C6508c implements Parcelable.Creator {
        C6508c() {
        }

        public GetTokenLoginMethodHandler createFromParcel(Parcel parcel) {
            return new GetTokenLoginMethodHandler(parcel);
        }

        public GetTokenLoginMethodHandler[] newArray(int i) {
            return new GetTokenLoginMethodHandler[i];
        }
    }

    GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21115a() {
        C6521c cVar = this.f12021h;
        if (cVar != null) {
            cVar.mo21020a();
            this.f12021h.mo21023a((C6470t.C6472b) null);
            this.f12021h = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo21075b() {
        return "get_token";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo21117b(LoginClient.Request request, Bundle bundle) {
        C6521c cVar = this.f12021h;
        if (cVar != null) {
            cVar.mo21023a((C6470t.C6472b) null);
        }
        this.f12021h = null;
        this.f12059g.mo21145j();
        if (bundle != null) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            Set<String> h = request.mo21159h();
            if (stringArrayList == null || (h != null && !stringArrayList.containsAll(h))) {
                HashSet hashSet = new HashSet();
                for (String next : h) {
                    if (!stringArrayList.contains(next)) {
                        hashSet.add(next);
                    }
                }
                if (!hashSet.isEmpty()) {
                    mo21177a("new_permissions", TextUtils.join(",", hashSet));
                }
                request.mo21150a((Set<String>) hashSet);
            } else {
                mo21116a(request, bundle);
                return;
            }
        }
        this.f12059g.mo21147n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo21118c(LoginClient.Request request, Bundle bundle) {
        this.f12059g.mo21133b(LoginClient.Result.m13719a(this.f12059g.mo21143g(), LoginMethodHandler.m13727a(bundle, C6359c.FACEBOOK_APPLICATION_SERVICE, request.mo21149a())));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    GetTokenLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo21074a(LoginClient.Request request) {
        C6521c cVar = new C6521c(this.f12059g.mo21136c(), request.mo21149a());
        this.f12021h = cVar;
        if (!cVar.mo21024b()) {
            return false;
        }
        this.f12059g.mo21144h();
        this.f12021h.mo21023a((C6470t.C6472b) new C6506a(request));
        return true;
    }

    /* renamed from: com.facebook.login.GetTokenLoginMethodHandler$b */
    class C6507b implements C6476x.C6479c {

        /* renamed from: a */
        final /* synthetic */ Bundle f12024a;

        /* renamed from: b */
        final /* synthetic */ LoginClient.Request f12025b;

        C6507b(Bundle bundle, LoginClient.Request request) {
            this.f12024a = bundle;
            this.f12025b = request;
        }

        /* renamed from: a */
        public void mo20872a(JSONObject jSONObject) {
            try {
                this.f12024a.putString("com.facebook.platform.extra.USER_ID", jSONObject.getString(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID));
                GetTokenLoginMethodHandler.this.mo21118c(this.f12025b, this.f12024a);
            } catch (JSONException e) {
                LoginClient loginClient = GetTokenLoginMethodHandler.this.f12059g;
                loginClient.mo21129a(LoginClient.Result.m13721a(loginClient.mo21143g(), "Caught exception", e.getMessage()));
            }
        }

        /* renamed from: a */
        public void mo20871a(FacebookException facebookException) {
            LoginClient loginClient = GetTokenLoginMethodHandler.this.f12059g;
            loginClient.mo21129a(LoginClient.Result.m13721a(loginClient.mo21143g(), "Caught exception", facebookException.getMessage()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21116a(LoginClient.Request request, Bundle bundle) {
        String string = bundle.getString("com.facebook.platform.extra.USER_ID");
        if (string == null || string.isEmpty()) {
            this.f12059g.mo21144h();
            C6476x.m13506a(bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), (C6476x.C6479c) new C6507b(bundle, request));
            return;
        }
        mo21118c(request, bundle);
    }
}
