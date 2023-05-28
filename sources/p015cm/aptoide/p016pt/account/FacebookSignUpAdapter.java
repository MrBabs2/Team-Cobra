package p015cm.aptoide.p016pt.account;

import com.facebook.AccessToken;
import com.facebook.login.C6527g;
import java.util.List;
import p015cm.aptoide.accountmanager.Account;
import p015cm.aptoide.accountmanager.AccountService;
import p015cm.aptoide.accountmanager.SignUpAdapter;
import p123rx.C5328b;
import p123rx.Single;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.account.FacebookSignUpAdapter */
public class FacebookSignUpAdapter implements SignUpAdapter<FacebookLoginResult> {
    public static final String TYPE = "FACEBOOK";
    private final List<String> facebookRequiredPermissions;
    private final C6527g loginManager;
    private final LoginPreferences loginPreferences;

    public FacebookSignUpAdapter(List<String> list, C6527g gVar, LoginPreferences loginPreferences2) {
        this.facebookRequiredPermissions = list;
        this.loginManager = gVar;
        this.loginPreferences = loginPreferences2;
    }

    private Single<String> getFacebookEmail(AccessToken accessToken) {
        return Single.m10121a(new C1142q0(accessToken)).mo18563b(Schedulers.m10352io());
    }

    public boolean isEnabled() {
        return this.loginPreferences.isFacebookLoginEnabled();
    }

    public C5328b logout() {
        return C5328b.m10169d(new C1138o0(this));
    }

    public Single<Account> signUp(FacebookLoginResult facebookLoginResult, AccountService accountService) {
        if (!isEnabled()) {
            return Single.m10120a((Throwable) new IllegalStateException("Facebook sign up is not enabled"));
        }
        if (facebookLoginResult.getState() == 1) {
            return Single.m10120a((Throwable) new FacebookSignUpException(2, "USER_CANCELLED"));
        }
        if (facebookLoginResult.getState() == 99) {
            return Single.m10121a(new C1140p0(facebookLoginResult));
        }
        if (!facebookLoginResult.getResult().mo21221a().mo20785h().containsAll(this.facebookRequiredPermissions)) {
            return Single.m10120a((Throwable) new FacebookSignUpException(1, "MISSING_REQUIRED_PERMISSIONS"));
        }
        return getFacebookEmail(facebookLoginResult.getResult().mo21221a()).mo18559a(new C1144r0(accountService, facebookLoginResult));
    }

    /* renamed from: a */
    public /* synthetic */ void mo6261a() {
        this.loginManager.mo21213a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:12|13|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        return p123rx.Single.m10120a((java.lang.Throwable) new p015cm.aptoide.p016pt.account.FacebookSignUpException(99, "Error parsing email"));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ p123rx.Single m4341a(com.facebook.AccessToken r3) throws java.lang.Exception {
        /*
            java.lang.String r0 = "email"
            r1 = 0
            r2 = 99
            com.facebook.GraphRequest r3 = com.facebook.GraphRequest.m13072a((com.facebook.AccessToken) r3, (com.facebook.GraphRequest.C6345g) r1)     // Catch:{ RuntimeException -> 0x0047 }
            com.facebook.i r3 = r3.mo20825a()     // Catch:{ RuntimeException -> 0x0047 }
            org.json.JSONObject r1 = r3.mo20919b()     // Catch:{ RuntimeException -> 0x0047 }
            com.facebook.FacebookRequestError r3 = r3.mo20918a()     // Catch:{ RuntimeException -> 0x0047 }
            if (r3 != 0) goto L_0x003b
            if (r1 == 0) goto L_0x003b
            boolean r3 = r1.has(r0)     // Catch:{ JSONException -> 0x002f }
            if (r3 == 0) goto L_0x0024
            java.lang.String r3 = r1.getString(r0)     // Catch:{ JSONException -> 0x002f }
            goto L_0x002a
        L_0x0024:
            java.lang.String r3 = "id"
            java.lang.String r3 = r1.getString(r3)     // Catch:{ JSONException -> 0x002f }
        L_0x002a:
            rx.Single r3 = p123rx.Single.m10119a(r3)     // Catch:{ JSONException -> 0x002f }
            return r3
        L_0x002f:
            cm.aptoide.pt.account.FacebookSignUpException r3 = new cm.aptoide.pt.account.FacebookSignUpException     // Catch:{ RuntimeException -> 0x0047 }
            java.lang.String r0 = "Error parsing email"
            r3.<init>(r2, r0)     // Catch:{ RuntimeException -> 0x0047 }
            rx.Single r3 = p123rx.Single.m10120a((java.lang.Throwable) r3)     // Catch:{ RuntimeException -> 0x0047 }
            return r3
        L_0x003b:
            cm.aptoide.pt.account.FacebookSignUpException r3 = new cm.aptoide.pt.account.FacebookSignUpException     // Catch:{ RuntimeException -> 0x0047 }
            java.lang.String r0 = "Unknown error(maybe network error when getting user data)"
            r3.<init>(r2, r0)     // Catch:{ RuntimeException -> 0x0047 }
            rx.Single r3 = p123rx.Single.m10120a((java.lang.Throwable) r3)     // Catch:{ RuntimeException -> 0x0047 }
            return r3
        L_0x0047:
            r3 = move-exception
            cm.aptoide.pt.account.FacebookSignUpException r0 = new cm.aptoide.pt.account.FacebookSignUpException
            java.lang.String r3 = r3.getMessage()
            r0.<init>(r2, r3)
            rx.Single r3 = p123rx.Single.m10120a((java.lang.Throwable) r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.account.FacebookSignUpAdapter.m4341a(com.facebook.AccessToken):rx.Single");
    }
}
