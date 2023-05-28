package p015cm.aptoide.p016pt.app.view;

import p015cm.aptoide.aptoideviews.socialmedia.SocialMediaView;
import p015cm.aptoide.p016pt.editorial.ScrollEvent;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.app.view.AppCoinsInfoView */
public interface AppCoinsInfoView extends View {
    void addBottomCardAnimation();

    C5368e<Void> appCoinsWalletLinkClick();

    C5368e<ScrollEvent> appItemVisibilityChanged();

    C5368e<Void> cardViewClick();

    C5368e<Void> catappultButtonClick();

    C5368e<Void> eSkillsClick();

    void focusOnESkillsSection();

    C5368e<Void> installButtonClick();

    void openApp(String str);

    void removeBottomCardAnimation();

    void setBonusAppc(int i);

    void setButtonText(boolean z);

    void setNoBonusAppcView();

    C5368e<SocialMediaView.SocialMediaType> socialMediaClick();
}
