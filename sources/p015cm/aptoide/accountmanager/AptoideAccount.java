package p015cm.aptoide.accountmanager;

import android.text.TextUtils;
import java.util.List;
import p015cm.aptoide.accountmanager.Account;

/* renamed from: cm.aptoide.accountmanager.AptoideAccount */
public final class AptoideAccount implements Account {
    private final Account.Access access;
    private final boolean accessConfirmed;
    private final boolean adultContentEnabled;
    private final String avatar;
    private final String email;

    /* renamed from: id */
    private final String f3338id;
    private final String nickname;
    private final boolean privacyPolicy;
    private final Store store;
    private final List<Store> subscribedStores;
    private final boolean termsAndConditions;

    public AptoideAccount(String str, String str2, String str3, String str4, Store store2, boolean z, Account.Access access2, boolean z2, List<Store> list, boolean z3, boolean z4) {
        this.f3338id = str;
        this.email = str2;
        this.nickname = str3;
        this.avatar = str4;
        this.store = store2;
        this.adultContentEnabled = z;
        this.access = access2;
        this.accessConfirmed = z2;
        this.subscribedStores = list;
        this.privacyPolicy = z3;
        this.termsAndConditions = z4;
    }

    public boolean acceptedPrivacyPolicy() {
        return this.privacyPolicy;
    }

    public boolean acceptedTermsAndConditions() {
        return this.termsAndConditions;
    }

    public Account.Access getAccess() {
        return this.access;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getEmail() {
        return this.email;
    }

    public String getId() {
        return this.f3338id;
    }

    public String getNickname() {
        return this.nickname;
    }

    public Store getStore() {
        return this.store;
    }

    public List<Store> getSubscribedStores() {
        return this.subscribedStores;
    }

    public boolean hasStore() {
        Store store2 = this.store;
        return store2 != null && !TextUtils.isEmpty(store2.getName());
    }

    public boolean isAccessConfirmed() {
        return this.accessConfirmed;
    }

    public boolean isAdultContentEnabled() {
        return this.adultContentEnabled;
    }

    public boolean isLoggedIn() {
        return true;
    }

    public boolean isPublicStore() {
        Store store2 = this.store;
        return store2 != null && store2.hasPublicAccess();
    }

    public boolean isPublicUser() {
        return this.access == Account.Access.PUBLIC;
    }
}
