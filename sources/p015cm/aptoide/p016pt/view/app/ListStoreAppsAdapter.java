package p015cm.aptoide.p016pt.view.app;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p015cm.aptoide.p016pt.C1086R;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.view.app.ListStoreAppsAdapter */
class ListStoreAppsAdapter extends RecyclerView.C0633g<ListStoreAppViewHolder> {
    private final C12871b<Application> appClicks;
    private List<Application> list;

    public ListStoreAppsAdapter(List<Application> list2, C12871b<Application> bVar) {
        this.list = list2;
        this.appClicks = bVar;
    }

    public void addApps(List<Application> list2) {
        int loadingPosition = getLoadingPosition();
        if (loadingPosition >= 0) {
            this.list.addAll(loadingPosition, list2);
        } else {
            loadingPosition = this.list.size();
            this.list.addAll(list2);
        }
        notifyItemRangeInserted(loadingPosition, list2.size());
    }

    public Application getItem(int i) {
        return this.list.get(i);
    }

    public int getItemCount() {
        return this.list.size();
    }

    public int getItemViewType(int i) {
        return this.list.get(i) instanceof AppLoading ? C1086R.layout.search_ad_loading_list_item : C1086R.layout.displayable_grid_app;
    }

    public int getLoadingPosition() {
        for (int size = this.list.size() - 1; size >= 0; size--) {
            if (this.list.get(size) instanceof AppLoading) {
                return size;
            }
        }
        return -1;
    }

    public void hideLoading() {
        int loadingPosition = getLoadingPosition();
        if (loadingPosition >= 0) {
            this.list.remove(loadingPosition);
            notifyItemRemoved(loadingPosition);
        }
    }

    public void setApps(List<Application> list2) {
        this.list = list2;
        notifyDataSetChanged();
    }

    public void showLoading() {
        if (getLoadingPosition() < 0) {
            this.list.add(new AppLoading());
            notifyItemInserted(this.list.size() - 1);
        }
    }

    public void onBindViewHolder(ListStoreAppViewHolder listStoreAppViewHolder, int i) {
        listStoreAppViewHolder.setApp(this.list.get(i));
    }

    public ListStoreAppViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == C1086R.layout.search_ad_loading_list_item) {
            return new AppLoadingViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.search_ad_loading_list_item, viewGroup, false));
        }
        return new ApplicationViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.displayable_grid_app, viewGroup, false), this.appClicks);
    }
}
