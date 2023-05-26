package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.C0456c;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.common.C6363d;
import com.facebook.internal.C6422d;
import com.facebook.internal.C6476x;
import com.facebook.internal.C6481y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import okhttp3.internal.cache.DiskLruCache;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.install.installer.RootCommandOnSubscribe;

class LoginClient implements Parcelable {
    public static final Parcelable.Creator<LoginClient> CREATOR = new C6513a();

    /* renamed from: f */
    LoginMethodHandler[] f12027f;

    /* renamed from: g */
    int f12028g = -1;

    /* renamed from: h */
    Fragment f12029h;

    /* renamed from: i */
    C6515c f12030i;

    /* renamed from: j */
    C6514b f12031j;

    /* renamed from: k */
    boolean f12032k;

    /* renamed from: l */
    Request f12033l;

    /* renamed from: m */
    Map<String, String> f12034m;

    /* renamed from: n */
    Map<String, String> f12035n;

    /* renamed from: o */
    private C6526f f12036o;

    public static class Request implements Parcelable {
        public static final Parcelable.Creator<Request> CREATOR = new C6510a();

        /* renamed from: f */
        private final C6522d f12037f;

        /* renamed from: g */
        private Set<String> f12038g;

        /* renamed from: h */
        private final C6520b f12039h;

        /* renamed from: i */
        private final String f12040i;

        /* renamed from: j */
        private final String f12041j;

        /* renamed from: k */
        private boolean f12042k;

        /* renamed from: l */
        private String f12043l;

        /* renamed from: m */
        private String f12044m;

        /* renamed from: n */
        private String f12045n;

        /* renamed from: com.facebook.login.LoginClient$Request$a */
        static class C6510a implements Parcelable.Creator<Request> {
            C6510a() {
            }

            public Request createFromParcel(Parcel parcel) {
                return new Request(parcel, (C6513a) null);
            }

            public Request[] newArray(int i) {
                return new Request[i];
            }
        }

