package p015cm.aptoide.p016pt.home;

import p015cm.aptoide.p016pt.home.HomeContainerFragment;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.home.HomeContainerView */
public interface HomeContainerView extends View {
    C5368e<Boolean> appsChipClicked();

    void dismissEskillsDialog();

    void dismissPromotionsDialog();

    C5368e<String> eskillsHomeDialogClicked();

    void expandChips();

    C5368e<Boolean> gamesChipClicked();

    C5368e<String> gdprDialogClicked();

    void hidePromotionsIcon();

    C5368e<HomeContainerFragment.ChipsEvents> isChipChecked();

    C5368e<String> promotionsHomeDialogClicked();

    void setDefaultUserImage();

    void setUserImage(String str);

    void showAvatar();

    void showEskillsHomeDialog();

    void showPromotionsHomeDialog(HomePromotionsWrapper homePromotionsWrapper);

    void showPromotionsHomeIcon(HomePromotionsWrapper homePromotionsWrapper);

    void showTermsAndConditionsDialog();

    C5368e<Void> toolbarPromotionsClick();

    C5368e<Void> toolbarUserClick();

    void uncheckChips();
}
