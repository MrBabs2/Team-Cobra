package p015cm.aptoide.accountmanager;

import com.aptoide.authentication.model.CodeAuth;
import p050l.p075h.p083k.C5004d;
import p123rx.C5328b;
import p123rx.Single;

/* renamed from: cm.aptoide.accountmanager.AccountService */
public interface AccountService {
    Single<Account> createAccount(String str, String str2);

    Single<Account> createAccount(String str, String str2, String str3);

    Single<Account> getAccount(String str);

    Single<C5004d<Account, Boolean>> getAccount(String str, String str2, String str3, String str4);

    C5328b removeAccount();

    Single<CodeAuth> sendMagicLink(String str);

    C5328b subscribeStore(String str, String str2, String str3);

    C5328b unsubscribeStore(String str, String str2, String str3);

    C5328b updateAccount(String str);

    C5328b updateAccount(String str, String str2);

    C5328b updateAccount(boolean z);

    C5328b updateAccountUsername(String str);

    C5328b updateTermsAndConditions();
}
