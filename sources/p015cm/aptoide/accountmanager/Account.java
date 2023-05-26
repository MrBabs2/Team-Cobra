package p015cm.aptoide.accountmanager;

import java.util.List;

/* renamed from: cm.aptoide.accountmanager.Account */
public interface Account {

    /* renamed from: cm.aptoide.accountmanager.Account$Access */
    public enum Access {
        PUBLIC,
        PRIVATE,
        UNLISTED
    }

    boolean acceptedPrivacyPolicy();

    boolean acceptedTermsAndConditions();

    Access getAccess();

    String getAvatar();

    String getEmail();

    String getId();

    String getNickname();

    Store getStore();

    List<Store> getSubscribedStores();

    boolean hasStore();

    boolean isAccessConfirmed();

    boolean isAdultContentEnabled();

    boolean isLoggedIn();

    boolean isPublicStore();

    boolean isPublicUser();
}
