package p015cm.aptoide.p016pt.editorialList;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.bonus.BonusAppcModel;
import p015cm.aptoide.p016pt.editorial.CaptionBackgroundPainter;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.home.bundles.editorial.EditorialBundleViewHolder;
import p015cm.aptoide.p016pt.home.bundles.editorial.EditorialViewHolder;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.editorialList.EditorialListAdapter */
class EditorialListAdapter extends RecyclerView.C0633g<EditorialViewHolder> {
    private static final int EDITORIAL_CARD = 2131493007;
    private static final int LOADING = 2131493150;
    private BonusAppcModel bonusAppcModel;
    private final CaptionBackgroundPainter captionBackgroundPainter;
    private List<CurationCard> editorialListItems;
    private final ProgressCard progressBundle;
    private final ThemeManager themeAttributeProvider;
    private final C12871b<HomeEvent> uiEventsListener;

    public EditorialListAdapter(List<CurationCard> list, ProgressCard progressCard, C12871b<HomeEvent> bVar, CaptionBackgroundPainter captionBackgroundPainter2, ThemeManager themeManager) {
        this.editorialListItems = list;
        this.progressBundle = progressCard;
        this.uiEventsListener = bVar;
        this.captionBackgroundPainter = captionBackgroundPainter2;
        this.themeAttributeProvider = themeManager;
    }

    public void add(List<CurationCard> list, BonusAppcModel bonusAppcModel2) {
        int size = this.editorialListItems.size();
        this.editorialListItems.addAll(list);
        this.bonusAppcModel = bonusAppcModel2;
        notifyItemRangeInserted(size, list.size());
    }

    public void addLoadMore() {
        if (getLoadingPosition() < 0) {
            this.editorialListItems.add(this.progressBundle);
            notifyItemInserted(this.editorialListItems.size() - 1);
        }
    }

    public CurationCard getCard(int i) {
        return this.editorialListItems.get(i);
    }

    public int getItemCount() {
        return this.editorialListItems.size();
    }

    public int getItemViewType(int i) {
        return this.editorialListItems.get(i) instanceof ProgressCard ? C1086R.layout.progress_item : C1086R.layout.editorial_action_item;
    }

    public synchronized int getLoadingPosition() {
        for (int size = this.editorialListItems.size() - 1; size >= 0; size--) {
            if (this.editorialListItems.get(size) instanceof ProgressCard) {
                return size;
            }
        }
        return -1;
    }

    public void removeLoadMore() {
        int loadingPosition = getLoadingPosition();
        if (loadingPosition >= 0) {
            this.editorialListItems.remove(loadingPosition);
            notifyItemRemoved(loadingPosition);
        }
    }

    public void update(List<CurationCard> list) {
        this.editorialListItems = list;
        notifyDataSetChanged();
    }

    public void updateEditorialCard(CurationCard curationCard) {
        for (int i = 0; i < this.editorialListItems.size(); i++) {
            if (curationCard != null && this.editorialListItems.get(i).getId().equals(curationCard.getId())) {
                this.editorialListItems.set(i, curationCard);
                notifyItemChanged(i);
            }
        }
    }

    public void onBindViewHolder(EditorialViewHolder editorialViewHolder, int i) {
        if (editorialViewHolder instanceof EditorialBundleViewHolder) {
            ((EditorialBundleViewHolder) editorialViewHolder).setEditorialCard(this.editorialListItems.get(i), i, this.bonusAppcModel);
        }
    }

    public EditorialViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == C1086R.layout.editorial_action_item) {
            return new EditorialBundleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.editorial_action_item, viewGroup, false), this.uiEventsListener, this.captionBackgroundPainter, this.themeAttributeProvider);
        }
        return new LoadingViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.progress_item, viewGroup, false), this.uiEventsListener, this.captionBackgroundPainter);
    }
}
