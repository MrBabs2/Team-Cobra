package p015cm.aptoide.accountmanager;

import p123rx.C5328b;
import p123rx.Single;

/* renamed from: cm.aptoide.accountmanager.AccountPersistence */
public interface AccountPersistence {
    Single<Account> getAccount();

    C5328b removeAccount();

    C5328b saveAccount(Account account);
}
