package p015cm.aptoide.p016pt.promotions;

import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.promotions.PromotionsView */
public interface PromotionsView extends View {
    C5368e<PromotionAppClick> appCardClick();

    C5368e<PromotionViewApp> cancelDownload();

    C5368e<PromotionViewApp> claimAppClick();

    C5368e<PromotionViewApp> installButtonClick();

    void lockPromotionApps(boolean z);

    C5368e<PromotionViewApp> pauseDownload();

    C5368e<Void> promotionOverDialogClick();

    C5368e<PromotionViewApp> resumeDownload();

    C5368e<Void> retryClicked();

    void setPromotionMessage(String str);

    void showDownloadError(PromotionViewApp promotionViewApp);

    void showErrorView();

    void showLoading();

    void showPromotionApp(PromotionViewApp promotionViewApp, boolean z);

    void showPromotionFeatureGraphic(String str);

    void showPromotionOverDialog();

    void showPromotionTitle(String str);

    C5368e<Boolean> showRootInstallWarningPopup();

    void updateClaimStatus(String str);
}
