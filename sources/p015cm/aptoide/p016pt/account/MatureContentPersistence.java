package p015cm.aptoide.p016pt.account;

import p015cm.aptoide.accountmanager.Account;
import p015cm.aptoide.accountmanager.AccountPersistence;
import p015cm.aptoide.accountmanager.AdultContent;
import p123rx.C5328b;
import p123rx.Single;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.account.MatureContentPersistence */
public class MatureContentPersistence implements AccountPersistence {
    private final AdultContent adultContent;
    private final AccountPersistence wrappedAccountPersistence;

    public MatureContentPersistence(AccountPersistence accountPersistence, AdultContent adultContent2) {
        this.wrappedAccountPersistence = accountPersistence;
        this.adultContent = adultContent2;
    }

    /* renamed from: a */
    static /* synthetic */ C5328b m4345a(C5328b bVar, Throwable th) {
        return bVar;
    }

    /* renamed from: a */
    public /* synthetic */ Account mo6273a(Account account) {
        return new MatureContentAccount(account, this.adultContent);
    }

    public Single<Account> getAccount() {
        return this.wrappedAccountPersistence.getAccount().mo18569d(new C1150u0(this));
    }

    public C5328b removeAccount() {
        return this.wrappedAccountPersistence.removeAccount().mo18587a(this.adultContent.disable(false));
    }

    public C5328b saveAccount(Account account) {
        C5328b bVar;
        if (account.isAdultContentEnabled()) {
            bVar = this.adultContent.enable(account.isLoggedIn());
        } else {
            bVar = this.adultContent.disable(account.isLoggedIn());
        }
        return this.wrappedAccountPersistence.saveAccount(account).mo18587a(bVar).mo18603b((C5379n<? super Throwable, ? extends C5328b>) new C1152v0(bVar));
    }
}
