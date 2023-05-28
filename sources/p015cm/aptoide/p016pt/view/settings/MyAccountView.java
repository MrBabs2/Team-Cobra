package p015cm.aptoide.p016pt.view.settings;

import p015cm.aptoide.accountmanager.Account;
import p015cm.aptoide.aptoideviews.socialmedia.SocialMediaView;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStore;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.view.settings.MyAccountView */
public interface MyAccountView extends View {
    C5368e<Void> aptoideBackupCardViewClick();

    C5368e<Void> aptoideTvCardViewClick();

    C5368e<Void> aptoideUploaderCardViewClick();

    C5368e<Void> createStoreClick();

    C5368e<Void> editStoreClick();

    C5368e<Void> editUserProfileClick();

    C5368e<GetStore> getStore();

    C5368e<Void> loginClick();

    void refreshUI(Store store);

    C5368e<Void> settingsClicked();

    void showAccount(Account account);

    void showLoginAccountDisplayable();

    C5368e<Void> signOutClick();

    C5368e<SocialMediaView.SocialMediaType> socialMediaClick();

    void startAptoideTvWebView();

    C5368e<Void> storeClick();

    C5368e<Void> userClick();
}
