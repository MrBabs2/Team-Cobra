package p015cm.aptoide.p016pt.editorial;

import java.util.List;
import p015cm.aptoide.aptoideviews.socialmedia.SocialMediaView;
import p015cm.aptoide.p016pt.editorial.EditorialViewModel;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.reactions.ReactionEvent;
import p015cm.aptoide.p016pt.reactions.data.TopReaction;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.editorial.EditorialView */
public interface EditorialView extends View {
    C5368e<EditorialEvent> actionButtonClicked();

    void addBottomCardAnimation();

    C5368e<EditorialEvent> appCardClicked(EditorialViewModel editorialViewModel);

    C5368e<EditorialDownloadEvent> cancelDownload(EditorialViewModel editorialViewModel);

    String getAction();

    C5368e<Boolean> handleMovingCollapse();

    void hideLoading();

    C5368e<EditorialDownloadEvent> installButtonClick(EditorialViewModel editorialViewModel);

    C5368e<Void> isViewReady();

    void manageMediaListDescriptionAnimationVisibility(EditorialEvent editorialEvent);

    void managePlaceHolderVisibity();

    C5368e<EditorialEvent> mediaContentClicked();

    C5368e<EditorialEvent> mediaListDescriptionChanged();

    void openApp(String str);

    C5368e<EditorialDownloadEvent> pauseDownload(EditorialViewModel editorialViewModel);

    C5368e<ScrollEvent> placeHolderVisibilityChange();

    void populateView(EditorialViewModel editorialViewModel);

    C5368e<ReactionEvent> reactionClicked();

    C5368e<Void> reactionsButtonClicked();

    C5368e<Void> reactionsButtonLongPressed();

    void removeBottomCardAnimation();

    C5368e<EditorialDownloadEvent> resumeDownload(EditorialViewModel editorialViewModel);

    C5368e<Void> retryClicked();

    void setMediaListDescriptionsVisible(EditorialEvent editorialEvent);

    void setUserReaction(String str);

    C5368e<Boolean> showDowngradeMessage();

    void showDowngradingMessage();

    void showDownloadError(EditorialDownloadModel editorialDownloadModel);

    void showDownloadModel(EditorialDownloadModel editorialDownloadModel);

    void showError(EditorialViewModel.Error error);

    void showGenericErrorToast();

    void showLoading();

    void showLoginDialog();

    void showNetworkErrorToast();

    void showReactionsPopup(String str, String str2);

    C5368e<Boolean> showRootInstallWarningPopup();

    void showTopReactions(String str, List<TopReaction> list, int i);

    C5368e<Void> snackLoginClick();

    C5368e<SocialMediaView.SocialMediaType> socialMediaClick();
}