        /* synthetic */ Request(Parcel parcel, C6513a aVar) {
            this(parcel);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo21150a(Set<String> set) {
            C6481y.m13556a((Object) set, "permissions");
            this.f12038g = set;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo21152b() {
            return this.f12041j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public String mo21153c() {
            return this.f12044m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C6520b mo21154d() {
            return this.f12039h;
        }

        public int describeContents() {
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public String mo21156e() {
            return this.f12045n;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public String mo21157f() {
            return this.f12043l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C6522d mo21158g() {
            return this.f12037f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Set<String> mo21159h() {
            return this.f12038g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo21160j() {
            for (String a : this.f12038g) {
                if (C6527g.m13803a(a)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo21161k() {
            return this.f12042k;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C6522d dVar = this.f12037f;
            String str = null;
            parcel.writeString(dVar != null ? dVar.name() : null);
            parcel.writeStringList(new ArrayList(this.f12038g));
            C6520b bVar = this.f12039h;
            if (bVar != null) {
                str = bVar.name();
            }
            parcel.writeString(str);
            parcel.writeString(this.f12040i);
            parcel.writeString(this.f12041j);
            parcel.writeByte(this.f12042k ? (byte) 1 : 0);
            parcel.writeString(this.f12043l);
            parcel.writeString(this.f12044m);
            parcel.writeString(this.f12045n);
        }

        Request(C6522d dVar, Set<String> set, C6520b bVar, String str, String str2, String str3) {
            this.f12042k = false;
            this.f12037f = dVar;
            this.f12038g = set == null ? new HashSet<>() : set;
            this.f12039h = bVar;
            this.f12044m = str;
            this.f12040i = str2;
            this.f12041j = str3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo21149a() {
            return this.f12040i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo21151a(boolean z) {
            this.f12042k = z;
        }

        private Request(Parcel parcel) {
            boolean z = false;
            this.f12042k = false;
            String readString = parcel.readString();
            C6520b bVar = null;
            this.f12037f = readString != null ? C6522d.valueOf(readString) : null;
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f12038g = new HashSet(arrayList);
            String readString2 = parcel.readString();
            this.f12039h = readString2 != null ? C6520b.valueOf(readString2) : bVar;
            this.f12040i = parcel.readString();
            this.f12041j = parcel.readString();
            this.f12042k = parcel.readByte() != 0 ? true : z;
            this.f12043l = parcel.readString();
            this.f12044m = parcel.readString();
            this.f12045n = parcel.readString();
        }
    }

    public static class Result implements Parcelable {
        public static final Parcelable.Creator<Result> CREATOR = new C6511a();

        /* renamed from: f */
        final C6512b f12046f;

        /* renamed from: g */
        final AccessToken f12047g;

        /* renamed from: h */
        final String f12048h;

        /* renamed from: i */
        final String f12049i;

        /* renamed from: j */
        final Request f12050j;

        /* renamed from: k */
        public Map<String, String> f12051k;

        /* renamed from: l */
        public Map<String, String> f12052l;

        /* renamed from: com.facebook.login.LoginClient$Result$a */
        static class C6511a implements Parcelable.Creator<Result> {
            C6511a() {
            }

            public Result createFromParcel(Parcel parcel) {
                return new Result(parcel, (C6513a) null);
            }

            public Result[] newArray(int i) {
                return new Result[i];
            }
        }

        /* renamed from: com.facebook.login.LoginClient$Result$b */
        enum C6512b {
            SUCCESS(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION),
            CANCEL("cancel"),
            ERROR("error");
            

            /* renamed from: f */
            private final String f12057f;

            private C6512b(String str) {
                this.f12057f = str;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public String mo21169a() {
                return this.f12057f;
            }
        }

        /* synthetic */ Result(Parcel parcel, C6513a aVar) {
            this(parcel);
        }

        /* renamed from: a */
        static Result m13719a(Request request, AccessToken accessToken) {
            return new Result(request, C6512b.SUCCESS, accessToken, (String) null, (String) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f12046f.name());
            parcel.writeParcelable(this.f12047g, i);
            parcel.writeString(this.f12048h);
            parcel.writeString(this.f12049i);
            parcel.writeParcelable(this.f12050j, i);
            C6476x.m13503a(parcel, this.f12051k);
            C6476x.m13503a(parcel, this.f12052l);
        }

        Result(Request request, C6512b bVar, AccessToken accessToken, String str, String str2) {
            C6481y.m13556a((Object) bVar, "code");
            this.f12050j = request;
            this.f12047g = accessToken;
            this.f12048h = str;
            this.f12046f = bVar;
            this.f12049i = str2;
        }

        /* renamed from: a */
        static Result m13720a(Request request, String str) {
            return new Result(request, C6512b.CANCEL, (AccessToken) null, str, (String) null);
        }

        /* renamed from: a */
        static Result m13721a(Request request, String str, String str2) {
            return m13722a(request, str, str2, (String) null);
        }

        /* renamed from: a */
        static Result m13722a(Request request, String str, String str2, String str3) {
            return new Result(request, C6512b.ERROR, (AccessToken) null, TextUtils.join(": ", C6476x.m13495a((T[]) new String[]{str, str2})), str3);
        }

        private Result(Parcel parcel) {
            this.f12046f = C6512b.valueOf(parcel.readString());
            this.f12047g = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.f12048h = parcel.readString();
            this.f12049i = parcel.readString();
            this.f12050j = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.f12051k = C6476x.m13496a(parcel);
            this.f12052l = C6476x.m13496a(parcel);
        }
    }

    /* renamed from: com.facebook.login.LoginClient$a */
    static class C6513a implements Parcelable.Creator<LoginClient> {
        C6513a() {
        }

        public LoginClient createFromParcel(Parcel parcel) {
            return new LoginClient(parcel);
        }

        public LoginClient[] newArray(int i) {
            return new LoginClient[i];
        }
    }

    /* renamed from: com.facebook.login.LoginClient$b */
    interface C6514b {
        /* renamed from: a */
        void mo21172a();

        /* renamed from: b */
        void mo21173b();
    }

    /* renamed from: com.facebook.login.LoginClient$c */
    public interface C6515c {
        /* renamed from: a */
        void mo21174a(Result result);
    }

    public LoginClient(Fragment fragment) {
        this.f12029h = fragment;
    }

    /* renamed from: o */
    private void m13681o() {
        mo21129a(Result.m13721a(this.f12033l, "Login attempt failed.", (String) null));
    }

    /* renamed from: p */
    static String m13682p() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: q */
    private C6526f m13683q() {
        C6526f fVar = this.f12036o;
        if (fVar == null || !fVar.mo21203a().equals(this.f12033l.mo21149a())) {
            this.f12036o = new C6526f(mo21136c(), this.f12033l.mo21149a());
        }
        return this.f12036o;
    }

    /* renamed from: r */
    public static int m13684r() {
        return C6422d.C6424b.Login.mo20973a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21127a(Fragment fragment) {
        if (this.f12029h == null) {
            this.f12029h = fragment;
            return;
        }
        throw new FacebookException("Can't set fragment once it is already set.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public LoginMethodHandler[] mo21135b(Request request) {
        ArrayList arrayList = new ArrayList();
        C6522d g = request.mo21158g();
        if (g.mo21197i()) {
            arrayList.add(new GetTokenLoginMethodHandler(this));
        }
        if (g.mo21198l()) {
            arrayList.add(new KatanaProxyLoginMethodHandler(this));
        }
        if (g.mo21196e()) {
            arrayList.add(new FacebookLiteLoginMethodHandler(this));
        }
        if (g.mo21194a()) {
            arrayList.add(new CustomTabLoginMethodHandler(this));
        }
        if (g.mo21199m()) {
            arrayList.add(new WebViewLoginMethodHandler(this));
        }
        if (g.mo21195d()) {
            arrayList.add(new DeviceAuthMethodHandler(this));
        }
        LoginMethodHandler[] loginMethodHandlerArr = new LoginMethodHandler[arrayList.size()];
        arrayList.toArray(loginMethodHandlerArr);
        return loginMethodHandlerArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0456c mo21136c() {
        return this.f12029h.getActivity();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public LoginMethodHandler mo21139d() {
        int i = this.f12028g;
        if (i >= 0) {
            return this.f12027f[i];
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Fragment mo21141e() {
        return this.f12029h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo21142f() {
        return this.f12033l != null && this.f12028g >= 0;
    }

    /* renamed from: g */
    public Request mo21143g() {
        return this.f12033l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo21144h() {
        C6514b bVar = this.f12031j;
        if (bVar != null) {
            bVar.mo21172a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo21145j() {
        C6514b bVar = this.f12031j;
        if (bVar != null) {
            bVar.mo21173b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo21146k() {
        LoginMethodHandler d = mo21139d();
        if (!d.mo21179c() || mo21134b()) {
            boolean a = d.mo21074a(this.f12033l);
            if (a) {
                m13683q().mo21209b(this.f12033l.mo21152b(), d.mo21075b());
            } else {
                m13683q().mo21205a(this.f12033l.mo21152b(), d.mo21075b());
                m13679a("not_tried", d.mo21075b(), true);
            }
            return a;
        }
        m13679a("no_internet_permission", DiskLruCache.VERSION_1, false);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo21147n() {
        int i;
        if (this.f12028g >= 0) {
            m13678a(mo21139d().mo21075b(), "skipped", (String) null, (String) null, mo21139d().f12058f);
        }
        do {
            LoginMethodHandler[] loginMethodHandlerArr = this.f12027f;
            if (loginMethodHandlerArr != null && (i = this.f12028g) < loginMethodHandlerArr.length - 1) {
                this.f12028g = i + 1;
            } else if (this.f12033l != null) {
                m13681o();
                return;
            } else {
                return;
            }
        } while (!mo21146k());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.f12027f, i);
        parcel.writeInt(this.f12028g);
        parcel.writeParcelable(this.f12033l, i);
        C6476x.m13503a(parcel, this.f12034m);
        C6476x.m13503a(parcel, this.f12035n);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo21137c(Request request) {
        if (!mo21142f()) {
            mo21128a(request);
        }
    }

    /* renamed from: d */
    private void m13680d(Result result) {
        C6515c cVar = this.f12030i;
        if (cVar != null) {
            cVar.mo21174a(result);
        }
    }

    public LoginClient(Parcel parcel) {
        Parcelable[] readParcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        this.f12027f = new LoginMethodHandler[readParcelableArray.length];
        for (int i = 0; i < readParcelableArray.length; i++) {
            LoginMethodHandler[] loginMethodHandlerArr = this.f12027f;
            loginMethodHandlerArr[i] = (LoginMethodHandler) readParcelableArray[i];
            loginMethodHandlerArr[i].mo21176a(this);
        }
        this.f12028g = parcel.readInt();
        this.f12033l = (Request) parcel.readParcelable(Request.class.getClassLoader());
        this.f12034m = C6476x.m13496a(parcel);
        this.f12035n = C6476x.m13496a(parcel);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21128a(Request request) {
        if (request != null) {
            if (this.f12033l != null) {
                throw new FacebookException("Attempted to authorize while a request is pending.");
            } else if (!AccessToken.m13037s() || mo21134b()) {
                this.f12033l = request;
                this.f12027f = mo21135b(request);
                mo21147n();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo21138c(Result result) {
        Result result2;
        if (result.f12047g != null) {
            AccessToken r = AccessToken.m13036r();
            AccessToken accessToken = result.f12047g;
            if (!(r == null || accessToken == null)) {
                try {
                    if (r.mo20789n().equals(accessToken.mo20789n())) {
                        result2 = Result.m13719a(this.f12033l, result.f12047g);
                        mo21129a(result2);
                        return;
                    }
                } catch (Exception e) {
                    mo21129a(Result.m13721a(this.f12033l, "Caught exception", e.getMessage()));
                    return;
                }
            }
            result2 = Result.m13721a(this.f12033l, "User logged in as different Facebook user.", (String) null);
            mo21129a(result2);
            return;
        }
        throw new FacebookException("Can't validate without a token");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21126a() {
        if (this.f12028g >= 0) {
            mo21139d().mo21115a();
        }
    }

    /* renamed from: a */
    public boolean mo21132a(int i, int i2, Intent intent) {
        if (this.f12033l != null) {
            return mo21139d().mo21073a(i, i2, intent);
        }
        return false;
    }

    /* renamed from: a */
    private void m13679a(String str, String str2, boolean z) {
        if (this.f12034m == null) {
            this.f12034m = new HashMap();
        }
        if (this.f12034m.containsKey(str) && z) {
            str2 = this.f12034m.get(str) + "," + str2;
        }
        this.f12034m.put(str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo21134b() {
        if (this.f12032k) {
            return true;
        }
        if (mo21125a("android.permission.INTERNET") != 0) {
            C0456c c = mo21136c();
            mo21129a(Result.m13721a(this.f12033l, c.getString(C6363d.com_facebook_internet_permission_error_title), c.getString(C6363d.com_facebook_internet_permission_error_message)));
            return false;
        }
        this.f12032k = true;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21129a(Result result) {
        LoginMethodHandler d = mo21139d();
        if (d != null) {
            m13677a(d.mo21075b(), result, d.f12058f);
        }
        Map<String, String> map = this.f12034m;
        if (map != null) {
            result.f12051k = map;
        }
        Map<String, String> map2 = this.f12035n;
        if (map2 != null) {
            result.f12052l = map2;
        }
        this.f12027f = null;
        this.f12028g = -1;
        this.f12033l = null;
        this.f12034m = null;
        m13680d(result);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo21133b(Result result) {
        if (result.f12047g == null || !AccessToken.m13037s()) {
            mo21129a(result);
        } else {
            mo21138c(result);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21131a(C6515c cVar) {
        this.f12030i = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21130a(C6514b bVar) {
        this.f12031j = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo21125a(String str) {
        return mo21136c().checkCallingOrSelfPermission(str);
    }

    /* renamed from: a */
    private void m13677a(String str, Result result, Map<String, String> map) {
        m13678a(str, result.f12046f.mo21169a(), result.f12048h, result.f12049i, map);
    }

    /* renamed from: a */
    private void m13678a(String str, String str2, String str3, String str4, Map<String, String> map) {
        if (this.f12033l == null) {
            m13683q().mo21206a("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
        } else {
            m13683q().mo21207a(this.f12033l.mo21152b(), str, str2, str3, str4, map);
        }
    }
}
