package p015cm.aptoide.accountmanager;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import p015cm.aptoide.accountmanager.Account;

/* renamed from: cm.aptoide.accountmanager.LocalAccount */
public class LocalAccount implements Account {
    private final Store store;

    public LocalAccount(Store store2) {
        this.store = store2;
    }

    public boolean acceptedPrivacyPolicy() {
        return false;
    }

    public boolean acceptedTermsAndConditions() {
        return false;
    }

    public Account.Access getAccess() {
        return Account.Access.UNLISTED;
    }

    public String getAvatar() {
        return "";
    }

    public String getEmail() {
        return "";
    }

    public String getId() {
        return "";
    }

    public String getNickname() {
        return "";
    }

    public Store getStore() {
        return this.store;
    }

    public List<Store> getSubscribedStores() {
        return Collections.emptyList();
    }

    public boolean hasStore() {
        Store store2 = this.store;
        return store2 != null && !TextUtils.isEmpty(store2.getName());
    }

    public boolean isAccessConfirmed() {
        return false;
    }

    public boolean isAdultContentEnabled() {
        return false;
    }

    public boolean isLoggedIn() {
        return false;
    }

    public boolean isPublicStore() {
        Store store2 = this.store;
        return store2 != null && store2.hasPublicAccess();
    }

    public boolean isPublicUser() {
        return getAccess() == Account.Access.PUBLIC;
    }
}
