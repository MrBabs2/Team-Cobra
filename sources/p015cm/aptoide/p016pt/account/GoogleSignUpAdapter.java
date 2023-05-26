package p015cm.aptoide.p016pt.account;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes;
import com.google.android.gms.common.api.GoogleApiClient;
import p015cm.aptoide.accountmanager.Account;
import p015cm.aptoide.accountmanager.AccountService;
import p015cm.aptoide.accountmanager.SignUpAdapter;
import p123rx.C5328b;
import p123rx.Single;
import p123rx.p126m.C12495m;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.account.GoogleSignUpAdapter */
public class GoogleSignUpAdapter implements SignUpAdapter<GoogleSignInResult> {
    public static final String TYPE = "GOOGLE";
    private final GoogleApiClient client;
    private final LoginPreferences preferences;

    public GoogleSignUpAdapter(GoogleApiClient googleApiClient, LoginPreferences loginPreferences) {
        this.preferences = loginPreferences;
        this.client = googleApiClient;
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo6265a() {
        if (!this.client.mo24938a().mo24846t()) {
            return C5328b.m10163b((Throwable) new IllegalStateException("Could not connect to Google Play Services to sign out."));
        }
        Auth.f13432f.mo24753c(this.client);
        return C5328b.m10170f();
    }

    public boolean isEnabled() {
        return this.preferences.isGoogleLoginEnabled();
    }

    public C5328b logout() {
        return C5328b.m10166b((C12495m<? extends C5328b>) new C1146s0(this)).mo18600b(Schedulers.m10352io());
    }

    public Single<Account> signUp(GoogleSignInResult googleSignInResult, AccountService accountService) {
        if (!isEnabled()) {
            return Single.m10120a((Throwable) new IllegalStateException("Google sign up is not enabled"));
        }
        GoogleSignInAccount a = googleSignInResult.mo24773a();
        if (!googleSignInResult.mo24774c() || a == null) {
            return Single.m10120a((Throwable) new GoogleSignUpException(GoogleSignInStatusCodes.m15174a(googleSignInResult.getStatus().mo24981d()), googleSignInResult.getStatus().mo24981d()));
        }
        return accountService.createAccount(a.mo24739o(), a.mo24747x(), TYPE);
    }
}
