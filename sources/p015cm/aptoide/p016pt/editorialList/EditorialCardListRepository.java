package p015cm.aptoide.p016pt.editorialList;

import java.util.ArrayList;
import java.util.List;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.editorialList.EditorialCardListRepository */
public class EditorialCardListRepository {
    private EditorialCardListModel cachedEditorialCardListModel;
    private final EditorialCardListService editorialCardListService;

    public EditorialCardListRepository(EditorialCardListService editorialCardListService2) {
        this.editorialCardListService = editorialCardListService2;
    }

    private EditorialCardListModel cloneList(EditorialCardListModel editorialCardListModel) {
        return (editorialCardListModel.hasError() || editorialCardListModel.isLoading()) ? editorialCardListModel : new EditorialCardListModel(new ArrayList(editorialCardListModel.getCurationCards()), editorialCardListModel.getOffset(), editorialCardListModel.getTotal());
    }

    private Single<EditorialCardListModel> loadNewEditorialCardListModel(int i, boolean z, boolean z2) {
        return this.editorialCardListService.loadEditorialCardListModel(i, z2).mo18569d(new C2605c(this, z));
    }

    private void updateCache(EditorialCardListModel editorialCardListModel, boolean z) {
        if (!z) {
            this.cachedEditorialCardListModel = editorialCardListModel;
            return;
        }
        List<CurationCard> curationCards = this.cachedEditorialCardListModel.getCurationCards();
        curationCards.addAll(editorialCardListModel.getCurationCards());
        this.cachedEditorialCardListModel = new EditorialCardListModel(curationCards, editorialCardListModel.getOffset(), editorialCardListModel.getTotal());
    }

    /* renamed from: a */
    public /* synthetic */ EditorialCardListModel mo11350a(boolean z, EditorialCardListModel editorialCardListModel) {
        if (!editorialCardListModel.hasError() && !editorialCardListModel.isLoading()) {
            updateCache(editorialCardListModel, z);
        }
        return cloneList(editorialCardListModel);
    }

    public boolean hasMore() {
        EditorialCardListModel editorialCardListModel = this.cachedEditorialCardListModel;
        if (editorialCardListModel == null || editorialCardListModel.getOffset() >= this.cachedEditorialCardListModel.getTotal()) {
            return false;
        }
        return true;
    }

    public Single<EditorialCardListModel> loadEditorialCardListModel(boolean z) {
        EditorialCardListModel editorialCardListModel = this.cachedEditorialCardListModel;
        if (editorialCardListModel == null || z) {
            return loadNewEditorialCardListModel(0, false, z);
        }
        return Single.m10119a(cloneList(editorialCardListModel));
    }

    public Single<EditorialCardListModel> loadMoreCurationCards() {
        EditorialCardListModel editorialCardListModel = this.cachedEditorialCardListModel;
        return loadNewEditorialCardListModel(editorialCardListModel != null ? editorialCardListModel.getOffset() : 0, true, false);
    }

    public void updateCache(EditorialCardListModel editorialCardListModel, List<CurationCard> list) {
        this.cachedEditorialCardListModel = new EditorialCardListModel(list, editorialCardListModel.getOffset(), editorialCardListModel.getTotal());
    }
}
