package p015cm.aptoide.accountmanager;

import java.net.SocketTimeoutException;
import p050l.p075h.p083k.C5004d;
import p123rx.C5328b;
import p123rx.Single;

/* renamed from: cm.aptoide.accountmanager.AptoideSignUpAdapter */
public class AptoideSignUpAdapter implements SignUpAdapter<AptoideCredentials> {
    private final CredentialsValidator credentialsValidator;

    public AptoideSignUpAdapter(CredentialsValidator credentialsValidator2) {
        this.credentialsValidator = credentialsValidator2;
    }

    /* renamed from: a */
    static /* synthetic */ Single m4183a(AccountService accountService, AptoideCredentials aptoideCredentials, Throwable th) {
        if (th instanceof SocketTimeoutException) {
            return accountService.getAccount(aptoideCredentials.getEmail(), aptoideCredentials.getCode(), "", "").mo18569d(C1006u.f3395f);
        }
        return Single.m10120a(th);
    }

    public boolean isEnabled() {
        return true;
    }

    public C5328b logout() {
        return C5328b.m10170f();
    }

    public Single<Account> signUp(AptoideCredentials aptoideCredentials, AccountService accountService) {
        return this.credentialsValidator.validate(aptoideCredentials).mo18583a(accountService.createAccount(aptoideCredentials.getEmail(), aptoideCredentials.getCode())).mo18570e(new C1005t(accountService, aptoideCredentials));
    }

    /* renamed from: a */
    static /* synthetic */ Account m4182a(C5004d dVar) {
        return (Account) dVar.f8862a;
    }
}
