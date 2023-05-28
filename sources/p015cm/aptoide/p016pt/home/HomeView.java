package p015cm.aptoide.p016pt.home;

import p015cm.aptoide.p016pt.home.apps.BundleView;
import p015cm.aptoide.p016pt.home.bundles.HomeBundlesModel;
import p015cm.aptoide.p016pt.home.bundles.base.AppComingSoonPromotionalBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.home.bundles.editorial.EditorialHomeEvent;
import p015cm.aptoide.p016pt.reactions.ReactionsHomeEvent;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.home.HomeView */
public interface HomeView extends BundleView {
    C5368e<HomeEvent> cancelNotifyMeClicked();

    C5368e<HomeEvent> dismissBundleClicked();

    C5368e<HomeEvent> eSkillsKnowMoreClick();

    C5368e<EditorialHomeEvent> editorialCardClicked();

    void hideBundle(int i);

    C5368e<Void> imageClick();

    C5368e<HomeEvent> infoBundleKnowMoreClicked();

    C5368e<HomeEvent> notifyMeClicked();

    C5368e<HomeEvent> onLoadMoreRetryClicked();

    C5368e<EditorialHomeEvent> reactionButtonLongPress();

    C5368e<ReactionsHomeEvent> reactionClicked();

    C5368e<EditorialHomeEvent> reactionsButtonClicked();

    void removeLoadMoreError();

    void scrollToTop();

    void sendDeeplinkToWalletAppView(String str);

    void setAdsTest(boolean z);

    void setUserImage(String str);

    void showBundlesSkeleton(HomeBundlesModel homeBundlesModel);

    void showConsentDialog();

    void showGenericErrorToast();

    void showLoadMoreError();

    void showLogInDialog();

    void showNetworkErrorToast();

    void showReactionsPopup(String str, String str2, int i);

    C5368e<Void> snackLogInClick();

    void updateAppComingSoonStatus(AppComingSoonPromotionalBundle appComingSoonPromotionalBundle, boolean z);

    C5368e<HomeEvent> walletOfferCardInstallWalletClick();
}
