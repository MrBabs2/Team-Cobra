package p015cm.aptoide.p016pt.editorialList;

import java.util.List;
import p015cm.aptoide.p016pt.bonus.BonusAppcModel;
import p015cm.aptoide.p016pt.home.bundles.editorial.EditorialHomeEvent;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.reactions.ReactionsHomeEvent;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.editorialList.EditorialListView */
public interface EditorialListView extends View {
    C5368e<EditorialHomeEvent> editorialCardClicked();

    void hideLoadMore();

    void hideLoading();

    void hideRefresh();

    C5368e<Void> imageClick();

    C5368e<EditorialHomeEvent> onPopupDismiss();

    void populateView(List<CurationCard> list, BonusAppcModel bonusAppcModel);

    C5368e<Object> reachesBottom();

    C5368e<EditorialHomeEvent> reactionButtonLongPress();

    C5368e<ReactionsHomeEvent> reactionClicked();

    C5368e<EditorialHomeEvent> reactionsButtonClicked();

    C5368e<Void> refreshes();

    C5368e<Void> retryClicked();

    void setDefaultUserImage();

    void setScrollEnabled(Boolean bool);

    void setUserImage(String str);

    void showAvatar();

    void showGenericError();

    void showGenericErrorToast();

    void showLoadMore();

    void showLoading();

    void showLogInDialog();

    void showNetworkError();

    void showNetworkErrorToast();

    void showReactionsPopup(String str, String str2, int i);

    C5368e<Void> snackLogInClick();

    void update(List<CurationCard> list);

    void updateEditorialCard(CurationCard curationCard);

    C5368e<EditorialListEvent> visibleCards();
}
