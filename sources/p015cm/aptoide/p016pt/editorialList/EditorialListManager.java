package p015cm.aptoide.p016pt.editorialList;

import java.util.Iterator;
import java.util.List;
import p015cm.aptoide.p016pt.AppCoinsManager;
import p015cm.aptoide.p016pt.bonus.BonusAppcModel;
import p015cm.aptoide.p016pt.reactions.ReactionsManager;
import p015cm.aptoide.p016pt.reactions.network.LoadReactionModel;
import p015cm.aptoide.p016pt.reactions.network.ReactionsResponse;
import p123rx.Single;
import p322p.p323a.p324a.p325a.C10832d;

/* renamed from: cm.aptoide.pt.editorialList.EditorialListManager */
public class EditorialListManager {
    private final AppCoinsManager appCoinsManager;
    private final EditorialCardListRepository editorialCardListRepository;
    private final ReactionsManager reactionsManager;

    public EditorialListManager(EditorialCardListRepository editorialCardListRepository2, ReactionsManager reactionsManager2, AppCoinsManager appCoinsManager2) {
        this.editorialCardListRepository = editorialCardListRepository2;
        this.reactionsManager = reactionsManager2;
        this.appCoinsManager = appCoinsManager2;
    }

    /* access modifiers changed from: private */
    /* renamed from: getUpdatedCards */
    public Single<CurationCard> mo11411a(EditorialCardListModel editorialCardListModel, LoadReactionModel loadReactionModel, String str) {
        CurationCard curationCard;
        List<CurationCard> curationCards = editorialCardListModel.getCurationCards();
        Iterator<CurationCard> it = curationCards.iterator();
        while (true) {
            if (!it.hasNext()) {
                curationCard = null;
                break;
            }
            curationCard = it.next();
            if (curationCard.getId().equals(str)) {
                curationCard.setReactions(loadReactionModel.getTopReactionList());
                curationCard.setNumberOfReactions(loadReactionModel.getTotal());
                curationCard.setUserReaction(loadReactionModel.getMyReaction());
                break;
            }
        }
        this.editorialCardListRepository.updateCache(editorialCardListModel, curationCards);
        return Single.m10119a(curationCard);
    }

    private Single<EditorialCardListModel> loadEditorialCardListModel(boolean z, boolean z2) {
        if (z) {
            return this.editorialCardListRepository.loadMoreCurationCards();
        }
        return this.editorialCardListRepository.loadEditorialCardListModel(z2);
    }

    /* renamed from: a */
    public /* synthetic */ Single mo11410a(EditorialCardListModel editorialCardListModel) {
        return C10832d.m36727a(this.appCoinsManager.getBonusAppc()).mo18569d(new C2684x(editorialCardListModel));
    }

    public Single<ReactionsResponse> deleteReaction(String str, String str2) {
        return this.reactionsManager.deleteReaction(str, str2);
    }

    public boolean hasMore() {
        return this.editorialCardListRepository.hasMore();
    }

    public Single<Boolean> isFirstReaction(String str, String str2) {
        return this.reactionsManager.isFirstReaction(str, str2);
    }

    /* access modifiers changed from: package-private */
    public Single<EditorialListModel> loadEditorialListModel(boolean z, boolean z2) {
        return loadEditorialCardListModel(z, z2).mo18559a(new C2681w(this));
    }

    public Single<CurationCard> loadReactionModel(String str, String str2) {
        return this.reactionsManager.loadReactionModel(str, str2).mo18559a(new C2678v(this, str));
    }

    public Single<ReactionsResponse> setReaction(String str, String str2, String str3) {
        return this.reactionsManager.setReaction(str, str2, str3);
    }

    /* renamed from: a */
    static /* synthetic */ EditorialListModel m5699a(EditorialCardListModel editorialCardListModel, BonusAppcModel bonusAppcModel) {
        return new EditorialListModel(editorialCardListModel, bonusAppcModel);
    }

    /* renamed from: a */
    public /* synthetic */ Single mo11412a(String str, LoadReactionModel loadReactionModel) {
        return this.editorialCardListRepository.loadEditorialCardListModel(false).mo18559a(new C2675u(this, loadReactionModel, str));
    }
}
