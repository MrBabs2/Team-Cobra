package p015cm.aptoide.p016pt.account;

import java.util.List;
import p015cm.aptoide.accountmanager.Account;
import p015cm.aptoide.accountmanager.AdultContent;
import p015cm.aptoide.accountmanager.Store;

/* renamed from: cm.aptoide.pt.account.MatureContentAccount */
public class MatureContentAccount implements Account {
    private final AdultContent adultContent;
    private final Account wrappedAccount;

    public MatureContentAccount(Account account, AdultContent adultContent2) {
        this.wrappedAccount = account;
        this.adultContent = adultContent2;
    }

    public boolean acceptedPrivacyPolicy() {
        return this.wrappedAccount.acceptedPrivacyPolicy();
    }

    public boolean acceptedTermsAndConditions() {
        return this.wrappedAccount.acceptedTermsAndConditions();
    }

    public Account.Access getAccess() {
        return this.wrappedAccount.getAccess();
    }

    public String getAvatar() {
        return this.wrappedAccount.getAvatar();
    }

    public String getEmail() {
        return this.wrappedAccount.getEmail();
    }

    public String getId() {
        return this.wrappedAccount.getId();
    }

    public String getNickname() {
        return this.wrappedAccount.getNickname();
    }

    public Store getStore() {
        return this.wrappedAccount.getStore();
    }

    public List<Store> getSubscribedStores() {
        return this.wrappedAccount.getSubscribedStores();
    }

    public boolean hasStore() {
        return this.wrappedAccount.hasStore();
    }

    public boolean isAccessConfirmed() {
        return this.wrappedAccount.isAccessConfirmed();
    }

    public boolean isAdultContentEnabled() {
        return this.adultContent.enabled().mo18669c().mo18700m().mo18562a().mo41082a().booleanValue();
    }

    public boolean isLoggedIn() {
        return this.wrappedAccount.isLoggedIn();
    }

    public boolean isPublicStore() {
        return this.wrappedAccount.isPublicStore();
    }

    public boolean isPublicUser() {
        return this.wrappedAccount.isPublicUser();
    }
}
