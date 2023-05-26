package p015cm.aptoide.p016pt.app.view;

import android.util.Pair;
import android.view.MenuItem;
import java.util.List;
import p015cm.aptoide.p016pt.app.AppModel;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.app.ReviewsViewModel;
import p015cm.aptoide.p016pt.app.view.screenshots.ScreenShotClickEvent;
import p015cm.aptoide.p016pt.app.view.similar.SimilarAppClickEvent;
import p015cm.aptoide.p016pt.app.view.similar.SimilarAppsBundle;
import p015cm.aptoide.p016pt.appview.InstallAppView;
import p015cm.aptoide.p016pt.bonus.BonusAppcModel;
import p015cm.aptoide.p016pt.donations.Donation;
import p015cm.aptoide.p016pt.promotions.Promotion;
import p015cm.aptoide.p016pt.promotions.WalletApp;
import p015cm.aptoide.p016pt.search.model.SearchAdResult;
import p015cm.aptoide.p016pt.utils.GenericDialogs;
import p015cm.aptoide.p016pt.view.app.DetailedAppRequestResult;
import p015cm.aptoide.p016pt.view.app.FlagsVote;
import p112n.p118g.p301a.p310c.C10706f;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.app.view.AppViewView */
public interface AppViewView extends InstallAppView {
    C5368e<String> apkfyDialogPositiveClick();

    C5368e<WalletApp> cancelPromotionDownload();

    C5368e<Promotion> claimAppClick();

    C5368e<Void> clickBonusAppcFlair();

    C5368e<Void> clickCatappultCard();

    C5368e<Void> clickDeveloperEmail();

    C5368e<Void> clickDeveloperPermissions();

    C5368e<Void> clickDeveloperPrivacy();

    C5368e<Void> clickDeveloperWebsite();

    C5368e<Void> clickErrorRetry();

    C5368e<FlagsVote.VoteType> clickFakeFlag();

    C5368e<Void> clickFollowStore();

    C5368e<Void> clickGetAppcInfo();

    C5368e<FlagsVote.VoteType> clickLicenseFlag();

    C5368e<Void> clickLoginSnack();

    C5368e<Void> clickOtherVersions();

    C5368e<Void> clickRateApp();

    C5368e<Void> clickRateAppLarge();

    C5368e<Void> clickRateAppLayout();

    C5368e<Void> clickReadAllReviews();

    C5368e<Void> clickReviewsLayout();

    C5368e<SimilarAppClickEvent> clickSimilarApp();

    C5368e<Void> clickStoreLayout();

    C5368e<MenuItem> clickToolbar();

    C5368e<Void> clickTopDonorsDonateButton();

    C5368e<Void> clickTrustedBadge();

    C5368e<FlagsVote.VoteType> clickVirusFlag();

    C5368e<FlagsVote.VoteType> clickWorkingFlag();

    C5368e<ReadMoreClickEvent> clickedReadMore();

    void defaultShare(String str, String str2);

    void disableFlags();

    C5368e<Promotion> dismissWalletPromotionClick();

    void dismissWalletPromotionView();

    void displayNotLoggedInSnack();

    void displayStoreFollowedSnack(String str);

    C5368e<Void> eSkillsCardClick();

    void enableFlags();

    void extractReferrer(SearchAdResult searchAdResult);

    String getLanguageFilter();

    C5368e<ScreenShotClickEvent> getScreenshotClickEvent();

    void handleError(DetailedAppRequestResult.Error error);

    void hideReviews();

    void hideSimilarApps();

    C5368e<Void> iabInfoClick();

    void incrementFlags(FlagsVote.VoteType voteType);

    C5368e<Pair<Promotion, WalletApp>> installWalletButtonClick();

    boolean isSimilarAppsVisible();

    void navigateToDeveloperEmail(AppModel appModel);

    void navigateToDeveloperPermissions(AppModel appModel);

    void navigateToDeveloperPrivacy(AppModel appModel);

    void navigateToDeveloperWebsite(AppModel appModel);

    C5368e<WalletApp> pausePromotionDownload();

    void populateReviews(ReviewsViewModel reviewsViewModel, AppModel appModel);

    void populateSimilar(List<SimilarAppsBundle> list);

    void recoverScrollViewState();

    C5368e<WalletApp> resumePromotionDownload();

    void scrollReviews(Integer num);

    C5368e<Integer> scrollReviewsResponse();

    C5368e<C10706f> scrollVisibleSimilarApps();

    void setFollowButton(boolean z);

    void setInstallButton(AppCoinsViewModel appCoinsViewModel);

    void setupAppcAppView(boolean z, BonusAppcModel bonusAppcModel);

    void showApkfyElement(String str);

    void showAppView(AppModel appModel);

    void showAppcWalletPromotionView(Promotion promotion, WalletApp walletApp, Promotion.ClaimAction claimAction, DownloadModel downloadModel);

    void showDonations(List<Donation> list);

    void showDownloadError(DownloadModel downloadModel);

    void showDownloadingSimilarApps(boolean z);

    void showFlagVoteSubmittedMessage();

    void showLoading();

    C5368e<Void> showOpenAndInstallApkFyDialog(String str, String str2, double d, float f, String str3, int i);

    C5368e<Void> showOpenAndInstallDialog(String str, String str2);

    C5368e<GenericDialogs.EResponse> showRateDialog(String str, String str2, String str3);

    void showShareOnTvDialog(long j);

    void showTrustedDialog(AppModel appModel);

    C5368e<Boolean> similarAppsVisibilityFromInstallClick();
}
